import core.Constant;
import task_implementation.WindowsResourceContext;
import task_interface.IResourceContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResourceContext {
    private WindowsResourceContext windowsResourceContext;
    private ResourceContext() {
    }

    public static double TotalMemory() {
        return 1.22;
    }
}
