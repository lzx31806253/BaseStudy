package BaseDemoOne;

public class TestLamda  {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        new Thread( ()->System.out.println("执行lamda")).start();



    }

}
