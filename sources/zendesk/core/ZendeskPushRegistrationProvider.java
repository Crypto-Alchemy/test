package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import java.util.Locale;
import p000.qg5;

class ZendeskPushRegistrationProvider implements PushRegistrationProvider, PushRegistrationProviderInternal {
    private static final String LOG_TAG = "PushRegistrationProvider";
    private static final qg5.C6410b<PushRegistrationResponseWrapper, String> PUSH_RESPONSE_EXTRACTOR = new qg5.C6410b<PushRegistrationResponseWrapper, String>() {
        public String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
            return (pushRegistrationResponseWrapper == null || pushRegistrationResponseWrapper.getRegistrationResponse() == null || !kb6.m46949b(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) ? "" : pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
        }
    };
    /* access modifiers changed from: private */
    public final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    /* access modifiers changed from: private */
    public final Locale locale;
    /* access modifiers changed from: private */
    public final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    public enum TokenType {
        Identifier((String) null),
        UrbanAirshipChannelId("urban_airship_channel_id");
        
        public final String name;

        private TokenType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager2, SettingsProvider settingsProvider2, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale2) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager2;
        this.settingsProvider = settingsProvider2;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
        this.locale = locale2;
    }

    private boolean checkForStoredPushRegistration(String str, op7<String> op7) {
        if (!kb6.m46949b(str)) {
            if (op7 != null) {
                op7.onError(new ir1("Invalid identifier provided."));
            }
            Logger.m43087k(LOG_TAG, "Invalid identifier provided.", new Object[0]);
            return true;
        } else if (!this.pushIdStorage.hasRegisteredDeviceId() || !str.equals(this.pushIdStorage.getRegisteredDeviceId())) {
            if (this.pushIdStorage.hasRegisteredDeviceId()) {
                this.pushIdStorage.removeRegisteredDeviceId();
                Logger.m43078b(LOG_TAG, "Removing stored push registration response because a new one has been provided.", new Object[0]);
            }
            return false;
        } else {
            if (op7 != null) {
                op7.onSuccess(str);
            }
            Logger.m43078b(LOG_TAG, "Skipping registration because device is already registered with this ID.", new Object[0]);
            return true;
        }
    }

    private void getAuthTypeAndRequest(String str, TokenType tokenType, op7<String> op7) {
        if (!checkForStoredPushRegistration(str, op7)) {
            final op7<String> op72 = op7;
            final String str2 = str;
            final TokenType tokenType2 = tokenType;
            this.settingsProvider.getCoreSettings(new PassThroughErrorZendeskCallback<CoreSettings>(op7) {
                public void onSuccess(CoreSettings coreSettings) {
                    AuthenticationType authentication = coreSettings.getAuthentication();
                    if (authentication == null) {
                        op7 op7 = op72;
                        if (op7 != null) {
                            op7.onError(new ir1("Authentication type is null."));
                            return;
                        }
                        return;
                    }
                    ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = ZendeskPushRegistrationProvider.this;
                    PushRegistrationRequest access$100 = zendeskPushRegistrationProvider.getPushRegistrationRequest(str2, zendeskPushRegistrationProvider.locale, authentication, tokenType2);
                    if (ZendeskPushRegistrationProvider.this.hasNoStoredAccessToken()) {
                        ZendeskPushRegistrationProvider.this.storePendingPushRegistrationRequest(access$100, op72);
                    } else {
                        ZendeskPushRegistrationProvider.this.sendPushRegistrationRequest(access$100, op72);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public PushRegistrationRequest getPushRegistrationRequest(String str, Locale locale2, AuthenticationType authenticationType, TokenType tokenType) {
        PushRegistrationRequest pushRegistrationRequest = new PushRegistrationRequest();
        pushRegistrationRequest.setIdentifier(str);
        pushRegistrationRequest.setLocale(zj3.m55133d(locale2));
        if (tokenType == TokenType.UrbanAirshipChannelId) {
            pushRegistrationRequest.setTokenType(tokenType.name);
        }
        if (AuthenticationType.ANONYMOUS == authenticationType) {
            pushRegistrationRequest.setSdkGuid(this.identityManager.getSdkGuid());
        }
        return pushRegistrationRequest;
    }

    /* access modifiers changed from: private */
    public boolean hasNoStoredAccessToken() {
        if (this.identityManager.getStoredAccessTokenAsBearerToken() == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void onSuccessfulRegistration(String str) {
        this.pushIdStorage.storeRegisteredDeviceId(str);
        this.pushIdStorage.removePushRegistrationRequest();
        this.blipsProvider.corePushEnabled();
    }

    /* access modifiers changed from: private */
    public void sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, final op7<String> op7) {
        this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).mo50512X(new qg5(new PassThroughErrorZendeskCallback<String>(op7) {
            public void onSuccess(String str) {
                ZendeskPushRegistrationProvider.this.onSuccessfulRegistration(str);
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(str);
                }
            }
        }, PUSH_RESPONSE_EXTRACTOR));
    }

    /* access modifiers changed from: private */
    public void storePendingPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, op7<String> op7) {
        this.pushIdStorage.storePushRegistrationRequest(pushRegistrationRequest);
        if (op7 != null) {
            op7.onSuccess(pushRegistrationRequest.getIdentifier());
        }
    }

    public boolean isRegisteredForPush() {
        return this.pushIdStorage.hasRegisteredDeviceId();
    }

    public void registerWithDeviceIdentifier(String str, op7<String> op7) {
        getAuthTypeAndRequest(str, TokenType.Identifier, op7);
    }

    public void registerWithUAChannelId(String str, op7<String> op7) {
        getAuthTypeAndRequest(str, TokenType.UrbanAirshipChannelId, op7);
    }

    public void unregisterDevice(final op7<Void> op7) {
        String registeredDeviceId = this.pushIdStorage.getRegisteredDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (registeredDeviceId != null) {
            this.pushService.unregisterDevice(registeredDeviceId).mo50512X(new qg5(new PassThroughErrorZendeskCallback<Void>(op7) {
                public void onSuccess(Void voidR) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removeRegisteredDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    op7 op7 = op7;
                    if (op7 != null) {
                        op7.onSuccess(voidR);
                    }
                }
            }));
        }
    }

    public String sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest) {
        try {
            bg5<PushRegistrationResponseWrapper> execute = this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).execute();
            if (execute.mo50578a() == null || execute.mo50578a().getRegistrationResponse() == null) {
                return "";
            }
            String identifier = execute.mo50578a().getRegistrationResponse().getIdentifier();
            onSuccessfulRegistration(identifier);
            return identifier;
        } catch (IOException e) {
            Logger.m43080d(LOG_TAG, "Push registration request failed.", e, new Object[0]);
            return "";
        }
    }
}
