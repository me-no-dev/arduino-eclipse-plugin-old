package it.baeyens.arduino.ui;

import it.baeyens.arduino.common.ArduinoConst;
import it.baeyens.arduino.listeners.ConfigurationChangeListener;

import java.net.URL;

import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.CProjectDescriptionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import cc.arduino.packages.discoverers.NetworkDiscovery;

/**
 * generated code
 * 
 * @author Jan Baeyens
 * 
 */
public class activator implements BundleActivator {
    public static NetworkDiscovery bonjourDiscovery;
    
    @Override
    public void start(BundleContext context) throws Exception {
      bonjourDiscovery = new NetworkDiscovery();
      bonjourDiscovery.start();
      return;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext )
     */
    @Override
    public void stop(BundleContext context) throws Exception {
	// plugin = null;
	// super.stop(context);
    }
}
