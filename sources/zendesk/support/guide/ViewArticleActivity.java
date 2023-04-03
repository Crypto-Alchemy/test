package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.zendesk.logger.Logger;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.OkHttpClient;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.messaging.Engine;
import zendesk.messaging.MessagingActivity;
import zendesk.support.Article;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.AttachmentType;
import zendesk.support.HelpCenterAttachment;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettings;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.guide.ArticleConfiguration;

public class ViewArticleActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private static final String ARTICLE_DETAIL_FORMAT_STRING = "%s %s <span dir=\"auto\">%s</span>";
    private static final String CSS_FILE = "file:///android_asset/help_center_article_style.css";
    private static final long FETCH_ATTACHMENTS_DELAY_MILLIS = 250;
    public static final String LOG_TAG = "ViewArticleActivity";
    private static final Integer NETWORK_AWARE_ID = 57564;
    private static final String TYPE_TEXT_HTML = "text/html";
    private static final String UTF_8_ENCODING_TYPE = "UTF-8";
    public ActionHandlerRegistry actionHandlerRegistry;
    /* access modifiers changed from: private */
    public ArticleAttachmentAdapter adapter;
    public ApplicationConfiguration applicationConfiguration;
    /* access modifiers changed from: private */
    public ArticleViewModel article;
    private WebView articleContentWebView;
    /* access modifiers changed from: private */
    public Long articleId;
    public ArticleVoteStorage articleVoteStorage;
    /* access modifiers changed from: private */
    public ArticleVotingView articleVotingView;
    /* access modifiers changed from: private */
    public ListView attachmentListView;
    private sk5<List<HelpCenterAttachment>> attachmentRequestCallback;
    /* access modifiers changed from: private */
    public ArticleConfiguration config;
    public ro0 configurationHelper;
    /* access modifiers changed from: private */
    public CoordinatorLayout coordinatorLayout;
    private List<Engine> engines;
    private final Handler handler = new Handler();
    public HelpCenterProvider helpCenterProvider;
    private final NetworkAware networkConnectionCallbacks = new NetworkAware() {
        public boolean connected = true;

        public void onNetworkAvailable() {
            if (NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this)) {
                ViewArticleActivity.this.dimissSnackBar();
                this.connected = true;
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        public void onNetworkUnavailable() {
            if (!NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this) && this.connected) {
                this.connected = false;
                ViewArticleActivity.this.dimissSnackBar();
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                Snackbar unused = viewArticleActivity.snackbar = Snackbar.m35952a0(viewArticleActivity.coordinatorLayout, n45.zg_general_no_connection_message, -2);
                ViewArticleActivity.this.snackbar.mo33494Q();
            }
        }
    };
    public NetworkInfoProvider networkInfoProvider;
    public OkHttpClient okHttpClient;
    private ProgressBar progressView;
    private final AggregatedCallback<HelpCenterSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    public HelpCenterSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public Snackbar snackbar;

    /* renamed from: zendesk.support.guide.ViewArticleActivity$8 */
    public static /* synthetic */ class C100638 {

        /* renamed from: $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState */
        public static final /* synthetic */ int[] f46844x84719a3e;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                zendesk.support.guide.ViewArticleActivity$LoadingState[] r0 = zendesk.support.guide.ViewArticleActivity.LoadingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46844x84719a3e = r0
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.LOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46844x84719a3e     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.DISPLAYING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46844x84719a3e     // Catch:{ NoSuchFieldError -> 0x0028 }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.ERRORED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46844x84719a3e     // Catch:{ NoSuchFieldError -> 0x0033 }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.ERRORED_ATTACHMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.ViewArticleActivity.C100638.<clinit>():void");
        }
    }

    public static class ArticleAttachmentAdapter extends ArrayAdapter<HelpCenterAttachment> {
        public ArticleAttachmentAdapter(Context context) {
            super(context, f45.zs_row_article_attachment);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            ArticleAttachmentRow articleAttachmentRow;
            if (view instanceof ArticleAttachmentRow) {
                articleAttachmentRow = (ArticleAttachmentRow) view;
            } else {
                articleAttachmentRow = new ArticleAttachmentRow(getContext());
            }
            articleAttachmentRow.bind((HelpCenterAttachment) getItem(i));
            return articleAttachmentRow;
        }
    }

    public static class ArticleAttachmentRow extends RelativeLayout {
        private final TextView fileName = ((TextView) findViewById(k35.article_attachment_row_filename_text));
        private final TextView fileSize = ((TextView) findViewById(k35.article_attachment_row_filesize_text));

        public ArticleAttachmentRow(Context context) {
            super(context);
            View.inflate(context, f45.zs_row_article_attachment, this);
        }

        public void bind(HelpCenterAttachment helpCenterAttachment) {
            this.fileName.setText(helpCenterAttachment.getFileName());
            this.fileSize.setText(f12.m44132b(helpCenterAttachment.getSize()));
        }
    }

    public class AttachmentRequestCallback extends op7<List<HelpCenterAttachment>> {
        public AttachmentRequestCallback() {
        }

        public void onError(hr1 hr1) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED_ATTACHMENT);
            Logger.m43079c(ViewArticleActivity.LOG_TAG, hr1);
        }

        public void onSuccess(List<HelpCenterAttachment> list) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.adapter.addAll(list);
            ViewArticleActivity.setListViewHeightBasedOnChildren(ViewArticleActivity.this.attachmentListView);
            ViewArticleActivity.this.setLoadingState(LoadingState.DISPLAYING);
        }
    }

    public enum LoadingState {
        LOADING,
        DISPLAYING,
        ERRORED,
        ERRORED_ATTACHMENT
    }

    /* access modifiers changed from: private */
    public void applyVoteButtonSettings() {
        loadSettings(new op7<HelpCenterSettings>() {
            public void onError(hr1 hr1) {
                ViewArticleActivity.this.articleVotingView.setVisibility(8);
            }

            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (helpCenterSettings.isArticleVotingEnabled()) {
                    ViewArticleActivity.this.articleVotingView.setVisibility(0);
                } else {
                    ViewArticleActivity.this.articleVotingView.setVisibility(8);
                }
            }
        });
    }

    public static ArticleConfiguration.Builder builder(Article article2) {
        return new ArticleConfiguration.Builder(article2);
    }

    /* access modifiers changed from: private */
    public void dimissSnackBar() {
        Snackbar snackbar2 = this.snackbar;
        if (snackbar2 != null) {
            snackbar2.mo33505v();
            this.snackbar = null;
        }
    }

    /* access modifiers changed from: private */
    public void fetchArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getArticle(Long.valueOf(j), new op7<Article>() {
            public void onError(hr1 hr1) {
                ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED);
            }

            public void onSuccess(Article article) {
                ArticleViewModel unused = ViewArticleActivity.this.article = new ArticleViewModel(article);
                ViewArticleActivity.this.loadArticleBody();
            }
        });
    }

    /* access modifiers changed from: private */
    public void fetchAttachmentsForArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getAttachments(Long.valueOf(j), AttachmentType.BLOCK, this.attachmentRequestCallback);
    }

    private ActionBar initToolbar() {
        findViewById(k35.view_article_compat_shadow).setVisibility(8);
        setSupportActionBar((Toolbar) findViewById(k35.view_article_toolbar));
        return getSupportActionBar();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public void loadArticleBody() {
        String str;
        setTitle(getString(n45.zs_view_article_loaded_accessibility, new Object[]{this.article.getTitle()}));
        setLoadingState(LoadingState.DISPLAYING);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo971x(k37.m75277a(this.article.getTitle()));
        }
        String str2 = null;
        String authorName = this.article.getAuthorName();
        if (this.article.getCreatedAt() != null) {
            str2 = DateFormat.getDateInstance(1, qo0.m25803a(getResources().getConfiguration()).mo26464c(0)).format(this.article.getCreatedAt());
        }
        if (str2 == null || authorName == null) {
            str = "";
        } else {
            str = String.format(Locale.US, ARTICLE_DETAIL_FORMAT_STRING, new Object[]{authorName, getString(n45.view_article_seperator), str2});
        }
        this.articleContentWebView.loadDataWithBaseURL(this.applicationConfiguration.getZendeskUrl(), getString(n45.view_article_html_body, new Object[]{CSS_FILE, this.article.getTitle(), this.article.getBody(), str}), TYPE_TEXT_HTML, UTF_8_ENCODING_TYPE, (String) null);
        this.handler.postDelayed(new Runnable() {
            public void run() {
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.fetchAttachmentsForArticle(viewArticleActivity.article.getId());
                ViewArticleActivity.this.applyVoteButtonSettings();
            }
        }, FETCH_ATTACHMENTS_DELAY_MILLIS);
    }

    private void loadSettings(op7<HelpCenterSettings> op7) {
        if (this.settingsAggregatedCallback.add(op7)) {
            this.settingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    /* access modifiers changed from: private */
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter2 = listView.getAdapter();
        if (adapter2 != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
            View view = null;
            int i = 0;
            for (int i2 = 0; i2 < adapter2.getCount(); i2++) {
                view = adapter2.getView(i2, view, listView);
                if (i2 == 0) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(makeMeasureSpec, -2));
                }
                view.measure(makeMeasureSpec, 0);
                i += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * (adapter2.getCount() - 1));
            listView.setLayoutParams(layoutParams);
            listView.requestLayout();
        }
    }

    private void setupRequestInterceptor() {
        WebView webView = this.articleContentWebView;
        if (webView == null) {
            Logger.m43087k(LOG_TAG, "The webview is null. Make sure you initialise it before trying to add the interceptor", new Object[0]);
        } else {
            webView.setWebViewClient(new WebViewClient() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.String} */
                /* JADX WARNING: type inference failed for: r0v8, types: [java.io.InputStream] */
                /* JADX WARNING: type inference failed for: r0v14 */
                /* JADX WARNING: type inference failed for: r0v21 */
                /* JADX WARNING: Multi-variable type inference failed */
                /* JADX WARNING: Unknown variable types count: 1 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r9, java.lang.String r10) {
                    /*
                        r8 = this;
                        zendesk.support.guide.ViewArticleActivity r0 = zendesk.support.guide.ViewArticleActivity.this
                        zendesk.core.ApplicationConfiguration r0 = r0.applicationConfiguration
                        java.lang.String r0 = r0.getZendeskUrl()
                        boolean r1 = p000.kb6.m46951d(r0)
                        java.lang.String r2 = "ViewArticleActivity"
                        r3 = 0
                        if (r1 != 0) goto L_0x00c7
                        boolean r0 = r10.startsWith(r0)
                        if (r0 != 0) goto L_0x0019
                        goto L_0x00c7
                    L_0x0019:
                        zendesk.core.Zendesk r0 = zendesk.core.Zendesk.INSTANCE
                        zendesk.core.Identity r0 = r0.getIdentity()
                        boolean r1 = zendesk.core.UrlHelper.isGuideRequest(r10)
                        if (r1 == 0) goto L_0x0035
                        boolean r0 = r0 instanceof zendesk.core.AnonymousIdentity
                        if (r0 == 0) goto L_0x0035
                        java.lang.Object[] r0 = new java.lang.Object[r3]
                        java.lang.String r1 = "Will not intercept request because it is anonymous guide request"
                        com.zendesk.logger.Logger.m43087k(r2, r1, r0)
                        android.webkit.WebResourceResponse r9 = super.shouldInterceptRequest(r9, r10)
                        return r9
                    L_0x0035:
                        r9 = 0
                        okhttp3.Request$Builder r0 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x00b7 }
                        r0.<init>()     // Catch:{ Exception -> 0x00b7 }
                        okhttp3.Request$Builder r10 = r0.url((java.lang.String) r10)     // Catch:{ Exception -> 0x00b7 }
                        okhttp3.Request r10 = r10.build()     // Catch:{ Exception -> 0x00b7 }
                        zendesk.support.guide.ViewArticleActivity r0 = zendesk.support.guide.ViewArticleActivity.this     // Catch:{ Exception -> 0x00b7 }
                        okhttp3.OkHttpClient r0 = r0.okHttpClient     // Catch:{ Exception -> 0x00b7 }
                        okhttp3.Call r10 = r0.newCall(r10)     // Catch:{ Exception -> 0x00b7 }
                        okhttp3.Response r10 = r10.execute()     // Catch:{ Exception -> 0x00b7 }
                        if (r10 == 0) goto L_0x00b2
                        boolean r0 = r10.isSuccessful()     // Catch:{ Exception -> 0x00b7 }
                        if (r0 == 0) goto L_0x00b2
                        okhttp3.ResponseBody r0 = r10.body()     // Catch:{ Exception -> 0x00b7 }
                        if (r0 == 0) goto L_0x00b2
                        okhttp3.ResponseBody r0 = r10.body()     // Catch:{ Exception -> 0x00b7 }
                        java.io.InputStream r0 = r0.byteStream()     // Catch:{ Exception -> 0x00b7 }
                        okhttp3.ResponseBody r10 = r10.body()     // Catch:{ Exception -> 0x00af }
                        okhttp3.MediaType r10 = r10.contentType()     // Catch:{ Exception -> 0x00af }
                        if (r10 == 0) goto L_0x00ab
                        java.lang.String r1 = r10.type()     // Catch:{ Exception -> 0x00af }
                        boolean r1 = p000.kb6.m46949b(r1)     // Catch:{ Exception -> 0x00af }
                        if (r1 == 0) goto L_0x009c
                        java.lang.String r1 = r10.subtype()     // Catch:{ Exception -> 0x00af }
                        boolean r1 = p000.kb6.m46949b(r1)     // Catch:{ Exception -> 0x00af }
                        if (r1 == 0) goto L_0x009c
                        java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x00af }
                        java.lang.String r4 = "%s/%s"
                        r5 = 2
                        java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00af }
                        java.lang.String r6 = r10.type()     // Catch:{ Exception -> 0x00af }
                        r5[r3] = r6     // Catch:{ Exception -> 0x00af }
                        r6 = 1
                        java.lang.String r7 = r10.subtype()     // Catch:{ Exception -> 0x00af }
                        r5[r6] = r7     // Catch:{ Exception -> 0x00af }
                        java.lang.String r1 = java.lang.String.format(r1, r4, r5)     // Catch:{ Exception -> 0x00af }
                        goto L_0x009d
                    L_0x009c:
                        r1 = r9
                    L_0x009d:
                        java.nio.charset.Charset r10 = r10.charset()     // Catch:{ Exception -> 0x00a9 }
                        if (r10 == 0) goto L_0x00a7
                        java.lang.String r9 = r10.name()     // Catch:{ Exception -> 0x00a9 }
                    L_0x00a7:
                        r10 = r9
                        goto L_0x00ad
                    L_0x00a9:
                        r10 = move-exception
                        goto L_0x00ba
                    L_0x00ab:
                        r10 = r9
                        r1 = r10
                    L_0x00ad:
                        r9 = r0
                        goto L_0x00b4
                    L_0x00af:
                        r10 = move-exception
                        r1 = r9
                        goto L_0x00ba
                    L_0x00b2:
                        r10 = r9
                        r1 = r10
                    L_0x00b4:
                        r0 = r9
                        r9 = r10
                        goto L_0x00c1
                    L_0x00b7:
                        r10 = move-exception
                        r0 = r9
                        r1 = r0
                    L_0x00ba:
                        java.lang.Object[] r3 = new java.lang.Object[r3]
                        java.lang.String r4 = "Exception encountered when trying to intercept request"
                        com.zendesk.logger.Logger.m43080d(r2, r4, r10, r3)
                    L_0x00c1:
                        android.webkit.WebResourceResponse r10 = new android.webkit.WebResourceResponse
                        r10.<init>(r1, r9, r0)
                        return r10
                    L_0x00c7:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Will not intercept request because the url is not hosted by Zendesk"
                        r0.append(r1)
                        r0.append(r10)
                        java.lang.String r0 = r0.toString()
                        java.lang.Object[] r1 = new java.lang.Object[r3]
                        com.zendesk.logger.Logger.m43087k(r2, r0, r1)
                        android.webkit.WebResourceResponse r9 = super.shouldInterceptRequest(r9, r10)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.ViewArticleActivity.C100572.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    ActionHandler handlerByAction = ViewArticleActivity.this.actionHandlerRegistry.handlerByAction(str);
                    if (handlerByAction != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(ViewArticleActionHandler.HELP_CENTER_VIEW_ARTICLE, str);
                        ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                        viewArticleActivity.configurationHelper.mo67438d(hashMap, viewArticleActivity.config);
                        handlerByAction.handle(hashMap, ViewArticleActivity.this);
                        return true;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    if (intent.resolveActivity(webView.getContext().getPackageManager()) != null) {
                        webView.getContext().startActivity(intent);
                        return true;
                    }
                    Logger.m43078b(ViewArticleActivity.LOG_TAG, "No browser available to open url: " + str, new Object[0]);
                    return false;
                }
            });
        }
    }

    private boolean shouldShowContactUsButton() {
        boolean z;
        if (this.actionHandlerRegistry.handlerByAction("action_contact_option") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean i = kj0.m47118i(this.engines);
        if (!this.config.isContactUsButtonVisible() || (!z && !i)) {
            return false;
        }
        return true;
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

    @SuppressLint({"SetJavaScriptEnabled", "RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(f55.ZendeskActivityDefaultTheme, true);
        setContentView(f45.zs_activity_view_article);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (!guideSdkDependencyProvider.isInitialized()) {
            Logger.m43081e(LOG_TAG, GuideSdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
        ActionBar initToolbar = initToolbar();
        ArticleConfiguration articleConfiguration = (ArticleConfiguration) this.configurationHelper.mo67440f(getIntent().getExtras(), ArticleConfiguration.class);
        this.config = articleConfiguration;
        if (articleConfiguration == null || articleConfiguration.getConfigurationState() == -1) {
            Logger.m43081e(LOG_TAG, "No configuration found. Please use ViewArticleActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.engines = this.config.getEngines();
        this.attachmentListView = (ListView) findViewById(k35.view_article_attachment_list);
        ArticleAttachmentAdapter articleAttachmentAdapter = new ArticleAttachmentAdapter(this);
        this.adapter = articleAttachmentAdapter;
        this.attachmentListView.setAdapter(articleAttachmentAdapter);
        this.attachmentListView.setOnItemClickListener(this);
        if (initToolbar != null) {
            initToolbar.mo967t(true);
        }
        WebView webView = (WebView) findViewById(k35.view_article_content_webview);
        this.articleContentWebView = webView;
        webView.setWebChromeClient(new WebChromeClient());
        this.articleContentWebView.getSettings().setJavaScriptEnabled(true);
        setupRequestInterceptor();
        this.articleContentWebView.getSettings().setMixedContentMode(0);
        this.progressView = (ProgressBar) findViewById(k35.view_article_progress);
        this.coordinatorLayout = (CoordinatorLayout) findViewById(k35.view_article_attachment_coordinator);
        if (this.config.getConfigurationState() == 2) {
            ArticleViewModel article2 = this.config.getArticle();
            this.article = article2;
            if (article2 != null) {
                this.articleId = Long.valueOf(article2.getId());
            }
            loadArticleBody();
        } else {
            fetchArticle(this.config.getArticleId());
            this.articleId = Long.valueOf(this.config.getArticleId());
        }
        if (shouldShowContactUsButton()) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(k35.contact_us_button);
            floatingActionButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ViewArticleActivity.this.showContactZendesk();
                }
            });
            floatingActionButton.setVisibility(0);
        }
        ArticleVotingView articleVotingView2 = (ArticleVotingView) findViewById(k35.article_voting_container);
        this.articleVotingView = articleVotingView2;
        articleVotingView2.bindTo(this.articleId, this.articleVoteStorage, this.helpCenterProvider);
        this.articleVotingView.setVisibility(8);
        applyVoteButtonSettings();
    }

    public void onDestroy() {
        super.onDestroy();
        this.settingsAggregatedCallback.cancel();
        WebView webView = this.articleContentWebView;
        if (webView != null) {
            webView.destroy();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (itemAtPosition instanceof HelpCenterAttachment) {
            HelpCenterAttachment helpCenterAttachment = (HelpCenterAttachment) itemAtPosition;
            if (helpCenterAttachment.getContentUrl() != null) {
                Uri parse = Uri.parse(helpCenterAttachment.getContentUrl());
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(parse);
                startActivity(intent);
                return;
            }
            Logger.m43087k(LOG_TAG, "Unable to launch viewer, unable to parse URI for attachment", new Object[0]);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onStart() {
        super.onStart();
        this.attachmentRequestCallback = sk5.m51823a(new AttachmentRequestCallback());
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this.networkConnectionCallbacks);
        this.networkInfoProvider.register();
    }

    public void onStop() {
        super.onStop();
        sk5<List<HelpCenterAttachment>> sk5 = this.attachmentRequestCallback;
        if (sk5 != null) {
            sk5.cancel();
            this.attachmentRequestCallback = null;
        }
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.unregister();
    }

    public void setLoadingState(LoadingState loadingState) {
        if (loadingState == null) {
            Logger.m43087k(LOG_TAG, "LoadingState was null, nothing to do", new Object[0]);
            return;
        }
        int i = C100638.f46844x84719a3e[loadingState.ordinal()];
        if (i == 1) {
            k37.m75280d(this.progressView, 0);
            k37.m75280d(this.attachmentListView, 8);
        } else if (i == 2) {
            k37.m75280d(this.progressView, 8);
            k37.m75280d(this.attachmentListView, 0);
        } else if (i == 3) {
            showLoadingErrorState(n45.zs_view_article_error);
        } else if (i == 4) {
            showLoadingErrorState(n45.view_article_attachments_error);
        }
    }

    public void showContactZendesk() {
        HashMap hashMap = new HashMap();
        this.configurationHelper.mo67438d(hashMap, this.config);
        if (kj0.m47118i(this.engines)) {
            MessagingActivity.builder().withEngines(this.engines).show(this, this.config.getConfigurations());
        } else {
            showCreateRequest(hashMap);
        }
    }

    public void showLoadingErrorState(int i) {
        k37.m75280d(this.progressView, 8);
        k37.m75280d(this.attachmentListView, 8);
        dimissSnackBar();
        Snackbar d0 = Snackbar.m35952a0(this.coordinatorLayout, i, -2).mo33552d0(n45.zui_retry_button_label, new View.OnClickListener() {
            public void onClick(View view) {
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
                ViewArticleActivity.this.dimissSnackBar();
            }
        });
        this.snackbar = d0;
        d0.mo33494Q();
    }

    public static ArticleConfiguration.Builder builder(long j) {
        return new ArticleConfiguration.Builder(j);
    }

    public static ArticleConfiguration.Builder builder() {
        return new ArticleConfiguration.Builder();
    }
}
