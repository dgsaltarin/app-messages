import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class MessagesDAO {

    static void setMessageOnDB(Messages message){
        ConnectionToDB connectionToDB = new ConnectionToDB();

        try {
            Connection connection = connectionToDB.getConnection();

            String sql = "INSERT INTO messages VALUES (?,?,?,?)";
            Date date = new Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setNull(1,Types.NULL);
            preparedStatement.setString(2, message.getMessage());
            preparedStatement.setString(3, message.getMessageAuthor());
            preparedStatement.setDate(4,sqlDate);
            preparedStatement.executeUpdate();
            System.out.println("Mensaje creado correctamente");

        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al tratar de crear el nuevo mensaje!");
        }
    }

    static ArrayList<Messages> readMessage(){ConnectionToDB connectionToDB = new ConnectionToDB();
        ArrayList<Messages> messages = new ArrayList<Messages>();
        try {
            Connection connection = connectionToDB.getConnection();

            String sql = "SELECT * FROM messages";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Messages message = new Messages();
                message.setMessageId(rs.getInt("id_message"));
                message.setMessage(rs.getString("message"));
                message.setMessageAuthor(rs.getString("autor"));
                message.setMessageDate(rs.getDate("date"));
                messages.add(message);
            }

        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al tratar de leer los mensajes!");
        }
        return messages;
    }

    public static void deleteMessageOnDB(int messageID){}

    public static void updateMessageOnDB(Messages messages){}
}
