public class EmpWageComputation {
	final static int WAGE_PER_HOUR=20;
	static int dailyWage=0;
	static int workHours=0;
	final static int FULL_TIME=2;
	final static int PART_TIME=1;
	public static int ComputeDailyWage(int hours) {
		return hours*WAGE_PER_HOUR;
	public static void main(String[] args) {
		int attendence=(int)(Math.random()*3);
		switch(attendance) {
		case FULL_TIME:	System.out.println("Employee is Present fulltime");
			workHours=8;
			dailyWage=ComputeDailyWage(workHours);;
			break;

		case PART_TIME:	System.out.println("Employee is present halftime");
			workHours=4;
			dailyWage=ComputeDailyWage(workHours);;
			break;
	}
		default:	System.out.println("Employee is Absent");

		System.out.println("Daily Wage of an Employee "+dailyWage);
	}

}



