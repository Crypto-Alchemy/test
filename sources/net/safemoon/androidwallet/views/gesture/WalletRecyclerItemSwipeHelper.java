package net.safemoon.androidwallet.views.gesture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.C1314k;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0007*\u00012\b'\u0018\u00002\u00020\u0001:\u0002\u0012\u0018B'\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b6\u00107J&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u0004H&J\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0007H\u0002R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010#\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00040\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010&\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020 0'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper;", "", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$c;", "itemActionButtons", "Lr37;", "n", "o", "l", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lez2;", "b", "Lez2;", "m", "()Lez2;", "itemListGestureListener", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Ld24;", "d", "Ld24;", "adapter", "", "", "e", "Ljava/util/Map;", "buttonsBuffer", "f", "Ljava/util/List;", "itemButtonList", "Ljava/util/Queue;", "g", "Ljava/util/Queue;", "recoverItemStateQueue", "h", "I", "swipedItemPosition", "", "i", "F", "swipeThresholdForItems", "net/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$d", "j", "Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$d;", "onItemTouchListener", "<init>", "(Landroid/content/Context;Lez2;Landroidx/recyclerview/widget/RecyclerView;Ld24;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ClickableViewAccessibility"})
/* compiled from: WalletRecyclerItemSwipeHelper.kt */
public abstract class WalletRecyclerItemSwipeHelper {

    /* renamed from: a */
    public final Context f43329a;

    /* renamed from: b */
    public final ez2 f43330b;

    /* renamed from: c */
    public final RecyclerView f43331c;

    /* renamed from: d */
    public final d24 f43332d;

    /* renamed from: e */
    public final Map<Integer, List<C8963c>> f43333e;

    /* renamed from: f */
    public List<C8963c> f43334f = new ArrayList();

    /* renamed from: g */
    public Queue<Integer> f43335g = new LinkedList();

    /* renamed from: h */
    public int f43336h = -1;

    /* renamed from: i */
    public float f43337i = 0.5f;

    /* renamed from: j */
    public final C8964d f43338j;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "Lr37;", "onScrollStateChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper$a */
    /* compiled from: WalletRecyclerItemSwipeHelper.kt */
    public static final class C8961a extends RecyclerView.C1251r {

        /* renamed from: a */
        public final /* synthetic */ WalletRecyclerItemSwipeHelper f43339a;

