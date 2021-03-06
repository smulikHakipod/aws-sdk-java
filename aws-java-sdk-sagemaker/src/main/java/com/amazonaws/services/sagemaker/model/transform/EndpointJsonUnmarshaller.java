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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Endpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointJsonUnmarshaller implements Unmarshaller<Endpoint, JsonUnmarshallerContext> {

    public Endpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        Endpoint endpoint = new Endpoint();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EndpointName", targetDepth)) {
                    context.nextToken();
                    endpoint.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointArn", targetDepth)) {
                    context.nextToken();
                    endpoint.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointConfigName", targetDepth)) {
                    context.nextToken();
                    endpoint.setEndpointConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductionVariants", targetDepth)) {
                    context.nextToken();
                    endpoint.setProductionVariants(new ListUnmarshaller<ProductionVariantSummary>(ProductionVariantSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataCaptureConfig", targetDepth)) {
                    context.nextToken();
                    endpoint.setDataCaptureConfig(DataCaptureConfigSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndpointStatus", targetDepth)) {
                    context.nextToken();
                    endpoint.setEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    endpoint.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    endpoint.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    endpoint.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MonitoringSchedules", targetDepth)) {
                    context.nextToken();
                    endpoint.setMonitoringSchedules(new ListUnmarshaller<MonitoringSchedule>(MonitoringScheduleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    endpoint.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return endpoint;
    }

    private static EndpointJsonUnmarshaller instance;

    public static EndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonUnmarshaller();
        return instance;
    }
}
