public class App {

	public static void main(String[] args) {
		
		System.out.println("\nScenario 1 : ");
		Students s=new Students(101,"Aditi Nikam","04/08/2002");
		Info info1=new Info();
		info1.display(s);

		Students s1=new Students(102,"Salonee Pathan","09/08/2002");
		Info info2=new Info();
		info2.display(s1);
		
		System.out.println("\n\nScenario 2 : ");
		Info info3=new Info();
		Students s2[]=info3.create();
		info3.show(s2);
		
		System.out.println("\n\nScenario 3 : ");
		Info info4=new Info();
		Students s3[]=info4.accept();
		info4.show(s3);
	}

}
