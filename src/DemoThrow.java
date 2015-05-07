class Mahasiswa
{
	private String nim;
	private String nama;
	public void setNIM(String intputNIM)
	{
		try{
			nim= intputNIM;
			if(intputNIM == null)
			{
				throw new NullPointerException();
			}
			}
			catch (NullPointerException npe) {
				System.out.println("Kesalahan :"+ "NIM tidak boleh Null");
				
			}
		}
	public String getNIM()
	{
		return nim;
	}
	public void setNama(String inputNama)
	{
		try
		{
			nama = inputNama;
			if (nama == null)
			{
				throw new NullPointerException();
			}
		}catch (NullPointerException npe)
		{
			System.out.println("Kesalahan :"+ "Nama tidak boleh Null");
		}
	}
	public String getNama()
	{
		return nama;
	}	
	}
class DemoThrow
{
	public static void main(String[] args) {
	Mahasiswa mhs = new Mahasiswa();
	mhs.setNIM(null);
	mhs.setNama("Tanti");
	System.out.println("\nNIM :"+mhs.getNIM());
	System.out.println("\nNama :"+mhs.getNama());
}
}