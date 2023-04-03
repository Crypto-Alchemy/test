package com.google.protobuf;

/* renamed from: com.google.protobuf.v */
/* compiled from: LazyFieldLite */
public class C5025v {

    /* renamed from: e */
    public static final C4987l f25756e = C4987l.m39771b();

    /* renamed from: a */
    public ByteString f25757a;

    /* renamed from: b */
    public C4987l f25758b;

    /* renamed from: c */
    public volatile C4956c0 f25759c;

    /* renamed from: d */
    public volatile ByteString f25760d;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f25759c = r4;
        r3.f25760d = com.google.protobuf.ByteString.EMPTY;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37539a(com.google.protobuf.C4956c0 r4) {
        /*
            r3 = this;
            com.google.protobuf.c0 r0 = r3.f25759c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.c0 r0 = r3.f25759c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.protobuf.ByteString r0 = r3.f25757a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            im4 r0 = r4.getParserForType()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r1 = r3.f25757a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.l r2 = r3.f25758b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.mo37070b(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.c0 r0 = (com.google.protobuf.C4956c0) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f25759c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = r3.f25757a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f25760d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f25759c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f25760d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f25759c = r4     // Catch:{ all -> 0x0034 }
            com.google.protobuf.ByteString r4 = com.google.protobuf.ByteString.EMPTY     // Catch:{ all -> 0x0034 }
            r3.f25760d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5025v.mo37539a(com.google.protobuf.c0):void");
    }

    /* renamed from: b */
    public int mo37540b() {
        if (this.f25760d != null) {
            return this.f25760d.size();
        }
        ByteString byteString = this.f25757a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f25759c != null) {
            return this.f25759c.getSerializedSize();
        }
        return 0;
    }

    /* renamed from: c */
    public C4956c0 mo37541c(C4956c0 c0Var) {
        mo37539a(c0Var);
        return this.f25759c;
    }

    /* renamed from: d */
    public C4956c0 mo37542d(C4956c0 c0Var) {
        C4956c0 c0Var2 = this.f25759c;
        this.f25757a = null;
        this.f25760d = null;
        this.f25759c = c0Var;
        return c0Var2;
    }

    /* renamed from: e */
    public ByteString mo37543e() {
        if (this.f25760d != null) {
            return this.f25760d;
        }
        ByteString byteString = this.f25757a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f25760d != null) {
                ByteString byteString2 = this.f25760d;
                return byteString2;
            }
            if (this.f25759c == null) {
                this.f25760d = ByteString.EMPTY;
            } else {
                this.f25760d = this.f25759c.toByteString();
            }
            ByteString byteString3 = this.f25760d;
            return byteString3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5025v)) {
            return false;
        }
        C5025v vVar = (C5025v) obj;
        C4956c0 c0Var = this.f25759c;
        C4956c0 c0Var2 = vVar.f25759c;
        if (c0Var == null && c0Var2 == null) {
            return mo37543e().equals(vVar.mo37543e());
        }
        if (c0Var != null && c0Var2 != null) {
            return c0Var.equals(c0Var2);
        }
        if (c0Var != null) {
            return c0Var.equals(vVar.mo37541c(c0Var.getDefaultInstanceForType()));
        }
        return mo37541c(c0Var2.getDefaultInstanceForType()).equals(c0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
