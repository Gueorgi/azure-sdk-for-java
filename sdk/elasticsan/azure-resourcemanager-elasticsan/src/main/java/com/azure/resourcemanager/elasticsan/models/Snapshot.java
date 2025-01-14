// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.SnapshotInner;

/** An immutable client-side representation of Snapshot. */
public interface Snapshot {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the creationData property: Data used when creating a volume snapshot.
     *
     * @return the creationData value.
     */
    SnapshotCreationData creationData();

    /**
     * Gets the provisioningState property: State of the operation on the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningStates provisioningState();

    /**
     * Gets the sourceVolumeSizeGiB property: Size of Source Volume.
     *
     * @return the sourceVolumeSizeGiB value.
     */
    Long sourceVolumeSizeGiB();

    /**
     * Gets the volumeName property: Source Volume Name of a snapshot.
     *
     * @return the volumeName value.
     */
    String volumeName();

    /**
     * Gets the inner com.azure.resourcemanager.elasticsan.fluent.models.SnapshotInner object.
     *
     * @return the inner object.
     */
    SnapshotInner innerModel();

    /** The entirety of the Snapshot definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreationData,
            DefinitionStages.WithCreate {
    }

    /** The Snapshot definition stages. */
    interface DefinitionStages {
        /** The first stage of the Snapshot definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the Snapshot definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, elasticSanName, volumeGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param elasticSanName The name of the ElasticSan.
             * @param volumeGroupName The name of the VolumeGroup.
             * @return the next definition stage.
             */
            WithCreationData withExistingVolumegroup(
                String resourceGroupName, String elasticSanName, String volumeGroupName);
        }

        /** The stage of the Snapshot definition allowing to specify creationData. */
        interface WithCreationData {
            /**
             * Specifies the creationData property: Data used when creating a volume snapshot..
             *
             * @param creationData Data used when creating a volume snapshot.
             * @return the next definition stage.
             */
            WithCreate withCreationData(SnapshotCreationData creationData);
        }

        /**
         * The stage of the Snapshot definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Snapshot create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Snapshot create(Context context);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Snapshot refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Snapshot refresh(Context context);
}
