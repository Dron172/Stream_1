import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;



public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredList = new ArrayList();
        Iterator iterator = intList.iterator();

        while(iterator.hasNext()) {
            int number = (Integer)iterator.next();
            if (number > 0 && number % 2 == 0) {
                filteredList.add(number);
            }
        }

        filteredList.sort(Comparator.naturalOrder());
        System.out.println(filteredList);
    }
}