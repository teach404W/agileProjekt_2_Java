public class Schueler extends Person{
    private String password = "null";

    public Schueler(String pVorname, String pNachname, int pAlter, String pPassword){
        super(pVorname, pNachname, pAlter);
        setPassword(pPassword);
    }


    public void setPassword(String pPassword){
        if (pPassword.length() < 4){
            System.out.println("Passwort kann nicht geändert werden -- zu kurz");
        }else {
            this.password = pPassword;
            System.out.println("Passwort erfolgreich geändert");
        }
    }

    public boolean ueberPruefePassword(String pPassword){
        if (this.password.equals(pPassword)){
            return true;
        }else {
            return false;
        }
    }
    
}