        public C8961a(WalletRecyclerItemSwipeHelper walletRecyclerItemSwipeHelper) {
            this.f43339a = walletRecyclerItemSwipeHelper;
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            vx2.m53591g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (this.f43339a.f43336h >= 0 || this.f43339a.f43334f.size() > 0) {
                this.f43339a.f43336h = -1;
                this.f43339a.f43334f.clear();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J@\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u001a\u0010\u0012\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J@\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J:\u0010%\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0010\u0010#\u001a\f\u0012\b\u0012\u00060!R\u00020\"0 2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$b;", "Landroidx/recyclerview/widget/k$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "target", "", "y", "", "fromPos", "toPos", "x", "Lr37;", "z", "direction", "B", "actionState", "A", "", "m", "defaultValue", "l", "n", "Landroid/graphics/Canvas;", "c", "dX", "dY", "isCurrentlyActive", "u", "Landroid/view/View;", "itemView", "", "Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$c;", "Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper;", "buffer", "pos", "H", "f", "F", "ACTION_BUTTON_WIDTH", "g", "Z", "isLatestGestureSwipeToRemove", "<init>", "(Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper$b */
    /* compiled from: WalletRecyclerItemSwipeHelper.kt */
    public final class C8962b extends C1314k.C1325h {

        /* renamed from: f */
        public float f43340f = ho0.m58584a(80);

        /* renamed from: g */
        public boolean f43341g;

        public C8962b() {
            super(3, 4);
        }

        /* renamed from: G */
        public static final void m69675G(WalletRecyclerItemSwipeHelper walletRecyclerItemSwipeHelper, RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(walletRecyclerItemSwipeHelper, "this$0");
            vx2.m53591g(a0Var, "$viewHolder");
            walletRecyclerItemSwipeHelper.f43332d.notifyItemChanged(a0Var.getAbsoluteAdapterPosition());
            walletRecyclerItemSwipeHelper.f43332d.notifyItemChanged(walletRecyclerItemSwipeHelper.f43332d.getItemCount() - 1);
            if (walletRecyclerItemSwipeHelper.f43332d.getItemCount() > 2) {
                walletRecyclerItemSwipeHelper.f43332d.notifyItemChanged(walletRecyclerItemSwipeHelper.f43332d.getItemCount() - 2);
            }
        }

        /* renamed from: I */
        public static final void m69676I(WalletRecyclerItemSwipeHelper walletRecyclerItemSwipeHelper, int i) {
            vx2.m53591g(walletRecyclerItemSwipeHelper, "this$0");
            RecyclerView.Adapter adapter = walletRecyclerItemSwipeHelper.f43331c.getAdapter();
            vx2.m53588d(adapter);
            adapter.notifyItemChanged(i);
        }

        /* renamed from: A */
        public void mo9858A(RecyclerView.C1231a0 a0Var, int i) {
            View view;
            super.mo9858A(a0Var, i);
            if (i == 2) {
                if (a0Var != null) {
                    view = a0Var.itemView;
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setAlpha(1.0f);
                }
            }
        }

        /* renamed from: B */
        public void mo9859B(RecyclerView.C1231a0 a0Var, int i) {
            vx2.m53591g(a0Var, "viewHolder");
            this.f43341g = true;
            int layoutPosition = a0Var.getLayoutPosition();
            if (WalletRecyclerItemSwipeHelper.this.f43336h != layoutPosition) {
                WalletRecyclerItemSwipeHelper.this.f43335g.add(Integer.valueOf(WalletRecyclerItemSwipeHelper.this.f43336h));
            }
            WalletRecyclerItemSwipeHelper.this.f43336h = layoutPosition;
            if (WalletRecyclerItemSwipeHelper.this.f43333e.containsKey(Integer.valueOf(WalletRecyclerItemSwipeHelper.this.f43336h))) {
                WalletRecyclerItemSwipeHelper walletRecyclerItemSwipeHelper = WalletRecyclerItemSwipeHelper.this;
                Object obj = walletRecyclerItemSwipeHelper.f43333e.get(Integer.valueOf(WalletRecyclerItemSwipeHelper.this.f43336h));
                vx2.m53588d(obj);
                walletRecyclerItemSwipeHelper.f43334f = (List) obj;
            } else {
                WalletRecyclerItemSwipeHelper.this.f43334f.clear();
            }
            WalletRecyclerItemSwipeHelper.this.f43333e.clear();
            WalletRecyclerItemSwipeHelper walletRecyclerItemSwipeHelper2 = WalletRecyclerItemSwipeHelper.this;
            walletRecyclerItemSwipeHelper2.f43337i = ((float) walletRecyclerItemSwipeHelper2.f43334f.size()) * 0.5f * this.f43340f;
            WalletRecyclerItemSwipeHelper.this.mo62229o();
            if (!WalletRecyclerItemSwipeHelper.this.f43332d.mo51035b(a0Var)) {
                WalletRecyclerItemSwipeHelper.this.f43331c.post(new bj7(WalletRecyclerItemSwipeHelper.this, layoutPosition));
            }
        }

        /* renamed from: H */
        public final void mo62244H(Canvas canvas, View view, List<C8963c> list, int i, float f) {
            float right = ((float) view.getRight()) - ((float) view.getHeight());
            float size = (((float) -1) * f) / ((float) list.size());
            for (C8963c b : list) {
                float right2 = (((float) view.getRight()) - ((float) view.getPaddingEnd())) - size;
                b.mo62246b(canvas, new RectF(right2, (float) view.getTop(), right, (float) view.getBottom()), i, view);
                right = right2;
            }
        }

        /* renamed from: c */
        public void mo9862c(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            super.mo9862c(recyclerView, a0Var);
            if (!this.f43341g) {
                recyclerView.post(new cj7(WalletRecyclerItemSwipeHelper.this, a0Var));
            }
            WalletRecyclerItemSwipeHelper.this.mo62228m().mo51553a();
        }

        /* renamed from: l */
        public float mo9870l(float f) {
            return f * 0.1f;
        }

        /* renamed from: m */
        public float mo9871m(RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(a0Var, "viewHolder");
            return WalletRecyclerItemSwipeHelper.this.f43337i;
        }

        /* renamed from: n */
        public float mo9872n(float f) {
            return f * 50.0f;
        }

        /* renamed from: u */
        public void mo9877u(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, float f, float f2, int i, boolean z) {
            float f3;
            RecyclerView.C1231a0 a0Var2 = a0Var;
            Canvas canvas2 = canvas;
            vx2.m53591g(canvas, "c");
            RecyclerView recyclerView2 = recyclerView;
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            int layoutPosition = a0Var.getLayoutPosition();
            float width = (this.f43340f * f) / ((float) a0Var2.itemView.getWidth());
            View view = a0Var2.itemView;
            vx2.m53590f(view, "viewHolder.itemView");
            if (layoutPosition < 0) {
                WalletRecyclerItemSwipeHelper.this.f43336h = layoutPosition;
            } else if (WalletRecyclerItemSwipeHelper.this.f43332d.mo51035b(a0Var)) {
                if (i != 1 || f >= Utils.FLOAT_EPSILON) {
                    f3 = width;
                } else {
                    List arrayList = new ArrayList();
                    if (!WalletRecyclerItemSwipeHelper.this.f43333e.containsKey(Integer.valueOf(layoutPosition))) {
                        WalletRecyclerItemSwipeHelper.this.mo57830n(a0Var, arrayList);
                        WalletRecyclerItemSwipeHelper.this.f43333e.put(Integer.valueOf(layoutPosition), arrayList);
                    } else {
                        Object obj = WalletRecyclerItemSwipeHelper.this.f43333e.get(Integer.valueOf(layoutPosition));
                        vx2.m53588d(obj);
                        arrayList = (List) obj;
                    }
                    List list = arrayList;
                    float size = ((((float) list.size()) * f) * this.f43340f) / ((float) view.getWidth());
                    mo62244H(canvas, view, list, layoutPosition, size);
                    f3 = size;
                }
                super.mo9877u(canvas, recyclerView, a0Var, f3, f2, i, z);
            } else {
                int i2 = i;
                super.mo9877u(canvas, recyclerView, a0Var, width, f2, i, z);
            }
        }

        /* renamed from: y */
        public boolean mo9881y(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2) {
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            vx2.m53591g(a0Var2, "target");
            this.f43341g = false;
            WalletRecyclerItemSwipeHelper.this.f43332d.mo51036c(a0Var.getBindingAdapterPosition(), a0Var2.getAbsoluteAdapterPosition());
            return true;
        }

        /* renamed from: z */
        public void mo9882z(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, int i, RecyclerView.C1231a0 a0Var2, int i2, int i3, int i4) {
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            vx2.m53591g(a0Var2, "target");
            super.mo9882z(recyclerView, a0Var, i, a0Var2, i2, i3, i4);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$c;", "", "", "x", "y", "", "a", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/RectF;", "rect", "", "pos", "Landroid/view/View;", "itemView", "Lr37;", "b", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/drawable/ColorDrawable;", "colorBackgroundDrawable", "I", "d", "Landroid/graphics/RectF;", "deleteClickRegion", "e", "backgroundCornerOffset", "<init>", "(Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/ColorDrawable;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper$c */
    /* compiled from: WalletRecyclerItemSwipeHelper.kt */
    public final class C8963c {

        /* renamed from: a */
        public final Drawable f43343a;

        /* renamed from: b */
        public final ColorDrawable f43344b;

        /* renamed from: c */
        public int f43345c;

        /* renamed from: d */
        public RectF f43346d;

        /* renamed from: e */
        public final int f43347e = ((int) ho0.m58584a(14));

        public C8963c(Drawable drawable, ColorDrawable colorDrawable) {
            this.f43343a = drawable;
            this.f43344b = colorDrawable;
        }

        /* renamed from: a */
        public final boolean mo62245a(float f, float f2) {
            RectF rectF = this.f43346d;
            if (rectF == null) {
                return false;
            }
            vx2.m53588d(rectF);
            if (!rectF.contains(f, f2)) {
                return false;
            }
            WalletRecyclerItemSwipeHelper.this.mo62228m().mo51554b(this.f43345c);
            return true;
        }

        /* renamed from: b */
        public final void mo62246b(Canvas canvas, RectF rectF, int i, View view) {
            vx2.m53591g(canvas, "c");
            vx2.m53591g(rectF, "rect");
            vx2.m53591g(view, "itemView");
            this.f43345c = i;
            RectF rectF2 = new RectF(rectF.left, (float) view.getTop(), (float) (view.getRight() - this.f43347e), (float) view.getBottom());
            this.f43346d = rectF2;
            ColorDrawable colorDrawable = this.f43344b;
            if (colorDrawable != null) {
                vx2.m53588d(rectF2);
                int a = ((int) rectF2.left) + ((int) ho0.m58584a(5));
                RectF rectF3 = this.f43346d;
                vx2.m53588d(rectF3);
                int a2 = ((int) rectF3.top) + ((int) ho0.m58584a(Double.valueOf(5.5d)));
                RectF rectF4 = this.f43346d;
                vx2.m53588d(rectF4);
                RectF rectF5 = this.f43346d;
                vx2.m53588d(rectF5);
                colorDrawable.setBounds(a, a2, (int) rectF4.right, ((int) rectF5.bottom) - ((int) ho0.m58584a(Double.valueOf(5.5d))));
                this.f43344b.draw(canvas);
            }
            Drawable drawable = this.f43343a;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int top = view.getTop() + ((view.getHeight() - this.f43343a.getIntrinsicHeight()) / 2);
                RectF rectF6 = this.f43346d;
                vx2.m53588d(rectF6);
                int i2 = ((int) rectF6.right) - intrinsicWidth;
                Drawable drawable2 = this.f43343a;
                drawable2.setBounds(i2 - intrinsicWidth, top, i2, this.f43343a.getIntrinsicHeight() + top);
                this.f43343a.draw(canvas);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$d", "Landroidx/recyclerview/widget/RecyclerView$q;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "", "c", "Lr37;", "a", "disallowIntercept", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper$d */
    /* compiled from: WalletRecyclerItemSwipeHelper.kt */
    public static final class C8964d implements RecyclerView.C1250q {

        /* renamed from: a */
        public final /* synthetic */ WalletRecyclerItemSwipeHelper f43349a;

        public C8964d(WalletRecyclerItemSwipeHelper walletRecyclerItemSwipeHelper) {
            this.f43349a = walletRecyclerItemSwipeHelper;
        }

        /* renamed from: a */
        public void mo9441a(RecyclerView recyclerView, MotionEvent motionEvent) {
            vx2.m53591g(recyclerView, "rv");
            vx2.m53591g(motionEvent, "e");
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000a A[LOOP:0: B:1:0x000a->B:4:0x0022, LOOP_START] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo62247b(android.view.MotionEvent r5) {
            /*
                r4 = this;
                net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper r0 = r4.f43349a
                java.util.List r0 = r0.f43334f
                java.util.Iterator r0 = r0.iterator()
            L_0x000a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0024
                java.lang.Object r1 = r0.next()
                net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper$c r1 = (net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper.C8963c) r1
                float r2 = r5.getX()
                float r3 = r5.getY()
                boolean r1 = r1.mo62245a(r2, r3)
                if (r1 == 0) goto L_0x000a
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper.C8964d.mo62247b(android.view.MotionEvent):void");
        }

        /* renamed from: c */
        public boolean mo9442c(RecyclerView recyclerView, MotionEvent motionEvent) {
            vx2.m53591g(recyclerView, "rv");
            vx2.m53591g(motionEvent, "e");
            if (this.f43349a.f43336h < 0) {
                return false;
            }
            Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            RecyclerView.C1231a0 Z = this.f43349a.f43331c.mo9011Z(this.f43349a.f43336h);
            if (Z == null) {
                return false;
            }
            View view = Z.itemView;
            vx2.m53590f(view, "swipedViewHolder.itemView");
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            if (motionEvent.getAction() == 1) {
                int i = rect.top;
                int i2 = point.y;
                if (i < i2 && rect.bottom > i2) {
                    mo62247b(motionEvent);
                }
                this.f43349a.f43335g.add(Integer.valueOf(this.f43349a.f43336h));
                this.f43349a.f43336h = -1;
                this.f43349a.f43335g.poll();
            }
            return false;
        }

        /* renamed from: e */
        public void mo9443e(boolean z) {
        }
    }

    public WalletRecyclerItemSwipeHelper(Context context, ez2 ez2, RecyclerView recyclerView, d24 d24) {
        vx2.m53591g(context, "context");
        vx2.m53591g(ez2, "itemListGestureListener");
        vx2.m53591g(recyclerView, "recyclerView");
        vx2.m53591g(d24, "adapter");
        this.f43329a = context;
        this.f43330b = ez2;
        this.f43331c = recyclerView;
        this.f43332d = d24;
        C8964d dVar = new C8964d(this);
        this.f43338j = dVar;
        this.f43334f = new ArrayList();
        recyclerView.mo9079k(dVar);
        recyclerView.mo9081l(new C8961a(this));
        this.f43333e = new HashMap();
        this.f43335g = new LinkedList<Integer>() {
            public /* bridge */ /* synthetic */ boolean add(Object obj) {
                return add(((Number) obj).intValue());
            }

            public /* bridge */ boolean contains(Integer num) {
                return super.contains(num);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ int indexOf(Integer num) {
                return super.indexOf(num);
            }

            public /* bridge */ int lastIndexOf(Integer num) {
                return super.lastIndexOf(num);
            }

            public final /* bridge */ Integer remove(int i) {
                return removeAt(i);
            }

            public /* bridge */ Integer removeAt(int i) {
                return (Integer) super.remove(i);
            }

            public final /* bridge */ int size() {
                return getSize();
            }

            public boolean add(int i) {
                if (contains((Object) Integer.valueOf(i))) {
                    return false;
                }
                return super.add(Integer.valueOf(i));
            }

            public final /* bridge */ boolean contains(Object obj) {
                if (!(obj instanceof Integer)) {
                    return false;
                }
                return contains((Integer) obj);
            }

            public final /* bridge */ int indexOf(Object obj) {
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                return indexOf((Integer) obj);
            }

            public final /* bridge */ int lastIndexOf(Object obj) {
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                return lastIndexOf((Integer) obj);
            }

            public /* bridge */ boolean remove(Integer num) {
                return super.remove(num);
            }

            public final /* bridge */ boolean remove(Object obj) {
                if (!(obj == null ? true : obj instanceof Integer)) {
                    return false;
                }
                return remove((Integer) obj);
            }
        };
        mo62227l();
    }

    /* renamed from: p */
    public static final void m69668p(WalletRecyclerItemSwipeHelper walletRecyclerItemSwipeHelper, Integer num) {
        vx2.m53591g(walletRecyclerItemSwipeHelper, "this$0");
        RecyclerView.Adapter adapter = walletRecyclerItemSwipeHelper.f43331c.getAdapter();
        vx2.m53588d(adapter);
        vx2.m53590f(num, "pos");
        adapter.notifyItemChanged(num.intValue());
    }

    /* renamed from: l */
    public final void mo62227l() {
        new C1314k(new C8962b()).mo9836g(this.f43331c);
    }

    /* renamed from: m */
    public final ez2 mo62228m() {
        return this.f43330b;
    }

    /* renamed from: n */
    public abstract void mo57830n(RecyclerView.C1231a0 a0Var, List<C8963c> list);

    /* renamed from: o */
    public final synchronized void mo62229o() {
        while (!this.f43335g.isEmpty()) {
            Integer poll = this.f43335g.poll();
            vx2.m53590f(poll, "pos");
            if (poll.intValue() > -1) {
                this.f43331c.post(new aj7(this, poll));
            }
        }
    }
}
