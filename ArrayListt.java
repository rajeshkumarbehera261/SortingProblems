import java.util.ArrayList;
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(14);
        list.add(17);
        list.add(19);
        list.add(21);

        System.out.println("Array list: "+ list);
        System.out.println("Reversed Array list: "+ list.reversed());
        
        System.out.println(list.contains(45));
    }
}
