package Utils;

import java.util.Collection;

public class Converter {
    public static int[] listToArray(Collection<Integer> list)
    {
        int[] res = new int[list.size()];
        int c = 0;
        for(int x : list) res[c++] = x;

        return res;
    }
}
