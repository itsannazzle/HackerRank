package oop;

import java.util.Objects;
import java.util.Scanner;

abstract class DataWarga {
    private String nama;
    private String nik;
    private String alamat;
    private String noTelp;
    private String perkerjaan;
    private String alamatKantor;
    private String status;
    private String namaPasangan;
    private int jumlahAnak;

    void dataWarga(String nama, String nik, String alamat,String noTelp){
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    void dataPekerjaan(String pekerjaan, String alamatKantor){
        this.perkerjaan = pekerjaan;
        this.alamatKantor = alamatKantor;
    }

    void dataStatus(String status, String namaPasangan, int jumlahAnak){
        this.status = status;
        this.namaPasangan = namaPasangan;
        this.jumlahAnak = jumlahAnak;
    }

    String getNik(){
        return nik;
    }
    String getNama(){
        return nama;
    }
}

class DataIuran extends DataWarga {
    private int sampah;
    private int keamanan;
    private int sumbangan;

    void iuranPokokdanSekunder(int sampah, int keamanan,int sumbangan){
        this.sampah = sampah;
        this.keamanan = keamanan;
        this.sumbangan = sumbangan;
    }

    int getSampah(){
        return sampah;
    }

    int getKeamanan(){
        return keamanan;
    }

    int getSumbangan(){
        return sumbangan;
    }

    int getTotalIuran(){
        return sampah+keamanan+sumbangan;
    }

    @Override
    String getNik() {
        return super.getNik();
    }

    @Override
    String getNama() {
        return super.getNama();
    }


}

class main{

    static void menu(){
        System.out.println("=====================================\nPendataan dan Pembayaran Iuaran Warga\n=====================================");
        System.out.println("1.Input Data Warga");
        System.out.println("2.Input Iuran Warga");
    }
    static void println(String text){
        System.out.println(text);
    }
    static void print(String text){
        System.out.print(text);
    }
    static Scanner getScanner(){
        return new Scanner(System.in);
    }

    static void showMenu(int selectedMenu){
        DataIuran di = new DataIuran();
        println("---------------------------------------");
        if (selectedMenu == 1){
            println("*** Data Warga ***");
            println("Masukan nama : ");
            String name = getScanner().nextLine();
            println("Masukan NIK :");
            String nik = getScanner().nextLine();
            println("Masukan alamat :");
            String alamat = getScanner().nextLine();
            println("Masukan no Telp :");
            String noTelp = getScanner().nextLine();
            println("----------------------------------------");
            println("*** Data Pekerjaan ***");
            println("Masukan Pekerjaan :");
            String pekerjaan = getScanner().nextLine();
            println("Masukan Alamat Kantor :");
            String alamatKantor = getScanner().nextLine();
            println("----------------------------------------");
            println("*** Data Status ***");
            println("Masukan status :");
            String status = getScanner().nextLine();
            println("Masukan nama suami/istri :");
            String namaPasangan = getScanner().nextLine();
            println("Masukan jumlah anak :");
            int jumlahAnak = getScanner().nextInt();
            di.dataWarga(name,nik,alamat,noTelp);
            println("");
            println("");
            println("Lanjut bayar iuran ? (y/t)");
            String lanjut = getScanner().nextLine();
            if (Objects.equals(lanjut, "y") | Objects.equals(lanjut, "Yes") | Objects.equals(lanjut, "ya")){
                println("----------------------------------------");
                println("*** Data Iuran Pokok ***");
                println("NIK => "+di.getNik());
                println("Masukan iuran sampah :");
                int iuranSampah = getScanner().nextInt();
                println("Masukan iuran keamanan :");
                int iuranKeamanan = getScanner().nextInt();
                println("");
                println("----------------------------------------");
                println("*** Data Iuran Sekunder ***");
                println("Masukan sumbangan :");
                int sumbangan = getScanner().nextInt();
                di.iuranPokokdanSekunder(iuranSampah,iuranKeamanan,sumbangan);
                println("Lanjut bayar iuran ? (y/t)");
                String lanjutBayar = getScanner().nextLine();
                if (Objects.equals(lanjutBayar, "t") | Objects.equals(lanjutBayar, "no") | Objects.equals(lanjut, "tidak")){
                    println("||NIK\t\t\t\t\t\t\t||"+di.getNik());
                    println("||Total pembayaran iuran warga\t\t\t\t\t||"+di.getTotalIuran());
                    System.exit(0);
                } else {
                    println("Pembayaran selsai");
                }
            } else if (Objects.equals(lanjut, "t")){
                println("Iuran belum di bayar");
                System.exit(0);

            } else {
                println("Pembayaran selsai");
            }
        } else {
            println("Pilih 1 dulu");
            menu();
        }
    }

    public static void main(String[] args){
        menu();
        System.out.print("PILIHAN MENU = ");
        getScanner();
        int selecetedMenu = getScanner().nextInt();
        System.out.println(selecetedMenu);
        showMenu(selecetedMenu);
    }
}
