import java.sql.*;

public class jdbc05select {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "admin123";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String q = "SELECT * FROM table1";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            System.out.println("TID | TNAME | TCITY");
            System.out.println("-------------------");
            
            while(rs.next()) {
                int tid = rs.getInt("tid");
                String tname = rs.getString("tname");
                String tcity = rs.getString("tcity");
                System.out.println(tid + " | " + tname + " | " + tcity);
            }
            
            con.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}