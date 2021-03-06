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
package io.hops.hopsworks.common.tags;

import io.hops.hopsworks.common.dataset.util.DatasetPath;
import io.hops.hopsworks.exceptions.DatasetException;
import io.hops.hopsworks.exceptions.MetadataException;
import io.hops.hopsworks.exceptions.SchematizedTagException;
import io.hops.hopsworks.persistence.entity.user.Users;

import java.util.Map;

public interface DatasetTagsControllerIface {
  
  Map<String, String> getAll(Users user, DatasetPath datasetPath)
    throws DatasetException, MetadataException;
  
  String get(Users user, DatasetPath datasetPath, String name)
    throws DatasetException, MetadataException, SchematizedTagException;
  
  AttachTagResult upsert(Users user, DatasetPath datasetPath, String name, String value)
    throws MetadataException, SchematizedTagException;
  
  AttachTagResult upsert(Users user, DatasetPath datasetPath, Map<String, String> newTags)
    throws MetadataException, SchematizedTagException;
  
  void deleteAll(Users user, DatasetPath datasetPath)
    throws MetadataException, DatasetException;
  
  void delete(Users user, DatasetPath datasetPath, String name)
    throws MetadataException, DatasetException;
}
