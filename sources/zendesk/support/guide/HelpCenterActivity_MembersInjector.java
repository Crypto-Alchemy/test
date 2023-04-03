package zendesk.support.guide;

import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;

public final class HelpCenterActivity_MembersInjector implements ts3<HelpCenterActivity> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<ro0> configurationHelperProvider;
    private final ky4<HelpCenterProvider> helpCenterProvider;
    private final ky4<NetworkInfoProvider> networkInfoProvider;
    private final ky4<HelpCenterSettingsProvider> settingsProvider;

    public HelpCenterActivity_MembersInjector(ky4<HelpCenterProvider> ky4, ky4<HelpCenterSettingsProvider> ky42, ky4<NetworkInfoProvider> ky43, ky4<ActionHandlerRegistry> ky44, ky4<ro0> ky45) {
        this.helpCenterProvider = ky4;
        this.settingsProvider = ky42;
        this.networkInfoProvider = ky43;
        this.actionHandlerRegistryProvider = ky44;
        this.configurationHelperProvider = ky45;
    }

    public static ts3<HelpCenterActivity> create(ky4<HelpCenterProvider> ky4, ky4<HelpCenterSettingsProvider> ky42, ky4<NetworkInfoProvider> ky43, ky4<ActionHandlerRegistry> ky44, ky4<ro0> ky45) {
        return new HelpCenterActivity_MembersInjector(ky4, ky42, ky43, ky44, ky45);
    }

    public static void injectActionHandlerRegistry(HelpCenterActivity helpCenterActivity, ActionHandlerRegistry actionHandlerRegistry) {
        helpCenterActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectConfigurationHelper(HelpCenterActivity helpCenterActivity, ro0 ro0) {
        helpCenterActivity.configurationHelper = ro0;
    }

    public static void injectHelpCenterProvider(HelpCenterActivity helpCenterActivity, HelpCenterProvider helpCenterProvider2) {
        helpCenterActivity.helpCenterProvider = helpCenterProvider2;
    }

    public static void injectNetworkInfoProvider(HelpCenterActivity helpCenterActivity, NetworkInfoProvider networkInfoProvider2) {
        helpCenterActivity.networkInfoProvider = networkInfoProvider2;
    }

    public static void injectSettingsProvider(HelpCenterActivity helpCenterActivity, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        helpCenterActivity.settingsProvider = helpCenterSettingsProvider;
    }

    public void injectMembers(HelpCenterActivity helpCenterActivity) {
        injectHelpCenterProvider(helpCenterActivity, this.helpCenterProvider.get());
        injectSettingsProvider(helpCenterActivity, this.settingsProvider.get());
        injectNetworkInfoProvider(helpCenterActivity, this.networkInfoProvider.get());
        injectActionHandlerRegistry(helpCenterActivity, this.actionHandlerRegistryProvider.get());
        injectConfigurationHelper(helpCenterActivity, this.configurationHelperProvider.get());
    }
}
