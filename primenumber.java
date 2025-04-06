public class primenumber  {
public static void main (String[] args){
boolean flag=true;
int i;
int n=10;
if(n<=1){
System.out.println("not prime");
}
for(i=2;i<=n;i++){
if(n%i==0){
System.out.println(i+" is not prime");
}
else{
System.out.println(i+" is prime");
}
}
}
}