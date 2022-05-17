/*
 * This file is part of Hopsworks
 * Copyright (C) 2020, Logical Clocks AB. All rights reserved
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
package io.hops.hopsworks.api.provenance.ops;

import io.hops.hopsworks.common.provenance.ops.ProvUsageType;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.QueryParam;
import java.util.Set;

public class ProvUsageBeanParams {
  @QueryParam("type")
  @ApiParam(allowMultiple = true)
  private Set<ProvUsageType> usageType;
  
  public ProvUsageBeanParams(
    @QueryParam("type") Set<ProvUsageType> usageType) {
    this.usageType = usageType;
  }
  
  public Set<ProvUsageType> getUsageType() {
    return usageType;
  }
  
  public void setUsageType(Set<ProvUsageType> usageType) {
    this.usageType = usageType;
  }
}
