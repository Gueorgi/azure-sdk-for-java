// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * The AzureSQLConnectionStringCredential model.
 */
@Fluent
public final class AzureSQLConnectionStringCredential extends DataSourceCredential {
    /*
     * The parameters property.
     */
    private AzureSQLConnectionStringParam parameters;

    /**
     * Creates an instance of AzureSQLConnectionStringCredential class.
     */
    public AzureSQLConnectionStringCredential() {
    }

    /**
     * Get the parameters property: The parameters property.
     * 
     * @return the parameters value.
     */
    public AzureSQLConnectionStringParam getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     * 
     * @param parameters the parameters value to set.
     * @return the AzureSQLConnectionStringCredential object itself.
     */
    public AzureSQLConnectionStringCredential setParameters(AzureSQLConnectionStringParam parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSQLConnectionStringCredential setDataSourceCredentialName(String dataSourceCredentialName) {
        super.setDataSourceCredentialName(dataSourceCredentialName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSQLConnectionStringCredential
        setDataSourceCredentialDescription(String dataSourceCredentialDescription) {
        super.setDataSourceCredentialDescription(dataSourceCredentialDescription);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceCredentialType",
            Objects.toString(DataSourceCredentialType.AZURE_SQLCONNECTION_STRING, null));
        jsonWriter.writeStringField("dataSourceCredentialName", getDataSourceCredentialName());
        jsonWriter.writeStringField("dataSourceCredentialDescription", getDataSourceCredentialDescription());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureSQLConnectionStringCredential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureSQLConnectionStringCredential if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AzureSQLConnectionStringCredential.
     */
    public static AzureSQLConnectionStringCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureSQLConnectionStringCredential deserializedAzureSQLConnectionStringCredential
                = new AzureSQLConnectionStringCredential();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceCredentialType".equals(fieldName)) {
                    String dataSourceCredentialType = reader.getString();
                    if (!"AzureSQLConnectionString".equals(dataSourceCredentialType)) {
                        throw new IllegalStateException(
                            "'dataSourceCredentialType' was expected to be non-null and equal to 'AzureSQLConnectionString'. The found 'dataSourceCredentialType' was '"
                                + dataSourceCredentialType + "'.");
                    }
                } else if ("dataSourceCredentialName".equals(fieldName)) {
                    deserializedAzureSQLConnectionStringCredential.setDataSourceCredentialName(reader.getString());
                } else if ("dataSourceCredentialId".equals(fieldName)) {
                    deserializedAzureSQLConnectionStringCredential.setDataSourceCredentialId(
                        reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("dataSourceCredentialDescription".equals(fieldName)) {
                    deserializedAzureSQLConnectionStringCredential
                        .setDataSourceCredentialDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    deserializedAzureSQLConnectionStringCredential.parameters
                        = AzureSQLConnectionStringParam.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureSQLConnectionStringCredential;
        });
    }
}
