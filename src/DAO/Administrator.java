package DAO;

public class Administrator {
	
	void findAllUsers() {
		
		String sql = "select * From user";
	}
	
	void adminConnect() {
		
		String sql= "" ;
		
	}
	
	void findParticipations() {
		
		String sql= "select * From Participation" ;
		
	}
	
	void findParticipationByUserEmail( String email ) {
		
		String sql= "select * From Participation where  user_id= (select id From user where email = ? )" ;
		
	}
	
	void validationParticipation() {
		
		String sql= "select * From Participation" ;
		
	}
	
	void addParticipation() {
		
		String sql= "select * From Participation" ;
		
	}

}
