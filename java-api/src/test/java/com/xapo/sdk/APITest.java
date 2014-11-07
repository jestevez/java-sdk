package com.xapo.sdk;

import com.xapo.tools.widgets.MicroPayment;
import com.xapo.tools.widgets.MicroPaymentConfig;
import mjson.Json;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by frepond on 6/11/14.
 */
public class APITest {
    // pay type: "Tip", "Pay", "Deposit" o "Donate"
    private static final String APP_ID = "b91014cc28c94841";
    private static final String APP_SECRET = "c533a6e606fb62ccb13e8baf8a95cbdc";
    private static final String SERVICE_URL = "http://dev.xapo.com/api/v1";
    private API api;

    @Before
    public void setUp() throws Exception {
        this.api = new API(SERVICE_URL, APP_ID, APP_SECRET);
    }

    @Test
    public void testCredit() {
        Json result = api.credit("sample@xapo.com", 1, Currency.SAT, "Sample deposit", "");

        System.out.println("testCredit -> " + result);

        assert (result.at("success").asBoolean());
    }
}