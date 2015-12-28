public class SyncMethod { 
  int counter;
public synchronized void incCounter() { 
      counter++;
}

public SyncMethod() { 
  counter = 0;
}

public static void main(String[] args) {
  SyncMethod syncObj = new SyncMethod();
  for(int i = 0; i < 10000000; i++)
     syncObj.incCounter();
}
}
