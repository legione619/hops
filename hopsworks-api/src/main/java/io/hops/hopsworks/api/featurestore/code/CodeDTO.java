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

package io.hops.hopsworks.api.featurestore.code;

import io.hops.hopsworks.common.api.RestDTO;
import io.hops.hopsworks.common.featurestore.code.CodeContentFormat;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CodeDTO extends RestDTO<CodeDTO> {

  private int codeId;
  private String applicationId;
  private Long commitTime;
  private Long featureGroupCommitId;
  private String content;
  private CodeContentFormat contentFormat;
  private String path;

  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationID) {
    this.applicationId = applicationID;
  }

  public int getCodeId() {
    return codeId;
  }

  public void setCodeId(int codeId) {
    this.codeId = codeId;
  }

  public Long getCommitTime() {
    return commitTime;
  }

  public void setCommitTime(Long commitTime) {
    this.commitTime = commitTime;
  }

  public Long getFeatureGroupCommitId() {
    return featureGroupCommitId;
  }

  public void setFeatureGroupCommitId(Long featureGroupCommitId) {
    this.featureGroupCommitId = featureGroupCommitId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CodeContentFormat getContentFormat() {
    return contentFormat;
  }

  public void setContentFormat(CodeContentFormat contentFormat) {
    this.contentFormat = contentFormat;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }
}
