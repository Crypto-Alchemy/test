package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter$defaultCurrencyAdapter$2;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;
import net.safemoon.androidwallet.views.CurrencyConverterLayout;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010'\u001a\u00020\"\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050@¢\u0006\u0004\bB\u0010CJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0005H\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J*\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006D"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/AnchorCurrencyConverter;", "", "", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "items", "Lr37;", "z", "Landroid/view/View;", "anchorView", "C", "w", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "otherSideItem", "s", "A", "B", "Lnet/safemoon/androidwallet/views/CurrencyConverterLayout;", "convertFrom", "convertTo", "Landroid/text/Editable;", "it", "", "isAboveFocus", "r", "view", "root", "Landroid/widget/PopupWindow;", "q", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "b", "Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "v", "()Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "selectFiatViewModel", "c", "Landroid/widget/PopupWindow;", "window", "Lve1;", "d", "Lve1;", "binding", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "e", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "fromFiat", "f", "toFiat", "g", "Ljava/util/List;", "net/safemoon/androidwallet/dialogs/AnchorCurrencyConverter$defaultCurrencyAdapter$2$a", "h", "Lef3;", "u", "()Lnet/safemoon/androidwallet/dialogs/AnchorCurrencyConverter$defaultCurrencyAdapter$2$a;", "defaultCurrencyAdapter", "i", "Z", "isFrom", "Lkotlin/Function0;", "onDismissListener", "<init>", "(Landroid/content/Context;Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;Landroid/view/View;Lpc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AnchorCurrencyConverter.kt */
public final class AnchorCurrencyConverter {

    /* renamed from: a */
    public final Context f41684a;

    /* renamed from: b */
    public final SelectFiatViewModel f41685b;

    /* renamed from: c */
    public PopupWindow f41686c;

    /* renamed from: d */
    public ve1 f41687d;

    /* renamed from: e */
    public Fiat f41688e;

    /* renamed from: f */
    public Fiat f41689f;

    /* renamed from: g */
    public final List<HistoryListItem> f41690g = new ArrayList();

    /* renamed from: h */
    public final ef3 f41691h = C6169a.m47232a(new AnchorCurrencyConverter$defaultCurrencyAdapter$2(this));

    /* renamed from: i */
    public boolean f41692i = true;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter$a */
    /* compiled from: TextView.kt */
    public static final class C8272a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AutofitEdittext f41693a;

        /* renamed from: d */
        public final /* synthetic */ AnchorCurrencyConverter f41694d;

        /* renamed from: e */
        public final /* synthetic */ ve1 f41695e;

