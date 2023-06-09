import java.util.Arrays;

	public static void main(String[] args) {
		
		int[] arr = {1,3,7,2,6,5,0,9,8};
		System.out.print("Cho mảng: ");
		for(int i : arr) System.out.print(i + " ");
		
		String str1 = "";
		String str2 = "";
		for(int i : arr) {
			if(SoNguyenTo(i)) str1 += i;
			else str2 += i;
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		int[] arr1 = new int[arr.length];
		for(int i = 0; i < ch1.length; i++) {
			arr1[i] = Integer.parseInt(String.valueOf(ch1[i]));
		}
		for(int i = 0; i < ch2.length; i++) {
			arr1[ch1.length + i] = Integer.parseInt(String.valueOf(ch2[i]));
		}
		
		System.out.println("\nMảng sau khi tìm và sắp xếp: ");
		for(int i : arr1) System.out.print(i);
	}
	public static boolean SoNguyenTo(int n) {
		if(n < 0)
			return false;
		else if(n < 2)
			return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

