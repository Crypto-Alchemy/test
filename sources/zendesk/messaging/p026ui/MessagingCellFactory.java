package zendesk.messaging.p026ui;

import android.content.Context;
import android.view.View;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import zendesk.messaging.AgentDetails;
import zendesk.messaging.Attachment;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.Engine;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$layout;
import zendesk.messaging.components.DateProvider;
import zendesk.messaging.p026ui.ActionOptionsView;
import zendesk.messaging.p026ui.AgentFileCellView;
import zendesk.messaging.p026ui.AgentImageCellView;
import zendesk.messaging.p026ui.AgentMessageView;
import zendesk.messaging.p026ui.ArticlesResponseView;
import zendesk.messaging.p026ui.MessagingState;
import zendesk.messaging.p026ui.SystemMessageView;
import zendesk.messaging.p026ui.TypingIndicatorView;

/* renamed from: zendesk.messaging.ui.MessagingCellFactory */
public class MessagingCellFactory {
    private static final AgentDetails DEFAULT_TYPING_INDICATOR_LABEL_STATE = new AgentDetails("", "", false);
    public static final String TYPING_INDICATOR_ID = UUID.randomUUID().toString();
    private final AvatarStateFactory avatarStateFactory;
    private final AvatarStateRenderer avatarStateRenderer;
    private final MessagingCellPropsFactory cellPropsFactory;
    private final DateProvider dateProvider;
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final boolean multilineResponseOptionsEnabled;

    /* renamed from: zendesk.messaging.ui.MessagingCellFactory$MessageActionAdapter */
    public static class MessageActionAdapter implements MessageActionListener {
        private final EventFactory eventFactory;
        private final EventListener eventListener;
        private final MessagingItem.Query messagingItem;

        public MessageActionAdapter(EventListener eventListener2, MessagingItem.Query query, EventFactory eventFactory2) {
            this.eventListener = eventListener2;
            this.messagingItem = query;
            this.eventFactory = eventFactory2;
        }

        public void copy(String str) {
            this.eventListener.onEvent(this.eventFactory.copyQueryClick(this.messagingItem));
        }

        public void delete(String str) {
            this.eventListener.onEvent(this.eventFactory.deleteQueryClick(this.messagingItem));
        }

        public void retry(String str) {
            MessagingItem.Query query = this.messagingItem;
            if (query instanceof MessagingItem.FileQuery) {
                this.eventListener.onEvent(this.eventFactory.retrySendAttachmentClick((MessagingItem.FileQuery) query));
            } else {
                this.eventListener.onEvent(this.eventFactory.retryQueryClick(query));
            }
        }
    }

    /* renamed from: zendesk.messaging.ui.MessagingCellFactory$TypingItem */
    public static class TypingItem extends MessagingItem.Response {
        private TypingItem(Date date, String str, AgentDetails agentDetails) {
            super(date, str, agentDetails);
        }
    }

    public MessagingCellFactory(MessagingCellPropsFactory messagingCellPropsFactory, DateProvider dateProvider2, EventListener eventListener2, EventFactory eventFactory2, AvatarStateRenderer avatarStateRenderer2, AvatarStateFactory avatarStateFactory2, boolean z) {
        this.cellPropsFactory = messagingCellPropsFactory;
        this.dateProvider = dateProvider2;
        this.eventListener = eventListener2;
        this.eventFactory = eventFactory2;
        this.avatarStateRenderer = avatarStateRenderer2;
        this.avatarStateFactory = avatarStateFactory2;
        this.multilineResponseOptionsEnabled = z;
    }

