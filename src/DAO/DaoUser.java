package DAO;

import java.sql.SQLClientInfoException;

import Model.user;

public class DaoUser {
	
  void AddUser( user user) {
	  
	 String sql = "INSERT INTO `user`( `first_name`, `last_name`, `email`, `phone`) VALUES (?,?,?,?)";
  }
  
  void UpdateUser (user UpdateUser) {
	  String  sql = "UPDATE `user` SET `first_name`=?,`last_name`=?,`email`=?,`phone`=? WHERE id= ?";
	  
  }
  void getbyId (int id) {
	  String  sql = "select * From user WHERE id= ?";
	  
  }
  

  
}
