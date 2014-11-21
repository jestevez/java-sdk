package com.xapo.sdk;

import mjson.Json;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by frepond on 6/11/14.
 */
public class APITest {
    private static final String APP_ID = "your app id";
    private static final String APP_SECRET = "your app secret";
    private static final String SERVICE_URL = "https://api.xapo.com/v1";
    private API api;

    @Before
    public void setUp() throws Exception {
        this.api = new API(SERVICE_URL, APP_ID, APP_SECRET);
    }

    @Ignore("Set app id and secret and remove this line")
    @Test
    public void testCredit() {
        Json result = api.credit("sample@xapo.com", 1, Currency.SAT, "Sample deposit", "");

        System.out.println("testCredit -> " + result);

        assert (result.at("success").asBoolean());
    }
}