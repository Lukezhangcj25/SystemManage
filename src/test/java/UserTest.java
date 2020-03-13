import org.junit.jupiter.api.Test;
import com.clz.demo.dao.UserDao;
import com.clz.demo.domain.User;

/**
 * Created by Luke 2019/9/25 15:19
 */
public class UserTest {

    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setEid("0023");
        loginuser.setPassword("2620");

        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
