//program for JDBC connection
import java.sql.*;
class jdbc01connection{

    public static void main (String args[]){
        try{
            //step1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step2 create the connection object
           
                String url = "jdbc:mysql://localhost:3306/youtube";
                String username = "root";
                String password = "admin123";
                Connection con=DriverManager.getConnection(url,username,password);
                if(con.isClosed()){
                    System.out.println("Connection is closed");
                }
                else{
                    System.out.println("Connection is created successfully");
                }

        }catch(Exception e){ System.out.println(e);}
    }
}
