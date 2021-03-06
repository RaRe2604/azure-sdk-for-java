/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * The common properties of a DigitalTwinsInstance.
 */
public class DigitalTwinsResource extends Resource {
    /**
     * This property is reserved for future use, and will be ignored/omitted.
     */
    @JsonProperty(value = "sku")
    private DigitalTwinsSkuInfo sku;

    /**
     * Creates an instance of DigitalTwinsResource class.
     */
    public DigitalTwinsResource() {
        sku = new DigitalTwinsSkuInfo();
    }

    /**
     * Get this property is reserved for future use, and will be ignored/omitted.
     *
     * @return the sku value
     */
    public DigitalTwinsSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set this property is reserved for future use, and will be ignored/omitted.
     *
     * @param sku the sku value to set
     * @return the DigitalTwinsResource object itself.
     */
    public DigitalTwinsResource withSku(DigitalTwinsSkuInfo sku) {
        this.sku = sku;
        return this;
    }

}
