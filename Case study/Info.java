import java.util.Scanner;

public class Info {
	
	public Info() {
		
	}
	
	public Students[] create() {
		
		int id;
		String name;
		String dob;
		Students s1[]=new Students[5];
		for(int i=0;i<5;i++) {
			id=(i+1);
			name="name"+(i+1);
			dob="0"+(i+1)+"/09/2002";
			Students s2=new Students(id,name,dob);
			s1[i]=s2;
		}
		
		return s1;
		
	}
	
	public Students[] accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number of students : ");
		int no=sc.nextInt();
		Students s1[]=new Students[no];
		for (int i=0;i<s1.length;i++) {
			System.out.println("\nEnter the id,name,dob of student "+(i+1));
			int id=sc.nextInt();
			String name=sc.next();
			String dob=sc.next();
			Students s2=new Students(id,name,dob);
			s1[i]=s2;
		}
		sc.close();
		return s1;
	}
	
	public void display(Students s) {
		
		System.out.println("\n\tId :       "+s.getId());
		System.out.println("\tName :     "+s.getName());
		System.out.println("\tDOB :      "+s.getBdate());
		
	}
	
	public void show(Students s1[]) {
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\tId\t\tName\t\tDOB");
		System.out.println("------------------------------------------------------------------------");
		for(int i=0;i<s1.length;i++) {
			System.out.println("\n\t"+s1[i].getId()+"\t\t"+s1[i].getName()+"\t\t"+s1[i].getBdate());
		}
		System.out.println("\n------------------------------------------------------------------------");
	}
	
}
