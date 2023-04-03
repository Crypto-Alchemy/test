package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C9802b;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;

public class RequestViewConversationsDisabled extends FrameLayout implements RequestView {
    private AppCompatActivity activity;

    /* renamed from: af */
    public ActionFactory f46877af;
    private AttachmentHelper attachmentHelper;
    private C9802b imageStream;
    private ComponentInputForm inputFormComponent;
    private List<MenuItemsDelegate> menuItemsDelegates = new ArrayList();
    public Picasso picasso;
    public Store store;
    private Subscription subscription;

    public interface MenuItemsDelegate {
        void onMenuItemsClicked(MenuItem menuItem);

        void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2);
    }

    public RequestViewConversationsDisabled(Context context) {
        super(context);
        viewInit(context);
    }

    private Subscription bindAttachmentCarousel(Store store2, ActionFactory actionFactory) {
        RecyclerView recyclerView = (RecyclerView) this.activity.findViewById(l35.request_attachment_carousel);
        AdapterAttachmentCarousel adapterAttachmentCarousel = new AdapterAttachmentCarousel(this.attachmentHelper, this.picasso, actionFactory, store2);
        ComponentAttachmentCarousel componentAttachmentCarousel = new ComponentAttachmentCarousel(store2, actionFactory, this.imageStream, this.activity, this.attachmentHelper, recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.activity, 0, false));
        recyclerView.setAdapter(adapterAttachmentCarousel);
        this.menuItemsDelegates.add(componentAttachmentCarousel);
        return store2.addListener(componentAttachmentCarousel.getSelector(), componentAttachmentCarousel);
    }

    private Subscription bindComponents(Store store2, ActionFactory actionFactory) {
        return CombinedSubscription.from(bindInput(store2), bindAttachmentCarousel(store2, actionFactory));
    }

    private Subscription bindInput(Store store2) {
        ComponentInputForm create = ComponentInputForm.create(this, store2, this.f46877af, this.attachmentHelper);
        this.inputFormComponent = create;
        this.menuItemsDelegates.add(create);
        this.imageStream.mo73734l().mo73668i(this.inputFormComponent);
        return store2.addListener(this.inputFormComponent.getSelector(), this.inputFormComponent);
    }

    private void viewInit(Context context) {
        View.inflate(context, g45.zs_view_request_conversations_disabled, this);
        this.activity = (AppCompatActivity) context;
    }

    public boolean hasUnsavedInput() {
        ComponentInputForm componentInputForm = this.inputFormComponent;
        if (componentInputForm == null || !componentInputForm.hasUnsavedInput()) {
            return false;
        }
        return true;
    }

    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(j45.zs_view_request_conversations_disabled_menu, menu);
        MenuItem findItem = menu.findItem(l35.request_conversations_disabled_menu_ic_send);
        MenuItem findItem2 = menu.findItem(l35.request_conversations_disabled_menu_ic_add_attachments);
        for (MenuItemsDelegate onMenuItemsInflated : this.menuItemsDelegates) {
            onMenuItemsInflated.onMenuItemsInflated(findItem, findItem2);
        }
        return true;
    }

    public void init(RequestComponent requestComponent) {
        requestComponent.inject(this);
        this.imageStream = BelvedereUi.m75343b(this.activity);
        this.attachmentHelper = new AttachmentHelper(new int[0]);
        Subscription bindComponents = bindComponents(this.store, this.f46877af);
        this.subscription = bindComponents;
        bindComponents.informWithCurrentState();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription2 = this.subscription;
        if (subscription2 != null) {
            subscription2.removeListener();
        }
    }

    public boolean onOptionsItemClicked(MenuItem menuItem) {
        for (MenuItemsDelegate onMenuItemsClicked : this.menuItemsDelegates) {
            onMenuItemsClicked.onMenuItemsClicked(menuItem);
        }
        return true;
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }
}
