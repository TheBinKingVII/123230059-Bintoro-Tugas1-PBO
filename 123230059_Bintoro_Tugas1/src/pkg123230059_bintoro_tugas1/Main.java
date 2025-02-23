/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123230059_bintoro_tugas1;

/**
 *
 * @author BINTORO
 */
public class Main {
    public static void main(String[] args) {
        
        Novel novel1 = new Novel("Fate Series 2");
        novel1.dibaca(100);
        
        Majalah majalah1 = new Majalah("PBO");
        majalah1.dibaca(100);
        
        novel1.dibaca(100);
    }
}

interface Activity{
    void dicetak();
    void dibaca(int halaman);
    void ditulis();
} 

abstract class Book {
    String nama;
    int halaman = 0;
    public Book(String inputNama){
        this.nama = inputNama;
    }
    void addHalaman(int inputHalaman){
        halaman += inputHalaman;
    }
 }

class Novel extends Book implements Activity {

    public Novel(String inputNama) {
        super(inputNama);
        
    }

    @Override
    public void dibaca(int halaman) {
        addHalaman(halaman);
        System.out.println("Novel dengan nama " + nama + " sedang di baca sampai halaman " + this.halaman);
    }

    @Override
    public void ditulis() {
        System.out.println("Novel dengan nama " + nama + " sedang di tulis");
    }
    
    @Override
    public void dicetak(){
        System.out.println("Novel dengan nama " + nama + " sedang di cetak");
    }
    
}

class Majalah extends Book implements Activity {

    public Majalah(String inputNama) {
        super(inputNama);
        
    }

    @Override
    public void dibaca(int halaman) {
        addHalaman(halaman);
        System.out.println("Majalah dengan nama " + nama + " sedang di baca sampai halaman " + this.halaman);
    }

    @Override
    public void ditulis() {
        System.out.println("Majalah dengan nama " + nama + " sedang di tulis");
    }
    
    @Override
    public void dicetak(){
        System.out.println("Majalah dengan nama " + nama + " sedang di cetak");
    }
    
}

class Skripsi extends Book implements Activity {

    public Skripsi(String inputNama) {
        super(inputNama);
        
    }

    @Override
    public void dibaca(int halaman) {
        addHalaman(halaman);
        System.out.println("Skripsi dengan nama " + nama + " sedang di baca sampai halaman " + this.halaman);
    }

    @Override
    public void ditulis() {
        System.out.println("Skripsi dengan nama " + nama + " sedang di tulis");
    }
    
    @Override
    public void dicetak(){
        System.out.println("Skripsi dengan nama " + nama + " sedang di cetak");
    }
    
}
