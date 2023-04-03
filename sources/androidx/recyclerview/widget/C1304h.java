package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
/* compiled from: DividerItemDecoration */
public class C1304h extends RecyclerView.C1247n {

    /* renamed from: d */
    public static final int[] f6699d = {16843284};

    /* renamed from: a */
    public Drawable f6700a;

    /* renamed from: b */
    public int f6701b;

    /* renamed from: c */
    public final Rect f6702c = new Rect();

    public C1304h(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6699d);
        this.f6700a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        mo9788h(i);
    }

    /* renamed from: f */
    public final void mo9786f(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo9242a0(childAt, this.f6702c);
            int round = this.f6702c.right + Math.round(childAt.getTranslationX());
            this.f6700a.setBounds(round - this.f6700a.getIntrinsicWidth(), i2, round, i);
            this.f6700a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: g */
    public final void mo9787g(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.mo9077j0(childAt, this.f6702c);
            int round = this.f6702c.bottom + Math.round(childAt.getTranslationY());
            this.f6700a.setBounds(i2, round - this.f6700a.getIntrinsicHeight(), i, round);
            this.f6700a.draw(canvas);
        }
        canvas.restore();
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        Drawable drawable = this.f6700a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f6701b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: h */
    public void mo9788h(int i) {
        if (i == 0 || i == 1) {
            this.f6701b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        if (recyclerView.getLayoutManager() != null && this.f6700a != null) {
            if (this.f6701b == 1) {
                mo9787g(canvas, recyclerView);
            } else {
                mo9786f(canvas, recyclerView);
            }
        }
    }
}
