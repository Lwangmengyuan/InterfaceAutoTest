package com.practice.cases;

import com.practice.config.TestConfig;
import com.practice.model.GetUserListModel;
import com.practice.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import java.io.IOException;

public class GetUserListTest {
    @Test(dependsOnGroups = "loginTrue",description = "获取性别为女的用户信息")
    public void getUserList() throws IOException {
        SqlSession sqlSession = DatabaseUtil.getSqlSession();
        GetUserListModel getUserListModel = sqlSession.selectOne("getUserListCase",1);
        System.out.println(getUserListModel.toString());
        System.out.println(TestConfig.getUserListUrl);
    }
}
