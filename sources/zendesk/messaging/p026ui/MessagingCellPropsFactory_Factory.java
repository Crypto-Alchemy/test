package zendesk.messaging.p026ui;

import android.content.res.Resources;

/* renamed from: zendesk.messaging.ui.MessagingCellPropsFactory_Factory */
public final class MessagingCellPropsFactory_Factory implements ry1<MessagingCellPropsFactory> {
    private final ky4<Resources> resourcesProvider;

    public MessagingCellPropsFactory_Factory(ky4<Resources> ky4) {
        this.resourcesProvider = ky4;
    }

    public static MessagingCellPropsFactory_Factory create(ky4<Resources> ky4) {
        return new MessagingCellPropsFactory_Factory(ky4);
    }

    public static MessagingCellPropsFactory newInstance(Resources resources) {
        return new MessagingCellPropsFactory(resources);
    }

    public MessagingCellPropsFactory get() {
        return newInstance(this.resourcesProvider.get());
    }
}
