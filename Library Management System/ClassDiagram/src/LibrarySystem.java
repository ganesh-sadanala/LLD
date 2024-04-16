import java.util.ArrayList;
import java.util.Stack;

// Invoker
public class LibrarySystem {
    Stack<LibraryCommand> commandHistory=new Stack<>();

    public void executeCommand(LibraryCommand command){
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand(){
        if(!commandHistory.isEmpty()){
            LibraryCommand lastCommand=commandHistory.pop();
            lastCommand.undo();
        }
    }

    public void redoLastCommand(){
        if(!commandHistory.isEmpty()){
            LibraryCommand lastCommand=commandHistory.peek();
            lastCommand.redo();
        }
    }
}
