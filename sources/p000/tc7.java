package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u001aH\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u001a\u0012\u0010\r\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b\u001a\u0012\u0010\u000f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u001e\u0010\u0014\u001a\u00020\u0004*\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0004*\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u001a \u0010\u001b\u001a\u00020\u0004*\u00020\u00182\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00040\u0011¨\u0006\u001c"}, mo44877d2 = {"Lba7;", "Landroid/widget/EditText;", "editText", "Lkotlin/Function0;", "Lr37;", "qrCallback", "n", "Lid7;", "selectContactCallback", "pasteContactCallback", "o", "Landroid/view/View;", "viewCopy", "m", "viewClear", "l", "Landroid/widget/CompoundButton;", "Lkotlin/Function1;", "", "callback", "j", "", "_text", "w", "Landroid/widget/TextView;", "Landroid/text/Editable;", "action", "i", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: tc7 */
/* compiled from: View.kt */
public final class tc7 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tc7$a */
    /* compiled from: TextView.kt */
    public static final class C9346a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ TextView f44705a;

        /* renamed from: d */
        public final /* synthetic */ rc2 f44706d;

        public C9346a(TextView textView, rc2 rc2) {
            this.f44705a = textView;
            this.f44706d = rc2;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f44705a.hasFocus()) {
                this.f44706d.invoke(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tc7$b */
    /* compiled from: TextView.kt */
    public static final class C9347b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ View f44707a;

        /* renamed from: d */
        public final /* synthetic */ EditText f44708d;

        public C9347b(View view, EditText editText) {
            this.f44707a = view;
            this.f44708d = editText;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            View view = this.f44707a;
            boolean z2 = true;
            int i = 0;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(!yb6.m74325B(str))) {
                z2 = false;
            }
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
            this.f44707a.setOnClickListener(new C9348c(this.f44708d));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lr37;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: tc7$c */
    /* compiled from: View.kt */
    public static final class C9348c implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ EditText f44709a;

        public C9348c(EditText editText) {
            this.f44709a = editText;
        }

        public final void onClick(View view) {
            this.f44709a.setText("");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tc7$d */
    /* compiled from: TextView.kt */
    public static final class C9349d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ View f44710a;

        /* renamed from: d */
        public final /* synthetic */ EditText f44711d;

        public C9349d(View view, EditText editText) {
            this.f44710a = view;
            this.f44711d = editText;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            View view = this.f44710a;
            boolean z2 = true;
            int i = 0;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(!yb6.m74325B(str))) {
                z2 = false;
            }
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
            this.f44710a.setOnClickListener(new C9350e(this.f44711d, str));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lr37;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: tc7$e */
    /* compiled from: View.kt */
    public static final class C9350e implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ EditText f44712a;

        /* renamed from: d */
        public final /* synthetic */ String f44713d;

        public C9350e(EditText editText, String str) {
            this.f44712a = editText;
            this.f44713d = str;
        }

        public final void onClick(View view) {
            Context context = this.f44712a.getContext();
            vx2.m53590f(context, "context");
            ol0.m70361h(context, this.f44713d);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tc7$f */
    /* compiled from: TextView.kt */
    public static final class C9351f implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ EditText f44714a;

        /* renamed from: d */
        public final /* synthetic */ ba7 f44715d;

        /* renamed from: e */
        public final /* synthetic */ pc2 f44716e;

        public C9351f(EditText editText, ba7 ba7, pc2 pc2) {
            this.f44714a = editText;
            this.f44715d = ba7;
            this.f44716e = pc2;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            boolean z2 = true;
            int i2 = 0;
            if (this.f44714a.getText().toString().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f44715d.f21212b.setVisibility(ol0.m70368k0(z));
            MaterialButton materialButton = this.f44715d.f21213c;
            vx2.m53590f(materialButton, "btnPaste");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            materialButton.setVisibility(i);
            AppCompatImageView appCompatImageView = this.f44715d.f21214d;
            vx2.m53590f(appCompatImageView, "btnQr");
            if (!z || this.f44716e == null) {
                z2 = false;
            }
            if (!z2) {
                i2 = 8;
            }
            appCompatImageView.setVisibility(i2);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tc7$g */
    /* compiled from: TextView.kt */
    public static final class C9352g implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ EditText f44717a;

        /* renamed from: d */
        public final /* synthetic */ id7 f44718d;

        public C9352g(EditText editText, id7 id7) {
            this.f44717a = editText;
            this.f44718d = id7;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            int i2;
            int i3 = 0;
            if (this.f44717a.getText().toString().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f44718d.f29894b.setVisibility(ol0.m70368k0(z));
            MaterialButton materialButton = this.f44718d.f29895c;
            vx2.m53590f(materialButton, "btnPaste");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            materialButton.setVisibility(i);
            AppCompatImageView appCompatImageView = this.f44718d.f29896d;
            vx2.m53590f(appCompatImageView, "btnQr");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            appCompatImageView.setVisibility(i2);
            ImageView imageView = this.f44718d.f29897e;
            vx2.m53590f(imageView, "btnSelectContact");
            if (!z) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: i */
    public static final void m72256i(TextView textView, rc2<? super Editable, r37> rc2) {
        vx2.m53591g(textView, "<this>");
        vx2.m53591g(rc2, "action");
        textView.addTextChangedListener(new C9346a(textView, rc2));
    }

    /* renamed from: j */
    public static final void m72257j(CompoundButton compoundButton, rc2<? super Boolean, r37> rc2) {
        vx2.m53591g(compoundButton, "<this>");
        vx2.m53591g(rc2, "callback");
        compoundButton.setOnCheckedChangeListener(new sc7(rc2));
    }

    /* renamed from: k */
    public static final void m72258k(rc2 rc2, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(rc2, "$callback");
        if (compoundButton.isPressed()) {
            rc2.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: l */
    public static final void m72259l(EditText editText, View view) {
        vx2.m53591g(editText, "<this>");
        vx2.m53591g(view, "viewClear");
        editText.addTextChangedListener(new C9347b(view, editText));
    }

    /* renamed from: m */
    public static final void m72260m(EditText editText, View view) {
        vx2.m53591g(editText, "<this>");
        vx2.m53591g(view, "viewCopy");
        editText.addTextChangedListener(new C9349d(view, editText));
    }

    /* renamed from: n */
    public static final void m72261n(ba7 ba7, EditText editText, pc2<r37> pc2) {
        boolean z;
        vx2.m53591g(ba7, "<this>");
        vx2.m53591g(editText, "editText");
        AppCompatImageView appCompatImageView = ba7.f21214d;
        vx2.m53590f(appCompatImageView, "btnQr");
        int i = 0;
        if (pc2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        Object systemService = editText.getContext().getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        editText.addTextChangedListener(new C9351f(editText, ba7, pc2));
        ba7.f21213c.setOnClickListener(new lc7((ClipboardManager) systemService, editText, ba7, pc2));
        ba7.f21214d.setOnClickListener(new mc7(editText, pc2));
        ba7.f21212b.setOnClickListener(new nc7(editText));
        editText.setText("");
    }

    /* renamed from: o */
    public static final void m72262o(id7 id7, EditText editText, pc2<r37> pc2, pc2<r37> pc22, pc2<r37> pc23) {
        boolean z;
        vx2.m53591g(id7, "<this>");
        vx2.m53591g(editText, "editText");
        AppCompatImageView appCompatImageView = id7.f29896d;
        vx2.m53590f(appCompatImageView, "btnQr");
        int i = 0;
        if (pc2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        Object systemService = editText.getContext().getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        editText.addTextChangedListener(new C9352g(editText, id7));
        id7.f29895c.setOnClickListener(new oc7((ClipboardManager) systemService, editText, pc23, id7));
        id7.f29896d.setOnClickListener(new pc7(editText, pc2));
        id7.f29894b.setOnClickListener(new qc7(editText));
        ImageView imageView = id7.f29897e;
        if (imageView != null) {
            imageView.setOnClickListener(new rc7(pc22));
        }
        editText.setText("");
    }

    /* renamed from: p */
    public static final void m72263p(ClipboardManager clipboardManager, EditText editText, pc2 pc2, id7 id7, View view) {
        boolean z;
        int i;
        int i2;
        vx2.m53591g(clipboardManager, "$manager");
        vx2.m53591g(editText, "$editText");
        vx2.m53591g(id7, "$this_setUpDefaultView");
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            int i3 = 0;
            if (primaryClip.getItemAt(0).getText() != null) {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                MaterialButton materialButton = id7.f29894b;
                vx2.m53590f(materialButton, "btnClear");
                materialButton.setVisibility(0);
                editText.setText(itemAt.getText());
                if (editText.getText().toString().length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                id7.f29894b.setVisibility(ol0.m70368k0(z));
                MaterialButton materialButton2 = id7.f29895c;
                vx2.m53590f(materialButton2, "btnPaste");
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                materialButton2.setVisibility(i);
                AppCompatImageView appCompatImageView = id7.f29896d;
                vx2.m53590f(appCompatImageView, "btnQr");
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                appCompatImageView.setVisibility(i2);
                ImageView imageView = id7.f29897e;
                vx2.m53590f(imageView, "btnSelectContact");
                if (!z) {
                    i3 = 8;
                }
                imageView.setVisibility(i3);
            }
        }
        a77.m55428f(editText.getContext());
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: q */
    public static final void m72264q(EditText editText, pc2 pc2, View view) {
        vx2.m53591g(editText, "$editText");
        a77.m55428f(editText.getContext());
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: r */
    public static final void m72265r(EditText editText, View view) {
        vx2.m53591g(editText, "$editText");
        editText.setText("");
    }

    /* renamed from: s */
    public static final void m72266s(pc2 pc2, View view) {
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: t */
    public static final void m72267t(ClipboardManager clipboardManager, EditText editText, ba7 ba7, pc2 pc2, View view) {
        boolean z;
        int i;
        vx2.m53591g(clipboardManager, "$manager");
        vx2.m53591g(editText, "$editText");
        vx2.m53591g(ba7, "$this_setUpDefaultView");
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            int i2 = 0;
            if (primaryClip.getItemAt(0).getText() != null) {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                MaterialButton materialButton = ba7.f21212b;
                vx2.m53590f(materialButton, "btnClear");
                materialButton.setVisibility(0);
                editText.setText(itemAt.getText());
                boolean z2 = true;
                if (editText.getText().toString().length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                ba7.f21212b.setVisibility(ol0.m70368k0(z));
                MaterialButton materialButton2 = ba7.f21213c;
                vx2.m53590f(materialButton2, "btnPaste");
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                materialButton2.setVisibility(i);
                AppCompatImageView appCompatImageView = ba7.f21214d;
                vx2.m53590f(appCompatImageView, "btnQr");
                if (!z || pc2 == null) {
                    z2 = false;
                }
                if (!z2) {
                    i2 = 8;
                }
                appCompatImageView.setVisibility(i2);
            }
        }
        a77.m55428f(editText.getContext());
    }

    /* renamed from: u */
    public static final void m72268u(EditText editText, pc2 pc2, View view) {
        vx2.m53591g(editText, "$editText");
        a77.m55428f(editText.getContext());
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: v */
    public static final void m72269v(EditText editText, View view) {
        vx2.m53591g(editText, "$editText");
        editText.setText("");
    }

    /* renamed from: w */
    public static final void m72270w(EditText editText, Object obj) {
        String obj2;
        vx2.m53591g(editText, "<this>");
        if (obj != null && (obj2 = obj.toString()) != null) {
            boolean hasFocus = editText.hasFocus();
            int i = -99;
            if (hasFocus) {
                i = editText.getSelectionEnd();
                editText.clearFocus();
            }
            editText.setText(obj2);
            if (hasFocus) {
                editText.requestFocus();
                try {
                    editText.setSelection(i);
                } catch (Exception unused) {
                }
            }
        }
    }
}
