package zendesk.support;

import android.content.Context;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import zendesk.belvedere.C9800a;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetExecutorServiceFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestActivity_MembersInjector;
import zendesk.support.request.RequestComponent;
import zendesk.support.request.RequestModule;
import zendesk.support.request.RequestModule_ProvidesActionFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesAsyncMiddlewareFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderComponentFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentToDiskServiceFactory;
import zendesk.support.request.RequestModule_ProvidesBelvedereFactory;
import zendesk.support.request.RequestModule_ProvidesComponentListenerFactory;
import zendesk.support.request.RequestModule_ProvidesConUpdatesComponentFactory;
import zendesk.support.request.RequestModule_ProvidesDiskQueueFactory;
import zendesk.support.request.RequestModule_ProvidesDispatcherFactory;
import zendesk.support.request.RequestModule_ProvidesMessageFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesPersistenceComponentFactory;
import zendesk.support.request.RequestModule_ProvidesReducerFactory;
import zendesk.support.request.RequestModule_ProvidesStoreFactory;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.request.RequestViewConversationsDisabled_MembersInjector;
import zendesk.support.request.RequestViewConversationsEnabled;
import zendesk.support.request.RequestViewConversationsEnabled_MembersInjector;
import zendesk.support.requestlist.RequestInfoDataSource;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListActivity_MembersInjector;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListModule;
import zendesk.support.requestlist.RequestListModule_ModelFactory;
import zendesk.support.requestlist.RequestListModule_PresenterFactory;
import zendesk.support.requestlist.RequestListModule_RefreshHandlerFactory;
import zendesk.support.requestlist.RequestListModule_RepositoryFactory;
import zendesk.support.requestlist.RequestListViewModule;
import zendesk.support.requestlist.RequestListViewModule_ViewFactory;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Reducer;
import zendesk.support.suas.Store;

public final class DaggerSupportSdkComponent implements SupportSdkComponent {
    /* access modifiers changed from: private */
    public ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    /* access modifiers changed from: private */
    public ky4<ro0> configurationHelperProvider;
    /* access modifiers changed from: private */
    public final CoreModule coreModule;
    /* access modifiers changed from: private */
    public ky4<Context> getApplicationContextProvider;
    /* access modifiers changed from: private */
    public ky4<AuthenticationProvider> getAuthenticationProvider;
    /* access modifiers changed from: private */
    public ky4<ExecutorService> getExecutorServiceProvider;
    /* access modifiers changed from: private */
    public ky4<MemoryCache> getMemoryCacheProvider;
    private ky4<SessionStorage> getSessionStorageProvider;
    /* access modifiers changed from: private */
    public ky4<Executor> mainThreadExecutorProvider;
    private ky4<ig4> okHttp3DownloaderProvider;
    private ky4<List<ActionHandler>> providesActionHandlersProvider;
    /* access modifiers changed from: private */
    public ky4<SupportBlipsProvider> providesBlipsProvider;
    /* access modifiers changed from: private */
    public ky4<OkHttpClient> providesOkHttpClientProvider;
    /* access modifiers changed from: private */
    public ky4<Picasso> providesPicassoProvider;
    private ky4<Gson> providesProvider;
    private ky4<ch1> providesRequestDiskLruCacheProvider;
    /* access modifiers changed from: private */
    public ky4<RequestProvider> providesRequestProvider;
    /* access modifiers changed from: private */
    public ky4<SupportSettingsProvider> providesSettingsProvider;
    /* access modifiers changed from: private */
    public ky4<UploadProvider> providesUploadProvider;
    /* access modifiers changed from: private */
    public ky4<RequestInfoDataSource.LocalDataSource> requestInfoDataSourceProvider;
    private final DaggerSupportSdkComponent supportSdkComponent;
    /* access modifiers changed from: private */
    public ky4<SupportUiStorage> supportUiStorageProvider;

    public static final class Builder {
        private CoreModule coreModule;
        private SupportModule supportModule;
        private SupportSdkModule supportSdkModule;

        public SupportSdkComponent build() {
            fu4.m44410a(this.coreModule, CoreModule.class);
            fu4.m44410a(this.supportModule, SupportModule.class);
            if (this.supportSdkModule == null) {
                this.supportSdkModule = new SupportSdkModule();
            }
            return new DaggerSupportSdkComponent(this.coreModule, this.supportModule, this.supportSdkModule);
        }

        public Builder coreModule(CoreModule coreModule2) {
            this.coreModule = (CoreModule) fu4.m44411b(coreModule2);
            return this;
        }

        public Builder supportModule(SupportModule supportModule2) {
            this.supportModule = (SupportModule) fu4.m44411b(supportModule2);
            return this;
        }

