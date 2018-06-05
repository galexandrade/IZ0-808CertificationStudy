// DOES NOT COMPILE because Date is in two packages
//import java.util.*;
//import java.sql.*; 

// To solve that you can explicit one of them
import java.util.Date;
import java.sql.*; 

public class Conflicts {
	Date date;
	
	// If you need to use sql Date
	// It does not need to be imported
	java.sql.Date sqlDate;
}