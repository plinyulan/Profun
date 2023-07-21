public class Lab_660845 {
    public static void main(String[] argS ) {
        int [] arr = {1,2,2,2,3,3,3,3};
        int maxCnt = Integer.MIN_VALUE;
        int mem = arr[0];
        int cur = arr[0];
        int curCnt = 1 ;
        int mode = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {
            cur = arr[i];
            if (cur==mem) {
                curCnt++;
            } else {
                if (curCnt>maxCnt){
                    mode = mem ;
                    maxCnt = curCnt;
                }
                    mem = cur ;
                    curCnt = 1;
            }
        }
        if (curCnt>maxCnt){
            mode = cur ;
        maxCnt = curCnt ;
        }
        System.out.println("mode = " + mode);
        System.out.println("freq = " + maxCnt);
}
}
