import java.util.Arrays;

public class PlusList<T> {
    private Object[] array; //поле массив
    private int index;//для хранения

    public PlusList(int size) {//инициализируем массив
        array = new Object[size];
    }

    public PlusList() {//задаем длину массива
        this(10);
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < this.index; i++) {
            if (i == this.index - 1) {
                str += " " + array[i] + "]";
            } else {
                str += " " + array[i] + ",";
            }
        }
        return str;
//        return "PlusList{" +
//                "array=" + Arrays.toString(array) +
//                ", index=" + index +
//                '}';
    }

    public void add(T value) {//метод добавления элемента в массив
        array[index] = value;
        index++;
    }

    public T getByIndex(int i) {
        return (T) array[i];
    }

    public void removeByIndex(int index) {

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        this.index--;
    }

    public void removeByElement(T value) {
        boolean notFinded = true;
        int index = 0;
        while (notFinded) {
            if (array[index] == value) {
                notFinded = false;
            }
            index++;
        }
        removeByIndex(index-1);
    }
}
