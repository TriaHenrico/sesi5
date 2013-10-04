import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerpustakaanMain {
	public static void main(String[] args) {
	 File file = new File ("D:/TriaJava/perpustakaan.txt");
	 FileInputStream fis = null;
	 BufferedInputStream bis = null;
	 DataInputStream dis = null;
	 List<Perpustakaan> listPerpustakaan = new ArrayList <Perpustakaan>();
	 
	 try {
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
		
		while(dis.available() !=0){
			// memecah teks perbaris menjadi beberapa kolom sesuai pemisah koma
			String line = dis.readLine();
			String[] data = line.split(",");
			
			Perpustakaan p = new Perpustakaan();
			p.setId(data[0]);
			p.setPeminjam(data[1]);
			p.setJudul(data[2]);
			
			listPerpustakaan.add(p);
		}
		
		
	} catch (IOException ex) {
		System.out.println("File " + file.getName() + " tidak ditemukan!");
	}
	
			for (Perpustakaan perpus : listPerpustakaan) {
				System.out.println("=================================");
				System.out.println("ID : " + perpus.getId());
				System.out.println("Penyewa : " + perpus.getPeminjam());
				System.out.println("Judul : " + perpus.getJudul());
				}
				}
}

