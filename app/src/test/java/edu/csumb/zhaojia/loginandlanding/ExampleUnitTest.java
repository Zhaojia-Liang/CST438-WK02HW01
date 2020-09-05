package edu.csumb.zhaojia.loginandlanding;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void usernameTest(){
        assertTrue(MainActivity.checkUsername("din_djarin"));
        assertFalse(MainActivity.checkUsername("zhaojia Liang"));
    }

    @Test
    public void passwordTest(){
        assertTrue(MainActivity.checkPassword("baby_yoda_ftw"));
        assertFalse(MainActivity.checkPassword("love_you_3000"));
    }
}