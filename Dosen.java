
public class Dosen {
	String nama;
	String mataKuliah;
	int nik;
	
	
	public Dosen(String nama, String mataKuliah, int nik) {
		super();
		this.nama = nama;
		this.mataKuliah = mataKuliah;
		this.nik = nik;
	}
	public int getNik() {
		return nik;
	}
	public void setNik(int nik) {
		this.nik = nik;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getMataKuliah() {
		return mataKuliah;
	}
	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}
	
	
	
}
