package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.google.mlkit.common.MlKitException;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.model.common.HeaderItemHistory;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWalletListItem;
import net.safemoon.androidwallet.model.walletConnect.RoomExtensionKt;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0016B#\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 ¨\u0006$"}, mo44877d2 = {"Lgz0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;", "it", "Lr37;", "e", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "c", "getItemViewType", "getItemCount", "Landroid/content/Context;", "a", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "context", "Lkotlin/Function1;", "d", "Lrc2;", "()Lrc2;", "onItemClick", "", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "Ljava/util/List;", "dApps", "<init>", "(Landroid/content/Context;Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gz0 */
/* compiled from: DAppConnectedAdapter.kt */
public final class gz0 extends RecyclerView.Adapter<RecyclerView.C1231a0> {

    /* renamed from: a */
    public final Context f38126a;

    /* renamed from: d */
    public final rc2<RoomConnectedInfoAndWallet, r37> f38127d;

    /* renamed from: e */
    public final List<HistoryListItem> f38128e = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lgz0$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "position", "Lr37;", "d", "Lmm2;", "a", "Lmm2;", "getBinding", "()Lmm2;", "binding", "<init>", "(Lgz0;Lmm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gz0$a */
    /* compiled from: DAppConnectedAdapter.kt */
    public final class C7150a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final mm2 f38129a;

        /* renamed from: b */
        public final /* synthetic */ gz0 f38130b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7150a(gz0 gz0, mm2 mm2) {
            super(mm2.mo45818b());
            vx2.m53591g(mm2, "binding");
            this.f38130b = gz0;
            this.f38129a = mm2;
        }

        /* renamed from: e */
        public static final void m58364e(gz0 gz0, RoomConnectedInfoAndWallet roomConnectedInfoAndWallet, View view) {
            vx2.m53591g(gz0, "this$0");
            vx2.m53591g(roomConnectedInfoAndWallet, "$roomConnectedInfoAndWallet");
            gz0.mo52075d().invoke(roomConnectedInfoAndWallet);
        }

        /* renamed from: f */
        public static final void m58365f(gz0 gz0, RoomConnectedInfoAndWallet roomConnectedInfoAndWallet, View view) {
            vx2.m53591g(gz0, "this$0");
            vx2.m53591g(roomConnectedInfoAndWallet, "$roomConnectedInfoAndWallet");
            gz0.mo52075d().invoke(roomConnectedInfoAndWallet);
        }

        /* renamed from: g */
        public static final void m58366g(gz0 gz0, RoomConnectedInfoAndWallet roomConnectedInfoAndWallet, View view) {
            vx2.m53591g(gz0, "this$0");
            vx2.m53591g(roomConnectedInfoAndWallet, "$roomConnectedInfoAndWallet");
            gz0.mo52075d().invoke(roomConnectedInfoAndWallet);
        }

