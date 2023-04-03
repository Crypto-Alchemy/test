package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C1337r;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

public final class MaterialCalendar<S> extends oo4<S> {

    /* renamed from: C */
    public static final Object f23728C = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: H */
    public static final Object f23729H = "NAVIGATION_PREV_TAG";

    /* renamed from: I */
    public static final Object f23730I = "NAVIGATION_NEXT_TAG";

    /* renamed from: L */
    public static final Object f23731L = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A */
    public View f23732A;

    /* renamed from: B */
    public View f23733B;

    /* renamed from: d */
    public int f23734d;

    /* renamed from: e */
    public DateSelector<S> f23735e;

    /* renamed from: g */
    public CalendarConstraints f23736g;

    /* renamed from: k */
    public Month f23737k;

    /* renamed from: r */
    public CalendarSelector f23738r;

    /* renamed from: s */
    public j90 f23739s;

    /* renamed from: x */
    public RecyclerView f23740x;

    /* renamed from: y */
    public RecyclerView f23741y;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    public class C4261a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f23743a;

        public C4261a(int i) {
            this.f23743a = i;
        }

        public void run() {
            MaterialCalendar.this.f23741y.mo9158w1(this.f23743a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    public class C4262b extends C3715z7 {
        public C4262b() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26243h0((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    public class C4263c extends x46 {

        /* renamed from: v1 */
        public final /* synthetic */ int f23746v1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4263c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f23746v1 = i2;
        }

        /* renamed from: V1 */
        public void mo8900V1(RecyclerView.C1260x xVar, int[] iArr) {
            if (this.f23746v1 == 0) {
                iArr[0] = MaterialCalendar.this.f23741y.getWidth();
                iArr[1] = MaterialCalendar.this.f23741y.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f23741y.getHeight();
            iArr[1] = MaterialCalendar.this.f23741y.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    public class C4264d implements C4271k {
        public C4264d() {
        }

        /* renamed from: a */
        public void mo32549a(long j) {
            if (MaterialCalendar.this.f23736g.mo32486f().mo32495k0(j)) {
                MaterialCalendar.this.f23735e.mo32519l1(j);
                Iterator<sh4<S>> it = MaterialCalendar.this.f32416a.iterator();
                while (it.hasNext()) {
                    it.next().mo32617b(MaterialCalendar.this.f23735e.mo32517f1());
                }
                MaterialCalendar.this.f23741y.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f23740x != null) {
                    MaterialCalendar.this.f23740x.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$e */
    public class C4265e extends RecyclerView.C1247n {

        /* renamed from: a */
        public final Calendar f23749a = d67.m43375q();

        /* renamed from: b */
        public final Calendar f23750b = d67.m43375q();

        public C4265e() {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
            int i;
            int i2;
            if ((recyclerView.getAdapter() instanceof C4291e) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C4291e eVar = (C4291e) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (jl4 next : MaterialCalendar.this.f23735e.mo32513B0()) {
                    F f = next.f13688a;
                    if (!(f == null || next.f13689b == null)) {
                        this.f23749a.setTimeInMillis(((Long) f).longValue());
                        this.f23750b.setTimeInMillis(((Long) next.f13689b).longValue());
                        int c = eVar.mo32645c(this.f23749a.get(1));
                        int c2 = eVar.mo32645c(this.f23750b.get(1));
                        View N = gridLayoutManager.mo8888N(c);
                        View N2 = gridLayoutManager.mo8888N(c2);
                        int e3 = c / gridLayoutManager.mo8849e3();
                        int e32 = c2 / gridLayoutManager.mo8849e3();
                        for (int i3 = e3; i3 <= e32; i3++) {
                            View N3 = gridLayoutManager.mo8888N(gridLayoutManager.mo8849e3() * i3);
                            if (N3 != null) {
                                int top = N3.getTop() + MaterialCalendar.this.f23739s.f30252d.mo43520c();
                                int bottom = N3.getBottom() - MaterialCalendar.this.f23739s.f30252d.mo43519b();
                                if (i3 == e3) {
                                    i = N.getLeft() + (N.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i3 == e32) {
                                    i2 = N2.getLeft() + (N2.getWidth() / 2);
                                } else {
                                    i2 = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) i, (float) top, (float) i2, (float) bottom, MaterialCalendar.this.f23739s.f30256h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$f */
    public class C4266f extends C3715z7 {
        public C4266f() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            String str;
            super.mo5479g(view, t8Var);
            if (MaterialCalendar.this.f23733B.getVisibility() == 0) {
                str = MaterialCalendar.this.getString(y45.mtrl_picker_toggle_to_year_selection);
            } else {
                str = MaterialCalendar.this.getString(y45.mtrl_picker_toggle_to_day_selection);
            }
            t8Var.mo26264s0(str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$g */
    public class C4267g extends RecyclerView.C1251r {

        /* renamed from: a */
        public final /* synthetic */ C4288d f23753a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f23754b;

        public C4267g(C4288d dVar, MaterialButton materialButton) {
            this.f23753a = dVar;
            this.f23754b = materialButton;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f23754b.getText());
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = MaterialCalendar.this.mo32546x().mo8913h2();
            } else {
                i3 = MaterialCalendar.this.mo32546x().mo8917k2();
            }
            Month unused = MaterialCalendar.this.f23737k = this.f23753a.mo32638b(i3);
            this.f23754b.setText(this.f23753a.mo32639c(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$h */
    public class C4268h implements View.OnClickListener {
        public C4268h() {
        }

        public void onClick(View view) {
            MaterialCalendar.this.mo32538C();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$i */
    public class C4269i implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C4288d f23757a;

        public C4269i(C4288d dVar) {
            this.f23757a = dVar;
        }

        public void onClick(View view) {
            int h2 = MaterialCalendar.this.mo32546x().mo8913h2() + 1;
            if (h2 < MaterialCalendar.this.f23741y.getAdapter().getItemCount()) {
                MaterialCalendar.this.mo32536A(this.f23757a.mo32638b(h2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$j */
    public class C4270j implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C4288d f23759a;

        public C4270j(C4288d dVar) {
            this.f23759a = dVar;
        }

        public void onClick(View view) {
            int k2 = MaterialCalendar.this.mo32546x().mo8917k2() - 1;
            if (k2 >= 0) {
                MaterialCalendar.this.mo32536A(this.f23759a.mo32638b(k2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$k */
    public interface C4271k {
        /* renamed from: a */
        void mo32549a(long j);
    }

    /* renamed from: w */
    public static int m35247w(Context context) {
        return context.getResources().getDimensionPixelSize(k25.mtrl_calendar_day_height);
    }

    /* renamed from: y */
    public static <T> MaterialCalendar<T> m35248y(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.mo32490i());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    /* renamed from: A */
    public void mo32536A(Month month) {
        boolean z;
        C4288d dVar = (C4288d) this.f23741y.getAdapter();
        int d = dVar.mo32640d(month);
        int d2 = d - dVar.mo32640d(this.f23737k);
        boolean z2 = true;
        if (Math.abs(d2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (d2 <= 0) {
            z2 = false;
        }
        this.f23737k = month;
        if (z && z2) {
            this.f23741y.mo9092o1(d - 3);
            mo32547z(d);
        } else if (z) {
            this.f23741y.mo9092o1(d + 3);
            mo32547z(d);
        } else {
            mo32547z(d);
        }
    }

    /* renamed from: B */
    public void mo32537B(CalendarSelector calendarSelector) {
        this.f23738r = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f23740x.getLayoutManager().mo8881G1(((C4291e) this.f23740x.getAdapter()).mo32645c(this.f23737k.f23766e));
            this.f23732A.setVisibility(0);
            this.f23733B.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f23732A.setVisibility(8);
            this.f23733B.setVisibility(0);
            mo32536A(this.f23737k);
        }
    }

    /* renamed from: C */
    public void mo32538C() {
        CalendarSelector calendarSelector = this.f23738r;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            mo32537B(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            mo32537B(calendarSelector2);
        }
    }

    /* renamed from: h */
    public boolean mo32539h(sh4<S> sh4) {
        return super.mo32539h(sh4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f23734d = bundle.getInt("THEME_RES_ID_KEY");
        this.f23735e = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f23736g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f23737k = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f23734d);
        this.f23739s = new j90(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month j = this.f23736g.mo32491j();
        if (C4282b.m35340N(contextThemeWrapper)) {
            i2 = c45.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = c45.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(g35.mtrl_calendar_days_of_week);
        ga7.m17785p0(gridView, new C4262b());
        gridView.setAdapter(new o21());
        gridView.setNumColumns(j.f23767g);
        gridView.setEnabled(false);
        this.f23741y = (RecyclerView) inflate.findViewById(g35.mtrl_calendar_months);
        this.f23741y.setLayoutManager(new C4263c(getContext(), i, false, i));
        this.f23741y.setTag(f23728C);
        C4288d dVar = new C4288d(contextThemeWrapper, this.f23735e, this.f23736g, new C4264d());
        this.f23741y.setAdapter(dVar);
        int integer = contextThemeWrapper.getResources().getInteger(w35.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(g35.mtrl_calendar_year_selector_frame);
        this.f23740x = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f23740x.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f23740x.setAdapter(new C4291e(this));
            this.f23740x.mo9067h(mo32541r());
        }
        if (inflate.findViewById(g35.month_navigation_fragment_toggle) != null) {
            mo32540q(inflate, dVar);
        }
        if (!C4282b.m35340N(contextThemeWrapper)) {
            new C1337r().mo9980b(this.f23741y);
        }
        this.f23741y.mo9092o1(dVar.mo32640d(this.f23737k));
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f23734d);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f23735e);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f23736g);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f23737k);
    }

    /* renamed from: q */
    public final void mo32540q(View view, C4288d dVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(g35.month_navigation_fragment_toggle);
        materialButton.setTag(f23731L);
        ga7.m17785p0(materialButton, new C4266f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(g35.month_navigation_previous);
        materialButton2.setTag(f23729H);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(g35.month_navigation_next);
        materialButton3.setTag(f23730I);
        this.f23732A = view.findViewById(g35.mtrl_calendar_year_selector_frame);
        this.f23733B = view.findViewById(g35.mtrl_calendar_day_selector_frame);
        mo32537B(CalendarSelector.DAY);
        materialButton.setText(this.f23737k.mo32572l(view.getContext()));
        this.f23741y.mo9081l(new C4267g(dVar, materialButton));
        materialButton.setOnClickListener(new C4268h());
        materialButton3.setOnClickListener(new C4269i(dVar));
        materialButton2.setOnClickListener(new C4270j(dVar));
    }

    /* renamed from: r */
    public final RecyclerView.C1247n mo32541r() {
        return new C4265e();
    }

    /* renamed from: s */
    public CalendarConstraints mo32542s() {
        return this.f23736g;
    }

    /* renamed from: t */
    public j90 mo32543t() {
        return this.f23739s;
    }

    /* renamed from: u */
    public Month mo32544u() {
        return this.f23737k;
    }

    /* renamed from: v */
    public DateSelector<S> mo32545v() {
        return this.f23735e;
    }

    /* renamed from: x */
    public LinearLayoutManager mo32546x() {
        return (LinearLayoutManager) this.f23741y.getLayoutManager();
    }

    /* renamed from: z */
    public final void mo32547z(int i) {
        this.f23741y.post(new C4261a(i));
    }
}
