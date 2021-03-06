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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutSchemaVersionMetadataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutSchemaVersionMetadataRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCHEMAID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaId").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMAVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaVersionNumber").build();
    private static final MarshallingInfo<String> SCHEMAVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaVersionId").build();
    private static final MarshallingInfo<StructuredPojo> METADATAKEYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataKeyValue").build();

    private static final PutSchemaVersionMetadataRequestMarshaller instance = new PutSchemaVersionMetadataRequestMarshaller();

    public static PutSchemaVersionMetadataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutSchemaVersionMetadataRequest putSchemaVersionMetadataRequest, ProtocolMarshaller protocolMarshaller) {

        if (putSchemaVersionMetadataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putSchemaVersionMetadataRequest.getSchemaId(), SCHEMAID_BINDING);
            protocolMarshaller.marshall(putSchemaVersionMetadataRequest.getSchemaVersionNumber(), SCHEMAVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(putSchemaVersionMetadataRequest.getSchemaVersionId(), SCHEMAVERSIONID_BINDING);
            protocolMarshaller.marshall(putSchemaVersionMetadataRequest.getMetadataKeyValue(), METADATAKEYVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
