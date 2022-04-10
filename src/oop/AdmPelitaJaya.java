package oop;

import java.util.Objects;
import java.util.Scanner;

abstract class ListDataPembayaran{
    private String namaAdmin;
    private String nikAdmin;
    private int totalBayar;

    void hitung(int selectedBayar){
        totalBayar += selectedBayar;
    }

    int getTotalBayar(){
        return totalBayar;
    }

    boolean checkIdAdmin(String idAdmin){
        String idAdmin1 = "admin123";
        return Objects.equals(idAdmin1, idAdmin);
    }

    void println(String text){
        System.out.println(text);
    }

    Scanner getScanner(){
        return new Scanner(System.in);
    }

    abstract int pilihPembayaran();

    abstract int lanjutAtauCancel();


}

interface HitungBayaran {
    void daftarMasuk();
    void semester();
}


class PenerimaanSiswaBaru extends ListDataPembayaran implements HitungBayaran{

    @Override
    void println(String text) {
        super.println(text);
    }

    @Override
    Scanner getScanner() {
        return super.getScanner();
    }

    @Override
    int pilihPembayaran() {
        println("Pilihan anda :");
        int selected = getScanner().nextInt();
        return selected;
    }

    @Override
    int lanjutAtauCancel() {
        println("Bayar == 1 | Batal == 0 :");
        int selected = getScanner().nextInt();
        println("Data Tersimpan");
        return selected;
    }

    void showList(){
        println("*** Pemabayaran Penerimaan Siswa Baru SD Pelita Jaya ***");
        println("----------------------------------------------------------");
        println("||\t Nama Tagihan\t\t||\t Rentang\t\t||\t Harga\t\t||");
        println("||\t 1.Formulir\t\t||\t 1 Kali\t\t||\t Rp.150.000\t\t||");
        println("||\t 2.Pendaftaran\t\t||\t 1 Kali\t\t||\t Rp.2.500.000\t\t||");
        println("||\t 3.Seragam\t\t||\t 1 Paket\t\t||\t Rp.1.500.000\t\t||");
        println("||\t 4.Pengembangan\t\t||\t 1 Kali\t\t||\t Rp.5.500.000\t\t||");
        println("||\t 5.Iuran\t\t||\t 1 Paket\t\t||\t Rp.500.000\t\t||");
        println("----------------------------------------------------------");
    }


    @Override
    public void daftarMasuk() {

    }

    @Override
    public void semester() {

    }
}

class PembayaranSemester extends ListDataPembayaran implements HitungBayaran {

    @Override
    public void daftarMasuk() {

    }

    @Override
    public void semester() {

    }

    @Override
    void println(String text) {
        super.println(text);
    }

    @Override
    Scanner getScanner() {
        return super.getScanner();
    }

    @Override
    int pilihPembayaran() {
        return 0;
    }

    @Override
    int lanjutAtauCancel() {
        return 0;
    }

    void showList(){
        println("*** Pemabayaran Semester Siswa Baru SD Pelita Jaya ***");
        println("----------------------------------------------------------");
        println("||\t Nama Tagihan\t\t||\t Rentang\t\t||\t Harga\t\t||");
        println("||\t 1.SPP\t\t||\t 1 Bulan\t\t||\t Rp.150.000\t\t||");
        println("||\t 2.PTS\t\t||\t 1 Paket\t\t||\t Rp.100.000\t\t||");
        println("||\t 3.PAS\t\t||\t 1 Paket\t\t||\t Rp.120.000\t\t||");
        println("||\t 4.LAB\t\t||\t 1 Matpel\t\t||\t Rp.75.000\t\t||");
        println("||\t 5.ESKUL\t\t||\t 1 Eskul\t\t||\t Rp.75.000\t\t||");
        println("----------------------------------------------------------");
    }
}

class Main{
    static void println(String text){
        System.out.println(text);
    }
    static void print(String text){
        System.out.print(text);
    }
    static Scanner getScanner(){
        return new Scanner(System.in);
    }
    static void pilihTagihan(){
        println("Pilih tagihan pembayaran");
        println("1.Pembayaran PMB");
        println("2.Pembayaran Semester");
    }

    static void dataAdmin(){
        println("Masukan data admin");
        println("========================================");
        println("Nama admin :");
        String nama = getScanner().nextLine();
        println("NIK admin :");
        String nik = getScanner().nextLine();
    }

    public static void main(String[] args){
        PembayaranSemester semester = new PembayaranSemester();
        PenerimaanSiswaBaru pmb = new PenerimaanSiswaBaru();
        println("--- Pembayaran Siswa SD PELITA JAYA ---");
        println("========================================");
        println("Silahkan masukan ID anda");
        println("========================================");
        println("ID :");
        String checkId = getScanner().nextLine();
        if (semester.checkIdAdmin(checkId)){
            pilihTagihan();
            int selectedPayment = getScanner().nextInt();
            if (selectedPayment == 1){
                dataAdmin();
                pmb.showList();
                int selected = getScanner().nextInt();

            } else if (selectedPayment == 2){
                dataAdmin();
                semester.showList();
            } else {
                println("input tidak valid");
                System.exit(0);
            }
        } else {
            println("Id anda salah -> "+checkId);
        }

    }
}
