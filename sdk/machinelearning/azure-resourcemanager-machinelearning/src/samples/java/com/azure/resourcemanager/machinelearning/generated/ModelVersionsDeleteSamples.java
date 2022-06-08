// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for ModelVersions Delete. */
public final class ModelVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/ModelVersion/delete.json
     */
    /**
     * Sample code: Delete Model Version.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void deleteModelVersion(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.modelVersions().deleteWithResponse("test-rg", "my-aml-workspace", "string", "string", Context.NONE);
    }
}