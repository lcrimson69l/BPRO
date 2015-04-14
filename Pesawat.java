import java.util.Scanner;
public class Pesawat
{
public static void main (String [] args)
{
	Scanner i = new Scanner(System.in);
	String duduk[][] = {{"*","*","X","*","X","X"},{"*","X","*","X","*","X"},{"*","*","X","X","*","X"},{"X","*","X","*","X","X"},{"*","X","*","X","*","*"},{"*","X","*","*","*","X"},{"X","*","*","*","X","X"},{"*","X","*","X","X","*"},{"X","*","X","X","*","X"},{"*","X","*","X","X","X"},{"*","*","X","*","X","*"},{"*","*","X","X","*","X"},{"*","*","*","*","X","*"}};
	String baris[] = {"Row 1 ","Row 2 ","Row 3 ","Row 4 ","Row 5 ","Row 6 ","Row 7 ","Row 8 ","Row 9 ","Row 10","Row 11","Row 12","Row 13",};
	String kolom[] = {"1" , "2" , "3" , "4" , "5" , "6"};
	int a;
	int b;
	int c;
	int d;
	int e;
	int bar;
	int kol;
	int col;
	int brs;
	int exit;
	int harga;
	
	exit = (0);
	while (exit == 0)
	{
	System.out.print("          ");
	for (c = 0 ; c < 6 ; c++)
	{
	System.out.print(" " +kolom[c] +"    ");
	}
	System.out.println(" ");

	for (a = 0 ; a < 13 ; a++)
	{
		System.out.print(baris[a]);
		for (b = 0; b < 6; b++ )
		{
		System.out.print(" |   " +duduk[a][b]);
		}
		System.out.println("");
	}
	System.out.println(" ");
	System.out.println("keterangan :");
	System.out.println("* = Tersedia");
	System.out.println("X = Terisi");

	d = 0;
	for (a = 0 ; a < 13 ; a++)
	{
		for (b = 0; b < 6; b++ )
		{
			if (duduk[a][b] == "*")
			{
			d += 1;
			}
		}
	}
	System.out.println(" ");
	System.out.println("Jumlah yang tersedia : " +d);
	System.out.println(" ");
	System.out.println("Kursi yang ingin anda pesan : ");
	System.out.print("Baris (1-13) : ");
	bar = i.nextInt();
	System.out.print("Kolom (1-6) : ");
	kol = i.nextInt();
	col = 0;
	brs = 0;
	switch(kol){
		case (1) :
			col = 0;
			break;
		case (2) :
			col = 1;
			break;
		case (3) :
			col = 2;
			break;
		case (4) :
			col = 3;
			break;
		case (5) :
			col = 4;
			break;
		case (6) :
			col = 5;
			break;}
	switch(bar){
		case (1) :
			brs = 0;
			break;
		case (2) :
			brs = 1;
			break;
		case (3) :
			brs = 2;
			break;
		case (4) :
			brs = 3;
			break;
		case (5) :
			brs = 4;
			break;
		case (6) :
			brs = 5;
			break;
		case (7) :
			brs = 6;
			break;
		case (8) :
			brs = 7;
			break;
		case (9) :
			brs = 8;
			break;
		case (10) :
			brs = 9;
			break;
		case (11) :
			brs = 10;
			break;
		case (12) :
			brs = 11;
			break;
		case (13) :
			brs = 12;
			break;
		}
	harga = 0;
	if((bar >=1) && (bar <=2)){harga = 175;}
	else 
		{
		if ((bar >=3) && (bar <=7)){harga = 150;}
		else { harga = 100;}
		}		
	a = brs;
	b = col;
	
	duduk[a][b] = ("X");
	
	System.out.println("Anda memesan dengan keterangan sebagai berikut : ");
	System.out.println("Baris : " +bar);
	System.out.println("Kolom : " +kol);
	System.out.println("Harga : Rp " +harga +".000");
	System.out.println("exit ? (y = 1/n = 0)");
	exit = i.nextInt();

	}


}
}
