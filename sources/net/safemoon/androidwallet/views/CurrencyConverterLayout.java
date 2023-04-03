package net.safemoon.androidwallet.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.Lifecycle;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108B\u001b\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b7\u0010;B#\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b7\u0010>J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u0016\u001a\u00020\u00052\u0016\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u0014\u0010\u0019\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017J\b\u0010\u001a\u001a\u00020\u0005H\u0002R\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010)R&\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u0006?"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/CurrencyConverterLayout;", "Landroid/widget/FrameLayout;", "Lug3;", "Landroidx/lifecycle/f;", "getLifecycle", "Lr37;", "onAttachedToWindow", "onDetachedFromWindow", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "item", "setOtherSideItem", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "o", "Lnet/safemoon/androidwallet/views/editText/autoSize/AutofitEdittext;", "getEditText", "getSelectedItem", "roomFiat", "setItem", "fiat", "Lkotlin/Function1;", "", "fiatItemCallBack", "m", "Lkotlin/Function0;", "selectFiatCallBack", "n", "i", "a", "Landroidx/lifecycle/f;", "lifecycleRegistry", "Lft2;", "d", "Lef3;", "getBinding", "()Lft2;", "binding", "Lxn2;", "e", "Lxn2;", "iFiatTokenDataSource", "g", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "selectedFiat", "", "k", "Ljava/util/List;", "allFiats", "r", "otherSideFiat", "s", "Lrc2;", "x", "Lpc2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CurrencyConverterLayout.kt */
public final class CurrencyConverterLayout extends FrameLayout implements ug3 {

    /* renamed from: a */
    public final C0716f f43215a;

    /* renamed from: d */
    public final ef3 f43216d;

    /* renamed from: e */
    public final xn2 f43217e;

    /* renamed from: g */
    public RoomFiat f43218g;

    /* renamed from: k */
    public List<RoomFiat> f43219k;

    /* renamed from: r */
    public RoomFiat f43220r;

    /* renamed from: s */
    public rc2<? super RoomFiat, Boolean> f43221s;

