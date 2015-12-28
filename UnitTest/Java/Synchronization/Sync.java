public class Sync { 
  int counter;
public void incCounter() { 
  synchronized(this) { 
      counter++;
  }
}

public Sync() { 
  counter = 0;
}

public static void main(String[] args) {
  Sync syncObj = new Sync();
  for(int i = 0; i < 10000000; i++)
     syncObj.incCounter();
}
}