        public C8272a(AutofitEdittext autofitEdittext, AnchorCurrencyConverter anchorCurrencyConverter, ve1 ve1) {
            this.f41693a = autofitEdittext;
            this.f41694d = anchorCurrencyConverter;
            this.f41695e = ve1;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f41693a.hasFocus()) {
                AnchorCurrencyConverter anchorCurrencyConverter = this.f41694d;
                CurrencyConverterLayout currencyConverterLayout = this.f41695e.f34929c;
                vx2.m53590f(currencyConverterLayout, "convertFrom");
                CurrencyConverterLayout currencyConverterLayout2 = this.f41695e.f34930d;
                vx2.m53590f(currencyConverterLayout2, "convertTo");
                anchorCurrencyConverter.mo57129r(currencyConverterLayout, currencyConverterLayout2, editable, true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter$b */
    /* compiled from: TextView.kt */
    public static final class C8273b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AutofitEdittext f41696a;

        /* renamed from: d */
        public final /* synthetic */ AnchorCurrencyConverter f41697d;

        /* renamed from: e */
        public final /* synthetic */ ve1 f41698e;

        public C8273b(AutofitEdittext autofitEdittext, AnchorCurrencyConverter anchorCurrencyConverter, ve1 ve1) {
            this.f41696a = autofitEdittext;
            this.f41697d = anchorCurrencyConverter;
            this.f41698e = ve1;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f41696a.hasFocus()) {
                AnchorCurrencyConverter anchorCurrencyConverter = this.f41697d;
                CurrencyConverterLayout currencyConverterLayout = this.f41698e.f34930d;
                vx2.m53590f(currencyConverterLayout, "convertTo");
                CurrencyConverterLayout currencyConverterLayout2 = this.f41698e.f34929c;
                vx2.m53590f(currencyConverterLayout2, "convertFrom");
                anchorCurrencyConverter.mo57129r(currencyConverterLayout, currencyConverterLayout2, editable, false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter$c */
    /* compiled from: TextView.kt */
    public static final class C8274c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AnchorCurrencyConverter f41699a;

        public C8274c(AnchorCurrencyConverter anchorCurrencyConverter) {
            this.f41699a = anchorCurrencyConverter;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String obj;
            if (charSequence != null && (obj = charSequence.toString()) != null) {
                if (this.f41699a.f41692i) {
                    AnchorCurrencyConverter anchorCurrencyConverter = this.f41699a;
                    anchorCurrencyConverter.mo57130s(new RoomFiat(anchorCurrencyConverter.f41689f), this.f41699a.mo57132v().mo61377l(obj));
                    return;
                }
                AnchorCurrencyConverter anchorCurrencyConverter2 = this.f41699a;
                anchorCurrencyConverter2.mo57130s(new RoomFiat(anchorCurrencyConverter2.f41688e), this.f41699a.mo57132v().mo61377l(obj));
            }
        }
    }

    public AnchorCurrencyConverter(Context context, SelectFiatViewModel selectFiatViewModel, View view, pc2<r37> pc2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(selectFiatViewModel, "selectFiatViewModel");
        vx2.m53591g(pc2, "onDismissListener");
        this.f41684a = context;
        this.f41685b = selectFiatViewModel;
        rz1.C9291a aVar = rz1.f44501a;
        this.f41688e = aVar.mo65771a();
        this.f41689f = aVar.mo65771a();
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_anchor_currency_converter, (ViewGroup) null);
        this.f41687d = ve1.m53362a(inflate);
        vx2.m53590f(inflate, "view");
        PopupWindow q = mo57128q(inflate, view);
        this.f41686c = q;
        if (q != null) {
            q.setOnDismissListener(new C7214ig(pc2));
        }
        ve1 ve1 = this.f41687d;
        vx2.m53588d(ve1);
        ve1.f34928b.setInAnimation(AnimationUtils.loadAnimation(context, 17432578));
        ve1.f34928b.setOutAnimation(AnimationUtils.loadAnimation(context, 17432579));
        ve1.f34933g.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ve1.f34933g.setAdapter(mo57131u());
        TextInputEditText textInputEditText = ve1.f34934h.f34980b;
        vx2.m53590f(textInputEditText, "searchBar.etSearch");
        textInputEditText.addTextChangedListener(new C8274c(this));
        ve1.f34931e.setOnClickListener(new C7263jg(ve1));
        AutofitEdittext editText = ve1.f34929c.getEditText();
        AutofitEdittext editText2 = ve1.f34930d.getEditText();
        editText.setFilters(new InputFilter[]{new xu2(Double.valueOf(Utils.DOUBLE_EPSILON), Double.valueOf(Double.MAX_VALUE))});
        editText.addTextChangedListener(new nc4(ve1.f34929c.getEditText()));
        editText.addTextChangedListener(new C8272a(editText, this, ve1));
        ve1.f34929c.mo62084n(new AnchorCurrencyConverter$2$4(this, ve1));
        ve1.f34929c.mo62083m(new AnchorCurrencyConverter$2$5(this, editText, ve1, editText2));
        ve1.f34929c.setItem(aVar.mo65771a());
        this.f41688e = aVar.mo65771a();
        editText2.setFilters(new InputFilter[]{new xu2(Double.valueOf(Utils.DOUBLE_EPSILON), Double.valueOf(Double.MAX_VALUE))});
        editText2.addTextChangedListener(new nc4(ve1.f34930d.getEditText()));
        editText2.addTextChangedListener(new C8273b(editText2, this, ve1));
        ve1.f34930d.mo62084n(new AnchorCurrencyConverter$2$7(this, ve1));
        ve1.f34930d.mo62083m(new AnchorCurrencyConverter$2$8(this, editText2, ve1, editText));
        RoomFiat k = selectFiatViewModel.mo61376k();
        if (k != null) {
            ve1.f34930d.setItem(k);
            ve1.f34930d.setOtherSideItem(aVar.mo65771a());
            ve1.f34929c.setOtherSideItem(k);
            this.f41689f = new Fiat(k.getSymbol(), k.getName(), k.getRate());
        }
        ve1.f34932f.setOnClickListener(new C7343kg(ve1, this));
    }

    /* renamed from: d */
    public static final void m65889d(pc2 pc2) {
        vx2.m53591g(pc2, "$onDismissListener");
        pc2.invoke();
    }

    /* renamed from: t */
    public static /* synthetic */ void m65902t(AnchorCurrencyConverter anchorCurrencyConverter, RoomFiat roomFiat, List<HistoryListItem> list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = anchorCurrencyConverter.f41690g;
        }
        anchorCurrencyConverter.mo57130s(roomFiat, list);
    }

    /* renamed from: x */
    public static final void m65903x(ve1 ve1, AnchorCurrencyConverter anchorCurrencyConverter, View view) {
        vx2.m53591g(ve1, "$this_with");
        vx2.m53591g(anchorCurrencyConverter, "this$0");
        RoomFiat selectedItem = ve1.f34929c.getSelectedItem();
        RoomFiat selectedItem2 = ve1.f34930d.getSelectedItem();
        if (selectedItem2 != null) {
            ve1.f34929c.setItem(selectedItem2);
            ve1.f34930d.mo62085o(selectedItem2);
        }
        if (selectedItem != null) {
            ve1.f34930d.setItem(selectedItem);
            ve1.f34929c.mo62085o(selectedItem);
        }
        anchorCurrencyConverter.mo57133w();
    }

    /* renamed from: y */
    public static final void m65904y(ve1 ve1, View view) {
        vx2.m53591g(ve1, "$this_with");
        ve1.f34928b.showPrevious();
    }

    /* renamed from: A */
    public final void mo57125A() {
        CurrencyConverterLayout currencyConverterLayout;
        CurrencyConverterLayout currencyConverterLayout2;
        ve1 ve1 = this.f41687d;
        if (!(ve1 == null || (currencyConverterLayout2 = ve1.f34929c) == null)) {
            currencyConverterLayout2.setItem(this.f41688e);
        }
        ve1 ve12 = this.f41687d;
        if (!(ve12 == null || (currencyConverterLayout = ve12.f34930d) == null)) {
            currencyConverterLayout.mo62085o(new RoomFiat(this.f41688e));
        }
        mo57133w();
    }

    /* renamed from: B */
    public final void mo57126B() {
        CurrencyConverterLayout currencyConverterLayout;
        CurrencyConverterLayout currencyConverterLayout2;
        ve1 ve1 = this.f41687d;
        if (!(ve1 == null || (currencyConverterLayout2 = ve1.f34930d) == null)) {
            currencyConverterLayout2.setItem(this.f41689f);
        }
        ve1 ve12 = this.f41687d;
        if (!(ve12 == null || (currencyConverterLayout = ve12.f34929c) == null)) {
            currencyConverterLayout.mo62085o(new RoomFiat(this.f41689f));
        }
        mo57133w();
    }

    /* renamed from: C */
    public final AnchorCurrencyConverter mo57127C(View view) {
        vx2.m53591g(view, "anchorView");
        PopupWindow popupWindow = this.f41686c;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(view);
        }
        return this;
    }

