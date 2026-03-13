class Avge{
static int sum;	
public static void main(String[] argc){
int[] num={90,80,70,60,50,40};

int result;
for(int nums:num){
sum+=nums;
}
result=sum/num.length;
System.out.println(result);
}
}