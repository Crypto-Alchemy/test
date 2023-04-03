package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: A */
    public C2532i9 f975A;

    /* renamed from: B */
    public final DataSetObserver f976B;

    /* renamed from: C */
    public final ViewTreeObserver.OnGlobalLayoutListener f977C;

    /* renamed from: H */
    public ListPopupWindow f978H;

    /* renamed from: I */
    public PopupWindow.OnDismissListener f979I;

    /* renamed from: L */
    public boolean f980L;

    /* renamed from: M */
    public int f981M;

    /* renamed from: P */
    public boolean f982P;

    /* renamed from: Q */
    public int f983Q;

    /* renamed from: a */
    public final C0213f f984a;

    /* renamed from: d */
    public final C0214g f985d;

    /* renamed from: e */
    public final View f986e;

    /* renamed from: g */
    public final Drawable f987g;

    /* renamed from: k */
    public final FrameLayout f988k;

    /* renamed from: r */
    public final ImageView f989r;

    /* renamed from: s */
    public final FrameLayout f990s;

    /* renamed from: x */
    public final ImageView f991x;

    /* renamed from: y */
    public final int f992y;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        public static final int[] f993a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            yq6 u = yq6.m30732u(context, attributeSet, f993a);
            setBackgroundDrawable(u.mo28181g(0));
            u.mo28194w();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0208a extends DataSetObserver {
        public C0208a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f984a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f984a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class C0209b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0209b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.mo1749b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().mo1329c();
            C2532i9 i9Var = ActivityChooserView.this.f975A;
            if (i9Var != null) {
                i9Var.mo21505k(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0210c extends View.AccessibilityDelegate {
        public C0210c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C3335t8.m27495S0(accessibilityNodeInfo).mo26232c0(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0211d extends k82 {
        public C0211d(View view) {
            super(view);
        }

        /* renamed from: b */
        public w06 mo1281b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* renamed from: c */
        public boolean mo1282c() {
            ActivityChooserView.this.mo1750c();
            return true;
        }

        /* renamed from: d */
        public boolean mo1713d() {
            ActivityChooserView.this.mo1748a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0212e extends DataSetObserver {
        public C0212e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mo1752e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0213f extends BaseAdapter {

        /* renamed from: a */
        public int f999a = 4;

        /* renamed from: d */
        public boolean f1000d;

        /* renamed from: e */
        public boolean f1001e;

        /* renamed from: g */
        public boolean f1002g;

        public C0213f() {
        }

        /* renamed from: a */
        public int mo1771a() {
            throw null;
        }

        /* renamed from: b */
        public C3473v9 mo1772b() {
            return null;
        }

        /* renamed from: c */
        public ResolveInfo mo1773c() {
            throw null;
        }

        /* renamed from: d */
        public int mo1774d() {
            throw null;
        }

        /* renamed from: e */
        public boolean mo1775e() {
            return this.f1000d;
        }

        /* renamed from: f */
        public void mo1776f(C3473v9 v9Var) {
            ActivityChooserView.this.f984a.mo1772b();
            notifyDataSetChanged();
        }

        public int getCount() {
            throw null;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            } else if (!this.f1000d) {
                throw null;
            } else {
                throw null;
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            if (!this.f1002g || i != getCount() - 1) {
                return 0;
            }
            return 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != j35.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(i45.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(j35.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(j35.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1000d || i != 0 || !this.f1001e) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(i45.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(j35.title)).setText(ActivityChooserView.this.getContext().getString(a55.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class C0214g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public C0214g() {
        }

        /* renamed from: a */
        public final void mo1783a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f979I;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f990s) {
                activityChooserView.mo1748a();
                ActivityChooserView.this.f984a.mo1773c();
                ActivityChooserView.this.f984a.mo1772b();
                throw null;
            } else if (view == activityChooserView.f988k) {
                activityChooserView.f980L = false;
                activityChooserView.mo1751d(activityChooserView.f981M);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            mo1783a();
            C2532i9 i9Var = ActivityChooserView.this.f975A;
            if (i9Var != null) {
                i9Var.mo21505k(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0213f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.mo1748a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f980L) {
                    activityChooserView.f984a.mo1775e();
                    ActivityChooserView.this.f984a.mo1772b();
                    throw null;
                } else if (i > 0) {
                    activityChooserView.f984a.mo1772b();
                    throw null;
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.mo1751d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f990s) {
                if (activityChooserView.f984a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f980L = true;
                    activityChooserView2.mo1751d(activityChooserView2.f981M);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo1748a() {
        if (!mo1749b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f977C);
        return true;
    }

    /* renamed from: b */
    public boolean mo1749b() {
        return getListPopupWindow().mo1328a();
    }

    /* renamed from: c */
    public boolean mo1750c() {
        if (mo1749b() || !this.f982P) {
            return false;
        }
        this.f980L = false;
        mo1751d(this.f981M);
        return true;
    }

    /* renamed from: d */
    public void mo1751d(int i) {
        this.f984a.mo1772b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: e */
    public void mo1752e() {
        if (this.f984a.getCount() > 0) {
            this.f988k.setEnabled(true);
        } else {
            this.f988k.setEnabled(false);
        }
        int a = this.f984a.mo1771a();
        int d = this.f984a.mo1774d();
        if (a == 1 || (a > 1 && d > 0)) {
            this.f990s.setVisibility(0);
            ResolveInfo c = this.f984a.mo1773c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f991x.setImageDrawable(c.loadIcon(packageManager));
            if (this.f983Q != 0) {
                CharSequence loadLabel = c.loadLabel(packageManager);
                this.f990s.setContentDescription(getContext().getString(this.f983Q, new Object[]{loadLabel}));
            }
        } else {
            this.f990s.setVisibility(8);
        }
        if (this.f990s.getVisibility() == 0) {
            this.f986e.setBackgroundDrawable(this.f987g);
        } else {
            this.f986e.setBackgroundDrawable((Drawable) null);
        }
    }

    public C3473v9 getDataModel() {
        this.f984a.mo1772b();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f978H == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f978H = listPopupWindow;
            listPopupWindow.mo2033n(this.f984a);
            this.f978H.mo2179D(this);
            this.f978H.mo2185J(true);
            this.f978H.mo2187L(this.f985d);
            this.f978H.mo2186K(this.f985d);
        }
        return this.f978H;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f984a.mo1772b();
        this.f982P = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f984a.mo1772b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f977C);
        }
        if (mo1749b()) {
            mo1748a();
        }
        this.f982P = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f986e.layout(0, 0, i3 - i, i4 - i2);
        if (!mo1749b()) {
            mo1748a();
        }
    }

    public void onMeasure(int i, int i2) {
        View view = this.f986e;
        if (this.f990s.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C3473v9 v9Var) {
        this.f984a.mo1776f(v9Var);
        if (mo1749b()) {
            mo1748a();
            mo1750c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f983Q = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f989r.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f989r.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f981M = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f979I = onDismissListener;
    }

    public void setProvider(C2532i9 i9Var) {
        this.f975A = i9Var;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f976B = new C0208a();
        this.f977C = new C0209b();
        this.f981M = 4;
        int[] iArr = j65.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ga7.m17781n0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f981M = obtainStyledAttributes.getInt(j65.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(j65.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(i45.abc_activity_chooser_view, this, true);
        C0214g gVar = new C0214g();
        this.f985d = gVar;
        View findViewById = findViewById(j35.activity_chooser_view_content);
        this.f986e = findViewById;
        this.f987g = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(j35.default_activity_button);
        this.f990s = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = j35.image;
        this.f991x = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(j35.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C0210c());
        frameLayout2.setOnTouchListener(new C0211d(frameLayout2));
        this.f988k = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f989r = imageView;
        imageView.setImageDrawable(drawable);
        C0213f fVar = new C0213f();
        this.f984a = fVar;
        fVar.registerDataSetObserver(new C0212e());
        Resources resources = context.getResources();
        this.f992y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(n25.abc_config_prefDialogWidth));
    }
}
