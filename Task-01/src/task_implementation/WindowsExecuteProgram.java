package task_implementation;

import task_interface.IExecuteProgram;

import java.io.IOException;

public class WindowsExecuteProgram implements IExecuteProgram {
    @Override
    public void execByProgramName(String programName) {
        try
        {
            String cmd = String.format(programName);
            Runtime run  = Runtime.getRuntime();
            Process proc = run.exec(cmd);
        }
        catch (IOException e)
        {
            System.out.println("Program not found!");
            e.printStackTrace();
        }
    }

    @Override
    public void execByProgramLocation(String programLocation, String programName) {
        try
        {
            String cmd = String.format( programLocation + programName);
            Runtime run  = Runtime.getRuntime();
            Process proc = run.exec(cmd);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
