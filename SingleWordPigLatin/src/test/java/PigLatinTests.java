/**
 * Created by locle on 3/14/16.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PigLatinTests {

        private PigLatin p;

        @Before
        public void setUp() throws Exception {
            p = new PigLatin();

        }

        @Test
        public void testMap() {
            assertEquals("apmay", p.translate("map"));
        }

        @Test
        public void testegg() {
            assertEquals("eggway", p.translate("egg"));
        }

        @Test
        public void testspaghetti() {
            assertEquals("aghettispay", p.translate("spaghetti"));
        }

        @Test
        public void testNoVowels() {
            assertEquals("kjhgfay", p.translate("kjhgf"));
        }

        @Test
        public void testCapitalLetters() {
            assertEquals("aghettispay", p.translate("spaGHEtti"));
        }

        @Test
        public void testNonAlpha() {
            assertNull(p.translate("spaghetti!"));
        }
}
