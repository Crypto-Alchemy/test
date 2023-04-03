package net.safemoon.androidwallet.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.ref.WeakReference;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.dialogs.CMCListCheckable;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/NotificationFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lr37;", "X", "P", "R", "c0", "", "isListVisible", "e0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lga2;", "k", "Lga2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SettingNotificationViewModel;", "r", "Lef3;", "M", "()Lnet/safemoon/androidwallet/viewmodels/SettingNotificationViewModel;", "notificationViewModel", "Lrj4;", "s", "O", "()Lrj4;", "paTokenAdapter", "Lnet/safemoon/androidwallet/dialogs/CMCListCheckable;", "x", "L", "()Lnet/safemoon/androidwallet/dialogs/CMCListCheckable;", "cmcListDialog", "Landroid/view/View$OnTouchListener;", "y", "Landroid/view/View$OnTouchListener;", "N", "()Landroid/view/View$OnTouchListener;", "onTouchListener", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "A", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "recyclerTouchListener", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NotificationFragment.kt */
public final class NotificationFragment extends BaseMainFragment {

    /* renamed from: A */
    public RecyclerTouchListener f41989A;

    /* renamed from: k */
    public ga2 f41990k;

    /* renamed from: r */
    public final ef3 f41991r;

    /* renamed from: s */
    public final ef3 f41992s = C6169a.m47232a(new NotificationFragment$paTokenAdapter$2(this));

    /* renamed from: x */
    public final ef3 f41993x = C6169a.m47232a(new NotificationFragment$cmcListDialog$2(this));

    /* renamed from: y */
    public final View.OnTouchListener f41994y = new da4(this);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/NotificationFragment$a", "Lyg4;", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.NotificationFragment$a */
    /* compiled from: NotificationFragment.kt */
    public static final class C8406a extends yg4 {

