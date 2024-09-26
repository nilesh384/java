public class PriorityOfThread{
    public static void main(String[] args) throws Exception {
        
       

        Thread t1 = new Thread(() -> {
            for (int i=0; i<5; i++) {                                      //using lamda expression
                System.out.println("Hi"+ Thread.currentThread().getPriority());
                try{Thread.sleep(500);}catch(Exception e){}
            }
        }, "Hi Thread");
        
        t1.setPriority(Thread.MAX_PRIORITY);
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
        
        t2.setPriority(2);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Priority of t1 is: "+t1.getPriority());
        System.out.println("Priority of t2 is: "+t2.getPriority());
    }
}
