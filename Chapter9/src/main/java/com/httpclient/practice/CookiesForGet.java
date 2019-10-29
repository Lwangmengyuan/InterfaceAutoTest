package com.httpclient.practice;

import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class CookiesForGet {
    private String url;
    private ResourceBundle bundle;
    private CookieStore cookiestore;

    @BeforeTest
    public void prepareData() {
        this.bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        this.url = this.bundle.getString("host");
    }

    @Test
    public void getCookies() throws IOException {
        this.cookiestore = new BasicCookieStore();
        CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(this.cookiestore).build();
        String uri = this.bundle.getString("getCookies");
        String testurl = this.url + uri;
        HttpGet getcookies = new HttpGet(testurl);
        CloseableHttpResponse httpresponse = httpclient.execute(getcookies);
        String result = EntityUtils.toString(httpresponse.getEntity(), "utf-8");
        System.out.println(result);
        List<Cookie> cookies = this.cookiestore.getCookies();
        for(Cookie cookie:cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie:name=" + name + " value=" + value);
        }
        httpresponse.close();
    }

    @Test(dependsOnMethods = {"getCookies"})
    public void getWithCookies() throws IOException {
        CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(this.cookiestore).build();
        String uri = this.bundle.getString("getWithCookies");
        String testurl = this.url + uri;
        HttpGet get = new HttpGet(testurl);
        CloseableHttpResponse httpresponse = httpclient.execute(get);
        String result = EntityUtils.toString(httpresponse.getEntity(), "utf-8");
        System.out.println(result);
    }
}
