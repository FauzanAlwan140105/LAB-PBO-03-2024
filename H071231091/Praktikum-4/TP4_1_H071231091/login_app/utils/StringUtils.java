package login_app.utils;

public class StringUtils {
    public static String Nick(String fullName){
        String[] hitungKata = fullName.split(" ");

        if(hitungKata.length == 1){
            return fullName;
        }else{
            return hitungKata[1];
        }
    }
}
