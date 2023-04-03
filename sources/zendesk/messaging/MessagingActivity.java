package zendesk.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import java.util.List;
import zendesk.messaging.Banner;
import zendesk.messaging.MessagingConfiguration;
import zendesk.messaging.Update;
import zendesk.messaging.p026ui.InputBox;
import zendesk.messaging.p026ui.MessagingCellFactory;
import zendesk.messaging.p026ui.MessagingComposer;
import zendesk.messaging.p026ui.MessagingState;
import zendesk.messaging.p026ui.MessagingView;

public class MessagingActivity extends AppCompatActivity {
    public EventFactory eventFactory;
    public MessagingCellFactory messagingCellFactory;
    public MessagingComposer messagingComposer;
    public MessagingDialog messagingDialog;
    /* access modifiers changed from: private */
    public MessagingView messagingView;
    public Picasso picasso;
    public MessagingViewModel viewModel;

    public static MessagingConfiguration.Builder builder() {
        return new MessagingConfiguration.Builder();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        MessagingViewModel messagingViewModel = this.viewModel;
        if (messagingViewModel != null) {
            messagingViewModel.onEvent(this.eventFactory.onActivityResult(i, i2, intent));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(R$style.ZendeskActivityDefaultTheme, true);
        MessagingConfiguration messagingConfiguration = (MessagingConfiguration) new ro0().mo67440f(getIntent().getExtras(), MessagingConfiguration.class);
        if (messagingConfiguration == null) {
            Logger.m43081e("MessagingActivity", "No configuration found. Please use MessagingActivity.builder()", new Object[0]);
            finish();
            return;
        }
        e80 h = e80.m75269h(this);
        MessagingComponent messagingComponent = (MessagingComponent) h.mo67417i("messaging_component");
        if (messagingComponent == null) {
            List<Engine> engines = messagingConfiguration.getEngines();
            if (kj0.m47116g(engines)) {
                Logger.m43081e("MessagingActivity", "No Engines found in MessagingConfiguration. Please use MessagingActivity.builder()", new Object[0]);
                finish();
                return;
            }
            messagingComponent = DaggerMessagingComponent.builder().appContext(getApplicationContext()).engines(engines).messagingConfiguration(messagingConfiguration).build();
            messagingComponent.messagingViewModel().start();
            h.mo67418j("messaging_component", messagingComponent);
        }
        DaggerMessagingActivityComponent.builder().messagingComponent(messagingComponent).activity(this).build().inject(this);
        setContentView(R$layout.zui_activity_messaging);
        this.messagingView = (MessagingView) findViewById(R$id.zui_view_messaging);
        Toolbar toolbar = (Toolbar) findViewById(R$id.zui_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MessagingActivity.this.finish();
            }
        });
        toolbar.setTitle((CharSequence) messagingConfiguration.getToolbarTitle(getResources()));
        this.messagingComposer.bind((InputBox) findViewById(R$id.zui_input_box));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.viewModel == null) {
            return false;
        }
        menu.clear();
        List<MenuItem> value = this.viewModel.getLiveMenuItems().getValue();
        if (kj0.m47116g(value)) {
            Logger.m43078b("MessagingActivity", "Menu: no items, hiding...", new Object[0]);
            return false;
        }
        for (MenuItem menuItem : value) {
            menu.add(0, menuItem.getItemId(), 0, menuItem.getLabelId());
        }
        Logger.m43078b("MessagingActivity", "Menu: items updated.", new Object[0]);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations() && this.viewModel != null) {
            Logger.m43078b("MessagingActivity", "onDestroy() called, clearing...", new Object[0]);
            this.viewModel.onCleared();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        super.onOptionsItemSelected(menuItem);
        this.viewModel.onEvent(this.eventFactory.menuItemClicked(menuItem.getItemId()));
        return true;
    }

    public void onStart() {
        super.onStart();
        MessagingViewModel messagingViewModel = this.viewModel;
        if (messagingViewModel != null) {
            messagingViewModel.getLiveMessagingState().observe(this, new pf4<MessagingState>() {
                public void onChanged(MessagingState messagingState) {
                    MessagingView access$000 = MessagingActivity.this.messagingView;
                    MessagingActivity messagingActivity = MessagingActivity.this;
                    access$000.renderState(messagingState, messagingActivity.messagingCellFactory, messagingActivity.picasso, messagingActivity.viewModel, messagingActivity.eventFactory);
                }
            });
            this.viewModel.getLiveNavigationStream().observe(this, new pf4<Update.Action.Navigation>() {
                public void onChanged(Update.Action.Navigation navigation) {
                    if (navigation != null) {
                        navigation.navigate(MessagingActivity.this);
                    }
                }
            });
            this.viewModel.getLiveInterfaceUpdateItems().observe(this, new pf4<Banner>() {
                public void onChanged(Banner banner) {
                    if (banner != null && banner.getPosition() == Banner.Position.BOTTOM) {
                        Snackbar.m35953b0(MessagingActivity.this.findViewById(R$id.zui_recycler_view), banner.getLabel(), 0).mo33494Q();
                    }
                }
            });
            this.viewModel.getLiveMenuItems().observe(this, new pf4<List<MenuItem>>() {
                public void onChanged(List<MenuItem> list) {
                    MessagingActivity.this.invalidateOptionsMenu();
                }
            });
            this.viewModel.getDialogUpdates().observe(this, this.messagingDialog);
        }
    }
}
