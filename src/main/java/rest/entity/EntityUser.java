package rest.entity;

public class EntityUser {

	private int userId;
	private String userName;
	private String userSurname;
	private String userEmail;
	private String userCategory;

	public EntityUser() {}

	public EntityUser(int userId, String userName, String userSurname, String userEmail, String userCategory) {
		this.userId = userId;
		this.userName = userName;
		this.userSurname = userSurname;
		this.userEmail = userEmail;
		this.userCategory = userCategory;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

}
