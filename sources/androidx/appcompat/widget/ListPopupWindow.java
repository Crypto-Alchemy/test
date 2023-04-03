package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.media3.common.PlaybackException;
import java.lang.reflect.Method;

public class ListPopupWindow implements w06 {

    /* renamed from: t1 */
    public static Method f1083t1;

    /* renamed from: u1 */
    public static Method f1084u1;

    /* renamed from: v1 */
    public static Method f1085v1;

    /* renamed from: A */
    public boolean f1086A;

    /* renamed from: B */
    public boolean f1087B;

    /* renamed from: C */
    public int f1088C;

    /* renamed from: H */
    public boolean f1089H;

    /* renamed from: I */
    public boolean f1090I;

    /* renamed from: L */
    public int f1091L;

    /* renamed from: M */
    public View f1092M;

    /* renamed from: P */
    public int f1093P;

    /* renamed from: Q */
    public DataSetObserver f1094Q;

    /* renamed from: U */
    public View f1095U;

    /* renamed from: X */
    public Drawable f1096X;

    /* renamed from: Y */
    public AdapterView.OnItemClickListener f1097Y;

    /* renamed from: Z */
    public AdapterView.OnItemSelectedListener f1098Z;

    /* renamed from: a */
    public Context f1099a;

    /* renamed from: b1 */
    public final C0233e f1100b1;

    /* renamed from: d */
    public ListAdapter f1101d;

    /* renamed from: e */
    public tk1 f1102e;

    /* renamed from: e0 */
    public final C0237i f1103e0;

    /* renamed from: e1 */
    public Runnable f1104e1;

    /* renamed from: g */
    public int f1105g;

    /* renamed from: k */
    public int f1106k;

    /* renamed from: k0 */
    public final C0236h f1107k0;

    /* renamed from: o1 */
    public final Handler f1108o1;

    /* renamed from: p1 */
    public final Rect f1109p1;

    /* renamed from: q1 */
    public Rect f1110q1;

    /* renamed from: r */
    public int f1111r;

    /* renamed from: r1 */
    public boolean f1112r1;

    /* renamed from: s */
    public int f1113s;

    /* renamed from: s1 */
    public PopupWindow f1114s1;

    /* renamed from: v0 */
    public final C0235g f1115v0;

    /* renamed from: x */
    public int f1116x;

