import java.util.ArrayList;

class Container<T extends Number>{

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void demo(ArrayList<? extends T> someNumber){

    }
}


public class CreatingGenericClass {

    public static void main(String[] args) {
      Container<Number> numbers = new Container<>();

      numbers.demo(new ArrayList<Integer>());



    }




}
