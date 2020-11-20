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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it defaults
     * to 25. This value is optional.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @return The token to use to get the next page of results after a previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it defaults
     * to 25. This value is optional.
     * </p>
     * 
     * @param maxResults
     *        The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it
     *        defaults to 25. This value is optional.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it defaults
     * to 25. This value is optional.
     * </p>
     * 
     * @return The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it
     *         defaults to 25. This value is optional.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it defaults
     * to 25. This value is optional.
     * </p>
     * 
     * @param maxResults
     *        The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it
     *        defaults to 25. This value is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsRequest == false)
            return false;
        ListApplicationsRequest other = (ListApplicationsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsRequest clone() {
        return (ListApplicationsRequest) super.clone();
    }

}
