import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestChange {
	private int input;
	private boolean expected;
	private Change chan = null;
	
	public TestChange(int input,boolean expected) {
		this.input = input;
		this.expected = expected;
	}
	
	@Before 
	public void setUp() {
		chan = new Change();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{1,true},
			{3,true},
			{4,false},
			{5,true},
			{8,true},
			{9,false},
			{15,false},
			{84,false},
			{51,true},
			{20,true},
			{24,false},
			{73,true},
			{42,false}
		});
	}
		@Test
		public void testAdd() {
			assertEquals(this.expected,Change.canTakeOut(input));
		}
}

