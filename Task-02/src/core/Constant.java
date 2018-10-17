package core;

public class Constant {
    public final static String OS_NAME = System.getProperty("os.name");

    public final static boolean IS_WINDOWS = OS_NAME.toLowerCase().contains("windows");

    public final static boolean IS_MAC = OS_NAME.toLowerCase().contains("mac");

    public final static String TOTAL_MEMORY_CMD = GetTotalMemoryCmd();

    public final static String TOTAL_FREE_MEMORY_CMD = GetTotalFreeMemoryCmd();

    private static String GetTotalFreeMemoryCmd() {
        return IS_WINDOWS? "wmic OS get FreePhysicalMemory" : "top -l 1 | grep PhysMem: | awk '{print $6}'";
    }

    private static String GetTotalMemoryCmd() {
        return IS_WINDOWS? "wmic ComputerSystem get TotalPhysicalMemory" : "sysctl -a | grep '^hw.memsize' | awk '{print $2}'";
    }
}
