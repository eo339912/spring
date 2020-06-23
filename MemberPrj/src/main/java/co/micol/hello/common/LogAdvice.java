package co.micol.hello.common;

public class LogAdvice {
	
	public void afterReturningAdvie() {
		System.out.println("afterReturningAdvie()");
	}
	
	public void afterThrowAdvie() {
		System.out.println("afterThrowAdvie");
	}
	public void afterAdvie() {
		System.out.println("afterAdvie()");
	}
	public void beforeAdvie() {
		System.out.println("beforeAdvie()");
	}
	
}
