// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Deployment Configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "configurationType")
@JsonTypeName("Deployment")
@Fluent
public final class DeploymentConfiguration extends SapConfiguration {
    /*
     * The geo-location where the SAP system is to be created.
     */
    @JsonProperty(value = "appLocation")
    private String appLocation;

    /*
     * The infrastructure configuration.
     */
    @JsonProperty(value = "infrastructureConfiguration")
    private InfrastructureConfiguration infrastructureConfiguration;

    /*
     * The software configuration.
     */
    @JsonProperty(value = "softwareConfiguration")
    private SoftwareConfiguration softwareConfiguration;

    /**
     * Get the appLocation property: The geo-location where the SAP system is to be created.
     *
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the appLocation property: The geo-location where the SAP system is to be created.
     *
     * @param appLocation the appLocation value to set.
     * @return the DeploymentConfiguration object itself.
     */
    public DeploymentConfiguration withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the infrastructureConfiguration property: The infrastructure configuration.
     *
     * @return the infrastructureConfiguration value.
     */
    public InfrastructureConfiguration infrastructureConfiguration() {
        return this.infrastructureConfiguration;
    }

    /**
     * Set the infrastructureConfiguration property: The infrastructure configuration.
     *
     * @param infrastructureConfiguration the infrastructureConfiguration value to set.
     * @return the DeploymentConfiguration object itself.
     */
    public DeploymentConfiguration withInfrastructureConfiguration(
        InfrastructureConfiguration infrastructureConfiguration) {
        this.infrastructureConfiguration = infrastructureConfiguration;
        return this;
    }

    /**
     * Get the softwareConfiguration property: The software configuration.
     *
     * @return the softwareConfiguration value.
     */
    public SoftwareConfiguration softwareConfiguration() {
        return this.softwareConfiguration;
    }

    /**
     * Set the softwareConfiguration property: The software configuration.
     *
     * @param softwareConfiguration the softwareConfiguration value to set.
     * @return the DeploymentConfiguration object itself.
     */
    public DeploymentConfiguration withSoftwareConfiguration(SoftwareConfiguration softwareConfiguration) {
        this.softwareConfiguration = softwareConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (infrastructureConfiguration() != null) {
            infrastructureConfiguration().validate();
        }
        if (softwareConfiguration() != null) {
            softwareConfiguration().validate();
        }
    }
}