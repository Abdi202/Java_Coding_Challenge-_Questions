public class SpeedConverter {
	public static long toMilesPerHour(double kilometersPerHour){
	     if(kilometersPerHour< 0) {
	         return-1;
	 }
	 else {
	     double milesperhour  = Math.round(kilometersPerHour/1.609);
	     return (long)milesperhour;
	 }
}
	public static void printConversion(double kilometersPerHour){
	      if(kilometersPerHour < 0){
	       System.out.println("Invalid Value");
	      }
	      else {
	   
	    System.out.println(kilometersPerHour +" km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");  
	  }
	}
}
