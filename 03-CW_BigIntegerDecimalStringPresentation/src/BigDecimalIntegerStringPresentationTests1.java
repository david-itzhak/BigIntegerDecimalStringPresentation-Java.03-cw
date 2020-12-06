import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class BigDecimalIntegerStringPresentationTests1 {

//	@Test
//	void test() {
//		char a = 'T';
//		int d =10;
//		int c = -d;
//		System.out.println((int)a);
//	}
//	@Test
//	void bigInteger() {
//		BigInteger bi123 = new BigInteger("123");
//		BigInteger bi20 = new BigInteger("20");
//		String str123 = new String("123");
//		String str20 = new String("20");
//		System.out.println(bi123.add(bi20));
//		System.out.println(str123 + str20);
//	}
//	@Test
//	void bigDecimal() {
//		BigDecimal bd1 = BigDecimal.valueOf(314, 2);
//		BigDecimal bd2 = new BigDecimal(new BigInteger("314"), 2);
//		assertEquals(bd1, bd2);
//		double d1 = 3.14;
//		System.out.println(bd1.multiply(BigDecimal.valueOf(257,2)));
//		System.out.println(d1 * 2.57
//				);
//	}
	
	@Test
	void test() {
		char a = 65;
		System.out.println(a);
	}
	
	@Test
	void stringPresentation() {
		int a = 2567807;
		int b = 2567807;
		assertEquals(a, b);
		String strA = Integer.toString(a, 16);
		String strB = Integer.toString(b, 8);
		//assertEquals(strA, strB);
		System.out.println(strA);
		System.out.println(strB);
	}
	

}
