package zendesk.messaging.p026ui;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$dimen;

/* renamed from: zendesk.messaging.ui.MessagingCellPropsFactory */
public class MessagingCellPropsFactory {
    private final int defaultSpacing;
    private final int groupSpacing;

    /* renamed from: zendesk.messaging.ui.MessagingCellPropsFactory$InteractionType */
    public enum InteractionType {
        QUERY,
        RESPONSE,
        NONE
    }

    public MessagingCellPropsFactory(Resources resources) {
        this.defaultSpacing = resources.getDimensionPixelSize(R$dimen.zui_cell_vertical_spacing_default);
        this.groupSpacing = resources.getDimensionPixelSize(R$dimen.zui_cell_vertical_spacing_group);
    }

    private static InteractionType classifyInteraction(MessagingItem messagingItem) {
        if (messagingItem instanceof MessagingItem.Response) {
            return InteractionType.RESPONSE;
        }
        if ((messagingItem instanceof MessagingItem.Query) || (messagingItem instanceof MessagingItem.OptionsResponse)) {
            return InteractionType.QUERY;
        }
        return InteractionType.NONE;
    }

    private MessagingCellProps generateCellProps(MessagingItem messagingItem, MessagingItem messagingItem2, MessagingItem messagingItem3) {
        return new MessagingCellProps(labelVisibility(messagingItem2, messagingItem), cellSpacing(messagingItem2, messagingItem3), avatarVisibility(messagingItem2, messagingItem3));
    }

    public int avatarVisibility(MessagingItem messagingItem, MessagingItem messagingItem2) {
        InteractionType classifyInteraction = classifyInteraction(messagingItem);
        if (classifyInteraction == InteractionType.QUERY) {
            return 4;
        }
        if (messagingItem2 == null || classifyInteraction != classifyInteraction(messagingItem2)) {
            return 0;
        }
        if (!(messagingItem instanceof MessagingItem.Response) || !(messagingItem2 instanceof MessagingItem.Response) || ((MessagingItem.Response) messagingItem).getAgentDetails().getAgentId().equals(((MessagingItem.Response) messagingItem2).getAgentDetails().getAgentId())) {
            return 4;
        }
        return 0;
    }

    public int cellSpacing(MessagingItem messagingItem, MessagingItem messagingItem2) {
        if (messagingItem2 == null) {
            return this.defaultSpacing;
        }
        if (messagingItem2 instanceof MessagingItem.SystemMessage) {
            return this.groupSpacing;
        }
        if (classifyInteraction(messagingItem) == classifyInteraction(messagingItem2)) {
            return this.groupSpacing;
        }
        return this.defaultSpacing;
    }

    public List<MessagingCellProps> create(List<MessagingItem> list) {
        MessagingItem messagingItem;
        if (kj0.m47116g(list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        while (i < list.size()) {
            MessagingItem messagingItem2 = null;
            if (i > 0) {
                messagingItem = list.get(i - 1);
            } else {
                messagingItem = null;
            }
            MessagingItem messagingItem3 = list.get(i);
            i++;
            if (i < list.size()) {
                messagingItem2 = list.get(i);
            }
            arrayList.add(generateCellProps(messagingItem, messagingItem3, messagingItem2));
        }
        return arrayList;
    }

    public int labelVisibility(MessagingItem messagingItem, MessagingItem messagingItem2) {
        InteractionType classifyInteraction = classifyInteraction(messagingItem);
        if (classifyInteraction == InteractionType.QUERY || messagingItem2 == null || classifyInteraction != classifyInteraction(messagingItem2)) {
            return 0;
        }
        if (!(messagingItem instanceof MessagingItem.Response) || !(messagingItem2 instanceof MessagingItem.Response) || ((MessagingItem.Response) messagingItem).getAgentDetails().getAgentId().equals(((MessagingItem.Response) messagingItem2).getAgentDetails().getAgentId())) {
            return 8;
        }
        return 0;
    }
}
