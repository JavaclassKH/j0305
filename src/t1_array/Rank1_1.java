package t1_array;

public class Rank1_1 {
	public static void main(String[] args) {
			int[] s = {50,70,100,90,80};
			int[] rank = new int[s.length];
			
			
			// 순위구하기
		 // 자기 자신부터 비교를 시작(그러니 5번)
			for(int i=1; i<=4; i++) {
				rank[i-1] = 1;
				for(int j=1; j<=s.length; j++) {
					if(s[j-1] > s[i-1]) rank[i-1]++;   
				}
			}
			System.out.println("점수\t순위");
			System.out.println("========================");
			for(int i=1; i<s.length; i++) {
				System.out.print(s[i] +"\t"+ rank[i]);
			}
	}
}
