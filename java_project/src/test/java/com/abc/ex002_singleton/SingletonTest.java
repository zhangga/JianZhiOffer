package com.abc.ex002_singleton;

import org.junit.jupiter.api.*;

/**
 * Created by U-Demon
 * Date: 2020/6/8
 */
@DisplayName("单例模式测试用例")
public class SingletonTest {

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void test_1() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assert s1 == s2;
    }

    @Test
    void test_2() {
        SingletonLazy s1 = SingletonLazy.getInstance();
        SingletonLazy s2 = SingletonLazy.getInstance();
        assert s1 == s2;
    }
}
