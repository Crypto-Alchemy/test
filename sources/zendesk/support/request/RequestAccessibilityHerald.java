package zendesk.support.request;

import android.view.View;
import zendesk.support.CommentsResponse;
import zendesk.support.request.ActionCreateComment;
import zendesk.support.suas.Action;
import zendesk.support.suas.Listener;

class RequestAccessibilityHerald implements Listener<Action<?>> {
    private final View view;

    public RequestAccessibilityHerald(View view2) {
        this.view = view2;
    }

    private void announce(int i, Object... objArr) {
        this.view.announceForAccessibility(this.view.getContext().getString(i, objArr));
    }

    public static RequestAccessibilityHerald create(RequestActivity requestActivity) {
        return new RequestAccessibilityHerald(requestActivity.findViewById(l35.activity_request_root));
    }

    public void update(Action<?> action) {
        F f;
        String actionType = action.getActionType();
        actionType.hashCode();
        char c = 65535;
        switch (actionType.hashCode()) {
            case -1679314784:
                if (actionType.equals(ActionFactory.CREATE_COMMENT_SUCCESS)) {
                    c = 0;
                    break;
                }
                break;
            case -1319777819:
                if (actionType.equals(ActionFactory.CREATE_COMMENT_ERROR)) {
                    c = 1;
                    break;
                }
                break;
            case -292168757:
                if (actionType.equals(ActionFactory.LOAD_COMMENTS_INITIAL)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                announce(o45.zs_request_announce_comment_created_accessibility, ((ActionCreateComment.CreateCommentResult) action.getData()).getMessage().getPlainBody());
                return;
            case 1:
                announce(o45.zs_request_announce_comment_failed_accessibility, ((StateMessage) action.getData()).getPlainBody());
                return;
            case 2:
                jl4 jl4 = (jl4) action.getData();
                if (jl4 != null && (f = jl4.f13688a) != null && kj0.m47118i(((CommentsResponse) f).getComments())) {
                    announce(o45.zs_request_announce_comments_loaded_accessibility, new Object[0]);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
