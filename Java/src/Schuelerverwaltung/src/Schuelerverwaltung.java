public class Schuelerverwaltung {
    private Schueler schueler;
    private boolean angemeldet = false;

    private MenueFuehrung menueFuehrung;

    public Schuelerverwaltung(){
        menueFuehrung = new MenueFuehrung();

        schueler = menueFuehrung.erstelleUser();

        anmeldung();
        zeigeMenue();
    }

    private void anmeldung(){
        String pPassword = menueFuehrung.anmeldung();
        this.anmeldung(pPassword) ;
    }

    private void anmeldung(String pPassword){
        if (schueler.ueberPruefePassword(pPassword) == true){
            System.out.println("Erfolgreich angemeldet");
            angemeldet = true;
        }else {
            System.out.println("Nicht angemeldet");
            angemeldet = false;
        }
    }


    public void abmeldung(){
        angemeldet = menueFuehrung.abmeldung();
    }

    public void zeigeMenue(){
        while(angemeldet == true){
            switch(menueFuehrung.start()){
                case 1: schueler.fachAnlegen(menueFuehrung.fachAnlegen());
                        break;
                case 2:
                        break;
                case 3: schueler.alleFaecherAusgeben();
                        break;
                case 4: this.angemeldet = menueFuehrung.abmeldung();
                        break;
                default: System.out.println("Bitte eingabe wiederholen");
            }
        }
        
    }
}
