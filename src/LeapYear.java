public class LeapYear {

    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        System.out.println("Its leap year");
                        return true;
                    }else {
                        System.out.println("Its not leap year");
                        return false;
                    }
                }else {
                    System.out.println("Its leap year");
                    return true;
                }
            }else {
                System.out.println("Its not leap year");
                return false;
            }
        }else { 
            return false;
        }
    }
}

