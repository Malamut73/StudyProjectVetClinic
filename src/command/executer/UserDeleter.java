package command.executer;

import command.CommandType;

public class UserDeleter extends AbstractCommandExecutor{
    @Override
    public int execute(String command) {
        return 0;
    }

    @Override
    public CommandType getCommandType() {
        return null;
    }
}