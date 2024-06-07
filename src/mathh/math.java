package mathh;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//minimum or maximum of a string
//		int [] v = {4,3,234,5,1,2,3,4,0,-1,312};
//		
//		int min = v[0];
//		for(int i=0; i<v.length;i++) {
//			if (v[i]<min) {
//				min=v[i];
//			}
//		}
//		System.out.println(min+" is smallest");
		
//		//minimum
//		System.out.println(Math.min(5, .4));
//		
//		//maximum
//		System.out.println(Math.max(1, 9));
//		
//		
//		//power
//		System.out.println(Math.pow(2, 5));
//		
//		//squarerroot
//		System.out.println(Math.sqrt(81));
//		
//		//absolutevalue
//		System.out.println(Math.abs(-23));
//		
//		
//		//floor
//		System.out.println(Math.floor(3.7));
//		
//		
//		//ceil
//		System.out.println(Math.ceil(3.001));
//		
//		//round
//		System.out.println(Math.round(.3));
		
		
//		minimum or maximum of a string
		int [] v = {4,3,234,5,1,2,3,4,0,-1,312};
		
		int maxx = v[0];
		for(int i=0; i<v.length;i++) {
			if (v[i]>maxx) {
				maxx=v[i];
			}
		}
		System.out.println(maxx+" is smallest");
		
		switch(maxx) {
		case 312:
			System.out.println("nigggaaaaa " + maxx);
		break;
		
		case -1:
			System.out.println("moew");
		break;	
		
		default:
				System.out.println("batata");
				
		}
//		
		
		String name="flkajsdf";
		boolean ifnamehasA=name.contains("k");

		int result = ifnamehasA	? 1:0;
		switch(result) {
		case 1:
			System.out.println("Contains K");
			break;
			
		case 0:
			System.out.println("no K");
			break;
			
		default:
			System.out.println("this aint true or false");
		}
		
	}

}
