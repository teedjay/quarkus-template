package com.teedjay;

import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.inject.Inject;

@QuarkusTest
public class TestDataTest {

    @Inject
    TestData data;

    @Test
    public void testOriginal() {
        Assertions.assertEquals("teedjay", data.getName());
    }

    @Test
    public void testMock() {
        TestData mock = Mockito.mock(TestData.class);
        Mockito.when(mock.getName()).thenReturn("this is a mock");
        QuarkusMock.installMockForType(mock, TestData.class);
        Assertions.assertEquals("this is a mock", data.getName());
    }

}
