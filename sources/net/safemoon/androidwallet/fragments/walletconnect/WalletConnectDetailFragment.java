package net.safemoon.androidwallet.fragments.walletconnect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.bumptech.glide.C1710a;
import com.google.mlkit.common.MlKitException;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import java.lang.ref.WeakReference;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomExtensionKt;
import net.safemoon.androidwallet.repository.WalletDataSource;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.WalletConnectViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0002R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010$¨\u0006)"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/walletconnect/WalletConnectDetailFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "A", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "k", "Lef3;", "x", "()Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "mainRoomDatabase", "Lnet/safemoon/androidwallet/repository/WalletDataSource;", "r", "z", "()Lnet/safemoon/androidwallet/repository/WalletDataSource;", "walletDataSource", "Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "s", "getWalletConnectVM", "()Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "walletConnectVM", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "y", "()Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "roomConnectedInfo", "Lmb2;", "Lmb2;", "binding", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectDetailFragment.kt */
public final class WalletConnectDetailFragment extends BaseMainFragment {

    /* renamed from: A */
    public static final C8580a f42416A = new C8580a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public final ef3 f42417k = C6169a.m47232a(WalletConnectDetailFragment$mainRoomDatabase$2.INSTANCE);

    /* renamed from: r */
    public final ef3 f42418r = C6169a.m47232a(new WalletConnectDetailFragment$walletDataSource$2(this));

    /* renamed from: s */
    public final ef3 f42419s;

    /* renamed from: x */
    public final ef3 f42420x;

    /* renamed from: y */
    public mb2 f42421y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/walletconnect/WalletConnectDetailFragment$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectDetailFragment$a */
    /* compiled from: WalletConnectDetailFragment.kt */
    public static final class C8580a {
        public C8580a() {
        }

        public /* synthetic */ C8580a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WalletConnectDetailFragment() {
        ef3 a = C6169a.m47232a(new C8581x5e970d44(this, R.id.mobile_navigation));
        this.f42419s = FragmentViewModelLazyKt.m4811b(this, ua5.m52727b(WalletConnectViewModel.class), new C8582x5e970d45(a, (i93) null), new C8583x5e970d46((pc2) null, a, (i93) null));
        this.f42420x = C6169a.m47232a(new WalletConnectDetailFragment$roomConnectedInfo$2(this));
    }

    /* renamed from: B */
    public static final void m68077B(WalletConnectDetailFragment walletConnectDetailFragment, RoomConnectedInfo roomConnectedInfo, View view) {
        vx2.m53591g(walletConnectDetailFragment, "this$0");
        vx2.m53591g(roomConnectedInfo, "$rc");
        C9001np.m69927L(new WeakReference(walletConnectDetailFragment.requireActivity()), (Integer) null, R.string.connection_message_disconnect, R.string.action_yes, R.string.action_no, new WalletConnectDetailFragment$initView$2$3$2$1(walletConnectDetailFragment, roomConnectedInfo), WalletConnectDetailFragment$initView$2$3$2$2.INSTANCE, 2, (Object) null);
    }

    /* renamed from: C */
    public static final void m68078C(WalletConnectDetailFragment walletConnectDetailFragment, View view) {
        vx2.m53591g(walletConnectDetailFragment, "this$0");
        walletConnectDetailFragment.mo50752i();
    }

    /* renamed from: A */
    public final void mo58148A() {
        AppCompatImageView appCompatImageView;
        mb2 mb2;
        mm2 mm2;
        b36 b36;
        mb2 mb22 = this.f42421y;
        if (!(mb22 == null || (b36 = mb22.f31635m) == null)) {
            b36.f21125c.setOnClickListener(new kg7(this));
            b36.f21127e.setText(getText(R.string.connection_screen_title));
        }
        mb2 mb23 = this.f42421y;
        if (mb23 == null || (mm2 = mb23.f31634l) == null) {
            appCompatImageView = null;
        } else {
            appCompatImageView = mm2.f31728d;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        RoomConnectedInfo y = mo58150y();
        if (y != null) {
            boolean z = true;
            if (WCVersion.Companion.mo62060a(y.getVersion()) == WCVersion.Ver1) {
                WCPeerMeta peerMeta = RoomExtensionKt.toPeerMeta(y.getPeerMeta());
                if (peerMeta != null) {
                    vx2.m53590f(peerMeta, "wcPeerMeta");
                    mb2 mb24 = this.f42421y;
                    if (mb24 != null) {
                        TokenType b = TokenType.Companion.mo57099b(y.getChainId());
                        mb24.f31641s.setText(b.getTitle() + " (" + b.getNativeToken() + ")");
                        C1710a.m12225u(mb24.f31633k).mo23162w(Integer.valueOf(b.getIcon())).mo11553K0(mb24.f31633k);
                        mm2 mm22 = mb24.f31634l;
                        if (mm22 != null) {
                            if (true ^ peerMeta.getIcons().isEmpty()) {
                                ((be5) C1710a.m12225u(mm22.f31729e).mo23164y(peerMeta.getIcons().get(0)).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(mm22.f31729e);
                            }
                            mm22.f31733i.setText(peerMeta.getName());
                            mm22.f31732h.setText(peerMeta.getUrl());
                        }
                    }
                }
            } else {
                dn4 b2 = en4.m57410b(y.getPeerMeta());
                if (!(b2 == null || (mb2 = this.f42421y) == null)) {
                    TokenType b3 = TokenType.Companion.mo57099b(y.getChainId());
                    mb2.f31641s.setText(b3.getTitle() + " (" + b3.getNativeToken() + ")");
                    C1710a.m12225u(mb2.f31633k).mo23162w(Integer.valueOf(b3.getIcon())).mo11553K0(mb2.f31633k);
                    mm2 mm23 = mb2.f31634l;
                    if (mm23 != null) {
                        if (b2.mo51235a().length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            ((be5) C1710a.m12225u(mm23.f31729e).mo23164y(b2.mo51235a()).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(mm23.f31729e);
                        }
                        mm23.f31733i.setText(b2.mo51236b());
                        mm23.f31732h.setText(b2.mo51237c());
                    }
                }
            }
            mb2 mb25 = this.f42421y;
            if (mb25 != null) {
                mb25.f31636n.setText(Common.f42577a.mo60905l(y.getConnectedAtUnix() * ((long) 1000)));
                RoomConnectedInfo y2 = mo58150y();
                if (y2 != null) {
                    long walletId = y2.getWalletId();
                    ug3 viewLifecycleOwner = getViewLifecycleOwner();
                    vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
                    y23 unused = d50.m56748b(vg3.m28804a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new WalletConnectDetailFragment$initView$2$3$1$1(this, walletId, mb25, y, (ns0<? super WalletConnectDetailFragment$initView$2$3$1$1>) null), 3, (Object) null);
                }
                mb25.f31624b.setOnClickListener(new lg7(this, y));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_wallet_connect_detail, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        this.f42421y = mb2.m48209a(view);
        mo58148A();
    }

    /* renamed from: x */
    public final MainRoomDatabase mo58149x() {
        return (MainRoomDatabase) this.f42417k.getValue();
    }

    /* renamed from: y */
    public final RoomConnectedInfo mo58150y() {
        return (RoomConnectedInfo) this.f42420x.getValue();
    }

    /* renamed from: z */
    public final WalletDataSource mo58151z() {
        return (WalletDataSource) this.f42418r.getValue();
    }
}
