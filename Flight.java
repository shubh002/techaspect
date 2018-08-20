package flight;

public class Flight {
	
	public static int getFlightNo() {
		return flightNo;
	}


	public static void setFlightNo(int flightNo) {
		flightNo = flightNo;
	}


	public static String getAirlineName() {
		return airlineName;
	}


	public static void setAirlineName(String airlineName) {
		airlineName = airlineName;
	}


	public static String getDestination() {
		return destination;
	}


	public static void setDestination(String destination) {
		destination = destination;
	}


	public static String getSource() {
		return source;
	}


	public static void setSource(String source) {
		source = source;
	}


	public static String getDeptDate() {
		return deptDate;
	}


	public static void setDeptDate(String deptDate) {
		deptDate = deptDate;
	}


	public static String getDeptTime() {
		return deptTime;
	}


	public static void setDeptTime(String deptTime) {
		deptTime = deptTime;
	}


	public static String getArrivalDate() {
		return arrivalDate;
	}


	public static void setArrivalDate(String arrivalDate) {
		arrivalDate = arrivalDate;
	}


	public static String getArrivalTime() {
		return arrivalTime;
	}


	public static void setArrivalTime(String arrivalTime) {
		arrivalTime = arrivalTime;
	}


	public static long getPrice() {
		return price;
	}


	public static void setPrice(long price) {
		price = price;
	}

	private static int flightNo;
	private static String airlineName;
	private static String destination;
	private static String source;
	private static String deptDate;
	private static String deptTime;
	private static String arrivalDate;
	private static String arrivalTime;
	private static long price;

	
	public Flight() {
		flightNo = 0;
		airlineName = "JetAirways";
		destination = "Delhi";
		source = "Chennai";
		deptDate = "02/11/2018";
		deptTime = "14:20";
		arrivalDate = "02/11/2018";
		arrivalTime = "20:00";
		price = 5000;
	}

}
