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
package io.hops.hopsworks.persistence.entity.git.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum GitProvider {
  @XmlEnumValue("GitHub")
  GIT_HUB("GitHub"),
  @XmlEnumValue("GitLab")
  GIT_LAB("GitLab"),
  @XmlEnumValue("BitBucket")
  BITBUCKET("BitBucket");

  private final String provider;
  GitProvider(String provider) {
    this.provider = provider;
  }

  @Override
  public String toString() {
    return provider;
  }

  public String getProvider() { return provider; }

  public static GitProvider fromValue(String shortName) throws IllegalArgumentException {
    switch (shortName.toUpperCase()) {
      case "GITHUB":
        return GitProvider.GIT_HUB;
      case "BITBUCKET":
        return GitProvider.BITBUCKET;
      case "GITLAB":
        return GitProvider.GIT_LAB;
      default:
        throw new IllegalArgumentException("Git provider [" + shortName + "] not supported.");
    }
  }
}
