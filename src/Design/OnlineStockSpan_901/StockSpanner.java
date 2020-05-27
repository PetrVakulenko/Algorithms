package Design.OnlineStockSpan_901;

import java.util.*;

public class StockSpanner {
    private Stack<DailyQ> st;

    public StockSpanner() {
        st = new Stack<DailyQ>();
    }

    public int next(int price) {
        int res =1;
        while(!st.isEmpty()&&st.peek().price<=price){
            res+=st.pop().spanNum;
        }
        st.push(new DailyQ(price,res));
        return res;
    }

    public class DailyQ {
        public final int price , spanNum;
        public DailyQ(int price, int spanNum){
            this.price = price;
            this.spanNum = spanNum;
        }
    }
}
