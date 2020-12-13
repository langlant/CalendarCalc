/*
 * Anthony Langley
 * CIS 611
 * Fall 2020
 */
public class CalendarCalc {
	String date;
	//determine whether or not the year given is a leap year
	public static boolean leapYear(String date) {
        
		int iYear = getYear(date);
        boolean leap = false;

        if((iYear % 4) == 0){
            leap = true;
        }

        if((iYear % 100) == 0){
            
            if((iYear % 400) == 0){
                leap = true;
            } else {
            	leap =  false;
            }
        } 
        
        return leap;
	}

    //returns the day of the week of a given date
	static String getDayofWeek(String date) {
		String[] dWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int m = 0;
		int d;
		int doW;
		int k;
		int f;
		int c;
		
        switch(getMonth(date)){
            case 1:
                m = 11;
                break;
            case 2:
                m = 12;
                break;
            case 3:
                m = 1;
                break;
            case 4:
                m = 2;
                break;
            case 5:
                m = 3;
                break;
            case 6:
                m = 4;
                break;
            case 7:
                m = 5;
                break;
            case 8:
                m = 6;
                break;
            case 9:
                m = 7;
                break;
            case 10:
                m = 8;
                break;
            case 11:
                m = 9;
                break;
            case 12:
                m = 10;
                break;
        }

        if((m == 11) || (m == 12)){
            d = Integer.parseInt(date.substring(8, 10)) - 1;
        } else{
            d = Integer.parseInt(date.substring(8, 10));
        }

        k = getDay(date);

        c = Integer.parseInt(date.substring(6, 8));

        f = k +((13 * m - 1) / 5) + d + (d / 4) + (c / 4) - 2 * c;

        doW = f % 7;
        if(doW < 0) {
        	doW = doW + 7;
        }

        return dWeek[doW];
	}
	
	//returns day in date as an integer
	public static int getDay(String date) {
		int sDate = Integer.parseInt(date.substring(0, 2));
		
		return sDate;
	}
	
	//returns day in date as a string with st, nd, rd, or th
	public static String getDayS(String date) {
		int n = getDay(date);
		String s = "";
		
		if(n == 1) {
			s = "1st";
		} else if(n == 2) {
			s = "2nd";
		} else if(n == 3) {
			s = "3rd";
		} else if(n == 21) {
			s = "21st";
		} else if(n == 22) {
			s = "22nd";
		} else if(n == 23) {
			s = "23rd";
		} else if(n == 31) {
			s = "31st";
		} else {
			s = n + "th";
		}
		
		return s;
     
	}

	//returns month in date as an integer
	public static int getMonth(String date) {
		
		int sDate = Integer.parseInt(date.substring(3, 5));
		return sDate;
	}
	
	//returns month in date as month name
	public static String getMonthS(String date) {
		
		String month = "";
		switch(getMonth(date)){
        case 1:
            month = "January";
            break;
        case 2:
        	month = "February";
        	break;
        case 3:
        	month = "March";
        	break;
        case 4:
        	month = "April";
        	break;
        case 5:
        	month = "May";
        	break;
        case 6:
        	month = "June";
        	break;
        case 7:
        	month = "July";
        	break;
        case 8:
        	month = "August";
        	break;
        case 9:
        	month = "September";
        	break;
        case 10:
        	month = "October";
        	break;
        case 11:
        	month = "November";
        	break;
        case 12:
        	month = "December";
        	break;
		}
		
		return month;
		
	}
	
	//returns year in date as int
	public static int getYear(String date) {
		String sDate = date.substring(6,10);
		int iDate = Integer.parseInt(sDate);

		return iDate;
		
	}
	
