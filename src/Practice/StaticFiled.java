package Practice;

public class StaticFiled {
        // A static field
        static int sharedValue = 0;

        // A non-static field
        int instanceValue = 0;

        public static void main(String[] args) {
            StaticFiled obj1 = new StaticFiled();
            StaticFiled obj2 = new StaticFiled();

            // Accessing the static field using the class name
            StaticFiled.sharedValue = 5;

            // Accessing the non-static field using instances
            obj1.instanceValue = 10;
            obj2.instanceValue = 20;

            // Displaying the values
            System.out.println("Static field (sharedValue): " + StaticFiled.sharedValue); // Output: 5
            System.out.println("Object 1 instanceValue: " + obj1.instanceValue); // Output: 10
            System.out.println("Object 2 instanceValue: " + obj2.instanceValue); // Output: 20
        }
}
