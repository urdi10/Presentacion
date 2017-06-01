package appPrueba;

import org.fest.swing.fixture.FrameFixture;
import org.junit.*;

public class PruebaTest {
	 
	private FrameFixture demo;
	
	@Before
	public void setUp() {
		demo = new FrameFixture(new Prueba());
	}
	
	@After
	public void tearDown() {
		demo.cleanUp();
	}
	
	@Test
	public void test() {
		demo.label("miLabel").requireText("¿En qué asignatura estamos?");
		demo.button("miBoton").click();
		demo.label("miLabel").requireText("Herramientas y Métodos de IS");
	}
}