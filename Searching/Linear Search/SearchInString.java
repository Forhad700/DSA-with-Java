import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Forhad";
        char target = 'r';
        System.out.println(searchChar(name, target));
        
        //System.out.println(searchChar2(name, target));
        //System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean searchChar(String str, char target){
        if(str.length()==0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    static boolean searchChar2(String str, char target){
        if(str.length()==0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
