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
package com.ibm.watson.developer_cloud.conversation.v1.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;
import com.ibm.watson.developer_cloud.util.Validator;
import java.util.ArrayList;

/**
 * CaptureGroup.
 */
public class CaptureGroup extends GenericModel {

  private String group;
  private List<Long> location;

  /**
   * Builder.
   */
  public static class Builder {
    private String group;
    private List<Long> location;

    private Builder(CaptureGroup captureGroup) {
      group = captureGroup.group;
      location = captureGroup.location;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param group the group
     */
    public Builder(String group) {
      this.group = group;
    }

    /**
     * Builds a CaptureGroup.
     *
     * @return the captureGroup
     */
    public CaptureGroup build() {
      return new CaptureGroup(this);
    }

    /**
     * Adds an location to location.
     *
     * @param location the new location
     * @return the CaptureGroup builder
     */
    public Builder addLocation(Long location) {
      Validator.notNull(location, "location cannot be null");
      if (this.location == null) {
        this.location = new ArrayList<Long>();
      }
      this.location.add(location);
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the CaptureGroup builder
     */
    public Builder group(String group) {
      this.group = group;
      return this;
    }

    /**
     * Set the location.
     * Existing location will be replaced.
     *
     * @param location the location
     * @return the CaptureGroup builder
     */
    public Builder location(List<Long> location) {
      this.location = location;
      return this;
    }
  }

  private CaptureGroup(Builder builder) {
    Validator.notNull(builder.group, "group cannot be null");
    group = builder.group;
    location = builder.location;
  }

  /**
   * New builder.
   *
   * @return a CaptureGroup builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the group.
   *
   * A recognized capture group for the entity.
   *
   * @return the group
   */
  public String group() {
    return group;
  }

  /**
   * Gets the location.
   *
   * Zero-based character offsets that indicate where the entity value begins and ends in the input text.
   *
   * @return the location
   */
  public List<Long> location() {
    return location;
  }
}
