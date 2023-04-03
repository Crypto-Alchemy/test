package net.safemoon.androidwallet.viewmodels.p021wc;

import android.app.Activity;
import com.trustwallet.walletconnect.WCClient;
import com.trustwallet.walletconnect.exceptions.InvalidSessionException;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import com.trustwallet.walletconnect.models.session.WCSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomExtensionKt;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import p000.c16;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 $2\u00020\u0001:\u0001,B\u0017\u0012\u0006\u00100\u001a\u00020+\u0012\u0006\u00106\u001a\u000201¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\nJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004H&J\u0016\u0010#\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001bJ\u0016\u0010$\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001bJ7\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010'\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078FX\u0002¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020<8FX\u0002¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b=\u0010>R#\u0010D\u001a\n A*\u0004\u0018\u00010@0@8BX\u0002¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0016\u0010I\u001a\u00020G8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010E\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/WalletConnect;", "", "", "_myCoinTypeValue", "", "c", "", "f", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "roomConnectedInfo", "Lr37;", "t", "uri", "e", "o", "Lnet/safemoon/androidwallet/common/TokenType;", "value", "", "isAutoDisconnect", "d", "g", "", "id", "u", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "peer", "s", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "message", "q", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "transaction", "r", "p", "_message", "h", "i", "rc", "payload", "send", "Lss1;", "j", "(Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;JLcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;ZLns0;)Ljava/lang/Object;", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "b", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "m", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lcom/trustwallet/walletconnect/WCClient;", "Lef3;", "n", "()Lcom/trustwallet/walletconnect/WCClient;", "wcClient", "Lwallet/core/jni/PrivateKey;", "getPrivateKey", "()Lwallet/core/jni/PrivateKey;", "privateKey", "Lcw0;", "kotlin.jvm.PlatformType", "l", "()Lcw0;", "credentails", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "peerMeta", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "wcSession", "dAppPeerData", "<init>", "(Landroid/app/Activity;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.WalletConnect */
/* compiled from: WalletConnect.kt */
public abstract class WalletConnect {

    /* renamed from: i */
    public static final C8925a f43162i = new C8925a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Activity f43163a;

    /* renamed from: b */
    public final Wallet f43164b;

    /* renamed from: c */
    public final ef3 f43165c = C6169a.m47232a(new WalletConnect$wcClient$2(this));

    /* renamed from: d */
    public final ef3 f43166d = C6169a.m47232a(new WalletConnect$privateKey$2(this));

    /* renamed from: e */
    public final ef3 f43167e = C6169a.m47232a(new WalletConnect$credentails$2(this));

    /* renamed from: f */
    public final WCPeerMeta f43168f = new WCPeerMeta("Safemoon", "https://safemoon.com/", (String) null, (List) null, 12, (DefaultConstructorMarker) null);

    /* renamed from: g */
    public WCSession f43169g;

    /* renamed from: h */
    public WCPeerMeta f43170h;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/WalletConnect$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.WalletConnect$a */
    /* compiled from: WalletConnect.kt */
    public static final class C8925a {
        public C8925a() {
        }

        public /* synthetic */ C8925a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        System.loadLibrary("TrustWalletCore");
    }

    public WalletConnect(Activity activity, Wallet wallet2) {
        vx2.m53591g(activity, "activity");
        vx2.m53591g(wallet2, "wallet");
        this.f43163a = activity;
        this.f43164b = wallet2;
    }

    /* renamed from: k */
    public static /* synthetic */ Object m69392k(WalletConnect walletConnect, RoomConnectedInfo roomConnectedInfo, long j, WCEthereumTransaction wCEthereumTransaction, boolean z, ns0 ns0, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = false;
            }
            return walletConnect.mo62000j(roomConnectedInfo, j, wCEthereumTransaction, z, ns0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ethTransaction");
    }

    /* renamed from: c */
    public final String mo61993c(int i) {
        String address = this.f43164b.getAddress(i);
        vx2.m53588d(address);
        return address;
    }

