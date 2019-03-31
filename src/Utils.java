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

        //przedział > 1000
        for (int i = 0; i < (suma/1000); i++) {
            rzymska+="M";
        }

        //przedział 999>x>100
        suma=suma%1000;
        int sumaTmp = (suma/100);
        if(sumaTmp==9){
            rzymska+="CM";
            suma-=900;
            sumaTmp-=9;
        }else if(sumaTmp==4){
            rzymska+="CD";
            suma-=400;
            sumaTmp-=4;
        }else if(5<=sumaTmp && sumaTmp<9){
            rzymska+="D";
            suma-=500;
            sumaTmp-=5;
        }
        for (int i = 0; i < (sumaTmp); i++) {
            rzymska+="C";
        }

        //przedział 99>x>10
        suma=suma%100;
        sumaTmp = (suma/10);
        if(sumaTmp==9){
            rzymska+="XC";
            suma-=90;
            sumaTmp-=9;
        }else if(sumaTmp==4){
            rzymska+="XL";
            suma-=40;
            sumaTmp-=4;
        }else if(5<=sumaTmp && sumaTmp<9){
            rzymska+="L";
            suma-=50;
            sumaTmp-=5;
        }
        for (int i = 0; i < (sumaTmp); i++) {
            rzymska+="X";
        }

        // przedział <10
        suma=suma%10;
        if(suma==9){
            rzymska+="IX";
            suma =0;
        }else if(suma==4){
            rzymska+="IV";
            suma=0;
        }else if(5<=suma && suma<9){
            rzymska+="V";
            suma-=5;
        }
        for (int i = 0; i <suma; i++) {
            rzymska+="I";
        }

        return rzymska;
    }
    public void show(){
        System.out.println("\n----------");
        System.out.println("I - 1");
        System.out.println("V - 5, IV - 4");
        System.out.println("X - 10, IX - 9");
        System.out.println("L - 50, XL - 40");
        System.out.println("C - 100, XC - 90");
        System.out.println("D - 500, CD - 400");
        System.out.println("M - 1000, CM - 900");
        System.out.println("----------");
    }
}
