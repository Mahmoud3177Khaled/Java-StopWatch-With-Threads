package sec.example.stopwatch;

public class stopwatch extends Thread{

    int s = 0;
	int m = 0;
	int h = 0;
	
	@Override
	public void run() {
        while (h != 24) { 
            System.out.println();
                
            System.out.print(h);
            System.out.print(':');

            System.out.print(m);
            System.out.print(':');

            System.out.print(s);
            
            s += 1;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("failed");
            }
            
            if(s == 60) {
                s = 0;
                m += 1;
            } else if (m == 60) {
                m = 0;
                h += 1;
            } else if (h == 24) {
                s = 0;
                m = 0;
                h = 0;
            }
        }
    }
}
