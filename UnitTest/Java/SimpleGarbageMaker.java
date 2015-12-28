package com.conissaunce.gcbook;
import java.util.HashMap;
public class SimpleGarbageMaker { 
  public static void main(String[] args) {
    System.out.println("InfoQ GC minibook test program");
    String stringDataPrefix = "InfoQ GC minibook test";
    {
      HashMap stringMap = new HashMap();
      for (int i = 0; i < 5000000; ++i) {
        String newStringData = stringDataPrefix + "index_" + i;
        stringMap.put(newStringData, String.valueOf(i));
      }
      System.out.println("MAP size: " + stringMap.size());
      for (int i = 0; i < 4000000; ++i) {
        String newStringData = stringDataPrefix + "index_" + i;
        stringMap.remove(newStringData);
      }
      System.out.println("MAP size: " + stringMap.size());
      System.gc();
    }
  } 
}
