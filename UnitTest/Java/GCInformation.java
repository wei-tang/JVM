import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
public class GCInformation {
  public static void main(String[] args) {
    List<GarbageCollectorMXBean> gcMxBeans =
         ManagementFactory.getGarbageCollectorMXBeans();
    for (GarbageCollectorMXBean gcMxBean : gcMxBeans) {
     System.out.println(gcMxBean.getName());
    }
  } 
}
