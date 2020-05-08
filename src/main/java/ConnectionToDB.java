import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

    public Connection getConnection(){
        Connection connection = null;

        try{ connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages", "root", "admin");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos");
        }

        return connection;
    }
}
