package zendesk.support.request;

public final class RequestModule_ProvidesComponentListenerFactory implements ry1<HeadlessComponentListener> {
    private final ky4<AttachmentDownloaderComponent> attachmentDownloaderProvider;
    private final ky4<ComponentPersistence> persistenceProvider;
    private final ky4<ComponentUpdateActionHandlers> updatesComponentProvider;

    public RequestModule_ProvidesComponentListenerFactory(ky4<ComponentPersistence> ky4, ky4<AttachmentDownloaderComponent> ky42, ky4<ComponentUpdateActionHandlers> ky43) {
        this.persistenceProvider = ky4;
        this.attachmentDownloaderProvider = ky42;
        this.updatesComponentProvider = ky43;
    }

    public static RequestModule_ProvidesComponentListenerFactory create(ky4<ComponentPersistence> ky4, ky4<AttachmentDownloaderComponent> ky42, ky4<ComponentUpdateActionHandlers> ky43) {
        return new RequestModule_ProvidesComponentListenerFactory(ky4, ky42, ky43);
    }

    public static HeadlessComponentListener providesComponentListener(Object obj, Object obj2, Object obj3) {
        return (HeadlessComponentListener) fu4.m44415f(RequestModule.providesComponentListener((ComponentPersistence) obj, (AttachmentDownloaderComponent) obj2, (ComponentUpdateActionHandlers) obj3));
    }

    public HeadlessComponentListener get() {
        return providesComponentListener(this.persistenceProvider.get(), this.attachmentDownloaderProvider.get(), this.updatesComponentProvider.get());
    }
}
