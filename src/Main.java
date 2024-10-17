import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Wilkommen in unserer ToDo-Liste\n"+
            "Bitte wählen Sie einen Menüpunkt:\n" +
            "1. |neues ToDo anlegen\n" +
            "2. |ToDo-Liste ausgeben\n" +
            "3. |Programm beenden\n");

        switch(sc.nextInt()){
            case 1:
                Scanner sv=new Scanner(System.in);
                System.out.println("Bitte geben Sie den Namen des ToDo an:");
                String name = sv.nextLine();
                ToDoList.meineToDos.add(new ToDoList(name));
                break;
                case 2: for(ToDoList tmp: ToDoList.meineToDos){
                    System.out.println(tmp);}
                    break;
                case 3: System.exit(0);
                    default:
                        System.out.println("Die Zahl ist ungültig!");
                }
        }

        }
    }
