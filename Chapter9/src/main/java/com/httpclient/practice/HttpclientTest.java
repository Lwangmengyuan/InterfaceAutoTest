package com.httpclient.practice;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import java.io.IOException;

public class HttpclientTest {

    @Test
    public void test() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://www.baidu.com");
        CloseableHttpResponse httpresponse = httpclient.execute(httpget);
        String result = EntityUtils.toString(httpresponse.getEntity(), "utf-8");
        System.out.println(result);
    }
}
