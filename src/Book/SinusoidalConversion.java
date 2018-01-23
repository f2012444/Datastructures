package Book;

public class SinusoidalConversion {
    String sinusoidString(String s) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer();
        int i = 0;
        while(i < s.length()) {
            sb2.append(s.charAt(i));
            i+=1;
            if(i<s.length()) {
                sb1.append(s.charAt(i));
                i+=1;
            }
            if(i<s.length()) {
                sb2.append(s.charAt(i));
                i+=1;
            }
            if(i<s.length()) {
                sb3.append(s.charAt(i));
                i+=1;
            }
        }
        return sb1.toString() + sb2.toString() + sb3.toString();
    }
}
