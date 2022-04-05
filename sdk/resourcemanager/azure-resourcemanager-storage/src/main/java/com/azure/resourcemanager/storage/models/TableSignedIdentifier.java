// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object to set Table Access Policy. */
@Fluent
public final class TableSignedIdentifier {
    /*
     * unique-64-character-value of the stored access policy.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Access policy
     */
    @JsonProperty(value = "accessPolicy")
    private TableAccessPolicy accessPolicy;

    /**
     * Get the id property: unique-64-character-value of the stored access policy.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: unique-64-character-value of the stored access policy.
     *
     * @param id the id value to set.
     * @return the TableSignedIdentifier object itself.
     */
    public TableSignedIdentifier withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the accessPolicy property: Access policy.
     *
     * @return the accessPolicy value.
     */
    public TableAccessPolicy accessPolicy() {
        return this.accessPolicy;
    }

    /**
     * Set the accessPolicy property: Access policy.
     *
     * @param accessPolicy the accessPolicy value to set.
     * @return the TableSignedIdentifier object itself.
     */
    public TableSignedIdentifier withAccessPolicy(TableAccessPolicy accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model TableSignedIdentifier"));
        }
        if (accessPolicy() != null) {
            accessPolicy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TableSignedIdentifier.class);
}