package EmpSalary.kletech.ac.in;
public class EmpSalaryDemo {
	public static void main(String[] args) {
	CommissionEmployee abc=new CommissionEmployee("Ram", "lal", "GHIUIUGI", 15);
	System.out.println("Name of commision employee:"+abc.getFirstName()+" "+abc.getLastName()+"\nSocial Sercurity Number:"+abc.getSocialSecurityNumber());
	abc.getPaymentAmount();
	System.out.println("\n\n");
	HourlyEmployee bh=new HourlyEmployee("Sham", "Shastri", "GYIHOOI", 20, 4);
	bh.getPaymentAmount();
	System.out.println("Name of Hourly employee:"+bh.getFirstName()+" "+bh.getLastName()+"\nSocial Sercurity Number:"+bh.getSocialSecurityNumber());
	System.out.println("\n\n");
	SalariedEmployee vb=new SalariedEmployee("Rahul", "Verma", "FUGYVGUK", 25, 2);
	System.out.println("Name of Salaried employee:"+vb.getFirstName()+" "+vb.getLastName()+"\nSocial Sercurity Number:"+vb.getSocialSecurityNumber());
	System.out.println("\n");
	@SuppressWarnings("unused")
	BasePlusCommissionEmploye ab=new BasePlusCommissionEmploye("Viru", "Singh", "YGFUGUIH",45,6,45000);
	System.out.println("Name of Salaried employee:"+vb.getFirstName()+" "+vb.getLastName()+"\nSocial Sercurity Number:"+vb.getSocialSecurityNumber());
	System.out.println("\n");
	Invoice bhi=new Invoice("GYG", "BOLTS", 3, 12);
	bhi.getPaymentAmount();
	
	
	BasePlusCommissionEmploye a = new BasePlusCommissionEmploye("Amit", "Gundad", "asdf", 10000.00, 2, 10);
	
	System.out.println(a.getBasesalary());
	}

}
