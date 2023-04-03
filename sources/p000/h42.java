package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C3997a;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;

/* renamed from: h42 */
/* compiled from: FlexboxItemDecoration */
public class h42 extends RecyclerView.C1247n {

    /* renamed from: c */
    public static final int[] f29432c = {16843284};

    /* renamed from: a */
    public Drawable f29433a;

    /* renamed from: b */
    public int f29434b;

    public h42(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f29432c);
        this.f29433a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        mo43081n(3);
    }

    /* renamed from: f */
    public final void mo43073f(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (mo43076i()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = recyclerView.getChildAt(i8);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    i2 = childAt.getBottom() + layoutParams.bottomMargin;
                    i = this.f29433a.getIntrinsicHeight() + i2;
                } else {
                    i = childAt.getTop() - layoutParams.topMargin;
                    i2 = i - this.f29433a.getIntrinsicHeight();
                }
                if (!flexboxLayoutManager.mo30221l()) {
                    i5 = childAt.getLeft() - layoutParams.leftMargin;
                    i7 = childAt.getRight();
                    i6 = layoutParams.rightMargin;
                } else if (flexboxLayoutManager.mo30262E2()) {
                    i3 = Math.min(childAt.getRight() + layoutParams.rightMargin + this.f29433a.getIntrinsicWidth(), right);
                    i4 = childAt.getLeft() - layoutParams.leftMargin;
                    this.f29433a.setBounds(i4, i2, i3, i);
                    this.f29433a.draw(canvas);
                } else {
                    i5 = Math.max((childAt.getLeft() - layoutParams.leftMargin) - this.f29433a.getIntrinsicWidth(), left);
                    i7 = childAt.getRight();
                    i6 = layoutParams.rightMargin;
                }
                int i9 = i5;
                i3 = i7 + i6;
                i4 = i9;
                this.f29433a.setBounds(i4, i2, i3, i);
                this.f29433a.draw(canvas);
            }
        }
    }

    /* renamed from: g */
    public final void mo43074g(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        int bottom;
        int i5;
        if (mo43077j()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = recyclerView.getChildAt(i6);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexboxLayoutManager.mo30262E2()) {
                    i2 = childAt.getRight() + layoutParams.rightMargin;
                    i = this.f29433a.getIntrinsicWidth() + i2;
                } else {
                    i = childAt.getLeft() - layoutParams.leftMargin;
                    i2 = i - this.f29433a.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.mo30221l()) {
                    i3 = childAt.getTop() - layoutParams.topMargin;
                    bottom = childAt.getBottom();
                    i5 = layoutParams.bottomMargin;
                } else if (flexDirection == 3) {
                    int min = Math.min(childAt.getBottom() + layoutParams.bottomMargin + this.f29433a.getIntrinsicHeight(), bottom2);
                    i3 = childAt.getTop() - layoutParams.topMargin;
                    i4 = min;
                    this.f29433a.setBounds(i2, i3, i, i4);
                    this.f29433a.draw(canvas);
                } else {
                    i3 = Math.max((childAt.getTop() - layoutParams.topMargin) - this.f29433a.getIntrinsicHeight(), top);
                    bottom = childAt.getBottom();
                    i5 = layoutParams.bottomMargin;
                }
                i4 = bottom + i5;
                this.f29433a.setBounds(i2, i3, i, i4);
                this.f29433a.draw(canvas);
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        int f0 = recyclerView.mo9041f0(view);
        if (f0 != 0) {
            if (mo43076i() || mo43077j()) {
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
                List<C3997a> A2 = flexboxLayoutManager.mo30258A2();
                mo43080m(rect, f0, flexboxLayoutManager, A2, flexboxLayoutManager.getFlexDirection());
                mo43079l(rect, f0, flexboxLayoutManager, A2);
                return;
            }
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: h */
    public final boolean mo43075h(int i, List<C3997a> list, FlexboxLayoutManager flexboxLayoutManager) {
        int B2 = flexboxLayoutManager.mo30259B2(i);
        if ((B2 != -1 && B2 < flexboxLayoutManager.getFlexLinesInternal().size() && flexboxLayoutManager.getFlexLinesInternal().get(B2).f22029o == i) || i == 0) {
            return true;
        }
        if (list.size() == 0) {
            return false;
        }
        if (list.get(list.size() - 1).f22030p == i - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo43076i() {
        if ((this.f29434b & 1) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo43077j() {
        if ((this.f29434b & 2) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void mo43078k(Drawable drawable) {
        if (drawable != null) {
            this.f29433a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: l */
    public final void mo43079l(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C3997a> list) {
        if (list.size() != 0 && flexboxLayoutManager.mo30259B2(i) != 0) {
            if (flexboxLayoutManager.mo30221l()) {
                if (!mo43076i()) {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                }
                rect.top = this.f29433a.getIntrinsicHeight();
                rect.bottom = 0;
            } else if (mo43077j()) {
                if (flexboxLayoutManager.mo30262E2()) {
                    rect.right = this.f29433a.getIntrinsicWidth();
                    rect.left = 0;
                    return;
                }
                rect.left = this.f29433a.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    /* renamed from: m */
    public final void mo43080m(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C3997a> list, int i2) {
        if (!mo43075h(i, list, flexboxLayoutManager)) {
            if (flexboxLayoutManager.mo30221l()) {
                if (!mo43077j()) {
                    rect.left = 0;
                    rect.right = 0;
                } else if (flexboxLayoutManager.mo30262E2()) {
                    rect.right = this.f29433a.getIntrinsicWidth();
                    rect.left = 0;
                } else {
                    rect.left = this.f29433a.getIntrinsicWidth();
                    rect.right = 0;
                }
            } else if (!mo43076i()) {
                rect.top = 0;
                rect.bottom = 0;
            } else if (i2 == 3) {
                rect.bottom = this.f29433a.getIntrinsicHeight();
                rect.top = 0;
            } else {
                rect.top = this.f29433a.getIntrinsicHeight();
                rect.bottom = 0;
            }
        }
    }

    /* renamed from: n */
    public void mo43081n(int i) {
        this.f29434b = i;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        mo43073f(canvas, recyclerView);
        mo43074g(canvas, recyclerView);
    }
}
