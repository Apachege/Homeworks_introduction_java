import java.util.HashSet;

import javax.swing.DefaultListModel;

public class main {
    public static void main(String[] args) {
        Laptop dell1 = new Laptop("dell", "xps13", 8, 256, "windows 8.1", "grey");
        Laptop apple1 = new Laptop("apple", "macbook air 13", 8, 256, "macos", "grey");
        Laptop asus1 = new Laptop("asus", "zenbook 13", 8, 512, "windows 10", "blue");
        Laptop google1 = new Laptop("google", "pixelbook go", 8, 64, "chrome os", "black");
        Laptop acer1 = new Laptop("acer", "conceptd 7 pro",  32, 2048, "windows 10", "white");
        Laptop hp1 = new Laptop("hp", "spectre x360 13", 8, 256, "windows 11", "grey");
        HashSet<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(dell1);
        laptopSet.add(apple1);
        laptopSet.add(asus1);
        laptopSet.add(google1);
        laptopSet.add(acer1);
        laptopSet.add(hp1);
        System.out.println(laptopSet);
    }
}
