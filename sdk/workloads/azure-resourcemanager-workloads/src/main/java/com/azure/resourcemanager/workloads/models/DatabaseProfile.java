// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workload database profile. */
@Fluent
public final class DatabaseProfile {
    /*
     * Database type
     */
    @JsonProperty(value = "type", required = true)
    private DatabaseType type;

    /*
     * Database server name
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /*
     * Database version
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The name of the server SKU, e.g. Standard_D32s_v4
     */
    @JsonProperty(value = "sku", required = true)
    private String sku;

    /*
     * Tier of the server SKU
     */
    @JsonProperty(value = "tier", required = true)
    private DatabaseTier tier;

    /*
     * Whether to enable HA for the server
     */
    @JsonProperty(value = "haEnabled")
    private HAEnabled haEnabled;

    /*
     * SKU name for database storage
     */
    @JsonProperty(value = "storageSku")
    private String storageSku;

    /*
     * Database storage size in GB
     */
    @JsonProperty(value = "storageInGB")
    private Long storageInGB;

    /*
     * Storage IOPS for the server
     */
    @JsonProperty(value = "storageIops")
    private Long storageIops;

    /*
     * Backup retention days for the server
     */
    @JsonProperty(value = "backupRetentionDays")
    private Integer backupRetentionDays;

    /*
     * Whether to enable SSL enforcement on the database
     */
    @JsonProperty(value = "sslEnforcementEnabled")
    private EnableSslEnforcement sslEnforcementEnabled;

    /*
     * Azure Database Server resource Id
     */
    @JsonProperty(value = "serverResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String serverResourceId;

    /**
     * Get the type property: Database type.
     *
     * @return the type value.
     */
    public DatabaseType type() {
        return this.type;
    }

    /**
     * Set the type property: Database type.
     *
     * @param type the type value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withType(DatabaseType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the serverName property: Database server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: Database server name.
     *
     * @param serverName the serverName value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the version property: Database version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Database version.
     *
     * @param version the version value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sku property: The name of the server SKU, e.g. Standard_D32s_v4.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name of the server SKU, e.g. Standard_D32s_v4.
     *
     * @param sku the sku value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tier property: Tier of the server SKU.
     *
     * @return the tier value.
     */
    public DatabaseTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of the server SKU.
     *
     * @param tier the tier value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withTier(DatabaseTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the haEnabled property: Whether to enable HA for the server.
     *
     * @return the haEnabled value.
     */
    public HAEnabled haEnabled() {
        return this.haEnabled;
    }

    /**
     * Set the haEnabled property: Whether to enable HA for the server.
     *
     * @param haEnabled the haEnabled value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withHaEnabled(HAEnabled haEnabled) {
        this.haEnabled = haEnabled;
        return this;
    }

    /**
     * Get the storageSku property: SKU name for database storage.
     *
     * @return the storageSku value.
     */
    public String storageSku() {
        return this.storageSku;
    }

    /**
     * Set the storageSku property: SKU name for database storage.
     *
     * @param storageSku the storageSku value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withStorageSku(String storageSku) {
        this.storageSku = storageSku;
        return this;
    }

    /**
     * Get the storageInGB property: Database storage size in GB.
     *
     * @return the storageInGB value.
     */
    public Long storageInGB() {
        return this.storageInGB;
    }

    /**
     * Set the storageInGB property: Database storage size in GB.
     *
     * @param storageInGB the storageInGB value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withStorageInGB(Long storageInGB) {
        this.storageInGB = storageInGB;
        return this;
    }

    /**
     * Get the storageIops property: Storage IOPS for the server.
     *
     * @return the storageIops value.
     */
    public Long storageIops() {
        return this.storageIops;
    }

    /**
     * Set the storageIops property: Storage IOPS for the server.
     *
     * @param storageIops the storageIops value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withStorageIops(Long storageIops) {
        this.storageIops = storageIops;
        return this;
    }

    /**
     * Get the backupRetentionDays property: Backup retention days for the server.
     *
     * @return the backupRetentionDays value.
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }

    /**
     * Set the backupRetentionDays property: Backup retention days for the server.
     *
     * @param backupRetentionDays the backupRetentionDays value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withBackupRetentionDays(Integer backupRetentionDays) {
        this.backupRetentionDays = backupRetentionDays;
        return this;
    }

    /**
     * Get the sslEnforcementEnabled property: Whether to enable SSL enforcement on the database.
     *
     * @return the sslEnforcementEnabled value.
     */
    public EnableSslEnforcement sslEnforcementEnabled() {
        return this.sslEnforcementEnabled;
    }

    /**
     * Set the sslEnforcementEnabled property: Whether to enable SSL enforcement on the database.
     *
     * @param sslEnforcementEnabled the sslEnforcementEnabled value to set.
     * @return the DatabaseProfile object itself.
     */
    public DatabaseProfile withSslEnforcementEnabled(EnableSslEnforcement sslEnforcementEnabled) {
        this.sslEnforcementEnabled = sslEnforcementEnabled;
        return this;
    }

    /**
     * Get the serverResourceId property: Azure Database Server resource Id.
     *
     * @return the serverResourceId value.
     */
    public String serverResourceId() {
        return this.serverResourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model DatabaseProfile"));
        }
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model DatabaseProfile"));
        }
        if (tier() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tier in model DatabaseProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseProfile.class);
}