        public Builder supportSdkModule(SupportSdkModule supportSdkModule2) {
            this.supportSdkModule = (SupportSdkModule) fu4.m44411b(supportSdkModule2);
            return this;
        }

        private Builder() {
        }
    }

    public static final class RequestComponentImpl implements RequestComponent {
        private ky4 providesActionFactoryProvider;
        private ky4 providesAsyncMiddlewareProvider;
        private ky4 providesAttachmentDownloaderComponentProvider;
        private ky4 providesAttachmentDownloaderProvider;
        private ky4 providesAttachmentToDiskServiceProvider;
        private ky4<C9800a> providesBelvedereProvider;
        private ky4 providesComponentListenerProvider;
        private ky4 providesConUpdatesComponentProvider;
        private ky4 providesDiskQueueProvider;
        private ky4<Dispatcher> providesDispatcherProvider;
        private ky4 providesMessageFactoryProvider;
        private ky4 providesPersistenceComponentProvider;
        private ky4<List<Reducer>> providesReducerProvider;
        private ky4<Store> providesStoreProvider;
        private final RequestComponentImpl requestComponentImpl;
        private final DaggerSupportSdkComponent supportSdkComponent;

        private void initialize(RequestModule requestModule) {
            this.providesReducerProvider = li1.m47821a(RequestModule_ProvidesReducerFactory.create());
            ky4 a = li1.m47821a(RequestModule_ProvidesAsyncMiddlewareFactory.create());
            this.providesAsyncMiddlewareProvider = a;
            this.providesStoreProvider = li1.m47821a(RequestModule_ProvidesStoreFactory.create(this.providesReducerProvider, a));
            this.providesBelvedereProvider = li1.m47821a(RequestModule_ProvidesBelvedereFactory.create(this.supportSdkComponent.getApplicationContextProvider));
            this.providesActionFactoryProvider = li1.m47821a(RequestModule_ProvidesActionFactoryFactory.create(this.supportSdkComponent.providesRequestProvider, this.supportSdkComponent.providesSettingsProvider, this.supportSdkComponent.providesUploadProvider, this.providesBelvedereProvider, this.supportSdkComponent.supportUiStorageProvider, this.supportSdkComponent.getExecutorServiceProvider, this.supportSdkComponent.mainThreadExecutorProvider, this.supportSdkComponent.getAuthenticationProvider, this.supportSdkComponent.providesBlipsProvider));
            this.providesDiskQueueProvider = li1.m47821a(RequestModule_ProvidesDiskQueueFactory.create(this.supportSdkComponent.getExecutorServiceProvider));
            this.providesPersistenceComponentProvider = li1.m47821a(RequestModule_ProvidesPersistenceComponentFactory.create(this.supportSdkComponent.supportUiStorageProvider, this.providesDiskQueueProvider, this.supportSdkComponent.getExecutorServiceProvider));
            this.providesDispatcherProvider = li1.m47821a(RequestModule_ProvidesDispatcherFactory.create(this.providesStoreProvider));
            ky4 a2 = li1.m47821a(RequestModule_ProvidesAttachmentToDiskServiceFactory.create(this.supportSdkComponent.providesOkHttpClientProvider, this.supportSdkComponent.getExecutorServiceProvider));
            this.providesAttachmentToDiskServiceProvider = a2;
            ky4 a3 = li1.m47821a(RequestModule_ProvidesAttachmentDownloaderFactory.create(this.providesBelvedereProvider, a2));
            this.providesAttachmentDownloaderProvider = a3;
            this.providesAttachmentDownloaderComponentProvider = li1.m47821a(RequestModule_ProvidesAttachmentDownloaderComponentFactory.create(this.providesDispatcherProvider, this.providesActionFactoryProvider, a3));
            ky4 a4 = i36.m45457a(RequestModule_ProvidesConUpdatesComponentFactory.create(this.supportSdkComponent.getApplicationContextProvider, this.supportSdkComponent.actionHandlerRegistryProvider, this.supportSdkComponent.requestInfoDataSourceProvider));
            this.providesConUpdatesComponentProvider = a4;
            this.providesComponentListenerProvider = li1.m47821a(RequestModule_ProvidesComponentListenerFactory.create(this.providesPersistenceComponentProvider, this.providesAttachmentDownloaderComponentProvider, a4));
            this.providesMessageFactoryProvider = li1.m47821a(RequestModule_ProvidesMessageFactoryFactory.create(requestModule, this.supportSdkComponent.getApplicationContextProvider, this.supportSdkComponent.providesPicassoProvider, this.providesActionFactoryProvider, this.providesDispatcherProvider, this.supportSdkComponent.actionHandlerRegistryProvider, this.supportSdkComponent.configurationHelperProvider));
        }

