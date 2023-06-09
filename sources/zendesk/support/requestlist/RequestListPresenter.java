package zendesk.support.requestlist;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.List;
import zendesk.support.SupportSdkSettings;
import zendesk.support.request.RequestActivity;
import zendesk.support.requestlist.RequestListView;

class RequestListPresenter {
    private final CancelableCompositeCallback callbacks = new CancelableCompositeCallback();
    /* access modifiers changed from: private */
    public final RequestListModel model;
    /* access modifiers changed from: private */
    public RequestListView view;

    public interface SettingsCallback {
        void onSettings(SupportSdkSettings supportSdkSettings);
    }

    public RequestListPresenter(RequestListModel requestListModel) {
        this.model = requestListModel;
    }

    private void fetchSettingsFromNetwork(final SettingsCallback settingsCallback) {
        sk5 a = sk5.m51823a(new op7<SupportSdkSettings>() {
            public void onError(hr1 hr1) {
                settingsCallback.onSettings((SupportSdkSettings) null);
                if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }

            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                RequestListPresenter.this.model.cacheSupportSdkSettings(supportSdkSettings);
                settingsCallback.onSettings(supportSdkSettings);
            }
        });
        this.callbacks.add(a);
        this.view.setLoading(true);
        this.model.loadSettings(a);
    }

    private void loadSettings(SettingsCallback settingsCallback) {
        SupportSdkSettings cachedSettings = this.model.getCachedSettings();
        if (cachedSettings == null) {
            fetchSettingsFromNetwork(settingsCallback);
        } else {
            settingsCallback.onSettings(cachedSettings);
        }
    }

    private void setupCreateTicketClickListener() {
        this.view.setCreateRequestListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestListPresenter.this.view.startRequestActivity(RequestActivity.builder());
            }
        });
    }

    private void setupErrorClickListener() {
        this.view.setRetryClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestListPresenter.this.refresh();
            }
        });
    }

    private void setupItemClickListener() {
        this.view.setItemClickListener(new RequestListView.OnItemClick() {
            public void onClick(RequestListItem requestListItem) {
                RequestListPresenter.this.view.startRequestActivity(requestListItem.configure(RequestActivity.builder()));
            }
        });
    }

    /* access modifiers changed from: private */
    public void setupLogoView(final RequestListView requestListView, boolean z, final String str) {
        requestListView.setLogoClickListener(z, new View.OnClickListener() {
            public void onClick(View view) {
                requestListView.startReferrerPage(str);
            }
        });
    }

    private void setupNavigationClickListener() {
        this.view.setBackClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestListPresenter.this.view.finish();
            }
        });
    }

    private void setupPullToRefreshListener() {
        this.view.setSwipeRefreshListener(new SwipeRefreshLayout.C1408j() {
            public void onRefresh() {
                RequestListPresenter.this.refresh();
            }
        });
    }

    public void loadItems(boolean z, SupportSdkSettings supportSdkSettings) {
        C101573 r0 = new op7<List<RequestListItem>>() {
            public void onError(hr1 hr1) {
                RequestListPresenter.this.showError(hr1);
            }

            public void onSuccess(List<RequestListItem> list) {
                RequestListPresenter.this.showRequestList(list);
            }
        };
        this.callbacks.add(sk5.m51823a(r0));
        this.view.setLoading(true);
        this.model.loadItems(z, supportSdkSettings, r0);
    }

    public void onCreate(final boolean z, RequestListView requestListView) {
        this.view = requestListView;
        setupItemClickListener();
        setupPullToRefreshListener();
        setupNavigationClickListener();
        setupErrorClickListener();
        setupCreateTicketClickListener();
        loadSettings(new SettingsCallback() {
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings != null && supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter requestListPresenter = RequestListPresenter.this;
                    requestListPresenter.setupLogoView(requestListPresenter.view, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl());
                    RequestListPresenter.this.loadItems(z, supportSdkSettings);
                    if (z) {
                        RequestListPresenter.this.model.trackRequestListViewed();
                    }
                } else if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }
        });
    }

    public void onDestroy(boolean z) {
        if (!z) {
            this.model.cleanup();
        }
        this.view = null;
        this.callbacks.cancel();
    }

    public void refresh() {
        loadSettings(new SettingsCallback() {
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings != null && supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter.this.loadItems(true, supportSdkSettings);
                } else if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }
        });
    }

    public void showError(hr1 hr1) {
        RequestListView requestListView = this.view;
        if (requestListView != null) {
            requestListView.setLoading(false);
            this.view.showErrorMessage();
        }
    }

    public void showRequestList(List<RequestListItem> list) {
        RequestListView requestListView = this.view;
        if (requestListView != null) {
            requestListView.showRequestList(list);
            this.view.setLoading(false);
        }
    }
}
