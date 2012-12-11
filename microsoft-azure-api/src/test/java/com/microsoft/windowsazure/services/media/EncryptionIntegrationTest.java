/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media;

import java.util.UUID;

import org.junit.Test;

import com.microsoft.windowsazure.services.core.ServiceException;
import com.microsoft.windowsazure.services.media.models.Asset;
import com.microsoft.windowsazure.services.media.models.AssetFileInfo;
import com.microsoft.windowsazure.services.media.models.AssetInfo;
import com.microsoft.windowsazure.services.media.models.ContentKeyInfo;
import com.microsoft.windowsazure.services.media.models.ContentKeyType;
import com.microsoft.windowsazure.services.media.models.EncryptionOption;
import com.microsoft.windowsazure.services.media.models.ProtectionKey;

public class EncryptionIntegrationTest extends IntegrationTestBase {

    private final String validButNonexistContentKeyId = "nb:kid:UUID:80dfe751-e5a1-4b29-a992-4a75276473af";
    private final ContentKeyType testContentKeyType = ContentKeyType.CommonEncryption;
    private final String testEncryptedContentKey = "ThisIsEncryptedContentKey";

    private String createRandomContentKeyId() {
        UUID uuid = UUID.randomUUID();
        String randomContentKey = String.format("nb:kid:UUID:%s", uuid);
        return randomContentKey;
    }

    private String getProtectionKey(ContentKeyType contentKeyType) {
        String protectionKeyId = null;
        try {
            protectionKeyId = (String) service.action(ProtectionKey.getProtectionKeyId(contentKeyType));
        }
        catch (ServiceException e) {
            throw new RuntimeException(e);
        }
        String protectionKey;
        try {
            protectionKey = (String) service.action(ProtectionKey.getProtectionKey(protectionKeyId));
        }
        catch (ServiceException e) {
            throw new RuntimeException(e);
        }
        return protectionKey;
    }

    @Test
    public void uploadAesProtectedAssetAndDecryptSuccess() throws Exception {
        // Arrange

        // Act
        byte[] aesKey = EncryptionHelper.create256BitRandomVector();
        byte[] initializationVector = EncryptionHelper.create256BitRandomVector();

        AssetInfo assetInfo = createAsset("uploadAesProtectedAssetSuccess");
        String protectionKey = getProtectionKey(ContentKeyType.StorageEncryption);
        AssetFileInfo assetFileInfo = uploadEncryptedAssetFile(assetInfo, protectionKey, assetFileName);
        ContentKeyInfo contentKeyInfo = createContentKey(aesKey, initializationVector);
        service.action(Asset.linkContentKey(assetInfo.getId(), contentKeyInfo.getId()));

        // Assert

    }

    private ContentKeyInfo createContentKey(byte[] aesKey, byte[] initializationVector) {
        // TODO Auto-generated method stub
        return null;
    }

    private String getProtectionKey(EncryptionOption storageencrypted) {
        // TODO Auto-generated method stub
        return null;
    }

    private AssetInfo createAsset(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    private String createRandomInitializationVector() {
        // TODO Auto-generated method stub
        return null;
    }

}
