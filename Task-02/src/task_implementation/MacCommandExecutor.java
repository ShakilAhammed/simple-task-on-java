package task_implementation;

import task_interface.ICommandExecutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MacCommandExecutor implements ICommandExecutor {
    private ArrayList<String> result;

    public MacCommandExecutor() {
        result = new ArrayList<>();
    }
    @Override
    public ArrayList<String> RunCommand(String command) {
        try {
            ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", command);
            Process p=pb.start();
            BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while((line=br.readLine())!=null){
                System.out.println("Total Memory: "+line);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return null;
    }
}
