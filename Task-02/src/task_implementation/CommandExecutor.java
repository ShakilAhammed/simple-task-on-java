package task_implementation;

import task_interface.ICommandExecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandExecutor implements ICommandExecutor {
    private BufferedReader r;
    private ArrayList<String> result;

    public CommandExecutor() {
        result = new ArrayList<>();
    }

    @Override
    public ArrayList<String> RunCommand(String commandPath,String instruction,  String command) {
        ProcessBuilder builder = new ProcessBuilder(
                commandPath, instruction, command);
        builder.redirectErrorStream(true);
        Process p;
        try {
            p = builder.start();
            r = new BufferedReader(new InputStreamReader(p.getInputStream()));

        } catch (IOException ex) {
            Logger.getLogger(WindowsResourceContext.class.getName()).log(Level.SEVERE, null, ex);
        }


        while (true) {
            try {
                String data = r.readLine();
                result.add(data);
                if (data == null) {
                    break;
                }
            } catch (IOException ex) {
                Logger.getLogger(WindowsResourceContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return result;
    }
}
