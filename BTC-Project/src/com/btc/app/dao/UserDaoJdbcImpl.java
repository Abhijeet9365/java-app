package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

//import com.btc.app.model.Employee;
import com.btc.app.model.User;
import com.btc.app.ui.UserAppUI;


public class UserDaoJdbcImpl implements UserDao {
	
	private Connection con;
	
	private PreparedStatement smt;
	public Scanner scanner=new Scanner(System.in);
	
	
	public UserDaoJdbcImpl() throws SQLException {
		con=ConnectionUtil.getDbConnection();
	}

	@Override
	public User addUser(User user) throws SQLException, InvalidIdException {
		String query1="select count(*) from user where userid=?";
		smt=con.prepareStatement(query1);
		smt.setInt(1, user.getUserid());	
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		System.out.println("Total"+count);
		
		if(count>0)
		{
			throw new InvalidIdException("Data already present");
		}
		
		//new code ends
		
		String query = "insert into user values(?,?,?,?)";
		
		
		smt= con.prepareStatement(query);
		
		smt.setInt(1, user.getUserid());
		smt.setString(2, user.getUsername());
		smt.setString(3, user.getPassword());
		smt.setString(4, user.getFavCategory());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return user;
		}
		return null;
	}
	public User readNews(int userId) throws SQLException, InvalidIdException {
		//new code
		String query1="select count(*) from user where userId=? and password=?";
		smt=con.prepareStatement(query1);
		System.out.println("Enter password:");
		String password1=scanner.next();
		smt.setInt(1, userId);	
		smt.setString(2,password1);
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		//System.out.println("Total"+count);
		if(count<1)
		{
			throw new InvalidIdException("User Id doesnot exist");
		}
		//ends
		
		String query="select * from user where userId=?";
		smt=con.prepareStatement(query);
		
		smt.setInt(1, userId);	
		
		ResultSet queryResult = smt.executeQuery();
		
		User user=null;
		
		if(queryResult.next()) {
			user=new User();
			user.setUserid(userId);
			user.setUsername(queryResult.getString("username"));
			user.setPassword(queryResult.getString("password"));
			user.setFavCategory(queryResult.getString("FavtCategory"));
		}
		
		System.out.println(queryResult.getString("FavtCategory"));
		
		return user;
		
	
	}

	
}