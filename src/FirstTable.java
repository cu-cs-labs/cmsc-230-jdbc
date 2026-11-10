import java.sql.*;

// makes a table of accounts in a database file beside the project, puts two
// accounts in it, and prints every row
public class FirstTable {
    public static void main(String[] args) throws SQLException {
        try (Connection db = DriverManager.getConnection("jdbc:h2:./bank")) {
            Statement sql = db.createStatement();
            sql.executeUpdate("CREATE TABLE IF NOT EXISTS accounts (name VARCHAR(40) PRIMARY KEY, balance BIGINT)");
            sql.executeUpdate("INSERT INTO accounts VALUES ('alice', 10000)");
            sql.executeUpdate("INSERT INTO accounts VALUES ('bob', 2500)");
            ResultSet rows = sql.executeQuery("SELECT name, balance FROM accounts");
            while (rows.next()) {
                System.out.println(rows.getString("name") + " " + rows.getLong("balance"));
            }
        }
    }
}
