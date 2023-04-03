package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u0015B[\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u0013\u0010\u001cR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, mo44877d2 = {"Lfj7;", "Landroidx/recyclerview/widget/o;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lfj7$b;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "h", "holder", "position", "Lr37;", "g", "Landroid/content/Context;", "a", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "context", "d", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "b", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "activeWallet", "Lkotlin/Function1;", "e", "Lrc2;", "c", "()Lrc2;", "callBack", "callMenu", "k", "callLink", "r", "I", "listSize", "<init>", "(Landroid/content/Context;Lnet/safemoon/androidwallet/model/wallets/Wallet;Lrc2;Lrc2;Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fj7 */
/* compiled from: WalletsAdapter.kt */
public final class fj7 extends C1330o<Wallet, C7089b> {

    /* renamed from: a */
    public final Context f37828a;

    /* renamed from: d */
    public final Wallet f37829d;

    /* renamed from: e */
    public final rc2<Wallet, r37> f37830e;

    /* renamed from: g */
    public final rc2<Wallet, r37> f37831g;

    /* renamed from: k */
    public final rc2<Wallet, r37> f37832k;

    /* renamed from: r */
    public int f37833r = getItemCount();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lfj7$a;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: fj7$a */
    /* compiled from: WalletsAdapter.kt */
    public static final class C7088a extends C1294g.C1300f<Wallet> {

        /* renamed from: a */
        public static final C7088a f37834a = new C7088a();

        /* renamed from: a */
        public boolean areContentsTheSame(Wallet wallet2, Wallet wallet3) {
            vx2.m53591g(wallet2, "oldItem");
            vx2.m53591g(wallet3, "newItem");
            return vx2.m53586b(wallet2, wallet3);
        }

        /* renamed from: b */
        public boolean areItemsTheSame(Wallet wallet2, Wallet wallet3) {
            vx2.m53591g(wallet2, "oldItem");
            vx2.m53591g(wallet3, "newItem");
            return vx2.m53586b(wallet2.getId(), wallet3.getId());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lfj7$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "position", "listSize", "Lr37;", "d", "Lsm2;", "a", "Lsm2;", "getBinding", "()Lsm2;", "binding", "<init>", "(Lfj7;Lsm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: fj7$b */
    /* compiled from: WalletsAdapter.kt */
    public final class C7089b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final sm2 f37835a;

        /* renamed from: b */
        public final /* synthetic */ fj7 f37836b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7089b(fj7 fj7, sm2 sm2) {
            super(sm2.mo47831b());
            vx2.m53591g(sm2, "binding");
            this.f37836b = fj7;
            this.f37835a = sm2;
        }

        /* renamed from: e */
        public static final void m57762e(fj7 fj7, Wallet wallet2, View view) {
            vx2.m53591g(fj7, "this$0");
            rc2<Wallet, r37> c = fj7.mo51702c();
            if (c != null) {
                vx2.m53590f(wallet2, "wallet");
                c.invoke(wallet2);
            }
        }

        /* renamed from: f */
        public static final void m57763f(fj7 fj7, Wallet wallet2, View view) {
            vx2.m53591g(fj7, "this$0");
            rc2<Wallet, r37> e = fj7.mo51704e();
            if (e != null) {
                vx2.m53590f(wallet2, "wallet");
                e.invoke(wallet2);
            }
        }

        /* renamed from: g */
        public static final void m57764g(sm2 sm2, fj7 fj7, Wallet wallet2, View view) {
            boolean z;
            rc2<Wallet, r37> d;
            vx2.m53591g(sm2, "$this_apply");
            vx2.m53591g(fj7, "this$0");
            if (sm2.f33950e.getAlpha() == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z && (d = fj7.mo51703d()) != null) {
                vx2.m53590f(wallet2, "wallet");
                d.invoke(wallet2);
            }
        }

        /* renamed from: d */
        public final void mo51710d(int i, int i2) {
            Long l;
            Wallet a = fj7.m57749a(this.f37836b, i);
            sm2 sm2 = this.f37835a;
            fj7 fj7 = this.f37836b;
            sm2.f33953h.setText(a.displayName());
            sm2.f33952g.setOnClickListener(new gj7(fj7, a));
            sm2.f33948c.setOnClickListener(new hj7(fj7, a));
            sm2.f33950e.setOnClickListener(new ij7(sm2, fj7, a));
            Wallet b = fj7.mo51701b();
            if (b != null) {
                l = b.getId();
            } else {
                l = null;
            }
            if (vx2.m53586b(l, a.getId())) {
                TextView textView = sm2.f33953h;
                textView.setTypeface(textView.getTypeface(), 1);
                sm2.f33953h.setTextColor(fj7.mo51705f().getColorStateList(R.color.dark_green));
                sm2.f33949d.setBackgroundTintList(sm2.mo47831b().getContext().getColorStateList(R.color.active_wallet));
            } else {
                sm2.f33949d.setBackgroundTintList(sm2.mo47831b().getContext().getColorStateList(R.color.card_bg_1));
                TextView textView2 = sm2.f33953h;
                textView2.setTypeface(textView2.getTypeface(), 0);
                sm2.f33953h.setTextColor(fj7.mo51705f().getColorStateList(R.color.t1));
            }
            if (a.isPrimaryWallet()) {
                sm2.f33950e.setImageResource(R.drawable.ic_wallet_link_all);
                if (!g06.f37938a.mo51835d(fj7.mo51705f()) || i2 <= 1) {
                    sm2.f33950e.setImageTintList(fj7.mo51705f().getColorStateList(R.color.t1));
                    if (i2 == 1) {
                        sm2.f33950e.setAlpha(0.3f);
                    } else {
                        sm2.f33950e.setAlpha(1.0f);
                    }
                } else {
                    sm2.f33950e.setImageTintList(fj7.mo51705f().getColorStateList(R.color.dark_green));
                }
            } else {
                sm2.f33950e.setAlpha(1.0f);
                if (a.isLinked()) {
                    sm2.f33950e.setImageResource(R.drawable.ic_wallet_link_individual);
                    sm2.f33950e.setImageTintList(fj7.mo51705f().getColorStateList(R.color.dark_green));
                    return;
                }
                sm2.f33950e.setImageResource(R.drawable.ic_wallet_unlink_individual);
                sm2.f33950e.setImageTintList(fj7.mo51705f().getColorStateList(R.color.t1));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fj7(Context context, Wallet wallet2, rc2<? super Wallet, r37> rc2, rc2<? super Wallet, r37> rc22, rc2<? super Wallet, r37> rc23) {
        super(C7088a.f37834a);
        vx2.m53591g(context, "context");
        this.f37828a = context;
        this.f37829d = wallet2;
        this.f37830e = rc2;
        this.f37831g = rc22;
        this.f37832k = rc23;
    }

    /* renamed from: a */
    public static final /* synthetic */ Wallet m57749a(fj7 fj7, int i) {
        return (Wallet) fj7.getItem(i);
    }

    /* renamed from: b */
    public final Wallet mo51701b() {
        return this.f37829d;
    }

    /* renamed from: c */
    public final rc2<Wallet, r37> mo51702c() {
        return this.f37830e;
    }

    /* renamed from: d */
    public final rc2<Wallet, r37> mo51703d() {
        return this.f37832k;
    }

    /* renamed from: e */
    public final rc2<Wallet, r37> mo51704e() {
        return this.f37831g;
    }

    /* renamed from: f */
    public final Context mo51705f() {
        return this.f37828a;
    }

    /* renamed from: g */
    public void onBindViewHolder(C7089b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo51710d(i, this.f37833r);
    }

    /* renamed from: h */
    public C7089b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        sm2 a = sm2.m51858a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_wallet, viewGroup, false));
        vx2.m53590f(a, "bind(\n                La…ent, false)\n            )");
        return new C7089b(this, a);
    }
}
