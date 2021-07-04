import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class First {
    public static void main(String[] args) {
        Random r = new Random();
        Stream<Integer> random = Stream.generate(r::nextInt);
        Set<Integer> res = random.filter(x-> x>0 && x%2==1).map(x->x*2).peek(System.out::println).limit(15).collect(Collectors.toSet());
        Stream<Integer> sum = res.stream();
        System.out.println("sum is "+sum.reduce(0, Integer::sum));

    }

}
