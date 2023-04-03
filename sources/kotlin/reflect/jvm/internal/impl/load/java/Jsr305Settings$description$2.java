package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* compiled from: Jsr305Settings.kt */
public final class Jsr305Settings$description$2 extends Lambda implements pc2<String[]> {
    public final /* synthetic */ Jsr305Settings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Jsr305Settings$description$2(Jsr305Settings jsr305Settings) {
        super(0);
        this.this$0 = jsr305Settings;
    }

    public final String[] invoke() {
        Jsr305Settings jsr305Settings = this.this$0;
        List c = bk0.m32596c();
        c.add(jsr305Settings.mo53445a().getDescription());
        ReportLevel b = jsr305Settings.mo53446b();
        if (b != null) {
            c.add("under-migration:" + b.getDescription());
        }
        for (Map.Entry next : jsr305Settings.mo53447c().entrySet()) {
            c.add('@' + next.getKey() + ':' + ((ReportLevel) next.getValue()).getDescription());
        }
        Object[] array = bk0.m32594a(c).toArray(new String[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }
}
