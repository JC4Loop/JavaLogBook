package testBinaryInJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BinaryInJava.AddSubAndOr;

class TestAddSubAndOr {

	@Test
	void testAddWithoutPlus() {
		int expectedResult = 23;
		int result = AddSubAndOr.addWithoutPlus(21, 2);
		assertEquals(result,expectedResult);
		
		expectedResult = 10;
		result = AddSubAndOr.addWithoutPlus(2,8);
		assertEquals(result,expectedResult);
		
		expectedResult = 54;
		result = AddSubAndOr.addWithoutPlus(39,15);
		assertEquals(result,expectedResult);
	}
	
	@Test
	void testSubUsing2sComp() {
		int expectedResult = 25;
		int result = AddSubAndOr.subUsing2sComp(51, 26);
		assertEquals(result,expectedResult);
		
		expectedResult = 5;
		result = AddSubAndOr.subUsing2sComp(8, 3);
		assertEquals(result,expectedResult);
		
		expectedResult = 1001;
		result = AddSubAndOr.subUsing2sComp(10000, 8999);
		assertEquals(result,expectedResult);
		
		expectedResult = 1001;
		result = AddSubAndOr.subUsing2sComp(10000, 8999);
		assertEquals(result,expectedResult);
		
		expectedResult = 10;
		result = AddSubAndOr.subUsing2sComp(100000, 99990);
		assertEquals(result,expectedResult);
	}

}
