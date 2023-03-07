public class Main {
    public static void main(String[] args) throws Exception {
        var rec = new Recursive();
        var max = 10;
        var result1 = rec.IterIncSum(max);
        var result2 = rec.IterDecSum(max);
        var result3 = rec.RecurHeadSum(max-1);
        var result4 = rec.RecurTailSum(max-1, 0);
    }
}
