/*
 * This file is part of Hopsworks
 * Copyright (C) 2021, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */
package io.hops.hopsworks.alerting.config.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "source_match",
  "source_match_re",
  "target_match",
  "target_match_re",
  "equal"
  })
public class InhibitRule {

  @JsonProperty("source_match")
  private Map<String, String> sourceMatch;
  @JsonProperty("source_match_re")
  private Map<String, String> sourceMatchRe;
  @JsonProperty("target_match")
  private Map<String, String> targetMatch;
  @JsonProperty("target_match_re")
  private Map<String, String> targetMatchRe;
  @JsonProperty("equal")
  private List<String> equal = null;

  public InhibitRule() {
  }

  public InhibitRule(Map<String, String> sourceMatch, Map<String, String> sourceMatchRe,
    Map<String, String> targetMatch, Map<String, String> targetMatchRe) {
    this.sourceMatch = sourceMatch;
    this.sourceMatchRe = sourceMatchRe;
    this.targetMatch = targetMatch;
    this.targetMatchRe = targetMatchRe;
  }

  @JsonProperty("source_match")
  public Map<String, String> getSourceMatch() {
    return sourceMatch;
  }

  @JsonProperty("source_match")
  public void setSourceMatch(Map<String, String> sourceMatch) {
    this.sourceMatch = sourceMatch;
  }

  public InhibitRule withSourceMatch(Map<String, String> sourceMatch) {
    this.sourceMatch = sourceMatch;
    return this;
  }

  @JsonProperty("source_match_re")
  public Map<String, String> getSourceMatchRe() {
    return sourceMatchRe;
  }

  @JsonProperty("source_match_re")
  public void setSourceMatchRe(Map<String, String> sourceMatchRe) {
    this.sourceMatchRe = sourceMatchRe;
  }

  public InhibitRule withSourceMatchRe(Map<String, String> sourceMatchRe) {
    this.sourceMatchRe = sourceMatchRe;
    return this;
  }

  @JsonProperty("target_match")
  public Map<String, String> getTargetMatch() {
    return targetMatch;
  }

  @JsonProperty("target_match")
  public void setTargetMatch(Map<String, String> targetMatch) {
    this.targetMatch = targetMatch;
  }

  public InhibitRule withTargetMatch(Map<String, String> targetMatch) {
    this.targetMatch = targetMatch;
    return this;
  }

  @JsonProperty("target_match_re")
  public Map<String, String> getTargetMatchRe() {
    return targetMatchRe;
  }

  @JsonProperty("target_match_re")
  public void setTargetMatchRe(Map<String, String> targetMatchRe) {
    this.targetMatchRe = targetMatchRe;
  }

  public InhibitRule withTargetMatchRe(Map<String, String> targetMatchRe) {
    this.targetMatchRe = targetMatchRe;
    return this;
  }

  @JsonProperty("equal")
  public List<String> getEqual() {
    return equal;
  }

  @JsonProperty("equal")
  public void setEqual(List<String> equal) {
    this.equal = equal;
  }

  public InhibitRule withEqual(List<String> equal) {
    this.equal = equal;
    return this;
  }

  @Override
  public String toString() {
    return "InhibitRule{" +
      "sourceMatch=" + sourceMatch +
      ", sourceMatchRe=" + sourceMatchRe +
      ", targetMatch=" + targetMatch +
      ", targetMatchRe=" + targetMatchRe +
      ", equal=" + equal +
      '}';
  }
}
