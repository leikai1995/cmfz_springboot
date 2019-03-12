package com.baizhi;


import com.baizhi.dao.TestDao;
import com.baizhi.entity.Test1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestmbgApplicationTests {
    @Autowired
    private TestDao testDao;
    @Test
    public void contextLoads() {
        Test1 lk = new Test1(1, "lk", 1, 18);
        testDao.insert(lk);


    }

}