	//returns previous date of given date
	public static String previousDate(String date) {
        
        int nd = getDay(date);
        int ny = getYear(date);
        int nm = getMonth(date);
        String sm = "";
        String sd = "";
        String sy = "";

        if(nd == 1 && nm == 1){
            ny = ny - 1;
            sd = "31";
            sm = "12";
        } else if(nd == 1 && nm >= 2) {
    		if(nm == 2) {
    			sd = "31";
    			sm = "01";
    		}else if(nm == 3) {
    			sm = "02";
	        	if(leapYear(date) == true) {
	    			sd = "29";
	    		} else {
	    			sd = "28";
	    		}
    		} else if(nm == 4) {
    			sd = "31";
    			sm = "03";
    		} else if(nm == 5) {
    			sd = "30";
    			sm = "04";
    		} else if(nm == 6) {
    			sd = "31";
    			sm = "05";
    		} else if (nm == 7) {
    			sd = "30";
    			sm = "06";
    		} else if (nm == 8) {
    			sd = "31";
    			sm = "07";
    		} else if(nm == 9) {
    			sd = "31";
    			sm = "08";
    		}else if(nm == 10) {
        		sd = "30";
        		sm = "09";
    		}else if(nm == 11) {
        		sd = "31";
        		sm = "10";
    		} else if(nm ==12) {
        		sd = "30";
        		sm = "11";
        	} 
    		
        } else {
        	
        	nd = nd - 1;
        	
        	if(nm < 10) {
        		sm = "0" + Integer.toString(nm);
        	} else {
        		sm = Integer.toString(nm);
        	}
        	
        	
        	if(nd < 10) {
        		sd = "0" + nd;
        	} else {
        		sd = Integer.toString(nd);
        	}
        }
                
        sy = Integer.toString(ny);
        String prevS = sd + "/" + sm + "/" + sy;
        String finDate = finalDate(prevS);
		return finDate;
	}
	
	//returns next date of given date
	public static String nextDate(String date) {
       
		int nd = getDay(date);
        int nm = getMonth(date);
        int ny = getYear(date);

        String sm = "";
        String sd = "";
        String sy = "";
        
        if(nd == 31 && nm == 12){
            
        	ny = ny + 1;
            sm = "01";
        	sd = "01";

        	
        } else if(nd == 31 && nm == 1){

        	sm = "02";
        	sd = "01";
        	
        } else if(nm == 2 && nd == 29 && leapYear(date) == true){
        	
        	sm = "03";
        	sd = "01";
        	
        } else if(nm == 2 && nd == 28 && leapYear(date) == false){
        	
        	sm = "03";
        	sd = "01";
        	
        } else if( nd == 31 && nm == 3) {
        	
        	sm = "04";
        	sd = "01";
        	
        } else if(nd == 30 && nm == 4) {
        	
        	sm = "05";
        	sd = "01";
        	
        } else if(nd == 31 && nm == 5){
        	
        	sm = "06";
        	sd = "01";
        	
        } else if(nd == 30 && nm == 6){
        	
        	sm = "07";
        	sd = "01";
        	
        } else if(nd == 31 && nm == 7){
        	
        	sm = "08";
        	sd = "01";  
        	
        } else if(nd == 31 && nm == 8){
        	
        	sm = "09";
        	sd = "01";
        	
        } else if(nd == 30 && nm == 9){
        	
        	sm = "10";
        	sd = "01";  
        	
        } else if(nd == 31 && nm == 10){
        	
        	sm = "11";
        	sd = "01";  
        	
        } else if(nd == 30 && nm == 11){
        	
        	sm = "12";
        	sd = "01";
        	
        }else {
        	
        	nd = nd + 1;
        	
        	if(nm < 10) {
        		sm = "0" + nm;
        	} else {
        		sm = Integer.toString(nm);
        	}
        	

        	
        	if(nd < 10) {
        		sd = "0" + nd;
        	} else {
        		
        		sd = Integer.toString(nd);
        	
        	}
        }
         
        sy = Integer.toString(ny);
        
        String nextS = sd + "/" + sm + "/" + sy;
        String finDate = finalDate(nextS);
        System.out.println(nextS);
		return finDate;
	}
	
	//returns how many sundays there are between given date and xmas
	public static int getSunday(String date) {
		
		int sunday = 0;
		String s = "";
		int y = getYear(date) + 1;
		String nextYear = "01/01/" + Integer.toString(y);
		
		//ideal case calculate sundays to xmas
		if(calculateDayNumber(date) < getXmas(date)) {
			
			for(int i = calculateDayNumber(date); i < getXmas(date); i++) {
				s = getDayofWeek(reverseDayNumber(i, date));
				
				if(s == "Sunday") {
					
					sunday++;
					
				}
			}
			
		// is if after xmas
		} if(calculateDayNumber(date) > getXmas(date)) {
			if(leapYear(date) == true) {
				for(int i = calculateDayNumber(date); i < 366; i++) {
					s = getDayofWeek(reverseDayNumber(i, date));
					if(s == "Sunday") {
						sunday++;
					}
				}
			} else {
				for(int i = calculateDayNumber(date); i < 365; i++) {
					s = getDayofWeek(reverseDayNumber(i, date));
					if(s == "Sunday") {
						sunday++;
					}
				}
			}
			
			if(leapYear(nextYear) == true){
				for(int j = 1; j < 360; j++) {
					s = getDayofWeek(reverseDayNumber(j, nextYear));
					if(s == "Sunday"){
						sunday++;
					}
				}
			} else {
				for(int j = 1; j < 359; j++) {
					s = getDayofWeek(reverseDayNumber(j, nextYear));
					if(s == "Sunday"){
						sunday++;
					}
				}				
			}
		}
		
		if(calculateDayNumber(date) == getXmas(date)) {
			
			sunday = 0;
			
		}
		
		if(getDayofWeek(date) == "Sunday") {
			sunday--;
		}
		
		return sunday;
	}
	
