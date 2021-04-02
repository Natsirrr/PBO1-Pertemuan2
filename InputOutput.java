import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  String ttl;
  String sp;
  String gd;

  System.out.println();
  System.out.print("Masukkan Nama Anda : ");
  nama = scanner.nextLine();
  System.out.print("Masukkan Tempat Tanggal Lahir : ");
  ttl = scanner.nextLine();
  System.out.print("Masukkan Status Perkawinan : ");
  sp = scanner.nextLine();
  System.out.print("Masukkan Golongan Darah : ");
  gd = scanner.nextLine();

  System.out.println();
  System.out.println("==================================================");
  System.out.println("Nama : "+nama);
  System.out.println("Tempat Tanggal Lahir : "+ttl);
  System.out.println("Status Perkawinan : "+sp);
  System.out.println("Golongan Darah : "+gd);
  System.out.println("==================================================");
 }
}