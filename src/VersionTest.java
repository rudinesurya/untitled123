import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionTest {

    @Test
    void Test1(){
        Version v1 = new Version("0.1");
        Version v2 = new Version("1.1");

        assertEquals(-1, v1.compareTo(v2));
    }

    @Test
    void Test2(){
        Version v1 = new Version("1.1");
        Version v2 = new Version("1.2");

        assertEquals(-1, v1.compareTo(v2));
    }

    @Test
    void Test3(){
        Version v1 = new Version("1.2");
        Version v2 = new Version("1.2.9.9.9");

        assertEquals(-1, v1.compareTo(v2));
    }

    @Test
    void Test4(){
        Version v1 = new Version("1.2.9.9.9");
        Version v2 = new Version("1.3");

        assertEquals(-1, v1.compareTo(v2));
    }

    @Test
    void Test5(){
        Version v1 = new Version("1.3");
        Version v2 = new Version("1.3.4");

        assertEquals(-1, v1.compareTo(v2));
    }

    @Test
    void Test6(){
        Version v1 = new Version("1.3.4");
        Version v2 = new Version("1.10");

        assertEquals(-1, v1.compareTo(v2));
    }

    @Test
    void Test7(){
        Version v1 = new Version("1.3.4");
        Version v2 = new Version("1.3.4");

        assertEquals(0, v1.compareTo(v2));
    }

    @Test
    void Test8(){
        Version v1 = new Version("1.1");
        Version v2 = new Version("0.1");

        assertEquals(1, v1.compareTo(v2));
    }
}