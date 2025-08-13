import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximumCandiesAChildAlreadyHas = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            maximumCandiesAChildAlreadyHas = Math.max(candy, maximumCandiesAChildAlreadyHas);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= maximumCandiesAChildAlreadyHas);
        }
        return result;
    }
}