package Connection_to_Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CourseDB {
    
    DB_Manager dbManager;
    Connection conn;
    Statement statement;

    public CourseDB() {
        dbManager = new DB_Manager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) throws SQLException {
       
      addingSQL();
      
       
    }
public static void addingSQL() throws SQLException{
    CourseDB sbs = new CourseDB();
    sbs.statement.addBatch("CREATE  TABLE ADMINS (FirstName VARCHAR(50), LastName VARCHAR(50), USERNAME  VARCHAR(50), PASSWORD  VARCHAR(50))");
            sbs.statement.addBatch("INSERT INTO ADMINS VALUES ('Ferris', 'Nakasha','admin', 'admin202')"
               

            );
            sbs.statement.executeBatch();
            
            
       
 sbs.closeConnection();
}

 
    public void closeConnection() {
        this.dbManager.closeConnections();
    }
}
