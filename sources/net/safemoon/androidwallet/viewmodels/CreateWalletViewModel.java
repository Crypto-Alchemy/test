package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import net.safemoon.androidwallet.model.blackListAddress.BlackListAddress;
import net.safemoon.androidwallet.model.blackListAddress.Request;
import wallet.core.jni.CoinType;
import wallet.core.jni.HDWallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004JB\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2*\u0010\u000e\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fR#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CreateWalletViewModel;", "Lwj;", "Lr37;", "d", "", "privateKey", "Lcw0;", "kotlin.jvm.PlatformType", "e", "enterKey", "Lnet/safemoon/androidwallet/viewmodels/CreateWalletViewModel$KEY_TYPE;", "keyType", "Lkotlin/Function4;", "", "callBack", "c", "Lk04;", "", "b", "Lk04;", "f", "()Lk04;", "wordsArray", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "KEY_TYPE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CreateWalletViewModel.kt */
public final class CreateWalletViewModel extends C3552wj {

    /* renamed from: c */
    public static final C8663a f42669c = new C8663a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public final k04<List<String>> f42670b = new k04<>(ck0.m33062j());

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CreateWalletViewModel$KEY_TYPE;", "", "(Ljava/lang/String;I)V", "PRIVATE_KEY", "PASSPHRASE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CreateWalletViewModel.kt */
    public enum KEY_TYPE {
        PRIVATE_KEY,
        PASSPHRASE
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CreateWalletViewModel$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CreateWalletViewModel$a */
    /* compiled from: CreateWalletViewModel.kt */
    public static final class C8663a {
        public C8663a() {
        }

        public /* synthetic */ C8663a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/CreateWalletViewModel$b", "Lp90;", "Lnet/safemoon/androidwallet/model/blackListAddress/BlackListAddress;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CreateWalletViewModel$b */
    /* compiled from: CreateWalletViewModel.kt */
    public static final class C8664b implements p90<BlackListAddress> {

        /* renamed from: a */
        public final /* synthetic */ kd2<String, String, String, Boolean, r37> f42672a;

        /* renamed from: b */
        public final /* synthetic */ String f42673b;

        /* renamed from: c */
        public final /* synthetic */ String f42674c;

        /* renamed from: d */
        public final /* synthetic */ KEY_TYPE f42675d;

        /* renamed from: e */
        public final /* synthetic */ String f42676e;

        public C8664b(kd2<? super String, ? super String, ? super String, ? super Boolean, r37> kd2, String str, String str2, KEY_TYPE key_type, String str3) {
            this.f42672a = kd2;
            this.f42673b = str;
            this.f42674c = str2;
            this.f42675d = key_type;
            this.f42676e = str3;
        }

        /* renamed from: a */
        public void mo47103a(k90<BlackListAddress> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            this.f42672a.invoke(null, null, null, Boolean.FALSE);
        }

        /* renamed from: b */
        public void mo47104b(k90<BlackListAddress> k90, bg5<BlackListAddress> bg5) {
            BlackListAddress.Data data;
            String str;
            List<BlackListAddress.Data> list;
            BlackListAddress.Data data2;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            BlackListAddress a = bg5.mo50578a();
            if (a == null || (list = a.data) == null) {
                data = null;
            } else {
                String str2 = this.f42673b;
                ListIterator<BlackListAddress.Data> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        data2 = null;
                        break;
                    }
                    data2 = listIterator.previous();
                    if (vx2.m53586b(data2.walletAddress, str2)) {
                        break;
                    }
                }
                data = data2;
            }
            if (data != null) {
                kd2<String, String, String, Boolean, r37> kd2 = this.f42672a;
                String str3 = this.f42673b;
                String str4 = this.f42674c;
                if (this.f42675d == KEY_TYPE.PASSPHRASE) {
                    str = this.f42676e;
                } else {
                    str = "";
                }
                Boolean bool = data.isBlacklist;
                vx2.m53590f(bool, "statusToken.isBlacklist");
                kd2.invoke(str3, str4, str, bool);
                return;
            }
            this.f42672a.invoke(null, null, null, Boolean.FALSE);
        }
    }

    static {
        System.loadLibrary("TrustWalletCore");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateWalletViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
    }

    /* renamed from: c */
    public final void mo61122c(String str, KEY_TYPE key_type, kd2<? super String, ? super String, ? super String, ? super Boolean, r37> kd2) {
        Pair pair;
        vx2.m53591g(str, "enterKey");
        vx2.m53591g(key_type, "keyType");
        vx2.m53591g(kd2, "callBack");
        if (key_type == KEY_TYPE.PASSPHRASE) {
            CoinType coinType = CoinType.ETHEREUM;
            HDWallet hDWallet = new HDWallet(str, "");
            String addressForCoin = hDWallet.getAddressForCoin(coinType);
            byte[] data = hDWallet.getKeyForCoin(coinType).data();
            vx2.m53590f(data, "hdWallet.getKeyForCoin(coinEth).data()");
            pair = new Pair(addressForCoin, ol0.m70356e0(data, false));
        } else {
            pair = new Pair(mo61124e(str).getAddress(), str);
        }
        String str2 = (String) pair.component1();
        C9384u3.m72571l().mo52279h(new Request(bk0.m32598e(str2))).mo50512X(new C8664b(kd2, str2, (String) pair.component2(), key_type, str));
    }

    /* renamed from: d */
    public final void mo61123d() {
        int i = 0;
        do {
            String mnemonic = new HDWallet(128, "").mnemonic();
            vx2.m53590f(mnemonic, "passPhrase");
            String[] strArr = (String[]) new Regex("\\s+").split(mnemonic, 0).toArray(new String[0]);
            if (ArraysKt___ArraysKt.m47251E(strArr).size() == strArr.length) {
                this.f42670b.setValue(ck0.m33065m(Arrays.copyOf(strArr, strArr.length)));
                return;
            }
            i++;
        } while (i < 10);
    }

    /* renamed from: e */
    public final cw0 mo61124e(String str) {
        vx2.m53591g(str, "privateKey");
        return cw0.create(str);
    }

    /* renamed from: f */
    public final k04<List<String>> mo61125f() {
        return this.f42670b;
    }
}
