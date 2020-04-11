/*
 * Copyright 2018, 2020 IBM Corp. All Rights Reserved.
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
package com.ibm.watson.health.iml.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Model for ontology artifact.
 */
public class ArtifactModel extends GenericModel {

  private String cui;
  private String ontology;
  private String preferredName;
  private String alternativeName;
  private String type;
  private Long rank;
  private Long hitCount;
  private Float score;
  private List<String> surfaceForms;

  /**
   * Gets the cui.
   *
   * Ontology provided unique identifier for artifact.
   *
   * @return the cui
   */
  public String getCui() {
    return cui;
  }

  /**
   * Gets the ontology.
   *
   * Source ontology for artifact.
   *
   * @return the ontology
   */
  public String getOntology() {
    return ontology;
  }

  /**
   * Gets the preferredName.
   *
   * Ontology provided normalized name for artifact.
   *
   * @return the preferredName
   */
  public String getPreferredName() {
    return preferredName;
  }

  /**
   * Gets the alternativeName.
   *
   * Ontology provided alternative name for artifact.
   *
   * @return the alternativeName
   */
  public String getAlternativeName() {
    return alternativeName;
  }

  /**
   * Gets the type.
   *
   * Ontology semantic type for artifact.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the rank.
   *
   * Search weight assigned to artifact.
   *
   * @return the rank
   */
  public Long getRank() {
    return rank;
  }

  /**
   * Gets the hitCount.
   *
   * Number of corpus documents artifact was found in.
   *
   * @return the hitCount
   */
  public Long getHitCount() {
    return hitCount;
  }

  /**
   * Gets the score.
   *
   * Relevance score for artifact.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }

  /**
   * Gets the surfaceForms.
   *
   * List of artifact synonyms.
   *
   * @return the surfaceForms
   */
  public List<String> getSurfaceForms() {
    return surfaceForms;
  }
}
