package uygulama;

import java.util.ArrayList;

public class OgrenciIslemleri {

	private static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

	public void ogrenciEkle(Ogrenci ogrenci) {

		boolean durum = ogrenciler.add(ogrenci);

		if (durum) {
			System.out.println(ogrenci.getIsim() + " adlý öðrenci baþarýlý bir þekilde listeye eklendi. ");

		} else {
			System.out.println(ogrenci.getIsim() + " adlý öðrenci listeye eklenirken bir hata oluþtu. ");
		}

	}

	public void ogrenciSil(Ogrenci ogrenci) {

		boolean durum = ogrenciler.remove(ogrenci);

		if (durum) {
			System.out.println(ogrenci.getIsim() + " adlý öðrenci baþarýlý bir þekilde listeden silindi. ");

		} else {
			System.out.println(ogrenci.getIsim() + " adlý öðrenci listeden silinirken bir hata oluþtu . ");
		}
	}

	public void ogrenciListele() {

		for (Ogrenci ogrenci : ogrenciler) {

			System.out.println(ogrenci);
		}
	}

}
