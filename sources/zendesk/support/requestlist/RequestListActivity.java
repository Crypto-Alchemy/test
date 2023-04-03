package zendesk.support.requestlist;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.zendesk.logger.Logger;
import java.util.Map;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.requestlist.RequestListConfiguration;

public class RequestListActivity extends AppCompatActivity {
    public static final String LOG_TAG = "RequestListActivity";
    public ActionHandlerRegistry actionHandlerRegistry;
    public RequestListModel model;
    public RequestListPresenter presenter;
    public RequestListSyncHandler syncHandler;
    public RequestListView view;

    public static RequestListConfiguration.Builder builder() {
        return new RequestListConfiguration.Builder();
    }

    public static void refresh(Context context, ActionHandlerRegistry actionHandlerRegistry2) {
        ActionHandler handlerByAction = actionHandlerRegistry2.handlerByAction("request_list_refresh");
        if (handlerByAction != null) {
            handlerByAction.handle((Map<String, Object>) null, context);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        getTheme().applyStyle(g55.ZendeskActivityDefaultTheme, true);
        SdkDependencyProvider sdkDependencyProvider = SdkDependencyProvider.INSTANCE;
        if (!sdkDependencyProvider.isInitialized()) {
            Logger.m43081e(LOG_TAG, SdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        RequestListConfiguration requestListConfiguration = (RequestListConfiguration) so0.m75307e(getIntent().getExtras(), RequestListConfiguration.class);
        if (requestListConfiguration == null) {
            Logger.m43081e(LOG_TAG, "No configuration found. Please use RequestListActivity.builder()", new Object[0]);
            finish();
            return;
        }
        sdkDependencyProvider.provideRequestListComponent(this, requestListConfiguration).inject(this);
        setContentView((View) this.view);
        RequestListPresenter requestListPresenter = this.presenter;
        if (bundle != null) {
            z = false;
        }
        requestListPresenter.onCreate(z, this.view);
        this.actionHandlerRegistry.add(this.syncHandler);
    }

    public void onDestroy() {
        super.onDestroy();
        ActionHandlerRegistry actionHandlerRegistry2 = this.actionHandlerRegistry;
        if (actionHandlerRegistry2 != null) {
            actionHandlerRegistry2.remove(this.syncHandler);
        }
        RequestListPresenter requestListPresenter = this.presenter;
        if (requestListPresenter != null) {
            requestListPresenter.onDestroy(isChangingConfigurations());
        }
    }

    public void onPause() {
        super.onPause();
        this.syncHandler.setRunning(false);
    }

    public void onResume() {
        super.onResume();
        this.syncHandler.setRunning(true);
    }

    public void onStart() {
        super.onStart();
        this.view.onStart();
    }

    public void onStop() {
        super.onStop();
        this.view.onStop();
    }
}
