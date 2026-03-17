class Mux{
public static void main(String[] argc){
int a=60;
int b=65;
int c=77;
if(a>b && a>c){
System.out.println("a is greater than b and c:"+a);
}
else if(b>a && b>c){
System.out.println("b is greater than a and c:"+b);
}
else
{
System.out.println("c is greater than a and b:"+c);
}
}
}