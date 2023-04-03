package net.safemoon.androidwallet.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.viewmodels.CreateWalletViewModel;
import wallet.core.jni.Mnemonic;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001f\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\b\u0010\u000e\u001a\u00020\u0004H\u0002R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportWordActivity;", "Lnet/safemoon/androidwallet/activity/AKTRecoverWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "J0", "", "Landroid/widget/EditText;", "editTextView", "F0", "([Landroid/widget/EditText;)V", "Q0", "O0", "Landroid/content/ClipboardManager;", "B", "Lef3;", "H0", "()Landroid/content/ClipboardManager;", "manager", "Lha;", "C", "G0", "()Lha;", "binding", "", "H", "I0", "()I", "wordCount", "<init>", "()V", "I", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTImportWordActivity.kt */
public final class AKTImportWordActivity extends AKTRecoverWalletActivity {

    /* renamed from: I */
    public static final C8143a f41298I = new C8143a((DefaultConstructorMarker) null);

    /* renamed from: B */
    public final ef3 f41299B = C6169a.m47232a(new AKTImportWordActivity$manager$2(this));

    /* renamed from: C */
    public final ef3 f41300C = C6169a.m47232a(new AKTImportWordActivity$binding$2(this));

    /* renamed from: H */
    public final ef3 f41301H = C6169a.m47232a(new AKTImportWordActivity$wordCount$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportWordActivity$a;", "", "Landroid/content/Context;", "context", "", "wordCount", "Lr37;", "a", "", "ARG_WORD_COUNTS", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTImportWordActivity$a */
    /* compiled from: AKTImportWordActivity.kt */
    public static final class C8143a {
        public C8143a() {
        }

        public /* synthetic */ C8143a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56665a(Context context, int i) {
            vx2.m53591g(context, "context");
            Intent intent = new Intent(context, AKTImportWordActivity.class);
            intent.putExtra("ARG_WORD_COUNTS", i);
            context.startActivity(intent);
        }
    }

    /* renamed from: K0 */
    public static final void m64987K0(AKTImportWordActivity aKTImportWordActivity, EditText[] editTextArr, View view) {
        vx2.m53591g(aKTImportWordActivity, "this$0");
        vx2.m53591g(editTextArr, "$editTextView");
        ClipData primaryClip = aKTImportWordActivity.mo56660H0().getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            int i = 0;
            if (primaryClip.getItemAt(0).getText() != null) {
                List B0 = StringsKt__StringsKt.m63061B0(StringsKt__StringsKt.m63090V0(yb6.m74332I(primaryClip.getItemAt(0).getText().toString(), "|", " ", false, 4, (Object) null)).toString(), new String[]{" "}, false, 0, 6, (Object) null);
                if (B0.size() == aKTImportWordActivity.mo56661I0()) {
                    int length = editTextArr.length;
                    int i2 = 0;
                    while (i < length) {
                        EditText editText = editTextArr[i];
                        int i3 = i2 + 1;
                        if (editText != null && i2 < B0.size()) {
                            editText.setText((CharSequence) B0.get(i2));
                        }
                        i++;
                        i2 = i3;
                    }
                    return;
                }
                aKTImportWordActivity.mo56663O0();
                return;
            }
        }
        aKTImportWordActivity.mo56663O0();
    }

    /* renamed from: L0 */
    public static final void m64988L0(AKTImportWordActivity aKTImportWordActivity, EditText[] editTextArr, View view) {
        vx2.m53591g(aKTImportWordActivity, "this$0");
        vx2.m53591g(editTextArr, "$editTextView");
        aKTImportWordActivity.mo56664Q0(editTextArr);
    }

    /* renamed from: M0 */
    public static final void m64989M0(AKTImportWordActivity aKTImportWordActivity, EditText[] editTextArr, View view) {
        vx2.m53591g(aKTImportWordActivity, "this$0");
        vx2.m53591g(editTextArr, "$editTextView");
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = aKTImportWordActivity.getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        aKTImportWordActivity.f8528r = a;
        FragmentManager supportFragmentManager = aKTImportWordActivity.getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        a.mo57295D(supportFragmentManager);
        aKTImportWordActivity.mo56658F0(editTextArr);
    }

    /* renamed from: N0 */
    public static final void m64990N0(AKTImportWordActivity aKTImportWordActivity, View view) {
        vx2.m53591g(aKTImportWordActivity, "this$0");
        aKTImportWordActivity.onBackPressed();
    }

