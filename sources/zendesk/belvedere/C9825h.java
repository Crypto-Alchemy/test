package zendesk.belvedere;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C1283f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C9807c;
import zendesk.belvedere.KeyboardHelper;

/* renamed from: zendesk.belvedere.h */
/* compiled from: ImageStreamUi */
public class C9825h extends PopupWindow implements C9820f {

    /* renamed from: a */
    public final C9821g f46735a;

    /* renamed from: b */
    public final C9807c f46736b = new C9807c();

    /* renamed from: c */
    public final List<Integer> f46737c;

    /* renamed from: d */
    public KeyboardHelper f46738d;

    /* renamed from: e */
    public View f46739e;

    /* renamed from: f */
    public View f46740f;

    /* renamed from: g */
    public View f46741g;

    /* renamed from: h */
    public View f46742h;

    /* renamed from: i */
    public FloatingActionMenu f46743i;

    /* renamed from: j */
    public RecyclerView f46744j;

    /* renamed from: k */
    public Toolbar f46745k;

    /* renamed from: l */
    public BottomSheetBehavior<View> f46746l;

    /* renamed from: m */
    public Activity f46747m;

    /* renamed from: zendesk.belvedere.h$a */
    /* compiled from: ImageStreamUi */
    public class C9826a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f46748a;

        public C9826a(boolean z) {
            this.f46748a = z;
        }

