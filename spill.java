import java.util.Scanner;
 
public class spill {
    public static void
    gjetteTallSpill()
    {
        //Lager en scanner
        Scanner scanner = new Scanner(System.in);
 
        //Lager tallet
        int tall = 1 + (int)(50 * Math.random());
 
        //Forsøk
        int forsok = 5;
 
        int i, gjett;
 
        System.out.println("Du skal gjette ett tall mellom 1 og 50, du har " + forsok + " forsøk. Lykke til!");
 
        //siden jeg ønsker at spilleren skal ha forsøk lager jeg en loop som går gjennom mengden forsøk du har
        for (i = 0; i < forsok; i++) {
 
            System.out.println("Gjett tallet:");
            gjett = scanner.nextInt();
 
            if (tall == gjett) {
                System.out.println("Du gjetta tallet! Tallet var: " + tall);
                break;
            }
            else if (tall > gjett && i != forsok - 1) {
                System.out.println("Tallet er større enn " + gjett);
            }
            else if (tall < gjett && i != forsok - 1) {
                System.out.println("Tallet er mindre enn " + gjett);
            }
        }
 
        if (i == forsok) {
            System.out.println("Du har brukt opp dine " + forsok + " forsøk. Tallet var " + tall);
        }
    }
 
    //Kjører koden
    public static void
    main(String arg[])
    {
 
        //Kaller på funksjonen/spillet
        gjetteTallSpill();
    }
}


