public class MyInteger implements Comparable<MyInteger>{

    private Integer number;

    public MyInteger() {
    }

    public MyInteger(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public int compareTo(MyInteger o) {
        int result = Integer.compare(this.findCountDivisor(),o.findCountDivisor());
        if (result == 0){
            return number.compareTo(o.number);
        }
        else {
            return result;
        }
    }

    public int findCountDivisor(){
        int count = 0;
        for(int i = 1; i <= this.getNumber(); i++){
            if ((this.getNumber() % i) == 0){
                count++;
            }
        }
        return count;
    }
}
