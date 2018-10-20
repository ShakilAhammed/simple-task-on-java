package task_implementation;

import core.Constant;
import task_interface.IResourceContext;

import java.math.BigInteger;
import java.util.ArrayList;

public class WindowsResourceContext implements IResourceContext {

    private CommandExecutor ce = new CommandExecutor();
    private ArrayList<String> result;

    public WindowsResourceContext() {
        result = new ArrayList<>();
        Constant.SetUpConstant();
    }

    @Override
    public BigInteger FreePhysicalMemory() {
        result.clear();
        result = ce.RunCommand("cmd.exe","/c", Constant.getTotalFreePhysicalMemoryCmd());
        return new BigInteger(result.get(2).trim());
    }

    @Override
    public BigInteger TotalPhysicalMemory() {
        result.clear();
        result = ce.RunCommand("cmd.exe","/c", Constant.getTotalPhysicalMemoryCmd());
        return new BigInteger(result.get(2).trim());
    }

    @Override
    public ArrayList<String> GetSystemInformation() {
        result.clear();
        result = ce.RunCommand("cmd.exe","/c", Constant.getSystemInformationCmd());
        return result;
    }

    @Override
    public BigInteger TotalFreeCpu() {
        return null;
    }

    @Override
    public BigInteger CpuUsedByUser() {
        return null;
    }

    @Override
    public BigInteger CpuUsedBySystem() {
        return null;
    }

}
