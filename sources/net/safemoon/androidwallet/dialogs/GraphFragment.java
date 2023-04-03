package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.github.mikephil.charting.charts.CandleStickChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.Data;
import net.safemoon.androidwallet.model.HistoricalDatum;
import net.safemoon.androidwallet.model.HistoricalList;
import net.safemoon.androidwallet.model.USDT;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStats;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStatsData;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStatsDataQuoteList;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStatsUsd;
import net.safemoon.androidwallet.provider.TokenInfoExistProvider;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.GraphViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.views.marker.LineGraphMarkerView;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 s2\u00020\u0001:\u0003tuvB\u0007¢\u0006\u0004\bq\u0010rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u0004H\u0002J\b\u0010'\u001a\u00020\u0004H\u0002J\b\u0010(\u001a\u00020\u0004H\u0002J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u0004H\u0002J\b\u0010.\u001a\u00020\u0004H\u0002J\b\u0010/\u001a\u00020\u0004H\u0002J\b\u00100\u001a\u00020\u0004H\u0002J\b\u00101\u001a\u00020\u0004H\u0002J\b\u00102\u001a\u00020\u0004H\u0002J\b\u00103\u001a\u00020\u0004H\u0002J\u0010\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\nH\u0002J\u001c\u00108\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010#2\b\u00107\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010;\u001a\u0004\u0018\u00010#2\u0006\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020)H\u0002J\b\u0010<\u001a\u00020#H\u0002R\u0016\u0010?\u001a\u00020#8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020#8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u00106\u001a\u00020#8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bF\u0010>R\u0016\u00107\u001a\u00020#8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bG\u0010>R#\u0010L\u001a\n H*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010KR#\u0010M\u001a\n H*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\bF\u0010KR\u001d\u0010O\u001a\u0004\u0018\u00010#8BX\u0002¢\u0006\f\n\u0004\b2\u0010I\u001a\u0004\bN\u0010KR\u001b\u0010Q\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b/\u0010I\u001a\u0004\bP\u0010KR\u0016\u0010S\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010$R\u0016\u0010W\u001a\u00020T8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0002¢\u0006\f\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0002¢\u0006\f\n\u0004\b^\u0010I\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0002¢\u0006\f\n\u0004\bc\u0010I\u001a\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR)\u0010m\u001a\u0010\u0012\f\u0012\n H*\u0004\u0018\u00010\n0\n0j8BX\u0002¢\u0006\f\n\u0004\bk\u0010I\u001a\u0004\bG\u0010lR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020#0j8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006w"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GraphFragment;", "Lkf1;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onViewStateRestored", "Landroid/content/Context;", "context", "onAttach", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Landroid/app/Dialog;", "p", "Landroidx/fragment/app/FragmentManager;", "manager", "M0", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "", "isVisible", "u0", "z0", "x0", "N0", "", "Z", "d0", "C0", "n0", "l0", "", "id", "h0", "i0", "A0", "B0", "v0", "w0", "j0", "k0", "O0", "selected", "y0", "startDate", "interval", "c0", "field", "amount", "e0", "a0", "P", "Ljava/lang/String;", "tokenName", "Q", "symbol", "", "U", "D", "balance", "X", "Y", "kotlin.jvm.PlatformType", "Lef3;", "V", "()Ljava/lang/String;", "cmcId", "contractAddress", "W", "cmcSlug", "g0", "userCurrencySymbol", "b1", "isDailyIntervalForGraph", "Lqi2;", "e1", "Lqi2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/GraphViewModel;", "o1", "b0", "()Lnet/safemoon/androidwallet/viewmodels/GraphViewModel;", "graphViewModel", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "p1", "getMyTokenListViewModel", "()Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "Lnet/safemoon/androidwallet/provider/TokenInfoExistProvider;", "q1", "f0", "()Lnet/safemoon/androidwallet/provider/TokenInfoExistProvider;", "tokenInfoExistProvider", "r1", "Landroid/view/View;", "rootView", "Lk04;", "s1", "()Lk04;", "defaultIntervalViewLiveData", "t1", "Lk04;", "slugLiveData", "<init>", "()V", "u1", "a", "b", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: GraphFragment.kt */
public final class GraphFragment extends kf1 {

    /* renamed from: u1 */
    public static final C8304b f41756u1 = new C8304b((DefaultConstructorMarker) null);

    /* renamed from: P */
    public String f41757P;

    /* renamed from: Q */
    public String f41758Q;

    /* renamed from: U */
    public double f41759U = -1.0d;

    /* renamed from: X */
    public String f41760X;

    /* renamed from: Y */
    public String f41761Y;

    /* renamed from: Z */
    public final ef3 f41762Z = C6169a.m47232a(new GraphFragment$cmcId$2(this));

    /* renamed from: b1 */
    public boolean f41763b1;

    /* renamed from: e0 */
    public final ef3 f41764e0 = C6169a.m47232a(new GraphFragment$contractAddress$2(this));

    /* renamed from: e1 */
    public qi2 f41765e1;

    /* renamed from: k0 */
    public final ef3 f41766k0 = C6169a.m47232a(new GraphFragment$cmcSlug$2(this));

    /* renamed from: o1 */
    public final ef3 f41767o1;

    /* renamed from: p1 */
    public final ef3 f41768p1;

    /* renamed from: q1 */
    public final ef3 f41769q1;

    /* renamed from: r1 */
    public View f41770r1;

    /* renamed from: s1 */
    public final ef3 f41771s1;

    /* renamed from: t1 */
    public final k04<String> f41772t1;

    /* renamed from: v0 */
    public final ef3 f41773v0 = C6169a.m47232a(GraphFragment$userCurrencySymbol$2.INSTANCE);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GraphFragment$a;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Z", "isDaily", "", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuoteList;", "b", "Ljava/util/List;", "data", "<init>", "(Lnet/safemoon/androidwallet/dialogs/GraphFragment;ZLjava/util/List;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.GraphFragment$a */
    /* compiled from: GraphFragment.kt */
    public final class C8303a extends ValueFormatter {

        /* renamed from: a */
        public final boolean f41774a;

        /* renamed from: b */
        public final List<CoinPriceStatsDataQuoteList> f41775b;

        /* renamed from: c */
        public final /* synthetic */ GraphFragment f41776c;

        public C8303a(GraphFragment graphFragment, boolean z, List<CoinPriceStatsDataQuoteList> list) {
            vx2.m53591g(list, "data");
            this.f41776c = graphFragment;
            this.f41774a = z;
            this.f41775b = list;
        }

