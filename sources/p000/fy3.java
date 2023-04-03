package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import p000.iu3;
import p000.ju3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\b\u0005B\u0017\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lfy3;", "T", "Lju3;", "Liu3;", "message", "b", "(Liu3;)Ljava/lang/Object;", "data", "a", "(Ljava/lang/Object;)Liu3;", "Lcom/squareup/moshi/d;", "Lcom/squareup/moshi/d;", "jsonAdapter", "<init>", "(Lcom/squareup/moshi/d;)V", "scarlet-message-adapter-moshi"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: fy3 */
/* compiled from: MoshiMessageAdapter.kt */
public final class fy3<T> implements ju3<T> {

    /* renamed from: b */
    public static final C5854a f29023b = new C5854a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: c */
    public static final C5401h f29024c = new C5401h.C5402a().mo39416c();
    @Deprecated

    /* renamed from: d */
    public static final ByteString f29025d = ByteString.decodeHex("EFBBBF");

    /* renamed from: a */
    public final C5391d<T> f29026a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00060\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lfy3$a;", "", "Lcom/squareup/moshi/h;", "kotlin.jvm.PlatformType", "DEFAULT_MOSHI", "Lcom/squareup/moshi/h;", "Lokio/ByteString;", "UTF8_BOM", "Lokio/ByteString;", "<init>", "()V", "scarlet-message-adapter-moshi"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: fy3$a */
    /* compiled from: MoshiMessageAdapter.kt */
    public static final class C5854a {
        public C5854a() {
        }

        public /* synthetic */ C5854a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public fy3(C5391d<T> dVar) {
        this.f29026a = dVar;
    }

    public /* synthetic */ fy3(C5391d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    /* renamed from: a */
    public iu3 mo42689a(T t) {
        String h = this.f29026a.mo39367h(t);
        vx2.m53590f(h, "stringValue");
        return new iu3.C6007b(h);
    }

    /* renamed from: b */
    public T mo42690b(iu3 iu3) {
        String str;
        vx2.m53591g(iu3, ThrowableDeserializer.PROP_NAME_MESSAGE);
        if (iu3 instanceof iu3.C6007b) {
            str = ((iu3.C6007b) iu3).mo43937a();
        } else if (iu3 instanceof iu3.C6006a) {
            iu3.C6006a aVar = (iu3.C6006a) iu3;
            ByteString of = ByteString.m70310of(aVar.mo43936a(), 0, aVar.mo43936a().length);
            ByteString byteString = f29025d;
            if (of.startsWith(byteString)) {
                str = of.substring(byteString.size()).utf8();
            } else {
                str = of.utf8();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        T c = this.f29026a.mo39362c(str);
        vx2.m53588d(c);
        return c;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lfy3$b;", "Lju3$a;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lju3;", "a", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lju3;", "", "b", "([Ljava/lang/annotation/Annotation;)Ljava/util/Set;", "Lcom/squareup/moshi/h;", "Lcom/squareup/moshi/h;", "moshi", "Lfy3$b$a;", "Lfy3$b$a;", "config", "<init>", "(Lcom/squareup/moshi/h;Lfy3$b$a;)V", "scarlet-message-adapter-moshi"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: fy3$b */
    /* compiled from: MoshiMessageAdapter.kt */
    public static final class C5855b implements ju3.C6128a {

        /* renamed from: a */
        public final C5401h f29027a;

        /* renamed from: b */
        public final C5856a f29028b;

        public C5855b() {
            this((C5401h) null, (C5856a) null, 3, (DefaultConstructorMarker) null);
        }

        public C5855b(C5401h hVar, C5856a aVar) {
            vx2.m53591g(hVar, "moshi");
            vx2.m53591g(aVar, "config");
            this.f29027a = hVar;
            this.f29028b = aVar;
        }

        /* renamed from: a */
        public ju3<?> mo42691a(Type type, Annotation[] annotationArr) {
            vx2.m53591g(type, "type");
            vx2.m53591g(annotationArr, "annotations");
            C5391d<T> e = this.f29027a.mo39410e(type, mo42692b(annotationArr));
            C5856a aVar = this.f29028b;
            if (aVar.mo42694b()) {
                e = e.mo39364e();
            }
            if (aVar.mo42695c()) {
                e = e.mo39366g();
            }
            if (aVar.mo42693a()) {
                e = e.mo39361a();
            }
            vx2.m53590f(e, "adapter");
            return new fy3(e, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final Set<Annotation> mo42692b(Annotation[] annotationArr) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotationArr) {
                if (x73.m54253b(x73.m54252a(annotation)).isAnnotationPresent(r53.class)) {
                    arrayList.add(annotation);
                }
            }
            return CollectionsKt___CollectionsKt.m47315O0(arrayList);
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0013"}, mo44877d2 = {"Lfy3$b$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "lenient", "c", "serializeNull", "failOnUnknown", "<init>", "(ZZZ)V", "scarlet-message-adapter-moshi"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: fy3$b$a */
        /* compiled from: MoshiMessageAdapter.kt */
        public static final class C5856a {

            /* renamed from: a */
            public final boolean f29029a;

            /* renamed from: b */
            public final boolean f29030b;

            /* renamed from: c */
            public final boolean f29031c;

            public C5856a() {
                this(false, false, false, 7, (DefaultConstructorMarker) null);
            }

            public C5856a(boolean z, boolean z2, boolean z3) {
                this.f29029a = z;
                this.f29030b = z2;
                this.f29031c = z3;
            }

            /* renamed from: a */
            public final boolean mo42693a() {
                return this.f29031c;
            }

            /* renamed from: b */
            public final boolean mo42694b() {
                return this.f29029a;
            }

            /* renamed from: c */
            public final boolean mo42695c() {
                return this.f29030b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5856a)) {
                    return false;
                }
                C5856a aVar = (C5856a) obj;
                return this.f29029a == aVar.f29029a && this.f29030b == aVar.f29030b && this.f29031c == aVar.f29031c;
            }

            public int hashCode() {
                boolean z = this.f29029a;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.f29030b;
                if (z3) {
                    z3 = true;
                }
                int i2 = (i + (z3 ? 1 : 0)) * 31;
                boolean z4 = this.f29031c;
                if (!z4) {
                    z2 = z4;
                }
                return i2 + (z2 ? 1 : 0);
            }

            public String toString() {
                return "Config(lenient=" + this.f29029a + ", serializeNull=" + this.f29030b + ", failOnUnknown=" + this.f29031c + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C5856a(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C5855b(com.squareup.moshi.C5401h r7, p000.fy3.C5855b.C5856a r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r6 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x000d
                com.squareup.moshi.h r7 = p000.fy3.f29024c
                java.lang.String r10 = "DEFAULT_MOSHI"
                p000.vx2.m53590f(r7, r10)
            L_0x000d:
                r9 = r9 & 2
                if (r9 == 0) goto L_0x001c
                fy3$b$a r8 = new fy3$b$a
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 7
                r5 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5)
            L_0x001c:
                r6.<init>(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fy3.C5855b.<init>(com.squareup.moshi.h, fy3$b$a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
