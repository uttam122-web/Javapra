package lambdaexperssion;

public class bankdetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = (int bal,String name)-> {
			System.out.println("Hello  " + name);
			  int k= bal+5000;
			  System.out.println("your balance is" + k);
			  return k;
		};
			
		int r = b.getDeposite(8000,"Uttam");

	}

}
