package com.maren.hooks;

import com.maren.pages.BasePage;
import io.cucumber.java.Before;
import io.cucumber.java.AfterAll;
import java.util.logging.Logger;

public class Hook {
    static Logger LOG = Logger.getLogger(Hook.class.getName());

    @Before
    public static void setUp(){
       LOG.info("############## Running test ##############");
        BasePage.openApp();
    }

    @AfterAll
    public static void tearDown(){
        LOG.info("############## Stopping test ##############");
        BasePage.closeApp();
    }
}
