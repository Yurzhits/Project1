package Lesson8.Task1_1;

public class Rabbit extends Animal{

    public Rabbit() {}

    void voice() {
        System.out.print("ПРЫГ-СКОК!");
    }

    String eat(String food) {
        if (food.equals("grass")) {
            reaction = "Радостно скачет!";
        } else {
            reaction = "Упрыгивает со слезами на глазах!";
        }
        return reaction;
    }
}
