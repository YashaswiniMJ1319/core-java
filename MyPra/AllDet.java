import java.util.Scanner;
class AllDet{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=input.nextLine();
		System.out.println("Your name is:"+name);
		System.out.println("Enter your age");
		int age=input.nextInt();
		System.out.println("Your age is:"+age);
		System.out.println("Enter your hight");
		double hight=input.nextDouble();
        System.out.println("Your hight is:"+ hight);		
	}
}