package core;

public class Constant {
    public final static String OS_NAME = System.getProperty("os.name");

    public final static boolean IS_WINDOWS = OS_NAME.toLowerCase().contains("windows");

    public final static boolean IS_MAC = OS_NAME.toLowerCase().contains("mac");

    private static String TOTAL_PHYSICAL_MEMORY_CMD;

    private static String TOTAL_FREE_PHYSICAL_MEMORY_CMD;

    private static String SYSTEM_INFORMATION_CMD;

    public static void SetUpConstant() {
        if(IS_WINDOWS) {
            TOTAL_PHYSICAL_MEMORY_CMD = "wmic ComputerSystem get TotalPhysicalMemory";
            TOTAL_FREE_PHYSICAL_MEMORY_CMD = "wmic OS get FreePhysicalMemory";
            SYSTEM_INFORMATION_CMD = "systeminfo";
        }
        else if(IS_MAC) {
            TOTAL_PHYSICAL_MEMORY_CMD = "sysctl -a | grep '^hw.memsize' | awk '{print $2}'";
            TOTAL_FREE_PHYSICAL_MEMORY_CMD = "top -l 1 | grep PhysMem: | awk '{print $6}'";
            SYSTEM_INFORMATION_CMD = "system_profiler SPHardwareDataType";
        }
        else{
            TOTAL_PHYSICAL_MEMORY_CMD = "cat /proc/meminfo | grep MemTotal: | awk '{print $2}'";
            TOTAL_FREE_PHYSICAL_MEMORY_CMD = "cat /proc/meminfo | grep MemFree: | awk '{print $2}'";
            SYSTEM_INFORMATION_CMD = "lscpu";
        }
    }

    public static String getTotalPhysicalMemoryCmd() {
        return TOTAL_PHYSICAL_MEMORY_CMD;
    }

    public static String getTotalFreePhysicalMemoryCmd() {
        return TOTAL_FREE_PHYSICAL_MEMORY_CMD;
    }

    public static String getSystemInformationCmd() {
        return SYSTEM_INFORMATION_CMD;
    }
}
