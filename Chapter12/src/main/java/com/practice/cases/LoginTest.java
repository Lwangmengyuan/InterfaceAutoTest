package com.practice.cases;

import com.practice.config.TestConfig;
import com.practice.model.InterfaceName;
import com.practice.utils.ConfigFile;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.BeforeTest;

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
}
