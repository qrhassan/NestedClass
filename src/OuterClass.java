
public class OuterClass {
	static int staticField = 0; //static, class level ...one staticField variable shared amongst
								// all instances of OuterClass
	int instanceField;//non-static, instance level..each instance of OuterClass gets its own instanceField

	//constructor
	public OuterClass() {
		instanceField = 1;
		System.out.println("Hello from OuterClass constructor");
	}

	//1. static nested class
	public static class StaticNestedClass {
		//nested classes are the member of the enclosing class
		//static nested classes can access static members of the enclosing class
		//static nested classes are not associated with an instance of the enclosing class
		//no this reference for StaticNestedClass and no this reference for OuterClas
		
		//constructor 
	public StaticNestedClass() {
		System.out.println("Hello from StaticNestedClass constructor");
		System.out.println(staticField);
	}
		
		
	}
	
}
