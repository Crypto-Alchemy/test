package net.safemoon.androidwallet.fragments;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.creageek.segmentedbutton.SegmentedButton;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.imageview.ShapeableImageView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter;
import net.safemoon.androidwallet.dialogs.AnchorPopUpMyTokens;
import net.safemoon.androidwallet.fragments.CalculatorFragment$anchorFiatCurrency$2;
import net.safemoon.androidwallet.fragments.CalculatorFragment$defaultCurrencyAdapter$2;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel;
import net.safemoon.androidwallet.viewmodels.CalculatorViewModel;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002Z_\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bm\u0010nJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0014\u0010!\u001a\u00020\u001e8\u0002XD¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002XD¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002XD¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0002¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0002¢\u0006\f\n\u0004\bF\u0010*\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0002¢\u0006\f\n\u0004\bK\u0010*\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0002¢\u0006\f\n\u0004\bP\u0010*\u001a\u0004\bQ\u0010RR$\u0010Y\u001a\u0010\u0012\f\u0012\n V*\u0004\u0018\u00010U0U0T8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0002¢\u0006\f\n\u0004\b[\u0010*\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0002¢\u0006\f\n\u0004\b`\u0010*\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010k\u001a\u00020i8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010jR\u0014\u0010l\u001a\u00020i8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010j¨\u0006o"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/CalculatorFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/View$OnClickListener;", "Lr37;", "e0", "Z", "d0", "Landroid/view/View;", "v", "C0", "Ljava/math/BigDecimal;", "limit", "", "Y", "A0", "B0", "z0", "y0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "view", "onViewCreated", "onClick", "onPause", "", "k", "C", "DECIMAL_SYMBOL", "r", "GROUP_SYMBOL", "", "s", "Ljava/lang/String;", "DECIMAL_FORMAT", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel;", "x", "Lef3;", "j0", "()Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel;", "calculatorViewModel", "Le92;", "y", "Le92;", "binding", "Ljava/text/DecimalFormatSymbols;", "A", "Ljava/text/DecimalFormatSymbols;", "getOtherSymbols", "()Ljava/text/DecimalFormatSymbols;", "otherSymbols", "Lnet/safemoon/androidwallet/dialogs/AnchorPopUpMyTokens;", "B", "Lnet/safemoon/androidwallet/dialogs/AnchorPopUpMyTokens;", "anchorPopUpMyTokens", "Ltg;", "i0", "()Ltg;", "anchorMoneyBag", "Lnet/safemoon/androidwallet/dialogs/AnchorCurrencyConverter;", "H", "g0", "()Lnet/safemoon/androidwallet/dialogs/AnchorCurrencyConverter;", "anchorCurrencyConverter", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "I", "l0", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "L", "f0", "()Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "addNewTokensViewModel", "Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "M", "m0", "()Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "selectFiatViewModel", "Lk04;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "kotlin.jvm.PlatformType", "P", "Lk04;", "defaultFiat", "net/safemoon/androidwallet/fragments/CalculatorFragment$defaultCurrencyAdapter$2$a", "Q", "k0", "()Lnet/safemoon/androidwallet/fragments/CalculatorFragment$defaultCurrencyAdapter$2$a;", "defaultCurrencyAdapter", "net/safemoon/androidwallet/fragments/CalculatorFragment$anchorFiatCurrency$2$a", "U", "h0", "()Lnet/safemoon/androidwallet/fragments/CalculatorFragment$anchorFiatCurrency$2$a;", "anchorFiatCurrency", "Ljava/text/DecimalFormat;", "X", "Ljava/text/DecimalFormat;", "df", "willRenderCoin", "Landroid/view/View$OnLongClickListener;", "Landroid/view/View$OnLongClickListener;", "switchTokenListener", "onLongClickMoneyBagListener", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment extends BaseMainFragment implements View.OnClickListener {

    /* renamed from: A */
    public final DecimalFormatSymbols f41903A = new DecimalFormatSymbols(Locale.getDefault());

    /* renamed from: B */
    public AnchorPopUpMyTokens f41904B = new AnchorPopUpMyTokens();

    /* renamed from: C */
    public final ef3 f41905C = C6169a.m47232a(new CalculatorFragment$anchorMoneyBag$2(this));

    /* renamed from: H */
    public final ef3 f41906H = C6169a.m47232a(new CalculatorFragment$anchorCurrencyConverter$2(this));

    /* renamed from: I */
    public final ef3 f41907I = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new CalculatorFragment$special$$inlined$activityViewModels$default$4(this), new CalculatorFragment$special$$inlined$activityViewModels$default$5((pc2) null, this), new CalculatorFragment$special$$inlined$activityViewModels$default$6(this));

    /* renamed from: L */
    public final ef3 f41908L;

    /* renamed from: M */
    public final ef3 f41909M;

    /* renamed from: P */
    public k04<Fiat> f41910P;

    /* renamed from: Q */
    public final ef3 f41911Q;

    /* renamed from: U */
    public final ef3 f41912U;

    /* renamed from: X */
    public final DecimalFormat f41913X;

    /* renamed from: Y */
    public boolean f41914Y;

    /* renamed from: Z */
    public final View.OnLongClickListener f41915Z;

    /* renamed from: e0 */
    public final View.OnLongClickListener f41916e0;

    /* renamed from: k */
    public final char f41917k = '.';

    /* renamed from: r */
    public final char f41918r = ',';

    /* renamed from: s */
    public final String f41919s = "#,###.#####################";

    /* renamed from: x */
    public final ef3 f41920x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CalculatorViewModel.class), new CalculatorFragment$special$$inlined$activityViewModels$default$1(this), new CalculatorFragment$special$$inlined$activityViewModels$default$2((pc2) null, this), new CalculatorFragment$special$$inlined$activityViewModels$default$3(this));

    /* renamed from: y */
    public e92 f41921y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "run", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.CalculatorFragment$a */
    /* compiled from: View.kt */
    public static final class C8368a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f41922a;

        /* renamed from: d */
        public final /* synthetic */ CalculatorFragment f41923d;

        /* renamed from: e */
        public final /* synthetic */ e92 f41924e;

        public C8368a(View view, CalculatorFragment calculatorFragment, e92 e92) {
            this.f41922a = view;
            this.f41923d = calculatorFragment;
            this.f41924e = e92;
        }

        public final void run() {
            View q;
            View view = this.f41922a;
            Rect rect = new Rect();
            ho2 R = this.f41923d.mo58053m();
            if (!(R == null || (q = R.mo52270q()) == null)) {
                q.getLocalVisibleRect(rect);
            }
            ConstraintLayout constraintLayout = this.f41924e.f28469z;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.height = (rect.bottom - rect.top) - view.getHeight();
            constraintLayout.setLayoutParams(layoutParams);
        }
    }

    public CalculatorFragment() {
        CalculatorFragment$addNewTokensViewModel$2 calculatorFragment$addNewTokensViewModel$2 = new CalculatorFragment$addNewTokensViewModel$2(this);
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new CalculatorFragment$special$$inlined$viewModels$default$2(new CalculatorFragment$special$$inlined$viewModels$default$1(this)));
        this.f41908L = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(AddNewTokensViewModel.class), new CalculatorFragment$special$$inlined$viewModels$default$3(b), new CalculatorFragment$special$$inlined$viewModels$default$4((pc2) null, b), calculatorFragment$addNewTokensViewModel$2);
        this.f41909M = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SelectFiatViewModel.class), new CalculatorFragment$special$$inlined$activityViewModels$default$7(this), new CalculatorFragment$special$$inlined$activityViewModels$default$8((pc2) null, this), new CalculatorFragment$selectFiatViewModel$2(this));
        this.f41910P = new k04<>(rz1.f44501a.mo65771a());
        this.f41911Q = C6169a.m47232a(new CalculatorFragment$defaultCurrencyAdapter$2(this));
        this.f41912U = C6169a.m47232a(new CalculatorFragment$anchorFiatCurrency$2(this));
        this.f41913X = new DecimalFormat("#,###.#####################");
        this.f41915Z = new q80(this);
        this.f41916e0 = new y80(this);
    }

    /* renamed from: D0 */
    public static final boolean m66469D0(CharSequence charSequence, CalculatorFragment calculatorFragment, ClipboardManager clipboardManager, MenuItem menuItem) {
        boolean z;
        vx2.m53591g(charSequence, "$pasteData");
        vx2.m53591g(calculatorFragment, "this$0");
        vx2.m53591g(clipboardManager, "$clipboard");
        vx2.m53591g(menuItem, "item");
        if (menuItem.getItemId() == R.id.item_paste) {
            try {
                Number parse = NumberFormat.getInstance().parse(charSequence.toString());
                CalculatorViewModel j0 = calculatorFragment.mo57452j0();
                vx2.m53588d(j0);
                BigDecimal valueOf = BigDecimal.valueOf(parse.doubleValue());
                vx2.m53590f(valueOf, "valueOf(number.toDouble())");
                j0.mo60995d(valueOf);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (menuItem.getItemId() == R.id.item_copy) {
            e92 e92 = calculatorFragment.f41921y;
            vx2.m53588d(e92);
            CharSequence text = e92.f28436D.getText();
            vx2.m53590f(text, "binding!!.e2.text");
            if (StringsKt__StringsKt.m63090V0(text).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                e92 e922 = calculatorFragment.f41921y;
                vx2.m53588d(e922);
                CharSequence text2 = e922.f28436D.getText();
                vx2.m53590f(text2, "binding!!.e2.text");
                clipboardManager.setPrimaryClip(ClipData.newPlainText("label", StringsKt__StringsKt.m63090V0(text2)));
            }
        }
        return false;
    }

    /* renamed from: E0 */
    public static final boolean m66471E0(CalculatorFragment calculatorFragment, View view) {
        ScrollView scrollView;
        vx2.m53591g(calculatorFragment, "this$0");
        AnchorPopUpMyTokens anchorPopUpMyTokens = calculatorFragment.f41904B;
        Context requireContext = calculatorFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "v");
        e92 e92 = calculatorFragment.f41921y;
        if (e92 != null) {
            scrollView = e92.mo42169b();
        } else {
            scrollView = null;
        }
        anchorPopUpMyTokens.mo57151f(requireContext, view, scrollView, new CalculatorFragment$switchTokenListener$1$1(calculatorFragment), calculatorFragment.mo57452j0().mo61011u().getValue(), new x80());
        return true;
    }

    /* renamed from: F0 */
    public static final void m66473F0() {
    }

    /* renamed from: a0 */
    public static final void m66492a0(CalculatorFragment calculatorFragment, View view) {
        vx2.m53591g(calculatorFragment, "this$0");
        AnchorCurrencyConverter g0 = calculatorFragment.mo57449g0();
        vx2.m53590f(view, "it");
        g0.mo57127C(view);
        calculatorFragment.mo57449g0().mo57134z(calculatorFragment.mo57455m0().mo61377l(""));
    }

    /* renamed from: b0 */
    public static final void m66493b0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m66494c0(CalculatorFragment calculatorFragment, View view) {
        vx2.m53591g(calculatorFragment, "this$0");
        CalculatorFragment$anchorFiatCurrency$2.C8371a h0 = calculatorFragment.mo57450h0();
        vx2.m53590f(view, "it");
        h0.mo56250g(view);
    }

    /* renamed from: n0 */
    public static final boolean m66495n0(CalculatorFragment calculatorFragment, View view) {
        ScrollView scrollView;
        vx2.m53591g(calculatorFragment, "this$0");
        C9356tg i0 = calculatorFragment.mo57451i0();
        Context requireContext = calculatorFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "v");
        e92 e92 = calculatorFragment.f41921y;
        if (e92 != null) {
            scrollView = e92.mo42169b();
        } else {
            scrollView = null;
        }
        i0.mo66042k(requireContext, view, scrollView);
        return true;
    }

    /* renamed from: o0 */
    public static final void m66496o0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m66497p0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m66498q0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m66500r0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m66502s0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: t0 */
    public static final boolean m66504t0(CalculatorFragment calculatorFragment, View view) {
        vx2.m53591g(calculatorFragment, "this$0");
        vx2.m53591g(view, "v");
        calculatorFragment.mo57443C0(view);
        return true;
    }

    /* renamed from: u0 */
    public static final boolean m66506u0(View view) {
        vx2.m53591g(view, "v");
        return true;
    }

    /* renamed from: v0 */
    public static final void m66508v0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m66510w0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m66512x0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: A0 */
    public final void mo57441A0() {
        C9449vc vcVar;
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        Object obj;
        List value = mo57448f0().mo60964k().getValue();
        if (value != null) {
            Iterator it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (vx2.m53586b(((C9449vc) obj).mo66476h(), mo57452j0().mo61011u().getValue())) {
                    break;
                }
            }
            vcVar = (C9449vc) obj;
        } else {
            vcVar = null;
        }
        if (vcVar != null) {
            e92 e92 = this.f41921y;
            if (!(e92 == null || (shapeableImageView2 = e92.f28463t) == null)) {
                vx2.m53590f(shapeableImageView2, "btnLatestPrice");
                ol0.m70336P(shapeableImageView2, vcVar.mo66472e(), vcVar.mo66471d(), vcVar.mo66475g());
            }
            if (ol0.m70328H(vcVar.mo66475g())) {
                String c = q70.m71187c(vcVar.mo66468a(), vcVar.mo66475g(), (Integer) null, 2, (Object) null);
                e92 e922 = this.f41921y;
                if (!(e922 == null || (shapeableImageView = e922.f28463t) == null)) {
                    vx2.m53590f(shapeableImageView, "btnLatestPrice");
                    ol0.m70335O(shapeableImageView, c, vcVar.mo66475g());
                }
            }
            mo57452j0().mo61003m(vcVar, new CalculatorFragment$setSelectedTokenIcon$1$1(this));
            mo57452j0().mo61002l(vcVar);
        }
    }

    /* renamed from: B0 */
    public final void mo57442B0() {
        ux1<List<CalculatorViewModel.C8642a>> o;
        List<CalculatorViewModel.C8642a> value;
        CalculatorViewModel j0 = mo57452j0();
        if (j0 != null && (o = j0.mo61005o()) != null && (value = o.getValue()) != null) {
            try {
                StringBuilder sb = new StringBuilder();
                for (CalculatorViewModel.C8642a aVar : value) {
                    CalculatorViewModel.Type a = aVar.mo61018a();
                    CalculatorViewModel.Operation b = aVar.mo61019b();
                    BigDecimal c = aVar.mo61020c();
                    if (a == CalculatorViewModel.Type.Digit) {
                        sb.append(this.f41913X.format(c));
                    }
                    if (a == CalculatorViewModel.Type.Operation) {
                        vx2.m53588d(b);
                        sb.append(b.getEquation());
                    }
                }
                e92 e92 = this.f41921y;
                vx2.m53588d(e92);
                e92.f28435C.setText(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: C0 */
    public final void mo57443C0(View view) {
        ClipData.Item item;
        Object systemService = requireContext().getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip != null) {
            item = primaryClip.getItemAt(0);
        } else {
            item = null;
        }
        if (item != null) {
            charSequence = item.getText();
        }
        if (charSequence == null) {
            charSequence = "0";
        }
        PopupMenu popupMenu = new PopupMenu(requireContext(), view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_paste_menu, popupMenu.getMenu());
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.item_paste);
        popupMenu.setOnMenuItemClickListener(new w80(charSequence, this, clipboardManager));
        if (!clipboardManager.hasPrimaryClip()) {
            findItem.setEnabled(false);
        } else {
            ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
            vx2.m53588d(primaryClipDescription);
            findItem.setEnabled(primaryClipDescription.hasMimeType("text/plain"));
        }
        popupMenu.show();
    }

    /* renamed from: Y */
    public final boolean mo57444Y(BigDecimal bigDecimal) {
        if (bigDecimal != null && bigDecimal.compareTo(new BigDecimal(999000000000000L)) <= 0) {
            return true;
        }
        Context context = getContext();
        if (context != null) {
            ol0.m70345Y(context, R.string.dialog_alert_max_999);
        }
        return false;
    }

    /* renamed from: Z */
    public final void mo57445Z() {
        e92 e92 = this.f41921y;
        if (e92 != null) {
            e92.f28442J.f29302f.setChecked(true);
            e92.f28442J.f29298b.setVisibility(4);
            e92.f28442J.f29307k.setVisibility(4);
            e92.f28442J.f29299c.setVisibility(0);
            e92.f28442J.f29299c.setImageResource(R.drawable.ic_currency_swap);
            e92.f28442J.f29299c.setColorFilter(zr0.m31440c(requireContext(), R.color.white));
            e92.f28442J.f29299c.setOnClickListener(new t80(this));
            this.f41910P.observe(getViewLifecycleOwner(), new u80(new CalculatorFragment$bind$1$2(this, e92)));
            e92.f28442J.f29301e.setTextColor(zr0.m31440c(requireContext(), R.color.white));
            TextView textView = e92.f28442J.f29301e;
            vx2.m53590f(textView, "toolbar.leftText");
            textView.setVisibility(0);
            e92.f28442J.f29301e.setOnClickListener(new v80(this));
            e92.f28446c.setOnClickListener(this);
            e92.f28447d.setOnClickListener(this);
            e92.f28448e.setOnClickListener(this);
            e92.f28449f.setOnClickListener(this);
            e92.f28450g.setOnClickListener(this);
            e92.f28451h.setOnClickListener(this);
            e92.f28452i.setOnClickListener(this);
            e92.f28453j.setOnClickListener(this);
            e92.f28454k.setOnClickListener(this);
            e92.f28455l.setOnClickListener(this);
            e92.f28467x.setOnClickListener(this);
            e92.f28465v.setOnClickListener(this);
            e92.f28466w.setOnClickListener(this);
            e92.f28460q.setOnClickListener(this);
            e92.f28464u.setOnClickListener(this);
            e92.f28457n.setOnClickListener(this);
            e92.f28468y.setOnClickListener(this);
            e92.f28463t.setOnClickListener(this);
            e92.f28463t.setOnLongClickListener(this.f41915Z);
            e92.f28456m.setOnClickListener(this);
            e92.f28456m.setOnLongClickListener(this.f41916e0);
            e92.f28458o.setOnClickListener(this);
            e92.f28459p.setOnClickListener(this);
            e92.f28461r.setText(String.valueOf(Common.f42577a.mo60892B()));
            e92.f28461r.setOnClickListener(this);
            e92.f28462s.setOnClickListener(this);
        }
    }

    /* renamed from: d0 */
    public final void mo57446d0() {
        Float f;
        SegmentedButton segmentedButton;
        C5872go goVar;
        Resources resources;
        DisplayMetrics displayMetrics;
        boolean z = true;
        if (jo6.m20327a(Locale.getDefault()) != 1) {
            z = false;
        }
        if (z) {
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            FragmentActivity activity = getActivity();
            ViewGroup.LayoutParams layoutParams = null;
            if (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                f = null;
            } else {
                f = Float.valueOf(displayMetrics.density);
            }
            vx2.m53588d(f);
            int b = i - ap3.m31899b(((float) 85) * f.floatValue());
            e92 e92 = this.f41921y;
            if (e92 == null || (goVar = e92.f28442J) == null) {
                segmentedButton = null;
            } else {
                segmentedButton = goVar.f29306j;
            }
            if (segmentedButton != null) {
                layoutParams = segmentedButton.getLayoutParams();
            }
            if (layoutParams != null) {
                layoutParams.width = b;
            }
            if (segmentedButton != null) {
                segmentedButton.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo57447e0() {
        mo57450h0().mo56247d();
    }

    /* renamed from: f0 */
    public final AddNewTokensViewModel mo57448f0() {
        return (AddNewTokensViewModel) this.f41908L.getValue();
    }

    /* renamed from: g0 */
    public final AnchorCurrencyConverter mo57449g0() {
        return (AnchorCurrencyConverter) this.f41906H.getValue();
    }

    /* renamed from: h0 */
    public final CalculatorFragment$anchorFiatCurrency$2.C8371a mo57450h0() {
        return (CalculatorFragment$anchorFiatCurrency$2.C8371a) this.f41912U.getValue();
    }

    /* renamed from: i0 */
    public final C9356tg mo57451i0() {
        return (C9356tg) this.f41905C.getValue();
    }

    /* renamed from: j0 */
    public final CalculatorViewModel mo57452j0() {
        return (CalculatorViewModel) this.f41920x.getValue();
    }

    /* renamed from: k0 */
    public final CalculatorFragment$defaultCurrencyAdapter$2.C8372a mo57453k0() {
        return (CalculatorFragment$defaultCurrencyAdapter$2.C8372a) this.f41911Q.getValue();
    }

    /* renamed from: l0 */
    public final HomeViewModel mo57454l0() {
        return (HomeViewModel) this.f41907I.getValue();
    }

    /* renamed from: m0 */
    public final SelectFiatViewModel mo57455m0() {
        return (SelectFiatViewModel) this.f41909M.getValue();
    }

    public void onClick(View view) {
        AppCompatTextView appCompatTextView;
        vx2.m53591g(view, "v");
        int id = view.getId();
        switch (id) {
            case R.id.btnLatestPrice:
                try {
                    if (vx2.m53586b(mo57452j0().mo61013w().getValue(), Boolean.TRUE)) {
                        mo57452j0().mo61000j();
                    }
                    mo57458z0();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case R.id.btn_c:
                mo57452j0().mo61000j();
                e92 e92 = this.f41921y;
                if (e92 != null) {
                    appCompatTextView = e92.f28436D;
                } else {
                    appCompatTextView = null;
                }
                if (appCompatTextView != null) {
                    appCompatTextView.setText("");
                    return;
                }
                return;
            case R.id.btn_del:
                mo57452j0().mo61001k();
                return;
            case R.id.btn_divide:
                e92 e922 = this.f41921y;
                vx2.m53588d(e922);
                e922.f28436D.setText("");
                mo57452j0().mo60990A(CalculatorViewModel.Operation.DIVIDE);
                return;
            case R.id.btn_ths:
                CalculatorViewModel j0 = mo57452j0();
                BigDecimal valueOf = BigDecimal.valueOf(1000);
                vx2.m53590f(valueOf, "valueOf(1000L)");
                j0.mo61015y(valueOf);
                return;
            default:
                switch (id) {
                    case R.id.btn_0:
                        mo57452j0().mo60993D(0);
                        return;
                    case R.id.btn_1:
                        mo57452j0().mo60993D(1);
                        return;
                    case R.id.btn_2:
                        mo57452j0().mo60993D(2);
                        return;
                    case R.id.btn_3:
                        mo57452j0().mo60993D(3);
                        return;
                    case R.id.btn_4:
                        mo57452j0().mo60993D(4);
                        return;
                    case R.id.btn_5:
                        mo57452j0().mo60993D(5);
                        return;
                    case R.id.btn_6:
                        mo57452j0().mo60993D(6);
                        return;
                    case R.id.btn_7:
                        mo57452j0().mo60993D(7);
                        return;
                    case R.id.btn_8:
                        mo57452j0().mo60993D(8);
                        return;
                    case R.id.btn_9:
                        mo57452j0().mo60993D(9);
                        return;
                    case R.id.btn_bag:
                        try {
                            if (vx2.m53586b(mo57452j0().mo61013w().getValue(), Boolean.TRUE)) {
                                mo57452j0().mo61000j();
                            }
                            Integer value = mo57452j0().mo61010t().getValue();
                            if (value != null) {
                                int intValue = value.intValue();
                                if (intValue == R.id.btnBag) {
                                    mo57457y0();
                                    return;
                                } else if (intValue == R.id.btnPercentageOfTraditional) {
                                    mo57452j0().mo60998h();
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    case R.id.btn_bil:
                        CalculatorViewModel j02 = mo57452j0();
                        BigDecimal valueOf2 = BigDecimal.valueOf(1000000000);
                        vx2.m53590f(valueOf2, "valueOf(1000000000L)");
                        j02.mo61015y(valueOf2);
                        return;
                    default:
                        switch (id) {
                            case R.id.btn_dot:
                                mo57452j0().mo60994E();
                                return;
                            case R.id.btn_equal:
                                if (vx2.m53586b(mo57452j0().mo61013w().getValue(), Boolean.TRUE)) {
                                    mo57452j0().mo61000j();
                                }
                                mo57452j0().mo60997f();
                                return;
                            default:
                                switch (id) {
                                    case R.id.btn_mil:
                                        CalculatorViewModel j03 = mo57452j0();
                                        BigDecimal valueOf3 = BigDecimal.valueOf(1000000);
                                        vx2.m53590f(valueOf3, "valueOf(1000000L)");
                                        j03.mo61015y(valueOf3);
                                        return;
                                    case R.id.btn_minus:
                                        e92 e923 = this.f41921y;
                                        vx2.m53588d(e923);
                                        e923.f28436D.setText("");
                                        mo57452j0().mo60990A(CalculatorViewModel.Operation.SUBTRACT);
                                        return;
                                    case R.id.btn_multi:
                                        e92 e924 = this.f41921y;
                                        vx2.m53588d(e924);
                                        e924.f28436D.setText("");
                                        mo57452j0().mo60990A(CalculatorViewModel.Operation.MULTIPLY);
                                        return;
                                    case R.id.btn_plus:
                                        e92 e925 = this.f41921y;
                                        vx2.m53588d(e925);
                                        e925.f28436D.setText("");
                                        mo57452j0().mo60990A(CalculatorViewModel.Operation.ADD);
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo57452j0().mo61013w().postValue(Boolean.FALSE);
        this.f41903A.setDecimalSeparator(this.f41917k);
        this.f41903A.setGroupingSeparator(this.f41918r);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        this.f41921y = e92.m43831a(layoutInflater.inflate(R.layout.fragment_calculator, viewGroup, false));
        requireActivity().getWindow().setBackgroundDrawableResource(R.color.light_grey);
        mo57445Z();
        mo57446d0();
        e92 e92 = this.f41921y;
        vx2.m53588d(e92);
        return e92.mo42169b();
    }

    public void onPause() {
        super.onPause();
        AnchorPopUpMyTokens anchorPopUpMyTokens = this.f41904B;
        if (anchorPopUpMyTokens != null) {
            anchorPopUpMyTokens.mo57149d();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        e92 e92 = this.f41921y;
        vx2.m53588d(e92);
        e92.f28436D.setOnLongClickListener(new z80(this));
        e92 e922 = this.f41921y;
        vx2.m53588d(e922);
        e922.f28435C.setOnLongClickListener(new a90());
        CalculatorViewModel j0 = mo57452j0();
        vx2.m53588d(j0);
        ux1<List<CalculatorViewModel.C8642a>> o = j0.mo61005o();
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        o.observe(viewLifecycleOwner, new b90(new CalculatorFragment$onViewCreated$3(this)));
        mo57452j0().mo61004n().observe(getViewLifecycleOwner(), new c90(new CalculatorFragment$onViewCreated$4(this)));
        mo57452j0().mo61006p().observe(getViewLifecycleOwner(), new d90(new CalculatorFragment$onViewCreated$5(this)));
        mo57454l0().mo61232n().observe(getViewLifecycleOwner(), new e90(new CalculatorFragment$onViewCreated$6(this)));
        mo57452j0().mo61011u().observe(getViewLifecycleOwner(), new f90(new CalculatorFragment$onViewCreated$7(this)));
        mo57448f0().mo60964k().observe(getViewLifecycleOwner(), new g90(new CalculatorFragment$onViewCreated$8(this)));
        mo57452j0().mo61010t().observe(getViewLifecycleOwner(), new r80(new CalculatorFragment$onViewCreated$9(this)));
        e92 e923 = this.f41921y;
        if (e923 != null) {
            LinearLayout linearLayout = e923.f28437E;
            vx2.m53590f(linearLayout, "editWrapper");
            vx2.m53590f(xh4.m30102a(linearLayout, new C8368a(linearLayout, this, e923)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        }
        mo57455m0().mo61374i().observe(getViewLifecycleOwner(), new s80(new CalculatorFragment$onViewCreated$11(this)));
        e92 e924 = this.f41921y;
        vx2.m53588d(e924);
        SegmentedButton segmentedButton = e924.f28442J.f29306j;
        vx2.m53590f(segmentedButton, "binding!!.toolbar.segmentedGroup");
        mo58057q(segmentedButton);
    }

    /* renamed from: y0 */
    public final void mo57457y0() {
        mo57452j0().mo60996e(mo57452j0().mo61008r());
    }

    /* renamed from: z0 */
    public final void mo57458z0() {
        double d;
        CalculatorViewModel j0 = mo57452j0();
        Double s = mo57452j0().mo61009s();
        if (s != null) {
            double doubleValue = s.doubleValue();
            Fiat value = this.f41910P.getValue();
            vx2.m53588d(value);
            d = sz1.m72125b(doubleValue, value);
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        BigDecimal valueOf = BigDecimal.valueOf(d);
        vx2.m53590f(valueOf, "valueOf(\n               …e!!) ?: 0.0\n            )");
        j0.mo60996e(valueOf);
    }
}
