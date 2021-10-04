package oblig2;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class TabellerEnhetsTester {

		private static int[] tabell1 = { 1, 4, 6 };
		private static int[] tabell2 = { 1 };
		private static int[] tabell3 = {};
		
		@Test
		void testSkrivUt() {
			
			Lab5Tabeller.skrivUt(tabell1);
			Lab5Tabeller.skrivUt(tabell2);
			Lab5Tabeller.skrivUt(tabell3);
			
			
			
		}

		@Test
		void testtilStreng() {

			assertEquals("[1,4,6]", Lab5Tabeller.tilStreng(tabell1));
			assertEquals("[1]", Lab5Tabeller.tilStreng(tabell2));
			assertEquals("[]", Lab5Tabeller.tilStreng(tabell3));
		}
		
		@Test
		void testSummer() {
			assertEquals(11,Lab5Tabeller.summer(tabell1));
			assertEquals(1,Lab5Tabeller.summer(tabell2));
			assertEquals(0,Lab5Tabeller.summer(tabell3));
		}

		@Test
		void testfinnesTall () {
			assertTrue(Lab5Tabeller.finnesTall(tabell1,1));
			assertTrue(Lab5Tabeller.finnesTall(tabell1,4));
			assertTrue(Lab5Tabeller.finnesTall(tabell1,6));
			
			assertFalse(Lab5Tabeller.finnesTall(tabell1,7));
			assertFalse(Lab5Tabeller.finnesTall(tabell3,7));
		}
		
		@Test
		void testposisjonTall () {
			
			assertEquals(0,Lab5Tabeller.posisjonTall(tabell1,1));
			assertEquals(1,Lab5Tabeller.posisjonTall(tabell1,4));
			assertEquals(2,Lab5Tabeller.posisjonTall(tabell1,6));
			
			assertEquals(-1,Lab5Tabeller.posisjonTall(tabell1,7));
			assertEquals(-1,Lab5Tabeller.posisjonTall(tabell3,7));
			
		}
		
		@Test
		void testreverser () {
			
			 int[] tabell = { 6, 4, 1 };
				
			 assertArrayEquals(tabell,Lab5Tabeller.reverser(tabell1));
			 assertArrayEquals(tabell2,Lab5Tabeller.reverser(tabell2));
			 assertArrayEquals(tabell3,Lab5Tabeller.reverser(tabell3));
		}
		
		@Test
		void erSortert () {
			
			int[] tabell = { 6, 4, 1 };
			
			assertTrue(Lab5Tabeller.erSortert(tabell1));
			assertTrue(Lab5Tabeller.erSortert(tabell2));
			assertTrue(Lab5Tabeller.erSortert(tabell3));
			
			assertFalse(Lab5Tabeller.erSortert(tabell));
		}
		
		@Test 
		void testsettSammen () {
			
			int[] tabell = { 1, 1, 4, 6 };
			
			assertArrayEquals(tabell,Lab5Tabeller.settSammen(tabell2,tabell1));
			assertArrayEquals(tabell1,Lab5Tabeller.settSammen(tabell3,tabell1));
			assertArrayEquals(tabell1,Lab5Tabeller.settSammen(tabell1,tabell3));
		}
	}
	

