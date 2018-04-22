import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidate {
    private static final String CLASS_NAME = "^([C]|[A]|[P])[\\d]{4}[G,H,I,K,L,M]";
   public NameValidate(){}
   public static boolean isvalidate (String regex){
       Pattern pattern = Pattern.compile(CLASS_NAME);
       Matcher matcher = pattern.matcher(regex);
       return matcher.matches();
   }
}
