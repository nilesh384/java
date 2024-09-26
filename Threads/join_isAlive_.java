public class join_isAlive_ {
    public static void main(String[] args) throws Exception {
        Runnable hi = new Runnable() {
            public void run() {
                for (int i=0; i<5; i++) {
                    System.out.println("Hi");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        };

        Runnable hello = new Runnable() {
            public void run() {
                for (int i=0; i<5; i++) {
                    System.out.println("Hello");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        };

        Thread t1 = new Thread(hi);        
        Thread t2 = new Thread(hello);
        
        t1.start();
        try{Thread.sleep(50);}catch(Exception e){}
        t2.start();

        System.out.println(t1.isAlive());

        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
    }
}
