class Produkt{
    public int id;
    public String nazwa;
    public String kodKreskowy;

    boolean czyKodKreskowyOK(){
        boolean czyOk = true;
        // kod kreskowy EAN-13 ma mieć zawsze 13 znakow
        if(kodKreskowy.length() != 13)
            czyOk = false;
        else
        {
            // jesli ma 13 znakow, spr czy kazdy znak to cyfra
            for(int i = 0; i<13; i++)
            {
                if(kodKreskowy.charAt(i) < '0' ||
                        kodKreskowy.charAt(i) > '9')
                {
                    czyOk = false;
                    break;
                }
            }
        }

        return czyOk;
    }

    boolean czyPL(){
        boolean czyOk = czyKodKreskowyOK();
        if(czyOk){
            if(kodKreskowy.startsWith("590"))
                return true;
            else
                return false;
        }
        else{
            System.out.println("Err#1 Kod kresk niepoprawny");
            return false;
        }
    }

    boolean czyPL(int x){
        if(kodKreskowy.startsWith("590"))
            return true;
        else
            return false;
    }

    void wypiszDane(){
        System.out.println("Id: " + id);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Kod K: " + kodKreskowy);
    }

    Produkt(){
        id = -1;
        nazwa = "empty";
        kodKreskowy = "0000000000000";
    }

    Produkt(int newId, String newNazwa, String newKodKreskowy){
        id = newId;
        nazwa = newNazwa;
        kodKreskowy = newKodKreskowy;
    }
}



