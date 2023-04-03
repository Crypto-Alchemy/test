package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u0003BC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0015"}, mo44877d2 = {"Lbl4;", "", "", "a", "I", "pageSize", "b", "prefetchDistance", "", "c", "Z", "enablePlaceholders", "d", "initialLoadSize", "e", "maxSize", "f", "jumpThreshold", "<init>", "(IIZIII)V", "g", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: bl4 */
/* compiled from: PagingConfig.kt */
public final class bl4 {

    /* renamed from: g */
    public static final C1639a f8177g = new C1639a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f8178a;

    /* renamed from: b */
    public final int f8179b;

    /* renamed from: c */
    public final boolean f8180c;

    /* renamed from: d */
    public final int f8181d;

    /* renamed from: e */
    public final int f8182e;

    /* renamed from: f */
    public final int f8183f;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo44877d2 = {"Lbl4$a;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "MAX_SIZE_UNBOUNDED", "getMAX_SIZE_UNBOUNDED$annotations", "()V", "<init>", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: bl4$a */
    /* compiled from: PagingConfig.kt */
    public static final class C1639a {
        public C1639a() {
        }

        public /* synthetic */ C1639a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bl4(int i, int i2, boolean z, int i3, int i4, int i5) {
        this.f8178a = i;
        this.f8179b = i2;
        this.f8180c = z;
        this.f8181d = i3;
        this.f8182e = i4;
        this.f8183f = i5;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        } else if (i4 == Integer.MAX_VALUE || i4 >= (i2 * 2) + i) {
            if (!(i5 == Integer.MIN_VALUE || i5 > 0)) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
        } else {
            throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist" + ", pageSize=" + i + ", prefetchDist=" + i2 + ", maxSize=" + i4);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl4(int i, int i2, boolean z, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i6 & 2) != 0 ? i : i2, (i6 & 4) != 0 ? true : z, (i6 & 8) != 0 ? i * 3 : i3, (i6 & 16) != 0 ? Integer.MAX_VALUE : i4, (i6 & 32) != 0 ? Integer.MIN_VALUE : i5);
    }
}
