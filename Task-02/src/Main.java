public class Main {

    public static void main(String[] args) {
        ResourceContext rc = new ResourceContext();
        System.out.println("Total Memory : " + rc.TotalMemory());
        System.out.println("Total Free Memory : " + rc.FreeMemory());
    }
}
