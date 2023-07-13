package com.ferragnez.party;

import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis",
                "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Come ti chiami?");
        String nome = scan.nextLine();
        boolean seiSullaLista = false;
        int contatore = 0;

        while (contatore < invitati.length && !seiSullaLista) {
            if (nome.equals(invitati[contatore])) {
                seiSullaLista = true;
            }
            contatore++;
        }

        if (seiSullaLista) {
            System.out.println("Puoi entrare.");
        } else {
            System.out.println("Mi dispiace, non sei sulla lista.");
        }

        scan.close();
    }
}