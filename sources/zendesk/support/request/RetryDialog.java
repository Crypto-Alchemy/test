package zendesk.support.request;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4214a;
import java.util.List;

class RetryDialog extends C4214a {
    private BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public final List<StateMessage> message;

    public interface Listener {
        void onDeleteMessage(List<StateMessage> list);

        void onRetryMessage(List<StateMessage> list);
    }

    public RetryDialog(Context context, List<StateMessage> list) {
        super(context);
        this.message = list;
        init();
    }

    private void init() {
        setContentView(g45.zs_request_dialog_retry);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.bottomSheetBehavior = initBottomSheet();
        initListener();
    }

    private BottomSheetBehavior<FrameLayout> initBottomSheet() {
        FrameLayout frameLayout = (FrameLayout) findViewById(g35.design_bottom_sheet);
        if (frameLayout == null) {
            return null;
        }
        try {
            return BottomSheetBehavior.m34816y(frameLayout);
        } catch (Exception unused) {
            return null;
        }
    }

    private void initListener() {
        View findViewById = findViewById(l35.request_dialog_retry_delete);
        View findViewById2 = findViewById(l35.request_dialog_retry_retry);
        if (findViewById2 != null && findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onDeleteMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onRetryMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.mo31876V(3);
        }
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
