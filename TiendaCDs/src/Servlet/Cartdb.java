package Servlet;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Cartdb {
	// private Connection connect = null;
	private DataSource ds;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public Cartdb() {

		try {

			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/CDs");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public void putcart(String id, float total) throws SQLException {

		// Statements allow to issue SQL queries to the1 database
		Connection con = ds.getConnection();
		//preparedStatement = con.prepareStatement("insert into CD values (?, ?)");
		
				
		// preparedStatement.setString(1, Integer.toString(i));
		// Result set get the result of the SQL query
		String insertTableSQL = "INSERT INTO carrito"
				+ "(sesionid, Total) VALUES"
				+ "(?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(insertTableSQL);
		preparedStatement.setString(1, id);
		preparedStatement.setFloat(2, total);
		preparedStatement.executeUpdate();
		
		
	}
	
}