public class strongnumber{
public static void main(String[] args){
int n=145;
int sum=0;
int temp=n;
int rem;

while(temp>0){
rem=temp%10;
int fact=1;

for(int i=1;i<=rem;i++){
fact=fact*i;
}
sum=sum+fact;
temp=temp/10;
}
if(sum==n){
System.out.println(n+" is a strong number");
}
else{
System.out.println(n+" is not a Strong number");
}
}
}