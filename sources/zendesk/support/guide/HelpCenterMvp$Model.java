package zendesk.support.guide;

import java.util.List;
import zendesk.support.HelpCenterSettings;
import zendesk.support.SearchArticle;

public interface HelpCenterMvp$Model {
    void getSettings(op7<HelpCenterSettings> op7);

    void search(List<Long> list, List<Long> list2, String str, String[] strArr, op7<List<SearchArticle>> op7);
}
