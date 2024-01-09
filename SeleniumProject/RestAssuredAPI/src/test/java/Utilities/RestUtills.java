package Utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class RestUtills {
	public static String empName() {
		String empname = RandomStringUtils.randomAlphabetic(1);
	    return("John"+empname);
	}
	public static String empSal() {
		String empsal = RandomStringUtils.randomNumeric(5);	
	    return(empsal);
	}
	public static String empAge() {
		String empage = RandomStringUtils.randomNumeric(1);
	    return(empage);
	}

}
