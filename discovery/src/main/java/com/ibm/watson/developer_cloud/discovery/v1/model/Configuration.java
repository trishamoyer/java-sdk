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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;
import com.ibm.watson.developer_cloud.util.Validator;
import java.util.ArrayList;

/**
 * A custom configuration for the environment.
 */
public class Configuration extends GenericModel {

  @SerializedName("configuration_id")
  private String configurationId;
  private String name;
  private Date created;
  private Date updated;
  private String description;
  private Conversions conversions;
  private List<Enrichment> enrichments;
  private List<NormalizationOperation> normalizations;

  /**
   * Builder.
   */
  public static class Builder {
    private String configurationId;
    private String name;
    private Date created;
    private Date updated;
    private String description;
    private Conversions conversions;
    private List<Enrichment> enrichments;
    private List<NormalizationOperation> normalizations;

    private Builder(Configuration configuration) {
      configurationId = configuration.configurationId;
      name = configuration.name;
      created = configuration.created;
      updated = configuration.updated;
      description = configuration.description;
      conversions = configuration.conversions;
      enrichments = configuration.enrichments;
      normalizations = configuration.normalizations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Configuration.
     *
     * @return the configuration
     */
    public Configuration build() {
      return new Configuration(this);
    }

    /**
     * Adds an enrichments to enrichments.
     *
     * @param enrichments the new enrichments
     * @return the Configuration builder
     */
    public Builder addEnrichments(Enrichment enrichments) {
      Validator.notNull(enrichments, "enrichments cannot be null");
      if (this.enrichments == null) {
        this.enrichments = new ArrayList<Enrichment>();
      }
      this.enrichments.add(enrichments);
      return this;
    }

    /**
     * Adds an normalizations to normalizations.
     *
     * @param normalizations the new normalizations
     * @return the Configuration builder
     */
    public Builder addNormalizations(NormalizationOperation normalizations) {
      Validator.notNull(normalizations, "normalizations cannot be null");
      if (this.normalizations == null) {
        this.normalizations = new ArrayList<NormalizationOperation>();
      }
      this.normalizations.add(normalizations);
      return this;
    }

    /**
     * Set the configurationId.
     *
     * @param configurationId the configurationId
     * @return the Configuration builder
     */
    public Builder configurationId(String configurationId) {
      this.configurationId = configurationId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Configuration builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the created.
     *
     * @param created the created
     * @return the Configuration builder
     */
    public Builder created(Date created) {
      this.created = created;
      return this;
    }

    /**
     * Set the updated.
     *
     * @param updated the updated
     * @return the Configuration builder
     */
    public Builder updated(Date updated) {
      this.updated = updated;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Configuration builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the conversions.
     *
     * @param conversions the conversions
     * @return the Configuration builder
     */
    public Builder conversions(Conversions conversions) {
      this.conversions = conversions;
      return this;
    }

    /**
     * Set the enrichments.
     * Existing enrichments will be replaced.
     *
     * @param enrichments the enrichments
     * @return the Configuration builder
     */
    public Builder enrichments(List<Enrichment> enrichments) {
      this.enrichments = enrichments;
      return this;
    }

    /**
     * Set the normalizations.
     * Existing normalizations will be replaced.
     *
     * @param normalizations the normalizations
     * @return the Configuration builder
     */
    public Builder normalizations(List<NormalizationOperation> normalizations) {
      this.normalizations = normalizations;
      return this;
    }
  }

  private Configuration(Builder builder) {
    configurationId = builder.configurationId;
    name = builder.name;
    created = builder.created;
    updated = builder.updated;
    description = builder.description;
    conversions = builder.conversions;
    enrichments = builder.enrichments;
    normalizations = builder.normalizations;
  }

  /**
   * New builder.
   *
   * @return a Configuration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the configurationId.
   *
   * The unique identifier of the configuration.
   *
   * @return the configurationId
   */
  public String configurationId() {
    return configurationId;
  }

  /**
   * Gets the name.
   *
   * The name of the configuration.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the created.
   *
   * The creation date of the configuration in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   *
   * @return the created
   */
  public Date created() {
    return created;
  }

  /**
   * Gets the updated.
   *
   * The timestamp of when the configuration was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   *
   * @return the updated
   */
  public Date updated() {
    return updated;
  }

  /**
   * Gets the description.
   *
   * The description of the configuration, if available.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the conversions.
   *
   * The document conversion settings for the configuration.
   *
   * @return the conversions
   */
  public Conversions conversions() {
    return conversions;
  }

  /**
   * Gets the enrichments.
   *
   * An array of document enrichment settings for the configuration.
   *
   * @return the enrichments
   */
  public List<Enrichment> enrichments() {
    return enrichments;
  }

  /**
   * Gets the normalizations.
   *
   * Defines operations that can be used to transform the final output JSON into a normalized form. Operations are
   * executed in the order that they appear in the array.
   *
   * @return the normalizations
   */
  public List<NormalizationOperation> normalizations() {
    return normalizations;
  }
}
