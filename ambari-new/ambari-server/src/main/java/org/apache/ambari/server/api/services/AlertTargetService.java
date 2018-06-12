/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.api.services;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.ambari.server.api.resources.ResourceInstance;
import org.apache.ambari.server.controller.spi.Resource;
import org.apache.ambari.server.state.alert.AlertTarget;

/**
 * The {@link AlertTargetService} handles CRUD operation requests for alert
 * targets.
 */
@Path("/alert_targets/")
public class AlertTargetService extends BaseService {

  @GET
  @Produces("text/plain")
  public Response getTargets(@Context HttpHeaders headers,
      @Context UriInfo ui) {
    return handleRequest(headers, null, ui, Request.Type.GET,
        createAlertTargetResource(null));
  }

  @GET
  @Produces("text/plain")
  @Path("{targetId}")
  public Response getTargets(@Context HttpHeaders headers,
      @Context UriInfo ui, @PathParam("targetId") Long targetId) {
    return handleRequest(headers, null, ui, Request.Type.GET,
        createAlertTargetResource(targetId));
  }

  @POST
  @Produces("text/plain")
  public Response createTarget(String body, @Context HttpHeaders headers,
      @Context UriInfo ui) {
    return handleRequest(headers, body, ui, Request.Type.POST,
        createAlertTargetResource(null));
  }

  @PUT
  @Produces("text/plain")
  @Path("{targetId}")
  public Response updateGroup(String body, @Context HttpHeaders headers,
      @Context UriInfo ui, @PathParam("targetId") Long targetId) {
    return handleRequest(headers, body, ui, Request.Type.PUT,
        createAlertTargetResource(targetId));
  }

  @DELETE
  @Produces("text/plain")
  @Path("{targetId}")
  public Response deleteTarget(String body, @Context HttpHeaders headers,
      @Context UriInfo ui, @PathParam("targetId") Long targetId) {
    return handleRequest(headers, body, ui, Request.Type.DELETE,
        createAlertTargetResource(targetId));
  }

  /**
   * Create a request capturing the target ID and resource type for an
   * {@link AlertTarget}.
   *
   * @param targetId
   *          the unique ID of the target to create the query for (not
   *          {@code null}).
   * @return the instance of the query.
   */
  private ResourceInstance createAlertTargetResource(Long targetId) {
    Map<Resource.Type, String> mapIds = new HashMap<Resource.Type, String>();

    mapIds.put(Resource.Type.AlertTarget,
        null == targetId ? null : targetId.toString());

    return createResource(Resource.Type.AlertTarget, mapIds);
  }
}