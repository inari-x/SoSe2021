package aufgaben.aufgabe2_nochmal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class MyIntegerTest {
	
	 static MyInteger mi1, mi2, mi3, mi4, mi5, mi6, mi7;

	    @BeforeAll
	    public static void setUpBeforeClass() throws Exception 
	    {
	        mi1 = new MyInteger("-2147483648");
	        mi2 = new MyInteger("+2147483647");
	        mi3 = new MyInteger(-1);
	        mi4 = new MyInteger(1);
	        mi5 = new MyInteger(0);
	        mi6 = new MyInteger("-1");
	        mi7 = new MyInteger(2147483647);

	    }

	    @Test
	    void testHashCode()
	    {
	        assertTrue(mi2.hashCode()==mi7.hashCode(), " hashCode of mi2 and mi7 should be equal");
	        assertEquals(-2147483648, mi1.hashCode(), "hashCode of mi1 should be -2147483648");
	        assertEquals(0, mi5.hashCode(), "hashCode of mi5 should be 0");
	    }

	    @Test
	    void testMyIntegerInt()
	    {
	        assertNotNull(mi4, "mi4 should be not null");
	        assertTrue(mi3.equals(mi6), "mi3 and mi6 should be equal");
	        assertTrue(mi7.equals(mi2), "mi7 and mi2 should be equal");
	    }

	    @Test
	    void testMyIntegerString()
	    {
	        assertNotNull(mi1, "mi1 should be not null");
	        assertNotNull(mi2, "mi2 should be not null");
	        assertNotNull(mi6, "mi6 should be not null");
	        assertTrue(mi3.equals(mi6), "mi3 and mi6 should be equal");
	        assertTrue(mi7.equals(mi2), "mi7 and mi2 should be equal");
	    }

	    @Test
	    void testParseInt()
	    {
	        assertEquals(-2147483648, MyInteger.parseInt("-2147483648"), "should be -2147483648");
	        assertEquals(+2147483647, MyInteger.parseInt("+00002147483647"), "should be +2147483647");
	        assertEquals(-1, MyInteger.parseInt("-0000001"), "should be -1");   
	    }


	    @Test
	    void testIntValue()
	    {
	        assertEquals(-2147483648, mi1.intValue(), "should be -2147483648");
	        assertEquals(+2147483647, mi2.intValue(), "should be +2147483647");
	        assertEquals(+2147483647, mi7.intValue(), "should be +2147483647");
	    }

	    @Test
	    void testDoubleValue()
	    {
	        assertEquals(-2147483648.0, mi1.doubleValue(), "should be -2147483648.0");
	        assertEquals(+2147483647.0, mi2.doubleValue(), "should be +2147483647.0");
	        assertEquals(+2147483647.0, mi7.doubleValue(), "should be +2147483647.0");
	    }

	    @Test
	    void testValueOfString()
	    {
	        assertTrue(mi1.equals(MyInteger.valueOf("-2147483648")), "should be equal to mi1");
	        assertTrue(mi2.equals(MyInteger.valueOf("2147483647")), "should be equal to mi2");
	        assertTrue(mi7.equals(MyInteger.valueOf("2147483647")), "should be equal to mi7");
	    }

	    @Test
	    void testValueOfInt()
	    {
	        assertTrue(mi1.equals(MyInteger.valueOf(-2147483648)), "should be equal to mi1");
	        assertTrue(mi2.equals(MyInteger.valueOf(2147483647)), "should be equal to mi2");
	        assertTrue(mi7.equals(MyInteger.valueOf(2147483647)), "should be equal to mi7");
	    }

	    @Test
	    void testEqualsObject()
	    {
	        assertTrue(mi3.equals(mi6), "mi3 and mi6 should be equal");
	        assertTrue(mi7.equals(mi2), "mi7 and mi2 should be equal");
	        assertFalse(mi3.equals(mi4), "mi3 and mi4 should not be equal");
	        assertFalse(mi3.equals(mi5), "mi3 and mi5 should not be equal");
	    }

	    @Test
	    void testToString()
	    {
	        assertEquals("-2147483648", mi1.toString(), "should be '-2147483648'");
	        assertEquals("2147483647", mi2.toString(), "should be '2147483647' mi2");
	        assertEquals("2147483647", mi7.toString(), "should be '2147483647' mi7");
	    }

	    @Test
	    void testCompare()
	    {
	        assertTrue(MyInteger.compare(5, 4)>0, "5,4 should be > 0");
	        assertTrue(MyInteger.compare(4, 4)==0, "4,4 should be == 0");
	        assertTrue(MyInteger.compare(4, 5)<0, "4,5 should be < 0");
	        assertTrue(MyInteger.compare(MyInteger.MAX_VALUE, MyInteger.MIN_VALUE)>0, "MAX,MIN should be > 0");
	        assertTrue(MyInteger.compare(MyInteger.MAX_VALUE, MyInteger.MAX_VALUE)==0, "MAX,MAX should be == 0");
	        assertTrue(MyInteger.compare(MyInteger.MIN_VALUE, MyInteger.MAX_VALUE)<0, "MIN,MAX should be > 0");
	    }

	    @Test
	    void testCompareTo()
	    {
	        assertTrue(mi1.compareTo(mi2)<0, "mi1, mi2 should be < 0");
	        assertTrue(mi2.compareTo(mi1)>0, "mi2, mi1 should be > 0");
	        assertTrue(mi2.compareTo(mi7)==0, "mi2, mi7 should be == 0");
	        assertTrue(mi3.compareTo(mi6)==0, "mi3, mi6 should be == 0");
	    }

}
