package org.mpierce.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
final class RequestControl {

    @JsonProperty("RequestDate")
    private String requestDate;

    @JsonProperty("RequestType")
    private String requestType;

    public String getRequestType() {
        return requestType;
    }

    public String getRequestDate() {
        return requestDate;
    }
}
