package fypms;

public abstract class  User {
	private String userName;
	private String userID;
	private String password;
	
	public User(String userID, String userName) {
		this.userID = userID;
		this.userName = userName;
		password = "password";
	}
	
	public String getUserName() {
		return userName;
	}

	public String getUserID() {
		return userID;
	}

	public boolean checkPassword(String password) {
		if(this.password.equals(password))
			return true;
		else 
			return false;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public abstract String email();
}
