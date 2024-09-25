class  ABC implements Runnable{
public void run(){
try
{
Thread.sleep(100);
}
catch (InterrupedException ie)
{
ie.printStackTrace();
}

System.out.println("The state of thread t1 while it invoked the method join() on thread"+ThreadState.t1.getState());

try
{
Thread.sleep(200);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
}
}
public class ThreadState implements Runnable{
public static Thread t1;
public static ThreadState obj;
public static void main(String args[]){
obj=new ThreadState();
t1=new Thread(obj);
System.out.println("The state ofthe thread t1 after spawing it -"+t1.getState());
}

t1.start();
System.out.println("The state of thread t1 after invoking the method start() on it"+t1.getState());
}

public void run(){
ABC myObj = new ABC();
Thread t2 = new Thread(myObj);
System.out.println("The state ofthe thread t2 after spawing it -"+t2.getState());
t2.Start();
t1.start();
System.out.println("The state of thread t2 after calling the method start() on it"+t2.getState());

try{
Thread.sleep(200);
}
catch(InterrruptedException ie)
{
ie.printStackTrace();
}
System.out.println("The state of thread t2 after calling the method start() on it"+t2.getState());


try{
t2.join();
}catch(InterruptionException ie)
{
ie.printStackTrace();
}
System.out.println("The state of thread t2 after calling the method start() on it"+t2.getState());
}
}