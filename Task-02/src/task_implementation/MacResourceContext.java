package task_implementation;

import core.Constant;
import task_interface.IResourceContext;

import java.math.BigInteger;
import java.util.ArrayList;

public class MacResourceContext implements IResourceContext {
    private CommandExecutor ce = new CommandExecutor();
    private ArrayList<String> result;

    public MacResourceContext() {
        result = new ArrayList<>();
        Constant.SetUp();
    }
    @Override
    public BigInteger FreePhysicalMemory() {
        result = ce.RunCommand("/bin/sh", "-c", Constant.getTotalFreePhysicalMemoryCmd());
        return new BigInteger(result.get(2).trim());
    }

    @Override
    public BigInteger TotalPhysicalMemory() {
        result = ce.RunCommand("/bin/sh", "-c", Constant.getTotalPhysicalMemoryCmd());
        return new BigInteger(result.get(2).trim());
    }

    @Override
    public ArrayList<String> GetSystemInformation() {
        result = ce.RunCommand("/bin/sh", "-c", Constant.getSystemInformationCmd());
        return result;
    }
}
