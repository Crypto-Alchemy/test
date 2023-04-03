package zendesk.support.guide;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.zendesk.logger.Logger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.messaging.Engine;
import zendesk.messaging.MessagingActivity;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.SearchArticle;
import zendesk.support.guide.HelpCenterConfiguration;

public class HelpCenterActivity extends AppCompatActivity implements HelpCenterMvp$View {
    public static final String LOG_TAG = "HelpCenterActivity";
    public ActionHandlerRegistry actionHandlerRegistry;
    public ro0 configurationHelper;
    private FloatingActionButton contactUsButton;
    private MenuItem conversationsMenuItem;
    private List<Engine> engines;
    /* access modifiers changed from: private */
    public Snackbar errorSnackbar;
    private HelpCenterConfiguration helpCenterConfiguration;
    public HelpCenterProvider helpCenterProvider;
    private View loadingView;
    public NetworkInfoProvider networkInfoProvider;
    /* access modifiers changed from: private */
    public HelpCenterMvp$Presenter presenter;
    private MenuItem searchViewMenuItem;
    public HelpCenterSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public SnackbarStatus snackbarStatus = SnackbarStatus.NONE;

    /* renamed from: zendesk.support.guide.HelpCenterActivity$5 */
    public static /* synthetic */ class C100335 {
        public static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                zendesk.support.guide.HelpCenterMvp$ErrorType[] r0 = zendesk.support.guide.HelpCenterMvp$ErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType = r0
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp$ErrorType.CATEGORY_LOAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp$ErrorType.SECTION_LOAD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x0028 }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp$ErrorType.ARTICLES_LOAD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.HelpCenterActivity.C100335.<clinit>():void");
        }
    }

    public enum SnackbarStatus {
        NO_CONNECTION,
        NONE,
        CONTENT_ERROR
    }

    private void addFragment(Fragment fragment) {
        getSupportFragmentManager().mo5996q().mo6262c(k35.fragment_container, fragment, fragment.getClass().getSimpleName()).mo6139j();
    }

    private void addOnBackStackChangedListener() {
        getSupportFragmentManager().mo5983l(new FragmentManager.C0643l() {
            public void onBackStackChanged() {
                if (HelpCenterActivity.this.getCurrentFragment().isHidden()) {
                    HelpCenterActivity.this.getSupportFragmentManager().mo5996q().mo6149x(HelpCenterActivity.this.getCurrentFragment()).mo6139j();
                    if (HelpCenterActivity.this.getCurrentFragment() instanceof HelpCenterFragment) {
                        ((HelpCenterFragment) HelpCenterActivity.this.getCurrentFragment()).setPresenter(HelpCenterActivity.this.presenter);
                    }
                }
            }
        });
    }

    public static HelpCenterConfiguration.Builder builder() {
        return new HelpCenterConfiguration.Builder();
    }

    /* access modifiers changed from: private */
    public Fragment getCurrentFragment() {
        return getSupportFragmentManager().mo5981k0(k35.fragment_container);
    }

    private HelpSearchFragment getSearchFragment() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            Logger.m43078b(LOG_TAG, "showSearchResults: current fragment is a HelpSearchFragment", new Object[0]);
            return (HelpSearchFragment) getCurrentFragment();
        }
        HelpSearchFragment newInstance = HelpSearchFragment.newInstance(this.helpCenterConfiguration, this.helpCenterProvider);
        getSupportFragmentManager().mo5996q().mo6270s(k35.fragment_container, newInstance).mo6267h((String) null).mo6139j();
        return newInstance;
    }

    private ActionBar initToolbar() {
        findViewById(k35.support_compat_shadow).setVisibility(8);
        setSupportActionBar((Toolbar) findViewById(k35.support_toolbar));
        return getSupportActionBar();
    }

    private boolean noFragmentAdded() {
        if (getCurrentFragment() == null) {
            return true;
        }
        return false;
    }

    private void showCreateRequest(Map<String, Object> map) {
        String str;
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction("action_contact_option");
        if (handlerByAction != null) {
            ActionDescription actionDescription = handlerByAction.getActionDescription();
            if (actionDescription != null) {
                str = actionDescription.getLocalizedLabel();
            } else {
                str = handlerByAction.getClass().getSimpleName();
            }
            Logger.m43078b(LOG_TAG, "No Deflection ActionHandler Available, opening %s", str);
            handlerByAction.handle(map, this);
        }
    }

    public void announceContentLoaded() {
        this.contactUsButton.announceForAccessibility(getString(n45.zs_help_center_content_loaded_accessibility));
    }

    public void clearSearchResults() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            ((HelpSearchFragment) getCurrentFragment()).clearResults();
        }
    }

    public void dismissError() {
        Snackbar snackbar = this.errorSnackbar;
        if (snackbar != null) {
            snackbar.mo33505v();
        }
        this.snackbarStatus = SnackbarStatus.NONE;
    }

    public void exitActivity() {
        finish();
    }

    public Context getContext() {
        return getApplicationContext();
    }

    public void hideLoadingState() {
        this.loadingView.setVisibility(8);
    }

    public boolean isShowingHelp() {
        return getCurrentFragment() instanceof HelpCenterFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources.Theme theme = getTheme();
        theme.applyStyle(f55.ZendeskActivityDefaultTheme, true);
        theme.applyStyle(f55.ZendeskSupportActivityThemeDefaultIcon, false);
        setContentView(f45.zs_activity_help_center);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (!guideSdkDependencyProvider.isInitialized()) {
            Logger.m43081e(LOG_TAG, GuideSdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
        HelpCenterConfiguration helpCenterConfiguration2 = (HelpCenterConfiguration) this.configurationHelper.mo67440f(getIntent().getExtras(), HelpCenterConfiguration.class);
        this.helpCenterConfiguration = helpCenterConfiguration2;
        if (helpCenterConfiguration2 == null) {
            Logger.m43081e(LOG_TAG, "No configuration found. Please use HelpCenterActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.engines = helpCenterConfiguration2.getEngines();
        initToolbar().mo967t(true);
        this.loadingView = findViewById(k35.loading_view);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(k35.contact_us_button);
        this.contactUsButton = floatingActionButton;
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HelpCenterActivity.this.showContactZendesk();
            }
        });
        HelpCenterPresenter helpCenterPresenter = new HelpCenterPresenter(this, new HelpCenterModel(this.helpCenterProvider, this.settingsProvider), this.networkInfoProvider, this.actionHandlerRegistry);
        this.presenter = helpCenterPresenter;
        helpCenterPresenter.init(this.helpCenterConfiguration, this.engines);
        addOnBackStackChangedListener();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(k45.zs_fragment_help_menu_conversations, menu);
        this.conversationsMenuItem = menu.findItem(k35.fragment_help_menu_contact);
        MenuItem findItem = menu.findItem(k35.fragment_help_menu_search);
        this.searchViewMenuItem = findItem;
        if (findItem == null) {
            return true;
        }
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            this.searchViewMenuItem.setEnabled(false);
        }
        SearchView searchView = (SearchView) this.searchViewMenuItem.getActionView();
        searchView.setImeOptions(searchView.getImeOptions() | SQLiteDatabase.CREATE_IF_NECESSARY);
        searchView.setOnQueryTextListener(new SearchView.C0260m() {
            public boolean onQueryTextChange(String str) {
                return false;
            }

            public boolean onQueryTextSubmit(String str) {
                if (HelpCenterActivity.this.presenter == null) {
                    return false;
                }
                HelpCenterActivity.this.presenter.onSearchSubmit(str);
                return true;
            }
        });
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != k35.fragment_help_menu_contact) {
            return false;
        } else {
            showRequestList();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null) {
            helpCenterMvp$Presenter.onPause();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z;
        MenuItem menuItem;
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (!(helpCenterMvp$Presenter == null || (menuItem = this.searchViewMenuItem) == null)) {
            menuItem.setVisible(helpCenterMvp$Presenter.shouldShowSearchMenuItem());
        }
        if (!(this.presenter == null || this.conversationsMenuItem == null)) {
            boolean z2 = true;
            if (this.actionHandlerRegistry.handlerByAction("action_conversation_list") != null) {
                z = true;
            } else {
                z = false;
            }
            MenuItem menuItem2 = this.conversationsMenuItem;
            if (!this.presenter.shouldShowConversationsMenuItem() || !z) {
                z2 = false;
            }
            menuItem2.setVisible(z2);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume() {
        super.onResume();
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null) {
            helpCenterMvp$Presenter.onResume(this);
        }
    }

    public void onStart() {
        Snackbar snackbar;
        super.onStart();
        if (this.snackbarStatus != SnackbarStatus.NONE && (snackbar = this.errorSnackbar) != null) {
            snackbar.mo33494Q();
        }
    }

    public void setSearchEnabled(boolean z) {
        this.searchViewMenuItem.setEnabled(z);
    }

    public void showContactUsButton() {
        this.contactUsButton.setVisibility(0);
    }

    public void showContactZendesk() {
        HashMap hashMap = new HashMap();
        this.configurationHelper.mo67438d(hashMap, this.helpCenterConfiguration);
        if (kj0.m47118i(this.engines)) {
            MessagingActivity.builder().withEngines(this.engines).show(this, this.helpCenterConfiguration.getConfigurations());
        } else {
            showCreateRequest(hashMap);
        }
    }

    public void showHelp(HelpCenterConfiguration helpCenterConfiguration2) {
        if (noFragmentAdded()) {
            HelpCenterFragment newInstance = HelpCenterFragment.newInstance(helpCenterConfiguration2);
            newInstance.setPresenter(this.presenter);
            addFragment(newInstance);
        } else if (getCurrentFragment() instanceof HelpCenterFragment) {
            ((HelpCenterFragment) getCurrentFragment()).setPresenter(this.presenter);
        }
        invalidateOptionsMenu();
    }

    public void showLoadArticleErrorWithRetry(HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, final RetryAction retryAction) {
        String str;
        if (helpCenterMvp$ErrorType == null) {
            Logger.m43087k(LOG_TAG, "ErrorType was null, falling back to 'retry' as label", new Object[0]);
            str = getString(n45.zui_retry_button_label);
        } else {
            int i = C100335.$SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[helpCenterMvp$ErrorType.ordinal()];
            if (i == 1) {
                str = getString(n45.support_categories_list_fragment_error_message);
            } else if (i == 2) {
                str = getString(n45.support_sections_list_fragment_error_message);
            } else if (i != 3) {
                Logger.m43087k(LOG_TAG, "Unknown or unhandled error type, falling back to error type name as label", new Object[0]);
                str = getString(n45.support_help_search_no_results_label) + " " + helpCenterMvp$ErrorType.name();
            } else {
                str = getString(n45.support_articles_list_fragment_error_message);
            }
        }
        if (this.snackbarStatus == SnackbarStatus.NONE) {
            Snackbar b0 = Snackbar.m35953b0(this.contactUsButton, str, -2);
            this.errorSnackbar = b0;
            b0.mo33552d0(n45.zui_retry_button_label, new View.OnClickListener() {
                public void onClick(View view) {
                    HelpCenterActivity.this.errorSnackbar.mo33505v();
                    SnackbarStatus unused = HelpCenterActivity.this.snackbarStatus = SnackbarStatus.NONE;
                    retryAction.onRetry();
                }
            });
            this.errorSnackbar.mo33494Q();
            this.snackbarStatus = SnackbarStatus.CONTENT_ERROR;
        }
    }

    public void showLoadingState() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && currentFragment.isVisible()) {
            getSupportFragmentManager().mo5996q().mo6145q(getCurrentFragment()).mo6139j();
        }
        this.loadingView.setVisibility(0);
    }

    public void showNoConnectionError() {
        SnackbarStatus snackbarStatus2 = this.snackbarStatus;
        SnackbarStatus snackbarStatus3 = SnackbarStatus.NO_CONNECTION;
        if (snackbarStatus2 != snackbarStatus3) {
            Snackbar a0 = Snackbar.m35952a0(this.contactUsButton, n45.zg_general_no_connection_message, -2);
            this.errorSnackbar = a0;
            a0.mo33494Q();
            this.snackbarStatus = snackbarStatus3;
        }
    }

    public void showRequestList() {
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction("action_conversation_list");
        if (handlerByAction != null) {
            HashMap hashMap = new HashMap();
            this.configurationHelper.mo67438d(hashMap, this.helpCenterConfiguration);
            handlerByAction.handle(hashMap, this);
        }
    }

    public void showSearchResults(List<SearchArticle> list, String str) {
        getSearchFragment().updateResults(list, str);
    }
}
