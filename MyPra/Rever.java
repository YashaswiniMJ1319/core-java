class Rever{
public static void main(String[] argc){
int num=128;
int reverse=0;
while(num>0){
int digit=num%10;
reverse=reverse*10+digit;
num=num/10;
}
System.out.print(reverse);
}
}