import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList <Integer> list = new ArrayList <> ();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\GefoS\\IdeaProjects\\untitled\\src\\test.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add (Integer.valueOf(line));
        }
        System.out.println("Исходный массив имеет вид:");
        for (Integer i : list) {
            System.out.println (i);
        }
        list.sort((a, b) -> a.compareTo(b));
        System.out.println("Отсортированный массив имеет вид:");
        for (Integer i : list) {
            System.out.println (i);
        }
        br.close();
        //list.sort();
        System.out.println("mdaheh");
    }
}
