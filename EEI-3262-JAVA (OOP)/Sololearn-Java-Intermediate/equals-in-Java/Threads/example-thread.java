// Threads
// Java is a multi-threaded programming language. This means that our program can make optimal use of available resources by running two or more components concurrently, with each component handling a different task.

// You can subdivide specific operations within a single application into individual threads that all run in parallel.

// The following diagram shows the life-cycle of a thread.


New Thread() ---> |New| -- Start() ---> |Runnable| -----> run()   
                    |                                       |
                    |                                       |
                    V                                       V
                  |Dead|<-----End of execution --------- |Running|
                    ^                                       |   
                    |                                       |
                    |                                       |
                  |Waiting| <----- Sleep(), wait() ---------|


There are two ways to create a thread.

1. Extend the Thread class
Inherit from the <b> Thread </b> class, override its run() method, and 
write the functionality of the thread in the run() method.

Then you can create a new object of your class and call it's <b>start()</b>
method to run the thread.

class Loader extends Thread {
  public void run() {
    System.out.println("Hello");
  }
}

class MyClass {
  public static void main(String[] args) {
    Loader obj = new Loader();
  }
}

As you can see, our Loader class extends the Thread class and override its run() method.

When we create the obj object ad call its Start() method, the run() 
method statements execute on a different thread.

Every Java thread is prioritized to help the operating system determine 
the order in which to schedule threads. The prioritise range from 1 to 10, with each thread defaulting to priority 5. You can set the thread prioriy with the <b>setPriority()</b> method.