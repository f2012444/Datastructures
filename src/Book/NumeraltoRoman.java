package Book;

public class NumeraltoRoman {
    String value(int num) {
        // L 50 C 100 D 500 M 1000
        StringBuffer sb = new StringBuffer();
        while(num >= 1000) {
            sb.append("M");
            num = num - 1000;

        }

        if(num >= 900) {
            sb.append("CM");
            num = num - 900;
        }

        if(num >= 500) {
            sb.append("D");
            num = num - 500;
        }

        if(num >= 400) {
            sb.append("CD");
            num = num - 400;
        }

        while(num >= 100) {
            sb.append("C");
            num = num - 100;
        }

        if(num >= 90) {
            sb.append("XC");
            num = num - 90;
        }

        if(num >= 50) {
            sb.append("L");
            num = num - 50;
        }

        if(num >= 40) {
            sb.append("XL");
            num = num - 40;
        }

        while(num >= 10) {
            sb.append("X");
            num = num - 10;
        }

        if(num >= 9) {
            sb.append("IX");
            num = num - 9;
        }

        if(num >= 5) {
            sb.append("V");
            num = num - 5;
        }

        if(num >= 4) {
            sb.append("IV");
            num = num - 4;
        }

        while(num >= 1) {
            sb.append("I");
            num = num - 1;
        }

        return sb.toString();


    }
}
