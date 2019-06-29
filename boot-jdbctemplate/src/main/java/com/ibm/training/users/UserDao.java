package com.ibm.training.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public String getUser(int id) {

		String sql = "select userName from userDetails where userId = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { id }, String.class);

	}

	

	int updateUser(User user, Integer id) {
		String sql = "update userDetails set userName=?  where userId = ?";
//	return jdbcTemplate.update(sql, userName, userId);
		return jdbcTemplate.update(sql, new Object[] { user, id });

	}
//	void addUser(com.ibm.training.users.User user) {
//		String sql = "insert into userDetails values(?, ?, ?, ?)";
//		jdbcTemplate.update(sql,
//				new Object[] { user.getUserName(), user.getUserId(), user.getUserAddress() });
//	}

	List<User> getUsers() {
		String sql = "select * from userDetails";
		return jdbcTemplate.query(sql, new UserMapper());

	}
	class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			com.ibm.training.users.User user = new com.ibm.training.users.User();
			user.setUserName(rs.getString("userName"));
			user.setUserId(rs.getInt("userId"));
			user.setUserAddress(rs.getString("userAddress"));
			return user;
		}
		
	}
	int deleteUser(Integer id) {
		String sql="delete from userDetails where userId=?";
		
		return jdbcTemplate.update(sql, new Object[] {id});
	}




	

	
	
	
	
}
