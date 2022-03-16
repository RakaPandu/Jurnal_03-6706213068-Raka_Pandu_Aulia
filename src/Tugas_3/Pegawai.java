package Tugas_3;

public class Pegawai {
String nip, nama, divisi;

public Pegawai(String nip, String nama, String divisi){
    this.nip = nip;
    this.nama = nama;
    this.divisi = divisi;
}
    public String getNip() {
        return nip;
    }

    @Override
    public String toString(){
        return "Pegawai {NIP='"+ nip +"', Nama='"+ nama +"', Divisi='"+ divisi +"'} ";
    }
}
