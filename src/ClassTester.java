
public class ClassTester {

	public static void main(String[] args) {
		/*Nested Classes
		 * a class thats defined inside the body of another class
		 * outer class (AKA enclosing): this is a class that is not nested, 
		 * but maybe has a nested class as a member
		 * outer class can be public or package-private
		 */  
		
		//4 types of nested class
		//1. static nested class
		//2. non-static nested class(AKA inner class)
		//3. local inner class (non-static nested class defined inside a method)
		//4. anonymous class (local inner class without a name)

		//static field
		System.out.println(OuterClass.staticField);
		
		//object creation for non-static field (instance level)
		OuterClass outerClass = new OuterClass();
		
		//instance field
		System.out.println(outerClass.instanceField);
		
		//this is to prove that there is only variable shared amongst all OuterClass objects
		OuterClass outerClass2 = new OuterClass();
		OuterClass outerClass3= new OuterClass();
		
		outerClass.staticField++;
		System.out.println(outerClass.staticField);
		outerClass2.staticField++;
		System.out.println(outerClass2.staticField);
		outerClass2.staticField++;
		System.out.println(outerClass2.staticField);
		outerClass.staticField++;
		System.out.println(outerClass.staticField);
		outerClass3.staticField++;
		System.out.println(outerClass.staticField);
		System.out.println(outerClass.instanceField);
		outerClass.staticField++;
		System.out.println(OuterClass.staticField);
		System.out.println(outerClass3.instanceField);
		
		
	}

}
