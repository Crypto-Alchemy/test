package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.CalculatorViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\nH\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, mo44877d2 = {"Ltg;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "anchorView", "root", "k", "", "i", "Lr37;", "h", "j", "view", "Landroid/widget/PopupWindow;", "g", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel;", "a", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel;", "calculatorViewModel", "b", "Landroid/widget/PopupWindow;", "window", "", "c", "I", "selectedColor", "d", "moneyPercentage", "<init>", "(Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tg */
/* compiled from: AnchorPopUpBagButton.kt */
public final class C9356tg {

    /* renamed from: a */
    public final CalculatorViewModel f44730a;

    /* renamed from: b */
    public PopupWindow f44731b;

    /* renamed from: c */
    public final int f44732c = R.color.curve_green;

    /* renamed from: d */
    public int f44733d = 50;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, mo44877d2 = {"tg$a", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "seekBar", "", "progress", "", "fromUser", "Lr37;", "onProgressChanged", "onStartTrackingTouch", "onStopTrackingTouch", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tg$a */
    /* compiled from: AnchorPopUpBagButton.kt */
    public static final class C9357a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C9356tg f44734a;

        /* renamed from: b */
        public final /* synthetic */ ht2 f44735b;

        public C9357a(C9356tg tgVar, ht2 ht2) {
            this.f44734a = tgVar;
            this.f44735b = ht2;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f44734a.f44733d = i + 1;
            MaterialButton materialButton = this.f44735b.f29723d;
            int e = this.f44734a.f44733d;
            materialButton.setText(e + "%");
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public C9356tg(CalculatorViewModel calculatorViewModel) {
        vx2.m53591g(calculatorViewModel, "calculatorViewModel");
        this.f44730a = calculatorViewModel;
    }

    /* renamed from: l */
    public static final void m72293l(xe1 xe1, View view) {
        vx2.m53591g(xe1, "$this_run");
        CardView cardView = xe1.f35612c;
        vx2.m53590f(cardView, "ccToggleItemWrapper");
        cardView.setVisibility(8);
        CardView cardView2 = xe1.f35611b;
        vx2.m53590f(cardView2, "ccManageBagItemWrapper");
        cardView2.setVisibility(0);
    }

    /* renamed from: m */
    public static final void m72294m(C9356tg tgVar, View view) {
        vx2.m53591g(tgVar, "this$0");
        tgVar.f44730a.mo61010t().postValue(Integer.valueOf(view.getId()));
        tgVar.mo66039h();
    }

    /* renamed from: n */
    public static final void m72295n(C9356tg tgVar, View view) {
        vx2.m53591g(tgVar, "this$0");
        tgVar.f44730a.mo61010t().postValue(Integer.valueOf(view.getId()));
        tgVar.mo66039h();
    }

    /* renamed from: o */
    public static final void m72296o(C9356tg tgVar, View view) {
        vx2.m53591g(tgVar, "this$0");
        tgVar.mo66041j();
        tgVar.mo66039h();
    }

    /* renamed from: g */
    public final PopupWindow mo66038g(View view, View view2) {
        int i;
        if (view2 != null) {
            i = view2.getWidth();
        } else {
            i = -1;
        }
        PopupWindow popupWindow = new PopupWindow(view, (int) (((double) i) * 0.8d), -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: h */
    public final void mo66039h() {
        PopupWindow popupWindow;
        if (mo66040i() && (popupWindow = this.f44731b) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: i */
    public final boolean mo66040i() {
        PopupWindow popupWindow = this.f44731b;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: j */
    public final void mo66041j() {
        int i = this.f44733d;
        CalculatorViewModel calculatorViewModel = this.f44730a;
        BigDecimal multiply = calculatorViewModel.mo61008r().multiply(new BigDecimal(String.valueOf((double) i)));
        vx2.m53590f(multiply, "this.multiply(other)");
        BigDecimal valueOf = BigDecimal.valueOf(100);
        vx2.m53590f(valueOf, "valueOf(100)");
        BigDecimal divide = multiply.divide(valueOf, RoundingMode.HALF_EVEN);
        vx2.m53590f(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        calculatorViewModel.mo60996e(divide);
    }

    /* renamed from: k */
    public final C9356tg mo66042k(Context context, View view, View view2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(view, "anchorView");
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_anchor_pop_up_bag, (ViewGroup) null);
        xe1 a = xe1.m54382a(inflate);
        vx2.m53590f(a, "bind(view)");
        gt2 gt2 = a.f35614e;
        gt2.f29349c.setOnClickListener(new C9178pg(a));
        gt2.f29348b.setOnClickListener(new C9213qg(this));
        gt2.f29350d.setOnClickListener(new C9251rg(this));
        Integer value = this.f44730a.mo61010t().getValue();
        if (value != null && value.intValue() == R.id.btnBag) {
            gt2.f29348b.setTextColor(zr0.m31440c(context, this.f44732c));
        } else if (value != null && value.intValue() == R.id.btnPercentageOfTraditional) {
            gt2.f29350d.setTextColor(zr0.m31440c(context, this.f44732c));
        }
        ht2 ht2 = a.f35613d;
        ht2.f29721b.setOnSeekBarChangeListener(new C9357a(this, ht2));
        ht2.f29721b.setProgress(this.f44733d - 1);
        MaterialButton materialButton = ht2.f29723d;
        int i = this.f44733d;
        materialButton.setText(i + "%");
        ht2.f29722c.setOnClickListener(new C9308sg(this));
        vx2.m53590f(inflate, "view");
        PopupWindow g = mo66038g(inflate, view2);
        this.f44731b = g;
        if (g != null) {
            g.showAsDropDown(view);
        }
        return this;
    }
}
