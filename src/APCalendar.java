public class APCalendar {
    private static boolean isLeapYear(int year){
        if(year % 4 == 0){
            return true;
        }
        return false;
    }

    public static int numberOfLeapYears(int year1, int year2){
        int c = 0;
        for(int i = 0; i <= year2-year1; i++){
            if(isLeapYear(year1+i)){
                c++;
            }
        }
        return c;
    }

    private static int firstDayOfYear(int year){
        return dayOfYear(1,1,year);
    }

    private static int dayOfYear(int month, int day, int year){
        char[][] daytab =
                {
                        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                        {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
                };
        int daystotal = day;
        for (int y = 1 ; y <= year ; y++)
        {
            int max_month = ( y < year ? 12 : month-1 );
            int leap = (y%4);
            if (year%100 == 0 && year%400 != 0) {
                leap = 0;
            }
            for (int m = 1 ; m <= max_month ; m++)
            {
                daystotal += daytab[leap][m];
            }
        }
        return daystotal;
    }

    public static int dayOfWeek(int month, int day, int year){
        int d = dayOfYear(month, day, year);
        int f = firstDayOfYear(year) - 1;

        return (d+f%7);
    }
}