    /* renamed from: q */
    public final PopupWindow mo57128q(View view, View view2) {
        int i;
        if (view2 != null) {
            i = view2.getWidth();
        } else {
            i = -1;
        }
        PopupWindow popupWindow = new PopupWindow(view, (int) (((double) i) * 0.8d), (int) ho0.m58584a(400));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: r */
    public final void mo57129r(CurrencyConverterLayout currencyConverterLayout, CurrencyConverterLayout currencyConverterLayout2, Editable editable, boolean z) {
        boolean z2;
        CurrencyConverterLayout currencyConverterLayout3;
        AutofitEdittext editText;
        CurrencyConverterLayout currencyConverterLayout4;
        AutofitEdittext editText2;
        Double d;
        CurrencyConverterLayout currencyConverterLayout5;
        AutofitEdittext editText3;
        CurrencyConverterLayout currencyConverterLayout6;
        AutofitEdittext editText4;
        RoomFiat selectedItem = currencyConverterLayout.getSelectedItem();
        RoomFiat selectedItem2 = currencyConverterLayout2.getSelectedItem();
        if (editable != null) {
            if (editable.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                double J = ol0.m70330J(editable.toString());
                Double d2 = null;
                if (selectedItem != null) {
                    d = selectedItem.getRate();
                } else {
                    d = null;
                }
                if (d != null) {
                    if (selectedItem2 != null) {
                        d2 = selectedItem2.getRate();
                    }
                    if (d2 != null) {
                        double doubleValue = (J / selectedItem.getRate().doubleValue()) * selectedItem2.getRate().doubleValue();
                        if (z) {
                            ve1 ve1 = this.f41687d;
                            if (ve1 != null && (currencyConverterLayout6 = ve1.f34930d) != null && (editText4 = currencyConverterLayout6.getEditText()) != null) {
                                editText4.setText(ol0.m70365j(doubleValue));
                                return;
                            }
                            return;
                        }
                        ve1 ve12 = this.f41687d;
                        if (ve12 != null && (currencyConverterLayout5 = ve12.f34929c) != null && (editText3 = currencyConverterLayout5.getEditText()) != null) {
                            editText3.setText(ol0.m70365j(doubleValue));
                        }
                    }
                }
            } else if (z) {
                ve1 ve13 = this.f41687d;
                if (ve13 != null && (currencyConverterLayout4 = ve13.f34930d) != null && (editText2 = currencyConverterLayout4.getEditText()) != null) {
                    editText2.setText("");
                }
            } else {
                ve1 ve14 = this.f41687d;
                if (ve14 != null && (currencyConverterLayout3 = ve14.f34929c) != null && (editText = currencyConverterLayout3.getEditText()) != null) {
                    editText.setText("");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (p000.yb6.m74345z(r2, r8.getSymbol(), false, 2, (java.lang.Object) null) == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0009 A[SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57130s(net.safemoon.androidwallet.model.fiat.room.RoomFiat r8, java.util.List<net.safemoon.androidwallet.model.common.HistoryListItem> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0009:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r9.next()
            r2 = r1
            net.safemoon.androidwallet.model.common.HistoryListItem r2 = (net.safemoon.androidwallet.model.common.HistoryListItem) r2
            boolean r3 = r2 instanceof net.safemoon.androidwallet.model.common.FooterHistoryItem
            r4 = 0
            if (r3 != 0) goto L_0x003d
            boolean r3 = r2 instanceof net.safemoon.androidwallet.model.common.HeaderItemHistory
            if (r3 != 0) goto L_0x003d
            boolean r3 = r2 instanceof net.safemoon.androidwallet.model.fiat.ResultItemFiat
            if (r3 == 0) goto L_0x003e
            net.safemoon.androidwallet.model.fiat.ResultItemFiat r2 = (net.safemoon.androidwallet.model.fiat.ResultItemFiat) r2
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r2 = r2.getResult()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = r2.getSymbol()
            goto L_0x0032
        L_0x0031:
            r2 = r3
        L_0x0032:
            java.lang.String r5 = r8.getSymbol()
            r6 = 2
            boolean r2 = p000.yb6.m74345z(r2, r5, r4, r6, r3)
            if (r2 != 0) goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            if (r4 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0044:
            net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter$defaultCurrencyAdapter$2$a r8 = r7.mo57131u()
            java.util.List r9 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r0)
            r8.mo66152d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter.mo57130s(net.safemoon.androidwallet.model.fiat.room.RoomFiat, java.util.List):void");
    }

    /* renamed from: u */
    public final AnchorCurrencyConverter$defaultCurrencyAdapter$2.C8275a mo57131u() {
        return (AnchorCurrencyConverter$defaultCurrencyAdapter$2.C8275a) this.f41691h.getValue();
    }

    /* renamed from: v */
    public final SelectFiatViewModel mo57132v() {
        return this.f41685b;
    }

    /* renamed from: w */
    public final void mo57133w() {
        AutofitEdittext autofitEdittext;
        CurrencyConverterLayout currencyConverterLayout;
        CurrencyConverterLayout currencyConverterLayout2;
        ve1 ve1 = this.f41687d;
        AutofitEdittext autofitEdittext2 = null;
        if (ve1 == null || (currencyConverterLayout2 = ve1.f34929c) == null) {
            autofitEdittext = null;
        } else {
            autofitEdittext = currencyConverterLayout2.getEditText();
        }
        if (autofitEdittext != null) {
            autofitEdittext.setText(autofitEdittext.getText());
        }
        ve1 ve12 = this.f41687d;
        if (!(ve12 == null || (currencyConverterLayout = ve12.f34930d) == null)) {
            autofitEdittext2 = currencyConverterLayout.getEditText();
        }
        if (autofitEdittext2 != null) {
            autofitEdittext2.setText(autofitEdittext2.getText());
        }
    }

    /* renamed from: z */
    public final void mo57134z(List<HistoryListItem> list) {
        vx2.m53591g(list, "items");
        this.f41690g.clear();
        this.f41690g.addAll(list);
        mo57131u().mo66152d(this.f41690g);
    }
}
