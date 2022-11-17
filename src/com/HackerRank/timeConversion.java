package com.HackerRank;

public class timeConversion {
    public static void main(String[] args) {
        String time = "1:05:15PM";
        String result = timeConversion(time);
    }
    public static String timeConversion(String str)
    {
        // 07:05:07AM
        String result = "";
        //int countColon = 0;
        String Hour = str.substring(0,2);
        String Min = str.substring(3,5);
        String Sec = str.substring(6,8);

        int hour=Integer.parseInt(Hour);
        int min=Integer.parseInt(Min);
        int sec=Integer.parseInt(Sec);
        String ampm = str.substring(8,10);
        System.out.println(hour+":"+min+":"+sec+ampm);
        if(ampm.equals("AM"))
        {
            if(hour==12)
            {
                hour=0;
            }
        }
        else if(ampm.equals("PM"))
        {
            if(hour<12)
            {
                hour=hour+12;
            }

        }

        System.out.println(hour+":"+min+":"+sec);

        return result;
    }

}
