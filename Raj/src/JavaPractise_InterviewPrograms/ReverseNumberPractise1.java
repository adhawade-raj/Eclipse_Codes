package JavaPractise_InterviewPrograms;

public class ReverseNumberPractise1 {

	public static void main(String[] args) {

		int number =246;
		int temp,reverse=0;
		int a=number;
		while(number>0)
				{
			temp=number%10;
			reverse=number*10+temp;
			number=number/10;
				}
		System.out.println("Reverse is:"+reverse);
		
		System.out.println("-----------");
		StringBuffer sb=new StringBuffer(String.valueOf(a));
		StringBuffer b =sb.reverse();
		System.out.println(b);
		
	}

}
