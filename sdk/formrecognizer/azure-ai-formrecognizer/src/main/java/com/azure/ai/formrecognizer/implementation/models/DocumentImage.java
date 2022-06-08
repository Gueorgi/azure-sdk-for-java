// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An image object detected in the page. */
@Fluent
public final class DocumentImage {
    /*
     * Bounding polygon of the image.
     */
    @JsonProperty(value = "polygon")
    private List<Float> polygon;

    /*
     * Location of the image in the reading order concatenated content.
     */
    @JsonProperty(value = "span", required = true)
    private DocumentSpan span;

    /*
     * 1-based page number of page containing the content of the image.
     */
    @JsonProperty(value = "pageNumber", required = true)
    private int pageNumber;

    /*
     * Confidence of correctly identifying the image.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Get the polygon property: Bounding polygon of the image.
     *
     * @return the polygon value.
     */
    public List<Float> getPolygon() {
        return this.polygon;
    }

    /**
     * Set the polygon property: Bounding polygon of the image.
     *
     * @param polygon the polygon value to set.
     * @return the DocumentImage object itself.
     */
    public DocumentImage setPolygon(List<Float> polygon) {
        this.polygon = polygon;
        return this;
    }

    /**
     * Get the span property: Location of the image in the reading order concatenated content.
     *
     * @return the span value.
     */
    public DocumentSpan getSpan() {
        return this.span;
    }

    /**
     * Set the span property: Location of the image in the reading order concatenated content.
     *
     * @param span the span value to set.
     * @return the DocumentImage object itself.
     */
    public DocumentImage setSpan(DocumentSpan span) {
        this.span = span;
        return this;
    }

    /**
     * Get the pageNumber property: 1-based page number of page containing the content of the image.
     *
     * @return the pageNumber value.
     */
    public int getPageNumber() {
        return this.pageNumber;
    }

    /**
     * Set the pageNumber property: 1-based page number of page containing the content of the image.
     *
     * @param pageNumber the pageNumber value to set.
     * @return the DocumentImage object itself.
     */
    public DocumentImage setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Get the confidence property: Confidence of correctly identifying the image.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence of correctly identifying the image.
     *
     * @param confidence the confidence value to set.
     * @return the DocumentImage object itself.
     */
    public DocumentImage setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }
}