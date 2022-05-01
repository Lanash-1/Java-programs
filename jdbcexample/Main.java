package jdbcexample;
import java.sql.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/record_company";
		String uname = "root";
		String pass = "password";
		String hero = "SPIDERMAN";
		String query = "insert into bands(name) values (?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, hero);
		int count = pst.executeUpdate();
		query = "UPDATE bands SET name = 'HAWKEYE' WHERE id = 7";
		Statement st = con.createStatement();
		count = st.executeUpdate(query);
		System.out.println(count + " row/s affected");
		st.close();
		pst.close();
		con.close();
	}
}