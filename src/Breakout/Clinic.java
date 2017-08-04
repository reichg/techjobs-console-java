package Breakout;

public class Clinic {
    public static void main (String[] args) {

        Patient myPatient = new Patient("Clifford", 2, Patient.Type.DOG);
            myPatient.addShot("Rabies Shot");
            myPatient.addShot("Vodka Shot");
            myPatient.addField("size", "too big");
            myPatient.addField("breed", "big red dog");

            System.out.println(myPatient);


    }

}