	//returns how many shopping days are between given date and xmas (excludes sundays, thanksgiving, and xmas)
	public static int getNumShopping(String date) {
		/*
		 * determine number of sundays between date and xmas
		 * determine thanksgiving
		 * calculateDayNumber(getXmas(initDate)) - calculateDayNumber(initDate) - thanksgiving if before - sundays;
		 */
		int shoppingDays = 0;
		int xmas= getXmas(date);
		int oDate = calculateDayNumber(date);
		int thanks = 0;
		int sunday = getSunday(date);

		String nextYear = "01/01/" + (getYear(date) + 1);
		
		
		if(oDate > xmas) {
			if(leapYear(date) == true && leapYear(nextYear) == false) {
				thanks = 1;
				shoppingDays = (366 - oDate) + 359 - thanks - getSunday(date);
				
			} else if(leapYear(date) == false && leapYear(nextYear) == true){
				thanks = 1;
				shoppingDays = (365 - oDate) + 360 - thanks - getSunday(date);
			}else if(leapYear(date) == false && leapYear(nextYear) == false) {
				thanks = 1;
				shoppingDays = (365 - oDate) + 359 - thanks - getSunday(date);
			}
			
		} else if(calculateDayNumber(date) == getXmas(date)){
			shoppingDays = 0;
		} else{
			if(calculateDayNumber(date) < getThanks(date)) {
				thanks = 1;
			} else {
				thanks = 0;
			}
			shoppingDays = xmas - oDate - thanks - getSunday(date);
		}
		
		
		return shoppingDays;
		
	}
	
	public static String getZodiac(String date) {
		
		int zDate = calculateDayNumber(date);
		String zodiac = "";
		
		if(leapYear(date) == true) {
			if(81 <= zDate && zDate < 111) {
				zodiac = "Aries";
			}
			
			if(111 <= zDate && zDate < 142) {
				zodiac = "Taurus";
			}
			
			if(142 <= zDate && zDate < 173) {
				zodiac = "Gemini";
			}
			
			if(173 <= zDate && zDate < 203) {
				zodiac = "Cancer";
			}
			
			if(203 <= zDate && zDate < 236) {
				zodiac = "Leo";
			}
			
			if(236 <= zDate && zDate < 267) {
				zodiac = "Virgo";
			}
			
			if(267 <= zDate && zDate < 297) {
				zodiac = "Libra";
			}
			
			if(297 <= zDate && zDate < 327) {
				zodiac = "Scorpio";
			}
			
			if(327 <= zDate && zDate < 357) {
				zodiac = "Sagittarius";
			}
			
			if(357 <= zDate || zDate < 20) {
				zodiac = "Capricorn";
			}
			
			if(20 <= zDate && zDate < 50) {
				zodiac = "Aquarius";
			}
			
			if(50 <= zDate && zDate < 81) {
				zodiac = "Pisces";
			}
		} else {
		
			if(80 <= zDate && zDate < 110) {
				zodiac = "Aries";
			}
			
			if(110 <= zDate && zDate < 141) {
				zodiac = "Taurus";
			}
			
			if(141 <= zDate && zDate < 172) {
				zodiac = "Gemini";
			}
			
			if(172 <= zDate && zDate < 202) {
				zodiac = "Cancer";
			}
			
			if(202 <= zDate && zDate < 235) {
				zodiac = "Leo";
			}
			
			if(235 <= zDate && zDate < 266) {
				zodiac = "Virgo";
			}
			
			if(266 <= zDate && zDate < 296) {
				zodiac = "Libra";
			}
			
			if(296 <= zDate && zDate < 326) {
				zodiac = "Scorpio";
			}
			
			if(326 <= zDate && zDate < 356) {
				zodiac = "Sagittarius";
			}
			
			if(356 <= zDate || zDate < 20) {
				zodiac = "Capricorn";
			}
			
			if(20 <= zDate && zDate < 50) {
				zodiac = "Aquarius";
			}
			
			if(50 <= zDate && zDate < 80) {
				zodiac = "Pisces";
			}
		}
		
		return zodiac;
	}
	
