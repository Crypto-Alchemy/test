package p000;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.android.HandlerContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lgi;", "Lwm3;", "", "allFactories", "Lvm3;", "b", "", "a", "", "c", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: gi */
/* compiled from: HandlerDispatcher.kt */
public final class C7131gi implements wm3 {
    /* renamed from: a */
    public String mo51923a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* renamed from: b */
    public vm3 mo51924b(List<? extends wm3> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(uk2.m72807a(mainLooper, true), (String) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    /* renamed from: c */
    public int mo51925c() {
        return 1073741823;
    }
}
