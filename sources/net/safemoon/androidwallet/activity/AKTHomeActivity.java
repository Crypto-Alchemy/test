package net.safemoon.androidwallet.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0729l;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigation;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.CloseByDoubleBackActivity;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.navMap.NavTreeDirection;
import net.safemoon.androidwallet.model.request.EvmRequestTransaction;
import net.safemoon.androidwallet.model.token.room.RoomToken;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.service.MyFirebaseMessagingService;
import net.safemoon.androidwallet.service.TxnListService;
import net.safemoon.androidwallet.utils.StoragePermissionLauncher;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;
import net.safemoon.androidwallet.viewmodels.factory.MyViewModelFactory;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;
import net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.connection.ConnectionsViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.sessionrequest.SessionRequestViewModel;
import net.safemoon.androidwallet.views.CustomKeyBoard;
import p000.C3083pm;
import zendesk.configurations.Configuration;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Zendesk;
import zendesk.support.Support;
import zendesk.support.requestlist.RequestListActivity;

public class AKTHomeActivity extends CloseByDoubleBackActivity implements ho2, jh4 {

    /* renamed from: o1 */
    public static String f41260o1 = "wc";

    /* renamed from: p1 */
    public static String f41261p1 = "https://safemoon.com/buy/moonpay";

    /* renamed from: q1 */
    public static String f41262q1 = "safemoon";

    /* renamed from: C */
    public C5756ea f41263C;

    /* renamed from: H */
    public MyTokensListViewModel f41264H;

    /* renamed from: I */
    public HomeViewModel f41265I;

    /* renamed from: L */
    public SwapViewModel f41266L;

    /* renamed from: M */
    public ob4 f41267M;

    /* renamed from: P */
    public Intent f41268P;

    /* renamed from: Q */
    public C3083pm f41269Q;

    /* renamed from: U */
    public NavController f41270U;

    /* renamed from: X */
    public MultipleWalletConnect f41271X = null;

    /* renamed from: Y */
    public ConnectionsViewModel f41272Y;

    /* renamed from: Z */
    public SessionRequestViewModel f41273Z;

    /* renamed from: b1 */
    public TxnListService f41274b1;

    /* renamed from: e0 */
    public Web3WalletViewModel f41275e0;

    /* renamed from: e1 */
    public ServiceConnection f41276e1 = new C8132c();

    /* renamed from: k0 */
    public AKTWebSocketHandlingViewModel f41277k0;

    /* renamed from: v0 */
    public boolean f41278v0;

    /* renamed from: net.safemoon.androidwallet.activity.AKTHomeActivity$a */
    public class C8130a implements NavController.C1115b {
        public C8130a() {
        }

        /* renamed from: a */
        public void mo38a(NavController navController, NavDestination navDestination, Bundle bundle) {
            ol0.m70327G(AKTHomeActivity.this);
        }
    }

    /* renamed from: net.safemoon.androidwallet.activity.AKTHomeActivity$b */
    public class C8131b extends op7<String> {
        public C8131b() {
        }

        public void onError(hr1 hr1) {
        }

        public void onSuccess(String str) {
            dq6.m57042b("Khang").mo51264a("registerWithZendesk success %s", str);
        }
    }

