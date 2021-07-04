public interface TriFunction<T,U,S,R> {
    R apply(T t, U u, S s);
}
//лямбда
// TriFunction<Integer,Integer,Integer,Integer> t = (Integer a,Integer b, Integer c)->a+b+c;