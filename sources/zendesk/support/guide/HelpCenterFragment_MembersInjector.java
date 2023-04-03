package zendesk.support.guide;

import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;

public final class HelpCenterFragment_MembersInjector implements ts3<HelpCenterFragment> {
    private final ky4<HelpCenterProvider> helpCenterProvider;
    private final ky4<NetworkInfoProvider> networkInfoProvider;

    public HelpCenterFragment_MembersInjector(ky4<HelpCenterProvider> ky4, ky4<NetworkInfoProvider> ky42) {
        this.helpCenterProvider = ky4;
        this.networkInfoProvider = ky42;
    }

    public static ts3<HelpCenterFragment> create(ky4<HelpCenterProvider> ky4, ky4<NetworkInfoProvider> ky42) {
        return new HelpCenterFragment_MembersInjector(ky4, ky42);
    }

    public static void injectHelpCenterProvider(HelpCenterFragment helpCenterFragment, HelpCenterProvider helpCenterProvider2) {
        helpCenterFragment.helpCenterProvider = helpCenterProvider2;
    }

    public static void injectNetworkInfoProvider(HelpCenterFragment helpCenterFragment, NetworkInfoProvider networkInfoProvider2) {
        helpCenterFragment.networkInfoProvider = networkInfoProvider2;
    }

    public void injectMembers(HelpCenterFragment helpCenterFragment) {
        injectHelpCenterProvider(helpCenterFragment, this.helpCenterProvider.get());
        injectNetworkInfoProvider(helpCenterFragment, this.networkInfoProvider.get());
    }
}
