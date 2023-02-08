import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String fileName = "wodociagi.txt";
        List<Data> data = new ArrayList<>();

        int maxWaterPP = 0;
        String whoMaxPP = null;
        int[] EM = new int[13];
        int[] AW = new int[13];
        int[] RA = new int[13];
        int[] IA = new int[13];
        int[] ES = new int[13];
        int[] RY = new int[13];
        int[] IL = new int[13];
        int[] OL = new int[13];
        int[] RU = new int[13];
        int[] CH = new int[13];
        int[] IE = new int[13];
        int[] LO = new int[13];
        int[] RO = new int[13];
        int[] AR = new int[13];
        int[] OK = new int[13];


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String customer = parts[0];
                String customerNumber = customer.substring(0, 5);
                String customerHowManyPeps = customer.substring(6, 7);
                String customerCode = customer.substring(8, 10);
                int month1 = Integer.parseInt(parts[1]);
                int month2 = Integer.parseInt(parts[2]);
                int month3 = Integer.parseInt(parts[3]);
                int month4 = Integer.parseInt(parts[4]);
                int month5 = Integer.parseInt(parts[5]);
                int month6 = Integer.parseInt(parts[6]);
                int month7 = Integer.parseInt(parts[7]);
                int month8 = Integer.parseInt(parts[8]);
                int month9 = Integer.parseInt(parts[9]);
                int month10 = Integer.parseInt(parts[10]);
                int month11 = Integer.parseInt(parts[11]);
                int month12 = Integer.parseInt(parts[12]);
                int sumMonth = month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + month9 + month10 + month11 + month12;

                //1
                if (maxWaterPP < (int) sumMonth / Integer.parseInt(customerHowManyPeps)) {

                    maxWaterPP = (int) sumMonth / Integer.parseInt(customerHowManyPeps);
                    whoMaxPP = customerNumber;
                }

                //2
                if (customerCode.equals("EM")) {
                    EM[0] += sumMonth;
                    EM[1] += month1;
                    EM[2] += month2;
                    EM[3] += month3;
                    EM[4] += month4;
                    EM[5] += month5;
                    EM[6] += month6;
                    EM[7] += month7;
                    EM[8] += month8;
                    EM[9] += month9;
                    EM[10] += month10;
                    EM[11] += month11;
                    EM[12] += month12;
                }
                if (customerCode.equals("AW")) {
                    AW[0] += sumMonth;
                    AW[1] += month1;
                    AW[2] += month2;
                    AW[3] += month3;
                    AW[4] += month4;
                    AW[5] += month5;
                    AW[6] += month6;
                    AW[7] += month7;
                    AW[8] += month8;
                    AW[9] += month9;
                    AW[10] += month10;
                    AW[11] += month11;
                    AW[12] += month12;
                }
                if (customerCode.equals("RA")) {
                    RA[0] += sumMonth;
                    RA[1] += month1;
                    RA[2] += month2;
                    RA[3] += month3;
                    RA[4] += month4;
                    RA[5] += month5;
                    RA[6] += month6;
                    RA[7] += month7;
                    RA[8] += month8;
                    RA[9] += month9;
                    RA[10] += month10;
                    RA[11] += month11;
                    RA[12] += month12;
                }
                if (customerCode.equals("IA")) {
                    IA[0] += sumMonth;
                    IA[1] += month1;
                    IA[2] += month2;
                    IA[3] += month3;
                    IA[4] += month4;
                    IA[5] += month5;
                    IA[6] += month6;
                    IA[7] += month7;
                    IA[8] += month8;
                    IA[9] += month9;
                    IA[10] += month10;
                    IA[11] += month11;
                    IA[12] += month12;
                }
                if (customerCode.equals("ES")) {
                    ES[0] += sumMonth;
                    ES[1] += month1;
                    ES[2] += month2;
                    ES[3] += month3;
                    ES[4] += month4;
                    ES[5] += month5;
                    ES[6] += month6;
                    ES[7] += month7;
                    ES[8] += month8;
                    ES[9] += month9;
                    ES[10] += month10;
                    ES[11] += month11;
                    ES[12] += month12;
                }
                if (customerCode.equals("RY")) {
                    RY[0] += sumMonth;
                    RY[1] += month1;
                    RY[2] += month2;
                    RY[3] += month3;
                    RY[4] += month4;
                    RY[5] += month5;
                    RY[6] += month6;
                    RY[7] += month7;
                    RY[8] += month8;
                    RY[9] += month9;
                    RY[10] += month10;
                    RY[11] += month11;
                    RY[12] += month12;
                }
                if (customerCode.equals("IL")) {
                    IL[0] += sumMonth;
                    IL[1] += month1;
                    IL[2] += month2;
                    IL[3] += month3;
                    IL[4] += month4;
                    IL[5] += month5;
                    IL[6] += month6;
                    IL[7] += month7;
                    IL[8] += month8;
                    IL[9] += month9;
                    IL[10] += month10;
                    IL[11] += month11;
                    IL[12] += month12;
                }
                if (customerCode.equals("OL")) {
                    OL[0] += sumMonth;
                    OL[1] += month1;
                    OL[2] += month2;
                    OL[3] += month3;
                    OL[4] += month4;
                    OL[5] += month5;
                    OL[6] += month6;
                    OL[7] += month7;
                    OL[8] += month8;
                    OL[9] += month9;
                    OL[10] += month10;
                    OL[11] += month11;
                    OL[12] += month12;
                }

                if (customerCode.equals("RU")) {
                    RU[0] += sumMonth;
                    RU[1] += month1;
                    RU[2] += month2;
                    RU[3] += month3;
                    RU[4] += month4;
                    RU[5] += month5;
                    RU[6] += month6;
                    RU[7] += month7;
                    RU[8] += month8;
                    RU[9] += month9;
                    RU[10] += month10;
                    RU[11] += month11;
                    RU[12] += month12;
                }
                if (customerCode.equals("CH")) {
                    CH[0] += sumMonth;
                    CH[1] += month1;
                    CH[2] += month2;
                    CH[3] += month3;
                    CH[4] += month4;
                    CH[5] += month5;
                    CH[6] += month6;
                    CH[7] += month7;
                    CH[8] += month8;
                    CH[9] += month9;
                    CH[10] += month10;
                    CH[11] += month11;
                    CH[12] += month12;
                }
                if (customerCode.equals("IE")) {
                    IE[0] += sumMonth;
                    IE[1] += month1;
                    IE[2] += month2;
                    IE[3] += month3;
                    IE[4] += month4;
                    IE[5] += month5;
                    IE[6] += month6;
                    IE[7] += month7;
                    IE[8] += month8;
                    IE[9] += month9;
                    IE[10] += month10;
                    IE[11] += month11;
                    IE[12] += month12;
                }
                if (customerCode.equals("LO")) {
                    LO[0] += sumMonth;
                    LO[1] += month1;
                    LO[2] += month2;
                    LO[3] += month3;
                    LO[4] += month4;
                    LO[5] += month5;
                    LO[6] += month6;
                    LO[7] += month7;
                    LO[8] += month8;
                    LO[9] += month9;
                    LO[10] += month10;
                    LO[11] += month11;
                    LO[12] += month12;
                }
                if (customerCode.equals("RO")) {
                    RO[0] += sumMonth;
                    RO[1] += month1;
                    RO[2] += month2;
                    RO[3] += month3;
                    RO[4] += month4;
                    RO[5] += month5;
                    RO[6] += month6;
                    RO[7] += month7;
                    RO[8] += month8;
                    RO[9] += month9;
                    RO[10] += month10;
                    RO[11] += month11;
                    RO[12] += month12;
                }
                if (customerCode.equals("AR")) {
                    AR[0] += sumMonth;
                    AR[1] += month1;
                    AR[2] += month2;
                    AR[3] += month3;
                    AR[4] += month4;
                    AR[5] += month5;
                    AR[6] += month6;
                    AR[7] += month7;
                    AR[8] += month8;
                    AR[9] += month9;
                    AR[10] += month10;
                    AR[11] += month11;
                    AR[12] += month12;
                }
                if (customerCode.equals("OK")) {
                    OK[0] += sumMonth;
                    OK[1] += month1;
                    OK[2] += month2;
                    OK[3] += month3;
                    OK[4] += month4;
                    OK[5] += month5;
                    OK[6] += month6;
                    OK[7] += month7;
                    OK[8] += month8;
                    OK[9] += month9;
                    OK[10] += month10;
                    OK[11] += month11;
                    OK[12] += month12;
                }

                // //sprawdzenie zadania 2. metoda szukania wszytskich osiedli
                if (
                        !(customerCode.equals("EM")) &&
                                !(customerCode.equals("AW")) &&
                                !(customerCode.equals("LO")) &&
                                !(customerCode.equals("IE")) &&
                                !(customerCode.equals("CH")) &&
                                !(customerCode.equals("RU")) &&
                                !(customerCode.equals("OL")) &&
                                !(customerCode.equals("IL")) &&
                                !(customerCode.equals("RY")) &&
                                !(customerCode.equals("ES")) &&
                                !(customerCode.equals("IA")) &&
                                !(customerCode.equals("RA")) &&
                                !(customerCode.equals("RO")) &&
                                !(customerCode.equals("AR")) &&
                                !(customerCode.equals("OK"))

                ) {
                    System.out.println(customerCode);
                }


                data.add(new Data(customerNumber, customerHowManyPeps, customerCode, month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] names = {"EM", "AW", "RA", "IA", "ES", "RY", "IL", "OL", "RU", "CH", "IE", "LO", "RO", "AR", "OK"};
        int[][] arrays = {EM, AW, RA, IA, ES, RY, IL, OL, RU, CH, IE, LO, RO, AR, OK};

        System.out.println("Odpowiedz zadania 1:");
        System.out.println(whoMaxPP);

        System.out.println("Odpowiedz zadania 2:");
        for (int i = 0; i < arrays.length; i++) {
            Arrays.sort(arrays[i]);
            int secondLargest = arrays[i][arrays[i].length - 2];
            System.out.println("Roczne zużycie wody na osiedlu " + names[i] + " to " + secondLargest +".");
        }

        System.out.println("Odpowiedz zadania 3:");

        for (int i = 0; i < arrays.length; i++) {
            Arrays.sort(arrays[i]);
            int secondLargest = arrays[i][arrays[i].length - 2];
            System.out.println("Największe zużycie wody na osiedlu " + names[i] + " to " + secondLargest +".");
        }

    }

}