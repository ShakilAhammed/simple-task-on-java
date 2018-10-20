package task_implementation;

import core.Constant;
import task_interface.IResourceContext;

import java.math.BigInteger;
import java.util.ArrayList;

public class LinuxResourceContext implements IResourceContext {
    private CommandExecutor ce = new CommandExecutor();
    private ArrayList<String> result;

    public LinuxResourceContext() {
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
        result = ce.RunCommand("/bin/sh", "-c", Constant.getSystemInformationCmd());
        return result;
    }

    @Override
    public BigInteger TotalFreeCpu() {
        result.clear();
        result = ce.RunCommand("/bin/sh", "-c", Constant.getFreeCpuCmd());
        return new BigInteger(result.get(0).trim());
    }

    @Override
    public BigInteger CpuUsedByUser() {
        result.clear();
        result = ce.RunCommand("/bin/sh", "-c", Constant.getCpuUsedByUserCmd());
        return new BigInteger(result.get(0).trim());
    }

    @Override
    public BigInteger CpuUsedBySystem() {
        result.clear();
        result = ce.RunCommand("/bin/sh", "-c", Constant.getCpuUsedBySystemCmd());
        return new BigInteger(result.get(0).trim());
    }
}
