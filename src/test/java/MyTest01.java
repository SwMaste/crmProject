import com.sw.crm.utils.DateTimeUtil;
import com.sw.crm.utils.MD5Util;

/**
 * @MASTER 统治世界的霸主 常狗狗
 * @date 2021/4/28
 */
public class MyTest01 {
    public static void main(String[] args) {
        String time = "2020-02-13 12:12:31";
        String currentTime = DateTimeUtil.getSysTime();
        System.out.println(currentTime);
        System.out.println(time.compareTo(currentTime));

        String password = "onlyloveme";
        String s = MD5Util.getMD5(password);
        System.out.println(s);
    }
}
