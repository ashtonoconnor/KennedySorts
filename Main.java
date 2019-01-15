import java.util.ArrayList;

public class Main {

	public static void  main(String[] args) {
		//int list[]  = {5,8,1,6,9,2};
		ArrayList<Integer> list = new ArrayList();
		list.add(5);  
		list.add(8);
		list.add(1);
		list.add(6);
		list.add(9);
		list.add(2);
				
	for (int i = 0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	list = insertionSort(list);
	//list = bubbleSort(list);
	//list = mergeSort(int[] list, int lowIndex, int highIndex);
	System.out.println("");
	for ( int i =0; i<list.size(); i++) {
		//System.out.println(list[i]);
		System.out.println(list.get(i));
	}
	}
	
	
	
	
	
	
	/*
	public static int[] bubbleSort (int[] list) {
		int i,j,temp = 0;
		for (i = 0; i <list.length - 1; i++) {
			for(j = 0; j < list.length - 1; j++) {
				if (list[j] < list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
				
			}
		
		
		}
		return list;
		
	}
	
	*/
	
	
	
	
	
	public static int[] insertionSort(int[] list) {
		int i,j,key,temp;
		for (i=1; i<list.length; i++) {
			key = list[i];
			j = i-1;
			while (j>=0 && key<list[j]) { // swap elements
				temp = list[j];
				list[j] = list[j+1];
				list[j+1] = temp;
				j--;
				
		}
		}
			return list;
	}
	

	public static ArrayList<Integer> insertionSort (ArrayList<Integer> list) {
		int i,j,key,temp;
		for (i=1; i<list.size(); i++) {
			key = list.get(i);
			j = i-1;
			while (j>=0 && key < list.get(j)) {
				temp = list.get(j);
				list.set(j, list.get(j+1));
				list.set(j+1, temp);
				j--;
			
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void mergeSort (int[] list, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			return;
		} else {
			int midIndex = (lowIndex + highIndex)/2;
			mergeSort(list,lowIndex, midIndex);
			mergeSort(list, midIndex +1, highIndex);
			merge(list, lowIndex, midIndex+1, highIndex);
		}
	}



		
	    @SuppressWarnings("null")
		private void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
		// TODO Auto-generated method stub
	    	int[] tempMergArr = null;
	    	int[] array = null;
	        for (int i = lowIndex; i <= highIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowIndex;
	        int j = midIndex + 1;
	        int k = lowIndex;
	        while (i <= midIndex && j <= highIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= midIndex) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	    }

}
	



//581692
