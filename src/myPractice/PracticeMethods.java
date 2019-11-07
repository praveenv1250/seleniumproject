package myPractice;

public class PracticeMethods {
	
	int a=20;
	String str1="Learn";
	String str2="Selenium";
	char ch='A';
	double d=10.56;
	
	public String addstring(String str3,String str4)
	{
		String name=str3+str4;
		return name;
		
	}
	
	public static void main(String[] args) 
	{
	  PracticeMethods pm=new PracticeMethods();
	  String Goal=pm.addstring("Learn", "Java");
	  System.out.println(Goal);
	}

}
