package Lesson9_10.Task2;

public class User implements Cloneable {
    private String name;
    private int id;
    private Book book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone() throws CloneNotSupportedException {
        User clonedUser = (User) super.clone();
        if (this.book != null) { //я не понимаю, почему без этой проверки глубокое клонирвоание работает не правильно
            // (как поверхностное)
            clonedUser.book = (Book) this.book.clone();
        }
        return clonedUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", book=" + book +
                '}';
    }
}
