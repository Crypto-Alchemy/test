package zendesk.messaging;

import android.content.res.Resources;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;
import zendesk.belvedere.C9800a;
import zendesk.belvedere.C9802b;
import zendesk.messaging.MessagingActivityComponent;
import zendesk.messaging.components.DateProvider;
import zendesk.messaging.p026ui.AvatarStateFactory_Factory;
import zendesk.messaging.p026ui.AvatarStateRenderer_Factory;
import zendesk.messaging.p026ui.InputBoxAttachmentClickListener_Factory;
import zendesk.messaging.p026ui.InputBoxConsumer;
import zendesk.messaging.p026ui.InputBoxConsumer_Factory;
import zendesk.messaging.p026ui.MessagingCellFactory;
import zendesk.messaging.p026ui.MessagingCellFactory_Factory;
import zendesk.messaging.p026ui.MessagingCellPropsFactory;
import zendesk.messaging.p026ui.MessagingCellPropsFactory_Factory;
import zendesk.messaging.p026ui.MessagingComposer;
import zendesk.messaging.p026ui.MessagingComposer_Factory;

final class DaggerMessagingActivityComponent implements MessagingActivityComponent {
    private ky4<AppCompatActivity> activityProvider;
    private ky4 avatarStateRendererProvider;
    private ky4<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private ky4<BelvedereMediaResolverCallback> belvedereMediaResolverCallbackProvider;
    private ky4<C9800a> belvedereProvider;
    private ky4<C9802b> belvedereUiProvider;
    private ky4<DateProvider> dateProvider;
    private ky4<EventFactory> eventFactoryProvider;
    private ky4<Handler> handlerProvider;
    private ky4 inputBoxAttachmentClickListenerProvider;
    private ky4<InputBoxConsumer> inputBoxConsumerProvider;
    private final DaggerMessagingActivityComponent messagingActivityComponent;
    private ky4<MessagingCellFactory> messagingCellFactoryProvider;
    private ky4<MessagingCellPropsFactory> messagingCellPropsFactoryProvider;
    private final MessagingComponent messagingComponent;
    private ky4<MessagingComponent> messagingComponentProvider;
    private ky4<MessagingComposer> messagingComposerProvider;
    private ky4<MessagingDialog> messagingDialogProvider;
    private ky4<MessagingViewModel> messagingViewModelProvider;
    private ky4<Boolean> multilineResponseOptionsEnabledProvider;
    private ky4<Picasso> picassoProvider;
    private ky4<Resources> resourcesProvider;
    private ky4<TypingEventDispatcher> typingEventDispatcherProvider;

    public static final class Builder implements MessagingActivityComponent.Builder {
        private AppCompatActivity activity;
        private MessagingComponent messagingComponent;

        private Builder() {
        }

        public MessagingActivityComponent build() {
            fu4.m44410a(this.activity, AppCompatActivity.class);
            fu4.m44410a(this.messagingComponent, MessagingComponent.class);
            return new DaggerMessagingActivityComponent(this.messagingComponent, this.activity);
        }

        public Builder activity(AppCompatActivity appCompatActivity) {
            this.activity = (AppCompatActivity) fu4.m44411b(appCompatActivity);
            return this;
        }

        public Builder messagingComponent(MessagingComponent messagingComponent2) {
            this.messagingComponent = (MessagingComponent) fu4.m44411b(messagingComponent2);
            return this;
        }
    }

    public static final class zendesk_messaging_MessagingComponent_belvedere implements ky4<C9800a> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_belvedere(MessagingComponent messagingComponent2) {
            this.messagingComponent = messagingComponent2;
        }

