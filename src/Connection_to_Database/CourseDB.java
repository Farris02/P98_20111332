package Connection_to_Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
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
      try{
        CourseDB sbs = new CourseDB();
       addingAdminsUsnPswd(sbs); 
       //addingStudentUsnPswd(sbs);
       addingStudents(sbs);
       addingCourses(sbs);}
      catch(NullPointerException e){
          e.printStackTrace();
      }
    }
public static void addingAdminsUsnPswd(CourseDB sbs) throws SQLException{
    sbs.checkExistedTable("ADMIN");
    sbs.statement.addBatch("CREATE TABLE ADMIN (ADMIN_ID INT, FIRST_NAME VARCHAR(50), LAST_NAME VARCHAR(50), USERNAME VARCHAR(50), PASSWORD  VARCHAR(50))");
    sbs.statement.addBatch("INSERT INTO  ADMIN VALUES (14123213,'Ferris', 'Nakasha','admin', 'admin202')");
    sbs.statement.executeBatch();
}
/*
public static void addingStudentUsnPswd(CourseDB sbs) throws SQLException{
    sbs.statement.addBatch("CREATE TABLE STUDENTS (FIRST_NAME VARCHAR(50), LAST_NAME VARCHAR(50), USERNAME VARCHAR(50), PASSWORD  VARCHAR(50))");
    sbs.statement.addBatch("INSERT INTO STUDENTS VALUES ('Bryan', 'Winston','student', 'student202')");
    sbs.statement.executeBatch();
}
*/
public static void addingStudents(CourseDB sbs) throws SQLException{
    sbs.checkExistedTable("STUDENTS_INFO");
    sbs.statement.addBatch("CREATE TABLE STUDENTS_INFO(STUDENT_ID INT, F_NAME VARCHAR(50), L_NAME VARCHAR(50),ADDRESS VARCHAR(50),PHONE_NUMBER INT, UNIQUE(STUDENT_ID))");
    sbs.statement.addBatch("INSERT INTO STUDENTS_INFO VALUES(20111332,'Ferris','Nakasha','322 Destiny Lane', 0214642132)");
    sbs.statement.executeBatch();
   
}
public static void addingCourses(CourseDB sbs) throws SQLException{
    sbs.checkExistedTable("COURSES");
    sbs.statement.addBatch("CREATE TABLE COURSES (COURSE_CODE VARCHAR(50), COURSE_NAME VARCHAR(50), PRICE FLOAT, YEARS_FOR_COURSE VARCHAR(50), SEMESTER VARCHAR(50), UNIQUE(COURSE_CODE))");
    sbs.statement.addBatch("INSERT INTO  COURSES VALUES('ENME510','Mechanical Principles A',1200.00,'Year 1','Sem 1')");
    sbs.statement.executeBatch();
    sbs.closeConnection(); 
}

 public void checkExistedTable(String name) {
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);

            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(name)) {
                    statement.executeUpdate("Drop table " + name);
                    System.out.println("Table " + name + " has been deleted.");
                    break;
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }



    public void closeConnection() {
        this.dbManager.closeConnections();
    }
}
