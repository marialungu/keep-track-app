package com.keeptrack.rest.api.keeptrackapi.controller;

import com.keeptrack.rest.api.keeptrackapi.repository.DummyRepo;
import com.keeptrack.rest.api.keeptrackapi.service.DummyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyControllerUnitTest {
    @Mock
    private DummyService dummyService;

    @InjectMocks
    private DummyController dummyController;

    @Test
    public void testDummyController(){
        dummyController.showAllDummy();
    }

}
