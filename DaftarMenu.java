import java.util.Scanner;
public class DaftarMenu

{
	public static void main(String [] args)
{
	Scanner i = new Scanner (System.in);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int h;
		int t;
		int total;
		
		e = 1;
		total = 0;
		h=0;
		f=0;
		while (e == 1) 
		
		{
		
	
			System.out.println ("=============================");
			System.out.println ("Daftar Menu Makanan & Minuman");
			System.out.println ("=============================");
			System.out.println ("1. Soto Ayam	= Rp 7000");
			System.out.println ("2. Nasi Rawon	= Rp 8000");
			System.out.println ("3. Nasi Campur	= Rp 7500");
			System.out.println ("4. Es Teh	= Rp 2000");
			System.out.println ("5. Es Jeruk	= Rp 3000");
			System.out.println ("=============================");	
			System.out.print ("Masukkan Nomor ( 1 - 5 ) Untuk Memilih Pesanan = ");
	
	a = i.nextInt();
		if ((a < 6) && (a > 0))
		
		{
			switch(a)
			{
				case 1:
					System.out.print("Jumlah yang ingin di pesan : ");
					b = i.nextInt();
					c = 7000;
					h = b * c;
					break;
				case 2:
					System.out.print("Jumlah yang ingin di pesan : ");
					b = i.nextInt();
					c = 8000;
					h = b * c;
					break;
				case 3:
					System.out.print("Jumlah yang ingin di pesan : ");
					b = i.nextInt();
					c = 7500;
					h = b * c;
					break;
				case 4:
					System.out.print("Jumlah yang ingin di pesan : ");
					b = i.nextInt();
					c = 2000;
					h = b * c;
					break;
				case 5:
					System.out.print("Jumlah yang ingin di pesan : ");
					b = i.nextInt();
					c = 3000;
					h = b * c;
					break;
			}
		
		System.out.print("Harga total = ");
		total += h; 
		System.out.println(total);
		System.out.println("Anda ingin menambah pesanan ?");
		System.out.print("Masukkan 0 = Tidak atau 1 = Ya : ");
		
		d = i.nextInt();
		if ( d == 1 )
			{
			e = 1;
			}
		else 
			{
			e = 0;
			f = 1;
			}
		}
		else 
		{
		System.out.println("Angka yang anda masukkan salah");
		e = 0;
		}
		if (f == 1){ 
		System.out.println("=======================");
		System.out.println("Pesanan segera diproses");
		System.out.println("Total Harga = " +total);}
	

}	
	
	
	}
}
