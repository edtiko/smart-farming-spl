package com.farm.smart.rest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class ReporteResourceTest {

    @Mock
    private com.farm.smart.service.InventaryService mockInventaryService;
    @Mock
    private com.farm.smart.repository.InventaryRepository mockInventaryRepository;

    @InjectMocks
    private com.farm.smart.rest.ReporteResource reporteResourceUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testReporte() {
        // Setup
        final org.springframework.ui.ModelMap modelMap = new org.springframework.ui.ModelMap("attributeName", "attributeValue");
        final String expectedResult = "result";

        // Run the test
        final String result = reporteResourceUnderTest.reporte(modelMap);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
