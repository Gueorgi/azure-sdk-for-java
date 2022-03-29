// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.FluxConfigurationInner;

/** Resource collection API of FluxConfigurations. */
public interface FluxConfigurations {
    /**
     * Gets details of the Flux Configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Flux Configuration.
     */
    FluxConfiguration get(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName);

    /**
     * Gets details of the Flux Configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Flux Configuration along with {@link Response}.
     */
    Response<FluxConfiguration> getWithResponse(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        Context context);

    /**
     * Create a new Kubernetes Flux Configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @param fluxConfiguration Properties necessary to Create a FluxConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flux Configuration object returned in Get &amp; Put response.
     */
    FluxConfiguration createOrUpdate(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationInner fluxConfiguration);

    /**
     * Create a new Kubernetes Flux Configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @param fluxConfiguration Properties necessary to Create a FluxConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flux Configuration object returned in Get &amp; Put response.
     */
    FluxConfiguration createOrUpdate(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationInner fluxConfiguration,
        Context context);

    /**
     * Update an existing Kubernetes Flux Configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @param fluxConfigurationPatch Properties to Patch in an existing Flux Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flux Configuration object returned in Get &amp; Put response.
     */
    FluxConfiguration update(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationPatch fluxConfigurationPatch);

    /**
     * Update an existing Kubernetes Flux Configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @param fluxConfigurationPatch Properties to Patch in an existing Flux Configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flux Configuration object returned in Get &amp; Put response.
     */
    FluxConfiguration update(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationPatch fluxConfigurationPatch,
        Context context);

    /**
     * This will delete the YAML file used to set up the Flux Configuration, thus stopping future sync from the source
     * repo.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @param forceDelete Delete the extension resource in Azure - not the normal asynchronous delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        Boolean forceDelete);

    /**
     * This will delete the YAML file used to set up the Flux Configuration, thus stopping future sync from the source
     * repo.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName);

    /**
     * This will delete the YAML file used to set up the Flux Configuration, thus stopping future sync from the source
     * repo.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param fluxConfigurationName Name of the Flux Configuration.
     * @param forceDelete Delete the extension resource in Azure - not the normal asynchronous delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        Boolean forceDelete,
        Context context);

    /**
     * List all Flux Configurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Flux Configurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FluxConfiguration> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName);

    /**
     * List all Flux Configurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Flux Configurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FluxConfiguration> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, Context context);
}