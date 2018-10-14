package task_implementation;

import task_interface.IResourceContext;

public class MacResourceContext implements IResourceContext {
    @Override
    public double FreeMemory() {
        return 0;
    }

    @Override
    public double TotalMemory() {
        return 0;
    }
}
