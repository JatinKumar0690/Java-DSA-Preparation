//Find maximum in an arrayList

import java.util.ArrayList;

public class MaximumNum {
    static int maximumNum(ArrayList<Integer> List) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < List.size(); i++) {
            maximum = Math.max(maximum, List.get(i));
        }
        return maximum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(10);
        List.add(6);
        List.add(9);
        System.out.println("The maximum number will be " + maximumNum(List));
    }
}
