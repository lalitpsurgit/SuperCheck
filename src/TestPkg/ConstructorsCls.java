package TestPkg;

class concheck{
	
	int val;
	
//	public concheck() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Constructor called");
//		val = 20;
//	}
	
	void namex() {
		val = 20;
		System.out.println("Value = "+val);
	}
	
	public void namef() {
		 System.out.println("No constructor"+val);
	}
}

public class ConstructorsCls {
	
	public static void main(String[] args) {
		concheck ss = 	new concheck();
		ss.namef();
	}
	


}
