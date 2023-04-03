package zendesk.messaging.p026ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.StackedResponseOptionsView */
public class StackedResponseOptionsView extends FrameLayout implements Updatable<ResponseOptionsViewState> {
    /* access modifiers changed from: private */
    public ResponseOptionsAdapter adapter;

    public StackedResponseOptionsView(Context context) {
        super(context);
        init();
    }

    private void init() {
        View.inflate(getContext(), R$layout.zui_view_response_options_content, this);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.zui_response_options_recycler);
        recyclerView.setItemAnimator((RecyclerView.C1242l) null);
        h42 h42 = new h42(getContext());
        h42.mo43081n(3);
        Drawable e = zr0.m31442e(getContext(), R$drawable.zui_view_stacked_response_options_divider);
        if (e != null) {
            h42.mo43078k(e);
        }
        recyclerView.setLayoutManager(new FlexboxLayoutManager(getContext(), 1));
        recyclerView.mo9067h(h42);
        ResponseOptionsAdapter responseOptionsAdapter = new ResponseOptionsAdapter();
        this.adapter = responseOptionsAdapter;
        recyclerView.setAdapter(responseOptionsAdapter);
    }

    public void update(final ResponseOptionsViewState responseOptionsViewState) {
        responseOptionsViewState.getProps().apply(this);
        this.adapter.setResponseOptionHandler(new ResponseOptionHandler() {
            public void onResponseOptionSelected(MessagingItem.Option option) {
                StackedResponseOptionsView.this.adapter.setSelectedOption(option);
                responseOptionsViewState.getListener().onResponseOptionSelected(option);
            }
        });
        this.adapter.submitList(responseOptionsViewState.getOptions());
    }

    public StackedResponseOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public StackedResponseOptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
