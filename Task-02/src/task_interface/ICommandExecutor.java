package task_interface;

import java.util.ArrayList;

public interface ICommandExecutor {
    ArrayList<String> RunCommand(String commandPath, String instrucion, String command);
}
