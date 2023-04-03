package p000;

import java.lang.reflect.Type;
import kotlin.Metadata;
import p000.ja6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"Li50;", "Lja6$a;", "Ljava/lang/reflect/Type;", "type", "Lja6;", "", "a", "<init>", "()V", "scarlet-stream-adapter-builtin"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: i50 */
/* compiled from: BuiltInStreamAdapterFactory.kt */
public final class i50 implements ja6.C6024a {
    /* renamed from: a */
    public ja6<Object, Object> mo40756a(Type type) {
        vx2.m53591g(type, "type");
        if (vx2.m53586b(y17.m54604b(type), ia6.class)) {
            return new hq2();
        }
        throw new IllegalArgumentException(type + " is not supported.");
    }
}
