public class Main {

    public static void main(String[] args) {
        ResourceContext rc = new ResourceContext();
        System.out.println("Total Memory : " + rc.TotalPhysicalMemory());
        System.out.println("Total Free Memory : " + rc.FreePhysicalMemory());
        System.out.println("System Information : " + rc.GetSystemInformation());
        System.out.println("Total Free CPU : " + rc.TotalFreeCpu());
        System.out.println("CPU used by User : " + rc.CpuUsedByUser());
        System.out.println("CPU used by System : " + rc.CpuUsedBySystem());
    }
}
