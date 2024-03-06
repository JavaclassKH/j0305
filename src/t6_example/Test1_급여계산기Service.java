package t6_example;

public class Test1_급여계산기Service {
	
	int bonbongCheck(String code) {
		if(code.toUpperCase().equals("B")) return 5000000;
		else if(code.toUpperCase().equals("K")) return 4000000;
		else if(code.toUpperCase().equals("D")) return 3000000;
		else if(code.toUpperCase().equals("S")) return 2000000;	
		else return 0;
	}
	
	int sudanglastCheck(int overTime , int sudang) {
		int sudanghap;
		sudanghap = overTime * sudang;
		return sudanghap;
	}	
	int gongjeCheck(int bonbong , int sudang) {
		int gongjehap;
		gongjehap = (bonbong + sudang) / 10;
		return gongjehap;
	}
	int netpayCheck(int bonbong , int sudang , int gongje) {
		int netpayhap;
		netpayhap = (bonbong + sudang) - gongje;
		return netpayhap;
	}
	void pr(String name , int netpay) {
		System.out.println(name+"님의 실수령액은 "+netpay+"입니다.");
	}	
}