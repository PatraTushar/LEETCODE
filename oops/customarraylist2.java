public class Main {
    public static void main(String[] args) {
        // Step 1: Create an instance of CustomArrayList
        CustomArrayList list = new CustomArrayList();

        // Step 2: Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Step 3: Print the elements using the print method
        System.out.println("List contents:");
        list.print();  // Output: 10 20 30 40

        // Step 4: Get and print an element at a specific index
        int elementAtIndex2 = list.get(2);  // Should return 30
        System.out.println("Element at index 2: " + elementAtIndex2); // Output: 30

        // Step 5: Remove an element at a specific index
        list.remove(1); // Removes the element at index 1 (which is 20)
        System.out.println("List after removing element at index 1:");
        list.print();  // Output: 10 30 40

        // Step 6: Check the size of the list
        System.out.println("Current size of the list: " + list.size()); // Output: 3

        // Step 7: Clear the list
        list.clear();
        System.out.println("List after clearing:");
        list.print();  // Output: (empty list)
    }
}
