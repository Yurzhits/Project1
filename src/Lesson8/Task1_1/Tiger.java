package Lesson8.Task1_1;

public class Tiger extends Animal{

    public Tiger() {}

    void voice() {
        System.out.print("МЯУ!!!!");
    }

    String eat(String food) {
        if (food.equals("meat")) {
            reaction = "Замурлыкал <3";
        } else {
            reaction = "Обиженно рычит!";
        }
        return reaction;
    }

}
