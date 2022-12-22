package tut_14_project.db;


import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDBConnection {

    static Connection conn = null;
    public static Connection createDBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/grp?useSSL=false";
            String id = "root";
            String passwd = "root";

            conn = DriverManager.getConnection(url, id, passwd);
            System.out.println("Mysql DB Connected...");

        } catch(Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
