package servlet.attributes;

public class User {
	
	private String userName;
	
	private int age;
	
	private String screenName;
	
	public User() {
		
	}

	public User(String userName, int age, String screenName) {
		super();
		this.userName = userName;
		this.age = age;
		this.screenName = screenName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	

}
