package zendesk.support.request;

import zendesk.support.request.AttachmentDownloaderComponent;
import zendesk.support.suas.Dispatcher;

public final class RequestModule_ProvidesAttachmentDownloaderComponentFactory implements ry1<AttachmentDownloaderComponent> {
    private final ky4<ActionFactory> actionFactoryProvider;
    private final ky4<AttachmentDownloaderComponent.AttachmentDownloader> attachmentDownloaderProvider;
    private final ky4<Dispatcher> dispatcherProvider;

    public RequestModule_ProvidesAttachmentDownloaderComponentFactory(ky4<Dispatcher> ky4, ky4<ActionFactory> ky42, ky4<AttachmentDownloaderComponent.AttachmentDownloader> ky43) {
        this.dispatcherProvider = ky4;
        this.actionFactoryProvider = ky42;
        this.attachmentDownloaderProvider = ky43;
    }

    public static RequestModule_ProvidesAttachmentDownloaderComponentFactory create(ky4<Dispatcher> ky4, ky4<ActionFactory> ky42, ky4<AttachmentDownloaderComponent.AttachmentDownloader> ky43) {
        return new RequestModule_ProvidesAttachmentDownloaderComponentFactory(ky4, ky42, ky43);
    }

    public static AttachmentDownloaderComponent providesAttachmentDownloaderComponent(Dispatcher dispatcher, Object obj, Object obj2) {
        return (AttachmentDownloaderComponent) fu4.m44415f(RequestModule.providesAttachmentDownloaderComponent(dispatcher, (ActionFactory) obj, (AttachmentDownloaderComponent.AttachmentDownloader) obj2));
    }

    public AttachmentDownloaderComponent get() {
        return providesAttachmentDownloaderComponent(this.dispatcherProvider.get(), this.actionFactoryProvider.get(), this.attachmentDownloaderProvider.get());
    }
}
