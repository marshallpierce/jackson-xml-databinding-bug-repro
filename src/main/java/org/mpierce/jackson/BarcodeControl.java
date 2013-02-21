package org.mpierce.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BarcodeControl {

    @JacksonXmlElementWrapper(localName = "Barcodes", useWrapping = true)
    @JsonProperty("Barcode")
    private List<Barcode> barcodes;

    public List<Barcode> getBarcodes() {
        return barcodes;
    }
}
