package Chapter8;

public class Month {

	private int monthNumber;
	
	/**
	 * No-Arg Constructor
	 */
	public Month() {
		
		this.monthNumber = 1;
	}
	
	/**
	 * Constructor
	 * @param monthNumber The month number
	 */
	public Month(int monthNumber) {
		
		if(monthNumber < 1 || monthNumber > 12)
			this.monthNumber = 1;
		else
			this.monthNumber = monthNumber;
	}
	
	/**
	 * Constructor
	 * @param month The month
	 */
	public Month(String month) {
		
		switch(month) {
			case "January":
			case "january":
			case "Jan":
			case "jan":
				this.monthNumber = 1;
				break;
			case "February":
			case "february":
			case "Feb":
			case "feb":
				this.monthNumber = 2;
				break;	
			case "March":
			case "march":
			case "Mar":
			case "mar":
				this.monthNumber = 3;
				break;
			case "April":
			case "april":
			case "Apr":
			case "apr":
				this.monthNumber = 4;
				break;
			case "May":
			case "may":
				this.monthNumber = 5;
				break;
			case "June":
			case "june":
			case "Jun":
			case "jun":
				this.monthNumber = 6;
				break;
			case "July":
			case "july":
			case "Jul":
			case "jul":
				this.monthNumber = 7;
				break;
			case "August":
			case "august":
			case "Aug":
			case "aug":
				this.monthNumber = 8;
				break;
			case "September":
			case "september":
			case "Sept":
			case "sept":
				this.monthNumber = 9;
				break;
			case "October":
			case "october":
			case "Oct":
			case "oct":
				this.monthNumber = 10;
				break;
			case "November":
			case "nuvember":
			case "Nov":
			case "nov":
				this.monthNumber = 11;
				break;
			case "December":
			case "december":
			case "Dec":
			case "dec":
				this.monthNumber = 12;
				break;
		}
	}
	
	/**
	 * setMonthNumber Method
	 * @param monthNumber The month number to set
	 */
	public void setMonthNumber(int monthNumber) {
		
		this.monthNumber = monthNumber;
	}
	
	/**
	 * getMonthNumber Method
	 * @return The Month number
	 */
	public int getMonthNumber() {
		
		return monthNumber;
	}
	
	/**
	 * getMonthName Method
	 * @return The name of the Month
	 */
	public String getMonthName() {
		
		String monthName = "";
		
		switch(this.monthNumber) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3: 
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
		}
		
		return monthName;
	}
	
	/**
	 * toString Method
	 */
	public String toString() {
		
		return getMonthName();
	}
	
	/**
	 * equals Method
	 * @param m The Month object
	 * @return If the objects are equal
	 */
	public boolean equals(Month m) {
		
		if (this.monthNumber == m.monthNumber )
			return true;
		else
			return false;
	}
	
	/**
	 * greaterThank Method
	 * @param m The month object to check
	 * @return If Month is greater than passed object
	 */
	public boolean greaterThan(Month m) {
		
		if(this.monthNumber > m.monthNumber)
			return true;
		else
			return false;
	}
	
	/**
	 * lessThan Method
	 * @param m The month object to check
	 * @return If object is greater than passed Month
	 */
	public boolean lessThan(Month m) {
		
		if(this.monthNumber < m.monthNumber)
			return true;
		else
			return false;
	}
	
	
}
