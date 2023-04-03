package zendesk.messaging.p026ui;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.C9802b;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.MessagingViewModel;
import zendesk.messaging.TypingEventDispatcher;

/* renamed from: zendesk.messaging.ui.MessagingComposer_Factory */
public final class MessagingComposer_Factory implements ry1<MessagingComposer> {
    private final ky4<AppCompatActivity> appCompatActivityProvider;
    private final ky4<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private final ky4<C9802b> imageStreamProvider;
    private final ky4<InputBoxAttachmentClickListener> inputBoxAttachmentClickListenerProvider;
    private final ky4<InputBoxConsumer> inputBoxConsumerProvider;
    private final ky4<MessagingViewModel> messagingViewModelProvider;
    private final ky4<TypingEventDispatcher> typingEventDispatcherProvider;

    public MessagingComposer_Factory(ky4<AppCompatActivity> ky4, ky4<MessagingViewModel> ky42, ky4<C9802b> ky43, ky4<BelvedereMediaHolder> ky44, ky4<InputBoxConsumer> ky45, ky4<InputBoxAttachmentClickListener> ky46, ky4<TypingEventDispatcher> ky47) {
        this.appCompatActivityProvider = ky4;
        this.messagingViewModelProvider = ky42;
        this.imageStreamProvider = ky43;
        this.belvedereMediaHolderProvider = ky44;
        this.inputBoxConsumerProvider = ky45;
        this.inputBoxAttachmentClickListenerProvider = ky46;
        this.typingEventDispatcherProvider = ky47;
    }

    public static MessagingComposer_Factory create(ky4<AppCompatActivity> ky4, ky4<MessagingViewModel> ky42, ky4<C9802b> ky43, ky4<BelvedereMediaHolder> ky44, ky4<InputBoxConsumer> ky45, ky4<InputBoxAttachmentClickListener> ky46, ky4<TypingEventDispatcher> ky47) {
        return new MessagingComposer_Factory(ky4, ky42, ky43, ky44, ky45, ky46, ky47);
    }

    public static MessagingComposer newInstance(AppCompatActivity appCompatActivity, MessagingViewModel messagingViewModel, C9802b bVar, BelvedereMediaHolder belvedereMediaHolder, InputBoxConsumer inputBoxConsumer, Object obj, TypingEventDispatcher typingEventDispatcher) {
        return new MessagingComposer(appCompatActivity, messagingViewModel, bVar, belvedereMediaHolder, inputBoxConsumer, (InputBoxAttachmentClickListener) obj, typingEventDispatcher);
    }

    public MessagingComposer get() {
        return newInstance(this.appCompatActivityProvider.get(), this.messagingViewModelProvider.get(), this.imageStreamProvider.get(), this.belvedereMediaHolderProvider.get(), this.inputBoxConsumerProvider.get(), this.inputBoxAttachmentClickListenerProvider.get(), this.typingEventDispatcherProvider.get());
    }
}
