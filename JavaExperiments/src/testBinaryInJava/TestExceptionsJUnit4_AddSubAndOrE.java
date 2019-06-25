package testBinaryInJava;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

import BinaryInJava.AddSubAndOr;

public class TestExceptionsJUnit4_AddSubAndOrE {

	@Test (expected = IllegalArgumentException.class)
	public void SubUsing2sNegativeNumsTest1() {
	    // act
	    AddSubAndOr.subUsing2sComp(-1, -3);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void SubUsing2sNegativeNumsTest2() {
	    // act
	    AddSubAndOr.subUsing2sComp(-1, 5);
	}
	
	
	@Test (expected = IllegalArgumentException.class)
	public void SubUsing2sNegativeNumsTest3() {
	    // act
	    AddSubAndOr.subUsing2sComp(32, -3);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void SubUsing2sTakeBiggerNumFromSmaller() {
	    AddSubAndOr.subUsing2sComp(32, 35);
	}
	
	
/*	this test will fail as no exception is thrown due to correct inputs
 *  therefore method is correct for given inputs
 * @Test (expected = IllegalArgumentException.class)
	public void SubUsing2sNegativeNumsTest101() {
	    // act
	    AddSubAndOr.subUsing2sComp(53, 21);
	}
*/
	
	
}
