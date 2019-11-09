package com.practice.cases;

import com.practice.config.TestConfig;
import com.practice.model.UpdateUserInfoModel;
import com.practice.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class UpdateUserInfoTest {
    @Test(dependsOnGroups = "loginTrue",description = "更新用户信息")
    public void updateUserInfo() throws IOException {
        SqlSession sqlSession = DatabaseUtil.getSqlSession();
        UpdateUserInfoModel updateUserInfoModel = sqlSession.selectOne("updateUserInfoCase",1);
        System.out.println(updateUserInfoModel.toString());
        System.out.println(TestConfig.updateUserInfoUrl);
    }

    @Test(dependsOnGroups = "loginTrue",description = "删除用户信息")
    public void deleteUser() throws IOException {
        SqlSession sqlSession = DatabaseUtil.getSqlSession();
        UpdateUserInfoModel updateUserInfoModel = sqlSession.selectOne("updateUserInfoCase",3);
        System.out.println(updateUserInfoModel.toString());
        System.out.println(TestConfig.updateUserInfoUrl);
    }
}
