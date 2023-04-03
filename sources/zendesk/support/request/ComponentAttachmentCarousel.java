package zendesk.support.request;

import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import zendesk.belvedere.C9802b;
import zendesk.belvedere.MediaResult;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

class ComponentAttachmentCarousel implements C9802b.C9804b, Listener<AttachmentCarouselModel>, RequestViewConversationsDisabled.MenuItemsDelegate {
    private final ActionFactory actionFactory;
    private final AppCompatActivity activity;
    private MenuItem attachmentButton;
    private final AttachmentHelper attachmentHelper;
    private boolean attachmentSupportEnabled = false;
    private final Dispatcher dispatcher;
    private final C9802b imageStream;
    private final RecyclerView recyclerView;
    /* access modifiers changed from: private */
    public final ScrollView scrollView;
    private final StateSelector<AttachmentCarouselModel> selector;

    public static class AttachmentCarouselModel {
        private final Collection<StateRequestAttachment> additionalAttachments;
        private final boolean isAttachmentSupportEnabled;
        private final boolean isLoading;
        private final long maxAttachmentSize;
        private final Collection<StateRequestAttachment> selectedAttachments;

        public AttachmentCarouselModel(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2, boolean z, boolean z2, long j) {
            this.selectedAttachments = collection;
            this.additionalAttachments = collection2;
            this.isLoading = z;
            this.isAttachmentSupportEnabled = z2;
            this.maxAttachmentSize = j;
        }

        public Collection<StateRequestAttachment> getAdditionalAttachments() {
            return this.additionalAttachments;
        }

        public long getMaxAttachmentSize() {
            return this.maxAttachmentSize;
        }

        public Collection<StateRequestAttachment> getSelectedAttachments() {
            return this.selectedAttachments;
        }

        public boolean isAttachmentSupportEnabled() {
            return this.isAttachmentSupportEnabled;
        }

        public boolean isLoading() {
            return this.isLoading;
        }
    }

    public static class AttachmentCarouselSelector implements StateSelector<AttachmentCarouselModel> {
        public AttachmentCarouselModel selectData(State state) {
            StateAttachments fromState = StateAttachments.fromState(state);
            StateConfig fromState2 = StateConfig.fromState(state);
            return new AttachmentCarouselModel(fromState.getSelectedAttachments(), fromState.getAllSelectedAttachments(), StateProgress.fomState(state).getRunningRequests() > 0, fromState2.getSettings().isAttachmentsEnabled(), fromState2.getSettings().getMaxAttachmentSize());
        }
    }

    public ComponentAttachmentCarousel(Dispatcher dispatcher2, ActionFactory actionFactory2, C9802b bVar, AppCompatActivity appCompatActivity, AttachmentHelper attachmentHelper2, RecyclerView recyclerView2) {
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.imageStream = bVar;
        this.activity = appCompatActivity;
        this.attachmentHelper = attachmentHelper2;
        this.recyclerView = recyclerView2;
        this.scrollView = (ScrollView) appCompatActivity.findViewById(l35.request_conversations_disabled_scrollview);
        this.selector = new AttachmentCarouselSelector();
        initImagePicker();
    }

    private void attachmentButtonVisibility(boolean z, boolean z2) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            menuItem.setVisible(z);
            this.attachmentButton.getActionView().setEnabled(z2);
        }
    }

    private void attachmentCount(int i) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            ((ViewCellAttachmentMenuItem) menuItem.getActionView()).setBadgeCount(i);
        }
    }

    private void initImagePicker() {
        this.imageStream.mo73731i(this);
        if (this.imageStream.mo73734l().getInputTrap().hasFocus()) {
            this.scrollView.requestFocus();
        }
        if (this.imageStream.mo73745w()) {
            this.scrollView.post(new Runnable() {
                public void run() {
                    ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void onAddAttachmentsRequested(boolean z) {
        if (!this.imageStream.mo73736n()) {
            this.attachmentHelper.showImagePicker(this.activity);
        } else if (z) {
            this.imageStream.mo73733k();
        }
    }

    private void scroll(final int i) {
        this.scrollView.post(new Runnable() {
            public void run() {
                ComponentAttachmentCarousel.this.scrollView.fullScroll(i);
            }
        });
    }

    public StateSelector<AttachmentCarouselModel> getSelector() {
        return this.selector;
    }

    public void onDismissed() {
        this.scrollView.requestFocus();
        scroll(33);
    }

    public void onMediaDeselected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.deselectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    public void onMediaSelected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.selectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    public void onMenuItemsClicked(MenuItem menuItem) {
    }

    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.attachmentButton = menuItem2;
        menuItem2.getActionView().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
            }
        });
        attachmentButtonVisibility(this.attachmentSupportEnabled, true);
    }

    public void onVisible() {
        scroll(130);
    }

    public void update(AttachmentCarouselModel attachmentCarouselModel) {
        boolean isAttachmentSupportEnabled = attachmentCarouselModel.isAttachmentSupportEnabled();
        this.attachmentSupportEnabled = isAttachmentSupportEnabled;
        attachmentButtonVisibility(isAttachmentSupportEnabled, !attachmentCarouselModel.isLoading());
        if (!attachmentCarouselModel.isLoading()) {
            this.attachmentHelper.updateAttachments(attachmentCarouselModel.getSelectedAttachments(), attachmentCarouselModel.getAdditionalAttachments());
            this.attachmentHelper.updateMaxFileSize(attachmentCarouselModel.getMaxAttachmentSize());
            attachmentCount(this.attachmentHelper.getSelectedAttachments().size());
            if (this.attachmentHelper.getSelectedAttachments().size() > 0) {
                scroll(130);
            } else {
                scroll(33);
            }
            this.recyclerView.getAdapter().notifyDataSetChanged();
        }
    }
}
