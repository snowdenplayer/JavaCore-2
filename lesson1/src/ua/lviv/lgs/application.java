package ua.lviv.lgs;

public class application {
	public static void main(String[] args) {
//		byte a1 = 12;
//		short sm = 23;
//		int in = 56;
//		long lo = 1254l;
//		float fl = 25.36f;
//		double dou = 236.3;
//		char ch = 'h';
//		boolean pravda = true; 
		
		
//		System.out.println("Byte Max = "+ Byte.MAX_VALUE);
//		System.out.println("Byte Min ="+ Byte.MIN_VALUE);
//		System.out.println("Short Max = "+ Short.MAX_VALUE);
//		System.out.println("Short Min ="+ Short.MIN_VALUE);
//		System.out.println("Integer Max = "+ Integer.MAX_VALUE);
//		System.out.println("Integer Min ="+ Integer.MIN_VALUE);
//		System.out.println("Long Max = "+ Long.MAX_VALUE);
//		System.out.println("Long Min ="+ Long.MIN_VALUE);
//		System.out.println("Float Max = "+ Float.MAX_VALUE);
//		System.out.println("Float Min ="+ Float.MIN_VALUE);
//		System.out.println("Double Max = "+ Double.MAX_VALUE);
//		System.out.println("Double Min ="+ Double.MIN_VALUE);
//		System.out.println("Character Max = "+ Character.MAX_VALUE);
//		System.out.println("Character Min ="+ Character.MIN_VALUE);

		
		int[] array = new int[12];
		for (int i = 0; i < array.length; i++) {
		    array[i] = ((int)(Math.random() *30+1));
		    System.out.println(array[i]);
		    
		}
		
		int k=0,m=array[0];
		for (int j = 0; j < array.length; j++) {
			
			if(k<array[j]) {
				k=array[j];
			}
			if(m>array[j]) {
				m=array[j];
			}
		}
			System.out.println("Max = "+ k);
			System.out.println("Min = "+ m);
		
	}

}
