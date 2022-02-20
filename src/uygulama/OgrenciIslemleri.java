package uygulama;

import java.util.ArrayList;

public class OgrenciIslemleri {

	private static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

	public void ogrenciEkle(Ogrenci ogrenci) {

		boolean durum = ogrenciler.add(ogrenci);

		if (durum) {
			System.out.println(ogrenci.getIsim() + " adl� ��renci ba�ar�l� bir �ekilde listeye eklendi. ");

		} else {
			System.out.println(ogrenci.getIsim() + " adl� ��renci listeye eklenirken bir hata olu�tu. ");
		}

	}

	public void ogrenciSil(Ogrenci ogrenci) {

		boolean durum = ogrenciler.remove(ogrenci);

		if (durum) {
			System.out.println(ogrenci.getIsim() + " adl� ��renci ba�ar�l� bir �ekilde listeden silindi. ");

		} else {
			System.out.println(ogrenci.getIsim() + " adl� ��renci listeden silinirken bir hata olu�tu . ");
		}
	}

	public void ogrenciListele() {

		for (Ogrenci ogrenci : ogrenciler) {

			System.out.println(ogrenci);
		}
	}

}
