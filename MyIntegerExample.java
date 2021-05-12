import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyIntegerExample {
    public static void main(String[] args) {

        //проверка 1 класса
        List<MyInteger> numberList = new ArrayList<>();
        numberList.add(new MyInteger(34));
        numberList.add(new MyInteger(21));
        numberList.add(new MyInteger(9));
        numberList.add(new MyInteger(2));
        numberList.add(new MyInteger(123));

       Collections.sort(numberList);

       for (MyInteger number : numberList){
           System.out.println(number.getNumber());
       }

       //проверка 2 класса
        List<MyInteger2> numberList2 = new ArrayList<>();
        numberList2.add(new MyInteger2(34));
        numberList2.add(new MyInteger2(22));
        numberList2.add(new MyInteger2(9343546));
        numberList2.add(new MyInteger2(1241));
        numberList2.add(new MyInteger2(123));

        Collections.sort(numberList2);

        for (MyInteger2 number : numberList2){
            System.out.println(number.getNumber());
        }

    }
}
