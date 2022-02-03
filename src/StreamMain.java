import java.util.List;
import java.util.stream.Stream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;


public class StreamMain {
    public StreamMain() {
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream().filter((x) -> {
            return x > 0;
        }).filter((x) -> {
            return x % 2 == 0;
        }).sorted(Comparator.naturalOrder());
        PrintStream comparatorResult = System.out;
        stream.forEach(comparatorResult::println);
    }
}