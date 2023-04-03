package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.C0684j;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager {

    /* renamed from: S */
    public static boolean f3653S = false;

    /* renamed from: A */
    public C0674d f3654A = new C0635d();

    /* renamed from: B */
    public l66 f3655B = null;

    /* renamed from: C */
    public l66 f3656C = new C0636e();

    /* renamed from: D */
    public C3529wa<Intent> f3657D;

    /* renamed from: E */
    public C3529wa<IntentSenderRequest> f3658E;

    /* renamed from: F */
    public C3529wa<String[]> f3659F;

    /* renamed from: G */
    public ArrayDeque<LaunchedFragmentInfo> f3660G = new ArrayDeque<>();

    /* renamed from: H */
    public boolean f3661H;

    /* renamed from: I */
    public boolean f3662I;

    /* renamed from: J */
    public boolean f3663J;

    /* renamed from: K */
    public boolean f3664K;

    /* renamed from: L */
    public boolean f3665L;

    /* renamed from: M */
    public ArrayList<C0655a> f3666M;

    /* renamed from: N */
    public ArrayList<Boolean> f3667N;

    /* renamed from: O */
    public ArrayList<Fragment> f3668O;

    /* renamed from: P */
    public fa2 f3669P;

    /* renamed from: Q */
    public FragmentStrictMode.C0687b f3670Q;

    /* renamed from: R */
    public Runnable f3671R = new C0637f();

    /* renamed from: a */
    public final ArrayList<C0644m> f3672a = new ArrayList<>();

    /* renamed from: b */
    public boolean f3673b;

    /* renamed from: c */
    public final C0683i f3674c = new C0683i();

    /* renamed from: d */
    public ArrayList<C0655a> f3675d;

    /* renamed from: e */
    public ArrayList<Fragment> f3676e;

    /* renamed from: f */
    public final C0676f f3677f = new C0676f(this);

    /* renamed from: g */
    public OnBackPressedDispatcher f3678g;

    /* renamed from: h */
    public final yg4 f3679h = new C0633b(false);

    /* renamed from: i */
    public final AtomicInteger f3680i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, BackStackState> f3681j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f3682k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, Object> f3683l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public ArrayList<C0643l> f3684m;

    /* renamed from: n */
    public final C0678g f3685n = new C0678g(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<ia2> f3686o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public final yq0<Configuration> f3687p = new z92(this);

    /* renamed from: q */
    public final yq0<Integer> f3688q = new aa2(this);

    /* renamed from: r */
    public final yq0<b04> f3689r = new ba2(this);

    /* renamed from: s */
    public final yq0<po4> f3690s = new ca2(this);

    /* renamed from: t */
    public final eu3 f3691t = new C0634c();

    /* renamed from: u */
    public int f3692u = -1;

    /* renamed from: v */
    public C0675e<?> f3693v;

    /* renamed from: w */
    public k92 f3694w;

    /* renamed from: x */
    public Fragment f3695x;

    /* renamed from: y */
    public Fragment f3696y;

    /* renamed from: z */
    public C0674d f3697z = null;

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class C06306 implements C0715e {

        /* renamed from: a */
        public final /* synthetic */ String f3698a;

        /* renamed from: d */
        public final /* synthetic */ ma2 f3699d;

        /* renamed from: e */
        public final /* synthetic */ Lifecycle f3700e;

        /* renamed from: g */
        public final /* synthetic */ FragmentManager f3701g;

        /* renamed from: f */
        public void mo907f(ug3 ug3, Lifecycle.Event event) {
            Bundle bundle;
            if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) this.f3701g.f3682k.get(this.f3698a)) != null) {
                this.f3699d.mo23102a(this.f3698a, bundle);
                this.f3701g.mo6011v(this.f3698a);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f3700e.mo6297c(this);
                this.f3701g.f3683l.remove(this.f3698a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public class C0632a implements C3191ra<Map<String, Boolean>> {
        public C0632a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo6032a(Map<String, Boolean> map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3660G.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f3702a;
            int i3 = pollFirst.f3703d;
            Fragment i4 = FragmentManager.this.f3674c.mo6243i(str);
            if (i4 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Permission request result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i4.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public class C0633b extends yg4 {
        public C0633b(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo6034b() {
            FragmentManager.this.mo5926G0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public class C0634c implements eu3 {
        public C0634c() {
        }

        /* renamed from: a */
        public void mo6035a(Menu menu) {
            FragmentManager.this.mo5938N(menu);
        }

        /* renamed from: b */
        public void mo6036b(Menu menu) {
            FragmentManager.this.mo5946R(menu);
        }

        /* renamed from: c */
        public boolean mo6037c(MenuItem menuItem) {
            return FragmentManager.this.mo5936M(menuItem);
        }

        /* renamed from: d */
        public void mo6038d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.mo5923F(menu, menuInflater);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public class C0635d extends C0674d {
        public C0635d() {
        }

        /* renamed from: a */
        public Fragment mo6039a(ClassLoader classLoader, String str) {
            return FragmentManager.this.mo6018x0().mo22232b(FragmentManager.this.mo6018x0().mo6184f(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C0636e implements l66 {
        public C0636e() {
        }

        /* renamed from: a */
        public SpecialEffectsController mo6040a(ViewGroup viewGroup) {
            return new C0656b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public class C0637f implements Runnable {
        public C0637f() {
        }

        public void run() {
            FragmentManager.this.mo5965d0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    public class C0638g implements ia2 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f3710a;

        public C0638g(Fragment fragment) {
            this.f3710a = fragment;
        }

        /* renamed from: a */
        public void mo5886a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3710a.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    public class C0639h implements C3191ra<ActivityResult> {
        public C0639h() {
        }

        /* renamed from: b */
        public void mo6032a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3660G.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f3702a;
            int i = pollFirst.f3703d;
            Fragment i2 = FragmentManager.this.f3674c.mo6243i(str);
            if (i2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i2.onActivityResult(i, activityResult.mo918b(), activityResult.mo917a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    public class C0640i implements C3191ra<ActivityResult> {
        public C0640i() {
        }

        /* renamed from: b */
        public void mo6032a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3660G.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f3702a;
            int i = pollFirst.f3703d;
            Fragment i2 = FragmentManager.this.f3674c.mo6243i(str);
            if (i2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Intent Sender result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i2.onActivityResult(i, activityResult.mo918b(), activityResult.mo917a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    public static class C0641j extends C3253sa<IntentSenderRequest, ActivityResult> {
        /* renamed from: d */
        public Intent mo6044a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.mo941a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0109b(intentSenderRequest.mo944d()).mo952b((Intent) null).mo953c(intentSenderRequest.mo943c(), intentSenderRequest.mo942b()).mo951a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        /* renamed from: e */
        public ActivityResult mo6045c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public static abstract class C0642k {
        @Deprecated
        /* renamed from: a */
        public void mo6048a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo6049b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void mo6050c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo6051d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: e */
        public void mo6052e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo6053f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo6054g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void mo6055h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo6056i(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: j */
        public void mo6057j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo6058k(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: l */
        public void mo6059l(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: m */
        public void mo6060m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void mo6061n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public interface C0643l {
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public interface C0644m {
        /* renamed from: a */
        boolean mo6063a(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public class C0645n implements C0644m {

        /* renamed from: a */
        public final String f3714a;

        /* renamed from: b */
        public final int f3715b;

        /* renamed from: c */
        public final int f3716c;

        public C0645n(String str, int i, int i2) {
            this.f3714a = str;
            this.f3715b = i;
            this.f3716c = i2;
        }

        /* renamed from: a */
        public boolean mo6063a(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3696y;
            if (fragment != null && this.f3715b < 0 && this.f3714a == null && fragment.getChildFragmentManager().mo5973h1()) {
                return false;
            }
            return FragmentManager.this.mo5982k1(arrayList, arrayList2, this.f3714a, this.f3715b, this.f3716c);
        }
    }

    /* renamed from: E0 */
    public static Fragment m4629E0(View view) {
        Object tag = view.getTag(s35.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: K0 */
    public static boolean m4630K0(int i) {
        if (f3653S || Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ void m4632T0(Configuration configuration) {
        if (mo5937M0()) {
            mo5918C(configuration);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ void m4633U0(Integer num) {
        if (mo5937M0() && num.intValue() == 80) {
            mo5929I();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m4634V0(b04 b04) {
        if (mo5937M0()) {
            mo5931J(b04.mo11332a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m4635W0(po4 po4) {
        if (mo5937M0()) {
            mo5944Q(po4.mo24753a());
        }
    }

    /* renamed from: f0 */
    public static void m4642f0(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0655a aVar = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo6150y(-1);
                aVar.mo6134D();
            } else {
                aVar.mo6150y(1);
                aVar.mo6133C();
            }
            i++;
        }
    }

    /* renamed from: n0 */
    public static FragmentManager m4645n0(View view) {
        Fragment o0 = m4646o0(view);
        if (o0 == null) {
            Context context = view.getContext();
            FragmentActivity fragmentActivity = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                return fragmentActivity.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (o0.isAdded()) {
            return o0.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + o0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    /* renamed from: o0 */
    public static Fragment m4646o0(View view) {
        while (view != null) {
            Fragment E0 = m4629E0(view);
            if (E0 != null) {
                return E0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: r1 */
    public static int m4647r1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i == 8194) {
            return 4097;
        }
        if (i == 8197) {
            return 4100;
        }
        if (i != 4099) {
            return i != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    /* renamed from: A */
    public void mo5912A() {
        this.f3662I = false;
        this.f3663J = false;
        this.f3669P.mo19838m(false);
        mo5951V(4);
    }

    /* renamed from: A0 */
    public Fragment mo5913A0() {
        return this.f3695x;
    }

    /* renamed from: A1 */
    public void mo5914A1(C0642k kVar) {
        this.f3685n.mo6208p(kVar);
    }

    /* renamed from: B */
    public void mo5915B() {
        this.f3662I = false;
        this.f3663J = false;
        this.f3669P.mo19838m(false);
        mo5951V(0);
    }

    /* renamed from: B0 */
    public Fragment mo5916B0() {
        return this.f3696y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo6000r0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo5943P0(r3.f3695x) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo28064f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3679h;
     */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5917B1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r0 = r3.f3672a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r1 = r3.f3672a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            yg4 r1 = r3.f3679h     // Catch:{ all -> 0x002a }
            r1.mo28064f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            yg4 r0 = r3.f3679h
            int r1 = r3.mo6000r0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3695x
            boolean r1 = r3.mo5943P0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo28064f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo5917B1():void");
    }

    /* renamed from: C */
    public void mo5918C(Configuration configuration) {
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: C0 */
    public l66 mo5919C0() {
        l66 l66 = this.f3655B;
        if (l66 != null) {
            return l66;
        }
        Fragment fragment = this.f3695x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo5919C0();
        }
        return this.f3656C;
    }

    /* renamed from: D */
    public boolean mo5920D(MenuItem menuItem) {
        if (this.f3692u < 1) {
            return false;
        }
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D0 */
    public FragmentStrictMode.C0687b mo5921D0() {
        return this.f3670Q;
    }

    /* renamed from: E */
    public void mo5922E() {
        this.f3662I = false;
        this.f3663J = false;
        this.f3669P.mo19838m(false);
        mo5951V(1);
    }

    /* renamed from: F */
    public boolean mo5923F(Menu menu, MenuInflater menuInflater) {
        if (this.f3692u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null && mo5941O0(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3676e != null) {
            for (int i = 0; i < this.f3676e.size(); i++) {
                Fragment fragment = this.f3676e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f3676e = arrayList;
        return z;
    }

    /* renamed from: F0 */
    public gd7 mo5924F0(Fragment fragment) {
        return this.f3669P.mo19835j(fragment);
    }

    /* renamed from: G */
    public void mo5925G() {
        this.f3664K = true;
        mo5965d0(true);
        mo5959a0();
        mo6008u();
        mo5951V(-1);
        C0675e<?> eVar = this.f3693v;
        if (eVar instanceof vh4) {
            ((vh4) eVar).removeOnTrimMemoryListener(this.f3688q);
        }
        C0675e<?> eVar2 = this.f3693v;
        if (eVar2 instanceof ch4) {
            ((ch4) eVar2).removeOnConfigurationChangedListener(this.f3687p);
        }
        C0675e<?> eVar3 = this.f3693v;
        if (eVar3 instanceof kh4) {
            ((kh4) eVar3).removeOnMultiWindowModeChangedListener(this.f3689r);
        }
        C0675e<?> eVar4 = this.f3693v;
        if (eVar4 instanceof mh4) {
            ((mh4) eVar4).removeOnPictureInPictureModeChangedListener(this.f3690s);
        }
        C0675e<?> eVar5 = this.f3693v;
        if (eVar5 instanceof it3) {
            ((it3) eVar5).removeMenuProvider(this.f3691t);
        }
        this.f3693v = null;
        this.f3694w = null;
        this.f3695x = null;
        if (this.f3678g != null) {
            this.f3679h.mo28062d();
            this.f3678g = null;
        }
        C3529wa<Intent> waVar = this.f3657D;
        if (waVar != null) {
            waVar.mo938c();
            this.f3658E.mo938c();
            this.f3659F.mo938c();
        }
    }

    /* renamed from: G0 */
    public void mo5926G0() {
        mo5965d0(true);
        if (this.f3679h.mo28061c()) {
            mo5973h1();
        } else {
            this.f3678g.mo915d();
        }
    }

    /* renamed from: H */
    public void mo5927H() {
        mo5951V(1);
    }

    /* renamed from: H0 */
    public void mo5928H0(Fragment fragment) {
        if (m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            mo6019x1(fragment);
        }
    }

    /* renamed from: I */
    public void mo5929I() {
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    /* renamed from: I0 */
    public void mo5930I0(Fragment fragment) {
        if (fragment.mAdded && mo5935L0(fragment)) {
            this.f3661H = true;
        }
    }

    /* renamed from: J */
    public void mo5931J(boolean z) {
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: J0 */
    public boolean mo5932J0() {
        return this.f3664K;
    }

    /* renamed from: K */
    public void mo5933K(Fragment fragment) {
        Iterator<ia2> it = this.f3686o.iterator();
        while (it.hasNext()) {
            it.next().mo5886a(this, fragment);
        }
    }

    /* renamed from: L */
    public void mo5934L() {
        for (Fragment next : this.f3674c.mo6246l()) {
            if (next != null) {
                next.onHiddenChanged(next.isHidden());
                next.mChildFragmentManager.mo5934L();
            }
        }
    }

    /* renamed from: L0 */
    public final boolean mo5935L0(Fragment fragment) {
        if ((!fragment.mHasMenu || !fragment.mMenuVisible) && !fragment.mChildFragmentManager.mo5999r()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public boolean mo5936M(MenuItem menuItem) {
        if (this.f3692u < 1) {
            return false;
        }
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M0 */
    public final boolean mo5937M0() {
        Fragment fragment = this.f3695x;
        if (fragment == null) {
            return true;
        }
        if (!fragment.isAdded() || !this.f3695x.getParentFragmentManager().mo5937M0()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public void mo5938N(Menu menu) {
        if (this.f3692u >= 1) {
            for (Fragment next : this.f3674c.mo6249o()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: N0 */
    public boolean mo5939N0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* renamed from: O */
    public final void mo5940O(Fragment fragment) {
        if (fragment != null && fragment.equals(mo5975i0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: O0 */
    public boolean mo5941O0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: P */
    public void mo5942P() {
        mo5951V(5);
    }

    /* renamed from: P0 */
    public boolean mo5943P0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.mo5916B0()) || !mo5943P0(fragmentManager.f3695x)) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public void mo5944Q(boolean z) {
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: Q0 */
    public boolean mo5945Q0(int i) {
        if (this.f3692u >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public boolean mo5946R(Menu menu) {
        boolean z = false;
        if (this.f3692u < 1) {
            return false;
        }
        for (Fragment next : this.f3674c.mo6249o()) {
            if (next != null && mo5941O0(next) && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: R0 */
    public boolean mo5947R0() {
        if (this.f3662I || this.f3663J) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void mo5948S() {
        mo5917B1();
        mo5940O(this.f3696y);
    }

    /* renamed from: T */
    public void mo5949T() {
        this.f3662I = false;
        this.f3663J = false;
        this.f3669P.mo19838m(false);
        mo5951V(7);
    }

    /* renamed from: U */
    public void mo5950U() {
        this.f3662I = false;
        this.f3663J = false;
        this.f3669P.mo19838m(false);
        mo5951V(5);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: V */
    public final void mo5951V(int i) {
        try {
            this.f3673b = true;
            this.f3674c.mo6238d(i);
            mo5960a1(i, false);
            for (SpecialEffectsController j : mo6014w()) {
                j.mo6107j();
            }
            this.f3673b = false;
            mo5965d0(true);
        } catch (Throwable th) {
            this.f3673b = false;
            throw th;
        }
    }

    /* renamed from: W */
    public void mo5952W() {
        this.f3663J = true;
        this.f3669P.mo19838m(true);
        mo5951V(4);
    }

    /* renamed from: X */
    public void mo5953X() {
        mo5951V(2);
    }

    /* renamed from: X0 */
    public void mo5954X0(Fragment fragment, String[] strArr, int i) {
        if (this.f3659F != null) {
            this.f3660G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.f3659F.mo27473a(strArr);
            return;
        }
        this.f3693v.mo6186j(fragment, strArr, i);
    }

    /* renamed from: Y */
    public final void mo5955Y() {
        if (this.f3665L) {
            this.f3665L = false;
            mo6025z1();
        }
    }

    /* renamed from: Y0 */
    public void mo5956Y0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f3657D != null) {
            this.f3660G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3657D.mo27473a(intent);
            return;
        }
        this.f3693v.mo6187l(fragment, intent, i, bundle);
    }

    /* renamed from: Z */
    public void mo5957Z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3674c.mo6239e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3676e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3676e.get(i).toString());
            }
        }
        ArrayList<C0655a> arrayList2 = this.f3675d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0655a aVar = this.f3675d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo6131A(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3680i.get());
        synchronized (this.f3672a) {
            int size3 = this.f3672a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3672a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3693v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3694w);
        if (this.f3695x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3695x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3692u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3662I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3663J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3664K);
        if (this.f3661H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3661H);
        }
    }

    /* renamed from: Z0 */
    public void mo5958Z0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.f3658E != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m4630K0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ActivityOptions ");
                    sb.append(bundle2);
                    sb.append(" were added to fillInIntent ");
                    sb.append(intent2);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            int i5 = i2;
            IntentSenderRequest a = new IntentSenderRequest.C0109b(intentSender).mo952b(intent2).mo953c(i3, i2).mo951a();
            int i6 = i;
            this.f3660G.addLast(new LaunchedFragmentInfo(fragment2.mWho, i));
            if (m4630K0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
            }
            this.f3658E.mo27473a(a);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i7 = i;
        this.f3693v.mo6188m(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: a0 */
    public final void mo5959a0() {
        for (SpecialEffectsController j : mo6014w()) {
            j.mo6107j();
        }
    }

    /* renamed from: a1 */
    public void mo5960a1(int i, boolean z) {
        C0675e<?> eVar;
        if (this.f3693v == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3692u) {
            this.f3692u = i;
            this.f3674c.mo6254t();
            mo6025z1();
            if (this.f3661H && (eVar = this.f3693v) != null && this.f3692u == 7) {
                eVar.mo5890n();
                this.f3661H = false;
            }
        }
    }

    /* renamed from: b0 */
    public void mo5961b0(C0644m mVar, boolean z) {
        if (!z) {
            if (this.f3693v != null) {
                mo6001s();
            } else if (this.f3664K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3672a) {
            if (this.f3693v != null) {
                this.f3672a.add(mVar);
                mo6006t1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: b1 */
    public void mo5962b1() {
        if (this.f3693v != null) {
            this.f3662I = false;
            this.f3663J = false;
            this.f3669P.mo19838m(false);
            for (Fragment next : this.f3674c.mo6249o()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* renamed from: c0 */
    public final void mo5963c0(boolean z) {
        if (this.f3673b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3693v == null) {
            if (this.f3664K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3693v.mo6185g().getLooper()) {
            if (!z) {
                mo6001s();
            }
            if (this.f3666M == null) {
                this.f3666M = new ArrayList<>();
                this.f3667N = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: c1 */
    public void mo5964c1(FragmentContainerView fragmentContainerView) {
        View view;
        for (C0680h next : this.f3674c.mo6245k()) {
            Fragment k = next.mo6219k();
            if (k.mContainerId == fragmentContainerView.getId() && (view = k.mView) != null && view.getParent() == null) {
                k.mContainer = fragmentContainerView;
                next.mo6210b();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d0 */
    public boolean mo5965d0(boolean z) {
        mo5963c0(z);
        boolean z2 = false;
        while (mo5997q0(this.f3666M, this.f3667N)) {
            this.f3673b = true;
            try {
                mo5990n1(this.f3666M, this.f3667N);
                mo6004t();
                z2 = true;
            } catch (Throwable th) {
                mo6004t();
                throw th;
            }
        }
        mo5917B1();
        mo5955Y();
        this.f3674c.mo6236b();
        return z2;
    }

    /* renamed from: d1 */
    public void mo5966d1(C0680h hVar) {
        Fragment k = hVar.mo6219k();
        if (!k.mDeferStart) {
            return;
        }
        if (this.f3673b) {
            this.f3665L = true;
            return;
        }
        k.mDeferStart = false;
        hVar.mo6221m();
    }

    /* renamed from: e0 */
    public void mo5967e0(C0644m mVar, boolean z) {
        if (!z || (this.f3693v != null && !this.f3664K)) {
            mo5963c0(z);
            if (mVar.mo6063a(this.f3666M, this.f3667N)) {
                this.f3673b = true;
                try {
                    mo5990n1(this.f3666M, this.f3667N);
                } finally {
                    mo6004t();
                }
            }
            mo5917B1();
            mo5955Y();
            this.f3674c.mo6236b();
        }
    }

    /* renamed from: e1 */
    public void mo5968e1() {
        mo5961b0(new C0645n((String) null, -1, 0), false);
    }

    /* renamed from: f1 */
    public void mo5969f1(int i, int i2, boolean z) {
        if (i >= 0) {
            mo5961b0(new C0645n((String) null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: g0 */
    public final void mo5970g0(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).f3873r;
        ArrayList<Fragment> arrayList3 = this.f3668O;
        if (arrayList3 == null) {
            this.f3668O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f3668O.addAll(this.f3674c.mo6249o());
        Fragment B0 = mo5916B0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C0655a aVar = arrayList.get(i3);
            if (!arrayList2.get(i3).booleanValue()) {
                B0 = aVar.mo6135E(this.f3668O, B0);
            } else {
                B0 = aVar.mo6138H(this.f3668O, B0);
            }
            if (z2 || aVar.f3864i) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f3668O.clear();
        if (!z && this.f3692u >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<C0684j.C0685a> it = arrayList.get(i4).f3858c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3876b;
                    if (!(fragment == null || fragment.mFragmentManager == null)) {
                        this.f3674c.mo6252r(mo6020y(fragment));
                    }
                }
            }
        }
        m4642f0(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            C0655a aVar2 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = aVar2.f3858c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f3858c.get(size).f3876b;
                    if (fragment2 != null) {
                        mo6020y(fragment2).mo6221m();
                    }
                }
            } else {
                Iterator<C0684j.C0685a> it2 = aVar2.f3858c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f3876b;
                    if (fragment3 != null) {
                        mo6020y(fragment3).mo6221m();
                    }
                }
            }
        }
        mo5960a1(this.f3692u, true);
        for (SpecialEffectsController next : mo6017x(arrayList, i, i2)) {
            next.mo6113r(booleanValue);
            next.mo6111p();
            next.mo6104g();
        }
        while (i < i2) {
            C0655a aVar3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && aVar3.f3776v >= 0) {
                aVar3.f3776v = -1;
            }
            aVar3.mo6137G();
            i++;
        }
        if (z2) {
            mo5995p1();
        }
    }

    /* renamed from: g1 */
    public void mo5971g1(String str, int i) {
        mo5961b0(new C0645n(str, -1, i), false);
    }

    /* renamed from: h0 */
    public boolean mo5972h0() {
        boolean d0 = mo5965d0(true);
        mo5994p0();
        return d0;
    }

    /* renamed from: h1 */
    public boolean mo5973h1() {
        return mo5979j1((String) null, -1, 0);
    }

    /* renamed from: i */
    public void mo5974i(C0655a aVar) {
        if (this.f3675d == null) {
            this.f3675d = new ArrayList<>();
        }
        this.f3675d.add(aVar);
    }

    /* renamed from: i0 */
    public Fragment mo5975i0(String str) {
        return this.f3674c.mo6240f(str);
    }

    /* renamed from: i1 */
    public boolean mo5976i1(int i, int i2) {
        if (i >= 0) {
            return mo5979j1((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: j */
    public C0680h mo5977j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.m4999h(fragment, str);
        }
        if (m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        C0680h y = mo6020y(fragment);
        fragment.mFragmentManager = this;
        this.f3674c.mo6252r(y);
        if (!fragment.mDetached) {
            this.f3674c.mo6235a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (mo5935L0(fragment)) {
                this.f3661H = true;
            }
        }
        return y;
    }

    /* renamed from: j0 */
    public final int mo5978j0(String str, int i, boolean z) {
        ArrayList<C0655a> arrayList = this.f3675d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.f3675d.size() - 1;
            while (size >= 0) {
                C0655a aVar = this.f3675d.get(size);
                if ((str != null && str.equals(aVar.mo6136F())) || (i >= 0 && i == aVar.f3776v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z) {
                while (size > 0) {
                    C0655a aVar2 = this.f3675d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.mo6136F())) && (i < 0 || i != aVar2.f3776v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f3675d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z) {
            return 0;
        } else {
            return this.f3675d.size() - 1;
        }
    }

    /* renamed from: j1 */
    public final boolean mo5979j1(String str, int i, int i2) {
        mo5965d0(false);
        mo5963c0(true);
        Fragment fragment = this.f3696y;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo5973h1()) {
            return true;
        }
        boolean k1 = mo5982k1(this.f3666M, this.f3667N, str, i, i2);
        if (k1) {
            this.f3673b = true;
            try {
                mo5990n1(this.f3666M, this.f3667N);
            } finally {
                mo6004t();
            }
        }
        mo5917B1();
        mo5955Y();
        this.f3674c.mo6236b();
        return k1;
    }

    /* renamed from: k */
    public void mo5980k(ia2 ia2) {
        this.f3686o.add(ia2);
    }

    /* renamed from: k0 */
    public Fragment mo5981k0(int i) {
        return this.f3674c.mo6241g(i);
    }

    /* renamed from: k1 */
    public boolean mo5982k1(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int j0 = mo5978j0(str, i, z);
        if (j0 < 0) {
            return false;
        }
        for (int size = this.f3675d.size() - 1; size >= j0; size--) {
            arrayList.add(this.f3675d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: l */
    public void mo5983l(C0643l lVar) {
        if (this.f3684m == null) {
            this.f3684m = new ArrayList<>();
        }
        this.f3684m.add(lVar);
    }

    /* renamed from: l0 */
    public Fragment mo5984l0(String str) {
        return this.f3674c.mo6242h(str);
    }

    /* renamed from: l1 */
    public void mo5985l1(C0642k kVar, boolean z) {
        this.f3685n.mo6207o(kVar, z);
    }

    /* renamed from: m */
    public void mo5986m(Fragment fragment) {
        this.f3669P.mo19826b(fragment);
    }

    /* renamed from: m0 */
    public Fragment mo5987m0(String str) {
        return this.f3674c.mo6243i(str);
    }

    /* renamed from: m1 */
    public void mo5988m1(Fragment fragment) {
        if (m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f3674c.mo6255u(fragment);
            if (mo5935L0(fragment)) {
                this.f3661H = true;
            }
            fragment.mRemoving = true;
            mo6019x1(fragment);
        }
    }

    /* renamed from: n */
    public int mo5989n() {
        return this.f3680i.getAndIncrement();
    }

    /* renamed from: n1 */
    public final void mo5990n1(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3873r) {
                        if (i2 != i) {
                            mo5970g0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3873r) {
                                i2++;
                            }
                        }
                        mo5970g0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    mo5970g0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: zg4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5991o(androidx.fragment.app.C0675e<?> r4, p000.k92 r5, androidx.fragment.app.Fragment r6) {
        /*
            r3 = this;
            androidx.fragment.app.e<?> r0 = r3.f3693v
            if (r0 != 0) goto L_0x016c
            r3.f3693v = r4
            r3.f3694w = r5
            r3.f3695x = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$g r5 = new androidx.fragment.app.FragmentManager$g
            r5.<init>(r6)
            r3.mo5980k(r5)
            goto L_0x001f
        L_0x0015:
            boolean r5 = r4 instanceof p000.ia2
            if (r5 == 0) goto L_0x001f
            r5 = r4
            ia2 r5 = (p000.ia2) r5
            r3.mo5980k(r5)
        L_0x001f:
            androidx.fragment.app.Fragment r5 = r3.f3695x
            if (r5 == 0) goto L_0x0026
            r3.mo5917B1()
        L_0x0026:
            boolean r5 = r4 instanceof p000.zg4
            if (r5 == 0) goto L_0x003b
            r5 = r4
            zg4 r5 = (p000.zg4) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.getOnBackPressedDispatcher()
            r3.f3678g = r0
            if (r6 == 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            yg4 r1 = r3.f3679h
            r0.mo912a(r5, r1)
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r4 = r6.mFragmentManager
            fa2 r4 = r4.mo6002s0(r6)
            r3.f3669P = r4
            goto L_0x005f
        L_0x0046:
            boolean r5 = r4 instanceof p000.hd7
            if (r5 == 0) goto L_0x0057
            hd7 r4 = (p000.hd7) r4
            gd7 r4 = r4.getViewModelStore()
            fa2 r4 = p000.fa2.m16752h(r4)
            r3.f3669P = r4
            goto L_0x005f
        L_0x0057:
            fa2 r4 = new fa2
            r5 = 0
            r4.<init>(r5)
            r3.f3669P = r4
        L_0x005f:
            fa2 r4 = r3.f3669P
            boolean r5 = r3.mo5947R0()
            r4.mo19838m(r5)
            androidx.fragment.app.i r4 = r3.f3674c
            fa2 r5 = r3.f3669P
            r4.mo6233A(r5)
            androidx.fragment.app.e<?> r4 = r3.f3693v
            boolean r5 = r4 instanceof p000.il5
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            il5 r4 = (p000.il5) r4
            gl5 r4 = r4.getSavedStateRegistry()
            da2 r5 = new da2
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.mo20648h(r0, r5)
            android.os.Bundle r4 = r4.mo20643b(r0)
            if (r4 == 0) goto L_0x0090
            r3.mo5998q1(r4)
        L_0x0090:
            androidx.fragment.app.e<?> r4 = r3.f3693v
            boolean r5 = r4 instanceof p000.C3590xa
            if (r5 == 0) goto L_0x0128
            xa r4 = (p000.C3590xa) r4
            androidx.activity.result.ActivityResultRegistry r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r5 = ""
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            va r1 = new va
            r1.<init>()
            androidx.fragment.app.FragmentManager$h r2 = new androidx.fragment.app.FragmentManager$h
            r2.<init>()
            wa r0 = r4.mo933i(r0, r1, r2)
            r3.f3657D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.fragment.app.FragmentManager$i r2 = new androidx.fragment.app.FragmentManager$i
            r2.<init>()
            wa r0 = r4.mo933i(r0, r1, r2)
            r3.f3658E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            ta r0 = new ta
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            wa r4 = r4.mo933i(r5, r0, r1)
            r3.f3659F = r4
        L_0x0128:
            androidx.fragment.app.e<?> r4 = r3.f3693v
            boolean r5 = r4 instanceof p000.ch4
            if (r5 == 0) goto L_0x0135
            ch4 r4 = (p000.ch4) r4
            yq0<android.content.res.Configuration> r5 = r3.f3687p
            r4.addOnConfigurationChangedListener(r5)
        L_0x0135:
            androidx.fragment.app.e<?> r4 = r3.f3693v
            boolean r5 = r4 instanceof p000.vh4
            if (r5 == 0) goto L_0x0142
            vh4 r4 = (p000.vh4) r4
            yq0<java.lang.Integer> r5 = r3.f3688q
            r4.addOnTrimMemoryListener(r5)
        L_0x0142:
            androidx.fragment.app.e<?> r4 = r3.f3693v
            boolean r5 = r4 instanceof p000.kh4
            if (r5 == 0) goto L_0x014f
            kh4 r4 = (p000.kh4) r4
            yq0<b04> r5 = r3.f3689r
            r4.addOnMultiWindowModeChangedListener(r5)
        L_0x014f:
            androidx.fragment.app.e<?> r4 = r3.f3693v
            boolean r5 = r4 instanceof p000.mh4
            if (r5 == 0) goto L_0x015c
            mh4 r4 = (p000.mh4) r4
            yq0<po4> r5 = r3.f3690s
            r4.addOnPictureInPictureModeChangedListener(r5)
        L_0x015c:
            androidx.fragment.app.e<?> r4 = r3.f3693v
            boolean r5 = r4 instanceof p000.it3
            if (r5 == 0) goto L_0x016b
            if (r6 != 0) goto L_0x016b
            it3 r4 = (p000.it3) r4
            eu3 r5 = r3.f3691t
            r4.addMenuProvider(r5)
        L_0x016b:
            return
        L_0x016c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo5991o(androidx.fragment.app.e, k92, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: o1 */
    public void mo5992o1(Fragment fragment) {
        this.f3669P.mo19837l(fragment);
    }

    /* renamed from: p */
    public void mo5993p(Fragment fragment) {
        if (m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f3674c.mo6235a(fragment);
                if (m4630K0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                }
                if (mo5935L0(fragment)) {
                    this.f3661H = true;
                }
            }
        }
    }

    /* renamed from: p0 */
    public final void mo5994p0() {
        for (SpecialEffectsController k : mo6014w()) {
            k.mo6108k();
        }
    }

    /* renamed from: p1 */
    public final void mo5995p1() {
        if (this.f3684m != null) {
            for (int i = 0; i < this.f3684m.size(); i++) {
                this.f3684m.get(i).onBackStackChanged();
            }
        }
    }

    /* renamed from: q */
    public C0684j mo5996q() {
        return new C0655a(this);
    }

    /* renamed from: q0 */
    public final boolean mo5997q0(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3672a) {
            if (this.f3672a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3672a.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f3672a.get(i).mo6063a(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.f3672a.clear();
                this.f3693v.mo6185g().removeCallbacks(this.f3671R);
            }
        }
    }

    /* renamed from: q1 */
    public void mo5998q1(Parcelable parcelable) {
        C0680h hVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f3693v.mo6184f().getClassLoader());
                    this.f3682k.put(next.substring(7), bundle2);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f3693v.mo6184f().getClassLoader());
                    arrayList.add((FragmentState) bundle.getParcelable("state"));
                }
            }
            this.f3674c.mo6258x(arrayList);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
            if (fragmentManagerState != null) {
                this.f3674c.mo6256v();
                Iterator<String> it = fragmentManagerState.f3718a.iterator();
                while (it.hasNext()) {
                    FragmentState B = this.f3674c.mo6234B(it.next(), (FragmentState) null);
                    if (B != null) {
                        Fragment f = this.f3669P.mo19831f(B.f3731d);
                        if (f != null) {
                            if (m4630K0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("restoreSaveState: re-attaching retained ");
                                sb.append(f);
                            }
                            hVar = new C0680h(this.f3685n, this.f3674c, f, B);
                        } else {
                            hVar = new C0680h(this.f3685n, this.f3674c, this.f3693v.mo6184f().getClassLoader(), mo6012v0(), B);
                        }
                        Fragment k = hVar.mo6219k();
                        k.mFragmentManager = this;
                        if (m4630K0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("restoreSaveState: active (");
                            sb2.append(k.mWho);
                            sb2.append("): ");
                            sb2.append(k);
                        }
                        hVar.mo6223o(this.f3693v.mo6184f().getClassLoader());
                        this.f3674c.mo6252r(hVar);
                        hVar.mo6228t(this.f3692u);
                    }
                }
                for (Fragment next3 : this.f3669P.mo19834i()) {
                    if (!this.f3674c.mo6237c(next3.mWho)) {
                        if (m4630K0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Discarding retained Fragment ");
                            sb3.append(next3);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(fragmentManagerState.f3718a);
                        }
                        this.f3669P.mo19837l(next3);
                        next3.mFragmentManager = this;
                        C0680h hVar2 = new C0680h(this.f3685n, this.f3674c, next3);
                        hVar2.mo6228t(1);
                        hVar2.mo6221m();
                        next3.mRemoving = true;
                        hVar2.mo6221m();
                    }
                }
                this.f3674c.mo6257w(fragmentManagerState.f3719d);
                if (fragmentManagerState.f3720e != null) {
                    this.f3675d = new ArrayList<>(fragmentManagerState.f3720e.length);
                    int i = 0;
                    while (true) {
                        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f3720e;
                        if (i >= backStackRecordStateArr.length) {
                            break;
                        }
                        C0655a b = backStackRecordStateArr[i].mo5671b(this);
                        if (m4630K0(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("restoreAllState: back stack #");
                            sb4.append(i);
                            sb4.append(" (index ");
                            sb4.append(b.f3776v);
                            sb4.append("): ");
                            sb4.append(b);
                            PrintWriter printWriter = new PrintWriter(new pk3("FragmentManager"));
                            b.mo6132B("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3675d.add(b);
                        i++;
                    }
                } else {
                    this.f3675d = null;
                }
                this.f3680i.set(fragmentManagerState.f3721g);
                String str = fragmentManagerState.f3722k;
                if (str != null) {
                    Fragment i0 = mo5975i0(str);
                    this.f3696y = i0;
                    mo5940O(i0);
                }
                ArrayList<String> arrayList2 = fragmentManagerState.f3723r;
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        this.f3681j.put(arrayList2.get(i2), fragmentManagerState.f3724s.get(i2));
                    }
                }
                this.f3660G = new ArrayDeque<>(fragmentManagerState.f3725x);
            }
        }
    }

    /* renamed from: r */
    public boolean mo5999r() {
        boolean z = false;
        for (Fragment next : this.f3674c.mo6246l()) {
            if (next != null) {
                z = mo5935L0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r0 */
    public int mo6000r0() {
        ArrayList<C0655a> arrayList = this.f3675d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: s */
    public final void mo6001s() {
        if (mo5947R0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: s0 */
    public final fa2 mo6002s0(Fragment fragment) {
        return this.f3669P.mo19832g(fragment);
    }

    /* renamed from: s1 */
    public Bundle m4631S0() {
        int size;
        Bundle bundle = new Bundle();
        mo5994p0();
        mo5959a0();
        mo5965d0(true);
        this.f3662I = true;
        this.f3669P.mo19838m(true);
        ArrayList<String> y = this.f3674c.mo6259y();
        ArrayList<FragmentState> m = this.f3674c.mo6247m();
        if (m.isEmpty()) {
            m4630K0(2);
        } else {
            ArrayList<String> z = this.f3674c.mo6260z();
            BackStackRecordState[] backStackRecordStateArr = null;
            ArrayList<C0655a> arrayList = this.f3675d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f3675d.get(i));
                    if (m4630K0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.f3675d.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f3718a = y;
            fragmentManagerState.f3719d = z;
            fragmentManagerState.f3720e = backStackRecordStateArr;
            fragmentManagerState.f3721g = this.f3680i.get();
            Fragment fragment = this.f3696y;
            if (fragment != null) {
                fragmentManagerState.f3722k = fragment.mWho;
            }
            fragmentManagerState.f3723r.addAll(this.f3681j.keySet());
            fragmentManagerState.f3724s.addAll(this.f3681j.values());
            fragmentManagerState.f3725x = new ArrayList<>(this.f3660G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String next : this.f3682k.keySet()) {
                bundle.putBundle("result_" + next, this.f3682k.get(next));
            }
            Iterator<FragmentState> it = m.iterator();
            while (it.hasNext()) {
                FragmentState next2 = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next2);
                bundle.putBundle("fragment_" + next2.f3731d, bundle2);
            }
        }
        return bundle;
    }

    /* renamed from: t */
    public final void mo6004t() {
        this.f3673b = false;
        this.f3667N.clear();
        this.f3666M.clear();
    }

    /* renamed from: t0 */
    public k92 mo6005t0() {
        return this.f3694w;
    }

    /* renamed from: t1 */
    public void mo6006t1() {
        synchronized (this.f3672a) {
            boolean z = true;
            if (this.f3672a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f3693v.mo6185g().removeCallbacks(this.f3671R);
                this.f3693v.mo6185g().post(this.f3671R);
                mo5917B1();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3695x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3695x)));
            sb.append("}");
        } else {
            C0675e<?> eVar = this.f3693v;
            if (eVar != null) {
                sb.append(eVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3693v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo6008u() {
        C0675e<?> eVar = this.f3693v;
        boolean z = true;
        if (eVar instanceof hd7) {
            z = this.f3674c.mo6250p().mo19836k();
        } else if (eVar.mo6184f() instanceof Activity) {
            z = true ^ ((Activity) this.f3693v.mo6184f()).isChangingConfigurations();
        }
        if (z) {
            for (BackStackState backStackState : this.f3681j.values()) {
                for (String d : backStackState.f3606a) {
                    this.f3674c.mo6250p().mo19828d(d);
                }
            }
        }
    }

    /* renamed from: u0 */
    public final ViewGroup mo6009u0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3694w.mo5862d()) {
            View c = this.f3694w.mo5861c(fragment.mContainerId);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
        }
        return null;
    }

    /* renamed from: u1 */
    public void mo6010u1(Fragment fragment, boolean z) {
        ViewGroup u0 = mo6009u0(fragment);
        if (u0 != null && (u0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) u0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: v */
    public final void mo6011v(String str) {
        this.f3682k.remove(str);
        if (m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing fragment result with key ");
            sb.append(str);
        }
    }

    /* renamed from: v0 */
    public C0674d mo6012v0() {
        C0674d dVar = this.f3697z;
        if (dVar != null) {
            return dVar;
        }
        Fragment fragment = this.f3695x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo6012v0();
        }
        return this.f3654A;
    }

    /* renamed from: v1 */
    public void mo6013v1(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(mo5975i0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    /* renamed from: w */
    public final Set<SpecialEffectsController> mo6014w() {
        HashSet hashSet = new HashSet();
        for (C0680h k : this.f3674c.mo6245k()) {
            ViewGroup viewGroup = k.mo6219k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m4814n(viewGroup, mo5919C0()));
            }
        }
        return hashSet;
    }

    /* renamed from: w0 */
    public List<Fragment> mo6015w0() {
        return this.f3674c.mo6249o();
    }

    /* renamed from: w1 */
    public void mo6016w1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo5975i0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3696y;
            this.f3696y = fragment;
            mo5940O(fragment2);
            mo5940O(this.f3696y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: x */
    public final Set<SpecialEffectsController> mo6017x(ArrayList<C0655a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C0684j.C0685a> it = arrayList.get(i).f3858c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3876b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(SpecialEffectsController.m4815o(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: x0 */
    public C0675e<?> mo6018x0() {
        return this.f3693v;
    }

    /* renamed from: x1 */
    public final void mo6019x1(Fragment fragment) {
        ViewGroup u0 = mo6009u0(fragment);
        if (u0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = s35.visible_removing_fragment_view_tag;
            if (u0.getTag(i) == null) {
                u0.setTag(i, fragment);
            }
            ((Fragment) u0.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: y */
    public C0680h mo6020y(Fragment fragment) {
        C0680h n = this.f3674c.mo6248n(fragment.mWho);
        if (n != null) {
            return n;
        }
        C0680h hVar = new C0680h(this.f3685n, this.f3674c, fragment);
        hVar.mo6223o(this.f3693v.mo6184f().getClassLoader());
        hVar.mo6228t(this.f3692u);
        return hVar;
    }

    /* renamed from: y0 */
    public LayoutInflater.Factory2 mo6021y0() {
        return this.f3677f;
    }

    /* renamed from: y1 */
    public void mo6022y1(Fragment fragment) {
        if (m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: z */
    public void mo6023z(Fragment fragment) {
        if (m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m4630K0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                }
                this.f3674c.mo6255u(fragment);
                if (mo5935L0(fragment)) {
                    this.f3661H = true;
                }
                mo6019x1(fragment);
            }
        }
    }

    /* renamed from: z0 */
    public C0678g mo6024z0() {
        return this.f3685n;
    }

    /* renamed from: z1 */
    public final void mo6025z1() {
        for (C0680h d1 : this.f3674c.mo6245k()) {
            mo5966d1(d1);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0631a();

        /* renamed from: a */
        public String f3702a;

        /* renamed from: d */
        public int f3703d;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C0631a implements Parcelable.Creator<LaunchedFragmentInfo> {
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f3702a = str;
            this.f3703d = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3702a);
            parcel.writeInt(this.f3703d);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f3702a = parcel.readString();
            this.f3703d = parcel.readInt();
        }
    }
}
