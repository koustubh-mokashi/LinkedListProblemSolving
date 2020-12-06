import java.util.Collections;
import java.util.LinkedList;

public class AddToNumberRepresentedAsLinkedList {
    public static void main(String ar[]) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(9);
        numberList.add(9);
        numberList.add(9);
        System.out.println(addOneToList(numberList,1));
    }

    private static LinkedList<Integer> addOneToList(LinkedList<Integer> numberList, int value) {
        Collections.reverse(numberList);
        for(int index = 0; index < numberList.size();index++) {
            int currentValue = numberList.get(index) + value;
            value = currentValue / 10;
            currentValue = currentValue % 10;
            numberList.set(index, currentValue);
        }
        Collections.reverse(numberList);
        return  numberList;
    }

}
