package stackadministration;

public class Stack<T> {
    private T [] elements;
    private int counter;

    public Stack(T[] elements) {
        this.elements = elements;
        this.counter = -1;
    }

    public T pop(){
        if (counter >= 0){
            T value = elements[counter];
            counter--;
            return value;
        }
        System.out.println("Stack empty!");
        return null;

    }

    public void push(T value){
        if (elements.length > counter + 1) {
            counter++;
            elements[counter] = value;
        }
        else {
            System.out.println("STack is full. Element " + value + " kann nicht abgelegt werden");
        }
    }


}
