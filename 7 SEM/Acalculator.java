import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Main calculator = new Main(); 

        if (n == 1) {
            System.out.println("sum: " + calculator.sum(a, b));
        } 
        else if (n == 2) {
            System.out.println("sub: " + calculator.sub(a, b));
        } 
        else if (n == 3) {  
            System.out.println("mul: " + calculator.mul(a, b));
        } 
        else if (n == 4) {
            System.out.println("div: " + calculator.div(a, b));
        } 
        else {
            System.out.println(0);
        }
    }

	
	public int sum(int a,int b){
		return a+b;
	}
	public  int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int div(int a, int b) {
        if (b != 0) { 
            return a / b;
        } else {
            System.out.println("Division by zero error");
            return 0;
        }
    }
}
