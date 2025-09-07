package Lesson7.Task1;

import java.util.Scanner;

public class Patient {
    String plan;
    Doctor doctor;
    String name;

    public Patient() {}

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int chooseSymptom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Слабость, симптомы простуды");
        System.out.println("2-Болит зуб");
        System.out.println("3-Сильная боль в животе");
        System.out.println("Выберите, что вас беспокоит:");
        int symptom = scanner.nextInt();
        scanner.close();
        return symptom;
    }

}
