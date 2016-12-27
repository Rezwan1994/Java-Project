/**
 The employee program implements an application that
 simply initialize the employee information. 

 @author  Rezwan
 @version 1.0
*/
class Employee{
	private String id;
	private String userName;
	private String password;
	private String accountType;
	private String MobileNubmer;
	public Employee(){};
	public Employee(String id, String userName, String password, String accountType, String MobileNumber){
		this.id = id ;
		this.userName = userName;
		this.accountType = accountType;
		this.MobileNubmer = MobileNubmer;
		this.password = password;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getAccountType(){
		return accountType;
	}
	
	public String getPassword(){
		return password;
	}
	
}