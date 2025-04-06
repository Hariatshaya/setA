public class lcm {
public static void main(String[] args){
int n1=12;
int n2=16;
int a=n1,b=n2;
while(b!=0){
int temp=b;
b=a%b;
a=temp;
}
int lcm=(n1*n2)/a;
System.out.println(lcm);
}
}