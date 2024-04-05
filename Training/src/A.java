
public class A {

	void method1() {
		
	}
}
public class B extends A{
	@Override
	void method1() {
		
	}
}
public class C {

	A method1() {
		
	}
}
public class D extends C{
	@Override
	B method1() {
		
	}
}