    private static MessagingCell<ActionOptionsView.State, ActionOptionsView> createActionOptionsCell(MessagingItem.TransferResponse transferResponse, MessagingCellProps messagingCellProps, final EventListener eventListener2, final EventFactory eventFactory2, AvatarStateFactory avatarStateFactory2, AvatarStateRenderer avatarStateRenderer2) {
        ArrayList arrayList = new ArrayList();
        for (final Engine.TransferOptionDescription next : transferResponse.getEngineOptions()) {
            arrayList.add(new ActionOptionsView.ActionOptionState(next.getDisplayName(), new View.OnClickListener() {
                public void onClick(View view) {
                    EventListener.this.onEvent(eventFactory2.transferOptionClick(next));
                }
            }));
        }
        return new MessagingCell<>(transferResponse.getId(), new ActionOptionsView.State(transferResponse.getMessage(), transferResponse.getAgentDetails().getAgentName(), transferResponse.getAgentDetails().isBot(), messagingCellProps, arrayList, transferResponse.isEnabled(), avatarStateFactory2.createAvatarState(transferResponse.getAgentDetails()), avatarStateRenderer2), R$layout.zui_cell_action_options, ActionOptionsView.class);
    }

    private static MessagingCell<AgentFileCellView.State, AgentFileCellView> createAgentFileCell(MessagingItem.FileResponse fileResponse, MessagingCellProps messagingCellProps, AvatarStateFactory avatarStateFactory2, AvatarStateRenderer avatarStateRenderer2) {
        fileResponse.getAttachment();
        return new MessagingCell<>(fileResponse.getId(), new AgentFileCellView.State((Attachment) null, messagingCellProps, fileResponse.getAgentDetails().getAgentName(), fileResponse.getAgentDetails().isBot(), avatarStateFactory2.createAvatarState(fileResponse.getAgentDetails()), avatarStateRenderer2), R$layout.zui_cell_agent_file_view, AgentFileCellView.class);
    }

    private static MessagingCell<AgentImageCellView.State, AgentImageCellView> createAgentImageCell(MessagingItem.ImageResponse imageResponse, MessagingCellProps messagingCellProps, Picasso picasso, AvatarStateFactory avatarStateFactory2, AvatarStateRenderer avatarStateRenderer2) {
        imageResponse.getAttachment();
        return new MessagingCell<>(imageResponse.getId(), new AgentImageCellView.State(picasso, messagingCellProps, (Attachment) null, imageResponse.getAgentDetails().getAgentName(), imageResponse.getAgentDetails().isBot(), avatarStateFactory2.createAvatarState(imageResponse.getAgentDetails()), avatarStateRenderer2), R$layout.zui_cell_agent_image_view, AgentImageCellView.class);
    }

    private static ArticlesResponseView.ArticleSuggestionViewState createArticleSuggestionViewState(final MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion, final EventListener eventListener2, final EventFactory eventFactory2) {
        return new ArticlesResponseView.ArticleSuggestionViewState(articleSuggestion.getTitle(), articleSuggestion.getSnippet(), new OnArticleSuggestionSelectionListener() {
            public void onArticleSuggestionSelected(Context context) {
                EventListener.this.onEvent(eventFactory2.articleSuggestionClick(articleSuggestion));
            }
        });
    }

    private static List<ArticlesResponseView.ArticleSuggestionViewState> createArticleSuggestionViewStates(List<MessagingItem.ArticlesResponse.ArticleSuggestion> list, EventListener eventListener2, EventFactory eventFactory2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (MessagingItem.ArticlesResponse.ArticleSuggestion createArticleSuggestionViewState : list) {
            arrayList.add(createArticleSuggestionViewState(createArticleSuggestionViewState, eventListener2, eventFactory2));
        }
        return arrayList;
    }

    private static MessagingCell<ArticlesResponseView.State, ArticlesResponseView> createArticlesResponseCell(MessagingItem.ArticlesResponse articlesResponse, MessagingCellProps messagingCellProps, EventListener eventListener2, EventFactory eventFactory2, AvatarStateFactory avatarStateFactory2, AvatarStateRenderer avatarStateRenderer2) {
        return new MessagingCell<>(articlesResponse.getId(), new ArticlesResponseView.State(articlesResponse.getAgentDetails().getAgentName(), articlesResponse.getAgentDetails().isBot(), messagingCellProps, createArticleSuggestionViewStates(articlesResponse.getArticleSuggestions(), eventListener2, eventFactory2), avatarStateFactory2.createAvatarState(articlesResponse.getAgentDetails()), avatarStateRenderer2), R$layout.zui_cell_articles_response, ArticlesResponseView.class);
    }

