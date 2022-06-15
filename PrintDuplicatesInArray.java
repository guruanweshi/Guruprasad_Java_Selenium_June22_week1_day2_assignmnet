package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int size = arr.length;
		
		for(int x=0;x<size;x++){
			int count=0;
			for(int y=(x+1);y<size;y++) {
				if (arr[x] == arr[y]) {
					count++;
				}
				
				}	
			if (count!=0) {
				System.out.println(arr[x] + " has duplicate entry in the array");
				}
		}

	}

}
