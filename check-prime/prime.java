import java.util.Scanner;
class prime{
public static void main(String[] args){
int n, i, c=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
n = sc.nextInt();
for(i=2;i<n;i++){
if(n%i==0){
c=c+i;
break;
}
}
if(c==0)
System.out.println("prime number");
else
System.out.println("Not prime number");
}
}