package com.itheima.test;

import com.itheima.ssm.dao.AccountDao;
import com.itheima.ssm.domain.Account;
import com.itheima.ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestService {

    @Autowired
    AccountService accountService;
    @Test
    public  void findAll(){
        List<Account> list = accountService.findAll();

    }

    @Test
    public void testFindAll() throws IOException {
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("sqlMap111.xml");
        //创建工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //获取代理对象调用Dao
        AccountDao accountDao=session.getMapper(AccountDao.class);
        //获得查询所有的方法
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        session.close();
        is.close();
    }

    @Test
    public void testsave() throws IOException {
        Account account=new Account();
        account.setName("小小");
        account.setMoney(500d);
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("sqlMap111.xml");
        //创建工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //获取代理对象调用Dao
        AccountDao accountDao = session.getMapper(AccountDao.class);
        accountDao.saveAccount(account);
        session.commit();

        session.close();
        is.close();
    }
}
