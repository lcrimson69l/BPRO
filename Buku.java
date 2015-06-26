import java.io.*;
public class Buku {
  
 
  
  public static void cetak () throws IOException{

    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    int j=0;
    int h=0;
    int k=100;
   
     System.out.println("Ingin Menampilkan Beberapa BAB   =");
       int scan = Integer.parseInt (input.readLine());

   for (int i=1; i<=scan; i++){

      
       
       System.out.println();
       System.out.println("Judul BAB "+i);
    String judul = input.readLine();
    System.out.println("Halaman BAB "+i+" ");
  int halaman = Integer.parseInt (input.readLine());
         
     j=4+judul.length();
      h=halaman;
     
     
           System.out.print("BAB "+i+":"+judul);
     k=k-j;
     for (int p=0; p<k;p++){
    System.out.print(".");
     
     }
     System.out.print(h);
     k=100;
   }
 
  
  public static void main(String []args) throws IOException{
 
   
    cetak();
  

   
    
  }
}

