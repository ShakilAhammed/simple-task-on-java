package task_interface;

import java.math.BigInteger;

public interface IResourceContext {
    BigInteger FreeMemory();
    BigInteger TotalMemory();
}
