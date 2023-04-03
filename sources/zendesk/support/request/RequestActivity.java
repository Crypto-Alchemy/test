package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0147a;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.JsonElement;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import java.util.Map;
import zendesk.belvedere.BelvedereUi;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.State;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;

public class RequestActivity extends AppCompatActivity {
    public static final boolean DEBUG = false;
    public static final String LOG_TAG = "RequestActivity";
    private static final String SAVED_STATE = "saved_state";
    private RequestAccessibilityHerald accessibilityHerald;
    public ActionHandlerRegistry actionHandlerRegistry;

    /* renamed from: af */
    public ActionFactory f46876af;
    public HeadlessComponentListener headlessComponentListener;
    public Picasso picasso;
    private RefreshRequestActionHandler refreshActionHandler;
    private RequestComponent requestComponent;
    private ComponentRequestRouter requestRouter;
    public Store store;
    private Subscription subscription;

    public static class MoveUpWithSnackbarBehaviour extends AppBarLayout.ScrollingViewBehavior {
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (super.layoutDependsOn(coordinatorLayout, view, view2) || (view2 instanceof Snackbar.SnackbarLayout)) {
                return true;
            }
            return false;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!(view2 instanceof Snackbar.SnackbarLayout)) {
                return onDependentViewChanged;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) Math.abs(Math.min(Utils.FLOAT_EPSILON, view2.getTranslationY() - ((float) view2.getHeight()))));
            return true;
        }
    }

    public final class RefreshRequestActionHandler implements ActionHandler {
        private final String requestId;

        public RefreshRequestActionHandler(String str) {
            this.requestId = str;
        }

        public boolean canHandle(String str) {
            if (!str.contains("request_conversation_refresh") || !str.contains(this.requestId)) {
                return false;
            }
            return true;
        }

        public ActionDescription getActionDescription() {
            return null;
        }

        public int getPriority() {
            return 0;
        }

        public void handle(Map<String, Object> map, Context context) {
            RequestActivity requestActivity = RequestActivity.this;
            requestActivity.store.dispatch(requestActivity.f46876af.updateCommentsAsync());
        }

        public void updateSettings(Map<String, JsonElement> map) {
        }
    }

    private Subscription bindComponents(boolean z) {
        ComponentToolbar bindToolbar = bindToolbar();
        ComponentError create = ComponentError.create(this, this.store, this.f46876af);
        this.requestRouter = ComponentRequestRouter.create(this, z, this.requestComponent);
        this.accessibilityHerald = RequestAccessibilityHerald.create(this);
        return CombinedSubscription.from(this.store.addListener(bindToolbar.getToolbarSelector(), bindToolbar), this.store.addListener(this.requestRouter.getSelector(), this.requestRouter), this.store.addListener(ComponentError.getSelector(), create), this.store.addActionListener(this.accessibilityHerald));
    }

    @SuppressLint({"PrivateResource"})
    private ComponentToolbar bindToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(l35.activity_request_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestActivity.this.onBackPressed();
            }
        });
        findViewById(l35.activity_request_compat_toolbar_shadow).setVisibility(8);
        return new ComponentToolbar(this.picasso, toolbar, (ViewAlmostRealProgressBar) findViewById(l35.activity_request_progressbar));
    }

    public static RequestConfiguration.Builder builder() {
        return new RequestConfiguration.Builder();
    }

    private void initViews() {
        ((CoordinatorLayout.C0546e) findViewById(l35.activity_request_root).getLayoutParams()).mo5303o(new MoveUpWithSnackbarBehaviour());
    }

    private boolean initializeStoreAndDependencies(Bundle bundle, RequestConfiguration requestConfiguration) {
        if (!injectDependencies(requestConfiguration)) {
            State restoreState = restoreState(bundle);
            if (restoreState == null) {
                return true;
            }
            this.store.reset(restoreState);
        }
        return false;
    }

    private boolean injectDependencies(RequestConfiguration requestConfiguration) {
        boolean z;
        RequestComponent requestComponent2 = (RequestComponent) HeadlessFragment.getData(getSupportFragmentManager());
        this.requestComponent = requestComponent2;
        if (requestComponent2 == null) {
            z = false;
            this.requestComponent = SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().plus(new RequestModule(requestConfiguration));
            HeadlessFragment.install(getSupportFragmentManager(), this.requestComponent);
        } else {
            z = true;
        }
        this.requestComponent.inject(this);
        return z;
    }

    private State restoreState(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(SAVED_STATE)) {
            return null;
        }
        return (State) bundle.getSerializable(SAVED_STATE);
    }

    public void onBackPressed() {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen == null || !currentScreen.hasUnsavedInput()) {
            super.onBackPressed();
        } else {
            new C0147a.C0148a(this).mo1208k(o45.request_dialog_title_unsaved_changes).mo1201e(o45.request_dialog_body_unsaved_changes).setPositiveButton(o45.request_dialog_button_label_delete, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    RequestActivity.super.onBackPressed();
                }
            }).setNegativeButton(o45.request_dialog_button_label_cancel, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo1209l();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(g55.ZendeskActivityDefaultTheme, true);
        setContentView(g45.zs_activity_request);
        BelvedereUi.m75343b(this);
        initViews();
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            Logger.m43081e(LOG_TAG, SdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        RequestConfiguration requestConfiguration = (RequestConfiguration) so0.m75307e(getIntent().getExtras(), RequestConfiguration.class);
        if (requestConfiguration == null) {
            Logger.m43081e(LOG_TAG, "No configuration found. Please use RequestActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.refreshActionHandler = new RefreshRequestActionHandler(requestConfiguration.getRequestId());
        boolean initializeStoreAndDependencies = initializeStoreAndDependencies(bundle, requestConfiguration);
        if (initializeStoreAndDependencies) {
            this.headlessComponentListener.startListening(this.store);
            this.store.dispatch(this.f46876af.installStartConfigAsync(requestConfiguration));
            this.store.dispatch(this.f46876af.loadSettingsAsync());
        }
        this.subscription = bindComponents(initializeStoreAndDependencies);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen == null || !currentScreen.inflateMenu(getMenuInflater(), menu)) {
            return false;
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null) {
            return currentScreen.onOptionsItemClicked(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        Store store2 = this.store;
        if (store2 != null) {
            store2.dispatch(this.f46876af.androidOnPause());
        }
        Subscription subscription2 = this.subscription;
        if (subscription2 != null) {
            subscription2.removeListener();
        }
        ActionHandlerRegistry actionHandlerRegistry2 = this.actionHandlerRegistry;
        if (actionHandlerRegistry2 != null) {
            actionHandlerRegistry2.remove(this.refreshActionHandler);
        }
    }

    public void onResume() {
        super.onResume();
        this.store.dispatch(this.f46876af.androidOnResume());
        this.subscription.addListener();
        this.subscription.informWithCurrentState();
        this.actionHandlerRegistry.add(this.refreshActionHandler);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable(SAVED_STATE, this.store.getState());
        super.onSaveInstanceState(bundle);
    }
}
