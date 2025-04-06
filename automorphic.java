public class automorphic{
public static void main(String[] args){
int n=45;
int sq=n*n;
int temp=n;
int count=1;
while(temp>0){
if(temp%10!=sq%10){
count=0;
break;
}
temp/=10;
sq/=10;
}
if(count==1){
System.out.println(n+" is automorphic number");
}
else{
System.out.println(n+" is not automorphic number");
}
}}