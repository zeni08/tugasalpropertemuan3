import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String namaDepan, namaBelakang, alamat, tempatLahir, tanggalLahir;

        System.out.println();
        System.out.println("\t--------------------------------------------");
        System.out.println("\t\tProgram Biodata Dengan Java");
        System.out.println("\t--------------------------------------------");
        System.out.println();
        System.out.println("\tIsi biodata diri dengan lengkap!");
        System.out.println("\t--------------------------------------------");

        System.out.print("\tNama Depan\t: ");
        namaDepan = scan.nextLine();

        System.out.print("\tNama Belakang\t: ");
        namaBelakang = scan.nextLine();

        System.out.print("\tAlamat Lengkap\t: ");
        alamat = scan.nextLine();

        System.out.print("\tTempat Lahir\t: ");
        tempatLahir = scan.nextLine();
        System.out.print("\tTanggal Lahir\t: ");
        tanggalLahir = scan.nextLine();

        System.out.println();
        System.out.println("\t========================================================================");
        System.out.println("\t\t\t\tBiodataku");
        System.out.println("\t========================================================================");
        System.out.println("\tNama Lengkap\t\t: " + namaDepan + " " + namaBelakang);
        System.out.println("\tAlamat\t\t\t: " + alamat);
        System.out.println("\tTempat/Tanggal Lahir\t: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("\t========================================================================");
    }
}

class Menghitung_luas_lingkaran {
    public static void main(String[] args) {

        // Inisialisasi objek input dari class scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double luas, phi = 3.14;
        int r;

        // Input nilai jari-jari
        System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();

        // Menghitung luas lingkaran
        luas = phi * r * r;

        // Tampilkan hasil
        System.out.println("Luas Lingkaran = " + luas);
    }
}

class Menghitung_luas_persegi_panjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukan Panjang      : ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang : " + luas);
    }
}