package zendesk.messaging;

import android.content.res.Resources;
import java.util.List;

public final class MessagingModel_Factory implements ry1<MessagingModel> {
    private final ky4<MessagingConversationLog> conversationLogProvider;
    private final ky4<List<Engine>> enginesProvider;
    private final ky4<MessagingConfiguration> messagingConfigurationProvider;
    private final ky4<Resources> resourcesProvider;

    public MessagingModel_Factory(ky4<Resources> ky4, ky4<List<Engine>> ky42, ky4<MessagingConfiguration> ky43, ky4<MessagingConversationLog> ky44) {
        this.resourcesProvider = ky4;
        this.enginesProvider = ky42;
        this.messagingConfigurationProvider = ky43;
        this.conversationLogProvider = ky44;
    }

    public static MessagingModel_Factory create(ky4<Resources> ky4, ky4<List<Engine>> ky42, ky4<MessagingConfiguration> ky43, ky4<MessagingConversationLog> ky44) {
        return new MessagingModel_Factory(ky4, ky42, ky43, ky44);
    }

    public static MessagingModel newInstance(Resources resources, List<Engine> list, MessagingConfiguration messagingConfiguration, Object obj) {
        return new MessagingModel(resources, list, messagingConfiguration, (MessagingConversationLog) obj);
    }

    public MessagingModel get() {
        return newInstance(this.resourcesProvider.get(), this.enginesProvider.get(), this.messagingConfigurationProvider.get(), this.conversationLogProvider.get());
    }
}
