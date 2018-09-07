
public class Mahasiswa {
	String Nama;
	String npm;
	String gender;
	int tglLahir;
		
	public Mahasiswa(String nama, String npm, String gender, int tglLahir) {
		super();
		Nama = nama;
		this.npm = npm;
		this.gender = gender;
		this.tglLahir = tglLahir;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTglLahir() {
		return tglLahir;
	}
	public void setTglLahir(int tglLahir) {
		this.tglLahir = tglLahir;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String nama) {
		Nama = nama;
	}
	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	
}
