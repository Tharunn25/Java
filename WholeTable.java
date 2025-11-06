import javax.xml.transform.Result;
import java.sql.*;

public class WholeTable {
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the result
        close
         */

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "2505";
        String sql = "select * from student";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("name");
//        System.out.println("name of the student is " + name);

        while(rs.next()){
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }
        con.close();
        System.out.println("Connection Closed");
    }
}
