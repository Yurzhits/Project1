package Lesson7.Task1;

public class Therapist extends Doctor {

    void chooseDoctor() {
        Patient patient = new Patient();
        patient.setName("Сергей");
        int symptom = patient.chooseSymptom();
        System.out.print("Сергей, вам необходимо ");
        switch (symptom) {
            case 1: {
                Therapist therapist = new Therapist();
                therapist.treat();
                break;
            }
            case 2: {
                Dentist dentist = new Dentist();
                dentist.treat();
                break;
            }
            case 3: {
                Surgeon surgeon = new Surgeon();
                surgeon.treat();
                break;
            }
            default: {
                System.out.println("К сожалению, мы не можем вам помочь");
            }
        }
    }

    protected void treat() {
        System.out.print("Пропить курс таблеток");
    }
}
