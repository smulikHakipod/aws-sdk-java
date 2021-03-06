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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for UpdateBackendConfig.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackendConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Describes the Amazon Cognito configuration for Admin UI access.
     * </p>
     */
    private LoginAuthConfigReqObj loginAuthConfig;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendConfigRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Describes the Amazon Cognito configuration for Admin UI access.
     * </p>
     * 
     * @param loginAuthConfig
     *        Describes the Amazon Cognito configuration for Admin UI access.
     */

    public void setLoginAuthConfig(LoginAuthConfigReqObj loginAuthConfig) {
        this.loginAuthConfig = loginAuthConfig;
    }

    /**
     * <p>
     * Describes the Amazon Cognito configuration for Admin UI access.
     * </p>
     * 
     * @return Describes the Amazon Cognito configuration for Admin UI access.
     */

    public LoginAuthConfigReqObj getLoginAuthConfig() {
        return this.loginAuthConfig;
    }

    /**
     * <p>
     * Describes the Amazon Cognito configuration for Admin UI access.
     * </p>
     * 
     * @param loginAuthConfig
     *        Describes the Amazon Cognito configuration for Admin UI access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendConfigRequest withLoginAuthConfig(LoginAuthConfigReqObj loginAuthConfig) {
        setLoginAuthConfig(loginAuthConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getLoginAuthConfig() != null)
            sb.append("LoginAuthConfig: ").append(getLoginAuthConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBackendConfigRequest == false)
            return false;
        UpdateBackendConfigRequest other = (UpdateBackendConfigRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getLoginAuthConfig() == null ^ this.getLoginAuthConfig() == null)
            return false;
        if (other.getLoginAuthConfig() != null && other.getLoginAuthConfig().equals(this.getLoginAuthConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getLoginAuthConfig() == null) ? 0 : getLoginAuthConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBackendConfigRequest clone() {
        return (UpdateBackendConfigRequest) super.clone();
    }

}
