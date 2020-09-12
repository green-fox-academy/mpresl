import java.sql.Connection;
import java.sql.DriverManager;
// https://www.youtube.com/watch?v=2i4t-SL1VsU
public class main {
    public static void main(String[] args) throws Exception {
        getConnection();
    }

    public static Connection getConnection() throws Exception{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/?user=root";
            String username = "root";
            String password = "ekimekim";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            return conn;
        } catch (Exception e){
            System.out.println(e);
        }

        return null;
    }
}
