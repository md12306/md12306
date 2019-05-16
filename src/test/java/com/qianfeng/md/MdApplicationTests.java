package com.qianfeng.md;

import com.qianfeng.md.bean.TbUser;
import com.qianfeng.md.dao.IUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MdApplicationTests {
    @Autowired
    private IUserMapper iUserMapper;
    @Test
    public void contextLoads() {
        TbUser tbUser = iUserMapper.checkUsername("Champa");
        System.out.println(tbUser);
    }

}
