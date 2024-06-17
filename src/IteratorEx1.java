import java.util.*;

class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            original.add(i);
        }
        ArrayList copy1 = new ArrayList<>(original);
        ArrayList copy2 = new ArrayList<>();

        System.out.println("original:" + original);
        System.out.println("copy1:" + copy1);
        System.out.println();

        ListIterator<Integer> it = original.listIterator();
        while (it.hasNext()) {
            int num = it.next();
            it.remove();
            copy2.add(num);
        }
        System.out.println("original:" + original);
        System.out.println("copy2:" + copy2);


    } // main
}
