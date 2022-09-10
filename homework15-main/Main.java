import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Main
{
    public static void main (String[] args)
    {
        int[] arr1 = {5, -2, 4, 10, -22, 35, -14, 45};
        Map<Boolean, List<Integer>> res = Arrays.stream(arr1).boxed()
                .filter(x -> x != 0)
                .collect(Collectors.partitioningBy(x -> x > 0));
        System.out.println(res.get(true));
        System.out.println(res.get(false));
    }
}