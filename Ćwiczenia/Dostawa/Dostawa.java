class Dostawa{
    public int id;
    public Produkt produkt;
    public String kodPocztowy;

    boolean czyKodPocztowyOK()
    {
//        if(kodPocztowy.length() == 6) {return false;}
//
//        for(int i=0; i<6; i++)
//        {
//            if(i == 2) {
//                if(kodPocztowy.charAt(2) != '-') { return false;}
//            }
//            else{
//                if(kodPocztowy.charAt(i) < '0' ||
//                        kodPocztowy.charAt(i) > '9') { return false;}
//            }
//        }
//        return true;

        String regex = "^[0-9]{2}-[0-9]{3}";
        return kodPocztowy.matches(regex);
    }


    void wypiszDane(){
        System.out.println("Id dost: " + id);
        System.out.println("Kod P: " + kodPocztowy);
        produkt.wypiszDane();
    }


    Dostawa()
    {
        id = -1;
        produkt = new Produkt();
        kodPocztowy = "00-000";
    }

    Dostawa(int newId, Produkt newProdukt, String newKodPocztowy)
    {
        id = newId;
        produkt = newProdukt;
        kodPocztowy = newKodPocztowy;
    }

    Dostawa(
            int newIdDostawy,
            int newIdProduktu,
            String newNazwaProduktu,
            String newKodKreskowyProduktu,
            String newKodPocztowyDostawy)
    {
        id = newIdDostawy;
        produkt = new Produkt(newIdProduktu, newNazwaProduktu, newKodKreskowyProduktu);
        kodPocztowy = newKodPocztowyDostawy;
    }



}