package graphics;

//��� 0���� Ŀ�߸� �Һ��ڰ� ������ �� �ְ�
//��� 3���� �������� �����ڰ� ���� �� ����.
class Buffer {
	   private int data = 0;
	   private boolean empty = true;

	   public synchronized int get() {
		  
		    while(data <=0) {
		 	   try {
		 	      wait();
		       }catch (InterruptedException e) {
		 	   }
		 	}
		  data--;
	      notifyAll();
	      return data;
	   }

	   public synchronized int put() {
	      
	    	  while(data >=3) {
	 	         try {
	 	            wait();
	 	           } catch (InterruptedException e) {
	 	           }
	    	  }
	      notifyAll();
	      data++;
	      return data;
	   }
	}

	class Producer implements Runnable {
	   private Buffer buffer;
	   private String name;
	   public Producer(String p,Buffer buffer) {  
	      this.name = p;
	      this.buffer= buffer;
	       
	   }
	   public void run() {
	      for (int i = 1; i < 4; i++) {
	           System.out.println(name+"("+i+")"+" ���="+buffer.put());
	           try {
	              Thread.sleep((int)(Math.random()*150));
	           } catch (InterruptedException e) {
	           }
	       }
	   }
	}

	class Consumer implements Runnable {
	   private Buffer buffer;
	   private String name;
	   public Consumer(String c, Buffer drop) {
	      this.name = c;
	      this.buffer= drop;
	   }
	      
	   public void run() {
	      for (int i = 1; i < 4; i++) {
	           System.out.println(name+"("+i+")"+" ���="+buffer.get());
	           try {
	              Thread.sleep((int)(Math.random()*300));
	           } catch (InterruptedException e) {
	           }
	        }
	   }
	}

	public class BufferTest{
	   public static void main(String[] args) {
	      Buffer buffer = new Buffer();
	       (new Thread(new Producer("p1",buffer))).start();
	       (new Thread(new Consumer("c1",buffer))).start();
	       (new Thread(new Producer("p2",buffer))).start();     
	       (new Thread(new Consumer("c2",buffer))).start();
	   }
	}