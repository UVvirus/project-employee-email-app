import java.util.*;

public class email
{ private String firstName;
private String lastName;
private String email;
private String alternativeEmail;
private String department;
private int mailBoxCapacity;
private String companyName="uvdv";
private String password;

//constructor
public email(String firstName,String lastName){
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println(this.firstName+ " "+this.lastName);
	//print department
	this.department=setDepartment();
	System.out.println(department);
	//print password
	this.password=setPassword(10);
	
	System.out.println("your password is: "+this.password);
	//print email
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"."+department+"@"+companyName+".com";
	System.out.println("your email is: "+email);
}






	private String setDepartment(){
		System.out.println("Departments \n1 dev \n2 hacker \n3 pgmer");
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter ur choice");
		int choice=input.nextInt();
		if(choice==1){return "dev";}
		else if(choice==2){return "hacker";}
		else if(choice==3){return "pgmer";}
		else{return "";}
		
	}
	private String setPassword(int length){
		String passwordSet="abcdefghijklmnopqrstuvwxyz1234567890@#$&+/";
		char[]password=new char[length];
		
		for(int i=0;i<length;i++){
			int random=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(random);
		}
		return new String(password);
		
	}
	//Getters and Setters
	public void setMailBoxCapacity(int mailBoxCapacity)
	{
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public int getMailBoxCapacity()
	{
		return mailBoxCapacity;
	}
	public void setAlternativeEmail(String alternativeEmail)
	{
		this.alternativeEmail = alternativeEmail;
	}

	public String getAlternativeEmail()
	{
		return alternativeEmail;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}
	
}
