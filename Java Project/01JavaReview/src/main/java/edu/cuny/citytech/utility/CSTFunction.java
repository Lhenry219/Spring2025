<<<<<<< HEAD
package edu.cuny.citytech.utility;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.function.Function;

public class CSTFunction {
	static private DecimalFormat formatter = new DecimalFormat("#,###.00");
	
	public static Function<Number,String> money = amount ->{
		return formatter.format(amount );
	};
}
=======
package edu.cuny.citytech.utility;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.function.Function;

public class CSTFunction {
	static private DecimalFormat formatter = new DecimalFormat("#,###.00");
	
	public static Function<Number,String> money = amount ->{
		return formatter.format(amount );
	};
}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
