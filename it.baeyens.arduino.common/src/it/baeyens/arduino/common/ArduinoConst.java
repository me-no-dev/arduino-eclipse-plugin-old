package it.baeyens.arduino.common;

/**
 * ArduinoConst only contains global strings used in the eclipse plugin.
 * 
 * @author Jan Baeyens
 * 
 */
public class ArduinoConst {
    // java stuff
    public static final String EMPTY_STRING = "";// so I do not //$NON-NLS-1$
						 // have to add all the time
    public static final String DOT = ".";// so I do not have to //$NON-NLS-1$
					 // add all the time
    public static final char SLACH = '/';// so I do not have to add $NON-NLS-1$
					 // all the time
    public static final String COLON = ":";// so I do not have to //$NON-NLS-1$
					   // add all the time
    public static final String SPACE = " "; // so I do not have to //$NON-NLS-1$
					    // add all the time
    public static final char UNDERSCORE = '_';// so I do not have to add
					      // $NON-NLS-1$ all the time
    public static final char BACK_SLACH = '\\';// so I do not have to add
					       // $NON-NLS-1$ all the time
    public static final String FALSE = "false";// so I do not have //$NON-NLS-1$
					       // to add all the time
    public static final String TRUE = "true";// so I do not have //$NON-NLS-1$
					     // to add all the time
    public static final String NEWLINE = "\n";// so I do not have //$NON-NLS-1$
					      // to add all the time

    // General stuff
    public static final String PluginStart = "it.baeyens."; //$NON-NLS-1$
    public static final String CORE_PLUGIN_ID = PluginStart + "arduino.core"; //$NON-NLS-1$

    // prefix to be added to the arduino environment
    protected static final String UploadPortPrefix_WIN = "-P\\\\.\\"; //$NON-NLS-1$
    protected static final String UploadPortPrefix_LINUX = "-P"; //$NON-NLS-1$
    protected static final String UploadPortPrefix_MAC = "-P"; //$NON-NLS-1$

    // natures
    public static final String Cnatureid = "org.eclipse.cdt.core.cnature"; //$NON-NLS-1$
    public static final String CCnatureid = "org.eclipse.cdt.core.ccnature"; //$NON-NLS-1$
    public static final String Buildnatureid = "org.eclipse.cdt.managedbuilder.core.managedBuildNature";//$NON-NLS-1$
    public static final String Scannernatureid = "org.eclipse.cdt.managedbuilder.core.ScannerConfigNature";//$NON-NLS-1$
    public static final String ArduinoNatureID = PluginStart + "arduinonature";//$NON-NLS-1$

    // preference nodes
    public static final String NODE_ARDUINO = PluginStart + "arduino";//$NON-NLS-1$

    // preference keys
    public static final String KEY_PRIVATE_LIBRARY_PATHS = "Private Library Path";//$NON-NLS-1$
    public static final String KEY_PRIVATE_HARDWARE_PATHS = "Private hardware Path";//$NON-NLS-1$
    public static final String KEY_ARDUINO_MANAGER_DOWNLOAD_LOCATION = "arduino Manager downloadlocation"; //$NON-NLS-1$
    public static final String KEY_ARDUINO_MANAGER_BOARD_URLS = "Arduino Manager board Urls"; //$NON-NLS-1$
    public static final String DEFAULT_ARDUINO_MANAGER_BOARD_URLS = "http://downloads.arduino.cc/packages/package_index.json" //$NON-NLS-1$
	    + "\nhttp://arduino.esp8266.com/stable/package_esp8266com_index.json"; //$NON-NLS-1$

    // properties keys
    public static final String KEY_LAST_USED_BOARD = "Board";//$NON-NLS-1$
    public static final String KEY_LAST_USED_COM_PORT = "upload Port";//$NON-NLS-1$
    public static final String KEY_LAST_USED_BOARDS_FILE = "boards file";//$NON-NLS-1$
    public static final String KEY_LAST_USED_BOARD_MENU_OPTIONS = "Board Custom Option Selections";//$NON-NLS-1$
    public static final String KEY_LAST_USED_SCOPE_FILTER_MENU_OPTION = "Board scope filter on off";//$NON-NLS-1$
    public static final String KEY_LAST_USED_EXAMPLES = "Last used Examples";//$NON-NLS-1$

