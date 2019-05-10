package reiphiel.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class EnclosedExample {

    @BeforeClass
    public static void beforeClass() {
        //하위의 테스트가 수행된 이후 수행된다.
        System.out.println("Parent before class");
    }

    @AfterClass
    public static void afterClass() {
        //하위의 테스트가 수행된 이후 수행된다. 게다가 beforeClass 이후에 수행된다?
        System.out.println("Parent after class");
    }

    @Before
    public void setUp() {
        //실행되지 않는다
        System.out.println("Parent before");
    }

    @After
    public void tearDown() {
        //실행되지 않는다
        System.out.println("Parent after");
    }

    @Test
    public void test1() {
        //실행되지 않는다.
        System.out.println("test1");
    }

    public static class Enclosed1 {

        @BeforeClass
        public static void beforeClass() {
            System.out.println("Enclosed1 before class");
        }

        @AfterClass
        public static void afterClass() {
            System.out.println("Enclosed1 after class");
        }

        @Before
        public void setUp() {
            System.out.println("Enclosed1 before");
        }

        @After
        public void tearDown() {
            System.out.println("Enclosed1 after");
        }

        @Test
        public void test() {
            System.out.println("Enclosed1");
        }
    }

    public static class Enclosed2 {

        @BeforeClass
        public static void beforeClass() {
            //제일 마지막에 수행된다?
            System.out.println("Enclosed2 before class");
        }

        @AfterClass
        public static void afterClass() {
            System.out.println("Enclosed2 after class");
        }

        @Before
        public void setUp() {
            System.out.println("Enclosed2 before");
        }

        @After
        public void tearDown() {
            System.out.println("Enclosed2 after");
        }

        @Test
        public void test() {
            System.out.println("Enclosed2");
        }
    }

    //추상 클래스는 무시된다
    public static abstract class Enclosed3 {

        @BeforeClass
        public static void beforeClass() {
            System.out.println("Enclosed3 before class");
        }

        @AfterClass
        public static void afterClass() {
            System.out.println("Enclosed3 after class");
        }

        @Before
        public void setUp() {
            System.out.println("Enclosed3 before");
        }

        @After
        public void tearDown() {
            System.out.println("Enclosed3 after");
        }

        @Test
        public void test() {
            System.out.println("Enclosed3");
        }
    }

}
