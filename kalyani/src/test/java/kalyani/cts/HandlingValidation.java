package kalyani.cts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		@SuppressWarnings("unused")
		class Handling {
		@Test
		public void test1() {
		String mystr="sumithra";
		Assert.assertTrue(mystr.contains("sumithra"), "Name are matching");
		}
		@Test
		public void test2() {
		String mystr="sumithra";
		Assert.assertTrue(mystr.contains("reji"), "Name are not matching");
		}
		@Test
		public void test3() {
		Assert.assertEquals(12, 13, "Dropdown count does not match plz check with developer");


		}
		@Test
		public void test4() {
		Assert.assertEquals(13, 13, "Dropdown count does not match plz check with developer");


		}
		}

	}

}
