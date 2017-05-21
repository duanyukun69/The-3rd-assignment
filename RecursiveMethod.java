import java.util.Scanner;

public class RecursiveMethod {

	static long fact(int n)
	{
		if(n <= 1)
		{
			return 1;
		}
		else
		{
			return n * fact(n - 1);
		}
	}
	
	public static void main(String[] args) {
		int i;
		System.out.println("请输入要求阶乘的一个整数:");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		System.out.println(i + "的阶乘结果是："+fact(i));

	}

}
