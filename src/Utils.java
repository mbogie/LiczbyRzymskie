public class Utils {

    public boolean sprawdzenie(String liczba){
       boolean czyWlasciwa;

        liczba = liczba.toUpperCase();

        for (int i = 0; i < liczba.length(); i++) {
            if(!(liczba.charAt(i) =='I') && !(liczba.charAt(i) =='V') && !(liczba.charAt(i) =='X') && !(liczba.charAt(i) =='0') &&
                    !(liczba.charAt(i) =='L') && !(liczba.charAt(i) =='C') && !(liczba.charAt(i) =='D') && !(liczba.charAt(i) =='M')){
                System.out.println("BŁĄD!! Wpisz liczbe jeszcze raz:");
                return czyWlasciwa = false;
            }
        }
        return czyWlasciwa = true;
    }

    public int rzymskieDoDziesietnych(String liczba){
        liczba=liczba.toUpperCase();
        int dziesietna = 0;

        for (int i = 0; i < liczba.length() ; i++) {
            switch (liczba.charAt(i)){
                case 'M':
                    dziesietna+=1000;
                    break;
                case 'D':
                    dziesietna+=500;
                    break;
                case 'C':
                    dziesietna+=100;
                    break;
                case 'L':
                    dziesietna+=50;
                    break;
                case 'X':
                    dziesietna+=10;
                    break;
                case 'V':
                    dziesietna+=5;
                    break;
                case 'I':
                    dziesietna+=1;
                    break;
            }
        }
        return dziesietna;
    }

    public String dziesietneDoRzymskich(int suma){
        String rzymska = "";

        for (int i = 0; i < (suma/1000); i++) {
            rzymska+="M";
        }
        suma=suma%1000;

        for (int i = 0; i < (suma/500); i++) {
            rzymska+="D";
        }
        suma=suma%500;

        for (int i = 0; i < (suma/100); i++) {
            rzymska+="C";
        }
        suma=suma%100;

        for (int i = 0; i < (suma/50); i++) {
            rzymska+="L";
        }
        suma=suma%50;

        for (int i = 0; i < (suma/10); i++) {
            rzymska+="X";
        }
        suma=suma%10;

        for (int i = 0; i < (suma/5); i++) {
            rzymska+="V";
        }
        suma=suma%5;

        for (int i = 0; i < (suma); i++) {
            rzymska+="I";
        }

        return rzymska;
    }
}
