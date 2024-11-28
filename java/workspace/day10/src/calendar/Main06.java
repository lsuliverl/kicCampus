package calendar;

import java.util.Calendar;

public class Main06 {

	public static void main(String[] args) {
		/*
		 * 2월달 달력을 만드시오
		 */
		Calendar cal = Calendar.getInstance();
        
        cal.set(2023,01,01);
         
        System.out.println("일\t월\t화\t수\t목\t금\t토");
         
        int cnt = 0;
        int start_day = cal.get(Calendar.DAY_OF_WEEK);
        int last_day = cal.getActualMaximum(Calendar.DATE);
        for (int i = 1; i < start_day; i++) {
            System.out.print("\t");
            cnt++;
        }
        for (int i = 1; i <= last_day; i++) {
            if(cnt % 7 == 0)
            {
                System.out.println();
            }
            cnt++;
            System.out.print(i + "\t");
        }

		
	}

}
