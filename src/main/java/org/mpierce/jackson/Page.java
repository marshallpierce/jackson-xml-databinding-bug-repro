package org.mpierce.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
final class Page {

    @JsonProperty("PageContents")
    private String pageContents;
}
