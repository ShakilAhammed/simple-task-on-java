package task_implementation;

import task_interface.IResourceContext;

import java.math.BigInteger;
import java.util.ArrayList;

public class LinuxResourceContext implements IResourceContext {
    @Override
    public BigInteger FreePhysicalMemory() {
        return null;
    }

    @Override
    public BigInteger TotalPhysicalMemory() {
        return null;
    }

    @Override
    public ArrayList<String> GetSystemInformation() {
        return null;
    }
}
