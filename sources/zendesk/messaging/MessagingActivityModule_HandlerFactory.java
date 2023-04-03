package zendesk.messaging;

import android.os.Handler;

public final class MessagingActivityModule_HandlerFactory implements ry1<Handler> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MessagingActivityModule_HandlerFactory INSTANCE = new MessagingActivityModule_HandlerFactory();
    }

    public static MessagingActivityModule_HandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Handler handler() {
        return (Handler) fu4.m44415f(MessagingActivityModule.handler());
    }

    public Handler get() {
        return handler();
    }
}
