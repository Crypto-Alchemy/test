package zendesk.support;

import android.annotation.SuppressLint;
import com.zendesk.logger.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import zendesk.core.User;

class ZendeskHelpCenterProvider implements HelpCenterProvider {
    private static final String EMPTY_JSON_BODY = "{}";
    private static final String LOG_TAG = "ZendeskHelpCenterProvider";
    /* access modifiers changed from: private */
    public final HelpCenterBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final ZendeskHelpCenterService helpCenterService;
    /* access modifiers changed from: private */
    public final HelpCenterSessionCache helpCenterSessionCache;
    /* access modifiers changed from: private */
    public final HelpCenterTracker helpCenterTracker;
    private final HelpCenterSettingsProvider settingsProvider;

    public static abstract class ZendeskCallbackSuccess<E> extends op7<E> {
        private final op7 callback;

        public ZendeskCallbackSuccess(op7 op7) {
            this.callback = op7;
        }

        public void onError(hr1 hr1) {
            op7 op7 = this.callback;
            if (op7 != null) {
                op7.onError(hr1);
            }
        }

        public abstract void onSuccess(E e);
    }

    public ZendeskHelpCenterProvider(HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache2, HelpCenterTracker helpCenterTracker2) {
        this.settingsProvider = helpCenterSettingsProvider;
        this.blipsProvider = helpCenterBlipsProvider;
        this.helpCenterService = zendeskHelpCenterService;
        this.helpCenterSessionCache = helpCenterSessionCache2;
        this.helpCenterTracker = helpCenterTracker2;
    }

