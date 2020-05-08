import java.sql.Connection;
import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
        ConnectionToDB connection = new ConnectionToDB();

        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("-------------------------------");
            System.out.println("Aplicación de mensajes.");
            System.out.println("1.crear mensaje.");
            System.out.println("2.listar mensajes.");
            System.out.println("3.editar mensaje.");
            System.out.println("4.eliminar mensaje.");
            System.out.println("5.salir.");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    MessagesServices.createMessage();
                    break;
                case 2:
                    MessagesServices.messagesList();
                    break;
                case 3:
                    MessagesServices.updateMessage();
                    break;
                case 4:
                    MessagesServices.deleteMessage();
                    break;
                case 5:

                    break;
                default:

                    break;

            }
        } while (option != 5);
    }
}
