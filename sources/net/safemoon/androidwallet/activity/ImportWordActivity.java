package net.safemoon.androidwallet.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Arrays;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001f\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ImportWordActivity;", "Lnet/safemoon/androidwallet/activity/RecoverWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "y0", "", "Landroid/widget/EditText;", "editTextView", "F0", "([Landroid/widget/EditText;)V", "D0", "Landroid/content/ClipboardManager;", "y", "Lef3;", "w0", "()Landroid/content/ClipboardManager;", "manager", "Lha;", "A", "v0", "()Lha;", "binding", "", "B", "x0", "()I", "wordCount", "<init>", "()V", "C", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ImportWordActivity.kt */
public final class ImportWordActivity extends RecoverWalletActivity {

    /* renamed from: C */
    public static final C8189a f41454C = new C8189a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41455A = C6169a.m47232a(new ImportWordActivity$binding$2(this));

    /* renamed from: B */
    public final ef3 f41456B = C6169a.m47232a(new ImportWordActivity$wordCount$2(this));

    /* renamed from: y */
    public final ef3 f41457y = C6169a.m47232a(new ImportWordActivity$manager$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ImportWordActivity$a;", "", "Landroid/content/Context;", "context", "", "wordCount", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.ImportWordActivity$a */
    /* compiled from: ImportWordActivity.kt */
    public static final class C8189a {
        public C8189a() {
        }

        public /* synthetic */ C8189a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56860a(Context context, int i) {
            vx2.m53591g(context, "context");
            Intent intent = new Intent(context, ImportWordActivity.class);
            intent.putExtra("WORD_COUNT", i);
            context.startActivity(intent);
        }
    }

    /* renamed from: A0 */
    public static final void m65368A0(ImportWordActivity importWordActivity, EditText[] editTextArr, View view) {
        vx2.m53591g(importWordActivity, "this$0");
        vx2.m53591g(editTextArr, "$editTextView");
        importWordActivity.mo56855F0(editTextArr);
    }

    /* renamed from: B0 */
    public static final void m65369B0(ImportWordActivity importWordActivity, EditText[] editTextArr, View view) {
        vx2.m53591g(importWordActivity, "this$0");
        vx2.m53591g(editTextArr, "$editTextView");
        importWordActivity.mo56865b0((EditText[]) Arrays.copyOf(editTextArr, editTextArr.length));
    }

    /* renamed from: C0 */
    public static final void m65370C0(ImportWordActivity importWordActivity, View view) {
        vx2.m53591g(importWordActivity, "this$0");
        importWordActivity.onBackPressed();
    }

    /* renamed from: E0 */
    public static final void m65371E0(DialogInterface dialogInterface) {
    }

    /* renamed from: z0 */
    public static final void m65379z0(ImportWordActivity importWordActivity, EditText[] editTextArr, View view) {
        vx2.m53591g(importWordActivity, "this$0");
        vx2.m53591g(editTextArr, "$editTextView");
        ClipData primaryClip = importWordActivity.mo56857w0().getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            int i = 0;
            if (primaryClip.getItemAt(0).getText() != null) {
                List B0 = StringsKt__StringsKt.m63061B0(StringsKt__StringsKt.m63090V0(yb6.m74332I(primaryClip.getItemAt(0).getText().toString(), "|", " ", false, 4, (Object) null)).toString(), new String[]{" "}, false, 0, 6, (Object) null);
                if (B0.size() == importWordActivity.mo56858x0()) {
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
                importWordActivity.mo56854D0();
                return;
            }
        }
        importWordActivity.mo56854D0();
    }

    /* renamed from: D0 */
    public final void mo56854D0() {
        String string = getString(R.string.warning_wrong_phrase_title);
        String string2 = getString(R.string.warning_wrong_phrase_msg, new Object[]{Integer.valueOf(mo56858x0())});
        vx2.m53590f(string2, "getString(R.string.warni…ng_phrase_msg, wordCount)");
        fy0.m57957f(this, string, string2, true, new bt2());
    }

    /* renamed from: F0 */
    public final void mo56855F0(EditText[] editTextArr) {
        C3529wa<Intent> b;
        ji4 K = mo56996K();
        if (K != null && (b = K.mo52724b(new ImportWordActivity$startScanQRCode$1(this, editTextArr))) != null) {
            b.mo27473a(new Intent(this, ScannedCodeActivity.class));
        }
    }

    public void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        setContentView((View) mo56856v0().mo43112b());
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo56859y0();
    }

    /* renamed from: v0 */
    public final C5886ha mo56856v0() {
        return (C5886ha) this.f41455A.getValue();
    }

    /* renamed from: w0 */
    public final ClipboardManager mo56857w0() {
        return (ClipboardManager) this.f41457y.getValue();
    }

    /* renamed from: x0 */
    public final int mo56858x0() {
        return ((Number) this.f41456B.getValue()).intValue();
    }

    /* renamed from: y0 */
    public final void mo56859y0() {
        C5886ha v0 = mo56856v0();
        int x0 = mo56858x0();
        Integer[] numArr = new Integer[x0];
        for (int i = 0; i < x0; i++) {
            numArr[i] = 1;
        }
        int x02 = mo56858x0();
        EditText[] editTextArr = new EditText[x02];
        for (int i2 = 0; i2 < x02; i2++) {
            editTextArr[i2] = null;
        }
        int x03 = mo56858x0();
        int i3 = 0;
        while (i3 < x03) {
            int i4 = i3 + 1;
            View inflate = LayoutInflater.from(this).inflate(R.layout.include_word, v0.f29487f, false);
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
            v0.f29487f.addView(inflate);
            i3 = i4;
        }
        v0.f29488g.setReferencedIds(ArraysKt___ArraysKt.m47284j0(numArr));
        v0.f29485d.setOnClickListener(new xs2(this, editTextArr));
        v0.f29486e.setOnClickListener(new ys2(this, editTextArr));
        v0.f29484c.setOnClickListener(new zs2(this, editTextArr));
        v0.f29483b.setOnClickListener(new at2(this));
    }
}
