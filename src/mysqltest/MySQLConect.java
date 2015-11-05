package mysqltest;
import java.sql.*;

class MySQLConect {
	 
    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Class.forName("com.mysql.jdbc.Driver");
         
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/test",
                "root","39071410");
        Statement stmt =  conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from test");
         
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "\t"
                    +rs.getInt(2));
            }
         
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();   
        }
        if (conn != null) {
            conn.close();   
        }
    }
 
}
