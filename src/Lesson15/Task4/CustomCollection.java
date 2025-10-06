package Lesson15.Task4;

public class CustomCollection<T> {
    private Object[] objects;
    private int size = 0;
    static int DEFAULT_CAPACITY = 5;

    public CustomCollection() {
        this.objects = new Object[DEFAULT_CAPACITY];
    }

    public CustomCollection(int size) {
        this.objects = new Object[size];
    }

    public void add(T t) {
        isEnoughCapacity();
        objects[size++] = t;
    }

    public void isEnoughCapacity() {
        if (size == objects.length) {
            int newSize = (objects.length * 3) / 2 + 1;
            Object[] newObjects = new Object[newSize];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            objects = newObjects;
        }
    }

    public void delete(int index) {
        for (int i = index; i < size - 1; i++) {
            objects[i] = objects[i + 1];
        }
        size--;
        objects[size] = null;
    }

    public T getByIndex(int index) {
        return (T) objects[index];
    }

    public boolean isContains(T element) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            objects[i] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(objects[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
