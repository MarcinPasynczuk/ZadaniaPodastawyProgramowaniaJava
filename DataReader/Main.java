import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Country> countries = countriesToArray();
        ArrayList<String> indexes = new ArrayList<>();
        int Africa = 0;
        int Asia = 0;
        int Europe = 0;
        int NorthAmerica = 0;
        int Oceania = 0;
        int SouthAmerica = 0;
        int numOfDanishOrganizations = 0;
        int numOfOrganizationsWithNetWebsite = 0;
        int numOfOrganizationsFoundedBefore1980 = 0;
        int sumOfEmployeesInDanishOrganizations = 0;
        int sumOfEmployeesInOrganizationsFoundedBefore1980 = 0;

        String fileName = "organizations-1000.csv";
        List<Organization> organizations = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
//                System.out.println(parts.length);
                if (parts.length != 9) {
                    continue;
                }
                int index = Integer.parseInt(parts[0]);
                String id = parts[1];
                String name = parts[2];
                String website = parts[3];
                String country = parts[4];
                String description = parts[5];
                int founded = Integer.parseInt(parts[6]);
                String industry = parts[7];
                int employees = Integer.parseInt(parts[8]);
                organizations.add(new Organization(index, id, name, website, country, description, founded, industry, employees));

                if (country.equals("Denmark")) {
                    numOfDanishOrganizations +=1;
                    indexes.add(id);
                    sumOfEmployeesInDanishOrganizations +=employees;
                }
                if (website.endsWith(".net/")) {
                    numOfOrganizationsWithNetWebsite++;
                }

                if (founded <1980){
                    numOfOrganizationsFoundedBefore1980+=1;
                    sumOfEmployeesInOrganizationsFoundedBefore1980+=employees;
                }


                for (Country country2 : countries) {
                    if (country.equals(country2.getName())) {
//            System.out.println("Continent: " + country2.getContinent());
//            System.out.println("Country: " + country2.getName());
                        if (country2.getContinent().equals("Asia")) {
                            Asia += 1;
                        }
                        if (country2.getContinent().equals("Africa")) {
                            Africa += 1;
                        }
                        if (country2.getContinent().equals("Europe")) {
                            Europe += 1;
                        }
                        if (country2.getContinent().equals("North America")) {
                            NorthAmerica += 1;
                        }
                        if (country2.getContinent().equals("Oceania")) {
                            Oceania += 1;
                        }
                        if (country2.getContinent().equals("South America")) {
                            SouthAmerica += 1;
                        }
                    }

                }
//                System.out.println(Asia);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PrintWriter writer = new PrintWriter("wyniki.txt");
        //6
        writer.println("Liczba firm z Asia: " + Asia);
//        writer.println("Liczba firm z Africa: " + Africa);
//        writer.println("Liczba firm z Europe: " + Europe);
//        writer.println("Liczba firm z North America: " + NorthAmerica);
//        writer.println("Liczba firm z Oceania: " + Oceania);
//        writer.println("Liczba firm z SouthAmerica: " + SouthAmerica);
        //7
        int max = findMax(Africa, Asia, Europe, NorthAmerica, Oceania, SouthAmerica);
        if (Africa == max) {
            writer.println("Najwięcej firm jest w: " + Africa);
        }
        if (Asia == max) {
            writer.println("Najwięcej firm jest w: " + Asia);
        }
        if (Europe == max) {
            writer.println("Najwięcej firm jest w: " + Europe);
        }
        if (NorthAmerica == max) {
            writer.println("Najwięcej firm jest w: " + NorthAmerica);
        }
        if (Oceania == max) {
            writer.println("Najwięcej firm jest w: "+ Oceania);
        }
        if (SouthAmerica == max) {
            writer.println("Najwięcej firm jest w: " + SouthAmerica);
        }

        //1
        writer.println("Liczba firm z Danii: " + numOfDanishOrganizations);
        //2
        writer.println("Liczba firm z Danii: " + indexes);
        //3
        writer.println("Suma pracowników firm z Danii: " + sumOfEmployeesInDanishOrganizations);
        //4
        writer.println("Liczba firm, które mają stronę internetową w domenie .net: " + numOfOrganizationsWithNetWebsite);
        //5
        writer.println("Średnia liczba pracowników firm założonych przed 1980 rokiem: " + (sumOfEmployeesInOrganizationsFoundedBefore1980 / numOfOrganizationsFoundedBefore1980));

        writer.close();

    }


    public static int findMax(int Africa, int Asia, int Europe, int NorthAmerica, int Oceania, int SouthAmerica) {
        int max = Africa;
        if (Asia > max) {
            max = Asia;
        }
        if (Europe > max) {
            max = Europe;
        }
        if (NorthAmerica > max) {
            max = NorthAmerica;
        }
        if (Oceania > max) {
            max = Oceania;
        }
        if (SouthAmerica > max) {
            max = SouthAmerica;
        }
        return max;
    }
public static ArrayList<Country> countriesToArray(){
    ArrayList<Country> countries = new ArrayList<>();
    try {
        Scanner scanner = new Scanner(new File("countries.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            countries.add(new Country(parts[0], parts[1]));
        }
        scanner.close();
    } catch (FileNotFoundException e) {
//        System.out.println("pliku nie ma");
    }
    return countries;
}
}




























