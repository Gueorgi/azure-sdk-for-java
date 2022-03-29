// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for ApiManagementServiceSkus ListAvailableServiceSkus. */
public final class ApiManagementServiceSkusListAvailableServiceSkusSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListSKUs-Dedicated.json
     */
    /**
     * Sample code: ApiManagementListSKUs-Dedicated.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListSKUsDedicated(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiManagementServiceSkus().listAvailableServiceSkus("rg1", "apimService1", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListSKUs-Consumption.json
     */
    /**
     * Sample code: ApiManagementListSKUs-Consumption.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListSKUsConsumption(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiManagementServiceSkus().listAvailableServiceSkus("rg1", "apimService1", Context.NONE);
    }
}