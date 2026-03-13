class Sums{
int sum;
public static void main(String[] argc){
int[] array={2,3,4,5,6};
Sums myObj=new Sums();
for(int arr:array){
myObj.sum+=arr;
}

System.out.println(myObj.sum);

}
}
