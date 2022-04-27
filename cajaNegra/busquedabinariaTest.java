package busquedabinaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class busquedabinariaTest {

	int[] v = new int[100];

	for(int j=0;j<v.length; j++) {

		v[j] = j;

	}

	@Test
	public void test() {
		int r1 = busquedabinaria.buscab(v,3);
		assertEquals(3,r1);
	}

	
	@Test
	public void test2() {
		int r2 = busquedabinaria.buscab(v,200);
		assertEquals(-1 ,r2);
	}
}
