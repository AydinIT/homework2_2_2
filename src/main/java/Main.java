import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();



        while (true){
            System.out.println("Enter 5 names for list A: ");
            listA.add(scanner.next());
            listA.add(scanner.next());
            listA.add(scanner.next());
            listA.add(scanner.next());
            listA.add(scanner.next());
            System.out.println(listA);

            System.out.println("Enter 5 names for list B: ");
            listB.add(scanner.next());
            listB.add(scanner.next());
            listB.add(scanner.next());
            listB.add(scanner.next());
            listB.add(scanner.next());
            System.out.println(listB);

            int sizeA = listA.size();
            int sizeB = listB.size();

            int indexA = 0;
            int indexB = sizeB - 1;

            while (indexA < sizeA || indexB >= 0) {
                if (indexA < sizeA) {
                    listC.add(listA.get(indexA++));
                }
                if (indexB >= 0) {
                    listC.add(listB.get(indexB--));
                }
            }
            System.out.println("list C before sort: " + listC);
            listC.sort(Comparator.comparingInt(String::length));
            System.out.println("list C after sort: " + listC);
        }

    }
}