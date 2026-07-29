import java.util.ArrayList;

public class TrapWaterOptimal {
    static int trapWater(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size() - 1;
        int maximumWater = Integer.MIN_VALUE;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int trapWater = ht * width;
            maximumWater = Math.max(trapWater, maximumWater);
            // conditions
            if (lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }
        return maximumWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("The maximum water will be trapped = " + trapWater(height));
    }
}
