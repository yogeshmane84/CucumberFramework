package LearnJunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Annotations {

    @Test
    public void testcase1 ()
    {
        System.out.println("testcase1");

    }

    @Ignore

    @Test
    public void testcase2 ()
    {
        System.out.println("testcase2");

    }

    @Before
    public void Login()
    {
        System.out.println("Login");
    }

    @After
    public void Logout()
    {
        System.out.println("Logout");

    }
}
