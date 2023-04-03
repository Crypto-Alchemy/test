package net.safemoon.androidwallet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\b&\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002-.B#\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\u0004\b+\u0010,J\b\u0010\u0005\u001a\u00020\u0004H&J\u0014\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010*\u001a\u0004\u0018\u00010\u00148BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)¨\u0006/"}, mo44877d2 = {"Lnet/safemoon/androidwallet/adapter/TransactionAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "Lnet/safemoon/androidwallet/adapter/TransactionAdapter$b;", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "o", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "it", "Lr37;", "j", "Landroid/view/ViewGroup;", "parent", "", "viewType", "q", "holder", "position", "p", "resId", "", "l", "contractAddress", "n", "timeStamp", "Ljava/util/Date;", "m", "Landroid/content/Context;", "g", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "k", "Lrc2;", "onClick", "", "r", "Ljava/util/List;", "allTokens", "s", "Lef3;", "()Ljava/lang/String;", "address", "<init>", "(Landroid/content/Context;Lrc2;)V", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransactionAdapter.kt */
public abstract class TransactionAdapter extends PagingDataAdapter<Result, C8232b> {

    /* renamed from: g */
    public final Context f41566g;

    /* renamed from: k */
    public final rc2<Result, r37> f41567k;

    /* renamed from: r */
    public final List<IToken> f41568r = new ArrayList();

