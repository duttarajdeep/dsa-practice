package dsa.main.hashing;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(1, "Harry");
        System.out.println("Hashtable Size: " + table.size());

        table.put(2, "Ron");
        System.out.println("Hashtable Size: " + table.size());

        table.put(3, "Hermione");
        System.out.println("Hashtable Size: " + table.size());

        table.put(4, "Voldemort");
        System.out.println("Hashtable Size: " + table.size());

        table.put(11, "Dumbledore");
        System.out.println("Hashtable Size: " + table.size());

        int key = 11;
        System.out.println("Key: " + key + ", Value: " + table.get(key));

        System.out.println("Removing Key: " + key + ", Value returned is: " + table.remove(key));

        System.out.println("Hashtable Size: " + table.size());
        System.out.println("Key: " + key + ", Value: " + table.get(key));
    }
}
