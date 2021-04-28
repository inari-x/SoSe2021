package vorlesung.testen;

public class UmrechnungTimeZeit {
	
	public String convert(String time) {
		final int LAST_THREE_CHARS = 3;  // " pm" or " am"
		if(time.endsWith("am")) {
			return time.substring(0, (time.length() - LAST_THREE_CHARS));
		}
		else {
			final int DIFFERENCE_BETWEEN_H_TO_HH =12;   //ends with pm
			int hourInt = this.getHoursInt(time);
			hourInt += DIFFERENCE_BETWEEN_H_TO_HH;
			String minutes = this.getMinutesString(time);
			
			String zeit = hourInt + ":" + minutes;
			return zeit;
		}
	}
	
	String getHoursString(String time) {
		String[] allStr = time.split(":");
		return allStr[0];
	}
	
	String getMinutesString(String time) {
		final int FIRST_TWO_CHARS = 2;
		String[] allStr = time.split(":");
		String afterDouble = allStr[1];
		String minutesStr = afterDouble.substring(0, FIRST_TWO_CHARS);
		return minutesStr;
	}
	
	int getHoursInt(String time) {
		String hoursString = this.getHoursString(time);
		int hourInt = Integer.valueOf(hoursString);
		return hourInt;
	}
	
	

}
