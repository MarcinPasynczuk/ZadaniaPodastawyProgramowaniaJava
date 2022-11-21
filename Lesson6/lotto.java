//Program ma za zadanie wczytac 6 liczb calkowitych z zakresu 1-49
//Program ma wylosowac 6 liczb z zakresu od 1 do 49
//Program ma sprawdzic ile z podanych liczb pokrywa sie z wylosowanymi liczbami
//Program ma wypisac podane i wylosowane przez uzytkownika liczby
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Metody {
    public static void main(String[] cmdline) {
        int[] podaneLiczby=new int[6];
        int[] wylosowaneLiczby=new int[6];
        System.out.println("Program wczytuje i losuje 6 liczb oraz wypisuje ile z nich sie pokrywa");
        System.out.print("Podaj 6 liczb z zakresu od 1 do 49:");
        wczytajLiczby(podaneLiczby);
        System.out.println("Program losuje liczby.");
        losujLiczby(wylosowaneLiczby);
        System.out.println("Trafiles "+ ileWspolnych(podaneLiczby,wylosowaneLiczby)+ "liczb");
        System.out.println("Wylosowane liczby to:");
        wypiszTablice(wylosowaneLiczby);
        System.out.println("Podane liczby to:");
        wypiszTablice(podaneLiczby);
    }
    public static void losujLiczby(int[] arr) {
        Random losuj=new Random();
        int ile=0,l;
        while (ile<6) {
            l = losuj.nextInt(49)+1;
            boolean czyWystepuje = false;
            for (int i = 0; i < ile; i++) {
                if (arr[i] == l) {
                    czyWystepuje = true;
                }
            }
            if (czyWystepuje) continue;
            arr[ile] = l;
            ile++;
        }

    }
    public static void wczytajLiczby(int[] arr) {
        Scanner czytaj=new Scanner(System.in);
        int ile=0,l;
        while (ile<6) {
            l = czytaj.nextInt();
            if (l < 1 || l > 49) {
                continue;
            }
            boolean czyWystepuje = false;
            for (int i = 0; i < ile; i++) {
                if (arr[i] == l) {
                    czyWystepuje = true;
                }
            }
            if (czyWystepuje) continue;
            arr[ile] = l;
            ile++;
        }
    }
    public static void wypiszTablice(int[] arr) {
        for (int j =0;j<6;j++){
        System.out.print(arr[j] + " ");
    }
        System.out.println();
    }
    public static int ileWspolnych(int[] arr1, int[] arr2) {
        int checker = 0;
        for (int i = 0; i<6;i++){

            for (int j = 0; j<6;j++){
                if (arr1[i] == arr2[j]){
                    checker++;
                }
            }

        }

        return checker;

