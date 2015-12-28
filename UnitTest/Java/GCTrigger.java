public class GCTrigger {
  
private int[] int_array;

public void init(int i) { 
  int_array = new int[i+1];
}

public int getValue(int i) { return int_array[i]; }
public static void main(String[] args) { 
  GCTrigger tmp = new GCTrigger(); 
  for(int i = 0; i < 1000; i++) { 
    if(i < 500)
        tmp.init(i);
    else 
        tmp.init(Integer.MAX_VALUE>>2);
  }
}
}
