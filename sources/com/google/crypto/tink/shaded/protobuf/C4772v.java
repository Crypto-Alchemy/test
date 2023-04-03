package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v */
/* compiled from: LazyFieldLite */
public class C4772v {

    /* renamed from: e */
    public static final C4734l f25300e = C4734l.m38174b();

    /* renamed from: a */
    public ByteString f25301a;

    /* renamed from: b */
    public C4734l f25302b;

    /* renamed from: c */
    public volatile C4705c0 f25303c;

    /* renamed from: d */
    public volatile ByteString f25304d;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f25303c = r4;
        r3.f25304d = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36053a(com.google.crypto.tink.shaded.protobuf.C4705c0 r4) {
        /*
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.c0 r0 = r3.f25303c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.crypto.tink.shaded.protobuf.c0 r0 = r3.f25303c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.f25301a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            km4 r0 = r4.getParserForType()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.f25301a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.l r2 = r3.f25302b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.mo35616b(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.c0 r0 = (com.google.crypto.tink.shaded.protobuf.C4705c0) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f25303c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.f25301a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f25304d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f25303c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f25304d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f25303c = r4     // Catch:{ all -> 0x0034 }
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch:{ all -> 0x0034 }
            r3.f25304d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4772v.mo36053a(com.google.crypto.tink.shaded.protobuf.c0):void");
    }

    /* renamed from: b */
    public int mo36054b() {
        if (this.f25304d != null) {
            return this.f25304d.size();
        }
        ByteString byteString = this.f25301a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f25303c != null) {
            return this.f25303c.getSerializedSize();
        }
        return 0;
    }

    /* renamed from: c */
    public C4705c0 mo36055c(C4705c0 c0Var) {
        mo36053a(c0Var);
        return this.f25303c;
    }

    /* renamed from: d */
    public C4705c0 mo36056d(C4705c0 c0Var) {
        C4705c0 c0Var2 = this.f25303c;
        this.f25301a = null;
        this.f25304d = null;
        this.f25303c = c0Var;
        return c0Var2;
    }

    /* renamed from: e */
    public ByteString mo36057e() {
        if (this.f25304d != null) {
            return this.f25304d;
        }
        ByteString byteString = this.f25301a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f25304d != null) {
                ByteString byteString2 = this.f25304d;
                return byteString2;
            }
            if (this.f25303c == null) {
                this.f25304d = ByteString.EMPTY;
            } else {
                this.f25304d = this.f25303c.toByteString();
            }
            ByteString byteString3 = this.f25304d;
            return byteString3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4772v)) {
            return false;
        }
        C4772v vVar = (C4772v) obj;
        C4705c0 c0Var = this.f25303c;
        C4705c0 c0Var2 = vVar.f25303c;
        if (c0Var == null && c0Var2 == null) {
            return mo36057e().equals(vVar.mo36057e());
        }
        if (c0Var != null && c0Var2 != null) {
            return c0Var.equals(c0Var2);
        }
        if (c0Var != null) {
            return c0Var.equals(vVar.mo36055c(c0Var.getDefaultInstanceForType()));
        }
        return mo36055c(c0Var2.getDefaultInstanceForType()).equals(c0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
