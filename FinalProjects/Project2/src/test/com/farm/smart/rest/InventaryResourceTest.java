package com.farm.smart.rest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class InventaryResourceTest {

    @Mock
    private com.farm.smart.service.InventaryService mockInventaryService;
    @Mock
    private com.farm.smart.repository.InventaryRepository mockInventaryRepository;

    @InjectMocks
    private com.farm.smart.rest.InventaryResource inventaryResourceUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testDesperdicios() {
        // Setup
        final org.springframework.ui.ModelMap modelMap = new org.springframework.ui.ModelMap("attributeName", "attributeValue");
        final String expectedResult = "result";
        when(mockInventaryService.getCanvasjsChartData2()).thenReturn(Arrays.asList());

        // Run the test
        final String result = inventaryResourceUnderTest.desperdicios(modelMap);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testProductividad() {
        // Setup
        final org.springframework.ui.ModelMap modelMap = new org.springframework.ui.ModelMap("attributeName", "attributeValue");
        final String expectedResult = "result";
        when(mockInventaryService.getCanvasjsChartData()).thenReturn(Arrays.asList());

        // Run the test
        final String result = inventaryResourceUnderTest.productividad(modelMap);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
