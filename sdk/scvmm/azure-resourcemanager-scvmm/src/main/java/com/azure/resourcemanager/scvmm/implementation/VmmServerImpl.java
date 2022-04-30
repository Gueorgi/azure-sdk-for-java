// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.scvmm.fluent.models.VmmServerInner;
import com.azure.resourcemanager.scvmm.models.ExtendedLocation;
import com.azure.resourcemanager.scvmm.models.ResourcePatch;
import com.azure.resourcemanager.scvmm.models.VmmServer;
import com.azure.resourcemanager.scvmm.models.VmmServerPropertiesCredentials;
import java.util.Collections;
import java.util.Map;

public final class VmmServerImpl implements VmmServer, VmmServer.Definition, VmmServer.Update {
    private VmmServerInner innerObject;

    private final com.azure.resourcemanager.scvmm.ScvmmManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public VmmServerPropertiesCredentials credentials() {
        return this.innerModel().credentials();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public String connectionStatus() {
        return this.innerModel().connectionStatus();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public String uuid() {
        return this.innerModel().uuid();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VmmServerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.scvmm.ScvmmManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmmServerName;

    private ResourcePatch updateBody;

    public VmmServerImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VmmServer create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVmmServers()
                .createOrUpdate(resourceGroupName, vmmServerName, this.innerModel(), Context.NONE);
        return this;
    }

    public VmmServer create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVmmServers()
                .createOrUpdate(resourceGroupName, vmmServerName, this.innerModel(), context);
        return this;
    }

    VmmServerImpl(String name, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerObject = new VmmServerInner();
        this.serviceManager = serviceManager;
        this.vmmServerName = name;
    }

    public VmmServerImpl update() {
        this.updateBody = new ResourcePatch();
        return this;
    }

    public VmmServer apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVmmServers()
                .update(resourceGroupName, vmmServerName, updateBody, Context.NONE);
        return this;
    }

    public VmmServer apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVmmServers()
                .update(resourceGroupName, vmmServerName, updateBody, context);
        return this;
    }

    VmmServerImpl(VmmServerInner innerObject, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmmServerName = Utils.getValueFromIdByName(innerObject.id(), "vmmServers");
    }

    public VmmServer refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVmmServers()
                .getByResourceGroupWithResponse(resourceGroupName, vmmServerName, Context.NONE)
                .getValue();
        return this;
    }

    public VmmServer refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVmmServers()
                .getByResourceGroupWithResponse(resourceGroupName, vmmServerName, context)
                .getValue();
        return this;
    }

    public VmmServerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VmmServerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VmmServerImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VmmServerImpl withFqdn(String fqdn) {
        this.innerModel().withFqdn(fqdn);
        return this;
    }

    public VmmServerImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public VmmServerImpl withCredentials(VmmServerPropertiesCredentials credentials) {
        this.innerModel().withCredentials(credentials);
        return this;
    }

    public VmmServerImpl withPort(Integer port) {
        this.innerModel().withPort(port);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}