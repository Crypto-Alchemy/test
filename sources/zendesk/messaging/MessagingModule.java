package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;
import com.squareup.picasso.Picasso;
import zendesk.belvedere.C9800a;

abstract class MessagingModule {
    public static C9800a belvedere(Context context) {
        return C9800a.m75438c(context);
    }

    public static Picasso picasso(Context context) {
        return new Picasso.C5422b(context).mo39475a();
    }

    public static Resources resources(Context context) {
        return context.getResources();
    }
}
