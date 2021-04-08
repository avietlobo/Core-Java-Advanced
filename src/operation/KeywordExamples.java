package operation;

//Write code (preferably test automation example) to implement various keywords, static, final, finally, synchronize, throw and throws, break and continue, instance of etc.

//When a class is declared with final keyword, it is called a final class. A final class cannot be extended(inherited)
final class KeywordExamples {

	// static variable
	static int a = 10;
	static int b;
	static String msg = "foo";
	final int MINIMUM;

	// a final variable
	// direct initialize
	final int THRESHOLD = 5;

	// constructor for initializing MINIMUM
	// Note that if there are more than one
	// constructor, you must initialize MINIMUM
	// in them also
	public KeywordExamples() {
		MINIMUM = -1;
	}

	// static block
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

	static void fun() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
	}

	// A method that throws an exception and has finally.
	static void A() {
		try {
			System.out.println("inside A");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("A's finally");
		}
	}

	// static method
	static void m1() {
		System.out.println("from m1");
	}

	// Static nested class
	public static class NestedStaticClass {

		// Only static members of Outer class
		// is directly accessible in nested
		// static class
		public void printMessage() {

			// Try making 'message' a non-static
			// variable, there will be compiler error
			System.out.println("Message from nested static class: " + msg);
		}

		// When a method is declared with final keyword, it is called a final method. A
		// final method cannot be overridden.
		final void m1() {
			System.out.println("This is a final method.");
		}

	}

	// implementation to demonstrate
	// that we can use synchronized with method also
	public synchronized void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread interrupted.");

		}
		System.out.println("\n" + msg + "Sent");

	}

	public static void main(String[] args) throws InterruptedException {
		// calling m1 without creating
		// any object of class Test
		m1();

		Thread.sleep(100);
		
		 // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5)
                break;
  
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
        
        // For loop for iteration
        for (int i = 0; i <= 15; i++) {
  
            // Check condition for continue
            if (i == 10 || i == 12) {
  
                // Using continue statement to skip the
                // execution of loop when i==10 or i==12
                continue;
            }
            // Printing elements to show continue statement
            System.out.print(i + " ");
        }
	}
}
