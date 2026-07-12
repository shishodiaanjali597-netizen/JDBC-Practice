import java.sql.*;
import java.io.*;

public class jdbc06update {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "admin123";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String q = "UPDATE table1 SET tname=?, tcity=? WHERE tid=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter the name");
            String name = br.readLine();
            System.out.println("Enter the city");
            String city = br.readLine();
            System.out.println("Enter the id");
            int id = Integer.parseInt(br.readLine());
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, name);
            ps.setString(2, city);
            ps.setInt(3, id);
            ps.executeUpdate();
            
            System.out.println("Data updated successfully!");
            con.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}