// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The AzureDataExplorerDataFeedPatch model.
 */
@Fluent
public final class AzureDataExplorerDataFeedPatch extends DataFeedDetailPatch {
    /*
     * The dataSourceParameter property.
     */
    private SQLSourceParameterPatch dataSourceParameter;

    /**
     * Creates an instance of AzureDataExplorerDataFeedPatch class.
     */
    public AzureDataExplorerDataFeedPatch() {
    }

    /**
     * Get the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @return the dataSourceParameter value.
     */
    public SQLSourceParameterPatch getDataSourceParameter() {
        return this.dataSourceParameter;
    }

    /**
     * Set the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @param dataSourceParameter the dataSourceParameter value to set.
     * @return the AzureDataExplorerDataFeedPatch object itself.
     */
    public AzureDataExplorerDataFeedPatch setDataSourceParameter(SQLSourceParameterPatch dataSourceParameter) {
        this.dataSourceParameter = dataSourceParameter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setDataFeedName(String dataFeedName) {
        super.setDataFeedName(dataFeedName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setDataFeedDescription(String dataFeedDescription) {
        super.setDataFeedDescription(dataFeedDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setTimestampColumn(String timestampColumn) {
        super.setTimestampColumn(timestampColumn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setDataStartFrom(OffsetDateTime dataStartFrom) {
        super.setDataStartFrom(dataStartFrom);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setStartOffsetInSeconds(Long startOffsetInSeconds) {
        super.setStartOffsetInSeconds(startOffsetInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setMaxConcurrency(Integer maxConcurrency) {
        super.setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        super.setMinRetryIntervalInSeconds(minRetryIntervalInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        super.setStopRetryAfterInSeconds(stopRetryAfterInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setNeedRollup(NeedRollupEnum needRollup) {
        super.setNeedRollup(needRollup);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setRollUpMethod(RollUpMethod rollUpMethod) {
        super.setRollUpMethod(rollUpMethod);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setRollUpColumns(List<String> rollUpColumns) {
        super.setRollUpColumns(rollUpColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setAllUpIdentification(String allUpIdentification) {
        super.setAllUpIdentification(allUpIdentification);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        super.setFillMissingPointType(fillMissingPointType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setFillMissingPointValue(Double fillMissingPointValue) {
        super.setFillMissingPointValue(fillMissingPointValue);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setViewMode(ViewMode viewMode) {
        super.setViewMode(viewMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setViewers(List<String> viewers) {
        super.setViewers(viewers);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setStatus(EntityStatus status) {
        super.setStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setActionLinkTemplate(String actionLinkTemplate) {
        super.setActionLinkTemplate(actionLinkTemplate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        super.setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerDataFeedPatch setCredentialId(String credentialId) {
        super.setCredentialId(credentialId);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceType", Objects.toString(DataSourceType.AZURE_DATA_EXPLORER, null));
        jsonWriter.writeStringField("dataFeedName", getDataFeedName());
        jsonWriter.writeStringField("dataFeedDescription", getDataFeedDescription());
        jsonWriter.writeStringField("timestampColumn", getTimestampColumn());
        jsonWriter.writeStringField("dataStartFrom", Objects.toString(getDataStartFrom(), null));
        jsonWriter.writeNumberField("startOffsetInSeconds", getStartOffsetInSeconds());
        jsonWriter.writeNumberField("maxConcurrency", getMaxConcurrency());
        jsonWriter.writeNumberField("minRetryIntervalInSeconds", getMinRetryIntervalInSeconds());
        jsonWriter.writeNumberField("stopRetryAfterInSeconds", getStopRetryAfterInSeconds());
        jsonWriter.writeStringField("needRollup", Objects.toString(getNeedRollup(), null));
        jsonWriter.writeStringField("rollUpMethod", Objects.toString(getRollUpMethod(), null));
        jsonWriter.writeArrayField("rollUpColumns", getRollUpColumns(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("allUpIdentification", getAllUpIdentification());
        jsonWriter.writeStringField("fillMissingPointType", Objects.toString(getFillMissingPointType(), null));
        jsonWriter.writeNumberField("fillMissingPointValue", getFillMissingPointValue());
        jsonWriter.writeStringField("viewMode", Objects.toString(getViewMode(), null));
        jsonWriter.writeArrayField("admins", getAdmins(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("viewers", getViewers(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("status", Objects.toString(getStatus(), null));
        jsonWriter.writeStringField("actionLinkTemplate", getActionLinkTemplate());
        jsonWriter.writeStringField("authenticationType", Objects.toString(getAuthenticationType(), null));
        jsonWriter.writeStringField("credentialId", getCredentialId());
        jsonWriter.writeJsonField("dataSourceParameter", this.dataSourceParameter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDataExplorerDataFeedPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDataExplorerDataFeedPatch if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AzureDataExplorerDataFeedPatch.
     */
    public static AzureDataExplorerDataFeedPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDataExplorerDataFeedPatch deserializedAzureDataExplorerDataFeedPatch
                = new AzureDataExplorerDataFeedPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceType".equals(fieldName)) {
                    String dataSourceType = reader.getString();
                    if (!"AzureDataExplorer".equals(dataSourceType)) {
                        throw new IllegalStateException(
                            "'dataSourceType' was expected to be non-null and equal to 'AzureDataExplorer'. The found 'dataSourceType' was '"
                                + dataSourceType + "'.");
                    }
                } else if ("dataFeedName".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setDataFeedName(reader.getString());
                } else if ("dataFeedDescription".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setDataFeedDescription(reader.getString());
                } else if ("timestampColumn".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setTimestampColumn(reader.getString());
                } else if ("dataStartFrom".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setDataStartFrom(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("startOffsetInSeconds".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setStartOffsetInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("maxConcurrency".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setMaxConcurrency(reader.getNullable(JsonReader::getInt));
                } else if ("minRetryIntervalInSeconds".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setMinRetryIntervalInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("stopRetryAfterInSeconds".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setStopRetryAfterInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("needRollup".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setNeedRollup(NeedRollupEnum.fromString(reader.getString()));
                } else if ("rollUpMethod".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setRollUpMethod(RollUpMethod.fromString(reader.getString()));
                } else if ("rollUpColumns".equals(fieldName)) {
                    List<String> rollUpColumns = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureDataExplorerDataFeedPatch.setRollUpColumns(rollUpColumns);
                } else if ("allUpIdentification".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setAllUpIdentification(reader.getString());
                } else if ("fillMissingPointType".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setFillMissingPointType(FillMissingPointType.fromString(reader.getString()));
                } else if ("fillMissingPointValue".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setFillMissingPointValue(reader.getNullable(JsonReader::getDouble));
                } else if ("viewMode".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setViewMode(ViewMode.fromString(reader.getString()));
                } else if ("admins".equals(fieldName)) {
                    List<String> admins = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureDataExplorerDataFeedPatch.setAdmins(admins);
                } else if ("viewers".equals(fieldName)) {
                    List<String> viewers = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureDataExplorerDataFeedPatch.setViewers(viewers);
                } else if ("status".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setStatus(EntityStatus.fromString(reader.getString()));
                } else if ("actionLinkTemplate".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setActionLinkTemplate(reader.getString());
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch
                        .setAuthenticationType(AuthenticationTypeEnum.fromString(reader.getString()));
                } else if ("credentialId".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.setCredentialId(reader.getString());
                } else if ("dataSourceParameter".equals(fieldName)) {
                    deserializedAzureDataExplorerDataFeedPatch.dataSourceParameter
                        = SQLSourceParameterPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureDataExplorerDataFeedPatch;
        });
    }
}
