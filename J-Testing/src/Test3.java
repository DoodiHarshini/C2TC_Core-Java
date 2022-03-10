import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
interface TestLifecycleLogger
{
	@BeforeAll
	default void beforeAll()
	{
		System.out.println("Before all tests");
	}

@AfterAll
default void  afterAll()
{
	System.out.println("AfterallTests");
}
@Test
default  void testmethod()
{
System.out.println("This is Test Method...");	
}
}

