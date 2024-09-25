class WrapperExample3{
	public static void main(String[] args){
		byte b = 2;
 		short s = 42;
		int i = 34;
		long l = 40;
		float f = 75.0F;
		double d = 20.0D;
		char c = 'n';
		boolean b2 = false;

		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;

		//Printing objects
		System.out.println("- - -Printing object values- - -");
		System.out.println("Byte object: "+byteobj);
		System.out.println("Integer object: "+intobj);
		System.out.println("Short object: "+shortobj);
		System.out.println("Long object: "+longobj);
		System.out.println("Float object: "+floatobj);
		System.out.println("Double object: "+doubleobj);
		System.out.println("Character object: "+charobj);
		System.out.println("Boolean object: "+boolobj);
	
		//Unboxing: Converting Objects to Primitives
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;
		
		//Printing Primitives
		System.out.println("- - -Printing Primitive values- - -");
		System.out.println("Byte value: "+bytevalue);
		System.out.println("Integer value: "+intvalue);
		System.out.println("Short value: "+shortvalue);
		System.out.println("Long value: "+longvalue);
		System.out.println("Float value: "+floatvalue);
		System.out.println("Double value: "+doublevalue);
		System.out.println("Char value: "+charvalue);
		System.out.println("Boolean value: "+boolvalue);
	}
}