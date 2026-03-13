class Swaps{
public static void main(String[] argc){
int a=5;
int b=4;
a=a^b;
b=a^b;
a=a^b;
System.out.println(a + " " + b);
}
}