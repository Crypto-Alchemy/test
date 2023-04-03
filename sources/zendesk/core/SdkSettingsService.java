package zendesk.core;

import com.google.gson.JsonElement;
import java.util.Map;

interface SdkSettingsService {
    @le2("/api/private/mobile_sdk/settings/{applicationId}.json")
    k90<Map<String, JsonElement>> getSettings(@nl2("Accept-Language") String str, @sm4("applicationId") String str2);
}
