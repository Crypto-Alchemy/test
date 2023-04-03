package zendesk.support.guide;

import okhttp3.OkHttpClient;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;

public final class ViewArticleActivity_MembersInjector implements ts3<ViewArticleActivity> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<ApplicationConfiguration> applicationConfigurationProvider;
    private final ky4<ArticleVoteStorage> articleVoteStorageProvider;
    private final ky4<ro0> configurationHelperProvider;
    private final ky4<HelpCenterProvider> helpCenterProvider;
    private final ky4<NetworkInfoProvider> networkInfoProvider;
    private final ky4<OkHttpClient> okHttpClientProvider;
    private final ky4<HelpCenterSettingsProvider> settingsProvider;

    public ViewArticleActivity_MembersInjector(ky4<OkHttpClient> ky4, ky4<ApplicationConfiguration> ky42, ky4<HelpCenterProvider> ky43, ky4<ArticleVoteStorage> ky44, ky4<NetworkInfoProvider> ky45, ky4<HelpCenterSettingsProvider> ky46, ky4<ActionHandlerRegistry> ky47, ky4<ro0> ky48) {
        this.okHttpClientProvider = ky4;
        this.applicationConfigurationProvider = ky42;
        this.helpCenterProvider = ky43;
        this.articleVoteStorageProvider = ky44;
        this.networkInfoProvider = ky45;
        this.settingsProvider = ky46;
        this.actionHandlerRegistryProvider = ky47;
        this.configurationHelperProvider = ky48;
    }

    public static ts3<ViewArticleActivity> create(ky4<OkHttpClient> ky4, ky4<ApplicationConfiguration> ky42, ky4<HelpCenterProvider> ky43, ky4<ArticleVoteStorage> ky44, ky4<NetworkInfoProvider> ky45, ky4<HelpCenterSettingsProvider> ky46, ky4<ActionHandlerRegistry> ky47, ky4<ro0> ky48) {
        return new ViewArticleActivity_MembersInjector(ky4, ky42, ky43, ky44, ky45, ky46, ky47, ky48);
    }

    public static void injectActionHandlerRegistry(ViewArticleActivity viewArticleActivity, ActionHandlerRegistry actionHandlerRegistry) {
        viewArticleActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectApplicationConfiguration(ViewArticleActivity viewArticleActivity, ApplicationConfiguration applicationConfiguration) {
        viewArticleActivity.applicationConfiguration = applicationConfiguration;
    }

    public static void injectArticleVoteStorage(ViewArticleActivity viewArticleActivity, ArticleVoteStorage articleVoteStorage) {
        viewArticleActivity.articleVoteStorage = articleVoteStorage;
    }

    public static void injectConfigurationHelper(ViewArticleActivity viewArticleActivity, ro0 ro0) {
        viewArticleActivity.configurationHelper = ro0;
    }

    public static void injectHelpCenterProvider(ViewArticleActivity viewArticleActivity, HelpCenterProvider helpCenterProvider2) {
        viewArticleActivity.helpCenterProvider = helpCenterProvider2;
    }

    public static void injectNetworkInfoProvider(ViewArticleActivity viewArticleActivity, NetworkInfoProvider networkInfoProvider2) {
        viewArticleActivity.networkInfoProvider = networkInfoProvider2;
    }

    public static void injectOkHttpClient(ViewArticleActivity viewArticleActivity, OkHttpClient okHttpClient) {
        viewArticleActivity.okHttpClient = okHttpClient;
    }

    public static void injectSettingsProvider(ViewArticleActivity viewArticleActivity, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        viewArticleActivity.settingsProvider = helpCenterSettingsProvider;
    }

    public void injectMembers(ViewArticleActivity viewArticleActivity) {
        injectOkHttpClient(viewArticleActivity, this.okHttpClientProvider.get());
        injectApplicationConfiguration(viewArticleActivity, this.applicationConfigurationProvider.get());
        injectHelpCenterProvider(viewArticleActivity, this.helpCenterProvider.get());
        injectArticleVoteStorage(viewArticleActivity, this.articleVoteStorageProvider.get());
        injectNetworkInfoProvider(viewArticleActivity, this.networkInfoProvider.get());
        injectSettingsProvider(viewArticleActivity, this.settingsProvider.get());
        injectActionHandlerRegistry(viewArticleActivity, this.actionHandlerRegistryProvider.get());
        injectConfigurationHelper(viewArticleActivity, this.configurationHelperProvider.get());
    }
}