    /* renamed from: d */
    public final RoomConnectedInfo mo61994d(TokenType tokenType, boolean z) {
        String str = null;
        if (tokenType == null) {
            return null;
        }
        String c = mo61993c(tokenType.getCoinType().getValue());
        if (!mo62003n().approveSession(bk0.m32598e(c), tokenType.getChainId())) {
            return null;
        }
        WCSession session = mo62003n().getSession();
        if (session != null) {
            str = session.toUri();
        }
        String str2 = str;
        vx2.m53588d(str2);
        String peerId = mo62003n().getPeerId();
        vx2.m53588d(peerId);
        String remotePeerId = mo62003n().getRemotePeerId();
        vx2.m53588d(remotePeerId);
        int chainId = tokenType.getChainId();
        long C = Common.f42577a.mo60893C(new Date());
        String changeToString = RoomExtensionKt.changeToString(this.f43170h);
        Long id = this.f43164b.getId();
        vx2.m53588d(id);
        long longValue = id.longValue();
        vx2.m53590f(changeToString, "changeToString()");
        return new RoomConnectedInfo(str2, peerId, remotePeerId, chainId, changeToString, C, z, longValue, 1);
    }

    /* renamed from: e */
    public final void mo61995e(String str) {
        vx2.m53591g(str, "uri");
        mo62004o();
        WCSession from = WCSession.Companion.from(str);
        if (from != null) {
            this.f43169g = from;
            WCClient n = mo62003n();
            WCSession wCSession = this.f43169g;
            if (wCSession == null) {
                vx2.m53605u("wcSession");
                wCSession = null;
            }
            WCClient.connect$default(n, wCSession, this.f43168f, (String) null, (String) null, 12, (Object) null);
            return;
        }
        throw new InvalidSessionException();
    }

