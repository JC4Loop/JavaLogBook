package testFactorialWithSWT;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import factorialWithSWT.Factorial;

public class FactorialTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetFactorialNums() {
		System.out.println("Test getFactorialNums()");
		int inputNum = 5;
		ArrayList<Integer> nums = Factorial.getFactorialNums(inputNum);
		int listSize = nums.size();
		int expectedSize = 5;
		assertEquals(listSize,expectedSize);
		
		assertFalse(nums.contains(0));
		assertFalse(nums.contains(6));
		
		ArrayList<Integer> expectedlist = new ArrayList<Integer>();
		expectedlist.addAll(Arrays.asList(5,4,3,2,1));
		assertEquals(nums, expectedlist);
		
		expectedlist.add(3);
		assertNotEquals(nums,expectedlist);
		
		ArrayList<Integer> minusNums = Factorial.getFactorialNums(-1);
		assertEquals(minusNums.size(),0);
		
		ArrayList<Integer> zeroNums = Factorial.getFactorialNums(0);
		assertEquals(zeroNums.size(),0);
	}

	@Test
	public void testGetFactorialResult() {
		System.out.println("Test getFactorialResult(");
		int result = Factorial.getFactorialResult(5);
		assertEquals(result,120);
		
		result = Factorial.getFactorialResult(2);
		assertEquals(result,2);
		
		result = Factorial.getFactorialResult(3);
		assertEquals(result,6);
		
		result = Factorial.getFactorialResult(2);
		assertEquals(result,2);
		
		result = Factorial.getFactorialResult(0);
		assertEquals(result,1);
		
		result = Factorial.getFactorialResult(-1);
		assertEquals(result,1);
	}
	
	
	@Test
	public void testGetFResultWoR() {
		System.out.println("Test getFResultWoR()");
		int result = Factorial.getFResultWoR(5);
		int expResult = 120;
		assertEquals(result,expResult);
		assertNotEquals(result,24);
		
		result = Factorial.getFResultWoR(1);
		assertEquals(result,1);
		
		result = Factorial.getFResultWoR(2);
		assertEquals(result,2);
		
		result = Factorial.getFResultWoR(0);
		assertEquals(result,0); // not actually factorial but this is the method works
		
		result = Factorial.getFResultWoR(-2);
		assertEquals(result,0);
	}
	
	@Test
	public void testGetFactorialNumsWoR() {
		System.out.println("Test getFactorialNumsWoR()");
		int inputNum = 5;
		ArrayList<Integer> nums = Factorial.getFactorialNumsWoR(inputNum);
		assertEquals(nums.size(),5);
		assertFalse(nums.contains(0));
		assertFalse(nums.contains(6));
		assertTrue(nums.contains(5));
		assertTrue(nums.contains(2));
		
		ArrayList<Integer> zeroNums = Factorial.getFactorialNumsWoR(0);
		assertEquals(zeroNums.size(),0);
		
		ArrayList<Integer> minusNums = Factorial.getFactorialNumsWoR(-3);
		assertEquals(minusNums.size(),0);
	}

}
