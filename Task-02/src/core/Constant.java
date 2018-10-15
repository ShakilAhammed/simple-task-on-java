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



//    private void GetSetReady() {
//        if(Constant.IS_WINDOWS){
//
//            String TotalMemory = "wmic ComputerSystem get TotalPhysicalMemory";
//            String FreeMemory = "wmic OS get FreePhysicalMemory";
//
//            String PercentProcessorTime = " Powershell \"gwmi Win32_PerfFormattedData_PerfOS_Processor | Select -First 1 | %{'{0}%' -f $_.PercentProcessorTime}\"";
//        }
//        else if(Constant.IS_MAC){
//            String nameOS= System.getProperty("os.name");
//            System.out.println("Operating system: "+ nameOS);
//
//            String TotalMemory = "sysctl -a | grep '^hw.memsize' | awk '{print $2}'";
//            String UsedMemory = "top -l 1 | grep PhysMem: | awk '{print $2}'";
//            String FreeMemory = "top -l 1 | grep PhysMem: | awk '{print $6}'";
//
//
//            String FreeCPU = "top -l 1 | grep 'CPU usage': | awk '{print $7}'";
//            String CPU_UsedBySystem = "top -l 1 | grep 'CPU usage': | awk '{print $5}'";
//            String CPU_UsedByUser = "top -l 1 | grep 'CPU usage': | awk '{print $3}'";
//
//        } else {
//
//
//        }
//    }

}
