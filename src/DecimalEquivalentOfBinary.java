import java.util.LinkedList;

public class DecimalEquivalentOfBinary {
    public static void main(String arg[]) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(0);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(0);
        System.out.println(decimalOfBinary(linkedList));
    }

    private static int decimalOfBinary(LinkedList<Integer> linkedList) {
        int value = 0;
        int power = linkedList.size() - 1;
        for (int i = 0; i < linkedList.size(); i++) {
            value += linkedList.get(i) * Math.pow(2, power--);
        }
        return  value;
    }
}
