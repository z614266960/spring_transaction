package imooc.spring.demo1;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/5/6 16:16
 * @Description:
 */
public interface AccountDao {

    public void outMonry(String out,Double money);

    public void inMonry(String in,Double money);
}
