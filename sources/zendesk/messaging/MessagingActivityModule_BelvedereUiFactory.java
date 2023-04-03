package zendesk.messaging;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.C9802b;

public final class MessagingActivityModule_BelvedereUiFactory implements ry1<C9802b> {
    private final ky4<AppCompatActivity> activityProvider;

    public MessagingActivityModule_BelvedereUiFactory(ky4<AppCompatActivity> ky4) {
        this.activityProvider = ky4;
    }

    public static C9802b belvedereUi(AppCompatActivity appCompatActivity) {
        return (C9802b) fu4.m44415f(MessagingActivityModule.belvedereUi(appCompatActivity));
    }

    public static MessagingActivityModule_BelvedereUiFactory create(ky4<AppCompatActivity> ky4) {
        return new MessagingActivityModule_BelvedereUiFactory(ky4);
    }

    public C9802b get() {
        return belvedereUi(this.activityProvider.get());
    }
}
