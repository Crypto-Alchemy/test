package zendesk.support.request;

import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.core.Zendesk;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

class ActionUpdateNameEmail implements AsyncMiddleware.AsyncAction {
    private final AuthenticationProvider authenticationProvider;
    private final String email;
    private final String name;

    /* renamed from: zendesk  reason: collision with root package name */
    private final Zendesk f46909zendesk;

    public ActionUpdateNameEmail(String str, String str2, AuthenticationProvider authenticationProvider2, Zendesk zendesk2) {
        this.name = str;
        this.email = str2;
        this.authenticationProvider = authenticationProvider2;
        this.f46909zendesk = zendesk2;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
    }

    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        Identity identity = this.authenticationProvider.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            if (kb6.m46949b(this.email) && !this.email.equals(anonymousIdentity.getEmail())) {
                anonymousIdentity = (AnonymousIdentity) new AnonymousIdentity.Builder().withEmailIdentifier(this.email).withNameIdentifier(anonymousIdentity.getName()).build();
            }
            if (kb6.m46949b(this.name) && !this.name.equals(anonymousIdentity.getName())) {
                anonymousIdentity = (AnonymousIdentity) new AnonymousIdentity.Builder().withEmailIdentifier(anonymousIdentity.getEmail()).withNameIdentifier(this.name).build();
            }
            if (anonymousIdentity != identity) {
                this.f46909zendesk.setIdentity(anonymousIdentity);
            }
        }
        callback.done();
    }
}
