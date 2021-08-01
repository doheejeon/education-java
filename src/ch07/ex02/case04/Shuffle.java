package ch07.ex02.case04;

public class Shuffle {
	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i] + "");	//숫자값을 섞기 전 01234가 출력 
		}
		
		for(int i = 0; i < 100; i ++) {		//100번섞을거라 100보다 작다.
			int n = (int)(Math.random() *5);
			
			int temp = nums[0];			//임시변수를 만들어 값을 먼저 백업해준다.
			nums[0] = nums[n];			//0번째값을 n번째값으로 바꾼다. 
			nums[n] = temp;				//14-16으로 카드를 섞는 작업을 마쳤다.
		}
		
		System.out.println();
		for(int num: nums)
			System.out.print(num +  " ");
	}

}
