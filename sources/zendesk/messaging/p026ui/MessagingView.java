package zendesk.messaging.p026ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C1283f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.concurrent.TimeUnit;
import zendesk.commonui.AlmostRealProgressBar;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.MessagingView */
public class MessagingView extends CoordinatorLayout {
    public static final long DEFAULT_ANIMATION_DURATION = TimeUnit.MILLISECONDS.toMillis(300);
    private final CellListAdapter cellListAdapter;
    private final LostConnectionBanner lostConnectionBanner;
    private final AlmostRealProgressBar progressBar;

    public MessagingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void renderState(MessagingState messagingState, MessagingCellFactory messagingCellFactory, Picasso picasso, final EventListener eventListener, final EventFactory eventFactory) {
        if (messagingState != null) {
            this.cellListAdapter.submitList(messagingCellFactory.createCells(messagingState.messagingItems, messagingState.typingState, picasso, messagingState.attachmentSettings));
            if (messagingState.progressBarVisible) {
                this.progressBar.mo73822n(AlmostRealProgressBar.f46770s);
            } else {
                this.progressBar.mo73826p(300);
            }
            this.lostConnectionBanner.update(messagingState.connectionState);
            this.lostConnectionBanner.setOnRetryConnectionClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    eventListener.onEvent(eventFactory.reconnectButtonClick());
                }
            });
        }
    }

    public MessagingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessagingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.zui_view_messaging, this, true);
        this.progressBar = (AlmostRealProgressBar) findViewById(R$id.zui_progressBar);
        CellListAdapter cellListAdapter2 = new CellListAdapter();
        this.cellListAdapter = cellListAdapter2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.zui_recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cellListAdapter2);
        recyclerView.getRecycledViewPool().mo9456k(R$layout.zui_cell_response_options_stacked, 0);
        C1283f fVar = new C1283f();
        long j = DEFAULT_ANIMATION_DURATION;
        fVar.setAddDuration(j);
        fVar.setChangeDuration(j);
        fVar.setRemoveDuration(j);
        fVar.setMoveDuration(j);
        fVar.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(fVar);
        InputBox inputBox = (InputBox) findViewById(R$id.zui_input_box);
        this.lostConnectionBanner = LostConnectionBanner.create(this, recyclerView, inputBox);
        new RecyclerViewScroller(recyclerView, linearLayoutManager, cellListAdapter2).install(inputBox);
    }
}