    // Serial monitor keys
    public static final String KEY_SERIAlRATE = "Serial monitor last selected rate";//$NON-NLS-1$
    public static final String KEY_SERIAlPORT = "Serial monitor last selected Port";//$NON-NLS-1$
    public static final String KEY_RXTX_LAST_USED_LINE_INDES = "Serial Monitor Last Used Line Ending index";//$NON-NLS-1$
    public static final String KEY_RXTX_LAST_USED_AUTOSCROLL = "Serial Monitor Last Used auto scroll setting";//$NON-NLS-1$
    // Folder Information
    public static final String LIBRARY_PATH_SUFFIX = "libraries";//$NON-NLS-1$
    public static final String DOWNLOADS_FOLDER = "downloads";//$NON-NLS-1$
    public static final String ARDUINO_HARDWARE_FOLDER_NAME = "hardware";//$NON-NLS-1$
    public static final String ARDUINO_CODE_FOLDER_NAME = "arduino";//$NON-NLS-1$
    public static final String ARDUINO_CORE_FOLDER_NAME = "cores";//$NON-NLS-1$
    public static final String DEFAULT = "Default";//$NON-NLS-1$
    public static final String BOARDS_FILE_NAME = "boards.txt";//$NON-NLS-1$
    public static final String PLATFORM_FILE_NAME = "platform.txt";//$NON-NLS-1$
    public static final String ARDUINO_VARIANTS_FOLDER_NAME = "variants";//$NON-NLS-1$
    public static final String PACKAGES_FOLDER_NAME = "packages";//$NON-NLS-1$
    public static final String PLATFORM_PLUGIN_FILE_NAME = "eclipse_plugin.txt"; //$NON-NLS-1$

    // tags to interpret the arduino input files
    public static final String BoardNameKeyTAG = "name";//$NON-NLS-1$
    public static final String UploadToolTeensy = "teensy_reboot";//$NON-NLS-1$
    public static final String Upload_ssh = "ssh upload";//$NON-NLS-1$

    public static final String KEY_BUILD_BEFORE_UPLOAD_OPTION = "Build before upload option";//$NON-NLS-1$

    public static final String ENV_KEY_BOARD_START = "A.";//$NON-NLS-1$
    public static final String ENV_KEY_BOARD_UPLOAD_PROTOCOL = ENV_KEY_BOARD_START + "UPLOAD.PROTOCOL";//$NON-NLS-1$
    public static final String WORKSPACE_LIB_FOLDER = LIBRARY_PATH_SUFFIX + "/";//$NON-NLS-1$
    public static final String ARDUINO_IDE_VERSION = "ArduinoIDEVersion";//$NON-NLS-1$
    public static final String ENV_KEY_NAME = ENV_KEY_BOARD_START + "NAME";//$NON-NLS-1$
    public static final String ENV_KEY_VERSION = ENV_KEY_BOARD_START + "VERSION";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_c_o_pattern = ENV_KEY_BOARD_START + "RECIPE.C.O.PATTERN";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_cpp_o_pattern = ENV_KEY_BOARD_START + "RECIPE.CPP.O.PATTERN";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_S_o_pattern = ENV_KEY_BOARD_START + "RECIPE.S.O.PATTERN";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_objcopy_hex_pattern = ENV_KEY_BOARD_START + "RECIPE.OBJCOPY.HEX.PATTERN";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_objcopy_eep_pattern = ENV_KEY_BOARD_START + "RECIPE.OBJCOPY.EEP.PATTERN";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_size_pattern = ENV_KEY_BOARD_START + "RECIPE.SIZE.PATTERN";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_AR_pattern = ENV_KEY_BOARD_START + "RECIPE.AR.PATTERN";//$NON-NLS-1$
    public static final String ENV_KEY_recipe_c_combine_pattern = ENV_KEY_BOARD_START + "RECIPE.C.COMBINE.PATTERN"; //$NON-NLS-1$

