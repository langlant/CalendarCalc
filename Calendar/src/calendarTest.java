/*
 * Anthony Langley
 * CIS 611
 * Fall 2020
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class calendarTest {
	
	@Test
	public void leapYear_1() {
		String date = "01/01/2020";
		assertTrue(CalendarCalc.leapYear(date));
	}
	
	@Test
	public void leapYear_2() {
		String date = "01/01/2019";
		assertFalse(CalendarCalc.leapYear(date));
	}
	
	@Test
	public void leapYear_3() {
		String date = "01/01/1900";
		assertFalse(CalendarCalc.leapYear(date));
	}
	
	@Test
	public void leapYear_4() {
		String date = "01/01/2000";
		assertTrue(CalendarCalc.leapYear(date));
	}
	
	@Test
	public void getDayofWeek_1() {
		String date = "13/12/2020";
		assertTrue(CalendarCalc.getDayofWeek(date) == "Sunday");
	}
	
	@Test
	public void getDayofWeek_2() {
		String date = "14/12/2020";
		assertTrue(CalendarCalc.getDayofWeek(date) == "Monday");
	}
	
	@Test
	public void getDayofWeek_3() {
		String date = "15/12/2020";
		assertTrue(CalendarCalc.getDayofWeek(date) == "Tuesday");
	}
	
	@Test
	public void getDayofWeek_4() {
		String date = "16/12/2020";
		assertTrue(CalendarCalc.getDayofWeek(date) == "Wednesday");
	}
	
	@Test
	public void getDayofWeek_5() {
		String date = "17/12/2020";
		assertTrue(CalendarCalc.getDayofWeek(date) == "Thursday");
	}
	
	@Test
	public void getDayofWeek_6() {
		String date = "18/12/2020";
		assertTrue(CalendarCalc.getDayofWeek(date) == "Friday");
	}
	
	@Test
	public void getDayofWeek_7() {
		String date = "19/12/2020";
		assertTrue(CalendarCalc.getDayofWeek(date) == "Saturday");
	}
	
	@Test
	public void getDay_1() {
		String date = "12/10/2020";
		assertTrue(CalendarCalc.getDay(date) == 12);
	}
	
	@Test
	public void getMonth_1() {
		String date = "12/10/2020";
		assertTrue(CalendarCalc.getMonth(date) == 10);
	}
	
	@Test
	public void getMonth_2() {
		String date = "01/02/2020";
		assertTrue(CalendarCalc.getMonth(date) == 2);
	}
	
	@Test
	public void getYear_1() {
		String date = "01/02/2020";
		assertTrue(CalendarCalc.getYear(date) == 2020);
	}
	
	@Test
	public void getDayS_1() {
		String date = "01/01/2020";
		assertTrue(CalendarCalc.getDayS(date) == "1st");
	}
	
	@Test
	public void getDayS_2() {
		String date = "02/01/2020";
		assertTrue(CalendarCalc.getDayS(date) == "2nd");
	}
	
	@Test
	public void getDayS_3() {
		String date = "21/01/2020";
		assertTrue(CalendarCalc.getDayS(date) == "21st");
	}
	@Test
	public void getDayS_4() {
		String date = "22/01/2020";
		assertTrue(CalendarCalc.getDayS(date) == "22nd");
		
	}
	
	@Test
	public void getDayS_5() {
		String date = "23/01/2020";
		assertTrue(CalendarCalc.getDayS(date) == "23rd");
	}
	
	@Test
	public void getDayS_6() {
		String date = "31/01/2020";
		assertTrue(CalendarCalc.getDayS(date) == "31st");
	}
	
	@Test
	public void getDayS_7() {
		String date = "07/01/2020";
		String check = "7th";
		assertTrue((CalendarCalc.getDayS(date)).equals(check));
	}
	
	@Test
	public void getDayS_8() {
		String date = "03/01/2020";
		String check = "3rd";
		assertTrue((CalendarCalc.getDayS(date)).equals(check));
	}
	
	@Test
	public void getMonthS_1() {
		String date = "01/01/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "January");
	}
	
	@Test
	public void getMonthS_2() {
		String date = "01/02/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "February");
	}
	
	@Test
	public void getMonthS_3() {
		String date = "01/03/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "March");
	}
	
	@Test
	public void getMonthS_4() {
		String date = "01/04/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "April");
	}
	
	@Test
	public void getMonthS_5() {
		String date = "01/05/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "May");
	}
	
	@Test
	public void getMonthS_6() {
		String date = "01/06/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "June");
	}
	
	@Test
	public void getMonthS_7() {
		String date = "01/07/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "July");
	}
	
	@Test
	public void getMonthS_8() {
		String date = "01/08/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "August");
	}
	
	@Test
	public void getMonthS_9() {
		String date = "01/09/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "September");
	}
	
	@Test
	public void getMonthS_10() {
		String date = "01/10/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "October");
	}
	
	@Test
	public void getMonthS_11() {
		String date = "01/11/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "November");
	}
	
	@Test
	public void getMonthS_12() {
		String date = "01/12/2020";
		assertTrue(CalendarCalc.getMonthS(date) == "December");
	}
	
	@Test
	public void previousDate_1() {
		String date = "01/01/2020";
		String datef= "Tuesday December 31st, 2019";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_2() {
		String date = "31/01/2020";
		String datef = "Thursday January 30th, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_3() {
		String date = "01/02/2020";
		String datef = "Friday January 31st, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_4() {
		String date = "01/03/2020";
		String datef = "Saturday February 29th, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_5() {
		String date = "01/03/2019";
		String datef = "Thursday February 28th, 2019";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_6() {
		String date = "01/04/2020";
		String datef = "Tuesday March 31st, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_7() {
		String date = "01/05/2020";
		String datef = "Thursday April 30th, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_8() {
		String date = "01/06/2020";
		String datef = "Sunday May 31st, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_9() {
		String date = "01/07/2020";
		String datef = "Tuesday June 30th, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_10() {
		String date = "01/08/2020";
		String datef = "Friday July 31st, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_11() {
		String date = "01/09/2020";
		String datef = "Monday August 31st, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_12() {
		String date = "01/10/2020";
		String datef = "Wednesday September 30th, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_13() {
		String date = "01/11/2020";
		String datef = "Saturday October 31st, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_14() {
		String date = "01/12/2020";
		String datef = "Monday November 30th, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void previousDate_15() {
		String date = "09/12/2020";
		String datef = "Tuesday December 8th, 2020";
		assertTrue((CalendarCalc.previousDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_1() {
		String date = "31/12/2020";
		String datef  = "Friday January 1st, 2021";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_2() {
		String date = "01/01/2020";
		String datef = "Thursday January 2nd, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_3() {
		String date = "31/01/2020";
		String datef = "Saturday February 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_4() {
		String date = "29/02/2020";
		String datef = "Sunday March 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_5() {
		String date = "28/02/2021";
		String datef = "Monday March 1st, 2021";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_6() {
		String date = "31/03/2020";
		String datef = "Wednesday April 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_7() {
		String date = "30/04/2020";
		String datef = "Friday May 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_8() {
		String date = "31/05/2020";
		String datef = "Monday June 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_9() {
		String date = "30/06/2020";
		String datef = "Wednesday July 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_10() {
		String date = "31/07/2020";
		String datef = "Saturday August 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_11() {
		String date = "31/08/2020";
		String datef = "Tuesday September 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_12() {
		String date = "30/09/2020";
		String datef = "Thursday October 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_13() {
		String date = "31/10/2020";
		String datef = "Sunday November 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_14() {
		String date = "30/11/2020";
		String datef = "Tuesday December 1st, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void nextDate_15() {
		String date = "15/12/2020";
		String datef = "Wednesday December 16th, 2020";
		assertTrue((CalendarCalc.nextDate(date)).equals(datef));
	}
	
	@Test
	public void getSunday_1() {
		String date = "12/12/2020:=";
		assertTrue(CalendarCalc.getSunday(date) == 2);
	}
	
	@Test
	public void getSunday_2() {
		String date = "26/12/2019";
		assertTrue(CalendarCalc.getSunday(date) == 52);
	}
	
	@Test
	public void getSunday_3() {
		String date = "31/12/2019";
		assertTrue(CalendarCalc.getSunday(date) == 51);
	}
	
	@Test
	public void getSunday_4() {
		String date = "31/12/2019";
		assertTrue(CalendarCalc.getSunday(date) == 51);
	}
	
	@Test
	public void getSunday_5() {
		String date = "26/12/2020";
		assertTrue(CalendarCalc.getSunday(date) == 52);
	}
	
	@Test
	public void getThanks_1() {
		String date = "01/01/2020";
		assertTrue(CalendarCalc.getThanks(date) == 331);
	}
	
	@Test
	public void reverseDayNumber_1() {
		String date = "01/01/2020";
		int otherDate = 331;
		String check = "26/11/2020";
		assertTrue((CalendarCalc.reverseDayNumber(otherDate, date)).contentEquals(check));
	}
	
	@Test
	public void getXmas_1() {
		String date = "01/01/2020";
		assertTrue((CalendarCalc.getXmas(date)) == 360);
	}
	
	@Test
	public void getXmas_2() {
		String date = "01/01/2019";
		assertTrue((CalendarCalc.getXmas(date)) == 359);
	}
	
	@Test
	public void getNumShopping_1() {
		String date = "25/11/2020";
		assertTrue(CalendarCalc.getNumShopping(date) == 25);
	}
	
	@Test
	public void getNumShopping_2() {
		String date = "01/12/2020";
		assertTrue(CalendarCalc.getNumShopping(date) == 21);

	}
	
	@Test
	public void getNumShopping_3() {
		String date = "31/12/2019";
		assertTrue(CalendarCalc.getNumShopping(date) == 308);
	}
	
	@Test
	public void getNumShopping_4() {
		String date = "31/12/2020";
		assertTrue(CalendarCalc.getNumShopping(date) == 307);

	}
	
	@Test
	public void getNumShopping_5() {
		String date = "01/12/2019";
		assertTrue(CalendarCalc.getNumShopping(date) == 21);

	}
	
	@Test
	public void getNumShopping_6() {
		String date = "27/11/2019";
		assertTrue(CalendarCalc.getNumShopping(date) == 23);

	}
	
	@Test
	public void getNumShopping_7() {
		String date = "31/12/2021";
		assertTrue(CalendarCalc.getNumShopping(date) == 307);
	}
	
	@Test
	public void getNumShopping_8() {
		String date = "25/12/2020";
		assertTrue(CalendarCalc.getNumShopping(date) == 0);
	}
	
	@Test
	public void getZodiac_1() {
		String date = "22/03/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Aries");
	}
	
	@Test
	public void getZodiac_2() {
		String date = "22/04/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Taurus");
	}
	
	@Test
	public void getZodiac_3() {
		String date = "22/05/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Gemini");
	}
	
	@Test
	public void getZodiac_4() {
		String date = "22/06/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Cancer");
	}
	
	@Test
	public void getZodiac_5() {
		String date = "24/07/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Leo");
	}
	
	@Test
	public void getZodiac_6() {
		String date = "24/08/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Virgo");
	}
	
	@Test
	public void getZodiac_7() {
		String date = "24/09/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Libra");
	}
	
	@Test
	public void getZodiac_8() {
		String date = "25/10/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Scorpio");
	}
	
	@Test
	public void getZodiac_9() {
		String date = "24/11/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Sagittarius");
	}
	
	@Test
	public void getZodiac_10() {
		String date = "23/12/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Capricorn");
	}
	
	@Test
	public void getZodiac_11() {
		String date = "22/01/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Aquarius");
	}
	
	@Test
	public void getZodiac_12() {
		String date = "22/02/2020";
		assertTrue(CalendarCalc.getZodiac(date) == "Pisces");
	}
	@Test
	public void getZodiac_13() {
		String date = "22/03/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Aries");
	}
	
	@Test
	public void getZodiac_14() {
		String date = "22/04/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Taurus");
	}
	
	@Test
	public void getZodiac_15() {
		String date = "22/05/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Gemini");
	}
	
	@Test
	public void getZodiac_16() {
		String date = "22/06/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Cancer");
	}
	
	@Test
	public void getZodiac_17() {
		String date = "24/07/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Leo");
	}
	
	@Test
	public void getZodiac_18() {
		String date = "24/08/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Virgo");
	}
	
	@Test
	public void getZodiac_19() {
		String date = "24/09/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Libra");
	}
	
	@Test
	public void getZodiac_20() {
		String date = "25/10/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Scorpio");
	}
	
	@Test
	public void getZodiac_21() {
		String date = "24/11/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Sagittarius");
	}
	
	@Test
	public void getZodiac_22() {
		String date = "23/12/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Capricorn");
	}
	
	@Test
	public void getZodiac_23() {
		String date = "22/01/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Aquarius");
	}
	
	@Test
	public void getZodiac_24() {
		String date = "22/02/2021";
		assertTrue(CalendarCalc.getZodiac(date) == "Pisces");
	}
}
