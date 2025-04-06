public class palindrome {
public static void main(String[] args){
int n=8448;
int temp=n;
int rev=0;
while(n>0){
rev=(rev*10)+temp%10;
temp=temp/10;
}
if(temp==rev){
System.out.println(n+" is a palindrome");
}
else{
System.out.println(n+"is not a palindrome");
}
}
}