    /* renamed from: s */
    public final ef3 f41569s = C6169a.m47232a(new TransactionAdapter$address$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/adapter/TransactionAdapter$a;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.adapter.TransactionAdapter$a */
    /* compiled from: TransactionAdapter.kt */
    public static final class C8231a extends C1294g.C1300f<Result> {
        /* renamed from: a */
        public boolean areContentsTheSame(Result result, Result result2) {
            vx2.m53591g(result, "oldItem");
            vx2.m53591g(result2, "newItem");
            return vx2.m53586b(result.toString(), result2.toString());
        }

        /* renamed from: b */
        public boolean areItemsTheSame(Result result, Result result2) {
            vx2.m53591g(result, "oldItem");
            vx2.m53591g(result2, "newItem");
            return vx2.m53586b(result.toString(), result2.toString());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/adapter/TransactionAdapter$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "result", "", "position", "Lr37;", "c", "Ljava/util/Date;", "currentTimeStamp", "f", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "ivStatus", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "tvName", "tvAmount", "d", "tvFromTo", "Landroid/view/ViewGroup;", "e", "Landroid/view/ViewGroup;", "groupHeader", "groupFooter", "g", "txtTimeStamp", "Landroid/view/View;", "itemView", "<init>", "(Lnet/safemoon/androidwallet/adapter/TransactionAdapter;Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.adapter.TransactionAdapter$b */
    /* compiled from: TransactionAdapter.kt */
    public final class C8232b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final ImageView f41570a;

        /* renamed from: b */
        public final TextView f41571b;

        /* renamed from: c */
        public final TextView f41572c;

        /* renamed from: d */
        public final TextView f41573d;

        /* renamed from: e */
        public final ViewGroup f41574e;

        /* renamed from: f */
        public final ViewGroup f41575f;

        /* renamed from: g */
        public final TextView f41576g;

        /* renamed from: h */
        public final /* synthetic */ TransactionAdapter f41577h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8232b(TransactionAdapter transactionAdapter, View view) {
            super(view);
            vx2.m53591g(view, "itemView");
            this.f41577h = transactionAdapter;
            View findViewById = view.findViewById(R.id.iv_status);
            vx2.m53590f(findViewById, "itemView.findViewById(R.id.iv_status)");
            this.f41570a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.iv_tran_name);
            vx2.m53590f(findViewById2, "itemView.findViewById(R.id.iv_tran_name)");
            this.f41571b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_amount);
            vx2.m53590f(findViewById3, "itemView.findViewById(R.id.tv_amount)");
            this.f41572c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tv_to_from);
            vx2.m53590f(findViewById4, "itemView.findViewById(R.id.tv_to_from)");
            this.f41573d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.groupHeader);
            vx2.m53590f(findViewById5, "itemView.findViewById(R.id.groupHeader)");
            this.f41574e = (ViewGroup) findViewById5;
            View findViewById6 = view.findViewById(R.id.groupFooter);
            vx2.m53590f(findViewById6, "itemView.findViewById(R.id.groupFooter)");
            this.f41575f = (ViewGroup) findViewById6;
            View findViewById7 = view.findViewById(R.id.txtTimeStamp);
            vx2.m53590f(findViewById7, "itemView.findViewById(R.id.txtTimeStamp)");
            this.f41576g = (TextView) findViewById7;
        }

        /* renamed from: d */
        public static final void m65706d(TransactionAdapter transactionAdapter, Result result, View view) {
            vx2.m53591g(transactionAdapter, "this$0");
            vx2.m53591g(result, "$it");
            transactionAdapter.f41567k.invoke(result);
        }

        /* renamed from: e */
        public static final void m65707e(TransactionAdapter transactionAdapter, Result result, View view) {
            vx2.m53591g(transactionAdapter, "this$0");
            vx2.m53591g(result, "$it");
            transactionAdapter.f41567k.invoke(result);
        }

        /* renamed from: c */
        public final void mo57023c(Result result, int i) {
            Result result2;
            Result result3;
            IToken iToken;
            String str;
            String str2;
            int i2;
            int i3;
            String str3;
            String str4;
            int i4;
            int i5;
            Result result4 = result;
            this.f41574e.setVisibility(8);
            this.f41575f.setVisibility(8);
            if (result4 != null) {
                TransactionAdapter transactionAdapter = this.f41577h;
                int i6 = i - 1;
                if (i6 >= 0) {
                    result2 = TransactionAdapter.m65692h(transactionAdapter, i6);
                } else {
                    result2 = null;
                }
                boolean z = true;
                int i7 = i + 1;
                if (i7 < transactionAdapter.getItemCount()) {
                    result3 = TransactionAdapter.m65692h(transactionAdapter, i7);
                } else {
                    result3 = null;
                }
                String str5 = result4.timeStamp;
                vx2.m53590f(str5, "current.timeStamp");
                Date m = transactionAdapter.mo57016m(str5);
                mo57024f(m);
                if (result2 == null) {
                    this.f41574e.setVisibility(0);
                    if (result3 != null) {
                        String str6 = result3.timeStamp;
                        vx2.m53590f(str6, "next.timeStamp");
                        if (vx2.m53586b(transactionAdapter.mo57016m(str6), m)) {
                            this.f41575f.setVisibility(8);
                        } else {
                            this.f41575f.setVisibility(0);
                        }
                    }
                }
                if (result3 == null) {
                    this.f41575f.setVisibility(0);
                    if (result2 != null) {
                        String str7 = result2.timeStamp;
                        vx2.m53590f(str7, "previous.timeStamp");
                        if (vx2.m53586b(transactionAdapter.mo57016m(str7), m)) {
                            this.f41574e.setVisibility(8);
                        } else {
                            this.f41574e.setVisibility(0);
                        }
                    }
                }
                if (!(result2 == null || result3 == null)) {
                    String str8 = result2.timeStamp;
                    vx2.m53590f(str8, "previous.timeStamp");
                    Date m2 = transactionAdapter.mo57016m(str8);
                    String str9 = result3.timeStamp;
                    vx2.m53590f(str9, "next.timeStamp");
                    Date m3 = transactionAdapter.mo57016m(str9);
                    if (vx2.m53586b(m2, m)) {
                        this.f41574e.setVisibility(8);
                    } else {
                        this.f41574e.setVisibility(0);
                    }
                    if (vx2.m53586b(m3, m)) {
                        this.f41575f.setVisibility(8);
                    } else {
                        this.f41575f.setVisibility(0);
                    }
                }
                String str10 = result4.txreceiptStatus;
                String str11 = "0";
                if (vx2.m53586b(str10, "1")) {
                    this.f41570a.setColorFilter(zr0.m31440c(transactionAdapter.f41566g, R.color.green));
                } else if (vx2.m53586b(str10, str11)) {
                    this.f41570a.setColorFilter(zr0.m31440c(transactionAdapter.f41566g, R.color.red));
                } else {
                    this.f41570a.setColorFilter(zr0.m31440c(transactionAdapter.f41566g, R.color.yellow));
                }
                if (result4.offlinePending) {
                    this.f41572c.setText(result4.value + " " + result4.tokenSymbol);
                    String str12 = result4.from;
                    vx2.m53590f(str12, "it.from");
                    Locale locale = Locale.ROOT;
                    String lowerCase = str12.toLowerCase(locale);
                    vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String str13 = result4.f42485to;
                    vx2.m53590f(str13, "it.to");
                    String lowerCase2 = str13.toLowerCase(locale);
                    vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (yb6.m74344y(lowerCase, lowerCase2, true)) {
                        this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_self));
                        this.f41573d.setText("");
                    } else {
                        String f = transactionAdapter.mo57014k();
                        if (f != null) {
                            str4 = f.toLowerCase(locale);
                            vx2.m53590f(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str4 = null;
                        }
                        String str14 = result4.f42485to;
                        vx2.m53590f(str14, "it.to");
                        String lowerCase3 = str14.toLowerCase(locale);
                        vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (vx2.m53586b(str4, lowerCase3)) {
                            this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_received));
                            this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_from) + " " + result4.from);
                            TextView textView = this.f41573d;
                            if (!result4.from.equals("-")) {
                                i5 = 0;
                            } else {
                                i5 = 8;
                            }
                            textView.setVisibility(i5);
                        } else {
                            this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_sent));
                            this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_to) + " " + result4.f42485to);
                            TextView textView2 = this.f41573d;
                            if (!result4.f42485to.equals("-")) {
                                i4 = 0;
                            } else {
                                i4 = 8;
                            }
                            textView2.setVisibility(i4);
                        }
                    }
                    this.itemView.setOnClickListener(new rt6(transactionAdapter, result4));
                    return;
                }
                String str15 = result4.contractAddress;
                if (str15 != null) {
                    vx2.m53590f(str15, "it.contractAddress");
                    iToken = transactionAdapter.mo57017n(str15);
                } else {
                    iToken = null;
                }
                if (iToken == null) {
                    iToken = transactionAdapter.mo57018o().toToken();
                }
                if (iToken != null) {
                    TokenType b = TokenType.Companion.mo57099b(iToken.getChainId());
                    if (b == TokenType.SOLANA || b == TokenType.MULTI_COIN_BITCOIN || b == TokenType.MULTI_COIN_DOGE) {
                        String str16 = result4.from;
                        vx2.m53590f(str16, "it.from");
                        Locale locale2 = Locale.ROOT;
                        String lowerCase4 = str16.toLowerCase(locale2);
                        vx2.m53590f(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String str17 = result4.f42485to;
                        vx2.m53590f(str17, "it.to");
                        String lowerCase5 = str17.toLowerCase(locale2);
                        vx2.m53590f(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (yb6.m74344y(lowerCase4, lowerCase5, true)) {
                            this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_self));
                            this.f41573d.setText("");
                        } else {
                            String f2 = transactionAdapter.mo57014k();
                            if (f2 != null) {
                                str2 = f2.toLowerCase(locale2);
                                vx2.m53590f(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            } else {
                                str2 = null;
                            }
                            String str18 = result4.f42485to;
                            vx2.m53590f(str18, "it.to");
                            String lowerCase6 = str18.toLowerCase(locale2);
                            vx2.m53590f(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (vx2.m53586b(str2, lowerCase6)) {
                                this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_received));
                                this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_from) + " " + result4.from);
                                TextView textView3 = this.f41573d;
                                if (!result4.from.equals("-")) {
                                    i3 = 0;
                                } else {
                                    i3 = 8;
                                }
                                textView3.setVisibility(i3);
                            } else {
                                this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_sent));
                                this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_to) + result4.f42485to);
                                TextView textView4 = this.f41573d;
                                if (!result4.f42485to.equals("-")) {
                                    i2 = 0;
                                } else {
                                    i2 = 8;
                                }
                                textView4.setVisibility(i2);
                            }
                        }
                    } else if (b.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                        String str19 = result4.from;
                        vx2.m53590f(str19, "it.from");
                        Locale locale3 = Locale.ROOT;
                        String lowerCase7 = str19.toLowerCase(locale3);
                        vx2.m53590f(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String str20 = result4.f42485to;
                        vx2.m53590f(str20, "it.to");
                        String lowerCase8 = str20.toLowerCase(locale3);
                        vx2.m53590f(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (yb6.m74344y(lowerCase7, lowerCase8, true)) {
                            this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_self));
                            this.f41573d.setText("");
                        } else {
                            String f3 = transactionAdapter.mo57014k();
                            if (f3 != null) {
                                str3 = f3.toLowerCase(locale3);
                                vx2.m53590f(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            } else {
                                str3 = null;
                            }
                            String str21 = result4.f42485to;
                            vx2.m53590f(str21, "it.to");
                            String lowerCase9 = str21.toLowerCase(locale3);
                            vx2.m53590f(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (vx2.m53586b(str3, lowerCase9)) {
                                this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_received));
                                this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_from) + " " + result4.from);
                            } else if (!vx2.m53586b(result4.input, "0x")) {
                                this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_smart_contract_call));
                                TextView textView5 = this.f41573d;
                                String l = transactionAdapter.mo57015l(R.string.tx_to);
                                String str22 = result4.f42485to;
                                if (str22.length() != 0) {
                                    z = false;
                                }
                                if (z) {
                                    str22 = result4.contractAddress;
                                }
                                textView5.setText(l + " " + str22);
                                String str23 = result4.value;
                                vx2.m53590f(str23, "it.value");
                                if (vx2.m53586b(new BigDecimal(str23), BigDecimal.ZERO)) {
                                    String str24 = result4.gasUsed;
                                    vx2.m53590f(str24, "it.gasUsed");
                                    BigInteger bigInteger = new BigInteger(str24);
                                    String str25 = result4.gasPrice;
                                    vx2.m53590f(str25, "it.gasPrice");
                                    BigInteger multiply = bigInteger.multiply(new BigInteger(str25));
                                    vx2.m53590f(multiply, "it.gasUsed.toBigInteger(….gasPrice.toBigInteger())");
                                    String p = ol0.m70374p(ol0.m70376r(multiply, 18).doubleValue(), 0, (RoundingMode) null, false, 6, (Object) null);
                                    this.f41572c.setText(p + " " + iToken.getSymbol());
                                }
                            } else {
                                this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_sent));
                                this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_to) + result4.f42485to);
                            }
                        }
                    }
                    TextView textView6 = this.f41572c;
                    String str26 = result4.value;
                    vx2.m53590f(str26, "it.value");
                    textView6.setText(ol0.m70374p(ol0.m70375q(str26, iToken.getDecimals()).doubleValue(), 0, (RoundingMode) null, false, 6, (Object) null) + " " + iToken.getSymbol());
                } else {
                    String str27 = result4.from;
                    vx2.m53590f(str27, "it.from");
                    Locale locale4 = Locale.ROOT;
                    String lowerCase10 = str27.toLowerCase(locale4);
                    vx2.m53590f(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String str28 = result4.f42485to;
                    vx2.m53590f(str28, "it.to");
                    String lowerCase11 = str28.toLowerCase(locale4);
                    vx2.m53590f(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (yb6.m74344y(lowerCase10, lowerCase11, true)) {
                        this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_self));
                        this.f41573d.setText("");
                    } else {
                        String f4 = transactionAdapter.mo57014k();
                        if (f4 != null) {
                            str = f4.toLowerCase(locale4);
                            vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str = null;
                        }
                        String str29 = result4.f42485to;
                        vx2.m53590f(str29, "it.to");
                        String lowerCase12 = str29.toLowerCase(locale4);
                        vx2.m53590f(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (vx2.m53586b(str, lowerCase12)) {
                            this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_received));
                            this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_from) + " " + result4.from);
                        } else {
                            this.f41571b.setText(transactionAdapter.mo57015l(R.string.tx_sent));
                            this.f41573d.setText(transactionAdapter.mo57015l(R.string.tx_to) + " " + result4.f42485to);
                        }
                    }
                    TextView textView7 = this.f41572c;
                    if (result4.tokenDecimal != null) {
                        String str30 = result4.value;
                        vx2.m53590f(str30, "it.value");
                        Integer num = result4.tokenDecimal;
                        vx2.m53590f(num, "it.tokenDecimal");
                        str11 = ol0.m70374p(ol0.m70375q(str30, num.intValue()).doubleValue(), 0, (RoundingMode) null, false, 6, (Object) null) + " " + result4.tokenSymbol;
                    }
                    textView7.setText(str11);
                }
                this.itemView.setOnClickListener(new st6(transactionAdapter, result4));
            }
        }

        /* renamed from: f */
        public final void mo57024f(Date date) {
            String str;
            SimpleDateFormat b = l21.f40561a.mo55805b(this.f41577h.f41566g);
            TextView textView = this.f41576g;
            if (vx2.m53586b(b.format(date), b.format(new Date()))) {
                str = this.f41577h.mo57015l(R.string.today);
            } else {
                str = b.format(date);
            }
            textView.setText(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionAdapter(Context context, rc2<? super Result, r37> rc2) {
        super(new C8231a(), (CoroutineDispatcher) null, (CoroutineDispatcher) null, 6, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
        vx2.m53591g(rc2, "onClick");
        this.f41566g = context;
        this.f41567k = rc2;
    }

    /* renamed from: h */
    public static final /* synthetic */ Result m65692h(TransactionAdapter transactionAdapter, int i) {
        return (Result) transactionAdapter.getItem(i);
    }

    /* renamed from: j */
    public final void mo57013j(List<? extends IToken> list) {
        vx2.m53591g(list, "it");
        this.f41568r.clear();
        this.f41568r.addAll(list);
    }

    /* renamed from: k */
    public final String mo57014k() {
        return (String) this.f41569s.getValue();
    }

    /* renamed from: l */
    public final String mo57015l(int i) {
        String string = this.f41566g.getString(i);
        vx2.m53590f(string, "context.getString(resId)");
        return string;
    }

    /* renamed from: m */
    public final Date mo57016m(String str) {
        vx2.m53591g(str, "timeStamp");
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(Long.parseLong(str) * 1000));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Date time = instance.getTime();
        vx2.m53590f(time, "getInstance().apply {\n  …LLISECOND, 0);\n    }.time");
        return time;
    }

    /* renamed from: n */
    public final IToken mo57017n(String str) {
        T t;
        vx2.m53591g(str, "contractAddress");
        Iterator<T> it = this.f41568r.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (vx2.m53586b(((IToken) t).getContractAddress(), str)) {
                break;
            }
        }
        return (IToken) t;
    }

    /* renamed from: o */
    public abstract UserTokenItemDisplayModel mo57018o();

    /* renamed from: p */
    public void onBindViewHolder(C8232b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo57023c((Result) getItem(i), i);
    }

    /* renamed from: q */
    public C8232b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_transaction, viewGroup, false);
        vx2.m53590f(inflate, "from(parent.context).inf…ansaction, parent, false)");
        return new C8232b(this, inflate);
    }
}
