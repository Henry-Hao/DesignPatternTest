
public class testChainOfResponsibility {

	public static void main(String[] args) {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 333);
		Support diana = new LimitSupport("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);
		
		alice.next(bob)
			.next(charlie)
			.next(diana)
			.next(elmo)
			.next(fred);
		
		for(int i = 0; i < 500; i+=33) {
			alice.support(new Trouble(i));
		}

	}

}
