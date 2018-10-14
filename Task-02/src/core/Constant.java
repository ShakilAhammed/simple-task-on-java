package core;

public class Constant {
    public final static String OS_NAME = System.getProperty("os.name");

    public final static boolean IS_WINDOWS = OS_NAME.toLowerCase().contains("windows");

    public final static boolean IS_MAC = OS_NAME.toLowerCase().contains("mac");


    public Constant() {
        GetSetReady();
    }

    private void GetSetReady() {

    }

}
