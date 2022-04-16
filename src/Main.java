import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        System.out.println(checkPin("1234"));

    }

    private static boolean checkPin(String input) {

        String regex = "[0-9]+";


        if(input.length() == 4 || input.length() == 6){

            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);

            return m.matches();

        }else {
            return false;
        }


    }

}
