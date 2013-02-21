package org.mpierce.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboundRequest {
    @JsonProperty("FaxControl")
    private FaxControl faxControl;

    @JsonProperty("RequestControl")
    private RequestControl requestControl;

    public RequestControl getRequestControl() {
        return requestControl;
    }

    public FaxControl getFaxControl() {
        return faxControl;
    }
}
