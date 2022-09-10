import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Osnova{
    public static void main(String[] args) {
        try {
            List<Integer> l5 = new ArrayList<>();
            l5.add(new Random().nextInt(100));
            l5.add(new Random().nextInt(100));
            System.out.println(l5);
            Stream st = l5.stream().filter(x-> x % 2 == 0);
            List<Integer> result = new ArrayList<>((Collection) st.collect(Collectors.toList()));
            System.out.println("Result");
            Scanner sc = new Scanner(System.in);
            System.out.println("Type text length");
            int x = sc.nextInt();
            Checker checklength = l -> l.length() < x;
            Checker checktext = l -> l.contains("o");
        }
        catch (Exception e) {
            System.out.println("Try again");
        }
    }
}
