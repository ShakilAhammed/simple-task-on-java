public class Main {

    public static void main(String[] args) {
        ResourceContext rc = new ResourceContext();
        System.out.println("Total Physical Memory : " + rc.TotalPhysicalMemory());
        System.out.println("Total Free Physical Memory : " + rc.FreePhysicalMemory());

    }
}
