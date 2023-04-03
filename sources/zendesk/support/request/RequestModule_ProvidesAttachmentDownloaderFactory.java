package zendesk.support.request;

import zendesk.belvedere.C9800a;
import zendesk.support.request.AttachmentDownloaderComponent;

public final class RequestModule_ProvidesAttachmentDownloaderFactory implements ry1<AttachmentDownloaderComponent.AttachmentDownloader> {
    private final ky4<AttachmentDownloadService> attachmentToDiskServiceProvider;
    private final ky4<C9800a> belvedereProvider;

    public RequestModule_ProvidesAttachmentDownloaderFactory(ky4<C9800a> ky4, ky4<AttachmentDownloadService> ky42) {
        this.belvedereProvider = ky4;
        this.attachmentToDiskServiceProvider = ky42;
    }

    public static RequestModule_ProvidesAttachmentDownloaderFactory create(ky4<C9800a> ky4, ky4<AttachmentDownloadService> ky42) {
        return new RequestModule_ProvidesAttachmentDownloaderFactory(ky4, ky42);
    }

    public static AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader(C9800a aVar, Object obj) {
        return (AttachmentDownloaderComponent.AttachmentDownloader) fu4.m44415f(RequestModule.providesAttachmentDownloader(aVar, (AttachmentDownloadService) obj));
    }

    public AttachmentDownloaderComponent.AttachmentDownloader get() {
        return providesAttachmentDownloader(this.belvedereProvider.get(), this.attachmentToDiskServiceProvider.get());
    }
}
