package com.abcd.wsx.business.test;

import com.abcd.wsx.business.service.XyqInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class XyqInfoTest {

    @Autowired
    private XyqInfo xyqInfo;

    @Test
    public void findAllServerTest(){
        List<String> list = xyqInfo.findAllServer();
        if(list==null && list.size()==0){
            throw new IllegalArgumentException("没有服务器信息");
        }else{
            System.out.println(list);
        }
    }

}
