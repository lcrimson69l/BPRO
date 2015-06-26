+import java.util.Scanner;
+import java.io.*;
+
+public class PencarianData2{
+
+public static String daftarNim[]={
+"13410100249",
+"14410100044",
+"14410100045",
+"14410100047",
+"14410100048",
+"14410100049",
+"14410100050",
+"14410100052",
+"14410100053",
+"14410100054",
+"14410100055",
+"14410100056",
+"14410100057",
+"14410100059",
+"14410100061",
+"14410100062",
+"14410100063",
+"14410100065",
+"14410100066",
+"14410100067",
+"14410100068",
+"14410100069",
+"14410100070",
+"14410100071",
+"14410100072",
+"14410100073",
+"14410100074",
+"14410100075",
+"14410100076",
+"14410100077",
+"14410100078",
+"14410100079",
+"14410100080",
+"14410100081",
+"14410100082",
+"14410100083"
+};
+public static String []daftarNama = {
+"Sunandar",
+"Nabil Perdana Putra",
+"Septian Agung Wibowo",
+"Alif Muhammad Asshiddiq",
+"Rendy Destara Firmanto",
+"Okta Adygantara",
+"Arda Fikri Saudi",
+"Ghivari Zakaria",
+"Januar Rosydi",
+"Luky Rahman",
+"Nestya  Arum Damayanti",
+"Reinhard Kansai Rumbiak",
+"Komang Maha Saputra",
+"Bagus Irfandi",
+"Al Arif Rahmadika Putra Wicaksono",
+"Mohammad Nurrahman Bahtiar",
+"M. Fakhrizal Setyahadi",
+"Tedy Dwi Indrawan",
+"Galang Cahya Ganggawa",
+"Naufal As'Ad Taufiqurrahman",
+"Ahmad Iqbal Yunus",
+"Ahmad Badruz Zaman",
+"Firmansyah Rizkiawan Nugraha",
+"Dimas Setya Priambodo",
+"Rendra Pratama Putra",
+"Alifand Masrizky Putra Rosid",
+"Lani Nuralita Dian Pertiwi",
+"Arizky Vebby Widardo",
+"Harits Yulianta Pratama",
+"Christophorus Bimo Kurniawan Alpha Roosadi",
+"Wildan Harits Prasetyo",
+"Andri Pratama Putra",
+"Maritha Imelda Estyana Saputri",
+"Siti Sholikah",
+"Iqbal Hudzalfah Zahrani",
+};
+
+
+public static void cariMhs (String[]daftarNim,String []daftarNama,String carinama){
+    int i=0;
+    int indeks = -1;
+    do{
+      if(daftarNama[i].toLowerCase().contains(carinama.toLowerCase()) == true){
+        System.out.println(daftarNim[i]+"\t"+daftarNama[i]);
+      } 
+      i++;
+    }while((i<daftarNim.length-1)&&(indeks == -1));
+  } 
+
+
+
+
+    static int squensial(String []daftarNim,String []daftarNama, String cari){
+    
+   int i=0;
+   int idx=-1;
+   
+   do{
+     
+     if (daftarNim[i]==cari)
+       idx=i;
+     i++;
+     
+   }while ((i<daftarNim.length)&&(idx==-1));
+   
+   return idx;
+
+  }
+
+
+
+
+
+
+
+
+
+
+
+
+  public static void main(String [] args) throws IOException {
+  Scanner scan=new Scanner (System.in);
+   BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
+    String keputusan="Y";
+     while (keputusan.equals("Y")||keputusan.equals("y"))
+        {
+   System.out.println("1. Menampilkan Semua Data Mahasiswa");
+       System.out.println("2. Pencarian Data Mahasiswa Menggunakan NIM");
+       System.out.println("3. Pencarian Data Mahasiswa Menggunakan Filter Nama");
+       System.out.println("4. Keluar");
+       
+       
+       System.out.println("Masukkan Pilihan Anda (1-4)");
+       int masukkan=scan.nextInt();
+       
+       
+   switch (masukkan){
+      case 1:
+        
+       
+        for(int hasil=0; hasil<daftarNim.length-1; hasil++){
+         System.out.println("Nim "+daftarNim[hasil]+" Ada Di Index "+hasil); 
+    System.out.println("Nama "+daftarNama[hasil]+" Ada Di Index "+hasil); 
+    System.out.println();
+      }
+ System.out.print("Kembali (Y)");
+ break;
+      case 2:
+        
+    System.out.println("Masukkan NIM yang Ingin Dicari =");
+     String cari = input.readLine();
+    int hasil=squensial (daftarNim,daftarNama,cari);
+    
+    for(hasil=0; hasil<daftarNim.length; hasil++){
+    if(daftarNim[hasil].equals(cari)){
+       System.out.println("Nim "+cari+" Ada Di Index "+hasil); 
+    System.out.println("Nama "+daftarNama[hasil]+" Ada Di Index "+hasil); 
+    
+    }
+ 
+    }
+System.out.print("Kembali (Y)");
+        break;
+    case 3:    
+ 
+
+    
+ 
+
+      System.out.print("Masukkan nama  : ");
+      String carinama=input.readLine();
+      
+      if(carinama.equalsIgnoreCase("exit")){
+        System.out.print("NIM : " + carinama + " Tidak Ketemu !");
+        
+      }
+      else{
+        cariMhs(daftarNim,daftarNama,carinama);
+      }
+      System.out.print("Kembali (Y)");
+      break;
+      
+      case 4:  
+            System.exit(0);
+        break;
+    }
+      try{
+                keputusan = input.readLine();
+            }catch(IOException e){
+                 System.out.println("Gagal Membaca Keyboard");
+            }
+        
+        
+    }
+         
+        
+        
+   }
+  }
+
+
+  
