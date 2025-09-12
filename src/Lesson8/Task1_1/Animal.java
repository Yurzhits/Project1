package Lesson8.Task1_1;

public class Animal {

    String reaction;

    public Animal() {}

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    void voice() {
        System.out.println("Звуки животного");
    }

    String eat(String food) {
        return reaction;
    }
}
