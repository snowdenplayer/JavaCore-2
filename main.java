package ua.lviv.lgs;

public class main {
	public static void main(String[] args) {
		rectangle kvadrat = new rectangle(10.02f,58.3f);
		System.out.println("Area = "+ kvadrat.getArea());
		System.out.println("Perymetr = "+ kvadrat.getPerymetr());
		rectangle kvadrat2 = new rectangle();
		System.out.println("Area = "+ kvadrat2.getArea());
		System.out.println("Perymetr = "+ kvadrat2.getPerymetr());


	}
}
