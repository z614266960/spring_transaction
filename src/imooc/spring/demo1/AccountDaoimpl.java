package imooc.spring.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/5/6 16:18
 * @Description:
 */
public class AccountDaoimpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMonry(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    @Override
    public void inMonry(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql,money,in);
    }
}
