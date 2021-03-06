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
package com.amazonaws.services.timestreamquery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryStatusMarshaller {

    private static final MarshallingInfo<Double> PROGRESSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressPercentage").build();
    private static final MarshallingInfo<Long> CUMULATIVEBYTESSCANNED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CumulativeBytesScanned").build();
    private static final MarshallingInfo<Long> CUMULATIVEBYTESMETERED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CumulativeBytesMetered").build();

    private static final QueryStatusMarshaller instance = new QueryStatusMarshaller();

    public static QueryStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryStatus queryStatus, ProtocolMarshaller protocolMarshaller) {

        if (queryStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryStatus.getProgressPercentage(), PROGRESSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(queryStatus.getCumulativeBytesScanned(), CUMULATIVEBYTESSCANNED_BINDING);
            protocolMarshaller.marshall(queryStatus.getCumulativeBytesMetered(), CUMULATIVEBYTESMETERED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
