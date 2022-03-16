package Tugas_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Generic<Pegawai> linkedList = new Generic<Pegawai>();

        String nip, nama, divisi;

        System.out.println("Pilihan Menu :");
        System.out.println("1. Input Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cetak List Pegawai");
        System.out.println("4. Keluar");

        int masukan = input.nextInt();
        int masukan2;
        int program = 1;

        while (program != 0) {
            if (masukan != 4) {
                if (masukan == 1) {
                    nip = input.next();
                    nama = input.next();
                    divisi = input.next();

                    System.out.println("diawal = 1, diakhir = 2");
                    masukan2 = input.nextInt();
                    if (masukan2 == 1) {
                        linkedList.insertAtFront(new Pegawai(nip, nama, divisi));
                    } else {
                        linkedList.insertAtBack(new Pegawai(nip, nama, divisi));
                    }
                }
                if (masukan == 2) {
                    System.out.println("diawal = 1, diakhir = 2");
                    masukan2 = input.nextInt();
                    if (masukan2 == 1) {
                        linkedList.removeFromFront();
                    } else {
                        linkedList.removeFromBack();
                    }
                } else {
                    linkedList.print();
                }
                System.out.println();
                System.out.println("Pilihan Menu :");
                System.out.println("1. Input Data");
                System.out.println("2. Hapus Data");
                System.out.println("3. Cetak List Pegawai");
                System.out.println("4. Keluar");

                masukan = input.nextInt();
            } else {
                System.out.println("Program Berhenti");
                program = 0;
            }
        }
    }
}
