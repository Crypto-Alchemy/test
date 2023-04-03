package zendesk.support.guide;

import java.util.ArrayList;
import java.util.List;
import zendesk.support.Article;
import zendesk.support.ArticleItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.HelpRequest;
import zendesk.support.SectionItem;

class HelpModel implements HelpMvp$Model {
    private HelpCenterProvider provider;

    public HelpModel(HelpCenterProvider helpCenterProvider) {
        this.provider = helpCenterProvider;
    }

    /* access modifiers changed from: private */
    public ArticleItem convertArticle(Article article) {
        return new ArticleItem(article.getId(), article.getSectionId(), article.getTitle());
    }

    public void getArticles(List<Long> list, List<Long> list2, String[] strArr, op7<List<HelpItem>> op7) {
        this.provider.getHelp(new HelpRequest.Builder().withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).includeCategories().includeSections().build(), op7);
    }

    public void getArticlesForSection(SectionItem sectionItem, String[] strArr, final op7<List<ArticleItem>> op7) {
        if (sectionItem == null || sectionItem.getId() == null) {
            op7.onError(new ir1("SectionItem or its ID was null, cannot load more articles."));
        } else {
            this.provider.getArticles(sectionItem.getId(), kb6.m46954g(strArr), new op7<List<Article>>() {
                public void onError(hr1 hr1) {
                    op7 op7 = op7;
                    if (op7 != null) {
                        op7.onError(hr1);
                    }
                }

                public void onSuccess(List<Article> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Article access$000 : list) {
                        arrayList.add(HelpModel.this.convertArticle(access$000));
                    }
                    op7 op7 = op7;
                    if (op7 != null) {
                        op7.onSuccess(arrayList);
                    }
                }
            });
        }
    }
}
