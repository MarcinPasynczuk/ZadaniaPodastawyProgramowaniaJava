class Main {
    public static void main(String[] args) {
        System.out.println("Start:");

        Produkt p1  = new Produkt();
        p1.kodKreskowy = "590123456789";

        Produkt p2 = new Produkt(10, "szklanka", "1231231231237");

        System.out.println("\n ==== #1 ====");
        System.out.println(p1.czyPL());
        System.out.println("\n ==== #2 ====");
        System.out.println(p1.czyPL(9));
        System.out.println("\n ==== #3 ====");
        System.out.println(p1.czyKodKreskowyOK());

        System.out.println("\n ==== #4 ====");
        p1.wypiszDane();

        System.out.println("\n ==== #5 ====");
        p2.wypiszDane();

        Dostawa d1 = new Dostawa();
        d1.id = 11;
        d1.produkt = new Produkt();
        d1.produkt.id = 111;
        d1.produkt.nazwa = "krzeslo";
        d1.produkt.kodKreskowy = "9999888899991";
        d1.kodPocztowy = "222-22";
        Dostawa d2 = new Dostawa(2000, p2, "5908777766661");
        Dostawa d3 = new Dostawa(3000, 333, "Stolik", "3333333333333", "33-333");


        System.out.println("\n ==== #6 ====");
        d1.wypiszDane();

        System.out.println("\n ==== #7 ====");
        d2.wypiszDane();

        System.out.println("\n ==== #8 ====");
        d3.wypiszDane();
        Dostawa[] tablicaDostaw  = new Dostawa[5];
        tablicaDostaw[0] = new Dostawa(999, 99, "komputer", "5901111111111", "99-AAA");
        tablicaDostaw[1] = d1;
        tablicaDostaw[2] = d2;
        tablicaDostaw[3] = d3;
        tablicaDostaw[4] = new Dostawa(444, 44, "rogalik z makiem", "509", "99-111");

        int count = 0;
        for (Dostawa dostawa : tablicaDostaw) {
            if (!dostawa.czyKodPocztowyOK()) {
                count += 1;

            }
        }
        System.out.println("There is " + count + " wrong postcodes.");



        System.out.println("\n\n\n\n\n\n\n\n\n\nEnd");
    }


}
