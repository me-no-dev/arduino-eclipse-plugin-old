package it.baeyens.arduino.tools.uploaders;

import it.baeyens.arduino.common.ArduinoConst;
import it.baeyens.arduino.communication.ArduinoSerial;

import java.io.IOException;

import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.envvar.EnvironmentVariable;
import org.eclipse.cdt.core.envvar.IContributedEnvironment;
import org.eclipse.cdt.core.envvar.IEnvironmentVariable;
import org.eclipse.cdt.core.envvar.IEnvironmentVariableManager;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.ui.console.MessageConsole;

public class GenericNetworkUploader implements IRealUpload {
  private IProject myProject;
  private String mycConf;
  private String myUploadTool;
  private MessageConsole myConsole;
  private String myAdderss;
  private String myPort;
  private String myPassword;

  GenericNetworkUploader(IProject Project, String cConf, String UploadTool, MessageConsole Console, String address, String port, String password) {
    myProject = Project;
    mycConf = cConf;
    myUploadTool = UploadTool;
    myConsole = Console;
    myAdderss = address;
    myPort = port;
    myPassword = password;
  }

  @Override
  public boolean uploadUsingPreferences(IFile hexFile, IProject project, boolean usingProgrammer, IProgressMonitor monitor) {
    IEnvironmentVariableManager envManager = CCorePlugin.getDefault().getBuildEnvironmentManager();
    IContributedEnvironment contribEnv = envManager.getContributedEnvironment();
    ICProjectDescription prjDesc = CoreModel.getDefault().getProjectDescription(project);
    ICConfigurationDescription configurationDescription = prjDesc.getConfigurationByName(mycConf);

    IEnvironmentVariable var = new EnvironmentVariable(ArduinoConst.ENV_KEY_SERIAL_PORT, myAdderss);
    contribEnv.addVariable(var, configurationDescription);
    var = new EnvironmentVariable(ArduinoConst.ENV_KEY_NETWORK_PORT, myPort);
    contribEnv.addVariable(var, configurationDescription);
    var = new EnvironmentVariable(ArduinoConst.ENV_KEY_NETWORK_PASSWORD, myPassword);
    contribEnv.addVariable(var, configurationDescription);

    String command = "";
    try {
      command = envManager.getVariable("A.TOOLS." + myUploadTool.toUpperCase() + ".UPLOAD.NETWORK_PATTERN", configurationDescription, true).getValue();
    } catch (Exception e) {
      
    }
    
    if(command.contentEquals("")){
      try {
        command = envManager.getVariable("A.TOOLS." + myUploadTool.toUpperCase() + ".UPLOAD.PATTERN", configurationDescription, true).getValue();
      } catch (Exception e){
        
      }
    }

    try {
      GenericLocalUploader.RunConsoledCommand(myConsole, command, new SubProgressMonitor(monitor, 1));
    } catch (IOException e1) {
      e1.printStackTrace();
      return false;
    }
    return true;
  }

}
