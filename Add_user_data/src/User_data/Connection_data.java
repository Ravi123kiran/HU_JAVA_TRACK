package User_data;
import java.sql.*;
public class Connection_data {
    Connection_data con = null;

    public static Connection_data connectDB() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/hotelman",
                        "rkumaa", "Rk123");

                return (Connection_data) con;
            }

        // Catch block to handle the exceptions
        catch (SQLException | ClassNotFoundException e) {

            // Print the exceptions
            System.out.println(e);

            return null;
        }

    }
}