    private static MessagingCell createCell(MessagingItem messagingItem, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, AvatarStateRenderer avatarStateRenderer2, AvatarStateFactory avatarStateFactory2, EventListener eventListener2, EventFactory eventFactory2, boolean z) {
        if (messagingItem instanceof MessagingItem.Query) {
            return createQueryCell(messagingItem, messagingCellProps, picasso, attachmentSettings, eventListener2, eventFactory2);
        }
        if (messagingItem instanceof MessagingItem.Response) {
            return createResponseCell((MessagingItem.Response) messagingItem, messagingCellProps, picasso, eventListener2, eventFactory2, avatarStateRenderer2, avatarStateFactory2);
        }
        if (messagingItem instanceof MessagingItem.OptionsResponse) {
            return createResponseOptionsCell((MessagingItem.OptionsResponse) messagingItem, messagingCellProps, eventListener2, eventFactory2, z);
        }
        if (messagingItem instanceof MessagingItem.SystemMessage) {
            return createSystemMessageCell((MessagingItem.SystemMessage) messagingItem, messagingCellProps);
        }
        return null;
    }

    private static MessagingCell<EndUserCellFileState, EndUserFileCellView> createFileQueryCell(MessagingItem.FileQuery fileQuery, MessagingCellProps messagingCellProps, AttachmentSettings attachmentSettings, EventListener eventListener2, EventFactory eventFactory2) {
        String id = fileQuery.getId();
        MessagingItem.Query.Status status = fileQuery.getStatus();
        MessageActionAdapter messageActionAdapter = new MessageActionAdapter(eventListener2, fileQuery, eventFactory2);
        fileQuery.getAttachment();
        return new MessagingCell<>(fileQuery.getId(), new EndUserCellFileState(id, messagingCellProps, status, messageActionAdapter, (Attachment) null, fileQuery.getFailureReason(), attachmentSettings), R$layout.zui_cell_end_user_file_view, EndUserFileCellView.class);
    }

    private static MessagingCell<EndUserCellImageState, EndUserImageCellView> createImageQueryCell(MessagingItem.ImageQuery imageQuery, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, EventListener eventListener2, EventFactory eventFactory2) {
        String id = imageQuery.getId();
        MessagingItem.Query.Status status = imageQuery.getStatus();
        MessageActionAdapter messageActionAdapter = new MessageActionAdapter(eventListener2, imageQuery, eventFactory2);
        imageQuery.getAttachment();
        return new MessagingCell<>(imageQuery.getId(), new EndUserCellImageState(id, messagingCellProps, status, messageActionAdapter, (Attachment) null, imageQuery.getFailureReason(), attachmentSettings, picasso), R$layout.zui_cell_end_user_image_view, EndUserImageCellView.class);
    }

    private static MessagingCell<EndUserCellImageState, EndUserImageCellView> createImageQueryCellForFile(MessagingItem.ImageQuery imageQuery, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, EventListener eventListener2, EventFactory eventFactory2) {
        return createImageQueryCell(imageQuery, messagingCellProps, picasso, attachmentSettings, eventListener2, eventFactory2);
    }

    private static MessagingCell createQueryCell(MessagingItem messagingItem, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, EventListener eventListener2, EventFactory eventFactory2) {
        if (messagingItem instanceof MessagingItem.TextQuery) {
            return createTextQueryCell((MessagingItem.TextQuery) messagingItem, messagingCellProps, eventListener2, eventFactory2);
        }
        if (messagingItem instanceof MessagingItem.ImageQuery) {
            return createImageQueryCellForFile((MessagingItem.ImageQuery) messagingItem, messagingCellProps, picasso, attachmentSettings, eventListener2, eventFactory2);
        }
        if (messagingItem instanceof MessagingItem.FileQuery) {
            return createFileQueryCell((MessagingItem.FileQuery) messagingItem, messagingCellProps, attachmentSettings, eventListener2, eventFactory2);
        }
        return null;
    }

