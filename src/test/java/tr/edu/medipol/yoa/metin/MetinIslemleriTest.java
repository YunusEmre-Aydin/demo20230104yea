package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {

		// GIVEN - ON HAZIRLIK

		String orjinalMetin = "Uc tas hos    hosaf   . . . ";

		// WHEN - ASIL TESTI GRECEKLESTIR

		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);

		// THEN

		assertEquals("Uctashoshosaf...", sonuc);

	}

	@Test
	public void testBosluklariTemizleNull() {

		// GIVEN - ON HAZIRLIK

		String orjinalMetin = null;

		// WHEN - ASIL TESTI GRECEKLESTIR

		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);

		// THEN

		assertEquals("", sonuc);

	}
	@Test
	public void testBosluklariTemizleNew() {

		// GIVEN - ON HAZIRLIK

		MetinIslemleri obje;
		// WHEN - ASIL TESTI GRECEKLESTIR

		obje = new MetinIslemleri();

		// THEN

assertNotNull(obje);
	}
	
	
}
