import java.util.ArrayList;
import java.util.List;

public class UseServiceImpl implements UseService {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        String haha = "haha";

        f(list, haha);
        f(list, haha);
        f(list, haha);
        f(list, haha);
    }

    private static void f(List<String> list, String haha) {
        for (int i = 0 ; i < list.size() ; ++i) {

        }
    }
}