        public C9800a get() {
            return (C9800a) fu4.m44414e(this.messagingComponent.belvedere());
        }
    }

    public static final class zendesk_messaging_MessagingComponent_belvedereMediaHolder implements ky4<BelvedereMediaHolder> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_belvedereMediaHolder(MessagingComponent messagingComponent2) {
            this.messagingComponent = messagingComponent2;
        }

        public BelvedereMediaHolder get() {
            return (BelvedereMediaHolder) fu4.m44414e(this.messagingComponent.belvedereMediaHolder());
        }
    }

    public static final class zendesk_messaging_MessagingComponent_messagingViewModel implements ky4<MessagingViewModel> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_messagingViewModel(MessagingComponent messagingComponent2) {
            this.messagingComponent = messagingComponent2;
        }

        public MessagingViewModel get() {
            return (MessagingViewModel) fu4.m44414e(this.messagingComponent.messagingViewModel());
        }
    }

    public static final class zendesk_messaging_MessagingComponent_picasso implements ky4<Picasso> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_picasso(MessagingComponent messagingComponent2) {
            this.messagingComponent = messagingComponent2;
        }

        public Picasso get() {
            return (Picasso) fu4.m44414e(this.messagingComponent.picasso());
        }
    }

    public static final class zendesk_messaging_MessagingComponent_resources implements ky4<Resources> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_resources(MessagingComponent messagingComponent2) {
            this.messagingComponent = messagingComponent2;
        }

        public Resources get() {
            return (Resources) fu4.m44414e(this.messagingComponent.resources());
        }
    }

    public static MessagingActivityComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(MessagingComponent messagingComponent2, AppCompatActivity appCompatActivity) {
        zendesk_messaging_MessagingComponent_resources zendesk_messaging_messagingcomponent_resources = new zendesk_messaging_MessagingComponent_resources(messagingComponent2);
        this.resourcesProvider = zendesk_messaging_messagingcomponent_resources;
        this.messagingCellPropsFactoryProvider = li1.m47821a(MessagingCellPropsFactory_Factory.create(zendesk_messaging_messagingcomponent_resources));
        this.dateProvider = li1.m47821a(MessagingActivityModule_DateProviderFactory.create());
        this.messagingViewModelProvider = new zendesk_messaging_MessagingComponent_messagingViewModel(messagingComponent2);
        this.eventFactoryProvider = li1.m47821a(EventFactory_Factory.create(this.dateProvider));
        zendesk_messaging_MessagingComponent_picasso zendesk_messaging_messagingcomponent_picasso = new zendesk_messaging_MessagingComponent_picasso(messagingComponent2);
        this.picassoProvider = zendesk_messaging_messagingcomponent_picasso;
        this.avatarStateRendererProvider = li1.m47821a(AvatarStateRenderer_Factory.create(zendesk_messaging_messagingcomponent_picasso));
        ry1 a = yv2.m54878a(messagingComponent2);
        this.messagingComponentProvider = a;
        this.multilineResponseOptionsEnabledProvider = li1.m47821a(MessagingActivityModule_MultilineResponseOptionsEnabledFactory.create(a));
        this.messagingCellFactoryProvider = li1.m47821a(MessagingCellFactory_Factory.create(this.messagingCellPropsFactoryProvider, this.dateProvider, this.messagingViewModelProvider, this.eventFactoryProvider, this.avatarStateRendererProvider, AvatarStateFactory_Factory.create(), this.multilineResponseOptionsEnabledProvider));
        ry1 a2 = yv2.m54878a(appCompatActivity);
        this.activityProvider = a2;
        this.belvedereUiProvider = li1.m47821a(MessagingActivityModule_BelvedereUiFactory.create(a2));
        this.belvedereMediaHolderProvider = new zendesk_messaging_MessagingComponent_belvedereMediaHolder(messagingComponent2);
        this.belvedereProvider = new zendesk_messaging_MessagingComponent_belvedere(messagingComponent2);
        ky4<BelvedereMediaResolverCallback> a3 = li1.m47821a(BelvedereMediaResolverCallback_Factory.create(this.messagingViewModelProvider, this.eventFactoryProvider));
        this.belvedereMediaResolverCallbackProvider = a3;
        this.inputBoxConsumerProvider = li1.m47821a(InputBoxConsumer_Factory.create(this.messagingViewModelProvider, this.eventFactoryProvider, this.belvedereUiProvider, this.belvedereProvider, this.belvedereMediaHolderProvider, a3));
        this.inputBoxAttachmentClickListenerProvider = InputBoxAttachmentClickListener_Factory.create(this.activityProvider, this.belvedereUiProvider, this.belvedereMediaHolderProvider);
        ky4<Handler> a4 = li1.m47821a(MessagingActivityModule_HandlerFactory.create());
        this.handlerProvider = a4;
        ky4<TypingEventDispatcher> a5 = li1.m47821a(TypingEventDispatcher_Factory.create(this.messagingViewModelProvider, a4, this.eventFactoryProvider));
        this.typingEventDispatcherProvider = a5;
        this.messagingComposerProvider = li1.m47821a(MessagingComposer_Factory.create(this.activityProvider, this.messagingViewModelProvider, this.belvedereUiProvider, this.belvedereMediaHolderProvider, this.inputBoxConsumerProvider, this.inputBoxAttachmentClickListenerProvider, a5));
        this.messagingDialogProvider = li1.m47821a(MessagingDialog_Factory.create(this.activityProvider, this.messagingViewModelProvider, this.dateProvider));
    }

    private MessagingActivity injectMessagingActivity(MessagingActivity messagingActivity) {
        MessagingActivity_MembersInjector.injectViewModel(messagingActivity, (MessagingViewModel) fu4.m44414e(this.messagingComponent.messagingViewModel()));
        MessagingActivity_MembersInjector.injectMessagingCellFactory(messagingActivity, this.messagingCellFactoryProvider.get());
        MessagingActivity_MembersInjector.injectPicasso(messagingActivity, (Picasso) fu4.m44414e(this.messagingComponent.picasso()));
        MessagingActivity_MembersInjector.injectEventFactory(messagingActivity, this.eventFactoryProvider.get());
        MessagingActivity_MembersInjector.injectMessagingComposer(messagingActivity, this.messagingComposerProvider.get());
        MessagingActivity_MembersInjector.injectMessagingDialog(messagingActivity, this.messagingDialogProvider.get());
        return messagingActivity;
    }

    public void inject(MessagingActivity messagingActivity) {
        injectMessagingActivity(messagingActivity);
    }

    private DaggerMessagingActivityComponent(MessagingComponent messagingComponent2, AppCompatActivity appCompatActivity) {
        this.messagingActivityComponent = this;
        this.messagingComponent = messagingComponent2;
        initialize(messagingComponent2, appCompatActivity);
    }
}