    public static final String ENV_KEY_build_variant = ENV_KEY_BOARD_START + "BUILD.VARIANT";//$NON-NLS-1$
    public static final String ENV_KEY_compiler_path = ENV_KEY_BOARD_START + "COMPILER.PATH";//$NON-NLS-1$
    public static final String ENV_KEY_build_system_path = ENV_KEY_BOARD_START + "BUILD.SYSTEM.PATH";//$NON-NLS-1$
    public static final String ENV_KEY_build_generic_path = ENV_KEY_BOARD_START + "BUILD.GENERIC.PATH";//$NON-NLS-1$
    public static final String ENV_KEY_SOFTWARE = ENV_KEY_BOARD_START + "SOFTWARE";//$NON-NLS-1$
    public static final String ENV_KEY_ARCHITECTURE = ENV_KEY_BOARD_START + "ARCHITECTURE";//$NON-NLS-1$
    public static final String ENV_KEY_BUILD_ARCH = ENV_KEY_BOARD_START + "BUILD.ARCH";//$NON-NLS-1$
    public static final String ENV_KEY_HARDWARE_PATH = ENV_KEY_BOARD_START + "RUNTIME.HARDWARE.PATH";//$NON-NLS-1$
    public static final String ENV_KEY_PLATFORM_PATH = ENV_KEY_BOARD_START + "RUNTIME.PLATFORM.PATH";//$NON-NLS-1$

    public static final String ENV_KEY_build_path = ENV_KEY_BOARD_START + "BUILD.PATH";//$NON-NLS-1$
    public static final String ENV_KEY_build_project_name = ENV_KEY_BOARD_START + "BUILD.PROJECT_NAME";//$NON-NLS-1$
    public static final String ENV_KEY_build_variant_path = ENV_KEY_BOARD_START + "BUILD.VARIANT.PATH";//$NON-NLS-1$
    public static final String ENV_KEY_upload_use_1200bps_touch = ENV_KEY_BOARD_START + "UPLOAD.USE_1200BPS_TOUCH";//$NON-NLS-1$
    public static final String ENV_KEY_upload_disable_flushing = ENV_KEY_BOARD_START + "UPLOAD.DISABLE_FLUSHING";//$NON-NLS-1$
    public static final String ENV_KEY_wait_for_upload_port = ENV_KEY_BOARD_START + "UPLOAD.WAIT_FOR_UPLOAD_PORT";//$NON-NLS-1$
    public static final String ENV_KEY_upload_tool = ENV_KEY_BOARD_START + "UPLOAD.TOOL";//$NON-NLS-1$
    public static final String ENV_KEY_UPLOAD_PROTOCOL = ENV_KEY_BOARD_START + "UPLOAD.PROTOCOL";//$NON-NLS-1$
    public static final String ENV_KEY_build_core = ENV_KEY_BOARD_START + "BUILD.CORE";//$NON-NLS-1$
    public static final String ENV_KEY_build_core_path = ENV_KEY_BOARD_START + "BUILD.CORE.PATH";//$NON-NLS-1$
    public static final String ENV_KEY_use_archiver = ENV_KEY_BOARD_START + "BUILD.USE_ARCHIVER";//$NON-NLS-1$
    public static final String ENV_KEY_SERIAL_PORT = ENV_KEY_BOARD_START + "SERIAL.PORT";//$NON-NLS-1$
    public static final String ENV_KEY_SERIAL_PORT_FILE = ENV_KEY_BOARD_START + "SERIAL.PORT.FILE";//$NON-NLS-1$

    public static final String ENV_KEY_NETWORK_PORT = ENV_KEY_ARDUINO_START + "NETWORK.PORT";//$NON-NLS-1$
    public static final String ENV_KEY_NETWORK_PASSWORD = ENV_KEY_ARDUINO_START + "NETWORK.PASSWORD";//$NON-NLS-1$

