import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoList {
  public static ArrayList<ToDoList>meineToDos = new ArrayList<>();
    String name;
    LocalDateTime ldt = LocalDateTime.now();

    public ToDoList(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\'' +
                ", ldt=" + ldt +
                '}';
    }
}
