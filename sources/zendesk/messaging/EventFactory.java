package zendesk.messaging;

import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import zendesk.messaging.Engine;
import zendesk.messaging.Event;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.components.DateProvider;

public class EventFactory {
    private final DateProvider dateProvider;

    public EventFactory(DateProvider dateProvider2) {
        this.dateProvider = dateProvider2;
    }

    public Event actionOptionClick(MessagingItem.Action action) {
        return new Event.ActionOptionClicked(action, this.dateProvider.now());
    }

    public Event articleSuggestionClick(MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion) {
        return new Event.ArticleSuggestionClicked(articleSuggestion, this.dateProvider.now());
    }

    public Event copyQueryClick(MessagingItem.Query query) {
        return new Event.CopyQueryClick(query, this.dateProvider.now());
    }

    public Event deleteQueryClick(MessagingItem.Query query) {
        return new Event.MessageDeleted(query, this.dateProvider.now());
    }

    public Event formOptionClick(MessagingItem.OptionsResponse optionsResponse, MessagingItem.Option option) {
        return new Event.ResponseOptionClicked(optionsResponse, option, this.dateProvider.now());
    }

    public Event menuItemClicked(int i) {
        return new Event.MenuItemClicked(this.dateProvider.now(), i);
    }

    public Event onActivityResult(int i, int i2, Intent intent) {
        return new Event.ActivityResult(i, i2, intent, this.dateProvider.now());
    }

    public Event reconnectButtonClick() {
        return new Event.ReconnectButtonClicked(this.dateProvider.now());
    }

    public Event retryQueryClick(MessagingItem.Query query) {
        return new Event.MessageResent(query, this.dateProvider.now());
    }

    public Event retrySendAttachmentClick(MessagingItem.FileQuery fileQuery) {
        return new Event.RetrySendAttachmentClick(fileQuery, this.dateProvider.now());
    }

    public Event sendAttachment(List<File> list) {
        return new Event.FileSelected(new ArrayList(list), this.dateProvider.now());
    }

    public Event textInput(String str) {
        return new Event.MessageSubmitted(str, this.dateProvider.now());
    }

    public Event transferOptionClick(Engine.TransferOptionDescription transferOptionDescription) {
        return new Event.EngineSelection(transferOptionDescription, this.dateProvider.now());
    }

    public Event typingStart() {
        return new Event.TypingStarted(this.dateProvider.now());
    }

    public Event typingStop() {
        return new Event.TypingStopped(this.dateProvider.now());
    }
}
