package packageWeek3;

public class Demo01 {
	

	    static int z =100;  // static variable
	    static int x = 10;  // instance variable


	    public static void addNumber(){
	        //static int d = 10;  not allowed
	        int a = 30; // local variable
	        int b = 20;
	        System.out.println(a + b);
	    }

	    public static void subNumber(){
	        int y = 5;
	        System.out.println(x - y);
	    }

	    public static void main(String[] args) {
            addNumber();
            subNumber();
	    }
	
}
