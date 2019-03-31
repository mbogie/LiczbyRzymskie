import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj dwie liczby rzymskie do dodania");
        Scanner sc = new Scanner(System.in);
        String licz1 = sc.nextLine();
        String licz2 = sc.nextLine();

        Utils utils = new Utils();
        int licz1dz = utils.rzymskieDoDziesietnych(licz1);
        int licz2dz = utils.rzymskieDoDziesietnych(licz2);

        int suma = licz1dz+licz2dz;

        String sumaRzymska = utils.dziesietneDoRzymskich(suma);

        System.out.println("Suma cyfr \""+licz1+"\" i \""+licz2+"\" wynosi:");
        System.out.println(sumaRzymska);
    }
}
