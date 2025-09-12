package Lesson8.Task1_1;

public class PrivateDog extends Animal { //копия класса Dog

    private PrivateDog() { //из-за приватного конструктора нельзя создать объект в другом классе
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

    static Dog createPrivateDog() { //для статического метода не нужен объект класса
        return new Dog();
    }
}
