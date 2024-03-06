package t1_array;

public class Rank1_3 {
	public static void main(String[] args) {
			//int[] no = {1,2,5,7,9}; 
			int[] s = {90,70,100,90,60};
			int[] rank = new int[s.length];
			
			// 순위에 초기값(1등) 부여하기
			for(int i=0; i<s.length; i++) {
				rank[i] = 1;
			}
			
			// 순위구하기
			// 자기 자신부터 비교를 시작(그러니 5번)
			for(int i=1; i<=s.length; i++) {
				for(int j=i+1; j<=s.length; j++) {
					if(s[i-1] < s[j-1]) rank[i-1]++;   
					else if (s[i-1] > s[j-1]) rank[j-1]++; 
				}
			}
			
			// 출력
			System.out.println("점수\t순위");
			System.out.println("===============");
			for(int i=0; i<s.length; i++) {
				System.out.println(s[i] +"\t"+ rank[i]); 
			}
	}
}
