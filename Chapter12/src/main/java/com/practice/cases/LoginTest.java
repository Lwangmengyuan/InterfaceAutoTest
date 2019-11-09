package com.practice.cases;

import com.practice.config.TestConfig;
import com.practice.model.InterfaceName;
import com.practice.model.LoginModel;
import com.practice.utils.ConfigFile;
import com.practice.utils.DatabaseUtil;
import org.apache.http.impl.client.HttpClients;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest {
    @BeforeTest(groups = "loginTrue",description = "测试准备工作，获取httpclient对象")
    public void beforeTest(){
        TestConfig.loginUrl = ConfigFile.getUrl(InterfaceName.LOGIN);
        TestConfig.updateUserInfoUrl = ConfigFile.getUrl(InterfaceName.UPDATEUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.getUrl(InterfaceName.GETUSERLIST);
        TestConfig.getUserInfoUrl = ConfigFile.getUrl(InterfaceName.GETUSERINFO);
        TestConfig.addUserUrl = ConfigFile.getUrl(InterfaceName.ADDUSER);

        TestConfig.httpClient = HttpClients.createDefault();
    }

    @Test(groups = "loginTrue",description = "用户登录成功接口测试")
    public void loginTrue() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        try {
            LoginModel loginCase = session.selectOne("loginCase",1);
            System.out.println(loginCase.toString());
            System.out.println(TestConfig.loginUrl);
        }catch (Exception e){
            System.out.println("查询结果为空");
        }
    }

    @Test(groups = "loginFalse",description = "用户登录失败接口测试")
    public void loginFalse() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        try {
            LoginModel loginCase = session.selectOne("loginCase",2);
            System.out.println(loginCase.toString());
            System.out.println(TestConfig.loginUrl);
        }catch (Exception e){
            System.out.println("查询结果为空");
        }
    }
}
