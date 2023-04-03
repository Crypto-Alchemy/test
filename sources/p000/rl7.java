package p000;

import android.content.Context;
import kotlin.Metadata;
import net.safemoon.androidwallet.domain.useCase.wipe.AsyncWipeDataUseCase;
import net.safemoon.androidwallet.domain.useCase.wipe.WipeAppDataUseCase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Lrl7;", "", "Landroid/content/Context;", "context", "Llp2;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rl7 */
/* compiled from: WipeAppDataUseCaseProvider.kt */
public final class rl7 {

    /* renamed from: a */
    public static final rl7 f44431a = new rl7();

    /* renamed from: a */
    public static final lp2 m71598a(Context context) {
        vx2.m53591g(context, "context");
        return new AsyncWipeDataUseCase(new WipeAppDataUseCase(context, ck0.m33065m(C7126gf.f38011a, c02.f37027a, qu4.f44243a, c67.f37071a)));
    }
}
