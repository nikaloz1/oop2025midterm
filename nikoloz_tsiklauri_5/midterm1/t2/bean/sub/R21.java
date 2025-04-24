package nikoloz_tsiklauri_5.midterm1.t2.bean.sub;

import nikoloz_tsiklauri_5.midterm1.t2.bean.A21;
import nikoloz_tsiklauri_5.midterm1.t2.salt.theater.A22;

public class R21 {
    public static void main(String[] args) {
        // area of rectang
        A21 rectangle = new A21();
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);

        // monthnames
        A22 monthObj = new A22();
        int monthNum = monthObj.getMonth();
        String monthName = getMonthName(monthNum);
        System.out.println("Month: " + monthName);
    }

    private static String getMonthName(int monthNumber) {
        switch(monthNumber) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }
}