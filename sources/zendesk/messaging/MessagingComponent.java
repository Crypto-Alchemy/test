package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;
import com.squareup.picasso.Picasso;
import java.util.List;
import zendesk.belvedere.C9800a;

interface MessagingComponent {

    public interface Builder {
        Builder appContext(Context context);

        MessagingComponent build();

        Builder engines(List<Engine> list);

        Builder messagingConfiguration(MessagingConfiguration messagingConfiguration);
    }

    C9800a belvedere();

    BelvedereMediaHolder belvedereMediaHolder();

    MessagingConfiguration messagingConfiguration();

    MessagingViewModel messagingViewModel();

    Picasso picasso();

    Resources resources();
}