    /* renamed from: y */
    public boolean f1117y;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    public class C0229a implements Runnable {
        public C0229a() {
        }

        public void run() {
            View t = ListPopupWindow.this.mo2202t();
            if (t != null && t.getWindowToken() != null) {
                ListPopupWindow.this.mo1329c();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    public class C0230b implements AdapterView.OnItemSelectedListener {
        public C0230b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            tk1 tk1;
            if (i != -1 && (tk1 = ListPopupWindow.this.f1102e) != null) {
                tk1.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    public static class C0231c {
        /* renamed from: a */
        public static int m1434a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    public static class C0232d {
        /* renamed from: a */
        public static void m1435a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        public static void m1436b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    public class C0233e implements Runnable {
        public C0233e() {
        }

        public void run() {
            ListPopupWindow.this.mo2200r();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    public class C0234f extends DataSetObserver {
        public C0234f() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.mo1328a()) {
                ListPopupWindow.this.mo1329c();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    public class C0235g implements AbsListView.OnScrollListener {
        public C0235g() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo2176A() && ListPopupWindow.this.f1114s1.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1108o1.removeCallbacks(listPopupWindow.f1103e0);
                ListPopupWindow.this.f1103e0.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$h */
    public class C0236h implements View.OnTouchListener {
        public C0236h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f1114s1) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f1114s1.getWidth() && y >= 0 && y < ListPopupWindow.this.f1114s1.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1108o1.postDelayed(listPopupWindow.f1103e0, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f1108o1.removeCallbacks(listPopupWindow2.f1103e0);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$i */
    public class C0237i implements Runnable {
        public C0237i() {
        }

        public void run() {
            tk1 tk1 = ListPopupWindow.this.f1102e;
            if (tk1 != null && ga7.m17746S(tk1) && ListPopupWindow.this.f1102e.getCount() > ListPopupWindow.this.f1102e.getChildCount()) {
                int childCount = ListPopupWindow.this.f1102e.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f1091L) {
                    listPopupWindow.f1114s1.setInputMethodMode(2);
                    ListPopupWindow.this.mo1329c();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1083t1 = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1085v1 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1084u1 = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, m15.listPopupWindowStyle);
    }

    /* renamed from: A */
    public boolean mo2176A() {
        if (this.f1114s1.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean mo2177B() {
        return this.f1112r1;
    }

    /* renamed from: C */
    public final void mo2178C() {
        View view = this.f1092M;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1092M);
            }
        }
    }

    /* renamed from: D */
    public void mo2179D(View view) {
        this.f1095U = view;
    }

    /* renamed from: E */
    public void mo2180E(int i) {
        this.f1114s1.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void mo2181F(int i) {
        Drawable background = this.f1114s1.getBackground();
        if (background != null) {
            background.getPadding(this.f1109p1);
            Rect rect = this.f1109p1;
            this.f1106k = rect.left + rect.right + i;
            return;
        }
        mo2192Q(i);
    }

    /* renamed from: G */
    public void mo2182G(int i) {
        this.f1088C = i;
    }

    /* renamed from: H */
    public void mo2183H(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.f1110q1 = rect2;
    }

    /* renamed from: I */
    public void mo2184I(int i) {
        this.f1114s1.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void mo2185J(boolean z) {
        this.f1112r1 = z;
        this.f1114s1.setFocusable(z);
    }

    /* renamed from: K */
    public void mo2186K(PopupWindow.OnDismissListener onDismissListener) {
        this.f1114s1.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void mo2187L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1097Y = onItemClickListener;
    }

    /* renamed from: M */
    public void mo2188M(boolean z) {
        this.f1087B = true;
        this.f1086A = z;
    }

    /* renamed from: N */
    public final void mo2189N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1083t1;
            if (method != null) {
                try {
                    method.invoke(this.f1114s1, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            C0232d.m1436b(this.f1114s1, z);
        }
    }

    /* renamed from: O */
    public void mo2190O(int i) {
        this.f1093P = i;
    }

    /* renamed from: P */
    public void mo2191P(int i) {
        tk1 tk1 = this.f1102e;
        if (mo1328a() && tk1 != null) {
            tk1.setListSelectionHidden(false);
            tk1.setSelection(i);
            if (tk1.getChoiceMode() != 0) {
                tk1.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: Q */
    public void mo2192Q(int i) {
        this.f1106k = i;
    }

    /* renamed from: a */
    public boolean mo1328a() {
        return this.f1114s1.isShowing();
    }

    /* renamed from: b */
    public void mo2193b(Drawable drawable) {
        this.f1114s1.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public void mo1329c() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int q = mo2199q();
        boolean A = mo2176A();
        kt4.m21073b(this.f1114s1, this.f1116x);
        boolean z2 = true;
        if (!this.f1114s1.isShowing()) {
            int i5 = this.f1106k;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = mo2202t().getWidth();
            }
            int i6 = this.f1105g;
            if (i6 == -1) {
                q = -1;
            } else if (i6 != -2) {
                q = i6;
            }
            this.f1114s1.setWidth(i5);
            this.f1114s1.setHeight(q);
            mo2189N(true);
            PopupWindow popupWindow = this.f1114s1;
            if (this.f1090I || this.f1089H) {
                z = false;
            } else {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1114s1.setTouchInterceptor(this.f1107k0);
            if (this.f1087B) {
                kt4.m21072a(this.f1114s1, this.f1086A);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1085v1;
                if (method != null) {
                    try {
                        method.invoke(this.f1114s1, new Object[]{this.f1110q1});
                    } catch (Exception unused) {
                    }
                }
            } else {
                C0232d.m1435a(this.f1114s1, this.f1110q1);
            }
            kt4.m21074c(this.f1114s1, mo2202t(), this.f1111r, this.f1113s, this.f1088C);
            this.f1102e.setSelection(-1);
            if (!this.f1112r1 || this.f1102e.isInTouchMode()) {
                mo2200r();
            }
            if (!this.f1112r1) {
                this.f1108o1.post(this.f1100b1);
            }
        } else if (ga7.m17746S(mo2202t())) {
            int i7 = this.f1106k;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = mo2202t().getWidth();
            }
            int i8 = this.f1105g;
            if (i8 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    PopupWindow popupWindow2 = this.f1114s1;
                    if (this.f1106k == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow2.setWidth(i4);
                    this.f1114s1.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f1114s1;
                    if (this.f1106k == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow3.setWidth(i3);
                    this.f1114s1.setHeight(-1);
                }
            } else if (i8 != -2) {
                q = i8;
            }
            PopupWindow popupWindow4 = this.f1114s1;
            if (this.f1090I || this.f1089H) {
                z2 = false;
            }
            popupWindow4.setOutsideTouchable(z2);
            PopupWindow popupWindow5 = this.f1114s1;
            View t = mo2202t();
            int i9 = this.f1111r;
            int i10 = this.f1113s;
            if (i7 < 0) {
                i = -1;
            } else {
                i = i7;
            }
            if (q < 0) {
                i2 = -1;
            } else {
                i2 = q;
            }
            popupWindow5.update(t, i9, i10, i, i2);
        }
    }

    /* renamed from: d */
    public int mo2194d() {
        return this.f1111r;
    }

    public void dismiss() {
        this.f1114s1.dismiss();
        mo2178C();
        this.f1114s1.setContentView((View) null);
        this.f1102e = null;
        this.f1108o1.removeCallbacks(this.f1103e0);
    }

    /* renamed from: f */
    public void mo2195f(int i) {
        this.f1111r = i;
    }

    /* renamed from: h */
    public Drawable mo2196h() {
        return this.f1114s1.getBackground();
    }

    /* renamed from: j */
    public void mo2197j(int i) {
        this.f1113s = i;
        this.f1117y = true;
    }

    /* renamed from: m */
    public int mo2198m() {
        if (!this.f1117y) {
            return 0;
        }
        return this.f1113s;
    }

    /* renamed from: n */
    public void mo2033n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1094Q;
        if (dataSetObserver == null) {
            this.f1094Q = new C0234f();
        } else {
            ListAdapter listAdapter2 = this.f1101d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1101d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1094Q);
        }
        tk1 tk1 = this.f1102e;
        if (tk1 != null) {
            tk1.setAdapter(this.f1101d);
        }
    }

    /* renamed from: p */
    public ListView mo1338p() {
        return this.f1102e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: tk1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: tk1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: tk1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2199q() {
        /*
            r12 = this;
            tk1 r0 = r12.f1102e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b5
            android.content.Context r0 = r12.f1099a
            androidx.appcompat.widget.ListPopupWindow$a r5 = new androidx.appcompat.widget.ListPopupWindow$a
            r5.<init>()
            r12.f1104e1 = r5
            boolean r5 = r12.f1112r1
            r5 = r5 ^ r3
            tk1 r5 = r12.mo2201s(r0, r5)
            r12.f1102e = r5
            android.graphics.drawable.Drawable r6 = r12.f1096X
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            tk1 r5 = r12.f1102e
            android.widget.ListAdapter r6 = r12.f1101d
            r5.setAdapter(r6)
            tk1 r5 = r12.f1102e
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1097Y
            r5.setOnItemClickListener(r6)
            tk1 r5 = r12.f1102e
            r5.setFocusable(r3)
            tk1 r5 = r12.f1102e
            r5.setFocusableInTouchMode(r3)
            tk1 r5 = r12.f1102e
            androidx.appcompat.widget.ListPopupWindow$b r6 = new androidx.appcompat.widget.ListPopupWindow$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            tk1 r5 = r12.f1102e
            androidx.appcompat.widget.ListPopupWindow$g r6 = r12.f1115v0
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1098Z
            if (r5 == 0) goto L_0x0054
            tk1 r6 = r12.f1102e
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            tk1 r5 = r12.f1102e
            android.view.View r6 = r12.f1092M
            if (r6 == 0) goto L_0x00ae
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1093P
            if (r8 == 0) goto L_0x0086
            if (r8 == r3) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1093P
            r0.append(r5)
            goto L_0x008c
        L_0x007f:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008c
        L_0x0086:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008c:
            int r0 = r12.f1106k
            if (r0 < 0) goto L_0x0092
            r5 = r1
            goto L_0x0094
        L_0x0092:
            r0 = r4
            r5 = r0
        L_0x0094:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            android.widget.PopupWindow r6 = r12.f1114s1
            r6.setContentView(r5)
            goto L_0x00d3
        L_0x00b5:
            android.widget.PopupWindow r0 = r12.f1114s1
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1092M
            if (r0 == 0) goto L_0x00d2
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d3
        L_0x00d2:
            r0 = r4
        L_0x00d3:
            android.widget.PopupWindow r5 = r12.f1114s1
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00ef
            android.graphics.Rect r6 = r12.f1109p1
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1109p1
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1117y
            if (r7 != 0) goto L_0x00f5
            int r6 = -r6
            r12.f1113s = r6
            goto L_0x00f5
        L_0x00ef:
            android.graphics.Rect r5 = r12.f1109p1
            r5.setEmpty()
            r5 = r4
        L_0x00f5:
            android.widget.PopupWindow r6 = r12.f1114s1
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r3 = r4
        L_0x0100:
            android.view.View r4 = r12.mo2202t()
            int r6 = r12.f1113s
            int r3 = r12.mo2203u(r4, r6, r3)
            boolean r4 = r12.f1089H
            if (r4 != 0) goto L_0x0171
            int r4 = r12.f1105g
            if (r4 != r2) goto L_0x0113
            goto L_0x0171
        L_0x0113:
            int r4 = r12.f1106k
            r6 = -2
            if (r4 == r6) goto L_0x013a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0121
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0152
        L_0x0121:
            android.content.Context r2 = r12.f1099a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1109p1
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0152
        L_0x013a:
            android.content.Context r2 = r12.f1099a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1109p1
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0152:
            r7 = r1
            tk1 r6 = r12.f1102e
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2223d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x016f
            tk1 r2 = r12.f1102e
            int r2 = r2.getPaddingTop()
            tk1 r3 = r12.f1102e
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x016f:
            int r1 = r1 + r0
            return r1
        L_0x0171:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.mo2199q():int");
    }

    /* renamed from: r */
    public void mo2200r() {
        tk1 tk1 = this.f1102e;
        if (tk1 != null) {
            tk1.setListSelectionHidden(true);
            tk1.requestLayout();
        }
    }

    /* renamed from: s */
    public tk1 mo2201s(Context context, boolean z) {
        return new tk1(context, z);
    }

    /* renamed from: t */
    public View mo2202t() {
        return this.f1095U;
    }

    /* renamed from: u */
    public final int mo2203u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return C0231c.m1434a(this.f1114s1, view, i, z);
        }
        Method method = f1084u1;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1114s1, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f1114s1.getMaxAvailableHeight(view, i);
    }

    /* renamed from: v */
    public Object mo2204v() {
        if (!mo1328a()) {
            return null;
        }
        return this.f1102e.getSelectedItem();
    }

    /* renamed from: w */
    public long mo2205w() {
        if (!mo1328a()) {
            return Long.MIN_VALUE;
        }
        return this.f1102e.getSelectedItemId();
    }

    /* renamed from: x */
    public int mo2206x() {
        if (!mo1328a()) {
            return -1;
        }
        return this.f1102e.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View mo2207y() {
        if (!mo1328a()) {
            return null;
        }
        return this.f1102e.getSelectedView();
    }

    /* renamed from: z */
    public int mo2208z() {
        return this.f1106k;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1105g = -2;
        this.f1106k = -2;
        this.f1116x = PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW;
        this.f1088C = 0;
        this.f1089H = false;
        this.f1090I = false;
        this.f1091L = Integer.MAX_VALUE;
        this.f1093P = 0;
        this.f1103e0 = new C0237i();
        this.f1107k0 = new C0236h();
        this.f1115v0 = new C0235g();
        this.f1100b1 = new C0233e();
        this.f1109p1 = new Rect();
        this.f1099a = context;
        this.f1108o1 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j65.ListPopupWindow, i, i2);
        this.f1111r = obtainStyledAttributes.getDimensionPixelOffset(j65.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j65.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1113s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1117y = true;
        }
        obtainStyledAttributes.recycle();
        C2239en enVar = new C2239en(context, attributeSet, i, i2);
        this.f1114s1 = enVar;
        enVar.setInputMethodMode(1);
    }
}
