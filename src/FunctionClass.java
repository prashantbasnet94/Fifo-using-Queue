import java.util.PriorityQueue;
import java.util.Scanner;

public class FunctionClass extends Test {
	static int a;
	static String string;
	public FunctionClass(String key, int value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("\n Enter \n <<  1  = for queuing elements>>,\t <<< 2  = dequeue element s >>, \t <<<   3  =check isEmpty >>>, "
				+ "	\n <<<  4  = for peeek >>>, \t <<<<   5  = for size >>>, \t <<<   6   = for  toStirng() >>> ");
		
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		
		if(a==1) {
			enqueue("Larry", 1);
			enqueue("Curly", 5);
			enqueue("Moe", 4);
			enqueue("Tom", 3);
			FunctionClass.main(null);
			
			
		}else if(a==2) {
			dequeue();
		}else if(a==3) {
			check();
		}else if(a==4) {
			
		}else if(a==5) {
			size();
			
		}else if(a==6) {
			string();
			
		}
		
		 





		//	System.out.println("hello"+queue.poll());
		/*	//dequeue();
		 while(!queue.isEmpty()) {
		//	System.out.print(queue.poll());
		System.out.println(queue.poll());
		 */

	}
	private static void string() {
		System.out.println(queue.toString());
		FunctionClass.main(null);
	}
	private static void size() {
		System.out.println("Size is"+queue.size());
		FunctionClass.main(null);
	}
	public static void check() {
		System.out.println(queue.isEmpty()? "It is Empty":"It is not empty");
		FunctionClass.main(null);
	}


}