        public String getAxisLabel(float f, AxisBase axisBase) {
            if (f > ((float) this.f41775b.size())) {
                return "";
            }
            if (!this.f41774a && axisBase != null) {
                axisBase.setLabelCount(4);
            }
            Date parse = hj2.f38222a.parse(this.f41775b.get((int) f).getOpenTimestamp());
            if (parse == null) {
                parse = new Date();
            }
            long time = parse.getTime();
            if (this.f41774a) {
                String format = new SimpleDateFormat("MMMdd", Locale.getDefault()).format(new Date(time));
                vx2.m53590f(format, "{\n                Simple…timeStamp))\n            }");
                return format;
            }
            String format2 = new SimpleDateFormat("hh:mmaa", Locale.getDefault()).format(new Date(time));
            vx2.m53590f(format2, "SimpleDateFormat(DATE_FO…).format(Date(timeStamp))");
            return format2;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002Jt\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0001\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0017\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GraphFragment$b;", "", "", "name", "symbol", "cmcId", "slug", "contractAddress", "", "defaultInterval", "iconUrl", "iconResId", "", "showDexscreener", "dexScreenerUrl", "Lnet/safemoon/androidwallet/dialogs/GraphFragment;", "c", "", "balance", "a", "startDate", "interval", "b", "BALANCE_NO_DATA_VALUE", "D", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.GraphFragment$b */
    /* compiled from: GraphFragment.kt */
    public static final class C8304b {
        public C8304b() {
        }

        public /* synthetic */ C8304b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ GraphFragment m66165d(C8304b bVar, String str, String str2, double d, String str3, String str4, String str5, int i, String str6, int i2, boolean z, String str7, int i3, Object obj) {
            int i4 = i3;
            return bVar.mo57274a(str, str2, d, str3, str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? null : str6, (i4 & 256) != 0 ? 0 : i2, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? false : z, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : str7);
        }

        /* renamed from: e */
        public static /* synthetic */ GraphFragment m66166e(C8304b bVar, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, boolean z, String str7, int i3, Object obj) {
            String str8;
            int i4;
            String str9;
            int i5;
            boolean z2;
            String str10;
            int i6 = i3;
            if ((i6 & 16) != 0) {
                str8 = null;
            } else {
                str8 = str5;
            }
            if ((i6 & 32) != 0) {
                i4 = 0;
            } else {
                i4 = i;
            }
            if ((i6 & 64) != 0) {
                str9 = null;
            } else {
                str9 = str6;
            }
            if ((i6 & 128) != 0) {
                i5 = 0;
            } else {
                i5 = i2;
            }
            if ((i6 & 256) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i6 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
                str10 = null;
            } else {
                str10 = str7;
            }
            return bVar.mo57276c(str, str2, str3, str4, str8, i4, str9, i5, z2, str10);
        }

        /* renamed from: a */
        public final GraphFragment mo57274a(String str, String str2, double d, String str3, String str4, String str5, int i, String str6, int i2, boolean z, String str7) {
            String str8 = str;
            vx2.m53591g(str8, PublicResolver.FUNC_NAME);
            String str9 = str2;
            vx2.m53591g(str9, "symbol");
            return mo57275b(str8, str9, d, str3, (String) null, (String) null, str4, str5, i, str6, i2, z, str7);
        }

        /* renamed from: b */
        public final GraphFragment mo57275b(String str, String str2, double d, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, boolean z, String str9) {
            GraphFragment graphFragment = new GraphFragment();
            Bundle bundle = new Bundle();
            String str10 = str;
            bundle.putString("NAME", str);
            String str11 = str2;
            bundle.putString("SYMBOL", str2);
            double d2 = d;
            bundle.putDouble("BALANCE", d);
            String str12 = str3;
            bundle.putString("CMCID", str3);
            String str13 = str4;
            bundle.putString("STARTDATE", str4);
            String str14 = str5;
            bundle.putString("INTERVAL", str5);
            String str15 = str6;
            bundle.putString("SLUG", str6);
            String str16 = str7;
            bundle.putString("CONTRACT_ADDRESS", str7);
            int i3 = i;
            bundle.putInt("DEFAULT_VIEW", i);
            bundle.putString("ARG_ICON_URL", str8);
            bundle.putBoolean("ARG_SHOW_DEXSCREENER", z);
            bundle.putInt("ARG_ICON_RESID", i2);
            bundle.putString("ARG_DEXSCREENER_URL", str9);
            graphFragment.setArguments(bundle);
            return graphFragment;
        }

        /* renamed from: c */
        public final GraphFragment mo57276c(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, boolean z, String str7) {
            String str8 = str;
            vx2.m53591g(str8, PublicResolver.FUNC_NAME);
            String str9 = str2;
            vx2.m53591g(str9, "symbol");
            String str10 = str3;
            vx2.m53591g(str10, "cmcId");
            String str11 = str4;
            vx2.m53591g(str11, "slug");
            return mo57275b(str8, str9, -1.0d, str10, (String) null, (String) null, str11, str5, i, str6, i2, z, str7);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GraphFragment$c;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Z", "isDaily", "<init>", "(Lnet/safemoon/androidwallet/dialogs/GraphFragment;Z)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.GraphFragment$c */
    /* compiled from: GraphFragment.kt */
    public final class C8305c extends ValueFormatter {

        /* renamed from: a */
        public final boolean f41777a;

        public C8305c(boolean z) {
            this.f41777a = z;
        }

        public String getAxisLabel(float f, AxisBase axisBase) {
            if (!this.f41777a && axisBase != null) {
                axisBase.setLabelCount(4);
            }
            if (this.f41777a) {
                String format = new SimpleDateFormat("MMMdd", Locale.getDefault()).format(new Date((long) f));
                vx2.m53590f(format, "{\n                Simple….toLong()))\n            }");
                return format;
            }
            String format2 = new SimpleDateFormat("hh:mmaa", Locale.getDefault()).format(new Date((long) f));
            vx2.m53590f(format2, "SimpleDateFormat(DATE_FO…mat(Date(value.toLong()))");
            return format2;
        }
    }

    public GraphFragment() {
        pc2 pc2 = GraphFragment$graphViewModel$2.INSTANCE;
        this.f41767o1 = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(GraphViewModel.class), new GraphFragment$special$$inlined$activityViewModels$default$1(this), new GraphFragment$special$$inlined$activityViewModels$default$2((pc2) null, this), pc2 == null ? new GraphFragment$special$$inlined$activityViewModels$default$3(this) : pc2);
        this.f41768p1 = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MyTokensListViewModel.class), new GraphFragment$special$$inlined$activityViewModels$default$4(this), new GraphFragment$special$$inlined$activityViewModels$default$5((pc2) null, this), new GraphFragment$myTokenListViewModel$2(this));
        this.f41769q1 = C6169a.m47232a(new GraphFragment$tokenInfoExistProvider$2(this));
        this.f41771s1 = C6169a.m47232a(new GraphFragment$defaultIntervalViewLiveData$2(this));
        this.f41772t1 = new k04<>();
    }

