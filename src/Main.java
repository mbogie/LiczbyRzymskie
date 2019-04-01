import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Utils utils = new Utils();
        Scanner sc = new Scanner(System.in);
        String licz1;
        utils.show();
        do {
            System.out.print("Podaj pierwsza liczbę rzymska: ");
            licz1 = sc.nextLine();
        } while(!utils.sprawdzenie(licz1));
        int licz1dz = utils.rzymskieDoDziesietnych(licz1);

        String licz2;
        do {
            System.out.print("Podaj druaga liczbę rzymska: ");
            licz2 = sc.nextLine();
        } while(!utils.sprawdzenie(licz2));
        int licz2dz = utils.rzymskieDoDziesietnych(licz2);

        int suma = licz1dz+licz2dz;

        String sumaRzymska = utils.dziesietneDoRzymskich(suma);
        utils.show();
        System.out.println("Suma cyfr \""+licz1.toUpperCase()+"\"("+licz1dz+") i \""+licz2.toUpperCase()+"\"("+licz2dz+") wynosi:");
        System.out.println(sumaRzymska+"("+suma+")");
    }
}
