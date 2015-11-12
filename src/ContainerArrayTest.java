import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContainerArrayTest {
	private ContainerArray<String> myContainer = null;

	@Before
	public void setUp() {
		myContainer = new ContainerArray<>();
	}

	@Test
	public void testSizeChangeWithAdd() {
		/*
		 * myContainer.add("Alligator"); myContainer.add("Bear");
		 * myContainer.add("Camel");
		 */

		assertEquals("Size should be 3", 0, myContainer.size());
	}

	@Test
	public void testAddAlot() {
		for(int i = 0 ; i < 11; i++){
			myContainer.add("s");

		}
		assertEquals("Size should be 11", 11, myContainer.size());


	}

	@Test
	public void testObjectIsStored() {
		String alligator = "Alligator";
		myContainer.add(alligator);
		assertEquals("Should be same reference", alligator, myContainer.get(0));
	}

	@Test
	public void testSizeChangeWithRemove() {
		myContainer.add("Alligator");
		myContainer.add("Bear");
		myContainer.remove("Alligator");
		assertEquals("Size should be 1", 1, myContainer.size());
	}




	@Test
	public void testObjectIsRemoved() {
		String alligator = "Alligator";
		myContainer.add("Alligator");
		myContainer.add("Bear");
		myContainer.remove("Bear");
		assertEquals("Should be same reference", alligator, myContainer.get(0));
	}
}
