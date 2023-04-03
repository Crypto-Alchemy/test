package zendesk.messaging.p026ui;

import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.components.DateProvider;

/* renamed from: zendesk.messaging.ui.MessagingCellFactory_Factory */
public final class MessagingCellFactory_Factory implements ry1<MessagingCellFactory> {
    private final ky4<AvatarStateFactory> avatarStateFactoryProvider;
    private final ky4<AvatarStateRenderer> avatarStateRendererProvider;
    private final ky4<MessagingCellPropsFactory> cellPropsFactoryProvider;
    private final ky4<DateProvider> dateProvider;
    private final ky4<EventFactory> eventFactoryProvider;
    private final ky4<EventListener> eventListenerProvider;
    private final ky4<Boolean> multilineResponseOptionsEnabledProvider;

    public MessagingCellFactory_Factory(ky4<MessagingCellPropsFactory> ky4, ky4<DateProvider> ky42, ky4<EventListener> ky43, ky4<EventFactory> ky44, ky4<AvatarStateRenderer> ky45, ky4<AvatarStateFactory> ky46, ky4<Boolean> ky47) {
        this.cellPropsFactoryProvider = ky4;
        this.dateProvider = ky42;
        this.eventListenerProvider = ky43;
        this.eventFactoryProvider = ky44;
        this.avatarStateRendererProvider = ky45;
        this.avatarStateFactoryProvider = ky46;
        this.multilineResponseOptionsEnabledProvider = ky47;
    }

    public static MessagingCellFactory_Factory create(ky4<MessagingCellPropsFactory> ky4, ky4<DateProvider> ky42, ky4<EventListener> ky43, ky4<EventFactory> ky44, ky4<AvatarStateRenderer> ky45, ky4<AvatarStateFactory> ky46, ky4<Boolean> ky47) {
        return new MessagingCellFactory_Factory(ky4, ky42, ky43, ky44, ky45, ky46, ky47);
    }

    public static MessagingCellFactory newInstance(MessagingCellPropsFactory messagingCellPropsFactory, DateProvider dateProvider2, EventListener eventListener, EventFactory eventFactory, Object obj, Object obj2, boolean z) {
        return new MessagingCellFactory(messagingCellPropsFactory, dateProvider2, eventListener, eventFactory, (AvatarStateRenderer) obj, (AvatarStateFactory) obj2, z);
    }

    public MessagingCellFactory get() {
        return newInstance(this.cellPropsFactoryProvider.get(), this.dateProvider.get(), this.eventListenerProvider.get(), this.eventFactoryProvider.get(), this.avatarStateRendererProvider.get(), this.avatarStateFactoryProvider.get(), this.multilineResponseOptionsEnabledProvider.get().booleanValue());
    }
}
