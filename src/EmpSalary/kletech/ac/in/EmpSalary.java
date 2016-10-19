package EmpSalary.kletech.ac.in;

interface Payable {
	double getPaymentAmount();
}

class Employee implements Payable {
	private String FirstName;
	private String LastName;
	private String SocialSecurityNumber;

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public Employee(String firstName, String lastName,
			String socialSecurityNumber, double grosssales) {
		FirstName = firstName;
		LastName = lastName;
		SocialSecurityNumber = socialSecurityNumber;
	}

	public double getPaymentAmount() {
		return 0;
	}
}

class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double Priceperitem;

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPriceperitem() {
		return Priceperitem;
	}

	public Invoice(String partNumber, String partDescription, int quantity,
			double priceperitem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		Priceperitem = priceperitem;
	}

	public double getPaymentAmount() {
		double total = 0;
		total = quantity * Priceperitem;
		System.out.println("Payment amount of invoice is:" + total);
		return total;
	}
}

class CommissionEmployee extends Employee {
	private double grosssales;
	private double commisionrate;

	public double getGrosssales() {
		return grosssales;
	}

	public double getCommisionrate() {
		return commisionrate;
	}

	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grosssales) {
		super(firstName, lastName, socialSecurityNumber, grosssales);
		this.grosssales = grosssales;
	}

	public double getPaymentAmount() {
		if (grosssales > 10 && grosssales <= 20)
			commisionrate = grosssales * 10;
		else if (grosssales > 20 && grosssales <= 30)
			commisionrate = grosssales * 20;
		else
			commisionrate = grosssales * 30;
		System.out.println("Commission of the employee:" + commisionrate);
		return commisionrate;
	}
}

class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public double getWage() {
		return wage;
	}

	public double getHours() {
		return hours;
	}

	public HourlyEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grosssales, double hours) {
		super(firstName, lastName, socialSecurityNumber, grosssales);
		this.hours = hours;
	}

	public double getPaymentAmount() {
		if (hours > 3 && hours <= 5)
			wage = hours * 50;
		else if (hours > 5 && hours <= 7)
			wage = hours * 60;
		else if (hours > 7 && hours <= 9)
			wage = hours * 70;
		else
			wage = hours * 90;
		System.out.println("Wages on no of hours:" + hours + " is " + wage);
		return wage;
	}
}

class SalariedEmployee extends Employee {
	private double weeklysalary;

	public double getWeeklysalary() {

		return weeklysalary;
	}

	public SalariedEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grosssales, int workingweeks) {
		super(firstName, lastName, socialSecurityNumber, grosssales);
		if (workingweeks == 1)
			weeklysalary = 15000;
		else if (workingweeks == 2)
			weeklysalary = 20000;
		else
			System.out.println("weekly cannot be more then 2 weeks");
		System.out.println("Weekly Salary is:" + weeklysalary);
	}
}

class BasePlusCommissionEmploye extends CommissionEmployee {
	private double basesalary;

	public double getBasesalary() {
		return basesalary;
	}

	public BasePlusCommissionEmploye(String firstName, String lastName,
			String socialSecurityNumber, double grosssales, int workingweeks,
			double basesalary) {
		super(firstName, lastName, socialSecurityNumber, grosssales);
		double total = 0;
		total = this.basesalary + this.getPaymentAmount() * grosssales;
		System.out.println("Base plus commision is:" + total);
	}
}