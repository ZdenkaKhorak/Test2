public class MainClass {

    public static void main(String[] args) {

        char chars[] = {'a', 'b', 'c'};
        String s = new String(chars, 1, 2);
        System.out.println(s);

        String s2 = new String("Четыре" + (2+2));
        System.out.println(s2);

    }
}
