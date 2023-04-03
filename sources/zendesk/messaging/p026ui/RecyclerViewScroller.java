package zendesk.messaging.p026ui;

import android.view.View;
import androidx.recyclerview.widget.C1328m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zendesk.messaging.ui.RecyclerViewScroller */
class RecyclerViewScroller {
    private final RecyclerView.Adapter<RecyclerView.C1231a0> adapter;
    /* access modifiers changed from: private */
    public int lastCompletelyVisiblePosition = 0;
    private final LinearLayoutManager linearLayoutManager;
    /* access modifiers changed from: private */
    public final RecyclerView recyclerView;
    /* access modifiers changed from: private */
    public int secondCompletelyVisiblePosition = 0;

    public RecyclerViewScroller(final RecyclerView recyclerView2, final LinearLayoutManager linearLayoutManager2, final RecyclerView.Adapter<RecyclerView.C1231a0> adapter2) {
        this.recyclerView = recyclerView2;
        this.linearLayoutManager = linearLayoutManager2;
        this.adapter = adapter2;
        recyclerView2.mo9081l(new RecyclerView.C1251r() {
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                RecyclerViewScroller recyclerViewScroller = RecyclerViewScroller.this;
                int unused = recyclerViewScroller.secondCompletelyVisiblePosition = recyclerViewScroller.lastCompletelyVisiblePosition;
                int unused2 = RecyclerViewScroller.this.lastCompletelyVisiblePosition = linearLayoutManager2.mo8914i2();
            }
        });
        recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i4 < i8 && adapter2.getItemCount() - 1 == RecyclerViewScroller.this.secondCompletelyVisiblePosition) {
                    RecyclerViewScroller.this.postScrollToBottom(1);
                }
            }
        });
        adapter2.registerAdapterDataObserver(new RecyclerView.C1239i() {
            public void onItemRangeInserted(int i, int i2) {
                if (!recyclerView2.canScrollVertically(1)) {
                    RecyclerViewScroller.this.postScrollToBottom(3);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void postScrollToBottom(final int i) {
        this.recyclerView.post(new Runnable() {
            public void run() {
                RecyclerViewScroller.this.scrollToBottom(i);
            }
        });
    }

    /* access modifiers changed from: private */
    public void scrollToBottom(int i) {
        int i2;
        int itemCount = this.adapter.getItemCount() - 1;
        if (itemCount < 0) {
            return;
        }
        if (i == 1) {
            RecyclerView.C1231a0 Z = this.recyclerView.mo9011Z(itemCount);
            if (Z != null) {
                i2 = Z.itemView.getHeight();
            } else {
                i2 = 0;
            }
            this.linearLayoutManager.mo8884I2(itemCount, (this.recyclerView.getPaddingBottom() + i2) * -1);
        } else if (i == 3) {
            C99376 r3 = new C1328m(this.recyclerView.getContext()) {
                public int calculateTimeForScrolling(int i) {
                    return 50;
                }
            };
            r3.setTargetPosition(itemCount);
            this.linearLayoutManager.mo9230S1(r3);
        } else if (i == 2) {
            C1328m mVar = new C1328m(this.recyclerView.getContext());
            mVar.setTargetPosition(itemCount);
            this.linearLayoutManager.mo9230S1(mVar);
        }
    }

    public void install(final InputBox inputBox) {
        inputBox.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, final int i2, int i3, int i4, int i5, final int i6, int i7, int i8) {
                RecyclerViewScroller.this.recyclerView.post(new Runnable() {
                    public void run() {
                        int paddingLeft = RecyclerViewScroller.this.recyclerView.getPaddingLeft();
                        int paddingRight = RecyclerViewScroller.this.recyclerView.getPaddingRight();
                        int paddingTop = RecyclerViewScroller.this.recyclerView.getPaddingTop();
                        int height = inputBox.getHeight();
                        if (height != RecyclerViewScroller.this.recyclerView.getPaddingBottom()) {
                            RecyclerViewScroller.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, height);
                            RecyclerViewScroller.this.recyclerView.scrollBy(0, i6 - i2);
                        }
                    }
                });
            }
        });
        inputBox.addSendButtonClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RecyclerViewScroller.this.postScrollToBottom(1);
            }
        });
    }
}
