package org.prebid.server.proto.openrtb.ext.request;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Defines the contract for bidrequest.user.ext
 */
@AllArgsConstructor(staticName = "of")
@Value
public class ExtUser {

    /**
     * Consent is a GDPR consent string. See "Advised Extensions" of
     * https://iabtechlab.com/wp-content/uploads/2018/02/OpenRTB_Advisory_GDPR_2018-02.pdf
     */
    String consent;

    ExtUserDigiTrust digitrust;
}