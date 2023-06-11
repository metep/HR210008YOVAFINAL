package tr.edu.medipol;

import java.util.HashMap;
import java.util.Map;

public class SivasOySecim {

    // Oy sayılarını saklamak için bir Map kullanılır.
    private Map<String, Integer> partiler;

    // partiler Map'ini başlatır.
    public SivasOySecim() {
        partiler = new HashMap<>();
    }

    // Partilere ait oy sayısını tutmak için static bir değişken tanımlanır.
    public static int partiAOy = 0;
    public static int partiBOy = 0;
    public static int partiCOy = 0;

    // Belirtilen partiye bir oy ekler.
    public void partiOyArttir(String partiAdi) {
        // İlgili partinin oy sayısını alır, bulunamazsa 0 olarak varsayılır.
        int oy = partiler.getOrDefault(partiAdi, 0);
        // Oy sayısını bir artırarak günceller.
        partiler.put(partiAdi, oy + 1);
    }

    // Belirtilen partiden bir oy çıkarır.
    public void partiOyAzalt(String partiAdi) {
        if (partiler.containsKey(partiAdi)) {
            int oy = partiler.get(partiAdi);
            // Oy sayısı 0'dan büyükse bir azaltarak günceller.
            if (oy > 0) {
                partiler.put(partiAdi, oy - 1);
            }
        } else {
            // Parti bulunamazsa hata fırlatılır.
            throw new IllegalArgumentException("Parti bulunamadı: " + partiAdi);
        }
    }

    // Tüm partilerin oy sayılarını içeren bir Map döndürür.
    public Map<String, Integer> partiOyListele() {
        return partiler;
    }
}
