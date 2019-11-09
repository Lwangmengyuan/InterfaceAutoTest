package com.practice.cases;

import com.practice.config.TestConfig;
import com.practice.model.AddUserModel;
import com.practice.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import java.io.IOException;

public class AddUserTest {
    @Test(dependsOnGroups = "loginTrue",description = "添加用户接口测试")
    public void addUser() throws IOException {
        SqlSession sqlSession = DatabaseUtil.getSqlSession();
        AddUserModel addUserCase = sqlSession.selectOne("addUserCase",1);
        System.out.println(addUserCase.toString());
        System.out.println(TestConfig.addUserUrl);
    }
}
