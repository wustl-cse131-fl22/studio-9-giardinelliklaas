package studio9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	
//	public int majorityElement(int[] nums) {
//        TreeSet <Integer> freq = new TreeSet <Integer>();
//        for(int i = 0; i < nums.length; i++){
//            freq.add(nums[i]);
//        }
//        int [] freArray = freq.toArray();
//        int [] numFreq = new int [freq.size()];
//        for(int i = 0; i < nums.length; i++){
//            for(int j = 0; j < nums.length; j++){
//                if(freq. == nums[j]){
//                    numFreq[i]++;
//                }
//            }
//        }
//        
//    }
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name = "";
		int height = 0;
		
		Map<String, Integer> index = new HashMap<>();

		for(int i = 0; i < 4; i++) {
		System.out.println("what is your name? ");
		name = in.next();
		
		System.out.println("what is your height? ");
		height = in.nextInt();
		
		index.put(name, height);
		}
		
		System.out.println(index);
		
	}
}
