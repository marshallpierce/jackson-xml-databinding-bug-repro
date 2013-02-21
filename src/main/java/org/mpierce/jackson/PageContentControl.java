package org.mpierce.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PageContentControl {

    @JacksonXmlElementWrapper(localName = "Pages")
    @JsonProperty("Page")
    private List<Page> pages;

    public List<Page> getPages() {
        return pages;
    }
}
