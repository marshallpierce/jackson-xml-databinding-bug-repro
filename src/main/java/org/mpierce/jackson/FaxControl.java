package org.mpierce.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class FaxControl {

    @JsonProperty("NumberDialed")
    private String numberDialed;

    @JsonProperty("DateReceived")
    private String dateReceived;

    @JsonProperty("FileType")
    private String fileType;

    @JsonProperty("ANI")
    private String ani;

    @JsonProperty("Status")
    private int status;

    @JsonProperty("BarcodeControl")
    private BarcodeControl barcodeControl;

    @JsonProperty("FileContents")
    private String fileContents;

    @JsonProperty("PageContentControl")
    private PageContentControl pageContentControl;

    public String getNumberDialed() {
        return numberDialed;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public String getFileType() {
        return fileType;
    }

    public String getAni() {
        return ani;
    }

    public int getStatus() {
        return status;
    }

    public BarcodeControl getBarcodeControl() {
        return barcodeControl;
    }

//    /**
//     * Wrapper around all the null checks, always gives back a (possibly empty) list.
//     *
//     * @return possibly list of barcodes
//     */
//    @Nonnull
//    public List<Barcode> getBarcodes() {
//        if (barcodeControl == null ||
//            barcodeControl.getBarcodes() == null) {
//            return newArrayList();
//        }
//
//        return barcodeControl.getBarcodes();
//    }

    public String getFileContents() {
        return fileContents;
    }

    public PageContentControl getPageContentControl() {
        return pageContentControl;
    }

    /**
     * Wrapper around all the null checks, always gives back a (possibly empty) list.
     *
     * @return possibly empty list of pages
     */
    public List<Page> getPages() {
        if (pageContentControl == null ||
            pageContentControl.getPages() == null) {
            return new ArrayList<>();
        }

        return pageContentControl.getPages();
    }
}
