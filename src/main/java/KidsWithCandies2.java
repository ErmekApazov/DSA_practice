import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies2 {

    public static void main(String[] args) {
        int[] candies = {1, 2, 3, 4, 5};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //create boolean list
        List<Boolean> result = new ArrayList<>();
        //find max of the array given
        int max = Arrays.stream(candies).max().getAsInt();
        //iterate and compare to max
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies > max) {
                result.add(true);
            } else result.add(false);
        }
        //return result
        return result;
    }


}
