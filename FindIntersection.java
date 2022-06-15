package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		for(int x=0;x<6;x++){
			for(int y=0;y<6;y++) {
				if (arr1[x] == arr2[y]) {
					System.out.println(arr1[x]);
				}
			}
		}

	}

}
