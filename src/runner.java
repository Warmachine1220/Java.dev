public class runner {
	public static void main(String[] args) throws Exception {
		/*
		 * String url = "jdbc:oracle://192.168.0.236//1521//TPBANK122"; String uname =
		 * "SBC_UAT_SA_2303"; String pass = "abc_123"; String query =
		 * "select * from az_user;"; Class.forName("com.sql.jdbc.Driver"); Connection
		 * con = DriverManager.getConnection(url, uname, pass); Statement st =
		 * con.createStatement(); ResultSet rs = st.executeQuery(query); rs.next();
		 * String name = rs.getString("username"); System.out.println(name);
		 */
		MyNumber number = new MyNumber(12);
		// number.printANumberTriangle();
		int i = 5;
		while (i < 6) {

			System.out.println(i);
			System.out.println(++i);

			i--;
		}
	}

}
