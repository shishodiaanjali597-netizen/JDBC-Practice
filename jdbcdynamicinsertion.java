import java.sql.*;
import java.io.*;


public class jdbcdynamicinsertion{


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

                //Step4:get the prepared statement object
                PreparedStatement pstmt=con.prepareStatement(q);
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the name");
                String name=br.readLine();
                System.out.println("Enter the city");
                String city=br.readLine();


                
                //Step5: set the values to query
                 
                 pstmt.setString(1,name);
                 pstmt.setString(2,city);
                 pstmt.executeUpdate();
                 
                 System.out.println("Data is inserted successfully");
                 con.close();
        }
        catch(Exception e){ 
           e.printStackTrace();;

        }
    }
    
}
