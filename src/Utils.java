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
                    if (i<liczba.length()-1 && liczba.charAt(i+1)=='D'){
                        i++;
                        dziesietna+=400;
                        break;
                    }else if (i<liczba.length()-1 && liczba.charAt(i+1)=='M'){
                        i++;
                        dziesietna+=900;
                        break;
                    }else dziesietna+=100;
                    break;
                case 'L':
                    dziesietna+=50;
                    break;
                case 'X':
                    if (i<liczba.length()-1 && liczba.charAt(i+1)=='L'){
                        i++;
                        dziesietna+=40;
                        break;
                    }else if (i<liczba.length()-1 && liczba.charAt(i+1)=='C'){
                        i++;
                        dziesietna+=90;
                        break;
                    }else dziesietna+=10;
                    break;
                case 'V':
                    dziesietna+=5;
                    break;
                case 'I':
                    if (i<liczba.length()-1 && liczba.charAt(i+1)=='V'){
                        i++;
                        dziesietna+=4;
                        break;
                    }else if (i<liczba.length()-1 && liczba.charAt(i+1)=='X'){
                        i++;
                        dziesietna+=9;
                        break;
                    }else dziesietna+=1;
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

            if(suma==9){
                rzymska+="IX";
                suma =0;
            }else if(suma==4){
                rzymska+="IV";
                suma=0;
            }else if(suma==5){
                rzymska+="V";
                suma=suma%5;
            }

            for (int i = 0; i < (suma); i++) {
                    rzymska+="I";
            }

        return rzymska;
    }
}
