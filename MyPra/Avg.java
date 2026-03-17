class Avg{
public static void main(String[] argc){
int[] array={10,20,30,40};
int sum=0;
int result;
for(int i=0;i<array.length;i++){
sum+=array[i];
}
result=sum/array.length;
System.out.println(result);

}
}