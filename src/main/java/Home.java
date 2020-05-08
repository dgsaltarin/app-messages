import java.sql.Connection;

public class Home {

    public static void main(String[] args){
        ConnectionToDB connection = new ConnectionToDB();

        try {
            Connection conx = connection.getConnection();
        } catch (Exception e){}
    }
}
