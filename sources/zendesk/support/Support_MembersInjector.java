package zendesk.support;

import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;

public final class Support_MembersInjector implements ts3<Support> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<AuthenticationProvider> authenticationProvider;
    private final ky4<SupportBlipsProvider> blipsProvider;
    private final ky4<ProviderStore> providerStoreProvider;
    private final ky4<RequestMigrator> requestMigratorProvider;
    private final ky4<RequestProvider> requestProvider;
    private final ky4<SupportModule> supportModuleProvider;

    public Support_MembersInjector(ky4<ProviderStore> ky4, ky4<SupportModule> ky42, ky4<RequestMigrator> ky43, ky4<SupportBlipsProvider> ky44, ky4<ActionHandlerRegistry> ky45, ky4<RequestProvider> ky46, ky4<AuthenticationProvider> ky47) {
        this.providerStoreProvider = ky4;
        this.supportModuleProvider = ky42;
        this.requestMigratorProvider = ky43;
        this.blipsProvider = ky44;
        this.actionHandlerRegistryProvider = ky45;
        this.requestProvider = ky46;
        this.authenticationProvider = ky47;
    }

    public static ts3<Support> create(ky4<ProviderStore> ky4, ky4<SupportModule> ky42, ky4<RequestMigrator> ky43, ky4<SupportBlipsProvider> ky44, ky4<ActionHandlerRegistry> ky45, ky4<RequestProvider> ky46, ky4<AuthenticationProvider> ky47) {
        return new Support_MembersInjector(ky4, ky42, ky43, ky44, ky45, ky46, ky47);
    }

    public static void injectActionHandlerRegistry(Support support, ActionHandlerRegistry actionHandlerRegistry) {
        support.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAuthenticationProvider(Support support, AuthenticationProvider authenticationProvider2) {
        support.authenticationProvider = authenticationProvider2;
    }

    public static void injectBlipsProvider(Support support, SupportBlipsProvider supportBlipsProvider) {
        support.blipsProvider = supportBlipsProvider;
    }

    public static void injectProviderStore(Support support, ProviderStore providerStore) {
        support.providerStore = providerStore;
    }

    public static void injectRequestMigrator(Support support, Object obj) {
        support.requestMigrator = (RequestMigrator) obj;
    }

    public static void injectRequestProvider(Support support, RequestProvider requestProvider2) {
        support.requestProvider = requestProvider2;
    }

    public static void injectSupportModule(Support support, SupportModule supportModule) {
        support.supportModule = supportModule;
    }

    public void injectMembers(Support support) {
        injectProviderStore(support, this.providerStoreProvider.get());
        injectSupportModule(support, this.supportModuleProvider.get());
        injectRequestMigrator(support, this.requestMigratorProvider.get());
        injectBlipsProvider(support, this.blipsProvider.get());
        injectActionHandlerRegistry(support, this.actionHandlerRegistryProvider.get());
        injectRequestProvider(support, this.requestProvider.get());
        injectAuthenticationProvider(support, this.authenticationProvider.get());
    }
}
