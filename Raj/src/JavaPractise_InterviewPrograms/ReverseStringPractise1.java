package JavaPractise_InterviewPrograms;

public class ReverseStringPractise1 {

	public static void main(String[] args) {
String s="MOM1";
	String reverse="";
	char a[]= s.toCharArray();
	
	System.out.println("Original String is:"+s);
	
	for(int i=s.length()-1; i>=0;i--)
	{
		reverse=reverse+a[i];
		
	}
	System.out.println(reverse);
	System.out.println("---------");
	
	StringBuffer sb =new StringBuffer(s.valueOf(s));
	
	StringBuffer b = sb.reverse();
	System.out.println(b);
	
	
	
	}

}