    private static MessagingCell createResponseCell(MessagingItem.Response response, MessagingCellProps messagingCellProps, Picasso picasso, EventListener eventListener2, EventFactory eventFactory2, AvatarStateRenderer avatarStateRenderer2, AvatarStateFactory avatarStateFactory2) {
        if (response instanceof MessagingItem.ArticlesResponse) {
            return createArticlesResponseCell((MessagingItem.ArticlesResponse) response, messagingCellProps, eventListener2, eventFactory2, avatarStateFactory2, avatarStateRenderer2);
        }
        if (response instanceof MessagingItem.TransferResponse) {
            return createActionOptionsCell((MessagingItem.TransferResponse) response, messagingCellProps, eventListener2, eventFactory2, avatarStateFactory2, avatarStateRenderer2);
        }
        if (response instanceof MessagingItem.ActionResponse) {
            return createActionOptionsCell((MessagingItem.ActionResponse) response, messagingCellProps, eventListener2, eventFactory2, avatarStateFactory2, avatarStateRenderer2);
        }
        if (response instanceof MessagingItem.ImageResponse) {
            return createAgentImageCell((MessagingItem.ImageResponse) response, messagingCellProps, picasso, avatarStateFactory2, avatarStateRenderer2);
        }
        if (response instanceof MessagingItem.FileResponse) {
            return createAgentFileCell((MessagingItem.FileResponse) response, messagingCellProps, avatarStateFactory2, avatarStateRenderer2);
        }
        if (response instanceof TypingItem) {
            return createTypingIndicatorCell((TypingItem) response, messagingCellProps, avatarStateRenderer2, avatarStateFactory2);
        }
        if (response instanceof MessagingItem.TextResponse) {
            return createTextResponseCell((MessagingItem.TextResponse) response, messagingCellProps, avatarStateRenderer2, avatarStateFactory2);
        }
        return null;
    }

    private static MessagingCell<ResponseOptionsViewState, ?> createResponseOptionsCell(final MessagingItem.OptionsResponse optionsResponse, MessagingCellProps messagingCellProps, final EventListener eventListener2, final EventFactory eventFactory2, boolean z) {
        ResponseOptionsViewState responseOptionsViewState = new ResponseOptionsViewState(optionsResponse.getOptions(), new ResponseOptionHandler() {
            public void onResponseOptionSelected(MessagingItem.Option option) {
                EventListener.this.onEvent(eventFactory2.formOptionClick(optionsResponse, option));
            }
        }, messagingCellProps);
        if (z) {
            return new MessagingCell<>(optionsResponse.getId(), responseOptionsViewState, R$layout.zui_cell_response_options_stacked, StackedResponseOptionsView.class);
        }
        return new MessagingCell<>(optionsResponse.getId(), responseOptionsViewState, R$layout.zui_cell_response_options, ResponseOptionsView.class);
    }

    private static MessagingCell<SystemMessageView.State, SystemMessageView> createSystemMessageCell(MessagingItem.SystemMessage systemMessage, MessagingCellProps messagingCellProps) {
        return new MessagingCell<>(systemMessage.getId(), new SystemMessageView.State(messagingCellProps, systemMessage.getSystemMessage()), R$layout.zui_cell_system_message, SystemMessageView.class);
    }

    private static MessagingCell<EndUserCellMessageState, EndUserMessageView> createTextQueryCell(MessagingItem.TextQuery textQuery, MessagingCellProps messagingCellProps, EventListener eventListener2, EventFactory eventFactory2) {
        return new MessagingCell<>(textQuery.getId(), new EndUserCellMessageState(textQuery.getId(), messagingCellProps, textQuery.getStatus(), new MessageActionAdapter(eventListener2, textQuery, eventFactory2), textQuery.getMessage()), R$layout.zui_cell_end_user_message, EndUserMessageView.class);
    }

