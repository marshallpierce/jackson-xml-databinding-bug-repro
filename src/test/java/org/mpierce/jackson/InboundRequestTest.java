package org.mpierce.jackson;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("ConstantConditions")
public final class InboundRequestTest {

    ObjectReader objectReader;

    @Before
    public void setUp() {
        objectReader = new XmlMapper().reader();
    }

    @Test
    public void testReadSampleSinglePage() throws IOException {

        InboundRequest ir =
            objectReader.withType(InboundRequest.class)
                .readValue(this.getClass().getResource("/org/mpierce/jackson/Sample.xml"));

        assertEquals("08/18/2005 12:02:25", ir.getRequestControl().getRequestDate());
        assertEquals("New Inbound", ir.getRequestControl().getRequestType());

        assertEquals("0987654321", ir.getFaxControl().getNumberDialed());
        assertEquals("08/18/2005 12:02:13", ir.getFaxControl().getDateReceived());
        assertEquals("pdf", ir.getFaxControl().getFileType());
        assertEquals("8587123600", ir.getFaxControl().getAni());
        assertEquals("JVBERi0xLj", ir.getFaxControl().getFileContents().substring(0, 10));
        assertNull(ir.getFaxControl().getPageContentControl());
        assertTrue(ir.getFaxControl().getPages().isEmpty());

        assertNotNull(ir.getFaxControl().getBarcodeControl().getBarcodes());
        assertEquals(5, ir.getFaxControl().getBarcodeControl().getBarcodes().size());
    }
}