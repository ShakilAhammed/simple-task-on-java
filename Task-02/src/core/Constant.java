package core;

public class Constant {
    public final static String OS_NAME = System.getProperty("os.name");

    public final static boolean IS_WINDOWS = OS_NAME.toLowerCase().contains("windows");

    public final static boolean IS_MAC = OS_NAME.toLowerCase().contains("mac");

    private static String TotalPhysicalMemoryCmd;

    private static String TotalFreePhysicalMemoryCmd;

    private static String SystemInformationCmd;

    private static String FreeCpuCmd;

    private static String CpuUsedByUserCmd;

    private static String CpuUsedBySystemCmd;

    public static void SetUpConstant() {
        if(IS_WINDOWS) {
            TotalPhysicalMemoryCmd = "wmic ComputerSystem get TotalPhysicalMemory";
            TotalFreePhysicalMemoryCmd = "wmic OS get FreePhysicalMemory";
            SystemInformationCmd = "systeminfo";

        }
        else if(IS_MAC) {
            TotalPhysicalMemoryCmd = "sysctl -a | grep '^hw.memsize' | awk '{print $2}'";
            TotalFreePhysicalMemoryCmd = "memory_pressure | grep 'Pages free' | awk '{print $3}'";
            SystemInformationCmd = "system_profiler SPHardwareDataType";
            FreeCpuCmd = "top -l 1 | grep 'CPU usage': | awk '{print $7}'";
            CpuUsedByUserCmd = "top -n 1 | grep Cpu | awk '{print $2}'";
            CpuUsedBySystemCmd = "top -n 1 | grep Cpu | awk '{print $4}'";
        }
        else{
            TotalPhysicalMemoryCmd = "cat /proc/meminfo | grep MemTotal: | awk '{print $2}'";
            TotalFreePhysicalMemoryCmd = "cat /proc/meminfo | grep MemFree: | awk '{print $2}'";
            SystemInformationCmd = "lscpu";
            FreeCpuCmd = "top -n 1 | grep Cpu | awk '{print $8}'";
            CpuUsedByUserCmd = "top -l 1 | grep 'CPU usage': | awk '{print $3}'";
            CpuUsedBySystemCmd = "top -l 1 | grep 'CPU usage': | awk '{print $5}'";
        }
    }

    public static String getTotalPhysicalMemoryCmd() {
        return TotalPhysicalMemoryCmd;
    }

    public static String getTotalFreePhysicalMemoryCmd() {
        return TotalFreePhysicalMemoryCmd;
    }

    public static String getSystemInformationCmd() {
        return SystemInformationCmd;
    }

    public static String getFreeCpuCmd() {
        return FreeCpuCmd;
    }

    public static String getCpuUsedByUserCmd() {
        return CpuUsedByUserCmd;
    }

    public static String getCpuUsedBySystemCmd() {
        return CpuUsedBySystemCmd;
    }
}