        public void onClick(View view) {
            if (!this.f46748a) {
                C9825h.this.f46746l.mo31876V(4);
            } else {
                C9825h.this.dismiss();
            }
        }
    }

    /* renamed from: zendesk.belvedere.h$b */
    /* compiled from: ImageStreamUi */
    public class C9827b extends BottomSheetBehavior.C4212g {
        public C9827b() {
        }

        /* renamed from: a */
        public void mo31909a(View view, float f) {
        }

        /* renamed from: b */
        public void mo31910b(View view, int i) {
            if (i == 5) {
                C9825h.this.dismiss();
            }
        }
    }

    /* renamed from: zendesk.belvedere.h$c */
    /* compiled from: ImageStreamUi */
    public class C9828c implements KeyboardHelper.C9792d {
        public C9828c() {
        }

        /* renamed from: a */
        public void mo73677a(int i) {
            if (i != C9825h.this.f46746l.mo31856B()) {
                C9825h.this.f46746l.mo31872R(C9825h.this.f46739e.getPaddingTop() + C9825h.this.f46738d.getKeyboardHeight());
            }
        }
    }

    /* renamed from: zendesk.belvedere.h$d */
    /* compiled from: ImageStreamUi */
    public class C9829d implements View.OnClickListener {
        public C9829d() {
        }

        public void onClick(View view) {
            C9825h.this.f46735a.mo73783j();
            C9825h.this.dismiss();
        }
    }

    /* renamed from: zendesk.belvedere.h$e */
    /* compiled from: ImageStreamUi */
    public class C9830e implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ List f46753a;

        /* renamed from: d */
        public final /* synthetic */ Activity f46754d;

        public C9830e(List list, Activity activity) {
            this.f46753a = list;
            this.f46754d = activity;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            boolean z3;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            Iterator it = this.f46753a.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                View findViewById = this.f46754d.findViewById(((Integer) it.next()).intValue());
                if (findViewById != null) {
                    Rect rect = new Rect();
                    findViewById.getGlobalVisibleRect(rect);
                    if (rawX < rect.left || rawX > rect.right) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (rawY < rect.top || rawY > rect.bottom) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        this.f46754d.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
                        break;
                    }
                }
            }
            if (z) {
                C9825h.this.dismiss();
            }
            return true;
        }
    }

    /* renamed from: zendesk.belvedere.h$f */
    /* compiled from: ImageStreamUi */
    public class C9831f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ Window f46756a;

        /* renamed from: d */
        public final /* synthetic */ ValueAnimator f46757d;

        public C9831f(Window window, ValueAnimator valueAnimator) {
            this.f46756a = window;
            this.f46757d = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f46756a.setStatusBarColor(((Integer) this.f46757d.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: zendesk.belvedere.h$g */
    /* compiled from: ImageStreamUi */
    public class C9832g extends CoordinatorLayout.Behavior<View> {

        /* renamed from: a */
        public final boolean f46759a;

        public /* synthetic */ C9832g(C9825h hVar, boolean z, C9826a aVar) {
            this(z);
        }

        /* renamed from: a */
        public final void mo73799a(int i, float f, int i2, View view) {
            float f2 = (float) i;
            float f3 = f2 - (f * f2);
            float f4 = (float) i2;
            if (f3 <= f4) {
                n77.m75289f(C9825h.this.getContentView(), true);
                view.setAlpha(1.0f - (f3 / f4));
                view.setY(f3);
            } else {
                n77.m75289f(C9825h.this.getContentView(), false);
            }
            C9825h.this.mo73794w(f);
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2.getId() == m35.bottom_sheet) {
                return true;
            }
            return false;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int height = coordinatorLayout.getHeight() - C9825h.this.f46746l.mo31856B();
            float height2 = ((((float) coordinatorLayout.getHeight()) - view2.getY()) - ((float) C9825h.this.f46746l.mo31856B())) / ((float) height);
            mo73799a(height, height2, ga7.m17717C(C9825h.this.f46745k), view);
            if (!this.f46759a) {
                return true;
            }
            C9825h.this.f46735a.mo73781h(coordinatorLayout.getHeight(), height, height2);
            return true;
        }

        public C9832g(boolean z) {
            this.f46759a = z;
        }
    }

    public C9825h(Activity activity, View view, C9802b bVar, BelvedereUi.UiConfig uiConfig) {
        super(view, -1, -1, false);
        setInputMethodMode(2);
        setFocusable(true);
        setTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        mo73788p(view);
        this.f46747m = activity;
        this.f46738d = bVar.mo73734l();
        this.f46737c = uiConfig.mo73621e();
        C9821g gVar = new C9821g(new C9819e(view.getContext(), uiConfig), this, bVar);
        this.f46735a = gVar;
        gVar.mo73779f();
    }

    /* renamed from: v */
    public static C9825h m75530v(Activity activity, ViewGroup viewGroup, C9802b bVar, BelvedereUi.UiConfig uiConfig) {
        C9825h hVar = new C9825h(activity, LayoutInflater.from(activity).inflate(h45.belvedere_image_stream, viewGroup, false), bVar, uiConfig);
        hVar.showAtLocation(viewGroup, 48, 0, 0);
        return hVar;
    }

    /* renamed from: a */
    public void mo73769a(int i) {
        if (i == 0) {
            this.f46743i.mo73653g();
        } else {
            this.f46743i.mo73658l();
        }
    }

    /* renamed from: b */
    public void mo73770b(List<MediaResult> list, List<MediaResult> list2, boolean z, boolean z2, C9807c.C9809b bVar) {
        if (!z) {
            KeyboardHelper.m75400o(this.f46738d.getInputTrap());
        }
        ViewGroup.LayoutParams layoutParams = this.f46739e.getLayoutParams();
        layoutParams.height = -1;
        this.f46739e.setLayoutParams(layoutParams);
        if (z2) {
            this.f46736b.mo73753a(C9810d.m75470a(bVar));
        }
        this.f46736b.mo73754b(C9810d.m75471b(list, bVar, this.f46739e.getContext()));
        this.f46736b.mo73755c(list2);
        this.f46736b.notifyDataSetChanged();
    }

    /* renamed from: c */
    public void mo73771c(View.OnClickListener onClickListener) {
        FloatingActionMenu floatingActionMenu = this.f46743i;
        if (floatingActionMenu != null) {
            floatingActionMenu.mo73649c(w25.belvedere_ic_file, m35.belvedere_fam_item_documents, q45.belvedere_fam_desc_open_gallery, onClickListener);
        }
    }

    /* renamed from: d */
    public void mo73772d(View.OnClickListener onClickListener) {
        FloatingActionMenu floatingActionMenu = this.f46743i;
        if (floatingActionMenu != null) {
            floatingActionMenu.mo73649c(w25.belvedere_ic_collections, m35.belvedere_fam_item_google_photos, q45.belvedere_fam_desc_open_google_photos, onClickListener);
        }
    }

    public void dismiss() {
        super.dismiss();
        mo73794w(Utils.FLOAT_EPSILON);
        this.f46735a.mo73778e();
    }

    /* renamed from: e */
    public void mo73773e(int i) {
        Toast.makeText(this.f46747m, i, 0).show();
    }

    /* renamed from: f */
    public boolean mo73774f() {
        boolean z;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (Build.VERSION.SDK_INT >= 24 && (this.f46747m.isInMultiWindowMode() || this.f46747m.isInPictureInPictureMode())) {
            return true;
        }
        if (this.f46747m.getResources().getConfiguration().keyboard != 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f46747m.getSystemService("accessibility");
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(47)) == null || enabledAccessibilityServiceList.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo73775g(boolean z) {
        mo73792t(this.f46736b);
        mo73793u(z);
        mo73789q(z);
        mo73791s(this.f46747m, this.f46737c);
        mo73790r(this.f46743i);
    }

    /* renamed from: h */
    public void mo73776h(MediaIntent mediaIntent, C9802b bVar) {
        mediaIntent.mo73683f(bVar);
    }

    /* renamed from: i */
    public void mo73777i(int i) {
        if (i > 0) {
            String string = this.f46747m.getString(q45.belvedere_image_stream_title);
            this.f46745k.setTitle((CharSequence) String.format(Locale.getDefault(), "%s (%d)", new Object[]{string, Integer.valueOf(i)}));
            return;
        }
        this.f46745k.setTitle(q45.belvedere_image_stream_title);
    }

    /* renamed from: p */
    public final void mo73788p(View view) {
        this.f46739e = view.findViewById(m35.bottom_sheet);
        this.f46740f = view.findViewById(m35.dismiss_area);
        this.f46744j = (RecyclerView) view.findViewById(m35.image_list);
        this.f46745k = (Toolbar) view.findViewById(m35.image_stream_toolbar);
        this.f46741g = view.findViewById(m35.image_stream_toolbar_container);
        this.f46742h = view.findViewById(m35.image_stream_compat_shadow);
        this.f46743i = (FloatingActionMenu) view.findViewById(m35.floating_action_menu);
    }

    /* renamed from: q */
    public final void mo73789q(boolean z) {
        ga7.m17801x0(this.f46744j, (float) this.f46739e.getContext().getResources().getDimensionPixelSize(d25.belvedere_bottom_sheet_elevation));
        BottomSheetBehavior<View> y = BottomSheetBehavior.m34816y(this.f46739e);
        this.f46746l = y;
        y.mo31888o(new C9827b());
        n77.m75289f(getContentView(), false);
        if (!z) {
            this.f46746l.mo31872R(this.f46739e.getPaddingTop() + this.f46738d.getKeyboardHeight());
            this.f46746l.mo31876V(4);
            this.f46738d.setKeyboardHeightListener(new C9828c());
        } else {
            this.f46746l.mo31875U(true);
            this.f46746l.mo31876V(3);
            KeyboardHelper.m75398k(this.f46747m);
        }
        this.f46744j.setClickable(true);
        this.f46739e.setVisibility(0);
    }

    /* renamed from: r */
    public final void mo73790r(FloatingActionMenu floatingActionMenu) {
        floatingActionMenu.setOnSendClickListener(new C9829d());
    }

    /* renamed from: s */
    public final void mo73791s(Activity activity, List<Integer> list) {
        this.f46740f.setOnTouchListener(new C9830e(list, activity));
    }

    /* renamed from: t */
    public final void mo73792t(C9807c cVar) {
        this.f46744j.setLayoutManager(new StaggeredGridLayoutManager(this.f46739e.getContext().getResources().getInteger(y35.belvedere_image_stream_column_count), 1));
        this.f46744j.setHasFixedSize(true);
        this.f46744j.setDrawingCacheEnabled(true);
        this.f46744j.setDrawingCacheQuality(1048576);
        C1283f fVar = new C1283f();
        fVar.setSupportsChangeAnimations(false);
        this.f46744j.setItemAnimator(fVar);
        this.f46744j.setAdapter(cVar);
    }

    /* renamed from: u */
    public final void mo73793u(boolean z) {
        this.f46745k.setNavigationIcon(w25.belvedere_ic_close);
        this.f46745k.setNavigationContentDescription(q45.belvedere_toolbar_desc_collapse);
        this.f46745k.setBackgroundColor(-1);
        this.f46745k.setNavigationOnClickListener(new C9826a(z));
        CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) this.f46741g.getLayoutParams();
        if (eVar != null) {
            eVar.mo5303o(new C9832g(this, !z, (C9826a) null));
        }
    }

    /* renamed from: w */
    public final void mo73794w(float f) {
        boolean z;
        int color = this.f46745k.getResources().getColor(q15.belvedere_image_stream_status_bar_color);
        int a = n77.m75284a(this.f46745k.getContext(), c15.colorPrimaryDark);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        Window window = this.f46747m.getWindow();
        if (!z) {
            window.setStatusBarColor(a);
        } else if (window.getStatusBarColor() == a) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(a), Integer.valueOf(color)});
            ofObject.setDuration(100);
            ofObject.addUpdateListener(new C9831f(window, ofObject));
            ofObject.start();
        }
        View decorView = window.getDecorView();
        if (z) {
            decorView.setSystemUiVisibility(8192);
        } else {
            decorView.setSystemUiVisibility(0);
        }
    }
}
