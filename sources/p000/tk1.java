package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: tk1 */
/* compiled from: DropDownListView */
public class tk1 extends ListView {

    /* renamed from: A */
    public boolean f18165A;

    /* renamed from: B */
    public boolean f18166B;

    /* renamed from: C */
    public vd7 f18167C;

    /* renamed from: H */
    public fi3 f18168H;

    /* renamed from: I */
    public C3373d f18169I;

    /* renamed from: a */
    public final Rect f18170a = new Rect();

    /* renamed from: d */
    public int f18171d = 0;

    /* renamed from: e */
    public int f18172e = 0;

    /* renamed from: g */
    public int f18173g = 0;

    /* renamed from: k */
    public int f18174k = 0;

    /* renamed from: r */
    public int f18175r;

    /* renamed from: s */
    public Field f18176s;

    /* renamed from: x */
    public C3372c f18177x;

    /* renamed from: y */
    public boolean f18178y;

    /* renamed from: tk1$a */
    /* compiled from: DropDownListView */
    public static class C3370a {
        /* renamed from: a */
        public static void m27805a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: tk1$b */
    /* compiled from: DropDownListView */
    public static class C3371b {

        /* renamed from: a */
        public static Method f18179a;

        /* renamed from: b */
        public static Method f18180b;

        /* renamed from: c */
        public static Method f18181c;

        /* renamed from: d */
        public static boolean f18182d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f18179a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f18180b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f18181c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m27806a() {
            return f18182d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static void m27807b(tk1 tk1, int i, View view) {
            try {
                f18179a.invoke(tk1, new Object[]{Integer.valueOf(i), view, Boolean.FALSE, -1, -1});
                f18180b.invoke(tk1, new Object[]{Integer.valueOf(i)});
                f18181c.invoke(tk1, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: tk1$c */
    /* compiled from: DropDownListView */
    public static class C3372c extends yj1 {

        /* renamed from: d */
        public boolean f18183d = true;

        public C3372c(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: b */
        public void mo26490b(boolean z) {
            this.f18183d = z;
        }

        public void draw(Canvas canvas) {
            if (this.f18183d) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f18183d) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f18183d) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f18183d) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f18183d) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: tk1$d */
    /* compiled from: DropDownListView */
    public class C3373d implements Runnable {
        public C3373d() {
        }

        /* renamed from: a */
        public void mo26496a() {
            tk1 tk1 = tk1.this;
            tk1.f18169I = null;
            tk1.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo26497b() {
            tk1.this.post(this);
        }

        public void run() {
            tk1 tk1 = tk1.this;
            tk1.f18169I = null;
            tk1.drawableStateChanged();
        }
    }

    public tk1(Context context, boolean z) {
        super(context, (AttributeSet) null, m15.dropDownListViewStyle);
        this.f18165A = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f18176s = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        C3372c cVar = this.f18177x;
        if (cVar != null) {
            cVar.mo26490b(z);
        }
    }

    /* renamed from: a */
    public final void mo26477a() {
        this.f18166B = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f18175r - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        vd7 vd7 = this.f18167C;
        if (vd7 != null) {
            vd7.mo27116c();
            this.f18167C = null;
        }
    }

    /* renamed from: b */
    public final void mo26478b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void mo26479c(Canvas canvas) {
        Drawable selector;
        if (!this.f18170a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f18170a);
            selector.draw(canvas);
        }
    }

    /* renamed from: d */
    public int mo2223d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 < i4) {
                if (i5 >= 0 && i8 >= i5) {
                    i10 = i7;
                }
                i8++;
            } else if (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) {
                return i4;
            } else {
                return i10;
            }
        }
        return i7;
    }

    public void dispatchDraw(Canvas canvas) {
        mo26479c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f18169I == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            mo26487k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2224e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = r1
            r3 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r1
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r2
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.mo26485i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.mo26478b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.mo26477a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            fi3 r9 = r7.f18168H
            if (r9 != 0) goto L_0x005a
            fi3 r9 = new fi3
            r9.<init>(r7)
            r7.f18168H = r9
        L_0x005a:
            fi3 r9 = r7.f18168H
            r9.mo28213m(r2)
            fi3 r9 = r7.f18168H
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            fi3 r8 = r7.f18168H
            if (r8 == 0) goto L_0x006c
            r8.mo28213m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tk1.mo2224e(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: f */
    public final void mo26482f(int i, View view) {
        boolean z;
        Rect rect = this.f18170a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f18171d;
        rect.top -= this.f18172e;
        rect.right += this.f18173g;
        rect.bottom += this.f18174k;
        try {
            boolean z2 = this.f18176s.getBoolean(this);
            if (view.isEnabled() != z2) {
                Field field = this.f18176s;
                if (!z2) {
                    z = true;
                } else {
                    z = false;
                }
                field.set(this, Boolean.valueOf(z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void mo26483g(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        mo26482f(i, view);
        if (z) {
            Rect rect = this.f18170a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            ij1.m19652k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    public final void mo26484h(int i, View view, float f, float f2) {
        mo26483g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            ij1.m19652k(selector, f, f2);
        }
    }

    public boolean hasFocus() {
        if (this.f18165A || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.f18165A || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo26485i(View view, int i, float f, float f2) {
        View childAt;
        this.f18166B = true;
        C3370a.m27805a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f18175r;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f18175r = i;
        C3370a.m27805a(view, f - ((float) view.getLeft()), f2 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        mo26484h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    public boolean isFocused() {
        if (this.f18165A || super.isFocused()) {
            return true;
        }
        return false;
    }

    public boolean isInTouchMode() {
        if ((!this.f18165A || !this.f18178y) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo26486j() {
        return this.f18166B;
    }

    /* renamed from: k */
    public final void mo26487k() {
        Drawable selector = getSelector();
        if (selector != null && mo26486j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void onDetachedFromWindow() {
        this.f18169I = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f18169I == null) {
            C3373d dVar = new C3373d();
            this.f18169I = dVar;
            dVar.mo26497b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C3371b.m27806a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C3371b.m27807b(this, pointToPosition, childAt);
                    }
                }
                mo26487k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f18175r = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C3373d dVar = this.f18169I;
        if (dVar != null) {
            dVar.mo26496a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f18178y = z;
    }

    public void setSelector(Drawable drawable) {
        C3372c cVar;
        if (drawable != null) {
            cVar = new C3372c(drawable);
        } else {
            cVar = null;
        }
        this.f18177x = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f18171d = rect.left;
        this.f18172e = rect.top;
        this.f18173g = rect.right;
        this.f18174k = rect.bottom;
    }
}
