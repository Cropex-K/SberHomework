import java.util.Iterator;

public class Number implements Iterable<Integer>{

    private Integer numbers;

    public Number() {
    }

    public Number(Integer number) {
        this.numbers = number;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumberIterator();
    }

    public class NumberIterator implements Iterator<Integer>{

        private int position;

        @Override
        public boolean hasNext() {
            int prov = numbers;
            for (int i =0; i<position; i++){
                prov /=10;
            }
            return prov!=0;
        }

        @Override
        public Integer next() {
            int res = numbers;
            for (int i =0; i<position; i++){
                res /=10;
            }
            res %=10;
            position+=1;
            return res;
        }
    }
}
