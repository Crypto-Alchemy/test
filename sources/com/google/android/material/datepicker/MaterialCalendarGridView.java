package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f23761a;

    /* renamed from: d */
    public final boolean f23762d;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C4272a extends C3715z7 {
        public C4272a() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26243h0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static int m35266c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    public static boolean m35267d(Long l, Long l2, Long l3, Long l4) {
        if (l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo32553a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo32632i());
        } else if (i == 130) {
            setSelection(getAdapter().mo32620b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: b */
    public C4287c getAdapter() {
        return (C4287c) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C4287c b = getAdapter();
        DateSelector<?> dateSelector = b.f23824d;
        j90 j90 = b.f23826g;
        Long c = b.getItem(b.mo32620b());
        Long c2 = b.getItem(b.mo32632i());
        for (jl4 next : dateSelector.mo32513B0()) {
            F f = next.f13688a;
            if (f != null) {
                if (next.f13689b != null) {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f13689b).longValue();
                    if (!m35267d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean h = pe7.m49902h(this);
                        if (longValue < c.longValue()) {
                            i2 = b.mo32620b();
                            if (b.mo32624f(i2)) {
                                i = 0;
                            } else if (!h) {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f23761a.setTimeInMillis(longValue);
                            i2 = b.mo32619a(materialCalendarGridView.f23761a.get(5));
                            i = m35266c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = Math.min(b.mo32632i(), getChildCount() - 1);
                            if (b.mo32625g(i4)) {
                                i3 = getWidth();
                            } else if (!h) {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f23761a.setTimeInMillis(longValue2);
                            i4 = b.mo32619a(materialCalendarGridView.f23761a.get(5));
                            i3 = m35266c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + j90.f30249a.mo43520c();
                            int bottom = childAt.getBottom() - j90.f30249a.mo43519b();
                            if (!h) {
                                if (numColumns > i2) {
                                    i6 = 0;
                                } else {
                                    i6 = i;
                                }
                                if (i4 > numColumns2) {
                                    i5 = getWidth();
                                } else {
                                    i5 = i3;
                                }
                            } else {
                                if (i4 > numColumns2) {
                                    i7 = 0;
                                } else {
                                    i7 = i3;
                                }
                                if (numColumns > i2) {
                                    i8 = getWidth();
                                } else {
                                    i8 = i;
                                }
                                int i9 = i7;
                                i5 = i8;
                                i6 = i9;
                            }
                            canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, j90.f30256h);
                            itemId++;
                            materialCalendarGridView = this;
                            b = b;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            mo32553a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo32620b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo32620b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f23762d) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo32620b()) {
            super.setSelection(getAdapter().mo32620b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23761a = d67.m43375q();
        if (C4282b.m35340N(getContext())) {
            setNextFocusLeftId(g35.cancel_button);
            setNextFocusRightId(g35.confirm_button);
        }
        this.f23762d = C4282b.m35341O(getContext());
        ga7.m17785p0(this, new C4272a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C4287c) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C4287c.class.getCanonicalName()}));
        }
    }
}
