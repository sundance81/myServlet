import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@SuppressWarnings("serial")
public class JDBCTest {

//	public static void main(String[] args) throws ClassNotFoundException {
		

		Connection dbconn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:Byelyaeva";
		String userName = "Byelyaeva";
		String userPass = "311281";
	public	void dbFill() throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			dbconn = DriverManager.getConnection(url, userName, userPass);
		
		Statement st = null;

        st = dbconn.createStatement();
        ResultSet result1 = st.executeQuery("INSERT into Registry (name, sirname, email) VALUES ('John', 'Smith', 'js@mith.com');");
        while (result1.next())
        {
          System.out.println(result1.getString(1));
        }

        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
