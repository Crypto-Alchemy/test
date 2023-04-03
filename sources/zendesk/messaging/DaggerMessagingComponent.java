package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;
import com.squareup.picasso.Picasso;
import java.util.List;
import zendesk.belvedere.C9800a;
import zendesk.messaging.MessagingComponent;

final class DaggerMessagingComponent implements MessagingComponent {
    private ky4<Context> appContextProvider;
    private ky4<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private ky4<C9800a> belvedereProvider;
    private ky4<List<Engine>> enginesProvider;
    private final DaggerMessagingComponent messagingComponent;
    private final MessagingConfiguration messagingConfiguration;
    private ky4<MessagingConfiguration> messagingConfigurationProvider;
    private ky4<MessagingConversationLog> messagingConversationLogProvider;
    private ky4<MessagingEventSerializer> messagingEventSerializerProvider;
    private ky4<MessagingModel> messagingModelProvider;
    private ky4<MessagingViewModel> messagingViewModelProvider;
    private ky4<Picasso> picassoProvider;
    private ky4<Resources> resourcesProvider;
    private ky4<TimestampFactory> timestampFactoryProvider;

    public static final class Builder implements MessagingComponent.Builder {
        private Context appContext;
        private List<Engine> engines;
        private MessagingConfiguration messagingConfiguration;

        private Builder() {
        }

        public MessagingComponent build() {
            fu4.m44410a(this.appContext, Context.class);
            fu4.m44410a(this.engines, List.class);
            fu4.m44410a(this.messagingConfiguration, MessagingConfiguration.class);
            return new DaggerMessagingComponent(this.appContext, this.engines, this.messagingConfiguration);
        }

        public Builder appContext(Context context) {
            this.appContext = (Context) fu4.m44411b(context);
            return this;
        }

        public Builder engines(List<Engine> list) {
            this.engines = (List) fu4.m44411b(list);
            return this;
        }

        public Builder messagingConfiguration(MessagingConfiguration messagingConfiguration2) {
            this.messagingConfiguration = (MessagingConfiguration) fu4.m44411b(messagingConfiguration2);
            return this;
        }
    }

    public static MessagingComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Context context, List<Engine> list, MessagingConfiguration messagingConfiguration2) {
        ry1 a = yv2.m54878a(context);
        this.appContextProvider = a;
        this.picassoProvider = li1.m47821a(MessagingModule_PicassoFactory.create(a));
        this.resourcesProvider = li1.m47821a(MessagingModule_ResourcesFactory.create(this.appContextProvider));
        this.enginesProvider = yv2.m54878a(list);
        this.messagingConfigurationProvider = yv2.m54878a(messagingConfiguration2);
        TimestampFactory_Factory create = TimestampFactory_Factory.create(this.appContextProvider);
        this.timestampFactoryProvider = create;
        ky4<MessagingEventSerializer> a2 = li1.m47821a(MessagingEventSerializer_Factory.create(this.appContextProvider, create));
        this.messagingEventSerializerProvider = a2;
        ky4<MessagingConversationLog> a3 = li1.m47821a(MessagingConversationLog_Factory.create(a2));
        this.messagingConversationLogProvider = a3;
        ky4<MessagingModel> a4 = li1.m47821a(MessagingModel_Factory.create(this.resourcesProvider, this.enginesProvider, this.messagingConfigurationProvider, a3));
        this.messagingModelProvider = a4;
        this.messagingViewModelProvider = li1.m47821a(MessagingViewModel_Factory.create(a4));
        this.belvedereProvider = li1.m47821a(MessagingModule_BelvedereFactory.create(this.appContextProvider));
        this.belvedereMediaHolderProvider = li1.m47821a(BelvedereMediaHolder_Factory.create());
    }

    public C9800a belvedere() {
        return this.belvedereProvider.get();
    }

    public BelvedereMediaHolder belvedereMediaHolder() {
        return this.belvedereMediaHolderProvider.get();
    }

    public MessagingConfiguration messagingConfiguration() {
        return this.messagingConfiguration;
    }

    public MessagingViewModel messagingViewModel() {
        return this.messagingViewModelProvider.get();
    }

    public Picasso picasso() {
        return this.picassoProvider.get();
    }

    public Resources resources() {
        return this.resourcesProvider.get();
    }

    private DaggerMessagingComponent(Context context, List<Engine> list, MessagingConfiguration messagingConfiguration2) {
        this.messagingComponent = this;
        this.messagingConfiguration = messagingConfiguration2;
        initialize(context, list, messagingConfiguration2);
    }
}