    /* renamed from: D0 */
    public static final void m66099D0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        graphFragment.f41761Y = "7d";
        String e0 = graphFragment.mo57259e0(2, -6);
        vx2.m53588d(e0);
        graphFragment.f41760X = e0;
        vx2.m53590f(view, "it");
        graphFragment.mo57272y0(view);
        String str = graphFragment.f41760X;
        String str2 = null;
        if (str == null) {
            vx2.m53605u("startDate");
            str = null;
        }
        String str3 = graphFragment.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
        } else {
            str2 = str3;
        }
        graphFragment.mo57257c0(str, str2);
    }

    /* renamed from: E0 */
    public static final void m66101E0(qi2 qi2, GraphFragment graphFragment, CompoundButton compoundButton, boolean z) {
        Window window;
        vx2.m53591g(qi2, "$this_apply");
        vx2.m53591g(graphFragment, "this$0");
        Dialog n = graphFragment.mo22269n();
        if (n != null && (window = n.getWindow()) != null) {
            if (z) {
                window.setLayout(-1, -1);
                FragmentActivity activity = graphFragment.getActivity();
                if (activity != null) {
                    activity.setRequestedOrientation(2);
                }
                graphFragment.mo57271x0();
                return;
            }
            graphFragment.mo57273z0();
            FragmentActivity activity2 = graphFragment.getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
            }
            window.setLayout(-1, -2);
        }
    }

    /* renamed from: F0 */
    public static final void m66103F0(GraphFragment graphFragment, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(graphFragment, "this$0");
        String str = graphFragment.f41760X;
        String str2 = null;
        if (str == null) {
            vx2.m53605u("startDate");
            str = null;
        }
        String str3 = graphFragment.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
        } else {
            str2 = str3;
        }
        graphFragment.mo57257c0(str, str2);
        graphFragment.mo57249O0();
    }

    /* renamed from: G0 */
    public static final void m66105G0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        graphFragment.mo22266k();
    }

    /* renamed from: H0 */
    public static final void m66107H0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        graphFragment.f41761Y = "1h";
        String e0 = graphFragment.mo57259e0(10, -12);
        vx2.m53588d(e0);
        graphFragment.f41760X = e0;
        vx2.m53590f(view, "it");
        graphFragment.mo57272y0(view);
        String str = graphFragment.f41760X;
        String str2 = null;
        if (str == null) {
            vx2.m53605u("startDate");
            str = null;
        }
        String str3 = graphFragment.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
        } else {
            str2 = str3;
        }
        graphFragment.mo57257c0(str, str2);
    }

    /* renamed from: I0 */
    public static final void m66109I0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        graphFragment.f41761Y = "1h";
        String e0 = graphFragment.mo57259e0(10, -24);
        vx2.m53588d(e0);
        graphFragment.f41760X = e0;
        vx2.m53590f(view, "it");
        graphFragment.mo57272y0(view);
        String str = graphFragment.f41760X;
        String str2 = null;
        if (str == null) {
            vx2.m53605u("startDate");
            str = null;
        }
        String str3 = graphFragment.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
        } else {
            str2 = str3;
        }
        graphFragment.mo57257c0(str, str2);
    }

    /* renamed from: J0 */
    public static final void m66111J0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        graphFragment.f41761Y = "4h";
        String e0 = graphFragment.mo57259e0(4, -1);
        vx2.m53588d(e0);
        graphFragment.f41760X = e0;
        vx2.m53590f(view, "it");
        graphFragment.mo57272y0(view);
        String str = graphFragment.f41760X;
        String str2 = null;
        if (str == null) {
            vx2.m53605u("startDate");
            str = null;
        }
        String str3 = graphFragment.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
        } else {
            str2 = str3;
        }
        graphFragment.mo57257c0(str, str2);
    }

    /* renamed from: K0 */
    public static final void m66113K0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        graphFragment.f41761Y = "1d";
        String e0 = graphFragment.mo57259e0(2, -1);
        vx2.m53588d(e0);
        graphFragment.f41760X = e0;
        vx2.m53590f(view, "it");
        graphFragment.mo57272y0(view);
        String str = graphFragment.f41760X;
        String str2 = null;
        if (str == null) {
            vx2.m53605u("startDate");
            str = null;
        }
        String str3 = graphFragment.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
        } else {
            str2 = str3;
        }
        graphFragment.mo57257c0(str, str2);
    }

    /* renamed from: L0 */
    public static final void m66115L0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        graphFragment.f41761Y = "3d";
        String e0 = graphFragment.mo57259e0(2, -3);
        vx2.m53588d(e0);
        graphFragment.f41760X = e0;
        vx2.m53590f(view, "it");
        graphFragment.mo57272y0(view);
        String str = graphFragment.f41760X;
        String str2 = null;
        if (str == null) {
            vx2.m53605u("startDate");
            str = null;
        }
        String str3 = graphFragment.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
        } else {
            str2 = str3;
        }
        graphFragment.mo57257c0(str, str2);
    }

    /* renamed from: m0 */
    public static final void m66125m0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m66126o0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m66127p0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m66128q0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m66129r0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m66130s0(View view) {
        if (view != null) {
            view.performClick();
        }
    }

    /* renamed from: t0 */
    public static final void m66131t0(GraphFragment graphFragment, View view) {
        vx2.m53591g(graphFragment, "this$0");
        String value = graphFragment.f41772t1.getValue();
        if (value != null) {
            Common common = Common.f42577a;
            Context requireContext = graphFragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            common.mo60917x(requireContext, "https://coinmarketcap.com/currencies/" + value);
        }
    }

    /* renamed from: A0 */
    public final void mo57244A0() {
        qi2 qi2 = this.f41765e1;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        CandleStickChart candleStickChart = qi2.f33123j;
        candleStickChart.setNoDataText(getString(R.string.chart_loading));
        candleStickChart.setDrawBorders(false);
        candleStickChart.getDescription().setEnabled(false);
        candleStickChart.getXAxis().setEnabled(true);
        candleStickChart.getAxisRight().setEnabled(false);
        candleStickChart.setClipValuesToContent(true);
        candleStickChart.setTouchEnabled(true);
        candleStickChart.getLegend().setEnabled(false);
        candleStickChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
    }

    /* renamed from: B0 */
    public final void mo57245B0() {
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        LineChart lineChart = qi2.f33131r;
        lineChart.setTouchEnabled(true);
        lineChart.setDrawBorders(false);
        lineChart.setNoDataText(getString(R.string.chart_loading));
        LineGraphMarkerView lineGraphMarkerView = new LineGraphMarkerView(requireContext(), R.layout.marker_graph_view, mo57261g0());
        qi2 qi23 = this.f41765e1;
        if (qi23 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi23;
        }
        lineGraphMarkerView.setChartView(qi22.f33131r);
        lineChart.setMarker(lineGraphMarkerView);
        lineChart.getLegend().setEnabled(false);
        lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        lineChart.getXAxis().setTextColor(lineChart.getResources().getColor(R.color.t1));
        lineChart.getAxisLeft().setTextColor(lineChart.getResources().getColor(R.color.t1));
    }

    /* renamed from: C0 */
    public final void mo57246C0() {
        qi2 qi2 = this.f41765e1;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        qi2.f33126m.setOnClickListener(new yi2(this));
        qi2.f33117d.setPaintFlags(8);
        qi2.f33117d.setOnClickListener(new zi2(this));
        qi2.f33118e.setPaintFlags(8);
        qi2.f33118e.setOnClickListener(new aj2(this));
        qi2.f33120g.setPaintFlags(8);
        qi2.f33120g.setOnClickListener(new bj2(this));
        qi2.f33119f.setPaintFlags(8);
        qi2.f33119f.setOnClickListener(new cj2(this));
        qi2.f33121h.setPaintFlags(8);
        qi2.f33121h.setOnClickListener(new dj2(this));
        qi2.f33122i.setPaintFlags(8);
        qi2.f33122i.setOnClickListener(new ej2(this));
        qi2.f33125l.setOnCheckedChangeListener(new fj2(qi2, this));
        qi2.f33124k.setOnCheckedChangeListener(new gj2(this));
        AppCompatButton appCompatButton = qi2.f33117d;
        vx2.m53590f(appCompatButton, "btn12Hours");
        mo57272y0(appCompatButton);
    }

    /* renamed from: M0 */
    public final void mo57247M0(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, GraphFragment.class.getCanonicalName());
    }

    /* renamed from: N0 */
    public final void mo57248N0() {
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        qi2.f33123j.setVisibility(4);
        qi2 qi23 = this.f41765e1;
        if (qi23 == null) {
            vx2.m53605u("binding");
            qi23 = null;
        }
        qi23.f33131r.setVisibility(4);
        qi2 qi24 = this.f41765e1;
        if (qi24 == null) {
            vx2.m53605u("binding");
            qi24 = null;
        }
        qi24.f33113D.setVisibility(0);
        qi2 qi25 = this.f41765e1;
        if (qi25 == null) {
            vx2.m53605u("binding");
            qi25 = null;
        }
        qi25.f33124k.setVisibility(8);
        qi2 qi26 = this.f41765e1;
        if (qi26 == null) {
            vx2.m53605u("binding");
            qi26 = null;
        }
        qi26.f33135v.setVisibility(8);
        qi2 qi27 = this.f41765e1;
        if (qi27 == null) {
            vx2.m53605u("binding");
            qi27 = null;
        }
        qi27.f33136w.setVisibility(8);
        qi2 qi28 = this.f41765e1;
        if (qi28 == null) {
            vx2.m53605u("binding");
            qi28 = null;
        }
        qi28.f33117d.setVisibility(8);
        qi2 qi29 = this.f41765e1;
        if (qi29 == null) {
            vx2.m53605u("binding");
            qi29 = null;
        }
        qi29.f33118e.setVisibility(8);
        qi2 qi210 = this.f41765e1;
        if (qi210 == null) {
            vx2.m53605u("binding");
            qi210 = null;
        }
        qi210.f33120g.setVisibility(8);
        qi2 qi211 = this.f41765e1;
        if (qi211 == null) {
            vx2.m53605u("binding");
            qi211 = null;
        }
        qi211.f33119f.setVisibility(8);
        qi2 qi212 = this.f41765e1;
        if (qi212 == null) {
            vx2.m53605u("binding");
            qi212 = null;
        }
        qi212.f33121h.setVisibility(8);
        qi2 qi213 = this.f41765e1;
        if (qi213 == null) {
            vx2.m53605u("binding");
            qi213 = null;
        }
        qi213.f33122i.setVisibility(8);
        qi2 qi214 = this.f41765e1;
        if (qi214 == null) {
            vx2.m53605u("binding");
            qi214 = null;
        }
        qi214.f33110A.setVisibility(8);
        String string = requireArguments().getString("ARG_ICON_URL", "");
        int i = requireArguments().getInt("ARG_ICON_RESID", 0);
        qi2 qi215 = this.f41765e1;
        if (qi215 == null) {
            vx2.m53605u("binding");
            qi215 = null;
        }
        ImageView imageView = qi215.f33128o;
        vx2.m53590f(imageView, "binding.ivDialog");
        String str = this.f41758Q;
        if (str == null) {
            vx2.m53605u("symbol");
            str = null;
        }
        ol0.m70336P(imageView, i, string, str);
        qi2 qi216 = this.f41765e1;
        if (qi216 == null) {
            vx2.m53605u("binding");
            qi216 = null;
        }
        qi216.f33113D.getSettings().setJavaScriptEnabled(true);
        qi2 qi217 = this.f41765e1;
        if (qi217 == null) {
            vx2.m53605u("binding");
            qi217 = null;
        }
        qi217.f33113D.getSettings().setDatabaseEnabled(true);
        qi2 qi218 = this.f41765e1;
        if (qi218 == null) {
            vx2.m53605u("binding");
            qi218 = null;
        }
        qi218.f33113D.getSettings().setDomStorageEnabled(true);
        qi2 qi219 = this.f41765e1;
        if (qi219 == null) {
            vx2.m53605u("binding");
            qi219 = null;
        }
        qi219.f33113D.getSettings().setSupportZoom(true);
        qi2 qi220 = this.f41765e1;
        if (qi220 == null) {
            vx2.m53605u("binding");
            qi220 = null;
        }
        qi220.f33113D.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        qi2 qi221 = this.f41765e1;
        if (qi221 == null) {
            vx2.m53605u("binding");
            qi221 = null;
        }
        qi221.f33113D.getSettings().setBuiltInZoomControls(true);
        qi2 qi222 = this.f41765e1;
        if (qi222 == null) {
            vx2.m53605u("binding");
            qi222 = null;
        }
        qi222.f33113D.getSettings().setGeolocationEnabled(true);
        qi2 qi223 = this.f41765e1;
        if (qi223 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi223;
        }
        qi22.f33113D.loadUrl(mo57254Z());
    }

    /* renamed from: O0 */
    public final void mo57249O0() {
        int i;
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        if (qi2.f33124k.isChecked()) {
            mo57264j0();
        } else {
            mo57265k0();
        }
        qi2 qi23 = this.f41765e1;
        if (qi23 == null) {
            vx2.m53605u("binding");
            qi23 = null;
        }
        CandleStickChart candleStickChart = qi23.f33123j;
        qi2 qi24 = this.f41765e1;
        if (qi24 == null) {
            vx2.m53605u("binding");
            qi24 = null;
        }
        int i2 = 0;
        if (qi24.f33124k.isChecked()) {
            i = 0;
        } else {
            i = 4;
        }
        candleStickChart.setVisibility(i);
        qi2 qi25 = this.f41765e1;
        if (qi25 == null) {
            vx2.m53605u("binding");
            qi25 = null;
        }
        LineChart lineChart = qi25.f33131r;
        qi2 qi26 = this.f41765e1;
        if (qi26 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi26;
        }
        if (qi22.f33124k.isChecked()) {
            i2 = 4;
        }
        lineChart.setVisibility(i2);
    }

    /* renamed from: V */
    public final String mo57250V() {
        return (String) this.f41762Z.getValue();
    }

    /* renamed from: W */
    public final String mo57251W() {
        return (String) this.f41766k0.getValue();
    }

    /* renamed from: X */
    public final String mo57252X() {
        return (String) this.f41764e0.getValue();
    }

    /* renamed from: Y */
    public final k04<View> mo57253Y() {
        return (k04) this.f41771s1.getValue();
    }

    /* renamed from: Z */
    public final String mo57254Z() {
        String string = requireArguments().getString("ARG_DEXSCREENER_URL", "");
        return string + "?embed=1&theme=dark&trades=0&info=0";
    }

    /* renamed from: a0 */
    public final String mo57255a0() {
        String format = hj2.f38222a.format(Calendar.getInstance().getTime());
        vx2.m53590f(format, "FORMAT_SIMPLE_DATE.format(timeNow.time)");
        return format;
    }

    /* renamed from: b0 */
    public final GraphViewModel mo57256b0() {
        return (GraphViewModel) this.f41767o1.getValue();
    }

    /* renamed from: c0 */
    public final void mo57257c0(String str, String str2) {
        String str3;
        String str4;
        String str5;
        if (this.f41758Q == null) {
            vx2.m53605u("symbol");
        }
        if (str != null && str2 != null) {
            if (vx2.m53586b(str2, "1h")) {
                str3 = "hourly";
            } else {
                str3 = "daily";
            }
            this.f41761Y = str2;
            this.f41763b1 = yb6.m74344y(str3, "daily", true);
            qi2 qi2 = this.f41765e1;
            if (qi2 == null) {
                vx2.m53605u("binding");
                qi2 = null;
            }
            if (qi2.f33124k.isChecked()) {
                mo57269v0();
                qi2 qi22 = this.f41765e1;
                if (qi22 == null) {
                    vx2.m53605u("binding");
                    qi22 = null;
                }
                qi22.f33123j.setNoDataText(getString(R.string.chart_loading));
                GraphViewModel b0 = mo57256b0();
                String str6 = this.f41758Q;
                if (str6 == null) {
                    vx2.m53605u("symbol");
                    str5 = null;
                } else {
                    str5 = str6;
                }
                b0.mo61216f(str5, mo57250V(), str, mo57255a0(), str3);
                return;
            }
            mo57270w0();
            qi2 qi23 = this.f41765e1;
            if (qi23 == null) {
                vx2.m53605u("binding");
                qi23 = null;
            }
            qi23.f33131r.setNoDataText(getString(R.string.chart_loading));
            GraphViewModel b02 = mo57256b0();
            String str7 = this.f41758Q;
            if (str7 == null) {
                vx2.m53605u("symbol");
                str4 = null;
            } else {
                str4 = str7;
            }
            b02.mo61217g(str4, mo57250V(), str, mo57255a0(), str2);
        }
    }

    /* renamed from: d0 */
    public final void mo57258d0() {
        boolean z;
        String X = mo57252X();
        vx2.m53590f(X, "tokenAddress");
        boolean z2 = true;
        if (X.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TokenType.C8246a aVar = TokenType.Companion;
            String str = this.f41758Q;
            if (str == null) {
                vx2.m53605u("symbol");
                str = null;
            }
            X = aVar.mo57098a(str).getWrapAddress();
        }
        if (X != null) {
            if (X.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                mo57256b0().mo61218h(X);
            }
        }
    }

    /* renamed from: e0 */
    public final String mo57259e0(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.add(i, i2);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.add(12, -(instance.get(12) % 10));
        return hj2.f38222a.format(instance.getTime());
    }

    /* renamed from: f0 */
    public final TokenInfoExistProvider mo57260f0() {
        return (TokenInfoExistProvider) this.f41769q1.getValue();
    }

    /* renamed from: g0 */
    public final String mo57261g0() {
        return (String) this.f41773v0.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: qi2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57262h0(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.mo57263i0()
            java.lang.String r1 = "symbol"
            java.lang.String r2 = "binding"
            r3 = 0
            if (r0 == 0) goto L_0x003e
            android.os.Bundle r7 = r6.requireArguments()
            java.lang.String r0 = "ARG_ICON_URL"
            java.lang.String r4 = ""
            java.lang.String r7 = r7.getString(r0, r4)
            android.os.Bundle r0 = r6.requireArguments()
            r4 = 0
            java.lang.String r5 = "ARG_ICON_RESID"
            int r0 = r0.getInt(r5, r4)
            qi2 r4 = r6.f41765e1
            if (r4 != 0) goto L_0x002a
            p000.vx2.m53605u(r2)
            r4 = r3
        L_0x002a:
            android.widget.ImageView r2 = r4.f33128o
            java.lang.String r4 = "binding.ivDialog"
            p000.vx2.m53590f(r2, r4)
            java.lang.String r4 = r6.f41758Q
            if (r4 != 0) goto L_0x0039
            p000.vx2.m53605u(r1)
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            p000.ol0.m70336P(r2, r0, r7, r3)
            goto L_0x0072
        L_0x003e:
            qi2 r0 = r6.f41765e1
            if (r0 != 0) goto L_0x0046
            p000.vx2.m53605u(r2)
            r0 = r3
        L_0x0046:
            android.widget.ImageView r0 = r0.f33128o
            me5 r0 = com.bumptech.glide.C1710a.m12225u(r0)
            java.lang.String r4 = r6.f41758Q
            if (r4 != 0) goto L_0x0054
            p000.vx2.m53605u(r1)
            r4 = r3
        L_0x0054:
            java.lang.Object r7 = p000.C9384u3.m72567h(r7, r4)
            be5 r7 = r0.mo23163x(r7)
            qe5 r0 = p000.qe5.m25623x0()
            be5 r7 = r7.mo11567a(r0)
            qi2 r0 = r6.f41765e1
            if (r0 != 0) goto L_0x006c
            p000.vx2.m53605u(r2)
            goto L_0x006d
        L_0x006c:
            r3 = r0
        L_0x006d:
            android.widget.ImageView r0 = r3.f33128o
            r7.mo11553K0(r0)
        L_0x0072:
            r6.mo57249O0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.GraphFragment.mo57262h0(int):void");
    }

    /* renamed from: i0 */
    public final boolean mo57263i0() {
        String str = this.f41758Q;
        if (str == null) {
            vx2.m53605u("symbol");
            str = null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        switch (lowerCase.hashCode()) {
            case -2095018025:
                if (!lowerCase.equals("aquagoat")) {
                    return false;
                }
                return true;
            case 97686:
                if (!lowerCase.equals("bnb")) {
                    return false;
                }
                return true;
            case 113786:
                if (lowerCase.equals("sfm")) {
                    return true;
                }
                return false;
            case 1765043214:
                if (!lowerCase.equals("safemoon")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j0 */
    public final void mo57264j0() {
        List<CoinPriceStatsDataQuoteList> list;
        boolean z;
        int i;
        CoinPriceStatsData data;
        CoinPriceStats value = mo57256b0().mo61213c().getValue();
        if (value == null || (data = value.getData()) == null) {
            list = null;
        } else {
            list = data.getQuote();
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                double openValue = (double) list.get(0).getQuote().getUsd().getOpenValue();
                double closeValue = (double) list.get(list.size() - 1).getQuote().getUsd().getCloseValue();
                rz1.C9291a aVar = rz1.f44501a;
                String t = ol0.m70378t(aVar.mo65772b());
                qi2 qi2 = this.f41765e1;
                if (qi2 == null) {
                    vx2.m53605u("binding");
                    qi2 = null;
                }
                TextView textView = qi2.f33112C;
                cb6 cb6 = cb6.f21669a;
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[2];
                objArr[0] = aVar.mo65772b();
                Object[] objArr2 = objArr;
                objArr2[1] = ol0.m70374p(closeValue, 2, (RoundingMode) null, false, 6, (Object) null);
                String format = String.format(locale, t, Arrays.copyOf(objArr2, 2));
                vx2.m53590f(format, "format(locale, format, *args)");
                textView.setText(format);
                double d = ((closeValue - openValue) / openValue) * ((double) 100);
                qi2 qi22 = this.f41765e1;
                if (qi22 == null) {
                    vx2.m53605u("binding");
                    qi22 = null;
                }
                qi22.f33110A.setText(ol0.m70371m(d) + "%");
                if (d < Utils.DOUBLE_EPSILON) {
                    i = R.drawable.arrow_down;
                } else {
                    i = R.drawable.arrow_up;
                }
                qi2 qi23 = this.f41765e1;
                if (qi23 == null) {
                    vx2.m53605u("binding");
                    qi23 = null;
                }
                be5<Drawable> w = C1710a.m12225u(qi23.f33115b).mo23162w(Integer.valueOf(i));
                qi2 qi24 = this.f41765e1;
                if (qi24 == null) {
                    vx2.m53605u("binding");
                    qi24 = null;
                }
                w.mo11553K0(qi24.f33115b);
            } catch (Exception e) {
                String localizedMessage = e.getLocalizedMessage();
                vx2.m53590f(localizedMessage, "e.localizedMessage");
                ol0.m70350b0(localizedMessage, "GraphPercentage");
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (CoinPriceStatsDataQuoteList quote : list) {
                int i3 = i2 + 1;
                try {
                    CoinPriceStatsUsd usd = quote.getQuote().getUsd();
                    arrayList.add(new CandleEntry((float) i2, usd.getHighValue(), usd.getLowValue(), usd.getOpenValue(), usd.getCloseValue()));
                } catch (Exception e2) {
                    String localizedMessage2 = e2.getLocalizedMessage();
                    vx2.m53590f(localizedMessage2, "E.localizedMessage");
                    String simpleName = GraphFragment.class.getSimpleName();
                    vx2.m53590f(simpleName, "this::class.java.simpleName");
                    ol0.m70350b0(localizedMessage2, simpleName);
                }
                i2 = i3;
            }
            String str = this.f41757P;
            if (str == null) {
                vx2.m53605u("tokenName");
                str = null;
            }
            CandleDataSet candleDataSet = new CandleDataSet(arrayList, str);
            Boolean value2 = mo57256b0().mo61219i().getValue();
            if (value2 == null) {
                value2 = Boolean.FALSE;
            }
            vx2.m53590f(value2, "graphViewModel.isDecimal…CandleData.value ?: false");
            candleDataSet.setDrawValues(value2.booleanValue());
            candleDataSet.setColor(Color.rgb(80, 80, 80));
            candleDataSet.setShadowColor(zr0.m31440c(requireContext(), R.color.black));
            candleDataSet.setShadowWidth(1.0f);
            candleDataSet.setDecreasingColor(zr0.m31440c(requireContext(), R.color.candle_red));
            candleDataSet.setDecreasingPaintStyle(Paint.Style.FILL_AND_STROKE);
            candleDataSet.setIncreasingColor(zr0.m31440c(requireContext(), R.color.candle_green));
            candleDataSet.setIncreasingPaintStyle(Paint.Style.FILL_AND_STROKE);
            candleDataSet.setNeutralColor(-3355444);
            candleDataSet.setShowCandleBar(true);
            qi2 qi25 = this.f41765e1;
            if (qi25 == null) {
                vx2.m53605u("binding");
                qi25 = null;
            }
            CandleStickChart candleStickChart = qi25.f33123j;
            CandleGraphMarkerView candleGraphMarkerView = new CandleGraphMarkerView(requireContext(), R.layout.marker_graph_view, list, mo57261g0());
            qi2 qi26 = this.f41765e1;
            if (qi26 == null) {
                vx2.m53605u("binding");
                qi26 = null;
            }
            candleGraphMarkerView.setChartView(qi26.f33123j);
            candleStickChart.setMarker(candleGraphMarkerView);
            candleStickChart.getXAxis().setValueFormatter(new C8303a(this, this.f41763b1, list));
            candleStickChart.getXAxis().setTextColor(candleStickChart.getResources().getColor(R.color.t1));
            candleStickChart.getAxisLeft().setTextColor(candleStickChart.getResources().getColor(R.color.t1));
            candleStickChart.setData(new CandleData(candleDataSet));
            candleStickChart.invalidate();
        }
    }

    /* renamed from: k0 */
    public final void mo57265k0() {
        List<HistoricalDatum> list;
        int i;
        Data data;
        HistoricalList value = mo57256b0().mo61214d().getValue();
        qi2 qi2 = null;
        if (value == null || (data = value.getData()) == null) {
            list = null;
        } else {
            list = data.getQuotes();
        }
        if (list != null) {
            try {
                Double price = list.get(0).getQuote().getUSD().getPrice();
                Double price2 = list.get(list.size() - 1).getQuote().getUSD().getPrice();
                rz1.C9291a aVar = rz1.f44501a;
                String t = ol0.m70378t(aVar.mo65772b());
                qi2 qi22 = this.f41765e1;
                if (qi22 == null) {
                    vx2.m53605u("binding");
                    qi22 = null;
                }
                TextView textView = qi22.f33112C;
                cb6 cb6 = cb6.f21669a;
                Locale locale = Locale.getDefault();
                vx2.m53590f(price2, "latest");
                String format = String.format(locale, t, Arrays.copyOf(new Object[]{aVar.mo65772b(), ol0.m70374p(price2.doubleValue(), 2, (RoundingMode) null, false, 6, (Object) null)}, 2));
                vx2.m53590f(format, "format(locale, format, *args)");
                textView.setText(format);
                double doubleValue = price2.doubleValue();
                vx2.m53590f(price, "old");
                double doubleValue2 = ((doubleValue - price.doubleValue()) / price.doubleValue()) * ((double) 100);
                qi2 qi23 = this.f41765e1;
                if (qi23 == null) {
                    vx2.m53605u("binding");
                    qi23 = null;
                }
                qi23.f33110A.setText(ol0.m70371m(doubleValue2) + "%");
                if (doubleValue2 < Utils.DOUBLE_EPSILON) {
                    i = R.drawable.arrow_down;
                } else {
                    i = R.drawable.arrow_up;
                }
                qi2 qi24 = this.f41765e1;
                if (qi24 == null) {
                    vx2.m53605u("binding");
                    qi24 = null;
                }
                be5<Drawable> w = C1710a.m12225u(qi24.f33115b).mo23162w(Integer.valueOf(i));
                qi2 qi25 = this.f41765e1;
                if (qi25 == null) {
                    vx2.m53605u("binding");
                    qi25 = null;
                }
                w.mo11553K0(qi25.f33115b);
            } catch (Exception e) {
                String localizedMessage = e.getLocalizedMessage();
                vx2.m53590f(localizedMessage, "e.localizedMessage");
                ol0.m70350b0(localizedMessage, "GraphPercentage");
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    USDT usd = list.get(i2).getQuote().getUSD();
                    n21 n21 = n21.f41027a;
                    String timestamp = usd.getTimestamp();
                    vx2.m53590f(timestamp, "usdt.timestamp");
                    arrayList.add(new Entry((float) n21.mo56350b(timestamp), (float) usd.getPrice().doubleValue()));
                } catch (Exception unused) {
                }
            }
            String str = this.f41757P;
            if (str == null) {
                vx2.m53605u("tokenName");
                str = null;
            }
            LineDataSet lineDataSet = new LineDataSet(arrayList, str);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setColor(zr0.m31440c(requireContext(), R.color.curve_green));
            Boolean value2 = mo57256b0().mo61220j().getValue();
            if (value2 == null) {
                value2 = Boolean.FALSE;
            }
            vx2.m53590f(value2, "graphViewModel.isDecimal…orLineData.value ?: false");
            lineDataSet.setDrawValues(value2.booleanValue());
            LineData lineData = new LineData(lineDataSet);
            qi2 qi26 = this.f41765e1;
            if (qi26 == null) {
                vx2.m53605u("binding");
                qi26 = null;
            }
            LineChart lineChart = qi26.f33131r;
            lineChart.clear();
            lineChart.setClipValuesToContent(true);
            lineChart.setData(lineData);
            lineChart.getDescription().setEnabled(false);
            lineChart.getXAxis().setEnabled(true);
            lineChart.getAxisRight().setEnabled(false);
            lineChart.getXAxis().setValueFormatter(new C8305c(this.f41763b1));
            qi2 qi27 = this.f41765e1;
            if (qi27 == null) {
                vx2.m53605u("binding");
            } else {
                qi2 = qi27;
            }
            qi2.f33131r.notifyDataSetChanged();
        }
    }

    /* renamed from: l0 */
    public final void mo57266l0() {
        mo57256b0().mo61215e().observe(getViewLifecycleOwner(), new si2(new GraphFragment$observePriceByAddress$1(this)));
    }

    /* renamed from: n0 */
    public final void mo57267n0() {
        mo57256b0().mo61213c().observe(getViewLifecycleOwner(), new ti2(new GraphFragment$observeViewModel$1(this)));
        mo57256b0().mo61214d().observe(getViewLifecycleOwner(), new ui2(new GraphFragment$observeViewModel$2(this)));
        mo57256b0().mo61220j().observe(getViewLifecycleOwner(), new vi2(new GraphFragment$observeViewModel$3(this)));
        mo57256b0().mo61219i().observe(getViewLifecycleOwner(), new wi2(new GraphFragment$observeViewModel$4(this)));
        pi3.m71013a(mo57253Y(), this, new xi2());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        vx2.m53591g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo22279v(0, 2132017641);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("NAME");
        vx2.m53588d(string);
        this.f41757P = string;
        String string2 = requireArguments.getString("SYMBOL");
        vx2.m53588d(string2);
        this.f41758Q = string2;
        this.f41759U = requireArguments.getDouble("BALANCE");
        String string3 = requireArguments.getString("STARTDATE", (String) null);
        if (string3 == null) {
            string3 = mo57259e0(10, -12);
            vx2.m53588d(string3);
        } else {
            vx2.m53590f(string3, "it.getString(ARG_STARTDA…HOUR, HOUR_HALF_AMOUNT)!!");
        }
        this.f41760X = string3;
        String string4 = requireArguments.getString("INTERVAL", (String) null);
        if (string4 == null) {
            string4 = "1h";
        } else {
            vx2.m53590f(string4, "it.getString(ARG_INTERVAL, null) ?: INTERVAL_1H");
        }
        this.f41761Y = string4;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.graph_dialog, viewGroup, false);
        this.f41770r1 = inflate;
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Integer num;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        qi2 a = qi2.m50600a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41765e1 = a;
        mo57246C0();
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        TextView textView = qi2.f33139z;
        String str = this.f41757P;
        if (str == null) {
            vx2.m53605u("tokenName");
            str = null;
        }
        textView.setText(str);
        double d = this.f41759U;
        if (d == -1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (d > 1.0d) {
                qi2 qi23 = this.f41765e1;
                if (qi23 == null) {
                    vx2.m53605u("binding");
                    qi23 = null;
                }
                TextView textView2 = qi23.f33137x;
                vx2.m53590f(textView2, "binding.tvBalanceDialog");
                ol0.m70338R(textView2, this.f41759U, 2);
            } else {
                qi2 qi24 = this.f41765e1;
                if (qi24 == null) {
                    vx2.m53605u("binding");
                    qi24 = null;
                }
                TextView textView3 = qi24.f33137x;
                vx2.m53590f(textView3, "binding.tvBalanceDialog");
                ol0.m70337Q(textView3, this.f41759U);
            }
            qi2 qi25 = this.f41765e1;
            if (qi25 == null) {
                vx2.m53605u("binding");
                qi25 = null;
            }
            qi25.f33137x.setVisibility(0);
        } else {
            qi2 qi26 = this.f41765e1;
            if (qi26 == null) {
                vx2.m53605u("binding");
                qi26 = null;
            }
            qi26.f33137x.setVisibility(8);
        }
        if (requireArguments().getBoolean("ARG_SHOW_DEXSCREENER", false)) {
            mo57248N0();
            mo57273z0();
            mo57266l0();
            mo57258d0();
            return;
        }
        mo57244A0();
        mo57245B0();
        mo57267n0();
        String str2 = this.f41760X;
        if (str2 == null) {
            vx2.m53605u("startDate");
            str2 = null;
        }
        String str3 = this.f41761Y;
        if (str3 == null) {
            vx2.m53605u("interval");
            str3 = null;
        }
        mo57257c0(str2, str3);
        mo57273z0();
        if (mo57251W() == null) {
            TokenInfoExistProvider f0 = mo57260f0();
            String V = mo57250V();
            if (V != null) {
                num = xb6.m73916n(V);
            } else {
                num = null;
            }
            f0.mo60712e(num, this.f41772t1);
        } else {
            this.f41772t1.postValue(mo57251W());
        }
        qi2 qi27 = this.f41765e1;
        if (qi27 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi27;
        }
        qi22.f33136w.setOnClickListener(new ri2(this));
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        Window window = p.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = p.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        return p;
    }

    /* renamed from: u0 */
    public final void mo57268u0(boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        ImageView imageView = qi2.f33128o;
        if (imageView != null) {
            if (z) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            imageView.setVisibility(i6);
        }
        qi2 qi23 = this.f41765e1;
        if (qi23 == null) {
            vx2.m53605u("binding");
            qi23 = null;
        }
        ImageView imageView2 = qi23.f33115b;
        if (imageView2 != null) {
            if (z) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            imageView2.setVisibility(i5);
        }
        qi2 qi24 = this.f41765e1;
        if (qi24 == null) {
            vx2.m53605u("binding");
            qi24 = null;
        }
        TextView textView = qi24.f33139z;
        if (textView != null) {
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            textView.setVisibility(i4);
        }
        qi2 qi25 = this.f41765e1;
        if (qi25 == null) {
            vx2.m53605u("binding");
            qi25 = null;
        }
        TextView textView2 = qi25.f33112C;
        if (textView2 != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView2.setVisibility(i3);
        }
        qi2 qi26 = this.f41765e1;
        if (qi26 == null) {
            vx2.m53605u("binding");
            qi26 = null;
        }
        TextView textView3 = qi26.f33137x;
        if (textView3 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView3.setVisibility(i2);
        }
        qi2 qi27 = this.f41765e1;
        if (qi27 == null) {
            vx2.m53605u("binding");
            qi27 = null;
        }
        TextView textView4 = qi27.f33110A;
        if (textView4 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView4.setVisibility(i);
        }
        if (this.f41759U == -1.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            qi2 qi28 = this.f41765e1;
            if (qi28 == null) {
                vx2.m53605u("binding");
            } else {
                qi22 = qi28;
            }
            qi22.f33137x.setVisibility(0);
            return;
        }
        qi2 qi29 = this.f41765e1;
        if (qi29 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi29;
        }
        qi22.f33137x.setVisibility(8);
    }

    /* renamed from: v0 */
    public final void mo57269v0() {
        qi2 qi2 = this.f41765e1;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        CandleStickChart candleStickChart = qi2.f33123j;
        candleStickChart.setNoDataText(getString(R.string.chart_no_data));
        candleStickChart.fitScreen();
        CandleData candleData = (CandleData) candleStickChart.getData();
        if (candleData != null) {
            candleData.clearValues();
        }
        candleStickChart.notifyDataSetChanged();
        candleStickChart.clear();
        candleStickChart.invalidate();
    }

    /* renamed from: w0 */
    public final void mo57270w0() {
        qi2 qi2 = this.f41765e1;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        LineChart lineChart = qi2.f33131r;
        lineChart.setNoDataText(getString(R.string.chart_no_data));
        lineChart.setData(null);
        lineChart.fitScreen();
        LineData lineData = (LineData) lineChart.getData();
        if (lineData != null) {
            lineData.clearValues();
        }
        lineChart.notifyDataSetChanged();
        lineChart.clear();
        lineChart.invalidate();
    }

    /* renamed from: x0 */
    public final void mo57271x0() {
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        if (qi2.f33110A.getVisibility() == 8) {
            qi2 qi23 = this.f41765e1;
            if (qi23 == null) {
                vx2.m53605u("binding");
                qi23 = null;
            }
            qi23.f33110A.setVisibility(4);
        }
        qi2 qi24 = this.f41765e1;
        if (qi24 == null) {
            vx2.m53605u("binding");
            qi24 = null;
        }
        ViewGroup.LayoutParams layoutParams = qi24.f33131r.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = 0;
        }
        qi2 qi25 = this.f41765e1;
        if (qi25 == null) {
            vx2.m53605u("binding");
            qi25 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = qi25.f33123j.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = 0;
        }
        qi2 qi26 = this.f41765e1;
        if (qi26 == null) {
            vx2.m53605u("binding");
            qi26 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = qi26.f33113D.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = 0;
        }
        qi2 qi27 = this.f41765e1;
        if (qi27 == null) {
            vx2.m53605u("binding");
            qi27 = null;
        }
        qi27.f33131r.requestLayout();
        qi2 qi28 = this.f41765e1;
        if (qi28 == null) {
            vx2.m53605u("binding");
            qi28 = null;
        }
        qi28.f33123j.requestLayout();
        qi2 qi29 = this.f41765e1;
        if (qi29 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi29;
        }
        qi22.f33113D.requestLayout();
    }

    /* renamed from: y0 */
    public final void mo57272y0(View view) {
        Button[] buttonArr = new Button[6];
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        AppCompatButton appCompatButton = qi2.f33117d;
        vx2.m53590f(appCompatButton, "binding.btn12Hours");
        buttonArr[0] = appCompatButton;
        qi2 qi23 = this.f41765e1;
        if (qi23 == null) {
            vx2.m53605u("binding");
            qi23 = null;
        }
        AppCompatButton appCompatButton2 = qi23.f33118e;
        vx2.m53590f(appCompatButton2, "binding.btn1Day");
        buttonArr[1] = appCompatButton2;
        qi2 qi24 = this.f41765e1;
        if (qi24 == null) {
            vx2.m53605u("binding");
            qi24 = null;
        }
        AppCompatButton appCompatButton3 = qi24.f33120g;
        vx2.m53590f(appCompatButton3, "binding.btn1Week");
        buttonArr[2] = appCompatButton3;
        qi2 qi25 = this.f41765e1;
        if (qi25 == null) {
            vx2.m53605u("binding");
            qi25 = null;
        }
        AppCompatButton appCompatButton4 = qi25.f33119f;
        vx2.m53590f(appCompatButton4, "binding.btn1Month");
        buttonArr[3] = appCompatButton4;
        qi2 qi26 = this.f41765e1;
        if (qi26 == null) {
            vx2.m53605u("binding");
            qi26 = null;
        }
        AppCompatButton appCompatButton5 = qi26.f33121h;
        vx2.m53590f(appCompatButton5, "binding.btn3Months");
        buttonArr[4] = appCompatButton5;
        qi2 qi27 = this.f41765e1;
        if (qi27 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi27;
        }
        AppCompatButton appCompatButton6 = qi22.f33122i;
        vx2.m53590f(appCompatButton6, "binding.btn6Months");
        buttonArr[5] = appCompatButton6;
        ArrayList f = ck0.m33058f(buttonArr);
        ArrayList<Button> arrayList = new ArrayList<>();
        for (Object next : f) {
            if (!vx2.m53586b(view, (Button) next)) {
                arrayList.add(next);
            }
        }
        for (Button button : arrayList) {
            button.setPaintFlags(button.getPaintFlags() & -9);
        }
        vx2.m53589e(view, "null cannot be cast to non-null type android.widget.Button");
        ((Button) view).setPaintFlags(8);
    }

    /* renamed from: z0 */
    public final void mo57273z0() {
        Float f;
        Float f2;
        Integer num;
        Integer num2;
        Integer num3;
        Resources resources;
        Resources resources2;
        qi2 qi2 = this.f41765e1;
        qi2 qi22 = null;
        if (qi2 == null) {
            vx2.m53605u("binding");
            qi2 = null;
        }
        if (qi2.f33110A.getVisibility() == 4) {
            qi2 qi23 = this.f41765e1;
            if (qi23 == null) {
                vx2.m53605u("binding");
                qi23 = null;
            }
            qi23.f33110A.setVisibility(8);
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (resources2 = activity.getResources()) == null) {
            f = null;
        } else {
            f = Float.valueOf(resources2.getDimension(R.dimen.my_250dp));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (resources = activity2.getResources()) == null) {
            f2 = null;
        } else {
            f2 = Float.valueOf(resources.getDimension(R.dimen._350sdp));
        }
        qi2 qi24 = this.f41765e1;
        if (qi24 == null) {
            vx2.m53605u("binding");
            qi24 = null;
        }
        ViewGroup.LayoutParams layoutParams = qi24.f33131r.getLayoutParams();
        if (layoutParams != null) {
            if (f != null) {
                num3 = Integer.valueOf((int) f.floatValue());
            } else {
                num3 = null;
            }
            layoutParams.height = num3.intValue();
        }
        qi2 qi25 = this.f41765e1;
        if (qi25 == null) {
            vx2.m53605u("binding");
            qi25 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = qi25.f33123j.getLayoutParams();
        if (layoutParams2 != null) {
            if (f != null) {
                num2 = Integer.valueOf((int) f.floatValue());
            } else {
                num2 = null;
            }
            layoutParams2.height = num2.intValue();
        }
        qi2 qi26 = this.f41765e1;
        if (qi26 == null) {
            vx2.m53605u("binding");
            qi26 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = qi26.f33113D.getLayoutParams();
        if (layoutParams3 != null) {
            if (f2 != null) {
                num = Integer.valueOf((int) f2.floatValue());
            } else {
                num = null;
            }
            layoutParams3.height = num.intValue();
        }
        qi2 qi27 = this.f41765e1;
        if (qi27 == null) {
            vx2.m53605u("binding");
            qi27 = null;
        }
        qi27.f33131r.requestLayout();
        qi2 qi28 = this.f41765e1;
        if (qi28 == null) {
            vx2.m53605u("binding");
            qi28 = null;
        }
        qi28.f33123j.requestLayout();
        qi2 qi29 = this.f41765e1;
        if (qi29 == null) {
            vx2.m53605u("binding");
        } else {
            qi22 = qi29;
        }
        qi22.f33113D.requestLayout();
    }
}
