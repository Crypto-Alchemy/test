package zendesk.core;

import com.google.gson.JsonElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

class ZendeskSettingsStorage implements SettingsStorage {
    private static final String LAST_UPDATE = "last_settings_update";
    private static final String RAWSETTTINGS_KEYSET = "rawsettings_keyset";
    private final BaseStorage settingsStorage;

    public ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    public boolean areSettingsUpToDate(long j, TimeUnit timeUnit) {
        Long l;
        synchronized (this.settingsStorage) {
            l = (Long) this.settingsStorage.get(LAST_UPDATE, Long.class);
        }
        if (l == null || l.longValue() == -1) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
            return true;
        }
        return false;
    }

    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    public Map<String, JsonElement> getRawSettings() {
        HashMap hashMap;
        synchronized (this.settingsStorage) {
            hashMap = new HashMap();
            Set<String> set = (Set) this.settingsStorage.get(RAWSETTTINGS_KEYSET, Set.class);
            if (set != null) {
                for (String str : set) {
                    if (str != null) {
                        hashMap.put(str, (JsonElement) this.settingsStorage.get(str, JsonElement.class));
                    }
                }
            }
        }
        return hashMap;
    }

    public <E> E getSettings(String str, Class<E> cls) {
        E e;
        synchronized (this.settingsStorage) {
            e = this.settingsStorage.get(str, cls);
        }
        return e;
    }

    public boolean hasStoredSettings() {
        boolean b;
        synchronized (this.settingsStorage) {
            b = kb6.m46949b(this.settingsStorage.get(LAST_UPDATE));
        }
        return b;
    }

    public void storeRawSettings(Map<String, JsonElement> map) {
        synchronized (this.settingsStorage) {
            this.settingsStorage.put(LAST_UPDATE, (Object) Long.valueOf(System.currentTimeMillis()));
            for (Map.Entry next : map.entrySet()) {
                this.settingsStorage.put((String) next.getKey(), next.getValue());
            }
            this.settingsStorage.put(RAWSETTTINGS_KEYSET, (Object) map.keySet());
        }
    }
}
