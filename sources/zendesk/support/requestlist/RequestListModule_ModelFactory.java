package zendesk.support.requestlist;

import zendesk.core.MemoryCache;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class RequestListModule_ModelFactory implements ry1<RequestListModel> {
    private final ky4<SupportBlipsProvider> blipsProvider;
    private final ky4<MemoryCache> memoryCacheProvider;
    private final RequestListModule module;
    private final ky4<RequestInfoDataSource.Repository> requestInfoDataSourceProvider;
    private final ky4<SupportSettingsProvider> settingsProvider;

    public RequestListModule_ModelFactory(RequestListModule requestListModule, ky4<RequestInfoDataSource.Repository> ky4, ky4<MemoryCache> ky42, ky4<SupportBlipsProvider> ky43, ky4<SupportSettingsProvider> ky44) {
        this.module = requestListModule;
        this.requestInfoDataSourceProvider = ky4;
        this.memoryCacheProvider = ky42;
        this.blipsProvider = ky43;
        this.settingsProvider = ky44;
    }

    public static RequestListModule_ModelFactory create(RequestListModule requestListModule, ky4<RequestInfoDataSource.Repository> ky4, ky4<MemoryCache> ky42, ky4<SupportBlipsProvider> ky43, ky4<SupportSettingsProvider> ky44) {
        return new RequestListModule_ModelFactory(requestListModule, ky4, ky42, ky43, ky44);
    }

    public static RequestListModel model(RequestListModule requestListModule, RequestInfoDataSource.Repository repository, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        return (RequestListModel) fu4.m44415f(requestListModule.model(repository, memoryCache, supportBlipsProvider, supportSettingsProvider));
    }

    public RequestListModel get() {
        return model(this.module, this.requestInfoDataSourceProvider.get(), this.memoryCacheProvider.get(), this.blipsProvider.get(), this.settingsProvider.get());
    }
}
