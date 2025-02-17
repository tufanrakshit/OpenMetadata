/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements. See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.openmetadata.catalog.security;

import org.openmetadata.catalog.type.EntityReference;
import org.skife.jdbi.v2.DBI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoopAuthorizer implements CatalogAuthorizer {
  private static final Logger LOG = LoggerFactory.getLogger(NoopAuthorizer.class);


  @Override
  public void init(AuthorizerConfiguration config, DBI jdbi) {
  }

  @Override
  public boolean hasPermissions(AuthenticationContext ctx, EntityReference entityOwnership) {
    return true;
  }

  @Override
  public boolean isAdmin(AuthenticationContext ctx) {
    return true;
  }

  @Override
  public boolean isBot(AuthenticationContext ctx) {
    return true;
  }
}
