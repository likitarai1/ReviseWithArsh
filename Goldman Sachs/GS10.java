import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		PriorityQueue<Integer> minh = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<6;i++){
		    Integer num = sc.nextInt();
		    minh.add(num);
		    if(minh.size()>5){
		        minh.poll();
		    }
		}
		System.out.println("\n");
 
		while(minh.size()!=0){
		    System.out.println(minh.poll());
		}
	}
}

// TC = O(K) {K = num of input}
// SC = O(N) {N = 10 (here)}