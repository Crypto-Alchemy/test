package net.safemoon.androidwallet.viewmodels.p021wc;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import com.walletconnect.web3.wallet.client.Web3Wallet;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet;
import net.safemoon.androidwallet.model.walletConnect.WCSolanaSignMessage;
import net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransaction;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.common.WCVer2Method;
import net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion;
import net.safemoon.androidwallet.viewmodels.wcv2.connection.ConnectionsViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.sessionrequest.SessionRequestViewModel;
import p000.eh7;
import p000.hg7;
import p000.ig7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004*.26B'\u0012\u0006\u0010(\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\bh\u0010iJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J(\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J(\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J(\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J(\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J(\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0002R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020<0;8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000e0F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0J8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0J8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010MR%\u0010W\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010R0R0J8\u0006¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010VR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010HR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0J8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010MR\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0J8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010MR\u001c\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0J8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010MR\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0J8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010MR\u001c\u0010g\u001a\n S*\u0004\u0018\u00010d0d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006j"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect;", "", "Lr37;", "D", "u", "", "Ltp0;", "list", "w", "Lhg7$j;", "sessionRequest", "K", "", "topic", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;", "B", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "rc", "L", "", "id", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "message", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "E", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "G", "F", "H", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "J", "roomConnectedInfo", "y", "I", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "z", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lnet/safemoon/androidwallet/viewmodels/wcv2/connection/ConnectionsViewModel;", "b", "Lnet/safemoon/androidwallet/viewmodels/wcv2/connection/ConnectionsViewModel;", "connectionsViewModel", "Lnet/safemoon/androidwallet/viewmodels/wcv2/Web3WalletViewModel;", "c", "Lnet/safemoon/androidwallet/viewmodels/wcv2/Web3WalletViewModel;", "web3walletViewModel", "Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionrequest/SessionRequestViewModel;", "d", "Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionrequest/SessionRequestViewModel;", "sessionRequestViewModel", "Llp0;", "e", "Lef3;", "C", "()Llp0;", "walletConnectDao", "", "Lnet/safemoon/androidwallet/viewmodels/wc/WalletConnect;", "f", "Ljava/util/Map;", "wcClients", "Lhu0;", "g", "Lhu0;", "ui", "h", "io", "", "i", "Ljava/util/List;", "availableRoom", "Lk04;", "Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$b;", "j", "Lk04;", "mutableLiveDataEthSign", "Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$c;", "k", "mutableLiveDataEthSmartContract", "", "kotlin.jvm.PlatformType", "l", "A", "()Lk04;", "approveSmartContractCall", "m", "currentActiveSessions", "n", "mutableLiveDataEthSignV2", "o", "mutableLiveDataEthSmartContractV2", "Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$e;", "p", "mutableLiveDataSolanaSignTransaction", "Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$d;", "q", "mutableLiveDataSolanaSignMessage", "Lcom/google/gson/Gson;", "r", "Lcom/google/gson/Gson;", "gson", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lnet/safemoon/androidwallet/viewmodels/wcv2/connection/ConnectionsViewModel;Lnet/safemoon/androidwallet/viewmodels/wcv2/Web3WalletViewModel;Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionrequest/SessionRequestViewModel;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect {

    /* renamed from: a */
    public final AppCompatActivity f43097a;

    /* renamed from: b */
    public final ConnectionsViewModel f43098b;

    /* renamed from: c */
    public final Web3WalletViewModel f43099c;

    /* renamed from: d */
    public final SessionRequestViewModel f43100d;

    /* renamed from: e */
    public final ef3 f43101e = C6169a.m47232a(new MultipleWalletConnect$walletConnectDao$2(this));

    /* renamed from: f */
    public final Map<String, WalletConnect> f43102f = new LinkedHashMap();

    /* renamed from: g */
    public final hu0 f43103g = iu0.m59111a(qh1.m71266c());

    /* renamed from: h */
    public final hu0 f43104h = iu0.m59111a(qh1.m71265b());

    /* renamed from: i */
    public List<RoomConnectedInfoAndWallet> f43105i = new ArrayList();

    /* renamed from: j */
    public final k04<C8882b> f43106j;

    /* renamed from: k */
    public final k04<C8883c> f43107k;

    /* renamed from: l */
    public final k04<Boolean> f43108l;

    /* renamed from: m */
    public List<tp0> f43109m;

    /* renamed from: n */
    public final k04<C8882b> f43110n;

    /* renamed from: o */
    public final k04<C8883c> f43111o;

    /* renamed from: p */
    public final k04<C8885e> f43112p;

    /* renamed from: q */
    public final k04<C8884d> f43113q;

    /* renamed from: r */
    public final Gson f43114r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$a", "Leh7$b;", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$a */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C8881a implements eh7.C7051b {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43115a;

        /* renamed from: b */
        public final /* synthetic */ C8882b f43116b;

        /* renamed from: c */
        public final /* synthetic */ eh7 f43117c;

        public C8881a(MultipleWalletConnect multipleWalletConnect, C8882b bVar, eh7 eh7) {
            this.f43115a = multipleWalletConnect;
            this.f43116b = bVar;
            this.f43117c = eh7;
        }

        /* renamed from: a */
        public void mo51474a() {
            try {
                WalletConnect walletConnect = (WalletConnect) this.f43115a.f43102f.get(this.f43116b.mo61934c().getPeerId());
                if (walletConnect != null) {
                    walletConnect.mo61998h(this.f43116b.mo61932a(), this.f43116b.mo61933b());
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f43117c.mo22266k();
                throw th;
            }
            this.f43117c.mo22266k();
        }

        /* renamed from: b */
        public void mo51475b() {
            WalletConnect walletConnect = (WalletConnect) this.f43115a.f43102f.get(this.f43116b.mo61934c().getPeerId());
            if (walletConnect != null) {
                walletConnect.mo62006u(this.f43116b.mo61932a());
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "a", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "c", "()Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "rc", "", "b", "J", "()J", "id", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "()Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "message", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "d", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;JLcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$b */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C8882b {

        /* renamed from: a */
        public final RoomConnectedInfo f43118a;

        /* renamed from: b */
        public final long f43119b;

        /* renamed from: c */
        public final WCEthereumSignMessage f43120c;

        /* renamed from: d */
        public final Wallet f43121d;

        public C8882b(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumSignMessage wCEthereumSignMessage, Wallet wallet2) {
            vx2.m53591g(roomConnectedInfo, "rc");
            vx2.m53591g(wCEthereumSignMessage, ThrowableDeserializer.PROP_NAME_MESSAGE);
            vx2.m53591g(wallet2, "wallet");
            this.f43118a = roomConnectedInfo;
            this.f43119b = j;
            this.f43120c = wCEthereumSignMessage;
            this.f43121d = wallet2;
        }

        /* renamed from: a */
        public final long mo61932a() {
            return this.f43119b;
        }

        /* renamed from: b */
        public final WCEthereumSignMessage mo61933b() {
            return this.f43120c;
        }

        /* renamed from: c */
        public final RoomConnectedInfo mo61934c() {
            return this.f43118a;
        }

        /* renamed from: d */
        public final Wallet mo61935d() {
            return this.f43121d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8882b)) {
                return false;
            }
            C8882b bVar = (C8882b) obj;
            return vx2.m53586b(this.f43118a, bVar.f43118a) && this.f43119b == bVar.f43119b && vx2.m53586b(this.f43120c, bVar.f43120c) && vx2.m53586b(this.f43121d, bVar.f43121d);
        }

        public int hashCode() {
            return (((((this.f43118a.hashCode() * 31) + au0.m10781a(this.f43119b)) * 31) + this.f43120c.hashCode()) * 31) + this.f43121d.hashCode();
        }

        public String toString() {
            RoomConnectedInfo roomConnectedInfo = this.f43118a;
            long j = this.f43119b;
            WCEthereumSignMessage wCEthereumSignMessage = this.f43120c;
            Wallet wallet2 = this.f43121d;
            return "EthSign(rc=" + roomConnectedInfo + ", id=" + j + ", message=" + wCEthereumSignMessage + ", wallet=" + wallet2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "a", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "c", "()Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "rc", "", "b", "J", "()J", "id", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "()Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "message", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "d", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;JLcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$c */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C8883c {

        /* renamed from: a */
        public final RoomConnectedInfo f43122a;

        /* renamed from: b */
        public final long f43123b;

        /* renamed from: c */
        public final WCEthereumTransaction f43124c;

        /* renamed from: d */
        public final Wallet f43125d;

        public C8883c(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumTransaction wCEthereumTransaction, Wallet wallet2) {
            vx2.m53591g(roomConnectedInfo, "rc");
            vx2.m53591g(wCEthereumTransaction, ThrowableDeserializer.PROP_NAME_MESSAGE);
            vx2.m53591g(wallet2, "wallet");
            this.f43122a = roomConnectedInfo;
            this.f43123b = j;
            this.f43124c = wCEthereumTransaction;
            this.f43125d = wallet2;
        }

        /* renamed from: a */
        public final long mo61939a() {
            return this.f43123b;
        }

        /* renamed from: b */
        public final WCEthereumTransaction mo61940b() {
            return this.f43124c;
        }

        /* renamed from: c */
        public final RoomConnectedInfo mo61941c() {
            return this.f43122a;
        }

        /* renamed from: d */
        public final Wallet mo61942d() {
            return this.f43125d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8883c)) {
                return false;
            }
            C8883c cVar = (C8883c) obj;
            return vx2.m53586b(this.f43122a, cVar.f43122a) && this.f43123b == cVar.f43123b && vx2.m53586b(this.f43124c, cVar.f43124c) && vx2.m53586b(this.f43125d, cVar.f43125d);
        }

        public int hashCode() {
            return (((((this.f43122a.hashCode() * 31) + au0.m10781a(this.f43123b)) * 31) + this.f43124c.hashCode()) * 31) + this.f43125d.hashCode();
        }

        public String toString() {
            RoomConnectedInfo roomConnectedInfo = this.f43122a;
            long j = this.f43123b;
            WCEthereumTransaction wCEthereumTransaction = this.f43124c;
            Wallet wallet2 = this.f43125d;
            return "EthSmartContract(rc=" + roomConnectedInfo + ", id=" + j + ", message=" + wCEthereumTransaction + ", wallet=" + wallet2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "a", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "c", "()Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "rc", "", "b", "J", "()J", "id", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "()Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "message", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "d", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$d */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C8884d {

        /* renamed from: a */
        public final RoomConnectedInfo f43126a;

        /* renamed from: b */
        public final long f43127b;

        /* renamed from: c */
        public final WCSolanaSignMessage f43128c;

        /* renamed from: d */
        public final Wallet f43129d;

        /* renamed from: a */
        public final long mo61946a() {
            return this.f43127b;
        }

        /* renamed from: b */
        public final WCSolanaSignMessage mo61947b() {
            return this.f43128c;
        }

        /* renamed from: c */
        public final RoomConnectedInfo mo61948c() {
            return this.f43126a;
        }

        /* renamed from: d */
        public final Wallet mo61949d() {
            return this.f43129d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8884d)) {
                return false;
            }
            C8884d dVar = (C8884d) obj;
            return vx2.m53586b(this.f43126a, dVar.f43126a) && this.f43127b == dVar.f43127b && vx2.m53586b(this.f43128c, dVar.f43128c) && vx2.m53586b(this.f43129d, dVar.f43129d);
        }

        public int hashCode() {
            return (((((this.f43126a.hashCode() * 31) + au0.m10781a(this.f43127b)) * 31) + this.f43128c.hashCode()) * 31) + this.f43129d.hashCode();
        }

        public String toString() {
            RoomConnectedInfo roomConnectedInfo = this.f43126a;
            long j = this.f43127b;
            WCSolanaSignMessage wCSolanaSignMessage = this.f43128c;
            Wallet wallet2 = this.f43129d;
            return "SolanaSignMessage(rc=" + roomConnectedInfo + ", id=" + j + ", message=" + wCSolanaSignMessage + ", wallet=" + wallet2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "a", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "c", "()Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "rc", "", "b", "J", "()J", "id", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "()Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "message", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "d", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;JLnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$e */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C8885e {

        /* renamed from: a */
        public final RoomConnectedInfo f43130a;

        /* renamed from: b */
        public final long f43131b;

        /* renamed from: c */
        public final WCSolanaSignTransaction f43132c;

        /* renamed from: d */
        public final Wallet f43133d;

        public C8885e(RoomConnectedInfo roomConnectedInfo, long j, WCSolanaSignTransaction wCSolanaSignTransaction, Wallet wallet2) {
            vx2.m53591g(roomConnectedInfo, "rc");
            vx2.m53591g(wCSolanaSignTransaction, ThrowableDeserializer.PROP_NAME_MESSAGE);
            vx2.m53591g(wallet2, "wallet");
            this.f43130a = roomConnectedInfo;
            this.f43131b = j;
            this.f43132c = wCSolanaSignTransaction;
            this.f43133d = wallet2;
        }

        /* renamed from: a */
        public final long mo61953a() {
            return this.f43131b;
        }

        /* renamed from: b */
        public final WCSolanaSignTransaction mo61954b() {
            return this.f43132c;
        }

        /* renamed from: c */
        public final RoomConnectedInfo mo61955c() {
            return this.f43130a;
        }

        /* renamed from: d */
        public final Wallet mo61956d() {
            return this.f43133d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8885e)) {
                return false;
            }
            C8885e eVar = (C8885e) obj;
            return vx2.m53586b(this.f43130a, eVar.f43130a) && this.f43131b == eVar.f43131b && vx2.m53586b(this.f43132c, eVar.f43132c) && vx2.m53586b(this.f43133d, eVar.f43133d);
        }

        public int hashCode() {
            return (((((this.f43130a.hashCode() * 31) + au0.m10781a(this.f43131b)) * 31) + this.f43132c.hashCode()) * 31) + this.f43133d.hashCode();
        }

        public String toString() {
            RoomConnectedInfo roomConnectedInfo = this.f43130a;
            long j = this.f43131b;
            WCSolanaSignTransaction wCSolanaSignTransaction = this.f43132c;
            Wallet wallet2 = this.f43133d;
            return "SolanaSignTransaction(rc=" + roomConnectedInfo + ", id=" + j + ", message=" + wCSolanaSignTransaction + ", wallet=" + wallet2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$f", "Lqf7;", "", "id", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "message", "Lr37;", "q", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "transaction", "r", "", "", "p", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$f */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C8886f extends qf7 {

        /* renamed from: j */
        public final /* synthetic */ MultipleWalletConnect f43134j;

        /* renamed from: k */
        public final /* synthetic */ RoomConnectedInfo f43135k;

        /* renamed from: l */
        public final /* synthetic */ RoomConnectedInfoAndWallet f43136l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8886f(MultipleWalletConnect multipleWalletConnect, RoomConnectedInfo roomConnectedInfo, RoomConnectedInfoAndWallet roomConnectedInfoAndWallet, AppCompatActivity appCompatActivity, Wallet wallet2) {
            super(appCompatActivity, wallet2);
            this.f43134j = multipleWalletConnect;
            this.f43135k = roomConnectedInfo;
            this.f43136l = roomConnectedInfoAndWallet;
        }

        /* renamed from: p */
        public void mo61960p(int i, String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            super.mo61960p(i, str);
            this.f43134j.mo61927L(this.f43135k);
            this.f43134j.f43102f.remove(this.f43135k.getPeerId());
        }

        /* renamed from: q */
        public void mo61961q(long j, WCEthereumSignMessage wCEthereumSignMessage) {
            vx2.m53591g(wCEthereumSignMessage, ThrowableDeserializer.PROP_NAME_MESSAGE);
            super.mo61961q(j, wCEthereumSignMessage);
            this.f43134j.mo61920E(this.f43135k, j, wCEthereumSignMessage, this.f43136l.getWallet());
        }

        /* renamed from: r */
        public void mo61962r(long j, WCEthereumTransaction wCEthereumTransaction) {
            vx2.m53591g(wCEthereumTransaction, "transaction");
            super.mo61962r(j, wCEthereumTransaction);
            this.f43134j.mo61922G(this.f43135k, j, wCEthereumTransaction, this.f43136l.getWallet());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$g */
    /* compiled from: LiveData.kt */
    public static final class C8887g<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43137a;

        public C8887g(MultipleWalletConnect multipleWalletConnect) {
            this.f43137a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            C8883c cVar = (C8883c) t;
            if (cVar != null) {
                this.f43137a.f43111o.postValue(null);
                WalletConnectSmartContractCall a = WalletConnectSmartContractCall.f41826r1.mo57349a();
                WalletConnectSmartContractCall.m66310e0(a, cVar.mo61941c(), cVar.mo61939a(), cVar.mo61940b(), (WCSolanaSignTransaction) null, (WCSolanaSignMessage) null, cVar.mo61942d(), new MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1(cVar, a, this.f43137a), 24, (Object) null);
                FragmentManager supportFragmentManager = this.f43137a.mo61931z().getSupportFragmentManager();
                vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
                a.mo57345f0(supportFragmentManager);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$h */
    /* compiled from: LiveData.kt */
    public static final class C8888h<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43138a;

        public C8888h(MultipleWalletConnect multipleWalletConnect) {
            this.f43138a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            C8882b bVar = (C8882b) t;
            if (bVar != null) {
                this.f43138a.f43106j.postValue(null);
                eh7 a = eh7.f37548v0.mo51473a();
                a.mo51471M(bVar.mo61934c(), bVar.mo61932a(), bVar.mo61933b(), bVar.mo61935d(), new MultipleWalletConnect$observeWithWalletConnectV2$5$1$1$1(bVar, this.f43138a, a));
                FragmentManager supportFragmentManager = this.f43138a.mo61931z().getSupportFragmentManager();
                vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
                a.mo51472N(supportFragmentManager);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$i */
    /* compiled from: LiveData.kt */
    public static final class C8889i<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43139a;

        public C8889i(MultipleWalletConnect multipleWalletConnect) {
            this.f43139a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            C8885e eVar = (C8885e) t;
            if (eVar != null) {
                Log.println(7, "StringRequest", new Gson().toJson((Object) eVar.mo61954b()));
                this.f43139a.f43112p.postValue(null);
                WalletConnectSmartContractCall a = WalletConnectSmartContractCall.f41826r1.mo57349a();
                WalletConnectSmartContractCall.m66310e0(a, eVar.mo61955c(), eVar.mo61953a(), (WCEthereumTransaction) null, eVar.mo61954b(), (WCSolanaSignMessage) null, eVar.mo61956d(), new MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1(a, eVar, this.f43139a), 20, (Object) null);
                FragmentManager supportFragmentManager = this.f43139a.mo61931z().getSupportFragmentManager();
                vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
                a.mo57345f0(supportFragmentManager);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$j */
    /* compiled from: LiveData.kt */
    public static final class C8890j<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43140a;

        public C8890j(MultipleWalletConnect multipleWalletConnect) {
            this.f43140a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            C8884d dVar = (C8884d) t;
            if (dVar != null) {
                this.f43140a.f43113q.postValue(null);
                WalletConnectSmartContractCall a = WalletConnectSmartContractCall.f41826r1.mo57349a();
                WalletConnectSmartContractCall.m66310e0(a, dVar.mo61948c(), dVar.mo61946a(), (WCEthereumTransaction) null, (WCSolanaSignTransaction) null, dVar.mo61947b(), dVar.mo61949d(), new MultipleWalletConnect$observeWithWalletConnectV2$7$1$1$1(this.f43140a), 12, (Object) null);
                FragmentManager supportFragmentManager = this.f43140a.mo61931z().getSupportFragmentManager();
                vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
                a.mo57345f0(supportFragmentManager);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"com/github/salomonbrys/kotson/GsonBuilderKt$gsonTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "<init>", "()V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$k */
    /* compiled from: GsonBuilder.kt */
    public static final class C8891k extends TypeToken<List<? extends WCEthereumTransaction>> {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"com/github/salomonbrys/kotson/GsonBuilderKt$gsonTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "<init>", "()V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$l */
    /* compiled from: GsonBuilder.kt */
    public static final class C8892l extends TypeToken<List<? extends String>> {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"com/github/salomonbrys/kotson/GsonBuilderKt$gsonTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "<init>", "()V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$m */
    /* compiled from: GsonBuilder.kt */
    public static final class C8893m extends TypeToken<List<? extends String>> {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"com/github/salomonbrys/kotson/GsonBuilderKt$gsonTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "<init>", "()V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$n */
    /* compiled from: GsonBuilder.kt */
    public static final class C8894n extends TypeToken<WCSolanaSignTransaction> {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$o */
    /* compiled from: LiveData.kt */
    public static final class C8895o<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43141a;

        public C8895o(MultipleWalletConnect multipleWalletConnect) {
            this.f43141a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            List list;
            List list2 = (List) t;
            if (list2 != null) {
                list = CollectionsKt___CollectionsKt.m47326W(list2);
            } else {
                list = null;
            }
            this.f43141a.f43105i.clear();
            List e = this.f43141a.f43105i;
            vx2.m53588d(list);
            e.addAll(list);
            this.f43141a.mo61928u();
            MultipleWalletConnect multipleWalletConnect = this.f43141a;
            multipleWalletConnect.mo61929w(multipleWalletConnect.f43109m);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$p */
    /* compiled from: LiveData.kt */
    public static final class C8896p<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43142a;

        public C8896p(MultipleWalletConnect multipleWalletConnect) {
            this.f43142a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            if (((Boolean) t).booleanValue()) {
                this.f43142a.mo61928u();
                MultipleWalletConnect multipleWalletConnect = this.f43142a;
                multipleWalletConnect.mo61929w(multipleWalletConnect.f43109m);
                return;
            }
            for (Map.Entry value : this.f43142a.f43102f.entrySet()) {
                ((WalletConnect) value.getValue()).mo61997g();
            }
            this.f43142a.f43102f.clear();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$q */
    /* compiled from: LiveData.kt */
    public static final class C8897q<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43143a;

        public C8897q(MultipleWalletConnect multipleWalletConnect) {
            this.f43143a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            C8882b bVar = (C8882b) t;
            if (bVar != null) {
                this.f43143a.f43106j.postValue(null);
                eh7 a = eh7.f37548v0.mo51473a();
                a.mo51471M(bVar.mo61934c(), bVar.mo61932a(), bVar.mo61933b(), bVar.mo61935d(), new C8881a(this.f43143a, bVar, a));
                FragmentManager supportFragmentManager = this.f43143a.mo61931z().getSupportFragmentManager();
                vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
                a.mo51472N(supportFragmentManager);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$r */
    /* compiled from: LiveData.kt */
    public static final class C8898r<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ MultipleWalletConnect f43144a;

        public C8898r(MultipleWalletConnect multipleWalletConnect) {
            this.f43144a = multipleWalletConnect;
        }

        public final void onChanged(T t) {
            C8883c cVar = (C8883c) t;
            if (cVar != null) {
                this.f43144a.f43107k.postValue(null);
                WalletConnectSmartContractCall a = WalletConnectSmartContractCall.f41826r1.mo57349a();
                WalletConnectSmartContractCall.m66310e0(a, cVar.mo61941c(), cVar.mo61939a(), cVar.mo61940b(), (WCSolanaSignTransaction) null, (WCSolanaSignMessage) null, cVar.mo61942d(), new MultipleWalletConnect$4$1$1$1(this.f43144a, cVar, a), 24, (Object) null);
                FragmentManager supportFragmentManager = this.f43144a.mo61931z().getSupportFragmentManager();
                vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
                a.mo57345f0(supportFragmentManager);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"com/github/salomonbrys/kotson/GsonBuilderKt$gsonTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "<init>", "()V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$s */
    /* compiled from: GsonBuilder.kt */
    public static final class C8899s extends TypeToken<List<? extends WCEthereumTransaction>> {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"com/github/salomonbrys/kotson/GsonBuilderKt$gsonTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "<init>", "()V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$t */
    /* compiled from: GsonBuilder.kt */
    public static final class C8900t extends TypeToken<WCSolanaSignMessage> {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"com/github/salomonbrys/kotson/GsonBuilderKt$gsonTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "<init>", "()V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$u */
    /* compiled from: GsonBuilder.kt */
    public static final class C8901u extends TypeToken<WCSolanaSignTransaction> {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipleWalletConnect(androidx.appcompat.app.AppCompatActivity r9, net.safemoon.androidwallet.viewmodels.wcv2.connection.ConnectionsViewModel r10, net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel r11, net.safemoon.androidwallet.viewmodels.wcv2.sessionrequest.SessionRequestViewModel r12) {
        /*
            r8 = this;
            java.lang.String r0 = "activity"
            p000.vx2.m53591g(r9, r0)
            java.lang.String r0 = "connectionsViewModel"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "web3walletViewModel"
            p000.vx2.m53591g(r11, r0)
            java.lang.String r0 = "sessionRequestViewModel"
            p000.vx2.m53591g(r12, r0)
            r8.<init>()
            r8.f43097a = r9
            r8.f43098b = r10
            r8.f43099c = r11
            r8.f43100d = r12
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$walletConnectDao$2 r10 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$walletConnectDao$2
            r10.<init>(r8)
            ef3 r10 = kotlin.C6169a.m47232a(r10)
            r8.f43101e = r10
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            r8.f43102f = r10
            vm3 r10 = p000.qh1.m71266c()
            hu0 r10 = p000.iu0.m59111a(r10)
            r8.f43103g = r10
            kotlinx.coroutines.CoroutineDispatcher r10 = p000.qh1.m71265b()
            hu0 r10 = p000.iu0.m59111a(r10)
            r8.f43104h = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r8.f43105i = r10
            k04 r10 = new k04
            r11 = 0
            r10.<init>(r11)
            r8.f43106j = r10
            k04 r12 = new k04
            r12.<init>(r11)
            r8.f43107k = r12
            k04 r0 = new k04
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1)
            r8.f43108l = r0
            k04 r0 = new k04
            r0.<init>(r11)
            r8.f43110n = r0
            k04 r0 = new k04
            r0.<init>(r11)
            r8.f43111o = r0
            k04 r0 = new k04
            r0.<init>(r11)
            r8.f43112p = r0
            k04 r0 = new k04
            r0.<init>(r11)
            r8.f43113q = r0
            com.google.gson.GsonBuilder r11 = new com.google.gson.GsonBuilder
            r11.<init>()
            com.google.gson.GsonBuilder r11 = r11.serializeNulls()
            java.lang.String r0 = "GsonBuilder()\n        .serializeNulls()"
            p000.vx2.m53590f(r11, r0)
            com.google.gson.JsonDeserializer r0 = com.trustwallet.walletconnect.models.ethereum.WCEthereumTransactionKt.getEthTransactionSerializer()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Any"
            if (r0 == 0) goto L_0x0178
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$s r2 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$s
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.String r3 = "object : TypeToken<T>() {} .type"
            p000.vx2.m53587c(r2, r3)
            boolean r4 = r2 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r5 = "type.rawType"
            if (r4 == 0) goto L_0x00bb
            r4 = r2
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x00bb
            java.lang.reflect.Type r2 = r4.getRawType()
            p000.vx2.m53587c(r2, r5)
            goto L_0x00bf
        L_0x00bb:
            java.lang.reflect.Type r2 = p000.xj2.m30139d(r2)
        L_0x00bf:
            com.google.gson.GsonBuilder r11 = r11.registerTypeAdapter(r2, r0)
            java.lang.String r0 = "this.registerTypeAdapter…eToken<T>(), typeAdapter)"
            p000.vx2.m53587c(r11, r0)
            com.google.gson.JsonDeserializer r2 = net.safemoon.androidwallet.model.walletConnect.WCSolanaSignMessageKt.getSolanaSignMessageSerializer()
            if (r2 == 0) goto L_0x0172
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$t r4 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$t
            r4.<init>()
            java.lang.reflect.Type r4 = r4.getType()
            p000.vx2.m53587c(r4, r3)
            boolean r6 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x00ef
            r6 = r4
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            boolean r7 = p000.xj2.m30136a(r6)
            if (r7 == 0) goto L_0x00ef
            java.lang.reflect.Type r4 = r6.getRawType()
            p000.vx2.m53587c(r4, r5)
            goto L_0x00f3
        L_0x00ef:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r4)
        L_0x00f3:
            com.google.gson.GsonBuilder r11 = r11.registerTypeAdapter(r4, r2)
            p000.vx2.m53587c(r11, r0)
            com.google.gson.JsonDeserializer r2 = net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKt.getSolanaSignTransactionSerializer()
            if (r2 == 0) goto L_0x016c
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$u r1 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$u
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            p000.vx2.m53587c(r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0121
            r3 = r1
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            boolean r4 = p000.xj2.m30136a(r3)
            if (r4 == 0) goto L_0x0121
            java.lang.reflect.Type r1 = r3.getRawType()
            p000.vx2.m53587c(r1, r5)
            goto L_0x0125
        L_0x0121:
            java.lang.reflect.Type r1 = p000.xj2.m30139d(r1)
        L_0x0125:
            com.google.gson.GsonBuilder r11 = r11.registerTypeAdapter(r1, r2)
            p000.vx2.m53587c(r11, r0)
            com.google.gson.Gson r11 = r11.create()
            r8.f43114r = r11
            lp0 r11 = r8.mo61918C()
            androidx.lifecycle.LiveData r11 = r11.mo55947b()
            androidx.lifecycle.LiveData r11 = p000.qw6.m25941a(r11)
            java.lang.String r0 = "Transformations.distinctUntilChanged(this)"
            p000.vx2.m53590f(r11, r0)
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$o r0 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$o
            r0.<init>(r8)
            r11.observe(r9, r0)
            net.safemoon.androidwallet.receivers.ConnectionLiveData r11 = new net.safemoon.androidwallet.receivers.ConnectionLiveData
            r11.<init>(r9)
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$p r0 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$p
            r0.<init>(r8)
            r11.observe(r9, r0)
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$q r11 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$q
            r11.<init>(r8)
            r10.observe(r9, r11)
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$r r10 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$r
            r10.<init>(r8)
            r12.observe(r9, r10)
            r8.mo61919D()
            return
        L_0x016c:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r1)
            throw r9
        L_0x0172:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r1)
            throw r9
        L_0x0178:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect.<init>(androidx.appcompat.app.AppCompatActivity, net.safemoon.androidwallet.viewmodels.wcv2.connection.ConnectionsViewModel, net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel, net.safemoon.androidwallet.viewmodels.wcv2.sessionrequest.SessionRequestViewModel):void");
    }

    /* renamed from: v */
    public static final void m69339v(C8886f fVar, MultipleWalletConnect multipleWalletConnect, RoomConnectedInfo roomConnectedInfo) {
        vx2.m53591g(fVar, "$this_apply");
        vx2.m53591g(multipleWalletConnect, "this$0");
        vx2.m53591g(roomConnectedInfo, "$it");
        try {
            fVar.mo62003n().killSession();
            multipleWalletConnect.mo61927L(roomConnectedInfo);
            multipleWalletConnect.f43102f.remove(roomConnectedInfo.getPeerId());
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public static final void m69340x(MultipleWalletConnect multipleWalletConnect, RoomConnectedInfo roomConnectedInfo) {
        vx2.m53591g(multipleWalletConnect, "this$0");
        vx2.m53591g(roomConnectedInfo, "$dApp");
        try {
            multipleWalletConnect.mo61930y(roomConnectedInfo);
        } catch (Exception unused) {
        }
    }

    /* renamed from: A */
    public final k04<Boolean> mo61916A() {
        return this.f43108l;
    }

    /* renamed from: B */
    public final RoomConnectedInfoAndWallet mo61917B(String str) {
        T t;
        boolean z;
        Iterator<T> it = this.f43105i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            RoomConnectedInfoAndWallet roomConnectedInfoAndWallet = (RoomConnectedInfoAndWallet) t;
            if (WCVersion.Companion.mo62060a(roomConnectedInfoAndWallet.getDApp().getVersion()) != WCVersion.Ver2 || !vx2.m53586b(roomConnectedInfoAndWallet.getDApp().getRemotePeerId(), str)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (RoomConnectedInfoAndWallet) t;
    }

    /* renamed from: C */
    public final lp0 mo61918C() {
        return (lp0) this.f43101e.getValue();
    }

    /* renamed from: D */
    public final void mo61919D() {
        y23 unused = d50.m56748b(vg3.m28804a(this.f43097a), (CoroutineContext) null, (CoroutineStart) null, new MultipleWalletConnect$observeWithWalletConnectV2$1(this, (ns0<? super MultipleWalletConnect$observeWithWalletConnectV2$1>) null), 3, (Object) null);
        xz5<tj7> b = this.f43099c.mo62038b();
        Lifecycle lifecycle = this.f43097a.getLifecycle();
        vx2.m53590f(lifecycle, "activity.lifecycle");
        Lifecycle.State state = Lifecycle.State.STARTED;
        e52.m57232x(e52.m57202C(FlowExtKt.m5022a(b, lifecycle, state), new MultipleWalletConnect$observeWithWalletConnectV2$2(this, (ns0<? super MultipleWalletConnect$observeWithWalletConnectV2$2>) null)), vg3.m28804a(this.f43097a));
        xz5<tj7> e = this.f43098b.mo62063e();
        Lifecycle lifecycle2 = this.f43097a.getLifecycle();
        vx2.m53590f(lifecycle2, "activity.lifecycle");
        e52.m57232x(e52.m57202C(FlowExtKt.m5022a(e, lifecycle2, state), new MultipleWalletConnect$observeWithWalletConnectV2$3(this, (ns0<? super MultipleWalletConnect$observeWithWalletConnectV2$3>) null)), vg3.m28804a(this.f43097a));
        this.f43111o.observe(this.f43097a, new C8887g(this));
        this.f43110n.observe(this.f43097a, new C8888h(this));
        this.f43112p.observe(this.f43097a, new C8889i(this));
        this.f43113q.observe(this.f43097a, new C8890j(this));
    }

    /* renamed from: E */
    public final void mo61920E(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumSignMessage wCEthereumSignMessage, Wallet wallet2) {
        this.f43106j.postValue(new C8882b(roomConnectedInfo, j, wCEthereumSignMessage, wallet2));
    }

    /* renamed from: F */
    public final void mo61921F(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumSignMessage wCEthereumSignMessage, Wallet wallet2) {
        this.f43110n.postValue(new C8882b(roomConnectedInfo, j, wCEthereumSignMessage, wallet2));
    }

    /* renamed from: G */
    public final void mo61922G(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumTransaction wCEthereumTransaction, Wallet wallet2) {
        this.f43107k.postValue(new C8883c(roomConnectedInfo, j, wCEthereumTransaction, wallet2));
    }

    /* renamed from: H */
    public final void mo61923H(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumTransaction wCEthereumTransaction, Wallet wallet2) {
        this.f43111o.postValue(new C8883c(roomConnectedInfo, j, wCEthereumTransaction, wallet2));
    }

    /* renamed from: I */
    public final void mo61924I() {
        for (RoomConnectedInfoAndWallet dApp : this.f43105i) {
            try {
                RoomConnectedInfo dApp2 = dApp.getDApp();
                if (dApp2.isAutoDisconnect()) {
                    if (dApp2.getConnectedAtUnix() + TimeUnit.MINUTES.toSeconds(30) <= Common.f42577a.mo60893C(new Date())) {
                        mo61927L(dApp2);
                        if (WCVersion.Companion.mo62060a(dApp2.getVersion()) != WCVersion.Ver1) {
                            mo61930y(dApp2);
                        } else if (this.f43102f.containsKey(dApp2.getPeerId())) {
                            mo61930y(dApp2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: J */
    public final void mo61925J(RoomConnectedInfo roomConnectedInfo, long j, WCSolanaSignTransaction wCSolanaSignTransaction, Wallet wallet2) {
        this.f43112p.postValue(new C8885e(roomConnectedInfo, j, wCSolanaSignTransaction, wallet2));
    }

    /* renamed from: K */
    public final void mo61926K(hg7.C5915j jVar) {
        boolean z;
        RoomConnectedInfoAndWallet B;
        Type type;
        Type type2;
        Type type3;
        Type type4;
        String b = jVar.mo43268c().mo43274b();
        if (vx2.m53586b(b, WCVer2Method.ETH_SEND_TRANSACTION.getValue())) {
            z = true;
        } else {
            z = vx2.m53586b(b, WCVer2Method.ETH_SIGN_TRANSACTION.getValue());
        }
        if (z) {
            RoomConnectedInfoAndWallet B2 = mo61917B(jVar.mo43269d());
            if (B2 != null) {
                try {
                    Gson gson = this.f43114r;
                    vx2.m53590f(gson, "gson");
                    String c = jVar.mo43268c().mo43275c();
                    Type type5 = new C8891k().getType();
                    vx2.m53587c(type5, "object : TypeToken<T>() {} .type");
                    if (!(type5 instanceof ParameterizedType) || !xj2.m30136a((ParameterizedType) type5)) {
                        type4 = xj2.m30139d(type5);
                    } else {
                        type4 = ((ParameterizedType) type5).getRawType();
                        vx2.m53587c(type4, "type.rawType");
                    }
                    Object fromJson = gson.fromJson(c, type4);
                    vx2.m53587c(fromJson, "fromJson(json, typeToken<T>())");
                    WCEthereumTransaction wCEthereumTransaction = (WCEthereumTransaction) CollectionsKt___CollectionsKt.m47331b0((List) fromJson);
                    if (wCEthereumTransaction != null) {
                        RoomConnectedInfo dApp = B2.getDApp();
                        long a = jVar.mo43268c().mo43273a();
                        Wallet wallet2 = B2.getWallet();
                        vx2.m53588d(wallet2);
                        mo61923H(dApp, a, wCEthereumTransaction, wallet2);
                        return;
                    }
                    throw new InvalidJsonRpcParamsException(jVar.mo43268c().mo43273a());
                } catch (InvalidJsonRpcParamsException unused) {
                }
            }
        } else if (vx2.m53586b(b, WCVer2Method.ETH_SIGN.getValue())) {
            RoomConnectedInfoAndWallet B3 = mo61917B(jVar.mo43269d());
            if (B3 != null) {
                Gson gson2 = this.f43114r;
                vx2.m53590f(gson2, "gson");
                String c2 = jVar.mo43268c().mo43275c();
                Type type6 = new C8892l().getType();
                vx2.m53587c(type6, "object : TypeToken<T>() {} .type");
                if (!(type6 instanceof ParameterizedType) || !xj2.m30136a((ParameterizedType) type6)) {
                    type3 = xj2.m30139d(type6);
                } else {
                    type3 = ((ParameterizedType) type6).getRawType();
                    vx2.m53587c(type3, "type.rawType");
                }
                Object fromJson2 = gson2.fromJson(c2, type3);
                vx2.m53587c(fromJson2, "fromJson(json, typeToken<T>())");
                List list = (List) fromJson2;
                if (list.size() >= 2) {
                    WCEthereumSignMessage wCEthereumSignMessage = new WCEthereumSignMessage(list, WCEthereumSignMessage.WCSignType.MESSAGE);
                    RoomConnectedInfo dApp2 = B3.getDApp();
                    long a2 = jVar.mo43268c().mo43273a();
                    Wallet wallet3 = B3.getWallet();
                    vx2.m53588d(wallet3);
                    mo61921F(dApp2, a2, wCEthereumSignMessage, wallet3);
                    return;
                }
                throw new InvalidJsonRpcParamsException(jVar.mo43268c().mo43273a());
            }
        } else if (vx2.m53586b(b, WCVer2Method.ETH_PERSONAL_SIGN.getValue())) {
            RoomConnectedInfoAndWallet B4 = mo61917B(jVar.mo43269d());
            if (B4 != null) {
                Gson gson3 = this.f43114r;
                vx2.m53590f(gson3, "gson");
                String c3 = jVar.mo43268c().mo43275c();
                Type type7 = new C8893m().getType();
                vx2.m53587c(type7, "object : TypeToken<T>() {} .type");
                if (!(type7 instanceof ParameterizedType) || !xj2.m30136a((ParameterizedType) type7)) {
                    type2 = xj2.m30139d(type7);
                } else {
                    type2 = ((ParameterizedType) type7).getRawType();
                    vx2.m53587c(type2, "type.rawType");
                }
                Object fromJson3 = gson3.fromJson(c3, type2);
                vx2.m53587c(fromJson3, "fromJson(json, typeToken<T>())");
                List list2 = (List) fromJson3;
                if (list2.size() >= 2) {
                    WCEthereumSignMessage wCEthereumSignMessage2 = new WCEthereumSignMessage(list2, WCEthereumSignMessage.WCSignType.PERSONAL_MESSAGE);
                    RoomConnectedInfo dApp3 = B4.getDApp();
                    long a3 = jVar.mo43268c().mo43273a();
                    Wallet wallet4 = B4.getWallet();
                    vx2.m53588d(wallet4);
                    mo61921F(dApp3, a3, wCEthereumSignMessage2, wallet4);
                    return;
                }
                throw new InvalidJsonRpcParamsException(jVar.mo43268c().mo43273a());
            }
        } else if (vx2.m53586b(b, WCVer2Method.SOLANA_SIGN_TRANSACTION.getValue()) && (B = mo61917B(jVar.mo43269d())) != null) {
            Log.println(7, "responseInString", jVar.toString());
            Gson gson4 = this.f43114r;
            vx2.m53590f(gson4, "gson");
            String c4 = jVar.mo43268c().mo43275c();
            Type type8 = new C8894n().getType();
            vx2.m53587c(type8, "object : TypeToken<T>() {} .type");
            if (!(type8 instanceof ParameterizedType) || !xj2.m30136a((ParameterizedType) type8)) {
                type = xj2.m30139d(type8);
            } else {
                type = ((ParameterizedType) type8).getRawType();
                vx2.m53587c(type, "type.rawType");
            }
            Object fromJson4 = gson4.fromJson(c4, type);
            vx2.m53587c(fromJson4, "fromJson(json, typeToken<T>())");
            RoomConnectedInfo dApp4 = B.getDApp();
            long a4 = jVar.mo43268c().mo43273a();
            Wallet wallet5 = B.getWallet();
            vx2.m53588d(wallet5);
            mo61925J(dApp4, a4, (WCSolanaSignTransaction) fromJson4, wallet5);
        }
    }

    /* renamed from: L */
    public final void mo61927L(RoomConnectedInfo roomConnectedInfo) {
        y23 unused = d50.m56748b(this.f43104h, (CoroutineContext) null, (CoroutineStart) null, new MultipleWalletConnect$removeDApp$1(this, roomConnectedInfo, (ns0<? super MultipleWalletConnect$removeDApp$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x003d A[SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61928u() {
        /*
            r14 = this;
            java.util.List<net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet> r0 = r14.f43105i
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r0.next()
            r5 = r2
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet r5 = (net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet) r5
            net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion$a r6 = net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion.Companion
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r5 = r5.getDApp()
            int r5 = r5.getVersion()
            net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion r5 = r6.mo62060a(r5)
            net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion r6 = net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion.Ver1
            if (r5 != r6) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            if (r3 == 0) goto L_0x000b
            r1.add(r2)
            goto L_0x000b
        L_0x0034:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x003d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r1.next()
            r5 = r2
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet r5 = (net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet) r5
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r6 = r5.getDApp()
            net.safemoon.androidwallet.model.wallets.Wallet r5 = r5.getWallet()
            if (r5 == 0) goto L_0x007c
            java.util.Map<java.lang.String, net.safemoon.androidwallet.viewmodels.wc.WalletConnect> r5 = r14.f43102f
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x005e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r6.getPeerId()
            boolean r8 = p000.vx2.m53586b(r8, r9)
            if (r8 == 0) goto L_0x005e
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            if (r7 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r5 = r4
            goto L_0x007d
        L_0x007c:
            r5 = r3
        L_0x007d:
            if (r5 == 0) goto L_0x003d
            r0.add(r2)
            goto L_0x003d
        L_0x0083:
            java.util.Iterator r0 = r0.iterator()
        L_0x0087:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011e
            java.lang.Object r1 = r0.next()
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet r1 = (net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet) r1
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r8 = r1.getDApp()
            net.safemoon.androidwallet.model.wallets.Wallet r2 = r1.getWallet()
            if (r2 == 0) goto L_0x0113
            java.lang.String r2 = r8.getPeerMeta()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "RoomConnectedInfo"
            p000.ol0.m70350b0(r2, r3)
            java.util.Map<java.lang.String, net.safemoon.androidwallet.viewmodels.wc.WalletConnect> r9 = r14.f43102f
            java.lang.String r10 = r8.getPeerId()
            androidx.appcompat.app.AppCompatActivity r6 = r14.f43097a
            net.safemoon.androidwallet.model.wallets.Wallet r7 = r1.getWallet()
            net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$f r11 = new net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$f
            r2 = r11
            r3 = r14
            r4 = r8
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r11.mo62005t(r8)
            boolean r2 = r8.isAutoDisconnect()
            if (r2 == 0) goto L_0x0110
            net.safemoon.androidwallet.utils.Common r2 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            long r2 = r2.mo60893C(r3)
            long r4 = r8.getConnectedAtUnix()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            r12 = 30
            long r6 = r6.toSeconds(r12)
            long r4 = r4 + r6
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fd
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r6.<init>(r7)
            e04 r7 = new e04
            r7.<init>(r11, r14, r8)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r4 - r2
            long r2 = r12.toMillis(r4)
            r6.postDelayed(r7, r2)
            goto L_0x0110
        L_0x00fd:
            r14.mo61927L(r8)     // Catch:{ Exception -> 0x0110 }
            com.trustwallet.walletconnect.WCClient r2 = r11.mo62003n()     // Catch:{ Exception -> 0x0110 }
            r2.killSession()     // Catch:{ Exception -> 0x0110 }
            java.util.Map<java.lang.String, net.safemoon.androidwallet.viewmodels.wc.WalletConnect> r2 = r14.f43102f     // Catch:{ Exception -> 0x0110 }
            java.lang.String r3 = r8.getPeerId()     // Catch:{ Exception -> 0x0110 }
            r2.remove(r3)     // Catch:{ Exception -> 0x0110 }
        L_0x0110:
            r9.put(r10, r11)
        L_0x0113:
            net.safemoon.androidwallet.model.wallets.Wallet r1 = r1.getWallet()
            if (r1 != 0) goto L_0x0087
            r14.mo61927L(r8)
            goto L_0x0087
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect.mo61928u():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0038 A[SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61929w(java.util.List<p000.tp0> r13) {
        /*
            r12 = this;
            java.util.List<net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet> r0 = r12.f43105i
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r0.next()
            r5 = r2
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet r5 = (net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet) r5
            net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion$a r6 = net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion.Companion
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r5 = r5.getDApp()
            int r5 = r5.getVersion()
            net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion r5 = r6.mo62060a(r5)
            net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion r6 = net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion.Ver2
            if (r5 != r6) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            if (r3 == 0) goto L_0x000b
            r1.add(r2)
            goto L_0x000b
        L_0x0034:
            java.util.Iterator r0 = r1.iterator()
        L_0x0038:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e8
            java.lang.Object r1 = r0.next()
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet r1 = (net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet) r1
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r2 = r1.getDApp()
            if (r13 == 0) goto L_0x008a
            java.util.Iterator r5 = r13.iterator()
        L_0x004e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007d
            java.lang.Object r6 = r5.next()
            r7 = r6
            tp0 r7 = (p000.tp0) r7
            sp0 r8 = r7.mo66111b()
            boolean r8 = r8 instanceof p000.sp0.C9312a
            if (r8 == 0) goto L_0x0079
            sp0 r7 = r7.mo66111b()
            sp0$a r7 = (p000.sp0.C9312a) r7
            java.lang.String r7 = r7.mo65883a()
            java.lang.String r8 = r2.getRemotePeerId()
            boolean r7 = p000.vx2.m53586b(r7, r8)
            if (r7 == 0) goto L_0x0079
            r7 = r3
            goto L_0x007a
        L_0x0079:
            r7 = r4
        L_0x007a:
            if (r7 == 0) goto L_0x004e
            goto L_0x007e
        L_0x007d:
            r6 = 0
        L_0x007e:
            tp0 r6 = (p000.tp0) r6
            if (r6 != 0) goto L_0x008a
            r12.mo61930y(r2)
            r12.mo61927L(r2)
            r5 = r4
            goto L_0x008b
        L_0x008a:
            r5 = r3
        L_0x008b:
            if (r5 == 0) goto L_0x0038
            net.safemoon.androidwallet.model.wallets.Wallet r5 = r1.getWallet()
            if (r5 == 0) goto L_0x00da
            java.lang.String r5 = r2.getPeerMeta()
            java.lang.String r6 = "RoomConnectedInfo"
            p000.ol0.m70350b0(r5, r6)
            boolean r5 = r2.isAutoDisconnect()
            if (r5 == 0) goto L_0x00da
            net.safemoon.androidwallet.utils.Common r5 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            long r5 = r5.mo60893C(r6)
            long r7 = r2.getConnectedAtUnix()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MINUTES
            r10 = 30
            long r9 = r9.toSeconds(r10)
            long r7 = r7 + r9
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d7
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r9.<init>(r10)
            f04 r10 = new f04
            r10.<init>(r12, r2)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r7 = r7 - r5
            long r5 = r11.toMillis(r7)
            r9.postDelayed(r10, r5)
            goto L_0x00da
        L_0x00d7:
            r12.mo61930y(r2)     // Catch:{ Exception -> 0x00da }
        L_0x00da:
            net.safemoon.androidwallet.model.wallets.Wallet r1 = r1.getWallet()
            if (r1 != 0) goto L_0x0038
            r12.mo61930y(r2)
            r12.mo61927L(r2)
            goto L_0x0038
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect.mo61929w(java.util.List):void");
    }

    /* renamed from: y */
    public final void mo61930y(RoomConnectedInfo roomConnectedInfo) {
        vx2.m53591g(roomConnectedInfo, "roomConnectedInfo");
        if (WCVersion.Companion.mo62060a(roomConnectedInfo.getVersion()) == WCVersion.Ver1) {
            WalletConnect walletConnect = this.f43102f.get(roomConnectedInfo.getPeerId());
            if (walletConnect != null) {
                walletConnect.mo62004o();
                return;
            }
            return;
        }
        Web3Wallet.m43029d(Web3Wallet.f27840a, new ig7.C5964e(roomConnectedInfo.getRemotePeerId()), (rc2) null, MultipleWalletConnect$disconnectWallet$1.INSTANCE, 2, (Object) null);
        this.f43098b.mo62065g();
    }

    /* renamed from: z */
    public final AppCompatActivity mo61931z() {
        return this.f43097a;
    }
}
