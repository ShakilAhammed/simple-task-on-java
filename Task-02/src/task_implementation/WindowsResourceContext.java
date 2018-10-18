package task_implementation;

import core.Constant;
import task_interface.IResourceContext;

import java.math.BigInteger;
import java.util.ArrayList;

public class WindowsResourceContext implements IResourceContext {

    private WindowsCommandExecutor wce = new WindowsCommandExecutor();
    private ArrayList<String> result;

    public WindowsResourceContext() {
        result = new ArrayList<String>();
    }

    @Override
    public BigInteger FreeMemory() {
        result = wce.RunCommand(Constant.TOTAL_FREE_MEMORY_CMD);
        return new BigInteger(result.get(2).trim());
    }

    @Override
    public BigInteger TotalMemory() {
        result = wce.RunCommand(Constant.TOTAL_MEMORY_CMD);
        return new BigInteger(result.get(2).trim());
    }
}
