public class SyncNo { 
  int counter;
public void incCounter() { 
      counter++;
}

public SyncNo() { 
  counter = 0;
}

public static void main(String[] args) {
  SyncNo syncObj = new SyncNo();
  for(int i = 0; i < 10000000; i++)
     syncObj.incCounter();
}
}
