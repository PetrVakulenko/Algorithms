package String.JudgeRouteCircle_657;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        //First solution
        System.out.println(s.judgeCircle("LR"));   //true
        System.out.println(s.judgeCircle("LRUU")); //false
        
        //Second solution
        System.out.println(s.judgeCircle1("LR"));   //true
        System.out.println(s.judgeCircle1("LRUU"));   //true
    }
}
