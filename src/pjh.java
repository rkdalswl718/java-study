package hello;

import java.util.*;

class pjh {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        // 25개의 고유한 숫자를 생성
        while (set.size() < 25) {
            int num = (int) (Math.random() * 50) + 1;
            set.add(num);
        }

        List list = new LinkedList(set);
        Collections.shuffle(list);

        Iterator iterator = list.iterator();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (iterator.hasNext()) {
                    System.out.print(iterator.next() + " ");
                }
            }
            System.out.println();
        }
    }
}