    /* access modifiers changed from: private */
    public boolean checkSettingsAndVotingEnabled(op7<?> op7, HelpCenterSettings helpCenterSettings) {
        if (!sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
            if (helpCenterSettings.isArticleVotingEnabled()) {
                return true;
            }
            Logger.m43081e(LOG_TAG, "Help Center voting is disabled in your app's settings. Can not continue with the call", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("Help Center voting is disabled in your app's settings. Can not continue with the call"));
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public List<HelpItem> convert(HelpResponse helpResponse) {
        if (helpResponse == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (CategoryItem next : helpResponse.getCategories()) {
            arrayList.add(next);
            for (SectionItem next2 : next.getSections()) {
                arrayList.add(next2);
                arrayList.addAll(next2.getChildren());
            }
        }
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    public List<FlatArticle> asFlatArticleList(ArticlesResponse articlesResponse) {
        if (articlesResponse == null) {
            return new ArrayList();
        }
        List<Category> categories = articlesResponse.getCategories();
        List<Section> sections = articlesResponse.getSections();
        List<Article> articles = articlesResponse.getArticles();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        List<FlatArticle> arrayList = new ArrayList<>();
        if (kj0.m47118i(articles)) {
            for (Category next : categories) {
                hashMap.put(next.getId(), next);
            }
            for (Section next2 : sections) {
                hashMap2.put(next2.getId(), next2);
            }
            for (Article next3 : articles) {
                Section section = (Section) hashMap2.get(next3.getSectionId());
                arrayList.add(new FlatArticle((Category) hashMap.get(section.getCategoryId()), section, next3));
            }
        } else {
            Logger.m43078b(LOG_TAG, "There are no articles contained in this account", new Object[0]);
            arrayList = Collections.emptyList();
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    public List<SearchArticle> asSearchArticleList(ArticlesResponse articlesResponse) {
        Section section;
        ArrayList arrayList = new ArrayList();
        if (articlesResponse == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        List<TypeT> e = kj0.m47114e(articlesResponse.getArticles());
        List<TypeT> e2 = kj0.m47114e(articlesResponse.getSections());
        List<TypeT> e3 = kj0.m47114e(articlesResponse.getCategories());
        List<TypeT> e4 = kj0.m47114e(articlesResponse.getUsers());
        for (TypeT typet : e2) {
            if (typet.getId() != null) {
                hashMap.put(typet.getId(), typet);
            }
        }
        for (TypeT typet2 : e3) {
            if (typet2.getId() != null) {
                hashMap2.put(typet2.getId(), typet2);
            }
        }
        for (TypeT typet3 : e4) {
            if (typet3.getId() != null) {
                hashMap3.put(typet3.getId(), typet3);
            }
        }
        for (TypeT typet4 : e) {
            Category category = null;
            if (typet4.getSectionId() != null) {
                section = (Section) hashMap.get(typet4.getSectionId());
            } else {
                Logger.m43087k(LOG_TAG, "Unable to determine section as section id was null.", new Object[0]);
                section = null;
            }
            if (section == null || section.getCategoryId() == null) {
                Logger.m43087k(LOG_TAG, "Unable to determine category as section was null.", new Object[0]);
            } else {
                category = (Category) hashMap2.get(section.getCategoryId());
            }
            if (typet4.getAuthorId() != null) {
                typet4.setAuthor((User) hashMap3.get(typet4.getAuthorId()));
            } else {
                Logger.m43087k(LOG_TAG, "Unable to determine author as author id was null.", new Object[0]);
            }
            arrayList.add(new SearchArticle(typet4, section, category));
        }
        return arrayList;
    }

    public void deleteVote(final Long l, final op7<Void> op7) {
        if (!sanityCheck(op7, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.deleteVote(l, new ZendeskCallbackSuccess<Void>(op7) {
                            public void onSuccess(Void voidR) {
                                op7 op7 = op7;
                                if (op7 != null) {
                                    op7.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void downvoteArticle(final Long l, final op7<ArticleVote> op7) {
        if (!sanityCheck(op7, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.downvoteArticle(l, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(op7) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                op7 op7 = op7;
                                if (op7 != null) {
                                    op7.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, -1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticle(final Long l, final op7<Article> op7) {
        if (!sanityCheck(op7, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticle(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), "users", new ZendeskCallbackSuccess<Article>(op7) {
                            public void onSuccess(Article article) {
                                ZendeskHelpCenterProvider.this.submitRecordArticleView(article, zj3.m55132c(article.getLocale()), new op7<Void>() {
                                    public void onError(hr1 hr1) {
                                        Logger.m43081e(ZendeskHelpCenterProvider.LOG_TAG, "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", hr1.mo43366h(), Boolean.valueOf(hr1.mo43367i()), Integer.valueOf(hr1.mo43362e()));
                                    }

                                    public void onSuccess(Void voidR) {
                                    }
                                });
                                op7 op7 = op7;
                                if (op7 != null) {
                                    op7.onSuccess(article);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticles(Long l, op7<List<Article>> op7) {
        getArticles(l, (String) null, op7);
    }

    public void getAttachments(Long l, AttachmentType attachmentType, op7<List<HelpCenterAttachment>> op7) {
        if (!sanityCheck(op7, l, attachmentType)) {
            final op7<List<HelpCenterAttachment>> op72 = op7;
            final Long l2 = l;
            final AttachmentType attachmentType2 = attachmentType;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op72, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getAttachments(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), l2, attachmentType2, op72);
                    }
                }
            });
        }
    }

    public void getCategories(final op7<List<Category>> op7) {
        if (!sanityCheck(op7, new Object[0])) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getCategories(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), op7);
                    }
                }
            });
        }
    }

    public void getCategory(final Long l, final op7<Category> op7) {
        if (!sanityCheck(op7, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getCategoryById(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), op7);
                    }
                }
            });
        }
    }

    public void getHelp(final HelpRequest helpRequest, final op7<List<HelpItem>> op7) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.getHelp(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), helpRequest.getCategoryIds(), helpRequest.getSectionIds(), helpRequest.getIncludes(), helpRequest.getArticlesPerPageLimit(), kb6.m46954g(helpRequest.getLabelNames()), new ZendeskCallbackSuccess<HelpResponse>(op7) {
                        public void onSuccess(HelpResponse helpResponse) {
                            ZendeskHelpCenterProvider.this.helpCenterTracker.helpCenterLoaded();
                            C99641 r0 = C99641.this;
                            op7 op7 = op7;
                            if (op7 != null) {
                                op7.onSuccess(ZendeskHelpCenterProvider.this.convert(helpResponse));
                            }
                        }
                    });
                }
            }
        });
    }

    public Locale getLocale(HelpCenterSettings helpCenterSettings) {
        String str;
        Guide guide = Guide.INSTANCE;
        if (guide.getHelpCenterLocaleOverride() != null) {
            return guide.getHelpCenterLocaleOverride();
        }
        if (helpCenterSettings != null) {
            str = helpCenterSettings.getLocale();
        } else {
            str = "";
        }
        if (kb6.m46951d(str)) {
            return Locale.getDefault();
        }
        return zj3.m55132c(str);
    }

    public void getSection(final Long l, final op7<Section> op7) {
        if (!sanityCheck(op7, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getSectionById(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), op7);
                    }
                }
            });
        }
    }

