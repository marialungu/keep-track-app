package com.keeptrack.rest.api.keeptrackapi.service;

import com.keeptrack.rest.api.keeptrackapi.entity.Dummy;
import com.keeptrack.rest.api.keeptrackapi.repository.DummyRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Ria on 5/28/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyServiceUnitTest {

    @InjectMocks
    private DummyService dummyService;

    @Mock
    private DummyRepo dummyRepo;

    @Test
    public void testGetAllDummy_emptyResult (){
        List<Dummy> testResults =  dummyService.getAllDummy();
        assertEquals (testResults.size(), 0);
    }

    @Test
    public void unitTestGetAllDummy_emptyResult (){

        List<Dummy> returnList = new ArrayList<>();

        addDummyElement(returnList);

        when(dummyRepo.findAll()).thenReturn(returnList);
        List<Dummy> testResults =  dummyService.getAllDummy();
        assertEquals (1, testResults.size());

/*
        verify(dummyRepo, times(1)).getAllDummy();
*/
    }

    private void addDummyElement(List<Dummy> returnList) {
        Dummy dummy1 = new Dummy();
        dummy1.setId("1");
        dummy1.setName("asdfghjkl");
        returnList.add(dummy1);
    }
}
