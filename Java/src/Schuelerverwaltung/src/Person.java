public class Person {
    private int alter;

    private String vorname;
    private String nachname;

    private Fach[] faecher = new Fach[10];


    public Person(String pVorname, String pNachname, int pAlter){
        setAlter(pAlter);
        setNachname(pNachname);
        setVorname(pVorname);
    }

    public void alleFaecherAusgeben(){
        for (int i = 0; i< faecher.length ; i++){
            if (faecher[i] != null){
                System.out.println(faecher[i]);
            }
        }
    }

    public String getVorname(){
        return vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public int getAlter(){
        return alter;
    }

    public void setAlter(int pAlter){
        this.alter = pAlter;
    }

    public void setVorname(String pVorname){
        this.vorname = pVorname;
    }

    public void setNachname(String pNachname){
        this.nachname = pNachname;
    }
}
