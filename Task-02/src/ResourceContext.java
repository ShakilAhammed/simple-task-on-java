import core.Constant;
import task_implementation.MacResourceContext;
import task_implementation.WindowsResourceContext;
import task_interface.IResourceContext;

import java.math.BigInteger;
import java.util.ArrayList;

public class ResourceContext {
    private IResourceContext resourceContext;

    public ResourceContext() {
        resourceContext = GetResourceContext();
    }

    public BigInteger TotalPhysicalMemory() {
        return resourceContext.TotalPhysicalMemory();
    }

    public BigInteger FreePhysicalMemory() {
        return resourceContext.FreePhysicalMemory();
    }

    public ArrayList<String> GetSystemInformation() {
        return resourceContext.GetSystemInformation();
    }


    private  IResourceContext GetResourceContext() {
        if(Constant.IS_WINDOWS) {
            if(this.resourceContext == null) {
                return new WindowsResourceContext();
            }
            return this.resourceContext;
        }
        else if(Constant.IS_MAC) {
            if(this.resourceContext == null) {
                return new MacResourceContext();
            }
            return this.resourceContext;
        }
        else{
            return null;
        }
    }
}
