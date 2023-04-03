package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0018\u0019\u001aB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u001a\u0010\u000e\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, mo44877d2 = {"Lbi0;", "Landroidx/paging/PagingDataAdapter;", "Lnet/safemoon/androidwallet/model/Coin;", "Lbi0$b;", "holder", "", "position", "Lr37;", "g", "Landroid/view/ViewGroup;", "parent", "viewType", "i", "datum", "j", "Lbi0$c;", "Lbi0$c;", "itemClickListener", "Landroid/content/Context;", "k", "Landroid/content/Context;", "context", "<init>", "(Lbi0$c;)V", "a", "b", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bi0 */
/* compiled from: CoinPagingAdapter.kt */
public final class bi0 extends PagingDataAdapter<Coin, C6864b> {

    /* renamed from: g */
    public final C6865c f36810g;

    /* renamed from: k */
    public Context f36811k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lbi0$a;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/Coin;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bi0$a */
    /* compiled from: CoinPagingAdapter.kt */
    public static final class C6863a extends C1294g.C1300f<Coin> {

        /* renamed from: a */
        public static final C6863a f36812a = new C6863a();

        /* renamed from: a */
        public boolean areContentsTheSame(Coin coin, Coin coin2) {
            vx2.m53591g(coin, "oldItem");
            vx2.m53591g(coin2, "newItem");
            return vx2.m53586b(coin.getId(), coin2.getId());
        }

        /* renamed from: b */
        public boolean areItemsTheSame(Coin coin, Coin coin2) {
            vx2.m53591g(coin, "oldItem");
            vx2.m53591g(coin2, "newItem");
            return vx2.m53586b(coin.getId(), coin2.getId());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u001a"}, mo44877d2 = {"Lbi0$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/view/View;", "a", "Landroid/view/View;", "()Landroid/view/View;", "container", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "name", "c", "f", "price", "e", "percent", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "ivPercent", "img", "itemView", "<init>", "(Lbi0;Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bi0$b */
    /* compiled from: CoinPagingAdapter.kt */
    public final class C6864b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final View f36813a;

        /* renamed from: b */
        public final TextView f36814b;

        /* renamed from: c */
        public final TextView f36815c;

        /* renamed from: d */
        public final TextView f36816d;

        /* renamed from: e */
        public final ImageView f36817e;

        /* renamed from: f */
        public final ImageView f36818f;

        /* renamed from: g */
        public final /* synthetic */ bi0 f36819g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6864b(bi0 bi0, View view) {
            super(view);
            vx2.m53591g(view, "itemView");
            this.f36819g = bi0;
            View findViewById = view.findViewById(R.id.cv_item_container);
            vx2.m53590f(findViewById, "itemView.findViewById(R.id.cv_item_container)");
            this.f36813a = findViewById;
            View findViewById2 = view.findViewById(R.id.name);
            vx2.m53590f(findViewById2, "itemView.findViewById(R.id.name)");
            this.f36814b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.price);
            vx2.m53590f(findViewById3, "itemView.findViewById(R.id.price)");
            this.f36815c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.percent);
            vx2.m53590f(findViewById4, "itemView.findViewById(R.id.percent)");
            this.f36816d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.IvPercent);
            vx2.m53590f(findViewById5, "itemView.findViewById(R.id.IvPercent)");
            this.f36817e = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.img);
            vx2.m53590f(findViewById6, "itemView.findViewById(R.id.img)");
            this.f36818f = (ImageView) findViewById6;
        }

        /* renamed from: a */
        public final View mo50591a() {
            return this.f36813a;
        }

        /* renamed from: b */
        public final ImageView mo50592b() {
            return this.f36818f;
        }

        /* renamed from: c */
        public final ImageView mo50593c() {
            return this.f36817e;
        }

        /* renamed from: d */
        public final TextView mo50594d() {
            return this.f36814b;
        }

        /* renamed from: e */
        public final TextView mo50595e() {
            return this.f36816d;
        }

        /* renamed from: f */
        public final TextView mo50596f() {
            return this.f36815c;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lbi0$c;", "", "Lnet/safemoon/androidwallet/model/Coin;", "coin", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bi0$c */
    /* compiled from: CoinPagingAdapter.kt */
    public interface C6865c {
        /* renamed from: a */
        void mo50597a(Coin coin);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bi0(C6865c cVar) {
        super(C6863a.f36812a, (CoroutineDispatcher) null, (CoroutineDispatcher) null, 6, (DefaultConstructorMarker) null);
        vx2.m53591g(cVar, "itemClickListener");
        this.f36810g = cVar;
    }

    /* renamed from: h */
    public static final void m55967h(bi0 bi0, Coin coin, View view) {
        vx2.m53591g(bi0, "this$0");
        vx2.m53591g(coin, "$datum");
        bi0.f36810g.mo50597a(coin);
    }

    /* renamed from: g */
    public void onBindViewHolder(C6864b bVar, int i) {
        C6864b bVar2 = bVar;
        vx2.m53591g(bVar2, "holder");
        Object item = getItem(i);
        vx2.m53588d(item);
        Coin coin = (Coin) item;
        Integer id = coin.getId();
        vx2.m53590f(id, "datum.id");
        if (id.intValue() > 0) {
            me5 u = C1710a.m12225u(bVar.mo50592b());
            Integer id2 = coin.getId();
            vx2.m53590f(id2, "datum.id");
            u.mo23163x(C9384u3.m72567h(id2.intValue(), coin.getSymbol())).mo11567a(qe5.m25623x0()).mo11553K0(bVar.mo50592b());
        }
        bVar.mo50594d().setSelected(true);
        TextView d = bVar.mo50594d();
        String name = coin.getName();
        String symbol = coin.getSymbol();
        d.setText(name + "(" + symbol + ")");
        bVar.mo50596f().setSelected(true);
        rz1.C9291a aVar = rz1.f44501a;
        String t = ol0.m70378t(aVar.mo65772b());
        TextView f = bVar.mo50596f();
        cb6 cb6 = cb6.f21669a;
        Locale locale = Locale.getDefault();
        Double price = coin.getQuote().getUSD().getPrice();
        vx2.m53590f(price, "datum.quote.usd.price");
        String format = String.format(locale, t, Arrays.copyOf(new Object[]{aVar.mo65772b(), ol0.m70374p(sz1.m72124a(price.doubleValue()), 0, (RoundingMode) null, false, 7, (Object) null)}, 2));
        vx2.m53590f(format, "format(locale, format, *args)");
        f.setText(format);
        TextView e = bVar.mo50595e();
        String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{coin.getQuote().getUSD().getPercentChange1h()}, 1));
        vx2.m53590f(format2, "format(format, *args)");
        e.setText(format2 + "%");
        bVar.mo50591a().setOnClickListener(new ai0(this, coin));
        mo50588j(bVar2, coin);
    }

    /* renamed from: i */
    public C6864b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        this.f36811k = viewGroup.getContext();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.top_gainers_list_item, viewGroup, false);
        vx2.m53590f(inflate, "from(parent.context).inf…list_item, parent, false)");
        return new C6864b(this, inflate);
    }

    /* renamed from: j */
    public final void mo50588j(C6864b bVar, Coin coin) {
        vx2.m53591g(bVar, "holder");
        vx2.m53591g(coin, "datum");
        try {
            Double percentChange1h = coin.getQuote().getUSD().getPercentChange1h();
            vx2.m53590f(percentChange1h, "datum.quote.usd.percentChange1h");
            Drawable drawable = null;
            if (percentChange1h.doubleValue() < Utils.DOUBLE_EPSILON) {
                ImageView c = bVar.mo50593c();
                Context context = this.f36811k;
                if (context != null) {
                    drawable = zr0.m31442e(context, R.drawable.arrow_down);
                }
                c.setBackground(drawable);
            } else {
                ImageView c2 = bVar.mo50593c();
                Context context2 = this.f36811k;
                if (context2 != null) {
                    drawable = zr0.m31442e(context2, R.drawable.arrow_up);
                }
                c2.setBackground(drawable);
            }
            if (coin.getQuote().getUSD() == null) {
                bVar.mo50593c().setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
