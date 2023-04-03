package zendesk.messaging;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MessagingConversationLog {
    private static final Comparator<MessagingEvent> TIMESTAMP_COMPARATOR = new Comparator<MessagingEvent>() {
        public int compare(MessagingEvent messagingEvent, MessagingEvent messagingEvent2) {
            return messagingEvent.getTimestamp().compareTo(messagingEvent2.getTimestamp());
        }
    };
    private final List<Event> events = new ArrayList();
    private final MessagingEventSerializer messagingEventSerializer;
    private final List<MessagingItem> messagingItems = new ArrayList();

    public MessagingConversationLog(MessagingEventSerializer messagingEventSerializer2) {
        this.messagingEventSerializer = messagingEventSerializer2;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void setMessagingItems(List<MessagingItem> list) {
        this.messagingItems.clear();
        if (kj0.m47118i(list)) {
            this.messagingItems.addAll(list);
        }
    }
}
