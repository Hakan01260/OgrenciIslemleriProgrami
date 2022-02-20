package uygulama;

import java.util.ArrayList;

public class Ogrenci {

	private String isim;

	private String soyisim;

	private int dogumYili;

	private int okulNumarasi;

	private ArrayList<String> dersler;

	private String okul;

	public Ogrenci(String isim, String soyisim, int dogumYili, int okulNumarasi, ArrayList<String> dersler,
			String okul) {

		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
		this.dersler = dersler;
		this.okul = okul;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public int getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(int okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	public ArrayList<String> getDersler() {
		return dersler;
	}

	public void setDersler(ArrayList<String> dersler) {
		this.dersler = dersler;
	}

	public String getOkul() {
		return okul;
	}

	public void setOkul(String okul) {
		this.okul = okul;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", soyisim=" + soyisim + ", dogumYili=" + dogumYili + ", okulNumarasi="
				+ okulNumarasi + ", okul=" + okul + ", dersler=" + dersler + "]";
	}

}