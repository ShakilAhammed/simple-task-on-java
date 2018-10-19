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
        Constant.SetUpConstant();
    }
    @Override
    public BigInteger FreePhysicalMemory() {
        result.clear();
        result = ce.RunCommand("/bin/sh", "-c", Constant.getTotalFreePhysicalMemoryCmd());
        return new BigInteger(result.get(0).trim());
    }

    @Override
    public BigInteger TotalPhysicalMemory() {
        result.clear();
        result = ce.RunCommand("/bin/sh", "-c", Constant.getTotalPhysicalMemoryCmd());
        return new BigInteger(result.get(0).trim());
    }

    @Override
    public ArrayList<String> GetSystemInformation() {
        result.clear();
        result = ce.RunCommand("/bin/sh", "-c", Constant.getSystemInformationCmd());
        return result;
    }
}
