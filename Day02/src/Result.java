import static java.lang.Math.round;

class Result {

    double meal_cost;
    int tip_percent;
    int tax_percent;
    static int  total_cost;


    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
double tip = (tip_percent/100.00)* meal_cost;
double tax  = (tax_percent/100.00)* meal_cost;
total_cost = (int) (meal_cost + tip + tax);
        System.out.println(total_cost);
//total = round(total);
    }

}


