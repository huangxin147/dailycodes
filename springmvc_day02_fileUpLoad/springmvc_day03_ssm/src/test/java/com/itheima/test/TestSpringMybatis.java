package com.itheima.test;

import com.itheima.ssm.dao.AccountDao;
import com.itheima.ssm.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/*@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")*/
public class TestSpringMybatis {

    @Test
    public void testFindAllSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = ac.getBean(AccountDao.class);
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