        private RequestActivity injectRequestActivity(RequestActivity requestActivity) {
            RequestActivity_MembersInjector.injectStore(requestActivity, this.providesStoreProvider.get());
            RequestActivity_MembersInjector.injectAf(requestActivity, this.providesActionFactoryProvider.get());
            RequestActivity_MembersInjector.injectHeadlessComponentListener(requestActivity, this.providesComponentListenerProvider.get());
            RequestActivity_MembersInjector.injectPicasso(requestActivity, (Picasso) this.supportSdkComponent.providesPicassoProvider.get());
            RequestActivity_MembersInjector.injectActionHandlerRegistry(requestActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.supportSdkComponent.coreModule));
            return requestActivity;
        }

        private RequestViewConversationsDisabled injectRequestViewConversationsDisabled(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            RequestViewConversationsDisabled_MembersInjector.injectStore(requestViewConversationsDisabled, this.providesStoreProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectAf(requestViewConversationsDisabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectPicasso(requestViewConversationsDisabled, (Picasso) this.supportSdkComponent.providesPicassoProvider.get());
            return requestViewConversationsDisabled;
        }

        private RequestViewConversationsEnabled injectRequestViewConversationsEnabled(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            RequestViewConversationsEnabled_MembersInjector.injectStore(requestViewConversationsEnabled, this.providesStoreProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectAf(requestViewConversationsEnabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectCellFactory(requestViewConversationsEnabled, this.providesMessageFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectPicasso(requestViewConversationsEnabled, (Picasso) this.supportSdkComponent.providesPicassoProvider.get());
            return requestViewConversationsEnabled;
        }

        public void inject(RequestActivity requestActivity) {
            injectRequestActivity(requestActivity);
        }

        private RequestComponentImpl(DaggerSupportSdkComponent daggerSupportSdkComponent, RequestModule requestModule) {
            this.requestComponentImpl = this;
            this.supportSdkComponent = daggerSupportSdkComponent;
            initialize(requestModule);
        }

        public void inject(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            injectRequestViewConversationsEnabled(requestViewConversationsEnabled);
        }

        public void inject(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            injectRequestViewConversationsDisabled(requestViewConversationsDisabled);
        }
    }

    public static final class RequestListComponentImpl implements RequestListComponent {
        private ky4 modelProvider;
        private ky4 presenterProvider;
        private ky4 refreshHandlerProvider;
        private ky4<RequestInfoDataSource.Repository> repositoryProvider;
        private final RequestListComponentImpl requestListComponentImpl;
        private final DaggerSupportSdkComponent supportSdkComponent;
        private ky4 viewProvider;

        private void initialize(RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
            ky4<RequestInfoDataSource.Repository> a = li1.m47821a(RequestListModule_RepositoryFactory.create(this.supportSdkComponent.requestInfoDataSourceProvider, this.supportSdkComponent.supportUiStorageProvider, this.supportSdkComponent.providesRequestProvider, this.supportSdkComponent.mainThreadExecutorProvider, this.supportSdkComponent.getExecutorServiceProvider));
            this.repositoryProvider = a;
            ky4 a2 = li1.m47821a(RequestListModule_ModelFactory.create(requestListModule, a, this.supportSdkComponent.getMemoryCacheProvider, this.supportSdkComponent.providesBlipsProvider, this.supportSdkComponent.providesSettingsProvider));
            this.modelProvider = a2;
            this.presenterProvider = li1.m47821a(RequestListModule_PresenterFactory.create(requestListModule, a2));
            this.viewProvider = li1.m47821a(RequestListViewModule_ViewFactory.create(requestListViewModule, this.supportSdkComponent.providesPicassoProvider));
            this.refreshHandlerProvider = li1.m47821a(RequestListModule_RefreshHandlerFactory.create(this.presenterProvider));
        }

        private RequestListActivity injectRequestListActivity(RequestListActivity requestListActivity) {
            RequestListActivity_MembersInjector.injectPresenter(requestListActivity, this.presenterProvider.get());
            RequestListActivity_MembersInjector.injectView(requestListActivity, this.viewProvider.get());
            RequestListActivity_MembersInjector.injectModel(requestListActivity, this.modelProvider.get());
            RequestListActivity_MembersInjector.injectActionHandlerRegistry(requestListActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.supportSdkComponent.coreModule));
            RequestListActivity_MembersInjector.injectSyncHandler(requestListActivity, this.refreshHandlerProvider.get());
            return requestListActivity;
        }

        public void inject(RequestListActivity requestListActivity) {
            injectRequestListActivity(requestListActivity);
        }

        private RequestListComponentImpl(DaggerSupportSdkComponent daggerSupportSdkComponent, RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
            this.requestListComponentImpl = this;
            this.supportSdkComponent = daggerSupportSdkComponent;
            initialize(requestListModule, requestListViewModule);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(CoreModule coreModule2, SupportModule supportModule, SupportSdkModule supportSdkModule) {
        this.providesActionHandlersProvider = li1.m47821a(SupportSdkModule_ProvidesActionHandlersFactory.create(supportSdkModule));
        this.providesRequestProvider = SupportModule_ProvidesRequestProviderFactory.create(supportModule);
        this.providesSettingsProvider = SupportModule_ProvidesSettingsProviderFactory.create(supportModule);
        this.providesUploadProvider = SupportModule_ProvidesUploadProviderFactory.create(supportModule);
        this.getApplicationContextProvider = CoreModule_GetApplicationContextFactory.create(coreModule2);
        CoreModule_GetSessionStorageFactory create = CoreModule_GetSessionStorageFactory.create(coreModule2);
        this.getSessionStorageProvider = create;
        this.providesRequestDiskLruCacheProvider = li1.m47821a(SupportSdkModule_ProvidesRequestDiskLruCacheFactory.create(supportSdkModule, create));
        ky4<Gson> a = li1.m47821a(SupportSdkModule_ProvidesFactory.create(supportSdkModule));
        this.providesProvider = a;
        this.supportUiStorageProvider = li1.m47821a(SupportSdkModule_SupportUiStorageFactory.create(supportSdkModule, this.providesRequestDiskLruCacheProvider, a));
        this.getExecutorServiceProvider = CoreModule_GetExecutorServiceFactory.create(coreModule2);
        this.mainThreadExecutorProvider = li1.m47821a(SupportSdkModule_MainThreadExecutorFactory.create(supportSdkModule));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule2);
        this.providesBlipsProvider = SupportModule_ProvidesBlipsProviderFactory.create(supportModule);
        this.providesOkHttpClientProvider = SupportModule_ProvidesOkHttpClientFactory.create(supportModule);
        this.actionHandlerRegistryProvider = CoreModule_ActionHandlerRegistryFactory.create(coreModule2);
        this.requestInfoDataSourceProvider = SupportSdkModule_RequestInfoDataSourceFactory.create(supportSdkModule, this.supportUiStorageProvider, this.mainThreadExecutorProvider, this.getExecutorServiceProvider);
        ky4<ig4> a2 = li1.m47821a(SupportSdkModule_OkHttp3DownloaderFactory.create(supportSdkModule, this.providesOkHttpClientProvider));
        this.okHttp3DownloaderProvider = a2;
        this.providesPicassoProvider = li1.m47821a(SupportSdkModule_ProvidesPicassoFactory.create(supportSdkModule, this.getApplicationContextProvider, a2, this.getExecutorServiceProvider));
        this.configurationHelperProvider = SupportSdkModule_ConfigurationHelperFactory.create(supportSdkModule);
        this.getMemoryCacheProvider = CoreModule_GetMemoryCacheFactory.create(coreModule2);
    }

    private DeepLinkingBroadcastReceiver injectDeepLinkingBroadcastReceiver(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        DeepLinkingBroadcastReceiver_MembersInjector.injectRegistry(deepLinkingBroadcastReceiver, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        return deepLinkingBroadcastReceiver;
    }

    private SdkDependencyProvider injectSdkDependencyProvider(SdkDependencyProvider sdkDependencyProvider) {
        SdkDependencyProvider_MembersInjector.injectRegistry(sdkDependencyProvider, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        SdkDependencyProvider_MembersInjector.injectActionHandlers(sdkDependencyProvider, this.providesActionHandlersProvider.get());
        return sdkDependencyProvider;
    }

    public void inject(SdkDependencyProvider sdkDependencyProvider) {
        injectSdkDependencyProvider(sdkDependencyProvider);
    }

    public RequestComponent plus(RequestModule requestModule) {
        fu4.m44411b(requestModule);
        return new RequestComponentImpl(requestModule);
    }

    private DaggerSupportSdkComponent(CoreModule coreModule2, SupportModule supportModule, SupportSdkModule supportSdkModule) {
        this.supportSdkComponent = this;
        this.coreModule = coreModule2;
        initialize(coreModule2, supportModule, supportSdkModule);
    }

    public void inject(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        injectDeepLinkingBroadcastReceiver(deepLinkingBroadcastReceiver);
    }

    public RequestListComponent plus(RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
        fu4.m44411b(requestListModule);
        fu4.m44411b(requestListViewModule);
        return new RequestListComponentImpl(requestListModule, requestListViewModule);
    }
}
