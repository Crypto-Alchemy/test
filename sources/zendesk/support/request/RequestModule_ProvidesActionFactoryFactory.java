package zendesk.support.request;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zendesk.belvedere.C9800a;
import zendesk.core.AuthenticationProvider;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;

public final class RequestModule_ProvidesActionFactoryFactory implements ry1<ActionFactory> {
    private final ky4<AuthenticationProvider> authProvider;
    private final ky4<C9800a> belvedereProvider;
    private final ky4<SupportBlipsProvider> blipsProvider;
    private final ky4<ExecutorService> executorProvider;
    private final ky4<Executor> mainThreadExecutorProvider;
    private final ky4<RequestProvider> requestProvider;
    private final ky4<SupportSettingsProvider> settingsProvider;
    private final ky4<SupportUiStorage> supportUiStorageProvider;
    private final ky4<UploadProvider> uploadProvider;

    public RequestModule_ProvidesActionFactoryFactory(ky4<RequestProvider> ky4, ky4<SupportSettingsProvider> ky42, ky4<UploadProvider> ky43, ky4<C9800a> ky44, ky4<SupportUiStorage> ky45, ky4<ExecutorService> ky46, ky4<Executor> ky47, ky4<AuthenticationProvider> ky48, ky4<SupportBlipsProvider> ky49) {
        this.requestProvider = ky4;
        this.settingsProvider = ky42;
        this.uploadProvider = ky43;
        this.belvedereProvider = ky44;
        this.supportUiStorageProvider = ky45;
        this.executorProvider = ky46;
        this.mainThreadExecutorProvider = ky47;
        this.authProvider = ky48;
        this.blipsProvider = ky49;
    }

    public static RequestModule_ProvidesActionFactoryFactory create(ky4<RequestProvider> ky4, ky4<SupportSettingsProvider> ky42, ky4<UploadProvider> ky43, ky4<C9800a> ky44, ky4<SupportUiStorage> ky45, ky4<ExecutorService> ky46, ky4<Executor> ky47, ky4<AuthenticationProvider> ky48, ky4<SupportBlipsProvider> ky49) {
        return new RequestModule_ProvidesActionFactoryFactory(ky4, ky42, ky43, ky44, ky45, ky46, ky47, ky48, ky49);
    }

    public static ActionFactory providesActionFactory(RequestProvider requestProvider2, SupportSettingsProvider supportSettingsProvider, UploadProvider uploadProvider2, C9800a aVar, SupportUiStorage supportUiStorage, ExecutorService executorService, Executor executor, AuthenticationProvider authenticationProvider, SupportBlipsProvider supportBlipsProvider) {
        return (ActionFactory) fu4.m44415f(RequestModule.providesActionFactory(requestProvider2, supportSettingsProvider, uploadProvider2, aVar, supportUiStorage, executorService, executor, authenticationProvider, supportBlipsProvider));
    }

    public ActionFactory get() {
        return providesActionFactory(this.requestProvider.get(), this.settingsProvider.get(), this.uploadProvider.get(), this.belvedereProvider.get(), this.supportUiStorageProvider.get(), this.executorProvider.get(), this.mainThreadExecutorProvider.get(), this.authProvider.get(), this.blipsProvider.get());
    }
}
