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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0007*\u00012\b'\u0018\u00002\u00020\u0001:\u0002\u0012\u0018B'\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b6\u00107J&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u0004H&J\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0007H\u0002R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010#\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00040\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010&\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020 0'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper;", "", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$c;", "itemActionButtons", "Lr37;", "n", "o", "l", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lez2;", "b", "Lez2;", "m", "()Lez2;", "itemListGestureListener", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lf14;", "d", "Lf14;", "adapter", "", "", "e", "Ljava/util/Map;", "buttonsBuffer", "f", "Ljava/util/List;", "itemButtonList", "Ljava/util/Queue;", "g", "Ljava/util/Queue;", "recoverItemStateQueue", "h", "I", "swipedItemPosition", "", "i", "F", "swipeThresholdForItems", "net/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$d", "j", "Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$d;", "onItemTouchListener", "<init>", "(Landroid/content/Context;Lez2;Landroidx/recyclerview/widget/RecyclerView;Lf14;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ClickableViewAccessibility"})
/* compiled from: RecyclerItemSwipeHelper.kt */
public abstract class RecyclerItemSwipeHelper {

    /* renamed from: a */
    public final Context f43308a;

    /* renamed from: b */
    public final ez2 f43309b;

    /* renamed from: c */
    public final RecyclerView f43310c;

    /* renamed from: d */
    public final f14 f43311d;

    /* renamed from: e */
    public final Map<Integer, List<C8958c>> f43312e;

    /* renamed from: f */
    public List<C8958c> f43313f = new ArrayList();

    /* renamed from: g */
    public Queue<Integer> f43314g = new LinkedList();

    /* renamed from: h */
    public int f43315h = -1;

    /* renamed from: i */
    public float f43316i = 0.5f;

    /* renamed from: j */
    public final C8959d f43317j;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "Lr37;", "onScrollStateChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper$a */
    /* compiled from: RecyclerItemSwipeHelper.kt */
    public static final class C8956a extends RecyclerView.C1251r {

        /* renamed from: a */
        public final /* synthetic */ RecyclerItemSwipeHelper f43318a;

