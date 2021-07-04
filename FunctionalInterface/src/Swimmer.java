import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Swimmer {

    private String name;
    private Integer age;

    public Swimmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void swim(Consumer<String> c){
        c.accept(this.name);
 }

    public static void main(String[] args) {
        Swimmer sw1 = new Swimmer("Annie", 45);
        sw1.swim(c -> System.out.println(c));

        Supplier<String> s = ()-> sw1.getName();
        s.get();

        BiConsumer<String,Integer> bc = (String st, Integer x) -> {sw1.setAge(x); sw1.setName(st);};

    }
}
