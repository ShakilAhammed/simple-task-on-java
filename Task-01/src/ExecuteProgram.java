import task_implementation.WindowsExecuteProgram;

public class ExecuteProgram {
    public static void run(String program){
        /*
        depending on os calling the class {switch case statement}
         */
        WindowsExecuteProgram wep = new WindowsExecuteProgram();
        wep.execByProgramName(program);
    }

    public static void run(String programLocation, String programName){
        /*
        depending on os calling the class {switch case statement}
         */
        WindowsExecuteProgram wep = new WindowsExecuteProgram();
        wep.execByProgramLocation(programLocation, programName);
    }
}
