package zendesk.support.request;

import com.zendesk.logger.Logger;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

class ActionLoadSettings implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final AuthenticationProvider authProvider;
    private final SupportSettingsProvider settingsProvider;

    public ActionLoadSettings(ActionFactory actionFactory2, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider) {
        this.actionFactory = actionFactory2;
        this.settingsProvider = supportSettingsProvider;
        this.authProvider = authenticationProvider;
    }

    /* access modifiers changed from: private */
    public StateSettings constructSettings(SupportSdkSettings supportSdkSettings) {
        Identity identity = this.authProvider.getIdentity();
        if (!(identity instanceof AnonymousIdentity)) {
            return StateSettings.fromSupportSettings(supportSdkSettings, true, true);
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
        return StateSettings.fromSupportSettings(supportSdkSettings, kb6.m46949b(anonymousIdentity.getEmail()), kb6.m46949b(anonymousIdentity.getName()));
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadSettings());
    }

    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        this.settingsProvider.getSettings(new op7<SupportSdkSettings>() {
            public void onError(hr1 hr1) {
                Logger.m43087k(RequestActivity.LOG_TAG, "Error loading settings. Error: '%s'", hr1.mo43366h());
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsError(hr1));
                callback.done();
            }

            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsSuccess(ActionLoadSettings.this.constructSettings(supportSdkSettings)));
                callback.done();
            }
        });
    }
}
