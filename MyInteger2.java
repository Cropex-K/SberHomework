import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MyInteger2 implements Comparable<MyInteger2>{

        private Integer number;

    public MyInteger2() {
        }

        public MyInteger2(Integer number) {
            this.number = number;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        @Override
        public int compareTo(MyInteger2 o) {
            int result = Integer.compare(this.findDiffNumb(),o.findDiffNumb());
            if (result == 0){
                return number.compareTo(o.number);
            }
            else {
                return result;
            }
        }

        public int findDiffNumb() {

            HashSet<Integer> numb = new HashSet<>();
            int res = number;

            while (res > 10) {
                if (!numb.contains(res % 10)){
                    numb.add(res % 10);
                }
                res /= 10;
            }

            if (!numb.contains(res)){
                numb.add(res);
            }
            return numb.size();
        }

}


