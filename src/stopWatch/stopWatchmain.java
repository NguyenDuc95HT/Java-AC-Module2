package stopWatch;

import java.util.Random;

public class stopWatchmain {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println(rd.nextInt(100000));
        int[] arr = new int[100000];
        for (int i = 0; i < 100000 ; i++) {
            arr[i] = rd.nextInt(100000);
            System.out.println(arr[i]);
        }
        System.out.println("========");
        stopWatch st = new stopWatch();
        st.start();
        int tem;
        for(int i = 0; i < 100000; i++) {
            for (int j = i; j < 100000; j++) {
                if(arr[i] > arr[j]) {
                    tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }

            System.out.println(arr[i]);
        }
        st.stop();
        System.out.println("time: " + st.getElapsedTime());

    }
}
