package zendesk.messaging;

import android.content.Context;

class MessagingEventSerializer {
    private static final int ARTICLE_OPENED_FORMATTER = R$string.zui_message_log_article_opened_formatter;
    private static final int ARTICLE_SUGGESTIONS_MESSAGE = R$string.zui_message_log_article_suggestion_message;
    private static final int DEFAULT_VISITOR_NAME = R$string.zui_message_log_default_visitor_name;
    private static final int MESSAGE_FAILED_TO_SEND_WARNING = R$string.zui_message_log_message_failed_to_send;
    private static final int TRANSFER_OPTION_SELECTION_FORMATTER = R$string.zui_message_log_transfer_option_selection_formatter;
    private final Context context;
    private final TimestampFactory timestampFactory;

    public MessagingEventSerializer(Context context2, TimestampFactory timestampFactory2) {
        this.context = context2;
        this.timestampFactory = timestampFactory2;
    }
}
