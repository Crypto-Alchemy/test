package zendesk.messaging.p026ui;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.C9802b;
import zendesk.messaging.BelvedereMediaHolder;

/* renamed from: zendesk.messaging.ui.InputBoxAttachmentClickListener_Factory */
public final class InputBoxAttachmentClickListener_Factory implements ry1<InputBoxAttachmentClickListener> {
    private final ky4<AppCompatActivity> activityProvider;
    private final ky4<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private final ky4<C9802b> imageStreamProvider;

    public InputBoxAttachmentClickListener_Factory(ky4<AppCompatActivity> ky4, ky4<C9802b> ky42, ky4<BelvedereMediaHolder> ky43) {
        this.activityProvider = ky4;
        this.imageStreamProvider = ky42;
        this.belvedereMediaHolderProvider = ky43;
    }

    public static InputBoxAttachmentClickListener_Factory create(ky4<AppCompatActivity> ky4, ky4<C9802b> ky42, ky4<BelvedereMediaHolder> ky43) {
        return new InputBoxAttachmentClickListener_Factory(ky4, ky42, ky43);
    }

    public static InputBoxAttachmentClickListener newInstance(AppCompatActivity appCompatActivity, C9802b bVar, BelvedereMediaHolder belvedereMediaHolder) {
        return new InputBoxAttachmentClickListener(appCompatActivity, bVar, belvedereMediaHolder);
    }

    public InputBoxAttachmentClickListener get() {
        return newInstance(this.activityProvider.get(), this.imageStreamProvider.get(), this.belvedereMediaHolderProvider.get());
    }
}
