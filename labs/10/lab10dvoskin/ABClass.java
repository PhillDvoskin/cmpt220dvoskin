package lab10dvoskin;

public class ABClass {
	// make an Abstract Class called AbstractClass
	abstract class AbstractClass {	
		public abstract String printMessage();
	}
	// make a class Output1
	class Output1 extends AbstractClass {
		// override and make a string printMessage that returns what class it is
		@Override
		public String printMessage() {
			return 
				"This is the first subclass";
		}
	}
	// make a class Output2
	class Output2 extends AbstractClass {
		// override and make a string printMessage that returns what class it is
		@Override
		public String printMessage() {
			return 
				"This is second subclass";
		}
	}
}
