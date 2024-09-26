public class namingAThread {
    public static void main(String[] args) throws Exception {
        
       

        Thread t1 = new Thread(() -> {
            for (int i=0; i<5; i++) {                                      //using lamda expression
                System.out.println("Hi");
                try{Thread.sleep(500);}catch(Exception e){}
            }
        }, "Hi Thread");
        t1.start();

        try{Thread.sleep(50);}catch(Exception e){}

        Runnable hello = new Runnable() {
            public void run() {
                for (int i=0; i<5; i++) {                                 // not using lamda expression
                    System.out.println("Hello");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        };

        Thread t2 = new Thread(hello, "Hello Thread");        
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
