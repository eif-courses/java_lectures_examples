import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Blynine b = new Blynine("Gusto", "Gustas");

        for (Blynas blynas: b.getBlynai()) {
            System.out.println(blynas);
        }
/*
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/info", "root", "");
        //here sonoo is database name, root is username and password
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from rusis");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2));
        con.close();
*/
    }
}
