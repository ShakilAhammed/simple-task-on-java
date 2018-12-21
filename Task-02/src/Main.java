import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) {
        ResourceContext rc = new ResourceContext();
        System.out.println("Total Memory : " + rc.TotalPhysicalMemory());
        System.out.println("Total Free Memory : " + rc.FreePhysicalMemory());
        //System.out.println("System Information : " + rc.GetSystemInformation());
        System.out.println("Total Free CPU : " + rc.TotalFreeCpu());
        System.out.println("CPU used by User : " + rc.CpuUsedByUser());
        System.out.println("CPU used by System : " + rc.CpuUsedBySystem());

//        OperatingSystemMXBean bean = (OperatingSystemMXBean) ManagementFactory
//                    .getOperatingSystemMXBean();
//        System.out.println(bean.getFreePhysicalMemorySize());
//        System.out.println(bean.getTotalPhysicalMemorySize());
//        System.out.println(bean.getSystemCpuLoad());

    }
}
