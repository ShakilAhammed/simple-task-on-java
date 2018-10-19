package core;

public class Constant {
    public final static String OS_NAME = System.getProperty("os.name");

    public final static boolean IS_WINDOWS = OS_NAME.toLowerCase().contains("windows");

    public final static boolean IS_MAC = OS_NAME.toLowerCase().contains("mac");

    public final static String TOTAL_MEMORY_CMD = GetTotalPhysicalMemoryCmd();

    public final static String TOTAL_FREE_MEMORY_CMD = GetTotalFreePhysicalMemoryCmd();

    private static String GetTotalFreePhysicalMemoryCmd() {
        return IS_WINDOWS? "wmic OS get FreePhysicalMemory" : "top -l 1 | grep PhysMem: | awk '{print $6}'";
    }

    private static String GetTotalPhysicalMemoryCmd() {
        return IS_WINDOWS? "wmic ComputerSystem get TotalPhysicalMemory" : "sysctl -a | grep '^hw.memsize' | awk '{print $2}'";
    }
}
