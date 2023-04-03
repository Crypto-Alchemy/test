package zendesk.support;

import android.content.SharedPreferences;
import com.zendesk.logger.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class LegacyRequestMigrator implements RequestMigrator {
    private static final String LOG_TAG = "LegacyRequestMigrator";
    private static final String PREFS_COMMENT_COUNT_KEY_PREFIX = "request-id-cc";
    private static final String REQUEST_KEY = "stored_requests";
    private SharedPreferences legacyRequestStorage;

    public LegacyRequestMigrator(SharedPreferences sharedPreferences) {
        this.legacyRequestStorage = sharedPreferences;
    }

    private String getCommentCountKey(String str) {
        return String.format(Locale.US, "%s-%s", new Object[]{PREFS_COMMENT_COUNT_KEY_PREFIX, str});
    }

    public void clearLegacyRequestStorage() {
        this.legacyRequestStorage.edit().clear().apply();
    }

    public List<RequestData> getLegacyRequests() {
        String string = this.legacyRequestStorage.getString(REQUEST_KEY, (String) null);
        if (kb6.m46951d(string)) {
            return Collections.emptyList();
        }
        Logger.m43078b(LOG_TAG, "Migrating legacy request IDs.", new Object[0]);
        List<String> a = kb6.m46948a(string);
        ArrayList arrayList = new ArrayList(a.size());
        for (String next : a) {
            int i = this.legacyRequestStorage.getInt(getCommentCountKey(next), -1);
            if (i > -1) {
                arrayList.add(RequestData.create(next, i, 0));
            } else {
                arrayList.add(RequestData.create(next, 0, 0));
            }
        }
        return arrayList;
    }
}
