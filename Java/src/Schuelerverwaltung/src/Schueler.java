public class Schueler extends Person{
    private String password = "null";

    private Fach[] faecher = new Fach[10];

    public Schueler(String pVorname, String pNachname, int pAlter, String pPassword){
        super(pVorname, pNachname, pAlter);
        setPassword(pPassword);
    }



    public void changePassword(String pPassword){
        if (pPassword.length() < 4){
            System.out.println("Passwort kann nicht geändert werden -- zu kurz");
        }else {
            this.password = pPassword;
            System.out.println("Passwort erfolgreich geändert");
        }
    }

    private void setPassword(String pPassword){
        if (pPassword.length() < 4){
            System.out.println("Passwort zu kurz: Die Anwendung wird beendet");
            System.exit(0);
        }else {
            this.password = pPassword;
            System.out.println("Passwort erfolgreich gesetzt");
        }
    }

    public boolean ueberPruefePassword(String pPassword){
        if (this.password.equals(pPassword)){
            return true;
        }else {
            return false;
        }
    }


    public void gebeNotenAus(){
        for (int i = 0; i < faecher.length; i++){
            if (faecher[i] != null){
                System.out.println(faecher[i]);
            }
        }
    }

    void fachAnlegen(Fach pFach){
        for (int i = 0; i < faecher.length ; i++){
            if (faecher[i] == null){
                faecher[i] = pFach;
                return;
            }
        }
        System.out.println("Alle Fächer belegt");
    }
   
    
}
