/*
 * 메모리 사용량 측정 코드
 * 메모리와 관련된 기능은 Runtime class에서 제공
 * 각 Method들은 byte 단위의 메모리 양을 리턴
 * totalMemory : JVM에 Allocate된 메모리 사용량을 리턴 - 메모리 사용량에 맞춰서 가져옴(상대적)
 * freeMemory : JVM에 Allocate된 메모리 중, 사용 가능한 메모리 양을 리턴
 * maxMemory : JVM이 사용하려고 시도했던 가장 큰 메모리 양
 * 
 * 즉, maxMemory = totalMemory(usedMemory+freeMemory) + unlocatedMemory
 * usedMemory = totalMemory - freeMemory
 * totalFreeMemory = maxMemory - usedMemory
 */

public class MemoryTrace {
	public static void main(String[] args) {
		int mb = 1024 * 1024;
        
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
         
        System.out.println("##### Heap utilization statistics [MB] #####");
         
        //Print used memory
        System.out.println("Used Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:" + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
        
        // 가비지 컬렉터(Garbage Collector) / 해제 할 수 있는 메모리를 찾아서 반환하는 역할을 수행(메모리 정리)
        System.gc();
	}
}