    public static final String ENV_KEY_JANTJE_START = "JANTJE.";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_WARNING_LEVEL = ENV_KEY_JANTJE_START + "WARNING_LEVEL";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_SIZE_COMMAND = ENV_KEY_BOARD_START + "ALT_SIZE_COMMAND";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_SIZE_SWITCH = ENV_KEY_JANTJE_START + "SIZE.SWITCH";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_BOARDS_FILE = ENV_KEY_JANTJE_START + "BOARDS_FILE";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_PLATFORM_FILE = ENV_KEY_JANTJE_START + "PLATFORM_FILE";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_REFERENCED_PLATFORM_FILE = ENV_KEY_JANTJE_START + "REFERENCED_PLATFORM_FILE";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_COM_PORT = ENV_KEY_JANTJE_START + "COM_PORT";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_BOARD_NAME = ENV_KEY_JANTJE_START + "BOARD_NAME";//$NON-NLS-1$

    public static final String ENV_KEY_JANTJE_ADDITIONAL_COMPILE_OPTIONS = ENV_KEY_JANTJE_START + "EXTRA.COMPILE";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_ADDITIONAL_C_COMPILE_OPTIONS = ENV_KEY_JANTJE_START + "EXTRA.C.COMPILE";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_ADDITIONAL_CPP_COMPILE_OPTIONS = ENV_KEY_JANTJE_START + "EXTRA.CPP.COMPILE";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_PACKAGE_ID = ENV_KEY_JANTJE_START + "PACKAGE_ID";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_ARCITECTURE_ID = ENV_KEY_JANTJE_START + "ARCHITECTURE_ID";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_BOARD_ID = ENV_KEY_JANTJE_START + "BOARD_ID";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_BUILD_CORE = ENV_KEY_JANTJE_START + "BUILD_CORE";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_BUILD_VARIANT = ENV_KEY_JANTJE_START + "BUILD_VARIANT";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_PACKAGE_NAME = ENV_KEY_JANTJE_START + "PACKAGE.NAME";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_MAKE_LOCATION = ENV_KEY_JANTJE_START + "MAKE_LOCATION";//$NON-NLS-1$ place
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ where
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ make
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ is
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ located
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ only
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ used
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ in
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$
												     // $NON-NLS-1$ windows
    // public static final String ENV_KEY_JANTJE_PLATFORM_NAME =
    // ENV_KEY_JANTJE_START + "PLATFORM.NAME";//$NON-NLS-1$

    //
    // template Sketch information

    public static final String ENV_KEY_JANTJE_SKETCH_TEMPLATE_FOLDER = ENV_KEY_JANTJE_START + "TEMPLATE_FOLDER";//$NON-NLS-1$
    public static final String ENV_KEY_JANTJE_SKETCH_TEMPLATE_USE_DEFAULT = ENV_KEY_JANTJE_START + "TEMPLATE_USE_DEFAULT";//$NON-NLS-1$

    public static final String ENV_KEY_WARNING_LEVEL_OFF = " -w ";//$NON-NLS-1$
    public static final String ENV_KEY_WARNING_LEVEL_ON = " -Wall ";//$NON-NLS-1$

    public static final String ENV_KEY_GNU_SERIAL_PORTS = "gnu.io.rxtx.SerialPorts";//$NON-NLS-1$
    public static final String ENV_VALUE_GNU_SERIAL_PORTS_LINUX = "/dev/ttyACM0:/dev/ttyACM1:/dev/ttyACM2:/dev/ttyACM3:/dev/ttyUSB0::/dev/ttyUSB1::/dev/ttyUSB2::/dev/ttyUSB3::/dev/ttyUSB4";//$NON-NLS-1$
    // scope stuff
    public static final short SCOPE_START_DATA = (short) 0xCDAB;// This is the
								// flag that
								// indicates
								// scope data is
								// following
    // least significant first 0xCDAB;
    public static final String EXAMPLE_FOLDER_NAME = "examples";//$NON-NLS-1$

    public static final String PRE_PROCESSING_BOARDS_TXT = "pre_processing_boards.txt"; //$NON-NLS-1$
    public static final String POST_PROCESSING_BOARDS_TXT = "post_processing_boards.txt"; //$NON-NLS-1$
    public static final String PRE_PROCESSING_PLATFORM_TXT = "pre_processing_platform.txt"; //$NON-NLS-1$
    public static final String POST_PROCESSING_PLATFORM_TXT = "post_processing_platform.txt"; //$NON-NLS-1$

}
