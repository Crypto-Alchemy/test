package zendesk.support.guide;

import zendesk.core.ActionHandler;

public final class GuideSdkModule_ViewArticleActionHandlerFactory implements ry1<ActionHandler> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GuideSdkModule_ViewArticleActionHandlerFactory INSTANCE = new GuideSdkModule_ViewArticleActionHandlerFactory();

        private InstanceHolder() {
        }
    }

    public static GuideSdkModule_ViewArticleActionHandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActionHandler viewArticleActionHandler() {
        return (ActionHandler) fu4.m44415f(GuideSdkModule.viewArticleActionHandler());
    }

    public ActionHandler get() {
        return viewArticleActionHandler();
    }
}
