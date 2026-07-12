import java.sql.*;
public class jdbctablecreation {
    public static void main (String[]args){
        try{
            //Step 1: Load the driver class
             Class.forName("com.mysql.cj.jdbc.Driver");
            //step2 create the connection object
           
                String url = "jdbc:mysql://localhost:3306/youtube";
                String username = "root";
                String password = "admin123";
                Connection con=DriverManager.getConnection(url,username,password);
                
                //Step3: creating a query
                String q="CREATE TABLE table1(tid int(20) PRIMARY KEY AUTO_INCREMENT, tname varchar(200) NOT NULL, tcity varchar(400))";
                
                //Step4: Create the statement object
                 Statement stmt=con.createStatement();
                 stmt.executeUpdate(q);

                 System.out.println("Table is created successfully");
                 con.close();
        }
        catch(Exception e){ 
           e.printStackTrace();;
        }
    }
    
}
