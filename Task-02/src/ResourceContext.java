import core.Constant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResourceContext {
    private BufferedReader r;
    private ArrayList<String> line;

    public ResourceContext() {
        line = new ArrayList<>();
    }
    
    public String GetTotalMemory() {
        if(Constant.IS_WINDOWS) {
            ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", Constant.TOTAL_MEMORY_CMD);
        builder.redirectErrorStream(true);
        Process p;
            try {
                p = builder.start();
                r = new BufferedReader(new InputStreamReader(p.getInputStream()));
                
            } catch (IOException ex) {
                Logger.getLogger(ResourceContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        while (true) {
                try {
                    String data = r.readLine();
                    line.add(data); 
                    if (data == null) { break; }
                } catch (IOException ex) {
                    Logger.getLogger(ResourceContext.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

            return "Total Memopry : " + line.get(2);
        }
        else{
            return "null";
        }
    }
}
