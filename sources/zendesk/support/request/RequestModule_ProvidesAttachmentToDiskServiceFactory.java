package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;

public final class RequestModule_ProvidesAttachmentToDiskServiceFactory implements ry1<AttachmentDownloadService> {
    private final ky4<ExecutorService> executorProvider;
    private final ky4<OkHttpClient> okHttpClientProvider;

    public RequestModule_ProvidesAttachmentToDiskServiceFactory(ky4<OkHttpClient> ky4, ky4<ExecutorService> ky42) {
        this.okHttpClientProvider = ky4;
        this.executorProvider = ky42;
    }

    public static RequestModule_ProvidesAttachmentToDiskServiceFactory create(ky4<OkHttpClient> ky4, ky4<ExecutorService> ky42) {
        return new RequestModule_ProvidesAttachmentToDiskServiceFactory(ky4, ky42);
    }

    public static AttachmentDownloadService providesAttachmentToDiskService(OkHttpClient okHttpClient, ExecutorService executorService) {
        return (AttachmentDownloadService) fu4.m44415f(RequestModule.providesAttachmentToDiskService(okHttpClient, executorService));
    }

    public AttachmentDownloadService get() {
        return providesAttachmentToDiskService(this.okHttpClientProvider.get(), this.executorProvider.get());
    }
}
