package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.android.material.textview.MaterialTextView;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.common.BaseBottomSheetDialogFragment;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomExtensionKt;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J.\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u00060"}, mo44877d2 = {"Leh7;", "Lnet/safemoon/androidwallet/dialogs/common/BaseBottomSheetDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "roomConnectedInfo", "", "id", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "message", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Leh7$b;", "iWalletConnectSignatureContract", "M", "onDestroy", "Landroidx/fragment/app/FragmentManager;", "manager", "N", "U", "Leh7$b;", "X", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "Y", "Ljava/lang/Long;", "Z", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "e0", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lob2;", "k0", "Lob2;", "binding", "<init>", "()V", "v0", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: eh7 */
/* compiled from: WalletConnectSignatureRequest.kt */
public final class eh7 extends BaseBottomSheetDialogFragment {

    /* renamed from: v0 */
    public static final C7050a f37548v0 = new C7050a((DefaultConstructorMarker) null);

    /* renamed from: U */
    public C7051b f37549U;

    /* renamed from: X */
    public RoomConnectedInfo f37550X;

    /* renamed from: Y */
    public Long f37551Y;

    /* renamed from: Z */
    public WCEthereumSignMessage f37552Z;

    /* renamed from: e0 */
    public Wallet f37553e0;

    /* renamed from: k0 */
    public ob2 f37554k0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo44877d2 = {"Leh7$a;", "", "Leh7;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: eh7$a */
    /* compiled from: WalletConnectSignatureRequest.kt */
    public static final class C7050a {
        public C7050a() {
        }

        public /* synthetic */ C7050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final eh7 mo51473a() {
            eh7 eh7 = new eh7();
            eh7.setArguments(new Bundle());
            return eh7;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo44877d2 = {"Leh7$b;", "", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: eh7$b */
    /* compiled from: WalletConnectSignatureRequest.kt */
    public interface C7051b {
        /* renamed from: a */
        void mo51474a();

        /* renamed from: b */
        void mo51475b();
    }

    /* renamed from: K */
    public static final void m57344K(eh7 eh7, View view) {
        vx2.m53591g(eh7, "this$0");
        eh7.mo22266k();
    }

    /* renamed from: L */
    public static final void m57345L(eh7 eh7, View view) {
        vx2.m53591g(eh7, "this$0");
        C7051b bVar = eh7.f37549U;
        if (bVar != null) {
            bVar.mo51474a();
        }
    }

    /* renamed from: M */
    public final void mo51471M(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumSignMessage wCEthereumSignMessage, Wallet wallet2, C7051b bVar) {
        vx2.m53591g(roomConnectedInfo, "roomConnectedInfo");
        vx2.m53591g(wCEthereumSignMessage, ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53591g(wallet2, "wallet");
        vx2.m53591g(bVar, "iWalletConnectSignatureContract");
        this.f37550X = roomConnectedInfo;
        this.f37551Y = Long.valueOf(j);
        this.f37552Z = wCEthereumSignMessage;
        this.f37553e0 = wallet2;
        this.f37549U = bVar;
    }

    /* renamed from: N */
    public final void mo51472N(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, eh7.class.getCanonicalName());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_wallet_connect_signature_request, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C7051b bVar = this.f37549U;
        if (bVar != null) {
            bVar.mo51475b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String peerMeta;
        dn4 b;
        String peerMeta2;
        WCPeerMeta peerMeta3;
        String str2;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        ob2 a = ob2.m49236a(view);
        this.f37554k0 = a;
        if (a != null) {
            a.f32349c.f21127e.setText(getString(R.string.signature_request_screen_title));
            a.f32349c.f21125c.setOnClickListener(new ch7(this));
        }
        ob2 ob2 = this.f37554k0;
        if (ob2 != null) {
            ob2.f32348b.setOnClickListener(new dh7(this));
            Wallet wallet2 = this.f37553e0;
            if (wallet2 != null) {
                TokenType.C8246a aVar = TokenType.Companion;
                RoomConnectedInfo roomConnectedInfo = this.f37550X;
                vx2.m53588d(roomConnectedInfo);
                String address = wallet2.getAddress(aVar.mo57099b(roomConnectedInfo.getChainId()).getCoinType().getValue());
                MaterialTextView materialTextView = ob2.f32352f;
                String displayName = wallet2.displayName();
                if (address != null) {
                    str2 = ol0.m70353d(address);
                } else {
                    str2 = null;
                }
                materialTextView.setText(displayName + "\n(" + str2 + ")");
            }
            RoomConnectedInfo roomConnectedInfo2 = this.f37550X;
            if (!(roomConnectedInfo2 == null || (peerMeta2 = roomConnectedInfo2.getPeerMeta()) == null || (peerMeta3 = RoomExtensionKt.toPeerMeta(peerMeta2)) == null)) {
                vx2.m53590f(peerMeta3, "toPeerMeta()");
                ob2.f32350d.setText(peerMeta3.getUrl());
            }
            RoomConnectedInfo roomConnectedInfo3 = this.f37550X;
            if (!(roomConnectedInfo3 == null || (peerMeta = roomConnectedInfo3.getPeerMeta()) == null || (b = en4.m57410b(peerMeta)) == null)) {
                ob2.f32350d.setText(b.mo51237c());
            }
            WCEthereumSignMessage wCEthereumSignMessage = this.f37552Z;
            if (wCEthereumSignMessage == null) {
                return;
            }
            if (wCEthereumSignMessage.getType() == WCEthereumSignMessage.WCSignType.TYPED_MESSAGE) {
                ob2.f32351e.setText(wCEthereumSignMessage.getData());
            } else if (wCEthereumSignMessage.getType() == WCEthereumSignMessage.WCSignType.ETH_SIGN_TYPE_DATA_V4) {
                ob2.f32351e.setText(wCEthereumSignMessage.getData());
            } else {
                MaterialTextView materialTextView2 = ob2.f32351e;
                try {
                    str = yb6.m74340u(ol0.m70326F(wCEthereumSignMessage.getData()), 1, 0, false, 6, (Object) null);
                } catch (Exception unused) {
                    str = wCEthereumSignMessage.getData();
                }
                materialTextView2.setText(str);
            }
        }
    }
}
