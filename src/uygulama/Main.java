package uygulama;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> dersler = new ArrayList<>();

		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		dersler.add("Biyoloji");

		Ogrenci ogrenci1 = new Ogrenci("Hakan", "Erdoðan", 1999, 180301, dersler, "Akdeniz Universitesi");
		Ogrenci ogrenci2 = new Ogrenci("Oðuzhan", "Ak", 2002, 180302, dersler, "Mersin Universitesi");
		Ogrenci ogrenci3 = new Ogrenci("Baki", "Aykan", 1998, 180303, null, null);

		OgrenciIslemleri islemleri = new OgrenciIslemleri();

		islemleri.ogrenciEkle(ogrenci1);
		islemleri.ogrenciEkle(ogrenci2);
		islemleri.ogrenciEkle(ogrenci3);

		System.out.println("---------------------------------------------------");

		islemleri.ogrenciSil(ogrenci3);

		System.out.println();

		islemleri.ogrenciListele();

	}

}
