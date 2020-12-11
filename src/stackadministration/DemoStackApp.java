package stackadministration;

public class DemoStackApp {
    public static void main(String[] args) {

        Integer arr[] = new Integer[5];

        Stack<Integer> test = new Stack<Integer>(arr);

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);

        System.out.println("stack.pop() = " + test.pop());
        System.out.println("stack.pop() = " + test.pop());
        System.out.println("stack.pop() = " + test.pop());
        System.out.println("stack.pop() = " + test.pop());
        System.out.println("stack.pop() = " + test.pop());
        System.out.println("stack.pop() = " + test.pop());
        System.out.println("stack.pop() = " + test.pop());


        Stack<String> wochentage = new Stack<>(new String[7]);
        wochentage.push("Montag");
        wochentage.push("Dienstag");
        wochentage.push("Mittwoch");
        System.out.println("Stack Wochentage.pop() = " + wochentage.pop());
        wochentage.push("Donnerstag");
        wochentage.push("Freitag");
        System.out.println("Stack Wochentage.pop() = " + wochentage.pop());
        System.out.println("Stack Wochentage.pop() = " + wochentage.pop());


    }
}
