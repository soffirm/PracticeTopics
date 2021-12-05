package org.andrapradesh;

public class AndhraPradesh {
	

	public void telugu() {
	System.out.println("telugu");
	int a= 10;
	int b=20;
	System.out.println(a+b);
	}

private void justChecking() {
	
System.out.println("Just checking if there's any conflict");
	

}
private void sampleMethod2() {
	System.out.println("trying to make conflict----2");
	System.out.println("Let's see..........");
	System.out.println("Stefan salvatore........");
	System.out.println("Damon salvatore - checking");
}


	private void sampleMethod() {
		System.out.println("trying to make conflict");
		System.out.println("Let's see");
		System.out.println("Stefan salvatore");
		System.out.println("Damon salvatore");
	}
	
	
	
	public static void main(String[] args) {
		AndhraPradesh a= new AndhraPradesh();
		a.sampleMethod();
		a.telugu();
		a.sampleMethod();
		a.sampleMethod2();




	}
}
