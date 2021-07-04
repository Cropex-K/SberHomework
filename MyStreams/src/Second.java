import java.util.*;
import java.util.stream.Stream;

public class Second {
    public static void main(String[] args) {
        //1
        List<String> one = Arrays.asList("Kate","Kate","Kate","Kate","Kate");
        List<String> two = Arrays.asList("Ivan","Ivan","Ivan","Ivan","Ivan");
        List<String> three = Arrays.asList("Nikita","Nikita","Nikita","Nikita","Nikita");
        List<String> four = Arrays.asList("Masha","Masha","Masha","Masha","Masha");

        Stream<List<String>> names = Stream.of(one,two,three,four);
        names.flatMap(Collection::stream).distinct().forEach(System.out::println);

        //2
        Map<String,Double> map = new HashMap<>();
        map.put("Cat",3.5);
        map.put("Dog",10.5);
        map.put("Rat",0.8);
        map.put("Elephant",1000.0);

        Stream<Collection<Double>> weight = Stream.of(map.values());
        System.out.println(weight.flatMap(Collection::stream).reduce(0.0, Double::sum));

        //3
        System.out.println(3);
        List<Long> first = new ArrayList<>();
        List<Long> second = new ArrayList<>();

        //для проверки
        first.add((long) 2);
        first.add((long) 3);
        first.add((long) 6);
        second.add((long) 1);
        second.add((long) 8);
        second.add((long) 3);

        first.stream().filter(second::contains).limit(1).forEach(System.out::println);
    }
}
