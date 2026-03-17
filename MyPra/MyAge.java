import java.util.Scanner;
class MyAge{
	public static void main(String[] args){
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=userInput.nextInt();
		System.out.println("Your age is :"+age);
	}
}