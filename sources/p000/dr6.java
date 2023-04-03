package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.pt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0010\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Ldr6;", "Lpt0$a;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Log5;", "retrofit", "Lpt0;", "Lokhttp3/ResponseBody;", "d", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Log5;)Lpt0;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "c", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Log5;)Lpt0;", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dr6 */
/* compiled from: ToStringConverterFactory.kt */
public class dr6 extends pt0.C9195a {

    /* renamed from: a */
    public static final C7001a f37386a = new C7001a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final MediaType f37387b = MediaType.Companion.parse("text/plain");

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Ldr6$a;", "", "Lokhttp3/MediaType;", "MEDIA_TYPE", "Lokhttp3/MediaType;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dr6$a */
    /* compiled from: ToStringConverterFactory.kt */
    public static final class C7001a {
        public C7001a() {
        }

        public /* synthetic */ C7001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: h */
    public static final RequestBody m57069h(String str) {
        RequestBody.Companion companion = RequestBody.Companion;
        vx2.m53590f(str, "value");
        return companion.create(str, f37387b);
    }

    /* renamed from: i */
    public static final String m57070i(ResponseBody responseBody) {
        return responseBody.string();
    }

    /* renamed from: c */
    public pt0<?, RequestBody> mo51276c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, og5 og5) {
        vx2.m53591g(type, "type");
        vx2.m53591g(annotationArr, "parameterAnnotations");
        vx2.m53591g(annotationArr2, "methodAnnotations");
        vx2.m53591g(og5, "retrofit");
        if (vx2.m53586b(String.class, type)) {
            return new cr6();
        }
        return null;
    }

    /* renamed from: d */
    public pt0<ResponseBody, ?> mo51277d(Type type, Annotation[] annotationArr, og5 og5) {
        vx2.m53591g(type, "type");
        vx2.m53591g(annotationArr, "annotations");
        vx2.m53591g(og5, "retrofit");
        if (vx2.m53586b(String.class, type)) {
            return new br6();
        }
        return null;
    }
}
