public interface QuadFunction<T,U,S,F,R> {
    R apply(T t, U u, S s, F f);

}
//лямбда:
// QuadFunction<Integer,Integer,Integer,Integer,Integer> q = (Integer a,Integer b, Integer c, Integer d)->a+b+c+d;