    /* renamed from: f */
    public final byte[] mo61996f(String str) {
        boolean z;
        if (str.length() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<String> X0 = StringsKt___StringsKt.m63122X0(StringsKt__StringsKt.m63114s0(str, "0x"), 2);
            ArrayList arrayList = new ArrayList(dk0.m43495u(X0, 10));
            for (String parseInt : X0) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(parseInt, wd0.m73569a(16))));
            }
            return CollectionsKt___CollectionsKt.m47307G0(arrayList);
        }
        throw new IllegalStateException("Must have an even length".toString());
    }

    /* renamed from: g */
    public final void mo61997g() {
        mo62003n().disconnect();
    }

    /* renamed from: h */
    public final void mo61998h(long j, WCEthereumSignMessage wCEthereumSignMessage) {
        vx2.m53591g(wCEthereumSignMessage, "_message");
        if (wCEthereumSignMessage.getType() == WCEthereumSignMessage.WCSignType.ETH_SIGN_TYPE_DATA_V4) {
            mo61999i(j, wCEthereumSignMessage);
            return;
        }
        cw0 l = mo62001l();
        boolean M = yb6.m74336M(wCEthereumSignMessage.getData(), "0x", false, 2, (Object) null);
        String data = wCEthereumSignMessage.getData();
        if (M) {
            data = data.substring(2);
            vx2.m53590f(data, "this as java.lang.String).substring(startIndex)");
        }
        c16.C6919a signPrefixedMessage = c16.signPrefixedMessage(ol0.m70326F(data), l.getEcKeyPair());
        byte[] bArr = new byte[65];
        System.arraycopy(signPrefixedMessage.getR(), 0, bArr, 0, 32);
        System.arraycopy(signPrefixedMessage.getS(), 0, bArr, 32, 32);
        System.arraycopy(signPrefixedMessage.getV(), 0, bArr, 64, 1);
        mo62003n().approveRequest(j, pc4.toHexString(bArr));
    }

    /* renamed from: i */
    public final void mo61999i(long j, WCEthereumSignMessage wCEthereumSignMessage) {
        vx2.m53591g(wCEthereumSignMessage, "_message");
        cw0 l = mo62001l();
        boolean M = yb6.m74336M(wCEthereumSignMessage.getData(), "0x", false, 2, (Object) null);
        String data = wCEthereumSignMessage.getData();
        if (M) {
            data = data.substring(2);
            vx2.m53590f(data, "this as java.lang.String).substring(startIndex)");
        }
        c16.C6919a signPrefixedMessage = c16.signPrefixedMessage(ol0.m70326F(data), l.getEcKeyPair());
        byte[] bArr = new byte[258];
        System.arraycopy(signPrefixedMessage.getR(), 0, bArr, 0, 64);
        System.arraycopy(signPrefixedMessage.getS(), 0, bArr, 64, 128);
        System.arraycopy(signPrefixedMessage.getV(), 0, bArr, 128, 130);
        mo62003n().approveRequest(j, pc4.toHexString(bArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62000j(net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r5, long r6, com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r8, boolean r9, p000.ns0<? super p000.ss1> r10) {
        /*
            r4 = this;
            boolean r9 = r10 instanceof net.safemoon.androidwallet.viewmodels.p021wc.WalletConnect$ethTransaction$1
            if (r9 == 0) goto L_0x0013
            r9 = r10
            net.safemoon.androidwallet.viewmodels.wc.WalletConnect$ethTransaction$1 r9 = (net.safemoon.androidwallet.viewmodels.p021wc.WalletConnect$ethTransaction$1) r9
            int r0 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r9.label = r0
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.wc.WalletConnect$ethTransaction$1 r9 = new net.safemoon.androidwallet.viewmodels.wc.WalletConnect$ethTransaction$1
            r9.<init>(r4, r10)
        L_0x0018:
            java.lang.Object r10 = r9.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            long r6 = r9.J$0
            java.lang.Object r5 = r9.L$0
            net.safemoon.androidwallet.viewmodels.wc.WalletConnect r5 = (net.safemoon.androidwallet.viewmodels.p021wc.WalletConnect) r5
            p000.hg5.m45199b(r10)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            p000.hg5.m45199b(r10)
            int r5 = r5.getChainId()
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3 r10 = new net.safemoon.androidwallet.viewmodels.wc.WcWeb3
            android.app.Activity r1 = r4.f43163a
            net.safemoon.androidwallet.model.wallets.Wallet r3 = r4.f43164b
            r10.<init>(r1, r5, r3)
            r9.L$0 = r4
            r9.J$0 = r6
            r9.label = r2
            java.lang.Object r10 = r10.mo62017z(r8, r9)
            if (r10 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r5 = r4
        L_0x0055:
            ss1 r10 = (p000.ss1) r10
            ag5$a r8 = r10.getError()
            if (r8 != 0) goto L_0x006f
            java.lang.String r8 = r10.getTransactionHash()
            if (r8 == 0) goto L_0x006f
            com.trustwallet.walletconnect.WCClient r5 = r5.mo62003n()
            java.lang.String r8 = r10.getTransactionHash()
            r5.approveRequest(r6, r8)
            goto L_0x0083
        L_0x006f:
            com.trustwallet.walletconnect.WCClient r5 = r5.mo62003n()
            ag5$a r8 = r10.getError()
            java.lang.String r8 = r8.getMessage()
            java.lang.String r9 = "result.error.message"
            p000.vx2.m53590f(r8, r9)
            r5.rejectRequest(r6, r8)
        L_0x0083:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.p021wc.WalletConnect.mo62000j(net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo, long, com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction, boolean, ns0):java.lang.Object");
    }

    /* renamed from: l */
    public final cw0 mo62001l() {
        return (cw0) this.f43167e.getValue();
    }

    /* renamed from: m */
    public final Wallet mo62002m() {
        return this.f43164b;
    }

    /* renamed from: n */
    public final WCClient mo62003n() {
        return (WCClient) this.f43165c.getValue();
    }

    /* renamed from: o */
    public final void mo62004o() {
        if (mo62003n().getSession() != null) {
            mo62003n().killSession();
        } else {
            mo62003n().disconnect();
        }
    }

    /* renamed from: p */
    public abstract void mo61960p(int i, String str);

    /* renamed from: q */
    public abstract void mo61961q(long j, WCEthereumSignMessage wCEthereumSignMessage);

    /* renamed from: r */
    public abstract void mo61962r(long j, WCEthereumTransaction wCEthereumTransaction);

    /* renamed from: s */
    public abstract void mo58176s(WCPeerMeta wCPeerMeta);

    /* renamed from: t */
    public final void mo62005t(RoomConnectedInfo roomConnectedInfo) {
        vx2.m53591g(roomConnectedInfo, "roomConnectedInfo");
        WCSession from = WCSession.Companion.from(roomConnectedInfo.getSession());
        if (from != null) {
            this.f43169g = from;
            String peerId = roomConnectedInfo.getPeerId();
            String remotePeerId = roomConnectedInfo.getRemotePeerId();
            WCClient n = mo62003n();
            WCSession wCSession = this.f43169g;
            if (wCSession == null) {
                vx2.m53605u("wcSession");
                wCSession = null;
            }
            n.connect(wCSession, this.f43168f, peerId, remotePeerId);
            return;
        }
        throw new InvalidSessionException();
    }

    /* renamed from: u */
    public final void mo62006u(long j) {
        mo62003n().rejectRequest(j, "User canceled");
    }
}
