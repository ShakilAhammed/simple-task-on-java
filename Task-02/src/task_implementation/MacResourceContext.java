package task_implementation;

import task_interface.IResourceContext;

import java.math.BigInteger;

public class MacResourceContext implements IResourceContext {
    @Override
    public BigInteger FreePhysicalMemory() {
        return null;
    }

    @Override
    public BigInteger TotalPhysicalMemory() {
        return null;
    }
}
