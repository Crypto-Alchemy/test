package p000;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.github.mikephil.charting.utils.Utils;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0012!B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, mo44877d2 = {"Lxi7;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lxi7$b;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "d", "holder", "position", "Lr37;", "c", "getItemCount", "", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "newItemList", "e", "Lxi7$a;", "a", "Lxi7$a;", "onTokenClickListener", "", "Ljava/util/List;", "items", "Lnz2;", "Lnz2;", "binding", "Landroid/content/res/Resources;", "g", "Landroid/content/res/Resources;", "resources", "<init>", "(Lxi7$a;)V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xi7 */
/* compiled from: WalletMyTokensAdapter.kt */
public final class xi7 extends RecyclerView.Adapter<C9599b> {

    /* renamed from: a */
    public final C9598a f45949a;

    /* renamed from: d */
    public final List<UserTokenItemDisplayModel> f45950d = new ArrayList();

    /* renamed from: e */
    public nz2 f45951e;

    /* renamed from: g */
    public Resources f45952g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lxi7$a;", "", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: xi7$a */
    /* compiled from: WalletMyTokensAdapter.kt */
    public interface C9598a {
        /* renamed from: a */
        void mo57942a(UserTokenItemDisplayModel userTokenItemDisplayModel);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lxi7$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "position", "Lr37;", "b", "Lnz2;", "a", "Lnz2;", "getBinding", "()Lnz2;", "binding", "<init>", "(Lxi7;Lnz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: xi7$b */
    /* compiled from: WalletMyTokensAdapter.kt */
    public final class C9599b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final nz2 f45953a;

        /* renamed from: b */
        public final /* synthetic */ xi7 f45954b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9599b(xi7 xi7, nz2 nz2) {
            super(nz2.mo46268b());
            vx2.m53591g(nz2, "binding");
            this.f45954b = xi7;
            this.f45953a = nz2;
        }

        /* renamed from: c */
        public static final void m73973c(xi7 xi7, UserTokenItemDisplayModel userTokenItemDisplayModel, View view) {
            vx2.m53591g(xi7, "this$0");
            vx2.m53591g(userTokenItemDisplayModel, "$item");
            xi7.f45949a.mo57942a(userTokenItemDisplayModel);
        }

        /* renamed from: b */
        public final void mo66872b(int i) {
            int i2;
            UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) this.f45954b.f45950d.get(i);
            nz2 nz2 = this.f45953a;
            xi7 xi7 = this.f45954b;
            ImageView imageView = nz2.f32231c;
            vx2.m53590f(imageView, "ivTokenIcon");
            ol0.m70336P(imageView, userTokenItemDisplayModel.getIconResId(), userTokenItemDisplayModel.getIconFile(), userTokenItemDisplayModel.getSymbol());
            if (ol0.m70328H(userTokenItemDisplayModel.getSymbol())) {
                ImageView imageView2 = nz2.f32231c;
                vx2.m53590f(imageView2, "ivTokenIcon");
                ol0.m70335O(imageView2, userTokenItemDisplayModel.getCmcId(), userTokenItemDisplayModel.getSymbol());
            }
            nz2.f32234f.setText(userTokenItemDisplayModel.getName());
            try {
                rz1.C9291a aVar = rz1.f44501a;
                String t = ol0.m70378t(aVar.mo65772b());
                TextView textView = nz2.f32236h;
                cb6 cb6 = cb6.f21669a;
                String format = String.format(Locale.getDefault(), t, Arrays.copyOf(new Object[]{aVar.mo65772b(), ol0.m70374p(sz1.m72124a(userTokenItemDisplayModel.getPriceInUsdt()), 0, (RoundingMode) null, false, 7, (Object) null)}, 2));
                vx2.m53590f(format, "format(locale, format, *args)");
                textView.setText(format);
            } catch (Exception unused) {
            }
            TextView textView2 = nz2.f32235g;
            vx2.m53590f(textView2, "tvTokenNativeBalance");
            ol0.m70337Q(textView2, userTokenItemDisplayModel.getNativeBalance());
            TextView textView3 = nz2.f32233e;
            vx2.m53590f(textView3, "tvTokenBalance");
            ol0.m70333M(textView3, userTokenItemDisplayModel.getBalanceInUSDT(), true);
            try {
                double percentChange1h = userTokenItemDisplayModel.getPercentChange1h();
                TextView textView4 = nz2.f32232d;
                cb6 cb62 = cb6.f21669a;
                String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(percentChange1h)}, 1));
                vx2.m53590f(format2, "format(format, *args)");
                textView4.setText(format2 + "%");
                if (percentChange1h >= Utils.DOUBLE_EPSILON) {
                    i2 = R.drawable.arrow_up;
                } else {
                    i2 = R.drawable.arrow_down;
                }
                C1710a.m12225u(this.f45953a.f32230b).mo23162w(Integer.valueOf(i2)).mo11553K0(this.f45953a.f32230b);
            } catch (Exception unused2) {
            }
            nz2.mo46268b().setOnClickListener(new yi7(xi7, userTokenItemDisplayModel));
        }
    }

    public xi7(C9598a aVar) {
        vx2.m53591g(aVar, "onTokenClickListener");
        this.f45949a = aVar;
    }

    /* renamed from: c */
    public void onBindViewHolder(C9599b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo66872b(i);
    }

    /* renamed from: d */
    public C9599b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        nz2 a = nz2.m49107a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_wallet_token_card, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        this.f45951e = a;
        nz2 nz2 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        Resources resources = a.mo46268b().getContext().getResources();
        vx2.m53590f(resources, "binding.root.context.resources");
        this.f45952g = resources;
        nz2 nz22 = this.f45951e;
        if (nz22 == null) {
            vx2.m53605u("binding");
        } else {
            nz2 = nz22;
        }
        return new C9599b(this, nz2);
    }

    /* renamed from: e */
    public final void mo66871e(List<UserTokenItemDisplayModel> list) {
        vx2.m53591g(list, "newItemList");
        this.f45950d.clear();
        this.f45950d.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f45950d.size();
    }
}
