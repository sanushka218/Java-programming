
public class mathDemo {

	public static void main(String[] args) {

       System.out.print("absolute:");
       System.out.println(Math.abs(-123));
       
       System.out.println("Strict math:"+StrictMath.abs(-126));
       
       System.out.print("cube root");
       System.out.println(Math.cbrt(27));
       
       System.out.print("Excat decrement");
       System.out.println(Math.decrementExact(7));
       //this make sure the decrement is perfect i.e. no underflow otherwise it throw an exception
       //prevent underflow
       
       System.out.print("Exponent in floating point rep:");
       System.out.println(Math.getExponent(18.345));
       
       System.out.print("Round divison");
       System.out.println(Math.floorDiv(25, 3));
       
       System.out.print("e power x:");
       System.out.println(Math.exp(1));

       System.out.print("log base 10:");
       System.out.println(Math.log10(100));
       
       System.out.print("Tan:");
       System.out.println(Math.tan(45*Math.PI/180));
       
       System.out.print("convert to radian:");
       System.out.println(Math.toRadians(90));
       
       System.out.print("convert to degree:");
       System.out.println(Math.toDegrees(Math.atan(1)));
       
       System.out.print("Convert to degree:");
       System.out.println(Math.toDegrees(StrictMath.tanh(1)));

       System.out.print("random:");
       System.out.println(Math.random());
       
       System.out.print("Power:");
       System.out.println(Math.pow(2, 3));
       
       System.out.print("Excat product:");
       System.out.println(Math.multiplyExact(100, 200));
       //throws exception if result overflows
       
       System.out.print("Next float value:");
       System.out.println(Math.nextAfter(12.3, 11));


























		
	}

}
