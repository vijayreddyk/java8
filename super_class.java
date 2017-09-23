class super_cl{
	String variable;
	public void check(){
		System.out.println("super class check() method "+variable);
	}
	public static void staticsmethod(){
		System.out.println("static method in super class");
	}
}
class super_class extends super_cl{
	String variable;
	public void check(){
		System.out.println("sub class check() method "+variable);
	}
	public void method(super_class sc){
		sc.variable = "1000";
               	sc.check();
               	super.variable = "super variable";
               	super.check();
		staticsmethod();
	}
	public static void main(String args[]){
	       	super_class sc = new super_class();
	       	sc.method(sc);
	}
}
       			       