    /* renamed from: x */
    public pc2<r37> f43222x;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CurrencyConverterLayout$a */
    /* compiled from: Comparisons.kt */
    public static final class C8936a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((RoomFiat) t).getSymbol(), ((RoomFiat) t2).getSymbol());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CurrencyConverterLayout(Context context) {
        this(context, (AttributeSet) null);
        vx2.m53591g(context, "context");
    }

    private final ft2 getBinding() {
        return (ft2) this.f43216d.getValue();
    }

    /* renamed from: j */
    public static final void m69478j(CurrencyConverterLayout currencyConverterLayout, View view) {
        vx2.m53591g(currencyConverterLayout, "this$0");
        pc2<r37> pc2 = currencyConverterLayout.f43222x;
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: k */
    public static final void m69479k(CurrencyConverterLayout currencyConverterLayout, List list) {
        Object obj;
        vx2.m53591g(currencyConverterLayout, "this$0");
        if (list != null && currencyConverterLayout.f43218g != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                RoomFiat roomFiat = currencyConverterLayout.f43218g;
                vx2.m53588d(roomFiat);
                if (vx2.m53586b(roomFiat.getSymbol(), ((RoomFiat) obj).getSymbol())) {
                    break;
                }
            }
            RoomFiat roomFiat2 = (RoomFiat) obj;
            currencyConverterLayout.f43218g = roomFiat2;
            if (roomFiat2 != null) {
                currencyConverterLayout.setItem(roomFiat2);
            }
        }
    }

    /* renamed from: l */
    public static final void m69480l(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: p */
    public static final void m69481p(CurrencyConverterLayout currencyConverterLayout, RoomFiat roomFiat, View view) {
        vx2.m53591g(currencyConverterLayout, "this$0");
        vx2.m53591g(roomFiat, "$fiat");
        if (currencyConverterLayout.f43219k.indexOf(roomFiat) >= 0) {
            currencyConverterLayout.f43218g = roomFiat;
            rc2<? super RoomFiat, Boolean> rc2 = currencyConverterLayout.f43221s;
            boolean z = true;
            if (rc2 == null || !rc2.invoke(roomFiat).booleanValue()) {
                z = false;
            }
            if (z) {
                currencyConverterLayout.setItem(roomFiat);
            }
        }
    }

    public final AutofitEdittext getEditText() {
        AutofitEdittext autofitEdittext = getBinding().f28963g;
        vx2.m53590f(autofitEdittext, "binding.txtValue");
        return autofitEdittext;
    }

    public final RoomFiat getSelectedItem() {
        return this.f43218g;
    }

    /* renamed from: i */
    public final void mo62082i() {
        ft2 binding = getBinding();
        binding.f28961e.setOnClickListener(new ix0(this));
        AutofitEdittext editText = getEditText();
        AppCompatImageView appCompatImageView = binding.f28960d;
        vx2.m53590f(appCompatImageView, "ivCopy");
        tc7.m72260m(editText, appCompatImageView);
        AutofitEdittext editText2 = getEditText();
        ImageView imageView = binding.f28959c;
        vx2.m53590f(imageView, "ivClear");
        tc7.m72259l(editText2, imageView);
        pi3.m71013a(this.f43217e.mo50428a(), this, new jx0(this));
        this.f43217e.mo50428a().observe(this, new kx0(new CurrencyConverterLayout$attachView$1$3(this, binding)));
    }

    /* renamed from: m */
    public final void mo62083m(rc2<? super RoomFiat, Boolean> rc2) {
        this.f43221s = rc2;
    }

    /* renamed from: n */
    public final void mo62084n(pc2<r37> pc2) {
        vx2.m53591g(pc2, "selectFiatCallBack");
        this.f43222x = pc2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (p000.yb6.m74344y(r3, r4.getSymbol(), true) == false) goto L_0x0067;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62085o(net.safemoon.androidwallet.model.fiat.room.RoomFiat r11) {
        /*
            r10 = this;
            java.lang.String r0 = "item"
            p000.vx2.m53591g(r11, r0)
            r10.f43220r = r11
            ft2 r11 = r10.getBinding()
            java.util.List<net.safemoon.androidwallet.model.fiat.room.RoomFiat> r0 = r10.f43219k
            net.safemoon.androidwallet.views.CurrencyConverterLayout$a r1 = new net.safemoon.androidwallet.views.CurrencyConverterLayout$a
            r1.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47304D0(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r0.next()
            r4 = r2
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r4 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r4
            net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$a r5 = net.safemoon.androidwallet.viewmodels.SelectFiatViewModel.f42813e
            java.util.List r5 = r5.mo61382a()
            java.util.Iterator r5 = r5.iterator()
        L_0x0037:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0050
            java.lang.Object r6 = r5.next()
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r4.getSymbol()
            boolean r8 = p000.yb6.m74344y(r8, r9, r7)
            if (r8 == 0) goto L_0x0037
            goto L_0x0051
        L_0x0050:
            r6 = r3
        L_0x0051:
            if (r6 == 0) goto L_0x0066
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r5 = r10.f43220r
            if (r5 == 0) goto L_0x005b
            java.lang.String r3 = r5.getSymbol()
        L_0x005b:
            java.lang.String r4 = r4.getSymbol()
            boolean r3 = p000.yb6.m74344y(r3, r4, r7)
            if (r3 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r7 = 0
        L_0x0067:
            if (r7 == 0) goto L_0x001f
            r1.add(r2)
            goto L_0x001f
        L_0x006d:
            android.widget.LinearLayout r0 = r11.f28958b
            r0.removeAllViews()
            java.util.Iterator r0 = r1.iterator()
        L_0x0076:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ae
            java.lang.Object r1 = r0.next()
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r1 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r1
            android.content.Context r2 = r10.getContext()
            r4 = 2131558726(0x7f0d0146, float:1.8742776E38)
            android.view.View r2 = android.view.View.inflate(r2, r4, r3)
            a36 r2 = p000.a36.m31661a(r2)
            com.google.android.material.button.MaterialButton r4 = r2.f20799b
            lx0 r5 = new lx0
            r5.<init>(r10, r1)
            r4.setOnClickListener(r5)
            com.google.android.material.button.MaterialButton r4 = r2.f20799b
            java.lang.String r1 = r1.getSymbol()
            r4.setText(r1)
            android.widget.LinearLayout r1 = r11.f28958b
            com.google.android.material.button.MaterialButton r2 = r2.mo28803b()
            r1.addView(r2)
            goto L_0x0076
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.views.CurrencyConverterLayout.mo62085o(net.safemoon.androidwallet.model.fiat.room.RoomFiat):void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43215a.mo6395o(Lifecycle.State.RESUMED);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43215a.mo6395o(Lifecycle.State.DESTROYED);
    }

    public final void setItem(RoomFiat roomFiat) {
        vx2.m53591g(roomFiat, "roomFiat");
        this.f43218g = roomFiat;
        ft2 binding = getBinding();
        binding.f28962f.setText(roomFiat.getSymbol());
        binding.f28961e.setText(roomFiat.getName());
    }

    public final void setOtherSideItem(Fiat fiat) {
        vx2.m53591g(fiat, "item");
        this.f43220r = new RoomFiat(fiat);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CurrencyConverterLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        vx2.m53591g(context, "context");
    }

    public C0716f getLifecycle() {
        return this.f43215a;
    }

    public final void setOtherSideItem(RoomFiat roomFiat) {
        vx2.m53591g(roomFiat, "item");
        this.f43220r = roomFiat;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurrencyConverterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        this.f43215a = new C0716f(this);
        this.f43216d = C6169a.m47232a(new CurrencyConverterLayout$binding$2(this));
        c02 c02 = c02.f37027a;
        Context context2 = getContext();
        vx2.m53590f(context2, "context");
        this.f43217e = c02.mo50769b(context2);
        this.f43219k = ck0.m33062j();
        context.obtainStyledAttributes(attributeSet, y55.CurrencyConverterLayout, i, 0).recycle();
        View.inflate(context, R.layout.include_currency_converter_layout, this);
        mo62082i();
    }

    public final void setItem(Fiat fiat) {
        vx2.m53591g(fiat, "fiat");
        this.f43218g = new RoomFiat(fiat);
        ft2 binding = getBinding();
        binding.f28962f.setText(fiat.getSymbol());
        binding.f28961e.setText(fiat.getName());
    }
}
