package imooc.spring.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/5/6 16:33
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {

    @Resource(name="accountService")
    private AccountService accountService;


    @Test
    public void test(){
        accountService.trainsfrom("aa","bb",200d);
    }
}
