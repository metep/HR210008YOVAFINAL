package tr.edu.medipol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class SivasOySecimTest {

    private SivasOySecim oySecim;
    
    @Before
    public void setup() {
        oySecim = new SivasOySecim();
    }

    // partiOyArttir() metodunun testi
    @Test
    public void testPartiOyArttir() {
        // Oy sayılarını arttırma işlemi
        oySecim.partiOyArttir("Parti A");
        oySecim.partiOyArttir("Parti B");
        oySecim.partiOyArttir("Parti A");

        // Oy sayılarını kontrol etme
        Map<String, Integer> partiOylari = oySecim.partiOyListele();
        Assert.assertEquals(2, partiOylari.get("Parti A").intValue()); // "Parti A" için 2 oy olmalı
        Assert.assertEquals(1, partiOylari.get("Parti B").intValue()); // "Parti B" için 1 oy olmalı
    }

    // partiOyAzalt() metodunun testi
    @Test
    public void testPartiOyAzalt() {
        // Oy sayılarını arttırma işlemi
        oySecim.partiOyArttir("Parti C");
        oySecim.partiOyArttir("Parti C");
        oySecim.partiOyArttir("Parti C");

        // Oy sayısını azaltma işlemi
        oySecim.partiOyAzalt("Parti C");

        // Oy sayısını kontrol etme
        Map<String, Integer> partiOylari = oySecim.partiOyListele();
        Assert.assertEquals(2, partiOylari.get("Parti C").intValue()); // "Parti C" için 2 oy olmalı
    }

    // partiOyListele() metodunun testi
    @Test
    public void testPartiOyListele() {
        // Oy sayılarını arttırma işlemi
        oySecim.partiOyArttir("Parti A");
        oySecim.partiOyArttir("Parti B");
        oySecim.partiOyArttir("Parti B");

        // Oy sayılarını kontrol etme
        Map<String, Integer> partiOylari = oySecim.partiOyListele();
        Assert.assertEquals(1, partiOylari.get("Parti A").intValue()); // "Parti A" için 1 oy olmalı
        Assert.assertEquals(2, partiOylari.get("Parti B").intValue()); // "Parti B" için 2 oy olmalı
    }
}
