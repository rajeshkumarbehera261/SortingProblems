public class GenaricClassExample {
    public static class Box<T> {
        private T value;
        
        //setter method
        public void set(T value){
            this.value = value;
        }
        //getter method
        public T get(){
            return value;
        }
        
    }
    public static void main(String[] args) {
        Box<Integer> obj1 = new Box<>();
        obj1.set(10);
        System.out.println(obj1.get());

        Box<String> obj2 = new Box<>();
        obj2.set("Rajesh Kumar Behera");
        System.out.println(obj2.get());
    }
}
