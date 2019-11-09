package com.practice.cases;

import com.practice.config.TestConfig;
import com.practice.model.GetUserInfoModel;
import com.practice.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoTest {
    @Test(dependsOnGroups = "loginTrue",description = "获取user_id为4的用户信息")
    public void getUserInfo() throws IOException {
        SqlSession sqlSession = DatabaseUtil.getSqlSession();
        GetUserInfoModel getUserInfoModel = sqlSession.selectOne("getUserInfoCase",1);
        System.out.println(getUserInfoModel.toString());
        System.out.println(TestConfig.getUserInfoUrl);
    }
}