    public void getSections(final Long l, final op7<List<Section>> op7) {
        if (!sanityCheck(op7, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getSectionsForCategory(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), op7);
                    }
                }
            });
        }
    }

    public void getSuggestedArticles(final SuggestedArticleSearch suggestedArticleSearch, final op7<Object> op7) {
        if (!sanityCheck(op7, suggestedArticleSearch)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    Locale locale;
                    String str;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        if (suggestedArticleSearch.getLocale() == null) {
                            locale = ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings);
                        } else {
                            locale = suggestedArticleSearch.getLocale();
                        }
                        Locale locale2 = locale;
                        if (kb6.m46951d(suggestedArticleSearch.getLabelNames())) {
                            str = null;
                        } else {
                            str = kb6.m46954g(suggestedArticleSearch.getLabelNames());
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.getSuggestedArticles(suggestedArticleSearch.getQuery(), locale2, str, suggestedArticleSearch.getCategoryId(), suggestedArticleSearch.getSectionId(), op7);
                    }
                }
            });
        }
    }

    public void listArticles(final ListArticleQuery listArticleQuery, final op7<List<SearchArticle>> op7) {
        if (!sanityCheck(op7, listArticleQuery)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    String str;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        if (listArticleQuery.getInclude() == null) {
                            str = kb6.m46954g("categories", "sections", "users");
                        } else {
                            str = listArticleQuery.getInclude();
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.listArticles(kb6.m46954g(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : listArticleQuery.getLocale(), str, (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(op7) {
                            public void onSuccess(ArticlesListResponse articlesListResponse) {
                                List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesListResponse);
                                op7 op7 = op7;
                                if (op7 != null) {
                                    op7.onSuccess(asSearchArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void listArticlesFlat(final ListArticleQuery listArticleQuery, final op7<List<FlatArticle>> op7) {
        if (!sanityCheck(op7, listArticleQuery)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.listArticles(kb6.m46954g(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : listArticleQuery.getLocale(), "categories,sections", (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(op7) {
                            public void onSuccess(ArticlesListResponse articlesListResponse) {
                                List<FlatArticle> asFlatArticleList = ZendeskHelpCenterProvider.this.asFlatArticleList(articlesListResponse);
                                op7 op7 = op7;
                                if (op7 != null) {
                                    op7.onSuccess(asFlatArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public boolean sanityCheck(op7<?> op7, Object... objArr) {
        if (objArr != null) {
            boolean z = true;
            for (Object obj : objArr) {
                if (obj == null) {
                    z = false;
                }
            }
            if (!z) {
                Logger.m43081e(LOG_TAG, "One or more provided parameters are null.", new Object[0]);
                if (op7 != null) {
                    op7.onError(new ir1("One or more provided parameters are null."));
                }
                return true;
            }
        }
        return false;
    }

    public boolean sanityCheckHelpCenterSettings(op7<?> op7, HelpCenterSettings helpCenterSettings) {
        if (helpCenterSettings == null) {
            Logger.m43081e(LOG_TAG, "Help Center settings are null. Can not continue with the call", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("Help Center settings are null. Can not continue with the call"));
            }
            return true;
        } else if (helpCenterSettings.isEnabled()) {
            return false;
        } else {
            Logger.m43081e(LOG_TAG, "Help Center is disabled in your app's settings. Can not continue with the call", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("Help Center is disabled in your app's settings. Can not continue with the call"));
            }
            return true;
        }
    }

    public void searchArticles(final HelpCenterSearch helpCenterSearch, final op7<List<SearchArticle>> op7) {
        if (!sanityCheck(op7, helpCenterSearch)) {
            this.blipsProvider.helpCenterSearch(helpCenterSearch.getQuery());
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    String str;
                    String str2;
                    Locale locale;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op7, helpCenterSettings)) {
                        if (kb6.m46951d(helpCenterSearch.getInclude())) {
                            str = kb6.m46954g("categories", "sections", "users");
                        } else {
                            str = kb6.m46954g(helpCenterSearch.getInclude());
                        }
                        String str3 = str;
                        if (kb6.m46951d(helpCenterSearch.getLabelNames())) {
                            str2 = null;
                        } else {
                            str2 = kb6.m46954g(helpCenterSearch.getLabelNames());
                        }
                        String str4 = str2;
                        if (helpCenterSearch.getLocale() == null) {
                            locale = ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings);
                        } else {
                            locale = helpCenterSearch.getLocale();
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.searchArticles(helpCenterSearch.getQuery(), locale, str3, str4, helpCenterSearch.getCategoryIds(), helpCenterSearch.getSectionIds(), helpCenterSearch.getPage(), helpCenterSearch.getPerPage(), new ZendeskCallbackSuccess<ArticlesSearchResponse>(op7) {
                            public void onSuccess(ArticlesSearchResponse articlesSearchResponse) {
                                ZendeskHelpCenterProvider.this.helpCenterTracker.helpCenterSearched(helpCenterSearch.getQuery());
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.setLastSearch(helpCenterSearch.getQuery(), (articlesSearchResponse == null || !kj0.m47118i(articlesSearchResponse.getArticles())) ? 0 : articlesSearchResponse.getArticles().size());
                                List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesSearchResponse);
                                op7 op7 = op7;
                                if (op7 != null) {
                                    op7.onSuccess(asSearchArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void submitRecordArticleView(Article article, Locale locale, op7<Void> op7) {
        if (!sanityCheck(op7, article)) {
            this.helpCenterTracker.helpCenterArticleViewed();
            this.blipsProvider.articleView(article);
            final op7<Void> op72 = op7;
            final Article article2 = article;
            final Locale locale2 = locale;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op72, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.submitRecordArticleView(article2.getId(), locale2, new RecordArticleViewRequest(ZendeskHelpCenterProvider.this.helpCenterSessionCache.getLastSearch(), ZendeskHelpCenterProvider.this.helpCenterSessionCache.isUniqueSearchResultClick()), new ZendeskCallbackSuccess<Void>(op72) {
                            public void onSuccess(Void voidR) {
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.unsetUniqueSearchResultClick();
                                op7 op7 = op72;
                                if (op7 != null) {
                                    op7.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void upvoteArticle(final Long l, final op7<ArticleVote> op7) {
        if (!sanityCheck(op7, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(op7, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.upvoteArticle(l, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(op7) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                op7 op7 = op7;
                                if (op7 != null) {
                                    op7.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, 1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticles(Long l, String str, op7<List<Article>> op7) {
        if (!sanityCheck(op7, l)) {
            final op7<List<Article>> op72 = op7;
            final Long l2 = l;
            final String str2 = str;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(op7) {
                public void onSuccess(HelpCenterSettings helpCenterSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(op72, helpCenterSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticlesForSection(l2, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), "users", str2, op72);
                    }
                }
            });
        }
    }
}
