package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.vk4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\nB%\b\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0011"}, mo44877d2 = {"Lcl4;", "", "T", "Lz42;", "Lvk4;", "a", "Lz42;", "()Lz42;", "flow", "Li37;", "b", "Li37;", "()Li37;", "receiver", "<init>", "(Lz42;Li37;)V", "e", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: cl4 */
/* compiled from: PagingData.kt */
public final class cl4<T> {

    /* renamed from: c */
    public static final i37 f8462c;

    /* renamed from: d */
    public static final cl4<Object> f8463d;

    /* renamed from: e */
    public static final C1687b f8464e = new C1687b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final z42<vk4<T>> f8465a;

    /* renamed from: b */
    public final i37 f8466b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"cl4$a", "Li37;", "Lgf7;", "viewportHint", "Lr37;", "b", "a", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: cl4$a */
    /* compiled from: PagingData.kt */
    public static final class C1686a implements i37 {
        /* renamed from: a */
        public void mo8671a() {
        }

        /* renamed from: b */
        public void mo8672b(gf7 gf7) {
            vx2.m53591g(gf7, "viewportHint");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lcl4$b;", "", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: cl4$b */
    /* compiled from: PagingData.kt */
    public static final class C1687b {
        public C1687b() {
        }

        public /* synthetic */ C1687b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C1686a aVar = new C1686a();
        f8462c = aVar;
        f8463d = new cl4<>(e52.m57230v(vk4.C3493b.f18820g.mo27197d()), aVar);
    }

    public cl4(z42<? extends vk4<T>> z42, i37 i37) {
        vx2.m53591g(z42, "flow");
        vx2.m53591g(i37, "receiver");
        this.f8465a = z42;
        this.f8466b = i37;
    }

    /* renamed from: a */
    public final z42<vk4<T>> mo12107a() {
        return this.f8465a;
    }

    /* renamed from: b */
    public final i37 mo12108b() {
        return this.f8466b;
    }
}
