// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CompressionReadSettings;
import com.azure.resourcemanager.datafactory.models.DelimitedTextReadSettings;
import com.azure.resourcemanager.datafactory.models.DelimitedTextSource;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;

public final class DelimitedTextSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DelimitedTextSource model = BinaryData.fromString(
            "{\"type\":\"DelimitedTextSource\",\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"databsungn\",\"disableMetricsCollection\":\"datakm\",\"\":{\"gbgzjyrd\":\"databju\",\"qvpjydwmaq\":\"dataiwhmrhz\"}},\"formatSettings\":{\"type\":\"DelimitedTextReadSettings\",\"skipLineCount\":\"datajpua\",\"compressionProperties\":{\"type\":\"CompressionReadSettings\",\"\":{\"bjzscr\":\"datapdcsvzugiurhgqlv\",\"kg\":\"datatnqbkpobjufksdd\",\"lsrguecbthauivg\":\"datawxlylxfpvoylf\",\"edqgyrvulz\":\"dataime\"}},\"\":{\"qskikq\":\"datackpdpdcnr\",\"iznnnadn\":\"dataqiybqtlvofjjse\"}},\"additionalColumns\":\"datasbpxlserqgxnh\",\"sourceRetryCount\":\"dataccd\",\"sourceRetryWait\":\"dataxybn\",\"maxConcurrentConnections\":\"datahmpmeglolpot\",\"disableMetricsCollection\":\"datamb\",\"\":{\"m\":\"datajryt\",\"j\":\"datano\",\"lrxytra\":\"datatnnthjqgovvi\",\"twyt\":\"datae\"}}")
            .toObject(DelimitedTextSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DelimitedTextSource model = new DelimitedTextSource().withSourceRetryCount("dataccd")
            .withSourceRetryWait("dataxybn").withMaxConcurrentConnections("datahmpmeglolpot")
            .withDisableMetricsCollection("datamb")
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("databsungn")
                .withDisableMetricsCollection("datakm").withAdditionalProperties(mapOf("type", "StoreReadSettings")))
            .withFormatSettings(new DelimitedTextReadSettings().withSkipLineCount("datajpua").withCompressionProperties(
                new CompressionReadSettings().withAdditionalProperties(mapOf("type", "CompressionReadSettings"))))
            .withAdditionalColumns("datasbpxlserqgxnh");
        model = BinaryData.fromObject(model).toObject(DelimitedTextSource.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
