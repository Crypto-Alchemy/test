package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.google.android.material.appbar.AppBarLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel;
import net.safemoon.androidwallet.views.TouchControlLineChart;
import net.safemoon.androidwallet.views.marker.ReflectionLineGraphMarkerView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010#\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010%\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0014\u0010)\u001a\u00020&8\u0002XD¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u00104\u001a\n 0*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001d\u00108\u001a\u0004\u0018\u0001058BX\u0002¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b:\u0010;¨\u0006@"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ReflectionsAdvanceFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "", "canDrag", "Lr37;", "Z", "Q", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "list", "L", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "", "k", "F", "DEFAULT_LINE_WIDTH", "", "r", "Ljava/lang/String;", "TOKEN_NAME_KEY", "s", "DATE_FORMAT", "x", "DATE_FORMAT_MM_dd", "y", "DATE_FORMAT_hh_mmaa", "A", "DATE_FORMAT_yyyy", "", "B", "I", "LABEL_COUNT", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel;", "C", "Lef3;", "O", "()Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel;", "reflectionViewModel", "kotlin.jvm.PlatformType", "H", "P", "()Ljava/lang/String;", "symbolWithType", "Lka2;", "M", "()Lka2;", "binding", "Lbb5;", "N", "()Lbb5;", "reflectionDataAdapter", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsAdvanceFragment.kt */
public final class ReflectionsAdvanceFragment extends BaseMainFragment {

    /* renamed from: A */
    public final String f42022A = "yyyy";

    /* renamed from: B */
    public final int f42023B = 4;

    /* renamed from: C */
    public final ef3 f42024C;

    /* renamed from: H */
    public final ef3 f42025H;

    /* renamed from: I */
    public final ef3 f42026I;

    /* renamed from: L */
    public final ef3 f42027L;

    /* renamed from: k */
    public final float f42028k = 2.0f;

    /* renamed from: r */
    public final String f42029r = "tokenName";

    /* renamed from: s */
    public final String f42030s = "MMMdd";

    /* renamed from: x */
    public final String f42031x = "MM/dd";

    /* renamed from: y */
    public final String f42032y = "hh:mmaa";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ReflectionsAdvanceFragment$a;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "unixTime", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "Lk04;", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$a;", "a", "Lk04;", "getRelfectionParam", "()Lk04;", "relfectionParam", "<init>", "(Lnet/safemoon/androidwallet/fragments/ReflectionsAdvanceFragment;Lk04;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment$a */
    /* compiled from: ReflectionsAdvanceFragment.kt */
    public final class C8414a extends ValueFormatter {

        /* renamed from: a */
        public final k04<ReflectionTrackerViewModel.C8722a> f42033a;

        /* renamed from: b */
        public final /* synthetic */ ReflectionsAdvanceFragment f42034b;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment$a$a */
        /* compiled from: ReflectionsAdvanceFragment.kt */
        public /* synthetic */ class C8415a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f42035a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode[] r0 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.DAILY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.WEEKLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.MONTHLY     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.YEARLY     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f42035a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment.C8414a.C8415a.<clinit>():void");
            }
        }

        public C8414a(ReflectionsAdvanceFragment reflectionsAdvanceFragment, k04<ReflectionTrackerViewModel.C8722a> k04) {
            vx2.m53591g(k04, "relfectionParam");
            this.f42034b = reflectionsAdvanceFragment;
            this.f42033a = k04;
        }

