public class Recursive {

    public int IterIncSum(int max) {
        int sum = 0;
        // start i=0 end i=max-1 iter i=i+1
        for (int i=0; i<max; i=i+1) {
            // result cur_sum = prev_sum + i
            sum = sum + i;
        }
        return sum;
    }

    public int IterDecSum(int max) {
        var sum = 0;
        // start i=max-1 end i=0 iter i=i-1
        for (int i=max-1; i>=0; i=i-1) {
            // result cur_sum = prev_sum + i
            sum = sum + i;
        }
        return sum;
    }

    // index start i = max-1
    public int RecurHeadSum(int i) {
        if (i==0)
            // index end i = 0 result start sum = 0
            return 0;
        else
            // result inc sum = sum+i with index dec i = i-1
            return RecurHeadSum(i - 1) + i;
    }

    // index start i = max-1, result start sum = 0
    public int RecurTailSum(int i, int sum){
        if (i == 0)
            // index end i = 0, result end sum = sum
            return sum;
        else
            // result inc sum = sum+i with index dec i = i-1
            return RecurTailSum(i -1, sum + i);
    }
}
