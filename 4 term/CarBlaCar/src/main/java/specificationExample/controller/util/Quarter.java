package specificationExample.controller.util;

import java.util.Calendar;

public enum Quarter {

	FIRST(Calendar.JANUARY,Calendar.MARCH),
	SECOND(Calendar.APRIL,Calendar.JUNE),
	THIRD(Calendar.JULY,Calendar.SEPTEMBER),
	FOURTH(Calendar.OCTOBER,Calendar.DECEMBER);

	private final int startMonth, endMonth;

	/**
	 * Creates a quarter with the given start and end month.
	 *
	 * @param startMonth the first month of the quarter
	 * @param endMonth the last month of the quarter
	 */
	private Quarter(final int startMonth, final int endMonth){
		this.startMonth = startMonth;
		this.endMonth = endMonth;
	}

	/**
	 * Used to retrieve the first month of the quarter.
	 *
	 * @return the first month of the quarter
	 */
	public int startMonth(){return(startMonth);}

	/**
	 * Used to retrieve the last month of the quarter.
	 *
	 * @return the last month of the quarter
	 */
	public int endMonth(){return(endMonth);}

	/**
	 * Used to convert the month value to its corresponding Quarter object.
	 *
	 * @param month the number of the month (0-based)
	 * @return the Quarter containing the given month
	 */
	public static Quarter valueOf(final int month){
		Quarter qtr = null;
		if(month < 3){qtr = Quarter.FIRST;}
		else if(month > 2 && month < 6){qtr = Quarter.SECOND;}
		else if(month > 5 && month < 9){qtr = Quarter.THIRD;}
		else if(month > 8){qtr = Quarter.FOURTH;}
		return(qtr);
	}

    /**
     * Used to retrieve the quarter that comes before this quarter.
     *
     * @return the previous quarter
     */
    public Quarter previous(){
        final Quarter[] qtrs = values();

        int idx = ordinal()-1;
        if(idx < 0){idx = qtrs.length-1;}

        return(qtrs[idx]);
    }

    /**
     * Used to retrieve the quarter that follows this quarter.
     *
     * @return the next quarter
     */
    public Quarter next(){
        final Quarter[] qtrs = values();

        int idx = ordinal()+1;
        if(idx >= qtrs.length){idx = 0;}

        return(qtrs[idx]);
    }
}