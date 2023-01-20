import java.util.ArrayList;

//Test to see if the methods you wrote work. The tester will tell you
//how many cases you passed, and what cases are wrong
public class Main {
	
	public static void main(String[] args) {
		Methods methods = new Methods();
		ArrayList<Integer> test1 = new ArrayList<Integer>();
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		
		resetArray(test1, 1);
		System.out.println("**** TEST 1A: REVERSE ****");
		System.out.println("INPUT:  " + test1);
		ArrayList<Integer> result = methods.reverseArray(test1);
		resetArray(test1, 1);
		System.out.println("Passed?: " + checkReverse(test1, result));
		System.out.println("OUTPUT: " + result);
		if(!checkReverse(test1, result)) {
			System.out.println("CORRECT OUTPUT: [8, 5, 5, 4, 9, 1, 3, 5]");
		}
		
		System.out.println();
		resetArray(test2, 2);
		System.out.println("**** TEST 1B: REVERSE ****");
		System.out.println("INPUT:  " + test2);
		result = methods.reverseArray(test2);
		resetArray(test2, 2);
		System.out.println("Passed?: " + checkReverse(test2, result));
		System.out.println("OUTPUT: " + result);
		if(!checkReverse(test2, result)) {
			System.out.println("CORRECT OUTPUT: [4, 9, 7, 1, 7, 1]");
		}
		
		System.out.println();
		resetArray(test1, 1);
		System.out.println("**** TEST 2A: CLEAR ****");
		System.out.println("GOAL: Clear all 5's");
		System.out.println("INPUT:  " + test1);
		result = methods.clearAllNums(test1, 5);
		System.out.println("Passed?: " + checkClear(result, 1));
		System.out.println("OUTPUT: " + result);
		if(!checkClear(result, 1)) {
			System.out.println("CORRECT OUTPUT: [3, 1, 9, 4, 8]");
		}
		
		System.out.println();
		resetArray(test2, 2);
		System.out.println("**** TEST 2B: CLEAR ****");
		System.out.println("GOAL: Clear all 1's");
		System.out.println("INPUT:  " + test2);
		result = methods.clearAllNums(test2, 1);
		System.out.println("Passed?: " + checkClear(result, 2));
		System.out.println("OUTPUT: " + result);
		if(!checkClear(result, 2)) {
			System.out.println("CORRECT OUTPUT: [7, 7, 9, 4]");
		}
		
		System.out.println();
		resetArray(test1, 1);
		System.out.println("**** TEST 3A: FIND MODE ****");
		System.out.println("INPUT:  " + test1);
		int mode = methods.findMode(test1);	
		System.out.println("Passed?: " + (mode == 5));
		System.out.println("OUTPUT: " + mode);
		if(mode!=5) {
			System.out.println("CORRECT OUTPUT: 5");
		}
		
		System.out.println();
		resetArray(test2, 2);
		System.out.println("**** TEST 3B: FIND MODE ****");
		System.out.println("INPUT:  " + test2);
		mode = methods.findMode(test2);	
		System.out.println("Passed?: " + (mode == 1));
		System.out.println("OUTPUT: " + mode);
		if(mode!=1) {
			System.out.println("CORRECT OUTPUT: 1");
		}
		
		System.out.println();
		resetArray(test1, 1);
		System.out.println("**** TEST 4A: SORT ****");
		System.out.println("INPUT:  " + test1);
		result = methods.sortArray(test1);
		System.out.println("Passed?: " + checkSort(result, 1));
		System.out.println("OUTPUT: " + result);
		if(!checkClear(result, 2)) {
			System.out.println("CORRECT OUTPUT: [1, 3, 5, 5, 5, 8, 9]");
		}
		
		System.out.println();
		resetArray(test2, 2);
		System.out.println("**** TEST 4B: SORT ****");
		System.out.println("INPUT:  " + test2);
		result = methods.sortArray(test2);
		System.out.println("Passed?: " + checkSort(result, 2));
		System.out.println("OUTPUT: " + result);
		if(!checkClear(result, 2)) {
			System.out.println("CORRECT OUTPUT: [1, 1, 4, 7, 7, 9]");
		}
		
	}
	
	private static void resetArray(ArrayList<Integer> test, int choice){
		if(choice == 1) {
			test.clear();
			test.add(5);
			test.add(3);
			test.add(1);
			test.add(9);
			test.add(4);
			test.add(5);
			test.add(5);
			test.add(8);
		}
		else if(choice == 2) {
			test.clear();
			test.add(1);
			test.add(7);
			test.add(1);	
			test.add(7);
			test.add(9);	
			test.add(4);
		}
		
	}
	private static boolean checkSort(ArrayList<Integer> array, int choice) {
		if(choice == 1) {
			int[] sorted = {1,3,5,5,5,8,9};
			int j = 0;
			if(array.size() == sorted.length) {
				for(Integer i: array) {
					if(i.intValue() == sorted[j]) {
						j++;
					}
					else {
						return false;
					}
				}
				return true;
			}
			return false;
		}
		else if(choice == 2) {
			int[] sorted = {1, 1, 4, 7, 7, 9};
			int j = 0;
			if(array.size() == sorted.length) {
				for(Integer i: array) {
					if(i.intValue() == sorted[j]) {
						j++;
					}
					else {
						return false;
					}
				}
				return true;
			}
			return false;
		}
		return false;
		
	}
	
	private static boolean checkClear(ArrayList<Integer> array, int choice) {
		if(choice == 1) {
			int[] correct = {3,1,9,4,8};
			int j = 0;
			if(array.size() == 5) {
				for(Integer i: array) {
					if(i.intValue() == correct[j]) {
						j++;
					}
					else {
						return false;
					}
				}
				return true;
			}
			return false;
		}
		else if(choice == 2) {
			int[] correct = {7,7,9,4};
			int j = 0;
			if(array.size() == 5) {
				for(Integer i: array) {
					if(i.intValue() == correct[j]) {
						j++;
					}
					else {
						return false;
					}
				}
				return true;
			}
			return false;
		}
		return false;
		
	}
	private static boolean checkReverse(ArrayList<Integer> array, ArrayList<Integer> reversed) {
			int j =0;
			if(array.size() == reversed.size()) {
				for(int i = array.size()-1; i>=0; i--) {
					if(!array.get(i).equals(reversed.get(j)))
						return false;
					else
						j++;
				}
				return true;
			}
			return false;
		
	}
}
