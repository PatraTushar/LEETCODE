public class Main {
    public static void main(String[] args) {
        // Integer List
        CustomArrayList<Integer> intList = new CustomArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        System.out.println("Integer List:");
        intList.print();  // Output: 10 20 30 40

        // Get an element at index 2
        int elementAtIndex2 = intList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2); // Output: 30

        // Remove element at index 1
        intList.remove(1); // Removes the element at index 1 (which is 20)
        System.out.println("Integer List after removal:");
        intList.print();  // Output: 10 30 40

        // Size of the list
        System.out.println("Current size of Integer list: " + intList.size()); // Output: 3

        // Clear the Integer list
        intList.clear();
        System.out.println("Integer List after clearing:");
        intList.print();  // Output: (empty list)

        // String List
        CustomArrayList<String> stringList = new CustomArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        System.out.println("String List:");
        stringList.print();  // Output: Apple Banana Cherry

        // Get an element at index 1
        String elementAtIndex1 = stringList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1); // Output: Banana

        // Remove element at index 0
        stringList.remove(0); // Removes the element at index 0 (which is "Apple")
        System.out.println("String List after removal:");
        stringList.print();  // Output: Banana Cherry

        // Size of the list
        System.out.println("Current size of String list: " + stringList.size()); // Output: 2

        // Clear the String list
        stringList.clear();
        System.out.println("String List after clearing:");
        stringList.print();  // Output: (empty list)
    }
}



