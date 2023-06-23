package db;
//ehznrsdcxghyykjo
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection ; // by default it is null but for ........... we write
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FileHider", "root", "root1");


            /*Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql//localhost:3306/FileHider" ,"root","root1");
*/
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
        System.out.println("Connection succesfully ");
        return connection;
    }
    public static void closeconnection(){
        if (connection != null){
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        MyConnection.getConnection();
    }
}
