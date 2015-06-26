 import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

public class uas3
 {
 public static Vector<Vector> brg = new Vector<Vector>();
 public static Vector<Vector> cs = new Vector<Vector>();
 public static Vector<Vector> dp = new Vector<Vector>();
  
 public static String [] user = {"admin",
  "ariz",
  "tamu",
  "mhs"};
  
 public static String [] pass = {"admin",
  "ky",
  "pass",
  "mahasiswa"};

 public static void login()
  {
  int nu = 1;
  int kl = -1;
  int u = 0;
  Scanner s = new Scanner(System.in);
  do
   {
   System.out.println("Silahkan Login");
   System.out.println("3x kesempatan login");
   System.out.println("Kesempatan ke-" +nu );
   System.out.print("Username : ");
   String username=s.next();
   System.out.print("Password : ");
   String password=s.next();
   for (u=0;u<user.length;u++)
    {
    if((username.equals(user[u]))&&(password.equals(pass[u])))
     {
     nu=5;
     kl=u;
     garis();
     System.out.println("Selamat datang , " +user[u]);
     }
    }
   nu++;
   }
  while(nu<4);
  if(kl==-1)
   {
   System.out.println();
   System.out.println("Anda Sudah Mencoba 3x kesempatan login.");
   System.exit(0);
   }
  }
  
 public static Vector<Object> addb(String nb,int hj,int hb)
  {
  Vector <Object> barang = new Vector<Object>();
  barang.addElement(nb);
  barang.addElement(hj);
  barang.addElement(String.valueOf(hb));
  return barang;
  }
 
 public static Vector<Object> cetak(String nb,int h,int j,int ht)
  {
  Vector <Object> struk = new Vector<Object>();
  struk.addElement(nb);
  struk.addElement(h);
  struk.addElement(j);
  struk.addElement(ht);
  return struk;
  }
 
 public static Vector<Object> datapen(int kode,String tgl,String bar, int jjj)
  {
  Vector <Object> datap = new Vector<Object>();
  datap.addElement(kode);
  datap.addElement(tgl);
  datap.addElement(bar);
  datap.addElement(jjj);
  return datap;
  }
 
 //dp.addElement(datapen(kd,getTanggal(),(String)brg.elementAt(beli).elementAt(0),jumb))
 
 public static String getTanggal() 
  {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
  }  
 
 public static void garis()
  {
  System.out.println("-------------------------");
  }
  
 public static void garis2()
  {
  System.out.println("=========================");
  }
 
 public static void main(String[]args) throws IOException
  {
  BufferedReader ii = new BufferedReader(new InputStreamReader(System.in));
  Scanner i = new Scanner(System.in);
  Vector<Vector> v = new Vector<Vector>();
  brg.addElement(addb("Chiki",2000,1000));
  brg.addElement(addb("Leo",1500,700));
  brg.addElement(addb("Chitato",4000,2000));
  int jum = brg.size();
  int jml = 0;
  int logout = 0;
  int untung = 0 ;
  int keluar = 0;
  int b = 0;
  String st = "kosong";
  //Date date = new Date();
  
  /**System.out.println("Username : ");
  String usr = i.nextLine();
  System.out.println("Password : ");
  String pss = i.nextLine();*/
  
  
  while(keluar == 0)
   {
   login();
   logout = 0;
   while(logout == 0)
    {
    garis();
    System.out.println("1. Beli Barang");
    System.out.println("2. Tambah Barang");
    System.out.println("3. Hapus Barang");
    System.out.println("4. Cek Data Barang");
    System.out.println("5. Pendapatan");
    System.out.println("6. Edit Data Barang");
    System.out.println("7. Cari Data");
    System.out.println("8. Data Penjualan");
    System.out.println("9. Log Out");
    System.out.println("10. Keluar");
    System.out.print("Masukkan pilihan (1-10) : ");
    int pil = i.nextInt();
    garis();
    switch (pil)
     {
     case 1: //belibarang
      Vector<String> struk = new Vector<String>();
      int lagi = 1;
      String tanggal ="a";
      int kd = 0;
      kd = (int)(Math.random()*10000);
      int t = 0;
      garis();
      System.out.println("      DATA BARANG");
      garis();
      System.out.println();
      for (int a = 0 ; a < jum ; a++)
       {
       System.out.print(a+1 +"  ");
       System.out.print(brg.elementAt(a).elementAt(0) + "\t" +" @Rp " +brg.elementAt(a).elementAt(1));
       System.out.println();
       }
      garis();
      while(lagi == 1)
       {
       System.out.print("Masukkan no barang yang akan dibeli : ");
       int beli = i.nextInt()-1;
       System.out.print("Jumlah : ");
       int jumb = i.nextInt();
       
       int ht = jumb*Integer.valueOf((String) brg.elementAt(beli).elementAt(1));
       
       //struk.addElement((String) brg.elementAt(beli).elementAt(0),(String) brg.elementAt(beli).elementAt(1),ht);
       cs.addElement(cetak((String)brg.elementAt(beli).elementAt(0),Integer.valueOf((String)brg.elementAt(beli).elementAt(1)),jumb,ht));
       
       
       //System.out.println(cs.size());
       System.out.println(brg.elementAt(beli).elementAt(0) +" " +jumb +" buah : " +ht);
       t += ht;
       untung += jumb*(Integer.valueOf((String) brg.elementAt(beli).elementAt(1))-Integer.valueOf((String) brg.elementAt(beli).elementAt(2)));
      
       dp.addElement(datapen(kd,getTanggal(),(String)brg.elementAt(beli).elementAt(0),jumb));
       
       int lg = 0;
       while (lg==0)
        {
        System.out.print("(1=ya 0=tidak)Ingin beli lagi ?");
        lagi = i.nextInt();
        if((lagi == 0) || (lagi==1))
         {
         lg = 1;
         }
        else
         {
         System.out.print("Angka yang anda masukkan salah");
         lg=0;
         }
        }
       }
       garis();
       System.out.println("-------Wildan Shop-------");
       garis();
       
       while( b < cs.size())
        {
        st = (cs.elementAt(b).elementAt(0) +" (" +cs.elementAt(b).elementAt(2) +") " +"\t" +" = " +cs.elementAt(b).elementAt(3));
        //System.out.print(cs.elementAt(b).elementAt(0) +" (" +cs.elementAt(b).elementAt(2) +") " +"\t" +" = " +cs.elementAt(b).elementAt(3));
        System.out.println(cs.elementAt(b).elementAt(0) +" (" +cs.elementAt(b).elementAt(2) +") " +"\t" +" = " +cs.elementAt(b).elementAt(3));
        //System.out.println();
        b++;
        tanggal = getTanggal();
        //double kd = Math.random();
        }
      garis();
      System.out.println("Total " +"\t" +"\t" +" = "+t);
      garis2();

      System.out.println(tanggal);
      System.out.println("Kode Transaksi : "+kd);
      break;
     case 2: //tambahbarang
      System.out.print("Masukkan Jumlah Tambah Barang : ");
      jml = i.nextInt();
      jum += jml;
      for (int a = 0 ; a < jml ; a++)
       {
       System.out.print("Masukkan Nama Barang : ");
       String nb = i.next();
       System.out.print("Masukkan Harga Jual :");
       int hj = i.nextInt();
       System.out.print("Masukkan Harga Beli :");
       int hb = i.nextInt();
      
       brg.addElement(addb(nb,hj,hb));
       //System.out.println(brg.size());
       }
      break;
     case 3: //hapusbarang
      System.out.println("      DATA BARANG");
      garis();
      System.out.println();
      for (int a = 0 ; a < jum ; a++)
       {
       System.out.print(a+1 +"  ");
       System.out.print(brg.elementAt(a).elementAt(0) + "\t" +" @Rp " +brg.elementAt(a).elementAt(1));
       System.out.println();
       }
      garis();
      lagi = 1;
      while (lagi == 1)
       {
       System.out.print("Masukkan no barang yang akan dihapus : ");
       int hapus = i.nextInt()-1;
       jum -= 1;
       brg.removeElementAt(hapus);
       int lg = 0;
       while (lg==0)
        {
        System.out.print("(1=ya 0=tidak)Ingin menghapus lagi ? ");
        lagi = i.nextInt();
        if((lagi == 0) || (lagi==1))
         {
         lg = 1;
         }
        else
         {
         System.out.print("Angka yang anda masukkan salah");
         lg=0;
         }
        }
       }
      break;
     case 4: //cekdata
      garis();
      System.out.println("      DATA BARANG");
      garis();
      System.out.print("No");
      System.out.print("Nama Barang" +"\t");
      System.out.print("Harga Jual" +"\t");
      System.out.println("Harga Beli");
      
      for (int a = 0 ; a < jum ; a++)
       {
       System.out.print(a+1 +"  ");
       for (b = 0 ; b < brg.elementAt(a).size() ; b++)
        {
        
       System.out.print(brg.elementAt(a).elementAt(b) + "\t" + "\t");
       //System.out.print();
        
        }
       System.out.println();
       }
      System.out.println();
      /**System.out.println("hj = Harga Jual");
      System.out.println("hb = Harga Beli");
      System.out.println();*/
      System.out.print("Tekan enter untuk kembali");
      ii.readLine();
      break;
     case 5: //omset
      garis();
      System.out.println("Laba bersih : Rp " +untung);
      garis();
      break;
     case 6: //editdata
      System.out.println("      DATA BARANG");
      garis();
      System.out.println();
      for (int a = 0 ; a < jum ; a++)
       {
       System.out.print(a+1 +"  ");
       System.out.print(brg.elementAt(a).elementAt(0) + "\t" +" @Rp " +brg.elementAt(a).elementAt(1));
       System.out.println();
       }
      garis();
      System.out.print("Masukkan no barang yang akan diedit :");
      int nbb = i.nextInt();
      System.out.print("Masukkan harga jual baru :");
      int hjb = i.nextInt();
      System.out.print("Masukkan harga beli beru :");
      int hbb = i.nextInt();
      
      String sbb = (String)brg.elementAt(nbb-1).elementAt(0);
      brg.setElementAt(addb(sbb,hjb,hbb),nbb-1);
      
      break;
     case 7: //caridata
      System.out.print("Masukkan Nama Barang: ");
      String cari = "a";
      cari = i.next();
      
      //(String)brg.elementAt().elementAt(0);
      int in=0;
      int z = 0;
      System.out.println("Hasil : ");
      do
       {
       String con = (String)brg.elementAt(in).elementAt(0);
       if(con.toLowerCase().contains(cari.toLowerCase()) == true)
        {
        System.out.println((String)brg.elementAt(in).elementAt(0) + " @" +(String)brg.elementAt(in).elementAt(1));
        z = 1;
        }
       in++;
       }
      while(in<brg.size());
      if(z==0)
       {
       System.out.println("Data tidak ketemu !");
       }
      break;
     case 8: //datapenjualan
      //for(int f=0 ; f<2;f++)
      if (st.equals("kosong"))
       {
       System.out.println("Tidak ada data penjualan");
       }
      else
       {
       System.out.println("Histori Belanja");
       garis();
       for(int f=0 ; f<dp.size();f++)
        {
        garis();
        System.out.println("Kode Transaksi : " +dp.elementAt(f).elementAt(0));
        System.out.println("Waktu : "+dp.elementAt(f).elementAt(1));
        System.out.println("Barang : "+dp.elementAt(f).elementAt(2));
        System.out.println("Jumlah : " +dp.elementAt(f).elementAt(3));
        }
       }
      break;
     case 9: //logout
      logout = 1;
      break;
     case 10: //keluar
      logout = 1;
      keluar = 1;
      break;
     }
    }
   }
  }
 }