    private static MessagingCell<AgentMessageView.State, AgentMessageView> createTextResponseCell(MessagingItem.TextResponse textResponse, MessagingCellProps messagingCellProps, AvatarStateRenderer avatarStateRenderer2, AvatarStateFactory avatarStateFactory2) {
        return new MessagingCell<>(textResponse.getId(), new AgentMessageView.State(messagingCellProps, textResponse.getMessage(), textResponse.getAgentDetails().getAgentName(), textResponse.getAgentDetails().isBot(), avatarStateFactory2.createAvatarState(textResponse.getAgentDetails()), avatarStateRenderer2), R$layout.zui_cell_agent_message_view, AgentMessageView.class);
    }

    private static MessagingCell<TypingIndicatorView.State, TypingIndicatorView> createTypingIndicatorCell(TypingItem typingItem, MessagingCellProps messagingCellProps, AvatarStateRenderer avatarStateRenderer2, AvatarStateFactory avatarStateFactory2) {
        return new MessagingCell<>(TYPING_INDICATOR_ID, new TypingIndicatorView.State(messagingCellProps, typingItem.getAgentDetails().getAgentName(), typingItem.getAgentDetails().isBot(), avatarStateFactory2.createAvatarState(typingItem.getAgentDetails()), avatarStateRenderer2), R$layout.zui_cell_typing_indicator, TypingIndicatorView.class);
    }

    public List<MessagingCell> createCells(List<MessagingItem> list, MessagingState.TypingState typingState, Picasso picasso, AttachmentSettings attachmentSettings) {
        AgentDetails agentDetails;
        if (list == null) {
            return Collections.emptyList();
        }
        List<TypeT> c = kj0.m47112c(list);
        if (typingState != null && typingState.isTyping()) {
            if (typingState.getAgentDetails() != null) {
                agentDetails = typingState.getAgentDetails();
            } else {
                agentDetails = DEFAULT_TYPING_INDICATOR_LABEL_STATE;
            }
            c.add(new TypingItem(this.dateProvider.now(), TYPING_INDICATOR_ID, agentDetails));
        }
        List<MessagingCellProps> create = this.cellPropsFactory.create(c);
        ArrayList arrayList = new ArrayList(c.size());
        for (int i = 0; i < c.size(); i++) {
            MessagingCell createCell = createCell((MessagingItem) c.get(i), create.get(i), picasso, attachmentSettings, this.avatarStateRenderer, this.avatarStateFactory, this.eventListener, this.eventFactory, this.multilineResponseOptionsEnabled);
            if (createCell != null) {
                arrayList.add(createCell);
            }
        }
        return arrayList;
    }

    private static MessagingCell<ActionOptionsView.State, ActionOptionsView> createActionOptionsCell(MessagingItem.ActionResponse actionResponse, MessagingCellProps messagingCellProps, final EventListener eventListener2, final EventFactory eventFactory2, AvatarStateFactory avatarStateFactory2, AvatarStateRenderer avatarStateRenderer2) {
        ArrayList arrayList = new ArrayList();
        for (final MessagingItem.Action next : actionResponse.getActions()) {
            arrayList.add(new ActionOptionsView.ActionOptionState(next.getDisplayName(), new View.OnClickListener() {
                public void onClick(View view) {
                    EventListener.this.onEvent(eventFactory2.actionOptionClick(next));
                }
            }));
        }
        return new MessagingCell<>(actionResponse.getId(), new ActionOptionsView.State(actionResponse.getMessage(), actionResponse.getAgentDetails().getAgentName(), actionResponse.getAgentDetails().isBot(), messagingCellProps, arrayList, true, avatarStateFactory2.createAvatarState(actionResponse.getAgentDetails()), avatarStateRenderer2), R$layout.zui_cell_action_options, ActionOptionsView.class);
    }
}
