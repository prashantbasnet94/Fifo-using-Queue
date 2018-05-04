import java.util.PriorityQueue;

public class Test extends Entry{
	public Test(String key, int value) {
		super(key, value);
	}
 
	static PriorityQueue  	queue=new PriorityQueue();  ;

	public static void enqueue(String name,int value) {
		queue.add(new Entry(name, value));
		/*queue.add(new Entry("Tom", 3));
		queue.add(new Entry("Harry", 2));
		queue.add(new Entry("Larry", 2));
		queue.add(new Entry("Curly", 3));
		queue.add(new Entry("Moe", 4));*/
	
 	}
	public static void dequeue() {
 	System.out.println(queue.poll());
		FunctionClass.main(null);
	}


}  
