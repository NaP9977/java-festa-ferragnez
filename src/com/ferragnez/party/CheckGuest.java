//State lavorando col servizio di sicurezza dei Ferragnez e
// il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla
// lista (in fondo al post)
//Consegna: creare un progetto java-festa-ferragnez con il package com.ferragnez.party,
// a cui aggiungere la classe CheckGuest
//Nel programma bisogna:
//creare e inizializzare l’array contenente i nomi degli invitati
//chiedere all’utente come si chiama
//verificare che il nome sia presente nella lista (:esclamazione:ATTENZIONE: in Java
// per confrontare due stringhe non posso usare ==, ma devo usare il metodo equals(): esempio qui)
//lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole:
//:simbolo_addizione_in_grassetto:Bonus: se avete usato il ciclo for per cercare il nome nella
// lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa
//Buon lavoro e buon weekend! :faccia_leggermente_sorridente:
//:tada: Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax,
// Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis",
                "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};


        for(int i = 0; i < invitati.length; i++) {
            System.out.println("Come ti chiami?");
            String nome = scan.nextLine();
            if (nome.equals(invitati[i])) {
                System.out.println("puoi entrare");
            } else {
                System.out.println("Mi dispiace non sei sulla lista");
            }
        }
    }
}
