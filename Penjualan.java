public class penjualan
{
public static void main (String [] args)
{
	
	int barang[][] = {{6,7,8,9,3},{1,2,9,8,4},{1,2,5,3,0},{4,2,1,4,2}};
	String nama[] = {"Pensil     " , "Buku Tulis " , "Buku Gambar" , "Penggaris  "};
	String hari[] = {"Senin" , "Selasa" , "Rabu" , "Kamis" , "Jumat"};
	int a;
	int b;
	int c;
	int d;	
	int e;
	int ti;
	int th;	
	
	System.out.print("            ");
	for (c = 0 ; c < 5 ; c++)
	{
	System.out.print(" " +hari[c] +"");
	}
	System.out.println(" ");

	for (a = 0 ; a < 4 ; a++)
	{
		System.out.print(nama[a]);
		for (b = 0; b < 5; b++ )
		{
		System.out.print(" |   " +barang[a][b]);
		}
		System.out.println("");
	}
	
	System.out.println(" ");
	System.out.println("Total Penjualan per item : ");
	System.out.println(" ");
	ti = 0;
	for (d = 0 ; d < 4 ; d++)
		{
		for (e = 0 ; e < 5 ; e++)
			{
			ti += barang[d][e];
			}
		System.out.println(nama[d] +" = "+ti);
		ti = 0;
	}
	
	System.out.println(" ");
	System.out.println("Total Penjualan per hari : ");
	System.out.println(" ");
	th = 0;
	for (d = 0 ; d < 5 ; d++)
		{
		for (e = 0 ; e < 4 ; e++)
			{
			th += barang[e][d];
			}
		System.out.println(hari[d] +" = "+th);
		th = 0;
	}
		


}
}
