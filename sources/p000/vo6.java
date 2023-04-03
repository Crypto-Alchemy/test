package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lvo6;", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "a", "Landroid/text/TextWatcher;", "origin", "", "d", "J", "delayInMills", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "g", "Ljava/lang/Runnable;", "runnable", "<init>", "(Landroid/text/TextWatcher;J)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vo6 */
/* compiled from: TextWithDelayAfterTextChangedWatcher.kt */
public final class vo6 implements TextWatcher {

    /* renamed from: a */
    public final TextWatcher f45338a;

    /* renamed from: d */
    public final long f45339d;

    /* renamed from: e */
    public final Handler f45340e;

    /* renamed from: g */
    public Runnable f45341g;

    public vo6(TextWatcher textWatcher, long j) {
        vx2.m53591g(textWatcher, "origin");
        this.f45338a = textWatcher;
        this.f45339d = j;
        this.f45340e = new Handler(Looper.getMainLooper());
        this.f45341g = new to6();
    }

    /* renamed from: c */
    public static final void m73315c(vo6 vo6, Editable editable) {
        vx2.m53591g(vo6, "this$0");
        vo6.f45338a.afterTextChanged(editable);
    }

    /* renamed from: d */
    public static final void m73316d() {
    }

    public void afterTextChanged(Editable editable) {
        this.f45340e.removeCallbacks(this.f45341g);
        uo6 uo6 = new uo6(this, editable);
        this.f45341g = uo6;
        this.f45340e.postDelayed(uo6, this.f45339d);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        vx2.m53591g(charSequence, "s");
        this.f45338a.beforeTextChanged(charSequence, i, i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        vx2.m53591g(charSequence, "s");
        this.f45338a.onTextChanged(charSequence, i, i2, i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vo6(TextWatcher textWatcher, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textWatcher, (i & 2) != 0 ? 100 : j);
    }
}