        public String getAxisLabel(float f, AxisBase axisBase) {
            String str;
            if (axisBase != null) {
                axisBase.setLabelCount(6);
            }
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(((long) f) * ((long) 1000)));
            if (this.f42033a.getValue() != null) {
                ReflectionTrackerViewModel.C8722a value = this.f42033a.getValue();
                vx2.m53588d(value);
                ReflectionsAdvanceFragment reflectionsAdvanceFragment = this.f42034b;
                ReflectionTrackerViewModel.C8722a aVar = value;
                int i = C8415a.f42035a[aVar.mo61355b().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        str = instance.get(3) + "/" + instance.get(1);
                    } else if (i == 3) {
                        str = instance.getDisplayName(2, 1, Locale.getDefault()) + "/" + instance.get(1);
                    } else if (i != 4) {
                        str = new SimpleDateFormat(reflectionsAdvanceFragment.f42030s, Locale.getDefault()).format(instance.getTime());
                    } else {
                        str = new SimpleDateFormat(reflectionsAdvanceFragment.f42022A, Locale.getDefault()).format(instance.getTime());
                    }
                } else if (aVar.mo61356c() == ReflectionTrackerViewModel.TimeSpan.LOW) {
                    if (axisBase != null) {
                        axisBase.setLabelCount(reflectionsAdvanceFragment.f42023B);
                    }
                    str = new SimpleDateFormat(reflectionsAdvanceFragment.f42032y, Locale.getDefault()).format(instance.getTime());
                } else {
                    str = new SimpleDateFormat(reflectionsAdvanceFragment.f42031x, Locale.getDefault()).format(instance.getTime());
                }
                vx2.m53590f(str, "{\n                relfec…          }\n            }");
                return str;
            }
            String format = new SimpleDateFormat(this.f42034b.f42030s, Locale.getDefault()).format(instance.getTime());
            vx2.m53590f(format, "{\n                Simple…endar.time)\n            }");
            return format;
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment$b */
    /* compiled from: ReflectionsAdvanceFragment.kt */
    public /* synthetic */ class C8416b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42036a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode[] r0 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.DAILY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.WEEKLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.MONTHLY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.YEARLY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f42036a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment.C8416b.<clinit>():void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ReflectionsAdvanceFragment$c", "Lcom/google/android/material/appbar/AppBarLayout$Behavior$a;", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment$c */
    /* compiled from: ReflectionsAdvanceFragment.kt */
    public static final class C8417c extends AppBarLayout.Behavior.C4173a {

        /* renamed from: a */
        public final /* synthetic */ boolean f42037a;

        public C8417c(boolean z) {
            this.f42037a = z;
        }

        /* renamed from: a */
        public boolean mo31588a(AppBarLayout appBarLayout) {
            vx2.m53591g(appBarLayout, "appBarLayout");
            return this.f42037a;
        }
    }

    public ReflectionsAdvanceFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new ReflectionsAdvanceFragment$special$$inlined$viewModels$default$2(new ReflectionsAdvanceFragment$special$$inlined$viewModels$default$1(this)));
        this.f42024C = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ReflectionTrackerViewModel.class), new ReflectionsAdvanceFragment$special$$inlined$viewModels$default$3(b), new ReflectionsAdvanceFragment$special$$inlined$viewModels$default$4((pc2) null, b), new ReflectionsAdvanceFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42025H = C6169a.m47232a(new ReflectionsAdvanceFragment$symbolWithType$2(this));
        this.f42026I = C6169a.m47232a(new ReflectionsAdvanceFragment$binding$2(this));
        this.f42027L = C6169a.m47232a(ReflectionsAdvanceFragment$reflectionDataAdapter$2.INSTANCE);
    }

    /* renamed from: R */
    public static final void m66800R(ReflectionsAdvanceFragment reflectionsAdvanceFragment, View view) {
        vx2.m53591g(reflectionsAdvanceFragment, "this$0");
        reflectionsAdvanceFragment.mo50752i();
    }

    /* renamed from: S */
    public static final void m66801S(ReflectionsAdvanceFragment reflectionsAdvanceFragment, View view) {
        vx2.m53591g(reflectionsAdvanceFragment, "this$0");
        ReflectionTrackerViewModel O = reflectionsAdvanceFragment.mo57582O();
        String P = reflectionsAdvanceFragment.mo57583P();
        vx2.m53590f(P, "symbolWithType");
        O.mo61353z(P);
    }

    /* renamed from: T */
    public static final void m66802T(ReflectionsAdvanceFragment reflectionsAdvanceFragment, View view) {
        vx2.m53591g(reflectionsAdvanceFragment, "this$0");
        FragmentActivity requireActivity = reflectionsAdvanceFragment.requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        fy0.m57958g(requireActivity, Integer.valueOf(R.string.reflection_tracker_title), R.string.reflection_tracker_detail, false, new kb5(), 8, (Object) null);
    }

    /* renamed from: U */
    public static final void m66803U(DialogInterface dialogInterface) {
    }

    /* renamed from: V */
    public static final void m66804V(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: W */
    public static final void m66805W(ReflectionsAdvanceFragment reflectionsAdvanceFragment, RadioGroup radioGroup, int i) {
        vx2.m53591g(reflectionsAdvanceFragment, "this$0");
        switch (i) {
            case R.id.tm_daily:
                reflectionsAdvanceFragment.mo57582O().mo61335F(ReflectionTrackerViewModel.TimeMode.DAILY);
                break;
            case R.id.tm_monthly:
                reflectionsAdvanceFragment.mo57582O().mo61335F(ReflectionTrackerViewModel.TimeMode.MONTHLY);
                break;
            case R.id.tm_weekly:
                reflectionsAdvanceFragment.mo57582O().mo61335F(ReflectionTrackerViewModel.TimeMode.WEEKLY);
                break;
            case R.id.tm_yearly:
                reflectionsAdvanceFragment.mo57582O().mo61335F(ReflectionTrackerViewModel.TimeMode.YEARLY);
                break;
        }
        reflectionsAdvanceFragment.mo57584Q();
    }

    /* renamed from: X */
    public static final void m66806X(ReflectionsAdvanceFragment reflectionsAdvanceFragment, RadioGroup radioGroup, int i) {
        vx2.m53591g(reflectionsAdvanceFragment, "this$0");
        switch (i) {
            case R.id.ts_max:
                reflectionsAdvanceFragment.mo57582O().mo61336G(ReflectionTrackerViewModel.TimeSpan.HIGH);
                return;
            case R.id.ts_med:
                reflectionsAdvanceFragment.mo57582O().mo61336G(ReflectionTrackerViewModel.TimeSpan.MEDIUM);
                return;
            case R.id.ts_min:
                reflectionsAdvanceFragment.mo57582O().mo61336G(ReflectionTrackerViewModel.TimeSpan.LOW);
                return;
            default:
                return;
        }
    }

    /* renamed from: Y */
    public static final void m66807Y(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L */
    public final void mo57579L(List<RoomReflectionsDataAndToken> list) {
        y23 unused = d50.m56748b(vg3.m28804a(this), (CoroutineContext) null, (CoroutineStart) null, new ReflectionsAdvanceFragment$bindChart$1(this, list, (ns0<? super ReflectionsAdvanceFragment$bindChart$1>) null), 3, (Object) null);
    }

    /* renamed from: M */
    public final ka2 mo57580M() {
        return (ka2) this.f42026I.getValue();
    }

    /* renamed from: N */
    public final bb5 mo57581N() {
        return (bb5) this.f42027L.getValue();
    }

    /* renamed from: O */
    public final ReflectionTrackerViewModel mo57582O() {
        return (ReflectionTrackerViewModel) this.f42024C.getValue();
    }

    /* renamed from: P */
    public final String mo57583P() {
        return (String) this.f42025H.getValue();
    }

    /* renamed from: Q */
    public final void mo57584Q() {
        ReflectionTrackerViewModel.TimeMode timeMode;
        int i;
        ka2 M = mo57580M();
        if (M != null) {
            ReflectionTrackerViewModel.C8722a value = mo57582O().mo61343o().getValue();
            if (value != null) {
                timeMode = value.mo61355b();
            } else {
                timeMode = null;
            }
            if (timeMode == null) {
                i = -1;
            } else {
                i = C8416b.f42036a[timeMode.ordinal()];
            }
            if (i == 1) {
                M.f30775r.setText(R.string.mr_seg_time_low_daily);
                M.f30774q.setText(R.string.mr_seg_time_med_daily);
                M.f30773p.setText(R.string.mr_seg_time_high_daily);
                M.f30766i.setVisibility(0);
            } else if (i == 2) {
                M.f30775r.setText(R.string.mr_seg_time_low_weekly);
                M.f30774q.setText(R.string.mr_seg_time_med_weekly);
                M.f30773p.setText(R.string.mr_seg_time_high_weekly);
                M.f30766i.setVisibility(0);
            } else if (i == 3) {
                M.f30775r.setText(R.string.mr_seg_time_low_monthly);
                M.f30774q.setText(R.string.mr_seg_time_med_monthly);
                M.f30773p.setText(R.string.mr_seg_time_high_monthly);
                M.f30766i.setVisibility(0);
            } else if (i == 4) {
                M.f30766i.setVisibility(8);
            }
        }
    }

    /* renamed from: Z */
    public final void mo57585Z(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout.Behavior f;
        ka2 M = mo57580M();
        if (M != null && (layoutParams = M.f30759b.getLayoutParams()) != null) {
            vx2.m53590f(layoutParams, "layoutParams");
            if ((layoutParams instanceof CoordinatorLayout.C0546e) && (f = ((CoordinatorLayout.C0546e) layoutParams).mo5294f()) != null && (f instanceof AppBarLayout.Behavior)) {
                ((AppBarLayout.Behavior) f).mo31556H(new C8417c(z));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_reflections_advance, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        zi7 zi7 = zi7.f46397a;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        zi7.mo67316d(requireContext, "REFLECTION_INTRO", Boolean.FALSE);
        ka2 M = mo57580M();
        if (M != null) {
            M.f30771n.f34318d.setOnClickListener(new db5(this));
            M.f30771n.f34317c.setImageResource(R.drawable.ic_baseline_refresh_24);
            M.f30771n.f34317c.setOnClickListener(new eb5(this));
            M.f30771n.f34320f.setText(R.string.screen_title_my_reflections);
            AppCompatImageView appCompatImageView = M.f30771n.f34316b;
            vx2.m53590f(appCompatImageView, "toolbar.imgInfo");
            appCompatImageView.setVisibility(0);
            M.f30771n.f34316b.setOnClickListener(new fb5(this));
            RecyclerView recyclerView = M.f30764g;
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            recyclerView.setAdapter(mo57581N());
            ReflectionTrackerViewModel O = mo57582O();
            String P = mo57583P();
            vx2.m53590f(P, "symbolWithType");
            LiveData<RoomReflectionsToken> n = O.mo61342n(P);
            if (n != null) {
                n.observe(getViewLifecycleOwner(), new gb5(new ReflectionsAdvanceFragment$onViewCreated$1$5(M)));
            }
            M.f30765h.setOnCheckedChangeListener(new hb5(this));
            M.f30766i.setOnCheckedChangeListener(new ib5(this));
            M.f30765h.check(R.id.tm_daily);
            M.f30766i.check(R.id.ts_min);
            TouchControlLineChart touchControlLineChart = M.f30763f;
            touchControlLineChart.setTouchEnabled(true);
            touchControlLineChart.setPinchZoom(false);
            touchControlLineChart.setDrawBorders(false);
            touchControlLineChart.setNoDataText(getString(R.string.chart_loading));
            ReflectionLineGraphMarkerView reflectionLineGraphMarkerView = new ReflectionLineGraphMarkerView(requireContext(), R.layout.marker_graph_view, "");
            reflectionLineGraphMarkerView.setChartView(M.f30763f);
            touchControlLineChart.setMarker(reflectionLineGraphMarkerView);
            touchControlLineChart.setNoDataTextColor(zr0.m31440c(requireContext(), R.color.white));
            touchControlLineChart.getLegend().setEnabled(false);
            touchControlLineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
            touchControlLineChart.mo62138a(new ReflectionsAdvanceFragment$onViewCreated$1$8$2(this));
            pm2 pm2 = M.f30772o;
            pm2.f32736c.setText("");
            pm2.f32737d.setText("");
        }
        ReflectionTrackerViewModel O2 = mo57582O();
        String P2 = mo57583P();
        vx2.m53590f(P2, "symbolWithType");
        O2.mo61334E(P2);
        vg3.m28804a(this).mo6301b(new ReflectionsAdvanceFragment$onViewCreated$2(this, (ns0<? super ReflectionsAdvanceFragment$onViewCreated$2>) null));
        mo57582O().mo61345q().observe(getViewLifecycleOwner(), new jb5(new ReflectionsAdvanceFragment$onViewCreated$3(this)));
    }
}
