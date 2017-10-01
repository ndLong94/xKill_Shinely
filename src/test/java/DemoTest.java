import com.market.demo.domain.User;
import com.market.demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.when;

public class DemoTest {
    @Autowired
    UserService userService;
    @Test
    public void test(){
        when(userService.findById(Long.valueOf(1))).thenReturn(new User());

    }
}