	//returns determines the date of thanksgiving of given year.
	public static int getThanks(String date) {
		/*
		 *scroll through every day of november
		 *	check to see if its a thursday
		 *		if 4th thursday return date 
		 */
		int thanksgivingNumber = 0;
		
		for(int i = 305; i < 335; i++) {
			String thur = getDayofWeek(reverseDayNumber(i, date));
			
			if(thur == "Thursday") {
				thanksgivingNumber = i + 21;
				break;
			} 
		}
		
		return thanksgivingNumber;
	}

	//returns number day of christmas
	public static int getXmas(String date) {
        int x;
		
		if(leapYear(date) == true){
            x = 360;
        } else{
            x = 359;
        }

        return x;
	}
	
	//returns given date as a string in following format: [Day of Week] [Month] [Day + (st || nd || rd || th), [year]
	public static String finalDate(String date) {
		String finDate = getDayofWeek(date) + " " + getMonthS(date) + " " + getDayS(date) + ", " + getYear(date);
        return finDate;
	}
	
	//return number for date
	public static int calculateDayNumber(String date) {
		
		int jan = 0;
		int feb = 31;
		int mar = 59;
		int apr = 90;
		int may = 120;
		int jun = 151;
		int jul = 181;
		int aug = 212;
		int sep = 243;
		int oct = 273;
		int nov = 304;
		int dec = 334;
		int monthValue = 0;

        switch(getMonth(date)){
            case 1:
                monthValue = jan;
                break;
            case 2:
                monthValue = feb;
                break;
            case 3:
                monthValue = mar;
                break;
            case 4:
                monthValue = apr;
                break;
            case 5:
                monthValue = may;
                break;
            case 6:
                monthValue = jun;
                break;
            case 7:
                monthValue = jul;
                break;
            case 8:
                monthValue = aug;
                break;
            case 9:
                monthValue = sep;
                break;
            case 10:
                monthValue = oct;
                break;
            case 11:
                monthValue = nov;
                 break;
            case 12:
                monthValue = dec;
                break;
        }
        if((leapYear(date) == true) && (getMonth(date) >= 3)){
            monthValue = monthValue + 1;
        }

        int dayNum = monthValue + getDay(date);
        return dayNum;
	}
	
	//return string for given date
	public static String reverseDayNumber(int otherDate, String date) {
		String sd = "";
		String sm = "";
		int day = 0;
		int month = 0;
		int year = getYear(date);
		
		int feb = 31;
		int mar = 59;
		int apr = 90;
		int may = 120;
		int jun = 151;
		int jul = 181;
		int aug = 212;
		int sep = 243;
		int oct = 273;
		int nov = 304;
		int dec = 334;
		
		if(leapYear(date) == true) {
			mar = 60;
			apr = 91;
			may = 121;
			jun = 152;
			jul = 182;
			aug = 213;
			sep = 244;
			oct = 274;
			nov = 305;
			dec = 335;
		}
		
		if(otherDate <= feb) {
			day = otherDate;
			sm = "01";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(feb < otherDate && otherDate <= mar) {
			day = otherDate - feb;
			sm = "02";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(mar < otherDate && otherDate <= apr) {
			day = otherDate - mar;
			sm = "03";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(apr < otherDate && otherDate<= may) {
			day = otherDate - apr;
			sm = "04";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(may < otherDate && otherDate <= jun) {
			day = otherDate - may;
			sm = "05";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(jun < otherDate && otherDate <= jul) {
			day = otherDate - jun;
			sm = "06";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(jul < otherDate && otherDate <= aug) {
			day = otherDate - jul;
			sm = "07";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(aug < otherDate && otherDate <= sep) {
			day = otherDate - aug;
			sm = "08";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(sep < otherDate && otherDate <= oct) {
			day = otherDate - sep;
			sm = "09";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(oct < otherDate && otherDate <= nov) {
			day = otherDate - oct;
			sm = "10";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(nov < otherDate && otherDate <= dec) {
			day = otherDate - nov;
			sm = "11";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		
		else if(dec < otherDate) {
			day = otherDate - dec;
			sm = "12";
			if(day < 10) {
				sd = "0" + day;
			} else {
				sd = Integer.toString(day);
			}
		}
		String rdate = sd + "/" + sm + "/" + year;
		return rdate;
	}
}

