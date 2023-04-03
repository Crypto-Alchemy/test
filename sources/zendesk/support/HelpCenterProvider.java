package zendesk.support;

import java.util.List;
import java.util.Locale;

public interface HelpCenterProvider {
    void deleteVote(Long l, op7<Void> op7);

    void downvoteArticle(Long l, op7<ArticleVote> op7);

    void getArticle(Long l, op7<Article> op7);

    void getArticles(Long l, String str, op7<List<Article>> op7);

    void getArticles(Long l, op7<List<Article>> op7);

    void getAttachments(Long l, AttachmentType attachmentType, op7<List<HelpCenterAttachment>> op7);

    void getCategories(op7<List<Category>> op7);

    void getCategory(Long l, op7<Category> op7);

    void getHelp(HelpRequest helpRequest, op7<List<HelpItem>> op7);

    void getSection(Long l, op7<Section> op7);

    void getSections(Long l, op7<List<Section>> op7);

    void getSuggestedArticles(SuggestedArticleSearch suggestedArticleSearch, op7<Object> op7);

    void listArticles(ListArticleQuery listArticleQuery, op7<List<SearchArticle>> op7);

    void listArticlesFlat(ListArticleQuery listArticleQuery, op7<List<FlatArticle>> op7);

    void searchArticles(HelpCenterSearch helpCenterSearch, op7<List<SearchArticle>> op7);

    void submitRecordArticleView(Article article, Locale locale, op7<Void> op7);

    void upvoteArticle(Long l, op7<ArticleVote> op7);
}
