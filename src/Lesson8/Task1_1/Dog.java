package Lesson8.Task1_1;

public class Dog extends Animal {

    public Dog() {
    }

    void voice() {
        System.out.print("ГАВ-ГАВ!!!!");
    }

    String eat(String food) {
        if (food.equals("meat")) {
            reaction = "Завилял хвостом";
        } else {
            reaction = "Злостно продолжает гавкать!";
        }
        return reaction;
    }
}