//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//        ArrayList<Country> countries = countriesToArray();
//        ArrayList<String> indexes = new ArrayList<>();
//        int Africa = 0;
//        int Asia = 0;
//        int Europe = 0;
//        int NorthAmerica = 0;
//        int Oceania = 0;
//        int SouthAmerica = 0;
//        int numOfDanishOrganizations = 0;
//        int numOfOrganizationsWithNetWebsite = 0;
//        int numOfOrganizationsFoundedBefore1980 = 0;
//        int sumOfEmployeesInDanishOrganizations = 0;
//        int sumOfEmployeesInOrganizationsFoundedBefore1980 = 0;
//
//        String fileName = "organizations-1000.csv";
//        List<Organization> organizations = new ArrayList<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            reader.readLine();
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(",");
////                System.out.println(parts.length);
//                if (parts.length != 9) {
//                    continue;
//                }
//                int index = Integer.parseInt(parts[0]);
//                String id = parts[1];
//                String name = parts[2];
//                String website = parts[3];
//                String country = parts[4];
//                String description = parts[5];
//                int founded = Integer.parseInt(parts[6]);
//                String industry = parts[7];
//                int employees = Integer.parseInt(parts[8]);
//                organizations.add(new Organization(index, id, name, website, country, description, founded, industry, employees));
//
//                if (country.equals("Denmark")) {
//                    numOfDanishOrganizations +=1;
//                    indexes.add(id);
//                    sumOfEmployeesInDanishOrganizations +=employees;
//                }
//                if (website.endsWith(".net/")) {
//                    numOfOrganizationsWithNetWebsite++;
//                }
//
//                if (founded <1980){
//                    numOfOrganizationsFoundedBefore1980+=1;
//                    sumOfEmployeesInOrganizationsFoundedBefore1980+=employees;
//                }
//
//
//                for (Country country2 : countries) {
//                    if (country.equals(country2.getName())) {
////            System.out.println("Continent: " + country2.getContinent());
////            System.out.println("Country: " + country2.getName());
//                        if (country2.getContinent().equals("Asia")) {
//                            Asia += 1;
//                        }
//                        if (country2.getContinent().equals("Africa")) {
//                            Africa += 1;
//                        }
//                        if (country2.getContinent().equals("Europe")) {
//                            Europe += 1;
//                        }
//                        if (country2.getContinent().equals("North America")) {
//                            NorthAmerica += 1;
//                        }
//                        if (country2.getContinent().equals("Oceania")) {
//                            Oceania += 1;
//                        }
//                        if (country2.getContinent().equals("South America")) {
//                            SouthAmerica += 1;
//                        }
//                    }
//
//                }
////                System.out.println(Asia);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        PrintWriter writer = new PrintWriter("wyniki.txt");
//        //6
//        writer.println("Liczba firm z Asia: " + Asia);
////        writer.println("Liczba firm z Africa: " + Africa);
////        writer.println("Liczba firm z Europe: " + Europe);
////        writer.println("Liczba firm z North America: " + NorthAmerica);
////        writer.println("Liczba firm z Oceania: " + Oceania);
////        writer.println("Liczba firm z SouthAmerica: " + SouthAmerica);
//        //7
//        int max = findMax(Africa, Asia, Europe, NorthAmerica, Oceania, SouthAmerica);
//        if (Africa == max) {
//            writer.println("Najwięcej firm jest w: " + Africa);
//        }
//        if (Asia == max) {
//            writer.println("Najwięcej firm jest w: " + Asia);
//        }
//        if (Europe == max) {
//            writer.println("Najwięcej firm jest w: " + Europe);
//        }
//        if (NorthAmerica == max) {
//            writer.println("Najwięcej firm jest w: " + NorthAmerica);
//        }
//        if (Oceania == max) {
//            writer.println("Najwięcej firm jest w: "+ Oceania);
//        }
//        if (SouthAmerica == max) {
//            writer.println("Najwięcej firm jest w: " + SouthAmerica);
//        }
//
//        //1
//        writer.println("Liczba firm z Danii: " + numOfDanishOrganizations);
//        //2
//        writer.println("Liczba firm z Danii: " + indexes);
//        //3
//        writer.println("Suma pracowników firm z Danii: " + sumOfEmployeesInDanishOrganizations);
//        //4
//        writer.println("Liczba firm, które mają stronę internetową w domenie .net: " + numOfOrganizationsWithNetWebsite);
//        //5
//        writer.println("Średnia liczba pracowników firm założonych przed 1980 rokiem: " + (sumOfEmployeesInOrganizationsFoundedBefore1980 / numOfOrganizationsFoundedBefore1980));
//
//        writer.close();
//
//    }
//
//
//    public static int findMax(int Africa, int Asia, int Europe, int NorthAmerica, int Oceania, int SouthAmerica) {
//        int max = Africa;
//        if (Asia > max) {
//            max = Asia;
//        }
//        if (Europe > max) {
//            max = Europe;
//        }
//        if (NorthAmerica > max) {
//            max = NorthAmerica;
//        }
//        if (Oceania > max) {
//            max = Oceania;
//        }
//        if (SouthAmerica > max) {
//            max = SouthAmerica;
//        }
//        return max;
//    }
//public static ArrayList<Country> countriesToArray(){
//    ArrayList<Country> countries = new ArrayList<>();
//    try {
//        Scanner scanner = new Scanner(new File("countries.txt"));
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            String[] parts = line.split(",");
//            countries.add(new Country(parts[0], parts[1]));
//        }
//        scanner.close();
//    } catch (FileNotFoundException e) {
////        System.out.println("pliku nie ma");
//    }
//    return countries;
//}
//}
