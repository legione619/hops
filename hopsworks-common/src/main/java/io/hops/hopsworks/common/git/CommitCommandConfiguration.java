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
package io.hops.hopsworks.common.git;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@JsonTypeName("commitCommandConfiguration")
public class CommitCommandConfiguration extends RepositoryActionCommandConfiguration {
  @XmlElement
  private String message;
  @XmlElement
  private boolean all;
  //Files to add and commit
  @XmlElement
  private List<String> files;

  public CommitCommandConfiguration(){}

  public String getMessage() { return message; }

  public void setMessage(String message) { this.message = message; }

  public Boolean isAll() { return all; }

  public void setAll(Boolean all) { this.all = all; }

  public List<String> getFiles() { return files; }

  public void setFiles(List<String> files) { this.files = files; }
}
