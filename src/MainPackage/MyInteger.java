package MainPackage;


public class MyInteger {

	// Creates value as an int
	private int Value;

	// get method
	public int getValue() {
		return Value;}

	// This creates the constructor:
	private void setValue(int Value) {
		this.Value = Value;
	}
	public MyInteger(int Value) {
		setValue(Value);}

	
	
	// Creates an instance of IsEven
	public boolean isEven() 
	{if (this.getValue() % 2 == 0) {
			return true;} 
	else {return false;}
	}

	// Creates an instance of isOdd
	public boolean isOdd() {
		if (this.getValue() % 2 == 1) {
			return true;} 
		else {
			return false;}
	}

	// Creates an instance of isPrime
	public boolean isPrime() {
		boolean testPrime = true;
		for (int dividor = 2; dividor <= this.getValue() / 2; dividor++) {
			if (this.getValue() % dividor == 0) 
			{testPrime = false;}
		}
		return testPrime;
	}

	// Tests an int for even or not
	public static boolean isEven(int Value) 
	{if (Value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Tests int to see if odd
	public static boolean isOdd(int Value) {
		if (Value % 2 != 0) 
		{return true;} 
		else {
			return false;}
	}

	// test an int for prime
	public static boolean isPrime(int Value) {
		boolean testPrime = true;
		for (int divisor = 2; divisor <= Value / 2; divisor++) {
			if (Value % divisor == 0) {
				testPrime = false;}
		}
		return testPrime;}

	// tests static for MyInteger for isEven
	public static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;} 
		else {return false;}
	}

	// test static for my integer for isOdd
	public static boolean isOdd(MyInteger myInt) {
		if (myInt.getValue() % 2 != 0) {
			return true;} 
		else {
			return false;}
	}

	// test static MyInteger for prime
	public static boolean isPrime(MyInteger myInt) {
		boolean testPrime = true;
		for (int divisor = 2; divisor <= myInt.getValue() / 2; divisor++) {
			if (myInt.getValue() % divisor == 0) 
			{testPrime = false;}
		}
		return testPrime;
	}

	// test int for equal
	public boolean equals(int Value) {
		if (Value == this.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	// test MyInteger for equals
	public boolean equals(MyInteger myInt) {
		return equals(myInt.getValue());
	}

	// converts static string to int 
	public static int parseInt(String someString) {
		return Integer.parseInt(someString);}

	// converts static array to ints
	public static int parseInt(char[] someArray) {
		return parseInt(new String(someArray));}

}

	
