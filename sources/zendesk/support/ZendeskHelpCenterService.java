package zendesk.support;

import com.zendesk.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.qg5;
import zendesk.core.User;
import zendesk.core.ZendeskLocaleConverter;

class ZendeskHelpCenterService {
    private static final String LOG_TAG = "ZendeskHelpCenterService";
    private static final int NUMBER_PER_PAGE = 1000;
    private final HelpCenterService helpCenterService;
    private final ZendeskLocaleConverter localeConverter;

    public ZendeskHelpCenterService(HelpCenterService helpCenterService2, ZendeskLocaleConverter zendeskLocaleConverter) {
        this.helpCenterService = helpCenterService2;
        this.localeConverter = zendeskLocaleConverter;
    }

    public void deleteVote(Long l, op7<Void> op7) {
        if (l == null) {
            Logger.m43081e(LOG_TAG, "The vote id was null, can not delete the vote", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("The vote id was null, can not delete the vote"));
                return;
            }
            return;
        }
        this.helpCenterService.deleteVote(l).mo50512X(new qg5(op7));
    }

    public void downvoteArticle(Long l, String str, op7<ArticleVoteResponse> op7) {
        if (l == null) {
            Logger.m43081e(LOG_TAG, "The article id was null, can not create down vote", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("The article id was null, can not create down vote"));
                return;
            }
            return;
        }
        this.helpCenterService.downvoteArticle(l, str).mo50512X(new qg5(op7));
    }

    public void getArticle(Long l, Locale locale, String str, op7<Article> op7) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getArticle(helpCenterLocaleString, l, str).mo50512X(new qg5(op7, new qg5.C6410b<ArticleResponse, Article>() {
            public Article extract(ArticleResponse articleResponse) {
                return ZendeskHelpCenterService.this.matchArticleWithUsers(articleResponse.getArticle(), kj0.m47114e(articleResponse.getUsers()));
            }
        }));
    }

    public void getArticlesForSection(Long l, Locale locale, String str, String str2, op7<List<Article>> op7) {
        this.helpCenterService.getArticles(this.localeConverter.toHelpCenterLocaleString(locale), l, str2, str, 1000).mo50512X(new qg5(op7, new qg5.C6410b<ArticlesListResponse, List<Article>>() {
            public List<Article> extract(ArticlesListResponse articlesListResponse) {
                return ZendeskHelpCenterService.this.matchArticlesWithUsers(articlesListResponse.getUsers(), articlesListResponse.getArticles());
            }
        }));
    }

    public void getAttachments(Locale locale, Long l, AttachmentType attachmentType, op7<List<HelpCenterAttachment>> op7) {
        if (attachmentType == null) {
            Logger.m43081e(LOG_TAG, "getAttachments() was called with null attachment type", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("getAttachments() was called with null attachment type"));
                return;
            }
            return;
        }
        this.helpCenterService.getAttachments(this.localeConverter.toHelpCenterLocaleString(locale), l, attachmentType.getAttachmentType()).mo50512X(new qg5(op7, new qg5.C6410b<AttachmentResponse, List<HelpCenterAttachment>>() {
            public List<HelpCenterAttachment> extract(AttachmentResponse attachmentResponse) {
                return attachmentResponse.getArticleAttachments();
            }
        }));
    }

    public void getCategories(Locale locale, op7<List<Category>> op7) {
        this.helpCenterService.getCategories(this.localeConverter.toHelpCenterLocaleString(locale)).mo50512X(new qg5(op7, new qg5.C6410b<CategoriesResponse, List<Category>>() {
            public List<Category> extract(CategoriesResponse categoriesResponse) {
                return categoriesResponse.getCategories();
            }
        }));
    }

    public void getCategoryById(Long l, Locale locale, op7<Category> op7) {
        this.helpCenterService.getCategoryById(this.localeConverter.toHelpCenterLocaleString(locale), l).mo50512X(new qg5(op7, new qg5.C6410b<CategoryResponse, Category>() {
            public Category extract(CategoryResponse categoryResponse) {
                return categoryResponse.getCategory();
            }
        }));
    }

    public void getHelp(Locale locale, String str, String str2, String str3, int i, String str4, op7<HelpResponse> op7) {
        Locale locale2 = locale;
        this.helpCenterService.getHelp(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, i, str4, 1000, SortBy.CREATED_AT.getApiValue(), SortOrder.DESCENDING.getApiValue()).mo50512X(new qg5(op7));
    }

    public void getSectionById(Long l, Locale locale, op7<Section> op7) {
        this.helpCenterService.getSectionById(this.localeConverter.toHelpCenterLocaleString(locale), l).mo50512X(new qg5(op7, new qg5.C6410b<SectionResponse, Section>() {
            public Section extract(SectionResponse sectionResponse) {
                return sectionResponse.getSection();
            }
        }));
    }

    public void getSectionsForCategory(Long l, Locale locale, op7<List<Section>> op7) {
        this.helpCenterService.getSections(this.localeConverter.toHelpCenterLocaleString(locale), l, 1000).mo50512X(new qg5(op7, new qg5.C6410b<SectionsResponse, List<Section>>() {
            public List<Section> extract(SectionsResponse sectionsResponse) {
                return sectionsResponse.getSections();
            }
        }));
    }

    public void getSuggestedArticles(String str, Locale locale, String str2, Long l, Long l2, op7<Object> op7) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getSuggestedArticles(str, helpCenterLocaleString, str2, l, l2).mo50512X(new qg5(op7));
    }

    public void listArticles(String str, Locale locale, String str2, String str3, String str4, Integer num, Integer num2, op7<ArticlesListResponse> op7) {
        Locale locale2 = locale;
        this.helpCenterService.listArticles(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, str4, num, num2).mo50512X(new qg5(op7));
    }

    public Article matchArticleWithUsers(Article article, List<User> list) {
        if (article == null) {
            return new Article();
        }
        Iterator<User> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            User next = it.next();
            if (next.getId() != null && next.getId().equals(article.getAuthorId())) {
                article.setAuthor(next);
                break;
            }
        }
        return article;
    }

    public List<Article> matchArticlesWithUsers(List<User> list, List<Article> list2) {
        HashMap hashMap = new HashMap();
        for (User next : list) {
            hashMap.put(next.getId(), next);
        }
        ArrayList arrayList = new ArrayList();
        for (Article next2 : list2) {
            User user = (User) hashMap.get(next2.getAuthorId());
            if (user != null) {
                next2.setAuthor(user);
            }
            arrayList.add(next2);
        }
        return arrayList;
    }

    public void searchArticles(String str, Locale locale, String str2, String str3, String str4, String str5, Integer num, Integer num2, op7<ArticlesSearchResponse> op7) {
        Locale locale2 = locale;
        this.helpCenterService.searchArticles(str, this.localeConverter.toHelpCenterLocaleString(locale), str2, str3, str4, str5, num, num2).mo50512X(new qg5(op7));
    }

    public void submitRecordArticleView(Long l, Locale locale, RecordArticleViewRequest recordArticleViewRequest, op7<Void> op7) {
        this.helpCenterService.submitRecordArticleView(l, this.localeConverter.toHelpCenterLocaleString(locale), recordArticleViewRequest).mo50512X(new qg5(op7));
    }

    public void upvoteArticle(Long l, String str, op7<ArticleVoteResponse> op7) {
        if (l == null) {
            Logger.m43081e(LOG_TAG, "The article id was null, can not create up vote", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("The article id was null, can not create up vote"));
                return;
            }
            return;
        }
        this.helpCenterService.upvoteArticle(l, str).mo50512X(new qg5(op7));
    }
}
