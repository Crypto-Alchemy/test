package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.github.mikephil.charting.utils.Utils;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.Coin;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\"#B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b \u0010!J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\r8\u0002XD¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\r8\u0002XD¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\r8\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, mo44877d2 = {"Lgw0;", "Landroidx/paging/PagingDataAdapter;", "Lnet/safemoon/androidwallet/model/Coin;", "Lgw0$b;", "holder", "", "position", "Lr37;", "g", "Landroid/view/ViewGroup;", "parent", "viewType", "i", "", "valueSort", "j", "Lkotlin/Function1;", "Lrc2;", "onClick", "k", "Ljava/lang/String;", "VALUE_1h", "r", "VALUE_24h", "s", "VALUE_7d", "x", "duration", "Landroid/content/Context;", "y", "Landroid/content/Context;", "context", "<init>", "(Lrc2;)V", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gw0 */
/* compiled from: CryptoAllTokensPagingAdapter.kt */
public final class gw0 extends PagingDataAdapter<Coin, C7146b> {

    /* renamed from: g */
    public final rc2<Coin, r37> f38072g;

    /* renamed from: k */
    public final String f38073k = "1h";

    /* renamed from: r */
    public final String f38074r = "24h";

    /* renamed from: s */
    public final String f38075s = "7d";

    /* renamed from: x */
    public String f38076x = "24h";

    /* renamed from: y */
    public Context f38077y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lgw0$a;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/Coin;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gw0$a */
    /* compiled from: CryptoAllTokensPagingAdapter.kt */
    public static final class C7145a extends C1294g.C1300f<Coin> {

        /* renamed from: a */
        public static final C7145a f38078a = new C7145a();

        /* renamed from: a */
        public boolean areContentsTheSame(Coin coin, Coin coin2) {
            vx2.m53591g(coin, "oldItem");
            vx2.m53591g(coin2, "newItem");
            return vx2.m53586b(coin, coin2);
        }

        /* renamed from: b */
        public boolean areItemsTheSame(Coin coin, Coin coin2) {
            vx2.m53591g(coin, "oldItem");
            vx2.m53591g(coin2, "newItem");
            return vx2.m53586b(coin.getId(), coin2.getId());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0016"}, mo44877d2 = {"Lgw0$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "tvTokenName", "b", "e", "tvTokenPrice", "c", "tvPercent", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "ivPercent", "ivToken", "Landroid/view/View;", "itemView", "<init>", "(Lgw0;Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gw0$b */
    /* compiled from: CryptoAllTokensPagingAdapter.kt */
    public final class C7146b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final TextView f38079a;

        /* renamed from: b */
        public final TextView f38080b;

        /* renamed from: c */
        public final TextView f38081c;

        /* renamed from: d */
        public final ImageView f38082d;

        /* renamed from: e */
        public final ImageView f38083e;

        /* renamed from: f */
        public final /* synthetic */ gw0 f38084f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7146b(gw0 gw0, View view) {
            super(view);
            vx2.m53591g(view, "itemView");
            this.f38084f = gw0;
            View findViewById = view.findViewById(R.id.tvTokenName);
            vx2.m53588d(findViewById);
            this.f38079a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvTokenPrice);
            vx2.m53588d(findViewById2);
            this.f38080b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvPercent);
            vx2.m53588d(findViewById3);
            this.f38081c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.IvPercent);
            vx2.m53588d(findViewById4);
            this.f38082d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ivToken);
            vx2.m53588d(findViewById5);
            this.f38083e = (ImageView) findViewById5;
        }

        /* renamed from: a */
        public final ImageView mo52028a() {
            return this.f38082d;
        }

        /* renamed from: b */
        public final ImageView mo52029b() {
            return this.f38083e;
        }

        /* renamed from: c */
        public final TextView mo52030c() {
            return this.f38081c;
        }

        /* renamed from: d */
        public final TextView mo52031d() {
            return this.f38079a;
        }

        /* renamed from: e */
        public final TextView mo52032e() {
            return this.f38080b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gw0(rc2<? super Coin, r37> rc2) {
        super(C7145a.f38078a, (CoroutineDispatcher) null, (CoroutineDispatcher) null, 6, (DefaultConstructorMarker) null);
        vx2.m53591g(rc2, "onClick");
        this.f38072g = rc2;
    }

    /* renamed from: h */
    public static final void m58263h(gw0 gw0, Coin coin, View view) {
        vx2.m53591g(gw0, "this$0");
        vx2.m53591g(coin, "$coin");
        gw0.f38072g.invoke(coin);
    }

    /* renamed from: g */
    public void onBindViewHolder(C7146b bVar, int i) {
        Double d;
        int i2;
        C7146b bVar2 = bVar;
        vx2.m53591g(bVar2, "holder");
        Object item = getItem(i);
        vx2.m53588d(item);
        Coin coin = (Coin) item;
        me5 u = C1710a.m12225u(bVar.mo52029b());
        Integer id = coin.getId();
        vx2.m53590f(id, "coin.id");
        u.mo23163x(C9384u3.m72567h(id.intValue(), coin.getSymbol())).mo11567a(qe5.m25622w0(new xe0())).mo11553K0(bVar.mo52029b());
        bVar.mo52031d().setText(coin.getName());
        rz1.C9291a aVar = rz1.f44501a;
        String t = ol0.m70378t(aVar.mo65772b());
        TextView e = bVar.mo52032e();
        cb6 cb6 = cb6.f21669a;
        Locale locale = Locale.getDefault();
        Double price = coin.getQuote().getUSD().getPrice();
        vx2.m53590f(price, "coin.quote.usd.price");
        String format = String.format(locale, t, Arrays.copyOf(new Object[]{aVar.mo65772b(), ol0.m70374p(sz1.m72124a(price.doubleValue()), 0, (RoundingMode) null, false, 7, (Object) null)}, 2));
        vx2.m53590f(format, "format(locale, format, *args)");
        e.setText(format);
        String sortType = coin.getSortType();
        if (vx2.m53586b(sortType, this.f38073k)) {
            d = coin.getQuote().getUSD().getPercentChange1h();
        } else if (vx2.m53586b(sortType, this.f38075s)) {
            d = coin.getQuote().getUSD().getPercentChange7d();
        } else {
            d = coin.getQuote().getUSD().getPercentChange24h();
        }
        if (d != null) {
            TextView c = bVar.mo52030c();
            String format2 = String.format(Locale.getDefault(), "%s%%", Arrays.copyOf(new Object[]{ol0.m70371m(d.doubleValue())}, 1));
            vx2.m53590f(format2, "format(locale, format, *args)");
            c.setText(format2);
            if (d.doubleValue() < Utils.DOUBLE_EPSILON) {
                i2 = R.drawable.arrow_down;
            } else {
                i2 = R.drawable.arrow_up;
            }
            C1710a.m12225u(bVar.mo52028a()).mo23162w(Integer.valueOf(i2)).mo11553K0(bVar.mo52028a());
        }
        bVar2.itemView.setOnClickListener(new fw0(this, coin));
    }

    /* renamed from: i */
    public C7146b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        this.f38077y = viewGroup.getContext();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        vx2.m53590f(inflate, "from(parent.context)\n   …list_item, parent, false)");
        return new C7146b(this, inflate);
    }

    /* renamed from: j */
    public final void mo52025j(String str) {
        vx2.m53591g(str, "valueSort");
        this.f38076x = str;
    }
}
