package zendesk.support.guide;

import zendesk.core.ActionHandler;

class GuideSdkModule {
    public static ActionHandler viewArticleActionHandler() {
        return new ViewArticleActionHandler();
    }

    public ro0 configurationHelper() {
        return new ro0();
    }
}
