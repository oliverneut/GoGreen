package serverPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://104.248.88.37:5432/gogreenserver",
                            "postgres", "admin");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM users;" );
            while ( rs.next() ) {
                int id = rs.getInt("userid");
                String  name = rs.getString("name");
                String email  = rs.getString("email");
                String  password = rs.getString("password");
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println( "EMAIL = " + email );
                System.out.println( "PASSWORD = " + password );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
