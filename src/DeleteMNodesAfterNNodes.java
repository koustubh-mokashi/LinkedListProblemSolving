import java.util.LinkedList;

public class DeleteMNodesAfterNNodes {
    public static void main(String args[]) {
        int m = 2;
        int n = 2;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        System.out.println(deleteMNodesAfterN(linkedList, m, n));
        ;
    }

    private static LinkedList<Integer> deleteMNodesAfterN(LinkedList<Integer> linkedList, int m, int n) {
        int j = m;
        boolean flag = true;
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int index = 0; index < linkedList.size(); index++) {
            if (j == 0) {
                flag = !flag;
                j = flag ? m : n;
            }
            if (flag) {
                resultList.add(linkedList.get(index));
            }
            j--;
        }
        return resultList;
    }
}
