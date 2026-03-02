import java.util.LinkedList;
public class AddTwoNumbers {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        l1.add(5);
        l1.add(4);
        l1.add(3);

        l2.add(3);
        l2.add(1);

        int carryBit = 0;
        int i = 0;
        while (i< l1.size() || i< l2.size() || carryBit != 0) {
            int sum = carryBit;

            if(i<l1.size()){
                sum+=l1.get(i);
            }
            if(i<l2.size()){
                sum+= l2.get(i);
            }
            result.add(sum %10);
            carryBit = sum/10;
            i++;
        }
        System.out.println(result);
    }
}