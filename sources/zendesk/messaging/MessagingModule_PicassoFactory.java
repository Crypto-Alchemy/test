package zendesk.messaging;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class MessagingModule_PicassoFactory implements ry1<Picasso> {
    private final ky4<Context> contextProvider;

    public MessagingModule_PicassoFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static MessagingModule_PicassoFactory create(ky4<Context> ky4) {
        return new MessagingModule_PicassoFactory(ky4);
    }

    public static Picasso picasso(Context context) {
        return (Picasso) fu4.m44415f(MessagingModule.picasso(context));
    }

    public Picasso get() {
        return picasso(this.contextProvider.get());
    }
}
