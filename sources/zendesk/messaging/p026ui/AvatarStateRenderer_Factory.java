package zendesk.messaging.p026ui;

import com.squareup.picasso.Picasso;

/* renamed from: zendesk.messaging.ui.AvatarStateRenderer_Factory */
public final class AvatarStateRenderer_Factory implements ry1<AvatarStateRenderer> {
    private final ky4<Picasso> picassoProvider;

    public AvatarStateRenderer_Factory(ky4<Picasso> ky4) {
        this.picassoProvider = ky4;
    }

    public static AvatarStateRenderer_Factory create(ky4<Picasso> ky4) {
        return new AvatarStateRenderer_Factory(ky4);
    }

    public static AvatarStateRenderer newInstance(Picasso picasso) {
        return new AvatarStateRenderer(picasso);
    }

    public AvatarStateRenderer get() {
        return newInstance(this.picassoProvider.get());
    }
}
