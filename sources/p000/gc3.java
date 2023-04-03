package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.logger.Level;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lgc3;", "", "Ldx3;", "modules", "d", "", "f", "([Ldx3;)Lgc3;", "", "e", "Lr37;", "a", "c", "Lfc3;", "Lfc3;", "b", "()Lfc3;", "koin", "", "Z", "allowOverride", "<init>", "()V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gc3 */
/* compiled from: KoinApplication.kt */
public final class gc3 {

    /* renamed from: c */
    public static final C7124a f38004c = new C7124a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final fc3 f38005a;

    /* renamed from: b */
    public boolean f38006b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lgc3$a;", "", "Lgc3;", "a", "<init>", "()V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gc3$a */
    /* compiled from: KoinApplication.kt */
    public static final class C7124a {
        public C7124a() {
        }

        public /* synthetic */ C7124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final gc3 mo51897a() {
            return new gc3((DefaultConstructorMarker) null);
        }
    }

    public gc3() {
        this.f38005a = new fc3();
        this.f38006b = true;
    }

    public /* synthetic */ gc3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo51891a() {
        this.f38005a.mo51631a();
    }

    /* renamed from: b */
    public final fc3 mo51892b() {
        return this.f38005a;
    }

    /* renamed from: c */
    public final void mo51893c(List<dx3> list) {
        this.f38005a.mo51637h(list, this.f38006b);
    }

    /* renamed from: d */
    public final gc3 mo51894d(dx3 dx3) {
        vx2.m53591g(dx3, "modules");
        return mo51895e(bk0.m32598e(dx3));
    }

    /* renamed from: e */
    public final gc3 mo51895e(List<dx3> list) {
        vx2.m53591g(list, "modules");
        tk3 e = this.f38005a.mo51634e();
        Level level = Level.INFO;
        if (e.mo66081b(level)) {
            kc3 kc3 = kc3.f38879a;
            long a = kc3.mo52889a();
            mo51893c(list);
            double doubleValue = ((Number) new Pair(r37.f33317a, Double.valueOf(((double) (kc3.mo52889a() - a)) / 1000000.0d)).getSecond()).doubleValue();
            int k = this.f38005a.mo51633d().mo50744k();
            tk3 e2 = this.f38005a.mo51634e();
            e2.mo66080a(level, "loaded " + k + " definitions in " + doubleValue + " ms");
        } else {
            mo51893c(list);
        }
        return this;
    }

    /* renamed from: f */
    public final gc3 mo51896f(dx3... dx3Arr) {
        vx2.m53591g(dx3Arr, "modules");
        return mo51895e(ArraysKt___ArraysKt.m47291q0(dx3Arr));
    }
}
