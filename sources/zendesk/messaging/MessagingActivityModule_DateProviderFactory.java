package zendesk.messaging;

import zendesk.messaging.components.DateProvider;

public final class MessagingActivityModule_DateProviderFactory implements ry1<DateProvider> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MessagingActivityModule_DateProviderFactory INSTANCE = new MessagingActivityModule_DateProviderFactory();
    }

    public static MessagingActivityModule_DateProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DateProvider dateProvider() {
        return (DateProvider) fu4.m44415f(MessagingActivityModule.dateProvider());
    }

    public DateProvider get() {
        return dateProvider();
    }
}
