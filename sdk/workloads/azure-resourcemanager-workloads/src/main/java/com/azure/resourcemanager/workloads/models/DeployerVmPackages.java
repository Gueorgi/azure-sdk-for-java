// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the url and storage account ID where deployer VM packages are uploaded. */
@Fluent
public final class DeployerVmPackages {
    /*
     * The URL to the deployer VM packages file.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * The deployer VM packages storage account id
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /**
     * Get the url property: The URL to the deployer VM packages file.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The URL to the deployer VM packages file.
     *
     * @param url the url value to set.
     * @return the DeployerVmPackages object itself.
     */
    public DeployerVmPackages withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the storageAccountId property: The deployer VM packages storage account id.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: The deployer VM packages storage account id.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the DeployerVmPackages object itself.
     */
    public DeployerVmPackages withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}