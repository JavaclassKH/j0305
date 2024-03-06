package t1_array;

// 순위를 구한 후 순위 순서대로 출력하시오.
public class Rank1_2 {
	public static void main(String[] args) {
			int[] no = {1,2,5,7,9}; 
			int[] s = {90,70,100,90,60};
			int[] rank = new int[s.length];
			int temp = 0;
			
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
			
			// 원본자료 출력(출력1)
			System.out.println("===>> 원본자료 출력");
			System.out.println("점수\t순위");
			System.out.println("===================");
			for(int i=0; i<s.length; i++) {
				System.out.println(no[i] + " \t " + s[i] + " \t " + rank[i]); 
			}
			System.out.println();
			
			// 순위순 오름차순 정렬처리
			
			for(int i=1; i<=s.length-1; i++) {
				for(int j=i+1; j<=no.length; j++) {
					if(rank[i-1] > rank[j-1]) {
						temp = rank[i-1];  rank[i-1] = rank[j-1];  rank[j-1] = temp;
						temp = no[i-1];  no[i-1] = no[j-1];  no[j-1] = temp;
						temp = s[i-1];  s[i-1] = s[j-1];  s[j-1] = temp;
					}
				}		
			}		

			// 순위순 자료 출력(출력2)
			System.out.println("===>> 순위순 정렬자료 출력");
			System.out.println("점수\t순위");
			System.out.println("===================");
			for(int i=0; i<s.length; i++) {
				System.out.println(no[i] + " \t " + s[i] + " \t " + rank[i]); 
			}
	}
}
