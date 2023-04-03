package zendesk.support;

public final class GuideModule_ProvidesArticleVoteStorageFactory implements ry1<ArticleVoteStorage> {
    private final GuideModule module;

    public GuideModule_ProvidesArticleVoteStorageFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesArticleVoteStorageFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesArticleVoteStorageFactory(guideModule);
    }

    public static ArticleVoteStorage providesArticleVoteStorage(GuideModule guideModule) {
        return (ArticleVoteStorage) fu4.m44415f(guideModule.providesArticleVoteStorage());
    }

    public ArticleVoteStorage get() {
        return providesArticleVoteStorage(this.module);
    }
}
