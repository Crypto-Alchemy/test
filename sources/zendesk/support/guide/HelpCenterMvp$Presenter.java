package zendesk.support.guide;

import java.util.List;
import zendesk.core.RetryAction;
import zendesk.messaging.Engine;

public interface HelpCenterMvp$Presenter {
    void init(HelpCenterConfiguration helpCenterConfiguration, List<Engine> list);

    void onErrorWithRetry(HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, RetryAction retryAction);

    void onLoad();

    void onPause();

    void onResume(HelpCenterMvp$View helpCenterMvp$View);

    void onSearchSubmit(String str);

    boolean shouldShowConversationsMenuItem();

    boolean shouldShowSearchMenuItem();
}
