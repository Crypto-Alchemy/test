package p000;

import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* renamed from: wx4 */
/* compiled from: ProtoBufUtil.kt */
public final class wx4 {
    /* renamed from: a */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T m73751a(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.C7604e<M, T> eVar) {
        vx2.m53591g(extendableMessage, "<this>");
        vx2.m53591g(eVar, "extension");
        if (extendableMessage.hasExtension(eVar)) {
            return extendableMessage.getExtension(eVar);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<M, java.util.List<T>>, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M>, T> T m73752b(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M> r1, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C7604e<M, java.util.List<T>> r2, int r3) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r1, r0)
            java.lang.String r0 = "extension"
            p000.vx2.m53591g(r2, r0)
            int r0 = r1.getExtensionCount(r2)
            if (r3 >= r0) goto L_0x0015
            java.lang.Object r1 = r1.getExtension(r2, r3)
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wx4.m73752b(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e, int):java.lang.Object");
    }
}
