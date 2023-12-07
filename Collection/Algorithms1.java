package Classification;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms1 {

    private Character[] letters = { 'P', 'C', 'M' };

    private Character[] lettersCopy;

    private List<Character> list;

    private List<Character> copyList;

    public Algorithms1() {

        list = Arrays.asList(letters);

        lettersCopy = new Character[3];

        System.out.println("Initial list ");

        output(list);

        Collections.reverse(list);

        System.out.println("\nAfter calling reverse ");

        output(list);

        Collections.copy(copyList, list);

        System.out.println("\nAfter copying ");

        output(copyList);

        Collections.fill(list, 'R');

        System.out.println("\nAfter calling fill ");

        output(list);

    }

    private void output(List<Character> listRef) {

        System.out.print("The list is ");

        for (Character element : listRef) {

            System.out.printf("%s", element);

        }

        System.out.printf("\nMax %s", Collections.max(listRef));

        System.out.printf("Min :%s \n", Collections.min(listRef));

    }

    public static void main(String args[]) {

        new Algorithms1();

    }

}
