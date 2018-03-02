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
package com.ibm.watson.developer_cloud.visual_recognition.v3.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Verbose list of classifiers retrieved in the GET v2/classifiers call.
 */
public class Classifiers extends GenericModel {

  private List<Classifier> classifiers;

  /**
   * Gets the classifiers.
   *
   * @return the classifiers
   */
  public List<Classifier> getClassifiers() {
    return classifiers;
  }

  /**
   * Sets the classifiers.
   *
   * @param classifiers the new classifiers
   */
  public void setClassifiers(final List<Classifier> classifiers) {
    this.classifiers = classifiers;
  }
}

