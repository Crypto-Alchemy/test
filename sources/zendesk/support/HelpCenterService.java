package zendesk.support;

interface HelpCenterService {
    @mz0("/api/v2/help_center/votes/{vote_id}.json")
    k90<Void> deleteVote(@sm4("vote_id") Long l);

    @ak4("/api/v2/help_center/articles/{article_id}/down.json")
    k90<ArticleVoteResponse> downvoteArticle(@sm4("article_id") Long l, @p30 String str);

    @le2("/hc/api/mobile/{locale}/articles/{article_id}.json?respect_sanitization_settings=true")
    k90<ArticleResponse> getArticle(@sm4("locale") String str, @sm4("article_id") Long l, @sz4("include") String str2);

    @le2("/api/v2/help_center/{locale}/sections/{id}/articles.json?respect_sanitization_settings=true")
    k90<ArticlesListResponse> getArticles(@sm4("locale") String str, @sm4("id") Long l, @sz4("label_names") String str2, @sz4("include") String str3, @sz4("per_page") int i);

    @le2("/api/v2/help_center/{locale}/articles/{article_id}/attachments/{attachment_type}.json")
    k90<AttachmentResponse> getAttachments(@sm4("locale") String str, @sm4("article_id") Long l, @sm4("attachment_type") String str2);

    @le2("/api/v2/help_center/{locale}/categories.json?per_page=1000")
    k90<CategoriesResponse> getCategories(@sm4("locale") String str);

    @le2("/api/v2/help_center/{locale}/categories/{category_id}.json")
    k90<CategoryResponse> getCategoryById(@sm4("locale") String str, @sm4("category_id") Long l);

    @le2("/hc/api/mobile/{locale}/article_tree.json")
    k90<HelpResponse> getHelp(@sm4("locale") String str, @sz4("category_ids") String str2, @sz4("section_ids") String str3, @sz4("include") String str4, @sz4("limit") int i, @sz4("article_labels") String str5, @sz4("per_page") int i2, @sz4("sort_by") String str6, @sz4("sort_order") String str7);

    @le2("/api/v2/help_center/{locale}/sections/{section_id}.json")
    k90<SectionResponse> getSectionById(@sm4("locale") String str, @sm4("section_id") Long l);

    @le2("/api/v2/help_center/{locale}/categories/{id}/sections.json")
    k90<SectionsResponse> getSections(@sm4("locale") String str, @sm4("id") Long l, @sz4("per_page") int i);

    @le2("/api/mobile/help_center/search/deflect.json?respect_sanitization_settings=true")
    k90<Object> getSuggestedArticles(@sz4("query") String str, @sz4("locale") String str2, @sz4("label_names") String str3, @sz4("category") Long l, @sz4("section") Long l2);

    @le2("/api/v2/help_center/{locale}/articles.json?respect_sanitization_settings=true")
    k90<ArticlesListResponse> listArticles(@sm4("locale") String str, @sz4("label_names") String str2, @sz4("include") String str3, @sz4("sort_by") String str4, @sz4("sort_order") String str5, @sz4("page") Integer num, @sz4("per_page") Integer num2);

    @le2("/api/v2/help_center/articles/search.json?respect_sanitization_settings=true&origin=mobile_sdk")
    k90<ArticlesSearchResponse> searchArticles(@sz4("query") String str, @sz4("locale") String str2, @sz4("include") String str3, @sz4("label_names") String str4, @sz4("category") String str5, @sz4("section") String str6, @sz4("page") Integer num, @sz4("per_page") Integer num2);

    @ak4("/api/v2/help_center/{locale}/articles/{article_id}/stats/view.json")
    k90<Void> submitRecordArticleView(@sm4("article_id") Long l, @sm4("locale") String str, @p30 RecordArticleViewRequest recordArticleViewRequest);

    @ak4("/api/v2/help_center/articles/{article_id}/up.json")
    k90<ArticleVoteResponse> upvoteArticle(@sm4("article_id") Long l, @p30 String str);
}
