import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class MyFunctions {

    public static <T, R> List<R> map (List<T> origin, Function<T,R> mapper){
       List<R> resList = new ArrayList<>();
        for (int i=0; i<origin.size(); i++) {
           resList.add(mapper.apply(origin.get(i)));
        }
       return resList;
   }

   public static <T> void  forEach(List<T> origin, Consumer<T> consumer){
       for (T t: origin) {
           consumer.accept(t);
       }
   }

   public static <T> List<T> filter (List<T> origin, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
       for (T t: origin) {
         if (predicate.test(t)){
             result.add(t);
         }
       }
        return result;
   }

   //получился фактически фильтр, который подсчитываает количество объектов, которые удовлетворяют условию
   public static <T> int count(List<T> origin, Predicate<T> predicate){
        int result =0;
       for (T t: origin) {
           if (predicate.test(t)){
               result+=1;
           }
       }
       return result;
   }

   public static <T> List<T> foldL(List<T> origin, BinaryOperator<T> binaryOperator){
        List<T> result = new ArrayList<>();
        result.add(binaryOperator.apply(origin.get(0), origin.get(1)));
        for (int i= 2; i<origin.size(); i++) {
           result.add(origin.get(i));
        }
        return result;
   }

    public static <T> List<T> foldR(List<T> origin, BinaryOperator<T> binaryOperator){
        List<T> result = new ArrayList<>();
        for (int i= 0; i<origin.size()-2; i++) {
            result.add(origin.get(i));
        }
        result.add(binaryOperator.apply(origin.get(origin.size()-1), origin.get(origin.size()-2)));
        return result;
    }

    public static void main(String[] args) {

       //проверка сверток
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<7; i++){
            list.add(i);
        }

        BinaryOperator<Integer> b = (Integer a, Integer c) ->Integer.sum(c,a);

        List<Integer> listl = foldL(list,b);
        List<Integer> listR = foldR(list,b);
        for (Integer x: listl
             ) {
            System.out.println(x);
        }
        System.out.println("R");

        for (Integer x: listR
        ) {
            System.out.println(x);
        }


    }

}


