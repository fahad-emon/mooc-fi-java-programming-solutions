
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {

        HashMap<String,String>nickName = new HashMap<>();
        nickName.put("matthew", "matt");
        nickName.put("michael", "mix");
        nickName.put("arthur", "artiet");

        System.out.println(nickName.get("matthew"));


    }

}
