package homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
        System.out.print("Choose operation: 1 - Add contact, 2 - Search number: ");
        Integer oper = in.nextInt();
        if (oper == 1) {
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            System.out.print("Enter name: ");
            String name = in.next();
            System.out.print("Enter phone number: ");
            int phoneNumber = in.nextInt();
            phoneNumbers.add(phoneNumber);
            hashMap.put(name, phoneNumbers);
        }
        else if (oper == 2) {
            System.out.print("Enter name: ");
            String searchname = in.next();
            for (Map.Entry<String, ArrayList<Integer>> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                ArrayList<Integer> value = entry.getValue();
                if (key == searchname) {
                    System.out.println(value);
                }
            }
        }
    }
}

    

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.