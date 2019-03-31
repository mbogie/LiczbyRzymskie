public class Utils {

    public boolean sprawdzenie(String liczba){
       boolean czyWlasciwa;

        liczba = liczba.toUpperCase();

        for (int i = 0; i < liczba.length(); i++) {
            if(!(liczba.charAt(i) =='I') && !(liczba.charAt(i) =='V') && !(liczba.charAt(i) =='X') &&
                    !(liczba.charAt(i) =='L') && !(liczba.charAt(i) =='C') && !(liczba.charAt(i) =='D') && !(liczba.charAt(i) =='M')){
                System.out.println("BŁĄD!! Wpisz liczbe jeszcze raz:");
                return czyWlasciwa = false;
            }
        }
        return czyWlasciwa = true;
    }

    public int rzymskieDoDziesietnych(String liczba){
        int dziesietna = 0;




        return dziesietna;
    }

    public String dziesietneDoRzymskich(int suma){
        String rzymska = "";

        return rzymska;
    }
}
