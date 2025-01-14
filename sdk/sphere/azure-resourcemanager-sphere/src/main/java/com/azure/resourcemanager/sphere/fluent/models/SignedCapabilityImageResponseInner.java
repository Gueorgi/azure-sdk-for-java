// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Signed device capability image response. */
@Immutable
public final class SignedCapabilityImageResponseInner {
    /*
     * The signed device capability image as a UTF-8 encoded base 64 string.
     */
    @JsonProperty(value = "image", access = JsonProperty.Access.WRITE_ONLY)
    private String image;

    /** Creates an instance of SignedCapabilityImageResponseInner class. */
    public SignedCapabilityImageResponseInner() {
    }

    /**
     * Get the image property: The signed device capability image as a UTF-8 encoded base 64 string.
     *
     * @return the image value.
     */
    public String image() {
        return this.image;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
