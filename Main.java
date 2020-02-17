import java.util.Scanner;

class Main {
	

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	System.out.println("P1: ");
	double p1 = sc.nextDouble();
	 System.out.println("P2: ");
	 double p2 = sc.nextDouble();
	 System.out.println("P3: ");
	 double p3 = sc.nextDouble();
	 System.out.println("P4: ");
	 double p4 = sc.nextDouble();
	 
	 double n1 = (p1+p2)/2;
	 double n2 = (p3+p4)/2;
	 double n5 = (n1+n2)/2;
	 
	 if (n5 >= 7) {
		 System.out.println("Aprovado, nota final: "+ n5);
	 }else {
		 if(n5 > 4) {
			 System.out.println("Pf: ");
			 double pf = sc.nextDouble();
			
			 double nf = (n5+pf)/2;
			 if(nf > 5) {
				 System.out.println("Aprovado, nota final: "+ nf);
			 }else {
				 System.out.println("Reprovado, nota final: "+ nf);
			 }
			
		 }else {
			 if(n5 <= 4) {
				 System.out.println("Reprovado, nota final:"+ n5);
			 }
		 }
	 }
	
	 
	 sc.close();

	}

}
