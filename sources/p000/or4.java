package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lor4;", "", "Lpr4;", "pointerInputEvent", "Llt4;", "positionCalculator", "Lox2;", "b", "Lr37;", "a", "", "Lmr4;", "Lor4$a;", "Ljava/util/Map;", "previousPointerInputData", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: or4 */
/* compiled from: PointerInputEventProcessor.kt */
public final class or4 {

    /* renamed from: a */
    public final Map<mr4, C2987a> f16047a = new LinkedHashMap();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\rR \u0010\u0014\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, mo44877d2 = {"Lor4$a;", "", "", "a", "J", "c", "()J", "uptime", "Ltf4;", "b", "positionOnScreen", "", "Z", "()Z", "down", "Lyr4;", "d", "I", "getType-T8wyACA", "()I", "type", "<init>", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: or4$a */
    /* compiled from: PointerInputEventProcessor.kt */
    public static final class C2987a {

        /* renamed from: a */
        public final long f16048a;

        /* renamed from: b */
        public final long f16049b;

        /* renamed from: c */
        public final boolean f16050c;

        /* renamed from: d */
        public final int f16051d;

        public C2987a(long j, long j2, boolean z, int i) {
            this.f16048a = j;
            this.f16049b = j2;
            this.f16050c = z;
            this.f16051d = i;
        }

        public /* synthetic */ C2987a(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        /* renamed from: a */
        public final boolean mo24088a() {
            return this.f16050c;
        }

        /* renamed from: b */
        public final long mo24089b() {
            return this.f16049b;
        }

        /* renamed from: c */
        public final long mo24090c() {
            return this.f16048a;
        }
    }

    /* renamed from: a */
    public final void mo24086a() {
        this.f16047a.clear();
    }

    /* renamed from: b */
    public final ox2 mo24087b(pr4 pr4, lt4 lt4) {
        boolean z;
        long j;
        long j2;
        pr4 pr42 = pr4;
        lt4 lt42 = lt4;
        vx2.m53591g(pr42, "pointerInputEvent");
        vx2.m53591g(lt42, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pr4.mo24782b().size());
        List<qr4> b = pr4.mo24782b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            qr4 qr4 = b.get(i);
            C2987a aVar = this.f16047a.get(mr4.m22620a(qr4.mo25252c()));
            if (aVar == null) {
                j2 = qr4.mo25261j();
                j = qr4.mo25254e();
                z = false;
            } else {
                long c = aVar.mo24090c();
                j2 = c;
                z = aVar.mo24088a();
                j = lt42.mo3770j(aVar.mo24089b());
            }
            linkedHashMap.put(mr4.m22620a(qr4.mo25252c()), new nr4(qr4.mo25252c(), qr4.mo25261j(), qr4.mo25254e(), qr4.mo25250a(), qr4.mo25257g(), j2, j, z, false, qr4.mo25260i(), qr4.mo25251b(), qr4.mo25258h(), (DefaultConstructorMarker) null));
            if (qr4.mo25250a()) {
                Map<mr4, C2987a> map = this.f16047a;
                mr4 a = mr4.m22620a(qr4.mo25252c());
                C2987a aVar2 = r11;
                C2987a aVar3 = new C2987a(qr4.mo25261j(), qr4.mo25256f(), qr4.mo25250a(), qr4.mo25260i(), (DefaultConstructorMarker) null);
                map.put(a, aVar2);
            } else {
                this.f16047a.remove(mr4.m22620a(qr4.mo25252c()));
            }
        }
        return new ox2(linkedHashMap, pr42);
    }
}
