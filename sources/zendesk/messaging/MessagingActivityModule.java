package zendesk.messaging;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C9802b;
import zendesk.messaging.components.DateProvider;

abstract class MessagingActivityModule {
    public static C9802b belvedereUi(AppCompatActivity appCompatActivity) {
        return BelvedereUi.m75343b(appCompatActivity);
    }

    public static DateProvider dateProvider() {
        return new DateProvider();
    }

    public static Handler handler() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean multilineResponseOptionsEnabled(MessagingComponent messagingComponent) {
        return messagingComponent.messagingConfiguration().isMultilineResponseOptionsEnabled();
    }
}
