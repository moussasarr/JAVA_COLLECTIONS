package myProject;

//Inner Member Classes
//Inner Static Classes
//Anonymous Classes
//

public class InnerClassDemo {
	
	public static void main(String args[]) {
		A objA = new A();
		A.B obj = objA.new B();
		obj.show();
		
		C.D objD = new C.D();
		objD.show();
		
		E objE = new E(){
			public void printHello() {
				System.out.println("Yo ! What's up ?");
			}
		};
		
		objE.printHello();
		
		F objF = () -> {	
				System.out.println("Moussa Sarr");
		};
		
		objF.PrintName();
	}

}

class A {
	int rollno;
	String sname;
	
	class B {
		public void show() {
			System.out.println("Show method of class B");
		}
	}
}

class C {
	int rollnoC;
	String snameC;
	
	static class D {
		public void show() {
			System.out.println("Show method of class D");
		}
	}
}

class E {
	public void printHello() {
		System.out.println("Hello");
	}
}

@FunctionalInterface
interface F {
	void PrintName();
}