        /* renamed from: d */
        public final void mo52077d(int i) {
            String str;
            String str2;
            Object obj = this.f38130b.f38128e.get(i);
            vx2.m53589e(obj, "null cannot be cast to non-null type net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWalletListItem");
            RoomConnectedInfoAndWallet result = ((RoomConnectedInfoAndWalletListItem) obj).getResult();
            vx2.m53588d(result);
            RoomConnectedInfo dApp = result.getDApp();
            mm2 mm2 = this.f38129a;
            gz0 gz0 = this.f38130b;
            String str3 = null;
            if (WCVersion.Companion.mo62060a(dApp.getVersion()) == WCVersion.Ver1) {
                WCPeerMeta peerMeta = RoomExtensionKt.toPeerMeta(dApp.getPeerMeta());
                if (!peerMeta.getIcons().isEmpty()) {
                    String str4 = peerMeta.getIcons().get(0);
                    int f = f06.m57515f(gz0.mo52073b(), "MODE_NIGHT", 1);
                    if (!StringsKt__StringsKt.m63081R(str4, "swap.safemoon.com", false, 2, (Object) null) || f != 1) {
                        ((be5) C1710a.m12225u(mm2.f31729e).mo23164y(str4).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(mm2.f31729e);
                    } else {
                        ((be5) C1710a.m12225u(mm2.f31729e).mo23164y("https://safemoon.com/img/logo_dark.png").mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(mm2.f31729e);
                    }
                }
                mm2.f31733i.setText(peerMeta.getName());
                mm2.f31732h.setText(peerMeta.getUrl());
            } else {
                dn4 b = en4.m57410b(dApp.getPeerMeta());
                if (b == null || (str = b.mo51235a()) == null) {
                    str = "";
                }
                int f2 = f06.m57515f(gz0.mo52073b(), "MODE_NIGHT", 1);
                if (!StringsKt__StringsKt.m63081R(str, "swap.safemoon.com", false, 2, (Object) null) || f2 != 1) {
                    ((be5) C1710a.m12225u(mm2.f31729e).mo23164y(str).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(mm2.f31729e);
                } else {
                    ((be5) C1710a.m12225u(mm2.f31729e).mo23164y("https://safemoon.com/img/logo_dark.png").mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(mm2.f31729e);
                }
                AppCompatTextView appCompatTextView = mm2.f31733i;
                if (b != null) {
                    str2 = b.mo51236b();
                } else {
                    str2 = null;
                }
                appCompatTextView.setText(str2);
                AppCompatTextView appCompatTextView2 = mm2.f31732h;
                if (b != null) {
                    str3 = b.mo51237c();
                }
                appCompatTextView2.setText(str3);
            }
            mm2.mo45818b().setOnClickListener(new dz0(gz0, result));
            mm2.f31727c.setOnClickListener(new ez0(gz0, result));
            mm2.f31728d.setOnClickListener(new fz0(gz0, result));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lgz0$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "item", "Lr37;", "a", "Lcz2;", "Lcz2;", "getBinding", "()Lcz2;", "binding", "<init>", "(Lcz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gz0$b */
    /* compiled from: DAppConnectedAdapter.kt */
    public static final class C7151b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final cz2 f38131a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7151b(cz2 cz2) {
            super(cz2.mo41790b());
            vx2.m53591g(cz2, "binding");
            this.f38131a = cz2;
        }

        /* renamed from: a */
        public final void mo52078a(HistoryListItem historyListItem) {
            vx2.m53591g(historyListItem, "item");
            this.f38131a.mo41790b().setBackgroundResource(17170445);
            this.f38131a.f28002b.setText(((HeaderItemHistory) historyListItem).getTitle());
        }
    }

    public gz0(Context context, rc2<? super RoomConnectedInfoAndWallet, r37> rc2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(rc2, "onItemClick");
        this.f38126a = context;
        this.f38127d = rc2;
    }

    /* renamed from: b */
    public final Context mo52073b() {
        return this.f38126a;
    }

    /* renamed from: c */
    public final RoomConnectedInfoAndWallet mo52074c(int i) {
        if (!(this.f38128e.get(i) instanceof RoomConnectedInfoAndWalletListItem)) {
            return null;
        }
        HistoryListItem historyListItem = this.f38128e.get(i);
        vx2.m53589e(historyListItem, "null cannot be cast to non-null type net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWalletListItem");
        return ((RoomConnectedInfoAndWalletListItem) historyListItem).getResult();
    }

    /* renamed from: d */
    public final rc2<RoomConnectedInfoAndWallet, r37> mo52075d() {
        return this.f38127d;
    }

    /* renamed from: e */
    public final void mo52076e(List<RoomConnectedInfoAndWallet> list) {
        String str;
        vx2.m53591g(list, "it");
        this.f38128e.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : list) {
            Wallet wallet2 = ((RoomConnectedInfoAndWallet) next).getWallet();
            Object obj = linkedHashMap.get(wallet2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(wallet2, obj);
            }
            ((List) obj).add(next);
        }
        for (Wallet wallet3 : linkedHashMap.keySet()) {
            List<HistoryListItem> list2 = this.f38128e;
            HeaderItemHistory headerItemHistory = new HeaderItemHistory();
            if (wallet3 != null) {
                str = wallet3.displayName();
            } else {
                str = null;
            }
            headerItemHistory.setTitle(str);
            list2.add(headerItemHistory);
            List<RoomConnectedInfoAndWallet> list3 = (List) linkedHashMap.get(wallet3);
            if (!(list3 == null || (r1 = list3.iterator()) == null)) {
                for (RoomConnectedInfoAndWallet result : list3) {
                    List<HistoryListItem> list4 = this.f38128e;
                    RoomConnectedInfoAndWalletListItem roomConnectedInfoAndWalletListItem = new RoomConnectedInfoAndWalletListItem();
                    roomConnectedInfoAndWalletListItem.setResult(result);
                    list4.add(roomConnectedInfoAndWalletListItem);
                }
            }
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f38128e.size();
    }

    public int getItemViewType(int i) {
        return this.f38128e.get(i).getType();
    }

    public void onBindViewHolder(RecyclerView.C1231a0 a0Var, int i) {
        vx2.m53591g(a0Var, "holder");
        HistoryListItem historyListItem = this.f38128e.get(i);
        if (getItemViewType(i) == 0) {
            if (a0Var instanceof C7151b) {
                ((C7151b) a0Var).mo52078a(historyListItem);
            }
        } else if (getItemViewType(i) != 1 && (a0Var instanceof C7150a)) {
            ((C7150a) a0Var).mo52077d(i);
        }
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        if (i == 0) {
            cz2 c = cz2.m43311c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            vx2.m53590f(c, "inflate(LayoutInflater.f….context), parent, false)");
            return new C7151b(c);
        }
        mm2 c2 = mm2.m48369c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        vx2.m53590f(c2, "inflate(LayoutInflater.f….context), parent, false)");
        return new C7150a(this, c2);
    }
}