        /* renamed from: c */
        public final /* synthetic */ NotificationFragment f41995c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8406a(NotificationFragment notificationFragment) {
            super(true);
            this.f41995c = notificationFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r0 == true) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo6034b() {
            /*
                r3 = this;
                net.safemoon.androidwallet.fragments.NotificationFragment r0 = r3.f41995c
                ga2 r0 = r0.f41990k
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x001a
                androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f29147b
                if (r0 == 0) goto L_0x001a
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0016
                r0 = r1
                goto L_0x0017
            L_0x0016:
                r0 = r2
            L_0x0017:
                if (r0 != r1) goto L_0x001a
                goto L_0x001b
            L_0x001a:
                r1 = r2
            L_0x001b:
                if (r1 == 0) goto L_0x0023
                net.safemoon.androidwallet.fragments.NotificationFragment r0 = r3.f41995c
                r0.mo50752i()
                goto L_0x0028
            L_0x0023:
                net.safemoon.androidwallet.fragments.NotificationFragment r0 = r3.f41995c
                r0.mo57524c0()
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.NotificationFragment.C8406a.mo6034b():void");
        }
    }

    public NotificationFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new NotificationFragment$special$$inlined$viewModels$default$2(new NotificationFragment$special$$inlined$viewModels$default$1(this)));
        this.f41991r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SettingNotificationViewModel.class), new NotificationFragment$special$$inlined$viewModels$default$3(b), new NotificationFragment$special$$inlined$viewModels$default$4((pc2) null, b), new NotificationFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: Q */
    public static final void m66663Q(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: S */
    public static final void m66664S(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: T */
    public static final void m66665T(NotificationFragment notificationFragment, int i, int i2) {
        vx2.m53591g(notificationFragment, "this$0");
        if (i == R.id.btnDelete) {
            PAToken pAToken = (PAToken) notificationFragment.mo57520O().getCurrentList().get(i2);
            if (pAToken.getChainId() == -1) {
                C9001np.m69933R(new WeakReference(notificationFragment.requireActivity()), Integer.valueOf(R.string.confirm), (String) null, Integer.valueOf(R.string.delete_any_confirm), (String) null, Integer.valueOf(R.string.delete), Integer.valueOf(R.string.cancel), Integer.valueOf(zr0.m31440c(notificationFragment.requireContext(), R.color.red)), Integer.valueOf(zr0.m31440c(notificationFragment.requireContext(), R.color.t1)), new NotificationFragment$initPriceAlert$1$1$6$1$1$1(notificationFragment, pAToken), NotificationFragment$initPriceAlert$1$1$6$1$1$2.INSTANCE);
            }
        }
    }

    /* renamed from: U */
    public static final void m66666U(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: V */
    public static final void m66667V(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: W */
    public static final void m66668W(NotificationFragment notificationFragment, View view) {
        vx2.m53591g(notificationFragment, "this$0");
        notificationFragment.mo57524c0();
    }

    /* renamed from: Y */
    public static final void m66669Y(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Z */
    public static final boolean m66670Z(NotificationFragment notificationFragment, View view, MotionEvent motionEvent) {
        vx2.m53591g(notificationFragment, "this$0");
        if (motionEvent.getAction() != 1) {
            return false;
        }
        if (notificationFragment.mo57517L().isVisible() || notificationFragment.mo57517L().isAdded()) {
            notificationFragment.mo57517L().mo22266k();
        }
        CMCListCheckable L = notificationFragment.mo57517L();
        FragmentManager childFragmentManager = notificationFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        L.mo57172T(childFragmentManager);
        return true;
    }

    /* renamed from: a0 */
    public static final void m66671a0(NotificationFragment notificationFragment, View view) {
        vx2.m53591g(notificationFragment, "this$0");
        notificationFragment.requireActivity().onBackPressed();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m66672b0(net.safemoon.androidwallet.fragments.NotificationFragment r0, p000.ga2 r1, int[] r2, int[] r3, android.view.View r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String r4 = "this$0"
            p000.vx2.m53591g(r0, r4)
            java.lang.String r4 = "$it"
            p000.vx2.m53591g(r1, r4)
            java.lang.String r4 = "$mRect"
            p000.vx2.m53591g(r2, r4)
            java.lang.String r4 = "$toolbarRect"
            p000.vx2.m53591g(r3, r4)
            ga2 r4 = r0.f41990k
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x002b
            androidx.appcompat.widget.LinearLayoutCompat r4 = r4.f29147b
            if (r4 == 0) goto L_0x002b
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x0026
            r4 = r6
            goto L_0x0027
        L_0x0026:
            r4 = r5
        L_0x0027:
            if (r4 != r6) goto L_0x002b
            r4 = r6
            goto L_0x002c
        L_0x002b:
            r4 = r5
        L_0x002c:
            if (r4 != 0) goto L_0x00a3
            vn5 r4 = r1.f29155j
            android.widget.LinearLayout r4 = r4.mo48773b()
            r4.getLocationOnScreen(r2)
            r2 = r2[r6]
            r3 = r3[r6]
            android.view.View r4 = r1.f29148c
            int r4 = r4.getBottom()
            int r3 = r3 + r4
            android.content.res.Resources r0 = r0.getResources()
            r4 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r0.getDimensionPixelSize(r4)
            int r3 = r3 + r0
            int r2 = r2 - r3
            if (r2 > 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = r5
        L_0x0053:
            vn5 r0 = r1.f29155j
            com.google.android.material.textfield.TextInputEditText r0 = r0.f34980b
            boolean r0 = r0.hasFocus()
            r2 = -99
            if (r0 == 0) goto L_0x0068
            vn5 r3 = r1.f29155j
            com.google.android.material.textfield.TextInputEditText r3 = r3.f34980b
            int r3 = r3.getSelectionEnd()
            goto L_0x0069
        L_0x0068:
            r3 = r2
        L_0x0069:
            vn5 r4 = r1.f29156k
            com.google.android.material.textfield.TextInputEditText r4 = r4.f34980b
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x007b
            vn5 r2 = r1.f29156k
            com.google.android.material.textfield.TextInputEditText r2 = r2.f34980b
            int r2 = r2.getSelectionEnd()
        L_0x007b:
            android.widget.FrameLayout r7 = r1.f29157l
            java.lang.String r8 = "it.stickySearchWrapper"
            p000.vx2.m53590f(r7, r8)
            if (r6 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r5 = 8
        L_0x0087:
            r7.setVisibility(r5)
            if (r0 == 0) goto L_0x0093
            vn5 r0 = r1.f29156k     // Catch:{ Exception -> 0x0093 }
            com.google.android.material.textfield.TextInputEditText r0 = r0.f34980b     // Catch:{ Exception -> 0x0093 }
            r0.setSelection(r3)     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            if (r4 == 0) goto L_0x00a3
            vn5 r0 = r1.f29155j
            com.google.android.material.textfield.TextInputEditText r0 = r0.f34980b
            r0.requestFocus()
            vn5 r0 = r1.f29155j     // Catch:{ Exception -> 0x00a3 }
            com.google.android.material.textfield.TextInputEditText r0 = r0.f34980b     // Catch:{ Exception -> 0x00a3 }
            r0.setSelection(r2)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.NotificationFragment.m66672b0(net.safemoon.androidwallet.fragments.NotificationFragment, ga2, int[], int[], android.view.View, int, int, int, int):void");
    }

    /* renamed from: d0 */
    public static final void m66673d0(NotificationFragment notificationFragment) {
        vx2.m53591g(notificationFragment, "this$0");
        if (notificationFragment.isVisible()) {
            notificationFragment.mo57525e0(false);
        }
    }

    /* renamed from: L */
    public final CMCListCheckable mo57517L() {
        return (CMCListCheckable) this.f41993x.getValue();
    }

    /* renamed from: M */
    public final SettingNotificationViewModel mo57518M() {
        return (SettingNotificationViewModel) this.f41991r.getValue();
    }

    /* renamed from: N */
    public final View.OnTouchListener mo57519N() {
        return this.f41994y;
    }

    /* renamed from: O */
    public final rj4 mo57520O() {
        return (rj4) this.f41992s.getValue();
    }

    /* renamed from: P */
    public final void mo57521P() {
        ga2 ga2 = this.f41990k;
        if (ga2 != null) {
            SwitchMaterial switchMaterial = ga2.f29158m;
            vx2.m53590f(switchMaterial, "initEnableNotification$lambda$6$lambda$5");
            tc7.m72257j(switchMaterial, new NotificationFragment$initEnableNotification$1$1$1(this));
            mo57518M().mo61404H().observe(getViewLifecycleOwner(), new ma4(new NotificationFragment$initEnableNotification$1$1$2(switchMaterial)));
        }
    }

    /* renamed from: R */
    public final void mo57522R() {
        RecyclerView recyclerView;
        ga2 ga2 = this.f41990k;
        if (ga2 != null) {
            mo57518M().mo61416t().observe(getViewLifecycleOwner(), new ha4(new NotificationFragment$initPriceAlert$1$1$1(this)));
            TextInputEditText textInputEditText = ga2.f29156k.f34980b;
            vx2.m53590f(textInputEditText, "stickySearchBar.etSearch");
            tc7.m72256i(textInputEditText, new NotificationFragment$initPriceAlert$1$1$2(ga2, this));
            TextInputEditText textInputEditText2 = ga2.f29155j.f34980b;
            vx2.m53590f(textInputEditText2, "searchBar.etSearch");
            tc7.m72256i(textInputEditText2, new NotificationFragment$initPriceAlert$1$1$3(ga2, this));
            ga2.f29161p.setOnClickListener(new ia4(this));
            mo57518M().mo61420x().observe(getViewLifecycleOwner(), new ja4(new NotificationFragment$initPriceAlert$1$1$5(ga2, this)));
            ga2.f29153h.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            ga2.f29153h.setAdapter(mo57520O());
            FragmentActivity requireActivity = requireActivity();
            ga2 ga22 = this.f41990k;
            if (ga22 != null) {
                recyclerView = ga22.f29153h;
            } else {
                recyclerView = null;
            }
            RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(requireActivity, recyclerView);
            recyclerTouchListener.mo57036x(Integer.valueOf(R.id.btnDelete));
            recyclerTouchListener.mo57037y(R.id.rowFG, R.id.rowBG, new ka4(this));
            this.f41989A = recyclerTouchListener;
            mo57518M().mo61399C().observe(getViewLifecycleOwner(), new la4(new NotificationFragment$initPriceAlert$1$1$7(this)));
        }
    }

    /* renamed from: X */
    public final void mo57523X() {
        dl5 dl5;
        k04 f;
        NavBackStackEntry A = x92.m29982a(this).mo8445A();
        if (A != null) {
            dl5 = A.mo8428i();
        } else {
            dl5 = null;
        }
        if (dl5 != null && (f = dl5.mo18830f("RESULT_FROM_CRYPTO_PRICE_ALERT")) != null) {
            f.observe(A, new na4(new NotificationFragment$initPriceAlertFragmentState$1(this)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57524c0() {
        /*
            r4 = this;
            ga2 r0 = r4.f41990k
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f29147b
            if (r0 == 0) goto L_0x0016
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0012
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            if (r1 == 0) goto L_0x007e
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            p000.a77.m55427e(r0)
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r0 = r4.mo57518M()
            k04 r0 = r0.mo61398B()
            java.util.List r1 = p000.ck0.m33062j()
            r0.postValue(r1)
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r0 = r4.mo57518M()
            java.lang.Integer r0 = r0.mo61421y()
            r1 = -1
            if (r0 != 0) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x0056
        L_0x0041:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r0 = r4.mo57518M()
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r1 = r4.mo57518M()
            k04 r1 = r1.mo61401E()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.mo61409R(r1)
        L_0x0056:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r0 = r4.mo57518M()
            k04 r0 = r0.mo61401E()
            java.lang.String r1 = ""
            r0.postValue(r1)
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r0 = r4.mo57518M()
            r1 = 0
            r0.mo61408Q(r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ea4 r1 = new ea4
            r1.<init>(r4)
            r2 = 50
            r0.postDelayed(r1, r2)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.NotificationFragment.mo57524c0():void");
    }

    /* renamed from: e0 */
    public final void mo57525e0(boolean z) {
        int i;
        Drawable e;
        ga2 ga2 = this.f41990k;
        if (ga2 != null) {
            ConstraintLayout constraintLayout = ga2.f29151f;
            vx2.m53590f(constraintLayout, "it.cvTokenWrapper");
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            constraintLayout.setVisibility(i);
            LinearLayoutCompat linearLayoutCompat = ga2.f29147b;
            vx2.m53590f(linearLayoutCompat, "it.chainWrapper");
            if (!(!z)) {
                i2 = 8;
            }
            linearLayoutCompat.setVisibility(i2);
            if (!z) {
                FrameLayout frameLayout = ga2.f29157l;
                vx2.m53590f(frameLayout, "it.stickySearchWrapper");
                frameLayout.setVisibility(8);
            }
            MaterialButton materialButton = ga2.f29161p;
            Drawable drawable = null;
            if (z && (e = zr0.m31442e(requireContext(), R.drawable.ic_baseline_keyboard_arrow_down_24)) != null) {
                e.setTint(zr0.m31440c(requireContext(), R.color.setting_color));
                drawable = e;
            }
            materialButton.setIcon(drawable);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        ga2 a = ga2.m44673a(layoutInflater.inflate(R.layout.fragment_notification, viewGroup, false));
        this.f41990k = a;
        vx2.m53588d(a);
        ConstraintLayout b = a.mo42858b();
        vx2.m53590f(b, "binding!!.root");
        return b;
    }

    public void onViewCreated(View view, Bundle bundle) {
        ImageView imageView;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57518M().mo61405I();
        ga2 ga2 = this.f41990k;
        if (!(ga2 == null || (imageView = ga2.f29152g) == null)) {
            imageView.setOnClickListener(new fa4(this));
        }
        if (bundle == null) {
            requireActivity().getOnBackPressedDispatcher().mo912a(getViewLifecycleOwner(), new C8406a(this));
        }
        mo57521P();
        mo57522R();
        mo57523X();
        ga2 ga22 = this.f41990k;
        if (ga22 != null) {
            int[] iArr = new int[2];
            ga22.f29148c.getLocationOnScreen(iArr);
            ga22.f29154i.setOnScrollChangeListener(new ga4(this, ga22, new int[2], iArr));
        }
    }
}
