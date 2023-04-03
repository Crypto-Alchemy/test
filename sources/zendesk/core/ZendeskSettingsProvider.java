package zendesk.core;

import android.content.Context;
import com.google.gson.JsonElement;
import com.zendesk.logger.Logger;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    private static final String LOG_TAG = "ZendeskSdkSettingsProvi";
    public static final int SDK_SETTINGS_MAX_AGE_HOURS = 1;
    /* access modifiers changed from: private */
    public final ActionHandlerRegistry actionHandlerRegistry;
    private final String applicationId;
    private final Context context;
    /* access modifiers changed from: private */
    public final CoreSettingsStorage coreSettingsStorage;
    /* access modifiers changed from: private */
    public final Serializer serializer;
    private final SdkSettingsService settingsService;
    /* access modifiers changed from: private */
    public final SettingsStorage settingsStorage;
    private final ZendeskLocaleConverter zendeskLocaleConverter;

    public ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage2, CoreSettingsStorage coreSettingsStorage2, ActionHandlerRegistry actionHandlerRegistry2, Serializer serializer2, ZendeskLocaleConverter zendeskLocaleConverter2, String str, Context context2) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage2;
        this.coreSettingsStorage = coreSettingsStorage2;
        this.actionHandlerRegistry = actionHandlerRegistry2;
        this.serializer = serializer2;
        this.zendeskLocaleConverter = zendeskLocaleConverter2;
        this.applicationId = str;
        this.context = context2;
    }

    private void getSettingsInternal(Locale locale, op7<Map<String, JsonElement>> op7) {
        this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).mo50512X(new qg5(op7));
    }

    public CoreSettings extractCoreSettings(Map<String, JsonElement> map) {
        JsonElement jsonElement;
        if (map == null) {
            jsonElement = null;
        } else {
            jsonElement = map.get(ZendeskCoreSettingsStorage.CORE_KEY);
        }
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(jsonElement, CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        return ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }

    public BlipsSettings getBlipsSettings() {
        return this.coreSettingsStorage.getBlipsSettings();
    }

    public void getCoreSettings(final op7<CoreSettings> op7) {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new op7<Map<String, JsonElement>>() {
                public void onError(hr1 hr1) {
                    op7 op7 = op7;
                    if (op7 != null) {
                        op7.onSuccess(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings());
                    }
                }

                public void onSuccess(Map<String, JsonElement> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (op7 != null) {
                        op7.onSuccess(ZendeskSettingsProvider.this.extractCoreSettings(map));
                    }
                }
            });
        } else if (op7 != null) {
            op7.onSuccess(this.coreSettingsStorage.getCoreSettings());
        }
    }

    public <E extends Settings> void getSettingsForSdk(final String str, final Class<E> cls, final op7<SettingsPack<E>> op7) {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new op7<Map<String, JsonElement>>() {
                public void onError(hr1 hr1) {
                    if (op7 != null) {
                        if (ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                            op7.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                            return;
                        }
                        op7.onError(hr1);
                    }
                }

                public void onSuccess(Map<String, JsonElement> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (op7 != null) {
                        op7.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                    }
                }
            });
        } else if (op7 != null) {
            op7.onSuccess(new SettingsPack(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
            this.actionHandlerRegistry.updateSettings(this.settingsStorage.getRawSettings());
        }
    }

    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map<String, JsonElement> settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0), (AuthenticationType) null);
        }
        this.actionHandlerRegistry.updateSettings(settingsInternal);
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }

    private Map<String, JsonElement> getSettingsInternal(Locale locale) {
        try {
            bg5<Map<String, JsonElement>> execute = this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).execute();
            if (execute.mo50578a() != null) {
                return new HashMap(execute.mo50578a());
            }
            return new HashMap(0);
        } catch (IOException unused) {
            Logger.m43081e(LOG_TAG, "Settings retrieval failed, returning empty map.", new Object[0]);
            return new HashMap(0);
        }
    }
}
