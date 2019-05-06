package imooc.spring.demo1;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/5/6 16:16
 * @Description:
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void trainsfrom(String out, String in, Double money) {
        accountDao.outMonry(out,money);
        accountDao.inMonry(in,money);
    }
}
