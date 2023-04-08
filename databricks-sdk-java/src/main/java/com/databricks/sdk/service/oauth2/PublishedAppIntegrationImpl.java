// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of PublishedAppIntegration */
class PublishedAppIntegrationImpl implements PublishedAppIntegrationService {
    private final ApiClient apiClient;

    public PublishedAppIntegrationImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public CreatePublishedAppIntegrationOutput create(CreatePublishedAppIntegration request) {
        String path = String.format("/api/2.0/accounts//oauth2/published-app-integrations");
        return apiClient.POST(path, request, CreatePublishedAppIntegrationOutput.class);
    }
    
    @Override
    public void delete(DeletePublishedAppIntegrationRequest request) {
        String path = String.format("/api/2.0/accounts//oauth2/published-app-integrations/%s", request.getIntegrationId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public GetPublishedAppIntegrationOutput get(GetPublishedAppIntegrationRequest request) {
        String path = String.format("/api/2.0/accounts//oauth2/published-app-integrations/%s", request.getIntegrationId());
        return apiClient.GET(path, request, GetPublishedAppIntegrationOutput.class);
    }
    
    @Override
    public GetPublishedAppIntegrationsOutput list() {
        String path = String.format("/api/2.0/accounts//oauth2/published-app-integrations");
        return apiClient.GET(path, GetPublishedAppIntegrationsOutput.class);
    }
    
    @Override
    public void update(UpdatePublishedAppIntegration request) {
        String path = String.format("/api/2.0/accounts//oauth2/published-app-integrations/%s", request.getIntegrationId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}