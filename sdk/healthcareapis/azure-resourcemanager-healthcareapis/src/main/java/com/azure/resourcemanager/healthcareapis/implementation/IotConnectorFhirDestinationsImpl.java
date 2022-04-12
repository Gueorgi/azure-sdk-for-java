// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthcareapis.fluent.IotConnectorFhirDestinationsClient;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotFhirDestinationInner;
import com.azure.resourcemanager.healthcareapis.models.IotConnectorFhirDestinations;
import com.azure.resourcemanager.healthcareapis.models.IotFhirDestination;

public final class IotConnectorFhirDestinationsImpl implements IotConnectorFhirDestinations {
    private static final ClientLogger LOGGER = new ClientLogger(IotConnectorFhirDestinationsImpl.class);

    private final IotConnectorFhirDestinationsClient innerClient;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    public IotConnectorFhirDestinationsImpl(
        IotConnectorFhirDestinationsClient innerClient,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IotFhirDestination get(
        String resourceGroupName, String workspaceName, String iotConnectorName, String fhirDestinationName) {
        IotFhirDestinationInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName);
        if (inner != null) {
            return new IotFhirDestinationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotFhirDestination> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String iotConnectorName,
        String fhirDestinationName,
        Context context) {
        Response<IotFhirDestinationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotFhirDestinationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String workspaceName, String iotConnectorName, String fhirDestinationName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName);
    }

    public void delete(
        String resourceGroupName,
        String workspaceName,
        String iotConnectorName,
        String fhirDestinationName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName, context);
    }

    public IotFhirDestination getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String iotConnectorName = Utils.getValueFromIdByName(id, "iotconnectors");
        if (iotConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'iotconnectors'.", id)));
        }
        String fhirDestinationName = Utils.getValueFromIdByName(id, "fhirdestinations");
        if (fhirDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'fhirdestinations'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName, Context.NONE)
            .getValue();
    }

    public Response<IotFhirDestination> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String iotConnectorName = Utils.getValueFromIdByName(id, "iotconnectors");
        if (iotConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'iotconnectors'.", id)));
        }
        String fhirDestinationName = Utils.getValueFromIdByName(id, "fhirdestinations");
        if (fhirDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'fhirdestinations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String iotConnectorName = Utils.getValueFromIdByName(id, "iotconnectors");
        if (iotConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'iotconnectors'.", id)));
        }
        String fhirDestinationName = Utils.getValueFromIdByName(id, "fhirdestinations");
        if (fhirDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'fhirdestinations'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String iotConnectorName = Utils.getValueFromIdByName(id, "iotconnectors");
        if (iotConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'iotconnectors'.", id)));
        }
        String fhirDestinationName = Utils.getValueFromIdByName(id, "fhirdestinations");
        if (fhirDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'fhirdestinations'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, iotConnectorName, fhirDestinationName, context);
    }

    private IotConnectorFhirDestinationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }

    public IotFhirDestinationImpl define(String name) {
        return new IotFhirDestinationImpl(name, this.manager());
    }
}