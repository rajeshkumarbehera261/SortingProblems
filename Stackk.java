import java.util.*;
/* public class Stackk {
    public static void pushAttheBottom(Stack<Integer> s, int data){
        //base condition
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAttheBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3); // 3 2 1
        
        pushAttheBottom(s,4); // 4 
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
 */
public class Stackk {
    // Reverse a string using stack
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        Stack<Character> s = new Stack<>();
        for(int i =0; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}