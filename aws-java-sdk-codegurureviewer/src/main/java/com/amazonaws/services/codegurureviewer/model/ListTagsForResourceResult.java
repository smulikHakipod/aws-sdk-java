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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListTagsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two
     * parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <i>tag key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag keys are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a <i>tag value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case
     * sensitive.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two
     * parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <i>tag key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag keys are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a <i>tag value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case
     * sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with
     *         two parts: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A <i>tag key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>,
     *         or <code>Secret</code>). Tag keys are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An optional field known as a <i>tag value</i> (for example, <code>111122223333</code>,
     *         <code>Production</code>, or a team name). Omitting the tag value is the same as using an empty string.
     *         Like tag keys, tag values are case sensitive.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two
     * parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <i>tag key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag keys are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a <i>tag value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case
     * sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with
     *        two parts: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A <i>tag key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     *        <code>Secret</code>). Tag keys are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An optional field known as a <i>tag value</i> (for example, <code>111122223333</code>,
     *        <code>Production</code>, or a team name). Omitting the tag value is the same as using an empty string.
     *        Like tag keys, tag values are case sensitive.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two
     * parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <i>tag key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag keys are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a <i>tag value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case
     * sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with
     *        two parts: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A <i>tag key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     *        <code>Secret</code>). Tag keys are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An optional field known as a <i>tag value</i> (for example, <code>111122223333</code>,
     *        <code>Production</code>, or a team name). Omitting the tag value is the same as using an empty string.
     *        Like tag keys, tag values are case sensitive.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ListTagsForResourceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult clearTagsEntries() {
        this.tags = null;
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
