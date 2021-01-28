import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DataBaseCon {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement st = conn.createStatement();
			//st.executeUpdate("INSERT into studentdb values(101,'A')");
			//st.executeUpdate("INSERT into studentdb values(102,'B')");
			//st.executeUpdate("INSERT into studentdb values(103,'C')");
			//st.executeUpdate("INSERT into studentdb values(104,'D')");
			int roll = 103;
			String s = "sha";
			st.executeUpdate("UPDATE studentdb SET name= '"+s+"' where rollNo = '"+roll+"'");
			ResultSet rs = st.executeQuery("SELECT *  from studentdb ");
			//System.out.println("RS " +rs.getInt("rollNo")+"  "+rs.getString("name"));
			st.executeUpdate("DELETE from studentdb WHERE rollNo= 104");
			//rs.next();
			//int rollno = rs.getInt("rollNo");
			rs = st.executeQuery("SELECT * from studentdb where name = 'A'");
			rs.next();
			rs.updateString("name","zebra");
			System.out.println(rs.getInt("rollNo"));
			
			while(rs.next()) {
			System.out.println(rs.getInt("rollNo")+" "+rs.getString("name"));
			}
			rs.last();
			System.out.println(rs.getRow());
		}
			
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