        public C8956a(RecyclerItemSwipeHelper recyclerItemSwipeHelper) {
            this.f43318a = recyclerItemSwipeHelper;
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            vx2.m53591g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (this.f43318a.f43315h >= 0 || this.f43318a.f43313f.size() > 0) {
                this.f43318a.f43315h = -1;
                this.f43318a.f43313f.clear();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J@\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u001a\u0010\u0012\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J@\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J:\u0010%\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0010\u0010#\u001a\f\u0012\b\u0012\u00060!R\u00020\"0 2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$b;", "Landroidx/recyclerview/widget/k$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "target", "", "y", "", "fromPos", "toPos", "x", "Lr37;", "z", "direction", "B", "actionState", "A", "", "m", "defaultValue", "l", "n", "Landroid/graphics/Canvas;", "c", "dX", "dY", "isCurrentlyActive", "u", "Landroid/view/View;", "itemView", "", "Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$c;", "Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper;", "buffer", "pos", "H", "f", "F", "ACTION_BUTTON_WIDTH", "g", "Z", "isLatestGestureSwipeToRemove", "<init>", "(Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper$b */
    /* compiled from: RecyclerItemSwipeHelper.kt */
    public final class C8957b extends C1314k.C1325h {

        /* renamed from: f */
        public float f43319f = ho0.m58584a(80);

        /* renamed from: g */
        public boolean f43320g;

        public C8957b() {
            super(3, 4);
        }

        /* renamed from: G */
        public static final void m69639G(RecyclerItemSwipeHelper recyclerItemSwipeHelper, RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(recyclerItemSwipeHelper, "this$0");
            vx2.m53591g(a0Var, "$viewHolder");
            recyclerItemSwipeHelper.f43311d.notifyItemChanged(a0Var.getAbsoluteAdapterPosition());
            recyclerItemSwipeHelper.f43311d.notifyItemChanged(recyclerItemSwipeHelper.f43311d.getItemCount() - 1);
            if (recyclerItemSwipeHelper.f43311d.getItemCount() > 2) {
                recyclerItemSwipeHelper.f43311d.notifyItemChanged(recyclerItemSwipeHelper.f43311d.getItemCount() - 2);
            }
        }

        /* renamed from: I */
        public static final void m69640I(RecyclerItemSwipeHelper recyclerItemSwipeHelper, int i) {
            vx2.m53591g(recyclerItemSwipeHelper, "this$0");
            RecyclerView.Adapter adapter = recyclerItemSwipeHelper.f43310c.getAdapter();
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
            this.f43320g = true;
            int layoutPosition = a0Var.getLayoutPosition();
            if (RecyclerItemSwipeHelper.this.f43315h != layoutPosition) {
                RecyclerItemSwipeHelper.this.f43314g.add(Integer.valueOf(RecyclerItemSwipeHelper.this.f43315h));
            }
            RecyclerItemSwipeHelper.this.f43315h = layoutPosition;
            if (RecyclerItemSwipeHelper.this.f43312e.containsKey(Integer.valueOf(RecyclerItemSwipeHelper.this.f43315h))) {
                RecyclerItemSwipeHelper recyclerItemSwipeHelper = RecyclerItemSwipeHelper.this;
                Object obj = recyclerItemSwipeHelper.f43312e.get(Integer.valueOf(RecyclerItemSwipeHelper.this.f43315h));
                vx2.m53588d(obj);
                recyclerItemSwipeHelper.f43313f = (List) obj;
            } else {
                RecyclerItemSwipeHelper.this.f43313f.clear();
            }
            RecyclerItemSwipeHelper.this.f43312e.clear();
            RecyclerItemSwipeHelper recyclerItemSwipeHelper2 = RecyclerItemSwipeHelper.this;
            recyclerItemSwipeHelper2.f43316i = ((float) recyclerItemSwipeHelper2.f43313f.size()) * 0.5f * this.f43319f;
            RecyclerItemSwipeHelper.this.mo62208o();
            if (!RecyclerItemSwipeHelper.this.f43311d.mo51561c(a0Var)) {
                RecyclerItemSwipeHelper.this.f43310c.post(new h95(RecyclerItemSwipeHelper.this, layoutPosition));
            }
        }

        /* renamed from: H */
        public final void mo62223H(Canvas canvas, View view, List<C8958c> list, int i, float f) {
            float right = ((float) view.getRight()) - ((float) view.getHeight());
            float size = (((float) -1) * f) / ((float) list.size());
            for (C8958c b : list) {
                float right2 = (((float) view.getRight()) - ((float) view.getPaddingEnd())) - size;
                b.mo62225b(canvas, new RectF(right2, (float) view.getTop(), right, (float) view.getBottom()), i, view);
                right = right2;
            }
        }

        /* renamed from: c */
        public void mo9862c(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            super.mo9862c(recyclerView, a0Var);
            if (!this.f43320g) {
                recyclerView.post(new g95(RecyclerItemSwipeHelper.this, a0Var));
            }
            RecyclerItemSwipeHelper.this.mo62207m().mo51553a();
        }

        /* renamed from: l */
        public float mo9870l(float f) {
            return f * 0.1f;
        }

        /* renamed from: m */
        public float mo9871m(RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(a0Var, "viewHolder");
            return RecyclerItemSwipeHelper.this.f43316i;
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
            float width = (this.f43319f * f) / ((float) a0Var2.itemView.getWidth());
            View view = a0Var2.itemView;
            vx2.m53590f(view, "viewHolder.itemView");
            if (layoutPosition < 0) {
                RecyclerItemSwipeHelper.this.f43315h = layoutPosition;
            } else if (RecyclerItemSwipeHelper.this.f43311d.mo51561c(a0Var)) {
                if (i != 1 || f >= Utils.FLOAT_EPSILON) {
                    f3 = width;
                } else {
                    List arrayList = new ArrayList();
                    if (!RecyclerItemSwipeHelper.this.f43312e.containsKey(Integer.valueOf(layoutPosition))) {
                        RecyclerItemSwipeHelper.this.mo57512n(a0Var, arrayList);
                        RecyclerItemSwipeHelper.this.f43312e.put(Integer.valueOf(layoutPosition), arrayList);
                    } else {
                        Object obj = RecyclerItemSwipeHelper.this.f43312e.get(Integer.valueOf(layoutPosition));
                        vx2.m53588d(obj);
                        arrayList = (List) obj;
                    }
                    List list = arrayList;
                    float size = ((((float) list.size()) * f) * this.f43319f) / ((float) view.getWidth());
                    mo62223H(canvas, view, list, layoutPosition, size);
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
            this.f43320g = false;
            RecyclerItemSwipeHelper.this.f43311d.mo51562d(a0Var.getBindingAdapterPosition(), a0Var2.getAbsoluteAdapterPosition());
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

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$c;", "", "", "x", "y", "", "a", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/RectF;", "rect", "", "pos", "Landroid/view/View;", "itemView", "Lr37;", "b", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/drawable/ColorDrawable;", "colorBackgroundDrawable", "I", "d", "Landroid/graphics/RectF;", "deleteClickRegion", "e", "backgroundCornerOffset", "<init>", "(Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/ColorDrawable;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper$c */
    /* compiled from: RecyclerItemSwipeHelper.kt */
    public final class C8958c {

        /* renamed from: a */
        public final Drawable f43322a;

        /* renamed from: b */
        public final ColorDrawable f43323b;

        /* renamed from: c */
        public int f43324c;

        /* renamed from: d */
        public RectF f43325d;

        /* renamed from: e */
        public final int f43326e = ((int) ho0.m58584a(14));

        public C8958c(Drawable drawable, ColorDrawable colorDrawable) {
            this.f43322a = drawable;
            this.f43323b = colorDrawable;
        }

        /* renamed from: a */
        public final boolean mo62224a(float f, float f2) {
            RectF rectF = this.f43325d;
            if (rectF == null) {
                return false;
            }
            vx2.m53588d(rectF);
            if (!rectF.contains(f, f2)) {
                return false;
            }
            RecyclerItemSwipeHelper.this.mo62207m().mo51554b(this.f43324c);
            return true;
        }

        /* renamed from: b */
        public final void mo62225b(Canvas canvas, RectF rectF, int i, View view) {
            vx2.m53591g(canvas, "c");
            vx2.m53591g(rectF, "rect");
            vx2.m53591g(view, "itemView");
            this.f43324c = i;
            RectF rectF2 = new RectF(rectF.left, (float) view.getTop(), (float) (view.getRight() - this.f43326e), (float) view.getBottom());
            this.f43325d = rectF2;
            ColorDrawable colorDrawable = this.f43323b;
            if (colorDrawable != null) {
                vx2.m53588d(rectF2);
                RectF rectF3 = this.f43325d;
                vx2.m53588d(rectF3);
                RectF rectF4 = this.f43325d;
                vx2.m53588d(rectF4);
                RectF rectF5 = this.f43325d;
                vx2.m53588d(rectF5);
                colorDrawable.setBounds((int) rectF2.left, (int) rectF3.top, (int) rectF4.right, (int) rectF5.bottom);
                this.f43323b.draw(canvas);
            }
            Drawable drawable = this.f43322a;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int top = view.getTop() + ((view.getHeight() - this.f43322a.getIntrinsicHeight()) / 2);
                RectF rectF6 = this.f43325d;
                vx2.m53588d(rectF6);
                int i2 = ((int) rectF6.right) - intrinsicWidth;
                Drawable drawable2 = this.f43322a;
                drawable2.setBounds(i2 - intrinsicWidth, top, i2, this.f43322a.getIntrinsicHeight() + top);
                this.f43322a.draw(canvas);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$d", "Landroidx/recyclerview/widget/RecyclerView$q;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "", "c", "Lr37;", "a", "disallowIntercept", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper$d */
    /* compiled from: RecyclerItemSwipeHelper.kt */
    public static final class C8959d implements RecyclerView.C1250q {

        /* renamed from: a */
        public final /* synthetic */ RecyclerItemSwipeHelper f43328a;

        public C8959d(RecyclerItemSwipeHelper recyclerItemSwipeHelper) {
            this.f43328a = recyclerItemSwipeHelper;
        }

        /* renamed from: a */
        public void mo9441a(RecyclerView recyclerView, MotionEvent motionEvent) {
            vx2.m53591g(recyclerView, "rv");
            vx2.m53591g(motionEvent, "e");
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000a A[LOOP:0: B:1:0x000a->B:4:0x0022, LOOP_START] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo62226b(android.view.MotionEvent r5) {
            /*
                r4 = this;
                net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper r0 = r4.f43328a
                java.util.List r0 = r0.f43313f
                java.util.Iterator r0 = r0.iterator()
            L_0x000a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0024
                java.lang.Object r1 = r0.next()
                net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper$c r1 = (net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper.C8958c) r1
                float r2 = r5.getX()
                float r3 = r5.getY()
                boolean r1 = r1.mo62224a(r2, r3)
                if (r1 == 0) goto L_0x000a
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper.C8959d.mo62226b(android.view.MotionEvent):void");
        }

        /* renamed from: c */
        public boolean mo9442c(RecyclerView recyclerView, MotionEvent motionEvent) {
            vx2.m53591g(recyclerView, "rv");
            vx2.m53591g(motionEvent, "e");
            if (this.f43328a.f43315h < 0) {
                return false;
            }
            Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            RecyclerView.C1231a0 Z = this.f43328a.f43310c.mo9011Z(this.f43328a.f43315h);
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
                    mo62226b(motionEvent);
                }
                this.f43328a.f43314g.add(Integer.valueOf(this.f43328a.f43315h));
                this.f43328a.f43315h = -1;
                this.f43328a.f43314g.poll();
            }
            return false;
        }

        /* renamed from: e */
        public void mo9443e(boolean z) {
        }
    }

    public RecyclerItemSwipeHelper(Context context, ez2 ez2, RecyclerView recyclerView, f14 f14) {
        vx2.m53591g(context, "context");
        vx2.m53591g(ez2, "itemListGestureListener");
        vx2.m53591g(recyclerView, "recyclerView");
        vx2.m53591g(f14, "adapter");
        this.f43308a = context;
        this.f43309b = ez2;
        this.f43310c = recyclerView;
        this.f43311d = f14;
        C8959d dVar = new C8959d(this);
        this.f43317j = dVar;
        this.f43313f = new ArrayList();
        recyclerView.mo9079k(dVar);
        recyclerView.mo9081l(new C8956a(this));
        this.f43312e = new HashMap();
        this.f43314g = new LinkedList<Integer>() {
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
        mo62206l();
    }

    /* renamed from: p */
    public static final void m69632p(RecyclerItemSwipeHelper recyclerItemSwipeHelper, Integer num) {
        vx2.m53591g(recyclerItemSwipeHelper, "this$0");
        RecyclerView.Adapter adapter = recyclerItemSwipeHelper.f43310c.getAdapter();
        vx2.m53588d(adapter);
        vx2.m53590f(num, "pos");
        adapter.notifyItemChanged(num.intValue());
    }

    /* renamed from: l */
    public final void mo62206l() {
        new C1314k(new C8957b()).mo9836g(this.f43310c);
    }

    /* renamed from: m */
    public final ez2 mo62207m() {
        return this.f43309b;
    }

    /* renamed from: n */
    public abstract void mo57512n(RecyclerView.C1231a0 a0Var, List<C8958c> list);

    /* renamed from: o */
    public final synchronized void mo62208o() {
        while (!this.f43314g.isEmpty()) {
            Integer poll = this.f43314g.poll();
            vx2.m53590f(poll, "pos");
            if (poll.intValue() > -1) {
                this.f43310c.post(new f95(this, poll));
            }
        }
    }
}
