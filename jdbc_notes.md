#JDBC :

JDBC stands for Java Database Connectivity . It is a standard API provided by Oracle for Java application to interact with diffrent set of database.
   
# JDBC ke 6 steps:
   Step 1 - Driver load (automatic Java 8+):
            
            Class.forName("com.mysql.jdbc.Driver")//


   Step 2 - Create a Connection :

            Connection con=DriverManager.getConnection("url,username,password");

   Step 3 - Create Query , Statement,PreparedStatements,CallableStatement:
            
            String q="Select * from users";

            Statement stm=con.createStatement();
            ResultSet set = stmt.executeQuery(q);


   Step 4 - Process the data :

             while(set.next()){
                int id=set.getInt("student_id");
                String name=set.getstring("Student Name");
                System.out.println(id);
                System.out.println(name);


             } 

            
   Step 5 - Close the Connection -
            
            con.close();

        
# BufferedReader
User se input lene ka tarika — keyboard se
data line by line padhta hai.
System.in se directly nahi padhte —
BufferedReader use karte hain kyunki
fast aur efficient hota hai.

Use — Dynamic input lene ke liye
Example — br.readLine()

#PreparedStatement#


SQL query ko database mein bhejna
aur safely execute karna.
'?' placeholder use karta hai —
SQL injection se bachata hai.
Statement se better aur secure hota hai.

Use — INSERT, UPDATE, DELETE, SELECT ke liye
Example — con.prepareStatement(query)
         ps.setString(1, value)
         ps.executeUpdate()
         ps.executeQuery()

#ResultSet:

SELECT query ka result store karta hai.
Table ki tarah hota hai — rows aur columns.
rs.next() se ek ek row pe jaate hain.

Use — SELECT query ka data nikalne ke liye
Example — rs.next()
         rs.getString("column_name")
         rs.getInt("column_name")
         



