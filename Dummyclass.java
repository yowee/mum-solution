public class Dummyclass {

	public static void main(String[] args) {
		int example2 = isSequencedArray(new int[] {1,3,4,2,5},1,5);
		int example1 = isSequencedArray(new int[] {1, 2, 3, 4, 5},1,5);
		int example3 = isSequencedArray(new int[] {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2},-5,-2);
		int example4 = isSequencedArray(new int[] {0, 1, 2, 3, 4, 5},1,5);
		int example5 = isSequencedArray(new int[] {1, 2, 3, 4},1,5);
		int example6 = isSequencedArray(new int[] {1,2,5},1,5);
		System.out.println("Exmaple 1: "+ example1);
		System.out.println("Exmaple 2: "+ example2);
		System.out.println("Exmaple 3: "+ example3);
		System.out.println("Exmaple 4: "+ example4);
		System.out.println("Exmaple 5: "+ example5);
		System.out.println("Exmaple 6: "+ example6);
	}
	
	static int isSequencedArray(int[ ] a, int m, int n) {
		if(a[0] != m || a[a.length-1]!= n) return 0;
		
		for (int i = 1; i < a.length-1; i++) {
			if(a[i+1]-a[i] != 0 && a[i+1]-a[i]!=1) return 0;
		}
		
		return 1;
	}

}
