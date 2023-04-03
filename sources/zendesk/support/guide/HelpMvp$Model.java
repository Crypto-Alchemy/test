package zendesk.support.guide;

import java.util.List;
import zendesk.support.ArticleItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;

public interface HelpMvp$Model {
    void getArticles(List<Long> list, List<Long> list2, String[] strArr, op7<List<HelpItem>> op7);

    void getArticlesForSection(SectionItem sectionItem, String[] strArr, op7<List<ArticleItem>> op7);
}
