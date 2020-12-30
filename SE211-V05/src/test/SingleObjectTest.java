package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

import main.SingleObject;

public class SingleObjectTest {

	public SingleObjectTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testDoJMBG() {
		System.out.println("getBrojKartice");

		int brojKartice = 37465825;
		SingleObject object = SingleObject.getInstance();
		int expResult = 37465825;
		int result = object.getKorisnikBrojKartice(brojKartice);
		assertEquals(expResult, result);
		System.out.println("Broj kartice je ispravno unet.");
	}

	@Test
	public void testGetBrojKartice() {
		System.out.println("getBrojKartice");
		int brojKartice = 37465825;
		SingleObject object = SingleObject.getInstance();
		int expResult = 374658225;
		int result = object.getKorisnikBrojKartice(brojKartice);
		assertNotEquals(expResult, result);
		System.out.println("Broj kartice nije ispravno unet.");

	}

}
