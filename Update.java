import java.sql.*;

public class Update {
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
        String sql = "update student set name='max' where sid=5 ";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        st.execute(sql);
        con.close();
        System.out.println("Connection Closed");
    }
}
