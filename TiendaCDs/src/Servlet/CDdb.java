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

public class CDdb {
	// private Connection connect = null;
	private DataSource ds;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public CDdb() {

		try {

			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/CDs");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	// Class.forName("com.mysql.jdbc.Driver");
	// Setup the connection with the DB

	/*
	 * public String getAlbum(int i) throws SQLException {
	 * 
	 * String album = resultSet.getString(0); return album; }
	 */

	public List<CD> getList() throws SQLException {

		// Statements allow to issue SQL queries to the1 database
		Connection con = ds.getConnection();
		preparedStatement = con.prepareStatement("select * from CD");
		// preparedStatement.setString(1, Integer.toString(i));
		// Result set get the result of the SQL query
		resultSet = preparedStatement.executeQuery();
		List<CD> lista = new LinkedList();
		while (resultSet.next()) {
			CD disco = new CD();
			disco.setAlbum(resultSet.getString(2));
			disco.setArtist(resultSet.getString(3));
			disco.setCountry(resultSet.getString(4));
			disco.setPrice(Float.parseFloat(resultSet.getString(5)));
			
			lista.add(disco);

		}
		return lista;
	}
}