    /* renamed from: net.safemoon.androidwallet.activity.AKTHomeActivity$c */
    public class C8132c implements ServiceConnection {
        public C8132c() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AKTHomeActivity.this.f41274b1 = ((TxnListService.C8624b) iBinder).mo60836a();
            AKTHomeActivity.this.f41278v0 = true;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            AKTHomeActivity.this.f41278v0 = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public /* synthetic */ void m64844N0() {
        Integer lastDestination = NavTreeDirection.INSTANCE.getLastDestination(this.f41270U, R.id.navigation_wallet);
        if (lastDestination != null) {
            this.f41270U.mo8467X(lastDestination.intValue(), false);
        } else {
            this.f41270U.mo8456M(R.id.navigation_wallet);
        }
        this.f41265I.mo61231m().postValue(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ void m64845O0(TokenType tokenType) {
        this.f41264H.mo61306T(tokenType);
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public /* synthetic */ void m64846P0(String str) {
        if (str != null && !str.isEmpty()) {
            mo12164e0(this.f8531y, str);
            mo12159X();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ boolean m64848R0(MenuItem menuItem) {
        Integer lastDestination = NavTreeDirection.INSTANCE.getLastDestination(this.f41270U, menuItem.getItemId());
        if (lastDestination != null) {
            this.f41270U.mo8467X(lastDestination.intValue(), false);
            return true;
        }
        this.f41270U.mo8456M(menuItem.getItemId());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ void m64849S0(MenuItem menuItem) {
        this.f41270U.mo8467X(menuItem.getItemId(), false);
        this.f41270U.mo8466W();
        this.f41270U.mo8456M(menuItem.getItemId());
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ void m64850T0(int i) {
        this.f41270U.mo8456M(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ void m64851U0() {
        if (!isFinishing() && !isDestroyed()) {
            this.f41263C.f28478i.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m64852V0(Boolean bool) {
        if (bool.booleanValue() && this.f41265I.mo61227i() != null && !this.f41265I.mo61227i().isEmpty()) {
            startActivity(getPackageManager().getLaunchIntentForPackage(this.f41265I.mo61227i()));
            this.f41265I.mo61237s((String) null);
        }
        if (bool.booleanValue()) {
            this.f41271X.mo61916A().postValue(Boolean.FALSE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ r37 m64853W0() {
        f06.m57523n(this, "V2_HELP_POP", Boolean.FALSE);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ r37 m64854X0() {
        this.f41270U.mo8460Q(vh7.m73245f());
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ void m64855Y0(Bundle bundle, RoomToken roomToken) {
        if (roomToken != null && roomToken.getNativeBalance() > Utils.DOUBLE_EPSILON) {
            if (bundle == null) {
                mo56619c1();
            }
            this.f41264H.mo61293E().removeObservers(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ r37 m64856Z0(List list) {
        if (list.size() <= 1 || ((Wallet) list.get(0)).getOrder() != 0 || ((Wallet) list.get(1)).getOrder() != 0) {
            return null;
        }
        this.f8530x.mo61250I(list);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m64857a1() {
        this.f41265I.mo61235q().postValue(Boolean.FALSE);
    }

    /* renamed from: g1 */
    public static void m64858g1(Context context) {
        Intent intent = new Intent(context, AKTHomeActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("ARG_START_NEW_HOME", true);
        context.startActivity(intent);
    }

    /* renamed from: h1 */
    public static void m64859h1(Context context, Integer num) {
        MyApplicationClass.m64669c().f41189k = true;
        Intent intent = new Intent(context, AKTHomeActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("ACTION_ID", num);
        intent.putExtra("ARG_START_NEW_HOME", true);
        context.startActivity(intent);
    }

    /* renamed from: F0 */
    public final void mo56610F0(Intent intent) {
        try {
            if (intent.getData() == null) {
                return;
            }
            if (intent.getData().toString().contains(f41261p1) || intent.getData().getScheme().startsWith(f41262q1)) {
                new Handler(Looper.getMainLooper()).post(new C6957d0(this));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: G0 */
    public final void mo56611G0(Intent intent) {
        try {
            if (intent.hasExtra(MyFirebaseMessagingService.f42547x)) {
                this.f41270U.mo8460Q(vh7.m73248i(intent.getStringExtra(MyFirebaseMessagingService.f42547x), true));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: H0 */
    public final void mo56612H0(Intent intent) {
        try {
            if (intent.getData() != null && intent.getData().getScheme().startsWith(f41260o1)) {
                if (getReferrer() != null) {
                    String[] split = getReferrer().toString().split("//");
                    if (split.length > 1) {
                        this.f41265I.mo61237s(split[1]);
                    }
                }
                this.f41265I.mo61234p().postValue(intent.getData().toString());
                NavDestination B = this.f41270U.mo8446B();
                Objects.requireNonNull(B);
                if (B.mo8563w() != R.id.walletConnectFragment) {
                    this.f41270U.mo8460Q(vh7.m73249j());
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: I0 */
    public final void mo56613I0(Intent intent) {
        try {
            if (intent.hasExtra(MyFirebaseMessagingService.f42548y)) {
                RequestListActivity.builder().withContactUsButtonVisible(true).show((Context) this, new Configuration[0]);
                f06.m57523n(this, "ZENDESK_HAVE_NEW_REPLY", Boolean.FALSE);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: J0 */
    public final boolean mo56614J0() {
        if (ol0.m70351c(this) == null || f06.m57518i(this, "KA").isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public final void mo56615K0(HomeViewModel homeViewModel) {
        homeViewModel.mo61232n().observe(this, new C7814l0(this));
    }

    /* renamed from: L0 */
    public void mo56616L0() {
        this.f41277k0.mo60953i().observe(this, new C7322k0(this));
    }

    /* renamed from: M0 */
    public final void mo56617M0() {
        Zendesk zendesk2 = Zendesk.INSTANCE;
        zendesk2.init(this, "https://safemoon.zendesk.com", C9384u3.f44864f, C9384u3.f44865g);
        zendesk2.setIdentity(new AnonymousIdentity());
        Support.INSTANCE.init(zendesk2);
        if (f06.m57514e(getApplication(), "FCM_TOKEN", true)) {
            try {
                FirebaseMessaging.m38582g().mo36214i().mo48135f(new C7918n0(this)).mo48133d(new C9008o0());
            } catch (Exception e) {
                dq6.m57042b("Khang").mo51264a("Firecase-Exception %s", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: X */
    public void mo12159X() {
        this.f41277k0.mo60951g();
    }

    /* renamed from: a */
    public void mo52262a() {
        MyTokensListViewModel myTokensListViewModel = this.f41264H;
        if (myTokensListViewModel != null) {
            myTokensListViewModel.mo61307U();
        }
    }

    /* renamed from: b */
    public void mo52263b(EvmRequestTransaction evmRequestTransaction) {
        if (this.f41278v0) {
            this.f41274b1.mo60834q(evmRequestTransaction);
        }
    }

    /* renamed from: b1 */
    public final void mo56618b1() {
        a77.m55427e(this);
    }

    /* renamed from: c */
    public StoragePermissionLauncher mo52264c() {
        return mo56997L();
    }

    /* renamed from: c1 */
    public final void mo56619c1() {
        eg1.f37537X.mo51466a(new C7007e0(this), new C7060f0(this)).mo51465G(getSupportFragmentManager());
    }

    /* renamed from: d */
    public void mo52265d(int i) {
        this.f41270U.mo8467X(i, false);
        this.f41270U.mo8466W();
        this.f41270U.mo8456M(i);
    }

    /* renamed from: d1 */
    public final void mo56620d1() {
        this.f41267M.mo62868h();
    }

    /* renamed from: e */
    public void mo52693e(boolean z) {
        int i;
        BottomNavigationView bottomNavigationView = this.f41263C.f28479j;
        if (bottomNavigationView != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            bottomNavigationView.setVisibility(i);
        }
    }

    /* renamed from: e1 */
    public final void mo56621e1(String str) {
        Zendesk zendesk2 = Zendesk.INSTANCE;
        if (zendesk2.provider() != null) {
            zendesk2.provider().pushRegistrationProvider().registerWithDeviceIdentifier(str, new C8131b());
        }
    }

    /* renamed from: f1 */
    public final void mo56622f1(Bundle bundle) {
        if (f06.m57514e(this, "V2_HELP_POP", true)) {
            this.f41264H.mo61293E().observe(this, new C7853m0(this, bundle));
        }
    }

    /* renamed from: g */
    public MultipleWalletConnect mo52266g() {
        return this.f41271X;
    }

    /* renamed from: i */
    public CustomKeyBoard mo52267i() {
        return (CustomKeyBoard) findViewById(R.id.keyWrapper);
    }

    /* renamed from: i1 */
    public final void mo56623i1() {
        this.f8530x.mo61256r(new C6914c0(this));
    }

    /* renamed from: j1 */
    public final void mo56624j1() {
        this.f41265I.mo61235q().postValue(Boolean.TRUE);
        this.f41266L.mo61591V0();
        this.f41266L.mo61597Y0();
        new Handler(Looper.getMainLooper()).postDelayed(new C6838b0(this), 100);
    }

    /* renamed from: m */
    public ji4 mo52268m() {
        return mo56996K();
    }

    /* renamed from: n0 */
    public ViewGroup mo56625n0() {
        return this.f41263C.f28474e;
    }

    /* renamed from: o */
    public Intent mo52269o() {
        return mo56998N();
    }

    public void onBackPressed() {
        if (getOnBackPressedDispatcher().mo914c()) {
            getOnBackPressedDispatcher().mo915d();
        } else if (!this.f41270U.mo8464U()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!mo56614J0()) {
            this.f41272Y = (ConnectionsViewModel) new C0729l(this).mo6421a(ConnectionsViewModel.class);
            this.f41273Z = (SessionRequestViewModel) new C0729l(this).mo6421a(SessionRequestViewModel.class);
            Web3WalletViewModel web3WalletViewModel = (Web3WalletViewModel) new C0729l(this).mo6421a(Web3WalletViewModel.class);
            this.f41275e0 = web3WalletViewModel;
            this.f41271X = new MultipleWalletConnect(this, this.f41272Y, web3WalletViewModel, this.f41273Z);
            this.f41268P = new Intent(this, TxnListService.class);
            C5756ea c = C5756ea.m43838c(getLayoutInflater());
            this.f41263C = c;
            setContentView((View) c.mo42172b());
            MyTokensListViewModel myTokensListViewModel = (MyTokensListViewModel) new C0729l((hd7) this, (C0729l.C0733b) new MyViewModelFactory(new WeakReference(this))).mo6421a(MyTokensListViewModel.class);
            this.f41264H = myTokensListViewModel;
            myTokensListViewModel.mo61315x();
            this.f41265I = (HomeViewModel) new C0729l(this).mo6421a(HomeViewModel.class);
            this.f41266L = (SwapViewModel) new C0729l(this).mo6421a(SwapViewModel.class);
            this.f41267M = (ob4) new C0729l(this).mo6421a(ob4.class);
            AKTWebSocketHandlingViewModel aKTWebSocketHandlingViewModel = (AKTWebSocketHandlingViewModel) new C0729l(this).mo6421a(AKTWebSocketHandlingViewModel.class);
            this.f41277k0 = aKTWebSocketHandlingViewModel;
            aKTWebSocketHandlingViewModel.mo60957m();
            mo56616L0();
            mo56615K0(this.f41265I);
            new C0729l(this).mo6421a(ReflectionTrackerViewModel.class);
            if (getSupportActionBar() != null) {
                getSupportActionBar().mo959l();
            }
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
            getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
            this.f41263C.f28473d.setVisibility(8);
            this.f41263C.f28479j.setVisibility(0);
            this.f41269Q = new C3083pm.C3085b(R.id.navigation_wallet, R.id.navigation_swap, R.id.navigation_collectibles, R.id.navigation_settings).mo24644a();
            this.f41270U = Navigation.m8327b(this, R.id.nav_host_fragment);
            if (MyApplicationClass.m64669c().f41188g) {
                NavGraph b = this.f41270U.mo8450F().mo22640b(R.navigation.mobile_navigation);
                b.mo8582b0(g06.f37938a.mo51833b(this));
                try {
                    this.f41270U.mo8480m0(b);
                } catch (Exception unused) {
                }
                MyApplicationClass.m64669c().f41188g = false;
            }
            a54.m44e(this, this.f41270U, this.f41269Q);
            a54.m45f(this.f41263C.f28479j, this.f41270U);
            this.f41263C.f28479j.setOnItemSelectedListener(new C6785a0(this));
            this.f41263C.f28479j.setOnItemReselectedListener(new C7110g0(this));
            this.f41270U.mo8484p(new C8130a());
            if (MyApplicationClass.m64669c().f41189k) {
                MyApplicationClass.m64669c().f41189k = false;
                try {
                    int intExtra = getIntent().getIntExtra("ACTION_ID", 0);
                    if (intExtra != 0) {
                        new Handler(Looper.getMainLooper()).post(new C7153h0(this, intExtra));
                    }
                } catch (Exception unused2) {
                }
            }
            mo56611G0(getIntent());
            mo56613I0(getIntent());
            mo56612H0(getIntent());
            mo56610F0(getIntent());
            new Handler(Looper.getMainLooper()).postDelayed(new C7197i0(this), 500);
            mo56623i1();
            mo56617M0();
            if (!MyApplicationClass.m64669c().f41193y) {
                mo56992E();
                MyApplicationClass.m64669c().f41193y = true;
            }
            this.f41271X.mo61916A().observe(this, new C7231j0(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        MyApplicationClass.m64669c().f41188g = true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            if (intent.getData() != null && intent.getData().getScheme().startsWith(f41260o1)) {
                mo56612H0(intent);
            } else if (intent.getData() != null && (intent.getData().toString().contains(f41261p1) || intent.getData().getScheme().startsWith(f41262q1))) {
                mo56610F0(intent);
            } else if (intent.hasExtra(MyFirebaseMessagingService.f42547x)) {
                mo56611G0(intent);
            } else if (intent.hasExtra(MyFirebaseMessagingService.f42548y)) {
                mo56613I0(intent);
            } else if (intent.hasExtra(MyFirebaseMessagingService.f42544A)) {
                mo56624j1();
            } else if (intent.hasExtra(MyFirebaseMessagingService.f42545B)) {
                mo56620d1();
            } else {
                boolean booleanExtra = intent.getBooleanExtra("IS_BACK_FROM_CHANGE_EMAIL", false);
                if (!intent.getBooleanExtra("ARG_START_NEW_HOME", false) && !booleanExtra) {
                    mo56991D();
                }
            }
        } catch (Exception unused) {
            mo56991D();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (!mo56614J0()) {
            mo57000P(this);
            mo56618b1();
            mo56995J();
            if (MyApplicationClass.m64669c().f41187e) {
                MyApplicationClass.m64669c().f41187e = false;
                mo56622f1(bundle);
            }
        }
    }

    public void onPostResume() {
        super.onPostResume();
        MultipleWalletConnect multipleWalletConnect = this.f41271X;
        if (multipleWalletConnect != null) {
            multipleWalletConnect.mo61924I();
        }
    }

    public void onResume() {
        super.onResume();
        if (MyApplicationClass.m64669c().f41184C) {
            RequestListActivity.builder().withContactUsButtonVisible(true).show((Context) this, new Configuration[0]);
            f06.m57523n(this, "ZENDESK_HAVE_NEW_REPLY", Boolean.FALSE);
            MyApplicationClass.m64669c().f41184C = false;
        }
    }

    public void onStart() {
        super.onStart();
        if (mo56614J0()) {
            startActivity(new Intent(this, AKTActivity.class));
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(this.f41268P);
        } else {
            startService(this.f41268P);
        }
        bindService(this.f41268P, this.f41276e1, 1);
    }

    public void onStop() {
        super.onStop();
        if (this.f41278v0) {
            unbindService(this.f41276e1);
            this.f41278v0 = false;
            stopService(this.f41268P);
        }
    }

    /* renamed from: q */
    public View mo52270q() {
        return findViewById(R.id.nav_host_fragment);
    }

    /* renamed from: r */
    public void mo52271r() {
        this.f41263C.f28479j.setSelectedItemId(R.id.navigation_wallet);
    }
}
