/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutAppInstanceRetentionSettingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutAppInstanceRetentionSettingsRequestMarshaller {

    private static final MarshallingInfo<String> APPINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("appInstanceArn").build();
    private static final MarshallingInfo<StructuredPojo> APPINSTANCERETENTIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppInstanceRetentionSettings").build();

    private static final PutAppInstanceRetentionSettingsRequestMarshaller instance = new PutAppInstanceRetentionSettingsRequestMarshaller();

    public static PutAppInstanceRetentionSettingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (putAppInstanceRetentionSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putAppInstanceRetentionSettingsRequest.getAppInstanceArn(), APPINSTANCEARN_BINDING);
            protocolMarshaller.marshall(putAppInstanceRetentionSettingsRequest.getAppInstanceRetentionSettings(), APPINSTANCERETENTIONSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
