import java.util.Scanner;

public class MenueFuehrung {

    Scanner sc = new Scanner(System.in);

    public Schueler erstelleUser() {

        System.out.println("Gebe den Vornamen ein");
        String pVorname = sc.nextLine();

        System.out.println("Gebe den Nachnamen ein");
        String pNachname = sc.nextLine();

        System.out.println("Gebe das Alter ein");
        int pAlter = sc.nextInt();

        System.out.println("Gebe das Passwort ein");
        String pPassword = sc.next();
        

        Schueler ret = new Schueler(pVorname, pNachname, pAlter, pPassword);

        return ret;
    }

    public String anmeldung(){
        System.out.println("Bitte geben Sie ihr Passwort ein!");

        String ret = sc.next();

        return ret;
    }

    public boolean abmeldung(){
        System.out.println("Sie werden abgemeldet");
        return false;
    }

    public void zeigeFaecher(Schueler pSchueler){
        pSchueler.alleFaecherAusgeben();
    }

    public Fach fachAnlegen(){
        System.out.println("Bitte Fachnamen angeben");
        String pName = sc.next();

        Fach ret = new Fach(pName);

        return ret;
    }

    public int start(){
        System.out.println("Wählen Sie aus:");
        System.out.println(" (1) Fach anlegen:");
        System.out.println(" (2) Note für Fach anlegen:");
        System.out.println(" (3) Alle Fächer und Noten ausgeben");
        System.out.println(" (4) Abmelden");
        
        return sc.nextInt();
    }
}
