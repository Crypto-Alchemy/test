package zendesk.support;

import zendesk.core.SessionStorage;

public final class GuideProviderModule_ProvideArticleVoteStorageFactory implements ry1<ArticleVoteStorage> {
    private final ky4<SessionStorage> baseStorageProvider;

    public GuideProviderModule_ProvideArticleVoteStorageFactory(ky4<SessionStorage> ky4) {
        this.baseStorageProvider = ky4;
    }

    public static GuideProviderModule_ProvideArticleVoteStorageFactory create(ky4<SessionStorage> ky4) {
        return new GuideProviderModule_ProvideArticleVoteStorageFactory(ky4);
    }

    public static ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return (ArticleVoteStorage) fu4.m44415f(GuideProviderModule.provideArticleVoteStorage(sessionStorage));
    }

    public ArticleVoteStorage get() {
        return provideArticleVoteStorage(this.baseStorageProvider.get());
    }
}
