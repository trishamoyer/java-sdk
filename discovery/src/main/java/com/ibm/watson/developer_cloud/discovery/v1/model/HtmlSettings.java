/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.discovery.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * A list of HTML conversion settings.
 */
public class HtmlSettings extends GenericModel {

  @SerializedName("exclude_tags_completely")
  private List<String> excludeTagsCompletely;
  @SerializedName("exclude_tags_keep_content")
  private List<String> excludeTagsKeepContent;
  @SerializedName("keep_content")
  private XPathPatterns keepContent;
  @SerializedName("exclude_content")
  private XPathPatterns excludeContent;
  @SerializedName("keep_tag_attributes")
  private List<String> keepTagAttributes;
  @SerializedName("exclude_tag_attributes")
  private List<String> excludeTagAttributes;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> excludeTagsCompletely;
    private List<String> excludeTagsKeepContent;
    private XPathPatterns keepContent;
    private XPathPatterns excludeContent;
    private List<String> keepTagAttributes;
    private List<String> excludeTagAttributes;

    private Builder(HtmlSettings htmlSettings) {
      excludeTagsCompletely = htmlSettings.excludeTagsCompletely;
      excludeTagsKeepContent = htmlSettings.excludeTagsKeepContent;
      keepContent = htmlSettings.keepContent;
      excludeContent = htmlSettings.excludeContent;
      keepTagAttributes = htmlSettings.keepTagAttributes;
      excludeTagAttributes = htmlSettings.excludeTagAttributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a HtmlSettings.
     *
     * @return the htmlSettings
     */
    public HtmlSettings build() {
      return new HtmlSettings(this);
    }

    /**
     * Adds an excludeTagsCompletely to excludeTagsCompletely.
     *
     * @param excludeTagsCompletely the new excludeTagsCompletely
     * @return the HtmlSettings builder
     */
    public Builder addExcludeTagsCompletely(String excludeTagsCompletely) {
      Validator.notNull(excludeTagsCompletely, "excludeTagsCompletely cannot be null");
      if (this.excludeTagsCompletely == null) {
        this.excludeTagsCompletely = new ArrayList<String>();
      }
      this.excludeTagsCompletely.add(excludeTagsCompletely);
      return this;
    }

    /**
     * Adds an excludeTagsKeepContent to excludeTagsKeepContent.
     *
     * @param excludeTagsKeepContent the new excludeTagsKeepContent
     * @return the HtmlSettings builder
     */
    public Builder addExcludeTagsKeepContent(String excludeTagsKeepContent) {
      Validator.notNull(excludeTagsKeepContent, "excludeTagsKeepContent cannot be null");
      if (this.excludeTagsKeepContent == null) {
        this.excludeTagsKeepContent = new ArrayList<String>();
      }
      this.excludeTagsKeepContent.add(excludeTagsKeepContent);
      return this;
    }

    /**
     * Adds an keepTagAttributes to keepTagAttributes.
     *
     * @param keepTagAttributes the new keepTagAttributes
     * @return the HtmlSettings builder
     */
    public Builder addKeepTagAttributes(String keepTagAttributes) {
      Validator.notNull(keepTagAttributes, "keepTagAttributes cannot be null");
      if (this.keepTagAttributes == null) {
        this.keepTagAttributes = new ArrayList<String>();
      }
      this.keepTagAttributes.add(keepTagAttributes);
      return this;
    }

    /**
     * Adds an excludeTagAttributes to excludeTagAttributes.
     *
     * @param excludeTagAttributes the new excludeTagAttributes
     * @return the HtmlSettings builder
     */
    public Builder addExcludeTagAttributes(String excludeTagAttributes) {
      Validator.notNull(excludeTagAttributes, "excludeTagAttributes cannot be null");
      if (this.excludeTagAttributes == null) {
        this.excludeTagAttributes = new ArrayList<String>();
      }
      this.excludeTagAttributes.add(excludeTagAttributes);
      return this;
    }

    /**
     * Set the excludeTagsCompletely.
     * Existing excludeTagsCompletely will be replaced.
     *
     * @param excludeTagsCompletely the excludeTagsCompletely
     * @return the HtmlSettings builder
     */
    public Builder excludeTagsCompletely(List<String> excludeTagsCompletely) {
      this.excludeTagsCompletely = excludeTagsCompletely;
      return this;
    }

    /**
     * Set the excludeTagsKeepContent.
     * Existing excludeTagsKeepContent will be replaced.
     *
     * @param excludeTagsKeepContent the excludeTagsKeepContent
     * @return the HtmlSettings builder
     */
    public Builder excludeTagsKeepContent(List<String> excludeTagsKeepContent) {
      this.excludeTagsKeepContent = excludeTagsKeepContent;
      return this;
    }

    /**
     * Set the keepContent.
     *
     * @param keepContent the keepContent
     * @return the HtmlSettings builder
     */
    public Builder keepContent(XPathPatterns keepContent) {
      this.keepContent = keepContent;
      return this;
    }

    /**
     * Set the excludeContent.
     *
     * @param excludeContent the excludeContent
     * @return the HtmlSettings builder
     */
    public Builder excludeContent(XPathPatterns excludeContent) {
      this.excludeContent = excludeContent;
      return this;
    }

    /**
     * Set the keepTagAttributes.
     * Existing keepTagAttributes will be replaced.
     *
     * @param keepTagAttributes the keepTagAttributes
     * @return the HtmlSettings builder
     */
    public Builder keepTagAttributes(List<String> keepTagAttributes) {
      this.keepTagAttributes = keepTagAttributes;
      return this;
    }

    /**
     * Set the excludeTagAttributes.
     * Existing excludeTagAttributes will be replaced.
     *
     * @param excludeTagAttributes the excludeTagAttributes
     * @return the HtmlSettings builder
     */
    public Builder excludeTagAttributes(List<String> excludeTagAttributes) {
      this.excludeTagAttributes = excludeTagAttributes;
      return this;
    }
  }

  private HtmlSettings(Builder builder) {
    excludeTagsCompletely = builder.excludeTagsCompletely;
    excludeTagsKeepContent = builder.excludeTagsKeepContent;
    keepContent = builder.keepContent;
    excludeContent = builder.excludeContent;
    keepTagAttributes = builder.keepTagAttributes;
    excludeTagAttributes = builder.excludeTagAttributes;
  }

  /**
   * New builder.
   *
   * @return a HtmlSettings builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the excludeTagsCompletely.
   *
   * @return the excludeTagsCompletely
   */
  public List<String> excludeTagsCompletely() {
    return excludeTagsCompletely;
  }

  /**
   * Gets the excludeTagsKeepContent.
   *
   * @return the excludeTagsKeepContent
   */
  public List<String> excludeTagsKeepContent() {
    return excludeTagsKeepContent;
  }

  /**
   * Gets the keepContent.
   *
   * @return the keepContent
   */
  public XPathPatterns keepContent() {
    return keepContent;
  }

  /**
   * Gets the excludeContent.
   *
   * @return the excludeContent
   */
  public XPathPatterns excludeContent() {
    return excludeContent;
  }

  /**
   * Gets the keepTagAttributes.
   *
   * @return the keepTagAttributes
   */
  public List<String> keepTagAttributes() {
    return keepTagAttributes;
  }

  /**
   * Gets the excludeTagAttributes.
   *
   * @return the excludeTagAttributes
   */
  public List<String> excludeTagAttributes() {
    return excludeTagAttributes;
  }
}
