package zendesk.support.guide;

import java.util.List;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSearch;
import zendesk.support.HelpCenterSettings;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.SearchArticle;

class HelpCenterModel implements HelpCenterMvp$Model {
    private final HelpCenterProvider provider;
    private final HelpCenterSettingsProvider settingsProvider;

    public HelpCenterModel(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        this.provider = helpCenterProvider;
        this.settingsProvider = helpCenterSettingsProvider;
    }

    public void getSettings(op7<HelpCenterSettings> op7) {
        this.settingsProvider.getSettings(op7);
    }

    public void search(List<Long> list, List<Long> list2, String str, String[] strArr, op7<List<SearchArticle>> op7) {
        this.provider.searchArticles(new HelpCenterSearch.Builder().withQuery(str).withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).build(), op7);
    }
}
