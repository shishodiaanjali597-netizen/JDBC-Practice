import java.sql.*;
public class jdbctableinsertion {
    public static void main(String[]args){
        try{
            //Step 1: Load the driver class
             Class.forName("com.mysql.cj.jdbc.Driver");
            //step2 create the connection object
           
                String url = "jdbc:mysql://localhost:3306/youtube";
                String username = "root";
                String password = "admin123";
                Connection con=DriverManager.getConnection(url,username,password);
                
                //Step3: creating a query
                String q="INSERT INTO table1(tname,tcity) VALUES(?,?)";
                
                //Step4: Create the statement object
                 PreparedStatement pstmt=con.prepareStatement(q);
                 pstmt.setString(1,"Ravi");
                 pstmt.setString(2,"Delhi");
                 pstmt.executeUpdate();
                 
                 System.out.println("Data is inserted successfully");
                 con.close();
        }
        catch(Exception e){ 
           e.printStackTrace();;

        }
    }
    
}
