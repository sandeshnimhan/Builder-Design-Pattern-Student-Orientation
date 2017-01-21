package studentOrientation.util;


public class Logger{


    public static enum DebugLevel { CONSTRUCTOR , RESULTS, DS, NOP
                                   };

    private static DebugLevel debugLevel;

    /**This method takes in the debug level in integer form and 
     * sets the debug level.
     * @param levelIn This is the parameter to setDebugValue method in Integer format
     * 
     */
    public static void setDebugValue (int levelIn) {
    	switch (levelIn) {
    		case 3: debugLevel = DebugLevel.CONSTRUCTOR; break;
    		case 2: debugLevel = DebugLevel.RESULTS; break;
    		case 1: debugLevel = DebugLevel.DS; break;
    		case 0: debugLevel = DebugLevel.NOP; break;
    		
    	}
    }
    
    /**This method takes in the debug level object and sets the debug level
     * @param levelIn this is the parameter to setDebugValue method as DebugLevel object
     * 
     */
    public static void setDebugValue (DebugLevel levelIn) {
    	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }
    
    /**This method converts to String
     * @return String This method returns a String
     */
    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
