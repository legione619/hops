/*
 * This file is part of Hopsworks
 * Copyright (C) 2019, Logical Clocks AB. All rights reserved
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

package io.hops.hopsworks.common.util;

import com.logicalclocks.servicediscoverclient.exceptions.ServiceDiscoveryException;
import io.hops.hopsworks.common.hosts.ServiceDiscoveryController;
import io.hops.hopsworks.common.serving.ServingConfig;
import io.hops.hopsworks.exceptions.ApiKeyException;
import io.hops.hopsworks.exceptions.JobException;
import io.hops.hopsworks.persistence.entity.project.Project;
import io.hops.hopsworks.persistence.entity.jobs.configuration.JobConfiguration;
import io.hops.hopsworks.persistence.entity.user.Users;

import java.io.IOException;
import java.util.Map;

public abstract class ConfigurationUtil {
  public abstract Map<String, String> setFrameworkProperties(Project project, JobConfiguration jobConfiguration,
                                                             Settings settings, String hdfsUser, Users hopsworksUser,
                                                             Map<String, String> extraJavaOptions,
                                                             String kafkaBrokersString, String hopsworksRestEndpoint,
                                                             ServingConfig servingConfig,
                                                             ServiceDiscoveryController serviceDiscoveryController)
          throws IOException, ServiceDiscoveryException, JobException, ApiKeyException;
}
