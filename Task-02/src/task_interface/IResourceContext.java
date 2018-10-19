package task_interface;

import java.math.BigInteger;
import java.util.ArrayList;

public interface IResourceContext {
    BigInteger FreePhysicalMemory();
    BigInteger TotalPhysicalMemory();
    ArrayList<String>GetSystemInformation();
}
