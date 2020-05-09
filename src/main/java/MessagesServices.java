import java.util.ArrayList;
import java.util.Scanner;

public class MessagesServices {

    static void createMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("cual es el mensaje que desea escribir: ");
        String message = scanner.nextLine();

        System.out.println("¿quien1 es el autor del mensaje?");
        String author = scanner.nextLine();

        Messages messages = new Messages();
        messages.setMessage(message);
        messages.setMessageAuthor(author);

        MessagesDAO.setMessageOnDB(messages);
    }

    static void messagesList(){
        System.out.println("---------------------------------");
        System.out.println("MESSAGE");
        ArrayList<Messages> messages = MessagesDAO.readMessage();
        for (Messages message:messages) {
            System.out.println("id: " + message.getMessageId());
            System.out.println("Message: " + message.getMessage());
            System.out.println("Author: " + message.getMessageAuthor());
            System.out.println("Date: " + message.getMessageDate());
        }
    }

    static void deleteMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id del mensaje que desea borrar:");
        int messageId = scanner.nextInt();
        MessagesDAO.deleteMessageOnDB(messageId);
    }

    static void updateMessage(){}
}
