package server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;


@RestController
public class WebApi {

    @RequestMapping("/request")
    public String request(@RequestParam(value = "name", defaultValue = "Anonymous") String name) {
        System.out.println("Received a request");
        return "Hello " + name;
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "email", defaultValue = "kek@gmail.com") String email, @RequestParam(value = "password", defaultValue = "abcd") String password) {
        System.out.println("Received a request");
        Connection c = null;
        PreparedStatement stmt = null;
        String name = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                .getConnection("jdbc:postgresql://104.248.88.37:5432/gogreenserver",
                    "postgres", "admin");

            stmt = c.prepareStatement("select userid, name from users where email = ? AND password = ?;");
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            while ( rs.next() ) {
                int id = rs.getInt("userid");
                name = rs.getString("name");
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        if(name == null){
            return "Wrong email & password";
        }else{
            return "Hello " + name;
        }
    }
}
