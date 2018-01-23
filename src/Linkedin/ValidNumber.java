package Linkedin;

public class ValidNumber {
    boolean validNumber(String input) {
        input = input.trim();
        if(input.length() ==0) {
            return false;
        }
        boolean negative = false;
        if(input.charAt(0) == '-') {
            negative = true;
            input = input.substring(1);
        }
        String[] res = input.split("\\.");
        if(res.length > 2 || res.length == 0) {
            return false;
        }

        boolean out = doEcheck(res[0]);
        if(res[0].length() == 0) {
            out = true;
        }
        if(res.length == 2) {
            out = out && doEcheck(res[1]);
        }

        return out;



    }

    boolean doEcheck(String res) {

        String[] temp = res.split("e");
        if(temp.length > 2) {
            return false;
        }
        try {
            Float one = Float.parseFloat(temp[0]);
            if(temp.length == 2) {
                Float two = Float.parseFloat(temp[1]);
            }
        } catch (Exception ex) {
            return false;
        }

        return true;
    }
}