    /* renamed from: P0 */
    public static final void m64991P0(DialogInterface dialogInterface) {
    }

    /* renamed from: F0 */
    public final void mo56658F0(EditText[] editTextArr) {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (EditText editText : editTextArr) {
            if (editText != null) {
                String obj = editText.getText().toString();
                int length = obj.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (vx2.m53593i(obj.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                String obj2 = obj.subSequence(i2, length + 1).toString();
                Locale locale = Locale.getDefault();
                vx2.m53590f(locale, "getDefault()");
                String lowerCase = obj2.toLowerCase(locale);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                arrayList.add(lowerCase);
            }
        }
        String join = TextUtils.join(" ", arrayList);
        String join2 = TextUtils.join("|", arrayList);
        if (!Mnemonic.isValid(join)) {
            mo56691v0();
            return;
        }
        CreateWalletViewModel r0 = mo56688r0();
        vx2.m53590f(join, "mnemonic");
        r0.mo61122c(join, CreateWalletViewModel.KEY_TYPE.PASSPHRASE, new AKTImportWordActivity$checkUser$2(this, join2));
    }

    /* renamed from: G0 */
    public final C5886ha mo56659G0() {
        return (C5886ha) this.f41300C.getValue();
    }

    /* renamed from: H0 */
    public final ClipboardManager mo56660H0() {
        return (ClipboardManager) this.f41299B.getValue();
    }

    /* renamed from: I0 */
    public final int mo56661I0() {
        return ((Number) this.f41301H.getValue()).intValue();
    }

    /* renamed from: J0 */
    public final void mo56662J0() {
        C5886ha G0 = mo56659G0();
        int I0 = mo56661I0();
        Integer[] numArr = new Integer[I0];
        for (int i = 0; i < I0; i++) {
            numArr[i] = 1;
        }
        int I02 = mo56661I0();
        EditText[] editTextArr = new EditText[I02];
        for (int i2 = 0; i2 < I02; i2++) {
            editTextArr[i2] = null;
        }
        int I03 = mo56661I0();
        int i3 = 0;
        while (i3 < I03) {
            int i4 = i3 + 1;
            View inflate = LayoutInflater.from(this).inflate(R.layout.include_word, G0.f29487f, false);
            inflate.setId(Math.abs(("Item" + i4).hashCode()));
            kt2 a = kt2.m47519a(inflate);
            int abs = Math.abs(("Word" + i4).hashCode());
            int abs2 = Math.abs(("Word" + (i3 + 2)).hashCode());
            a.f31056b.setText("" + i4 + ".");
            AppCompatEditText appCompatEditText = (AppCompatEditText) inflate.findViewWithTag("word");
            appCompatEditText.setId(abs);
            appCompatEditText.setNextFocusDownId(abs2);
            editTextArr[i3] = appCompatEditText;
            numArr[i3] = Integer.valueOf(inflate.getId());
            G0.f29487f.addView(inflate);
            i3 = i4;
        }
        G0.f29488g.setReferencedIds(ArraysKt___ArraysKt.m47284j0(numArr));
        G0.f29485d.setOnClickListener(new C7008e1(this, editTextArr));
        G0.f29486e.setOnClickListener(new C7061f1(this, editTextArr));
        G0.f29484c.setOnClickListener(new C7112g1(this, editTextArr));
        G0.f29483b.setOnClickListener(new C7155h1(this));
    }

    /* renamed from: O0 */
    public final void mo56663O0() {
        String string = getString(R.string.warning_wrong_phrase_title);
        String string2 = getString(R.string.warning_wrong_phrase_msg, new Object[]{Integer.valueOf(mo56661I0())});
        vx2.m53590f(string2, "getString(R.string.warni…ng_phrase_msg, wordCount)");
        fy0.m57957f(this, string, string2, true, new C7199i1());
    }

    /* renamed from: Q0 */
    public final void mo56664Q0(EditText[] editTextArr) {
        C3529wa<Intent> b;
        ji4 K = mo56996K();
        if (K != null && (b = K.mo52724b(new AKTImportWordActivity$startScanQRCode$1(this, editTextArr))) != null) {
            b.mo27473a(new Intent(this, ScannedCodeActivity.class));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56659G0().mo43112b());
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo56662J0();
    }
}
