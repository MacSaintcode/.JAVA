package saintcoded;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {

	public static Statement createStatement() {
        String user = "root",
        password = "",
        url = "jdbc:mysql://localhost:3306/welcome";
        Statement st2 = null;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Driver loaded");
            st2 = conn.createStatement();
            System.out.println("Statement created");
            System.out.println(st2);
            String query = "CREATE TABLE IF NOT EXISTS login(Firstname VARCHAR (50),lastname VARCHAR (50),Gender VARCHAR (20),Username VARCHAR (50), Password VARCHAR(20))";
            st2.execute(query);
            System.out.println("Query executed");
        } catch (SQLException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
        return st2;
    }
}

