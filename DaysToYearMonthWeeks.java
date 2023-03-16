public class DaysToYearMonthWeeks{

public static void main(String[]args){

int userInputDays = 8500;

int years = userInputDays/365;
int remainingDaysAfterYear = userInputDays%365;

int months = remainingDaysAfterYear/30;
int remainingDaysAftermonths = remainingDaysAfterYear%30;

int weeks = remainingDaysAftermonths/7;

int days = remainingDaysAftermonths%7;

System.out.println(years+" "+months+" "+weeks+" "+days); 


}
}