package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;

/* renamed from: com.google.protobuf.z */
/* compiled from: MapEntryLite */
public class C5032z<K, V> {

    /* renamed from: a */
    public final C5033a<K, V> f25770a;

    /* renamed from: b */
    public final K f25771b;

    /* renamed from: c */
    public final V f25772c;

    /* renamed from: com.google.protobuf.z$a */
    /* compiled from: MapEntryLite */
    public static class C5033a<K, V> {

        /* renamed from: a */
        public final WireFormat.FieldType f25773a;

        /* renamed from: b */
        public final K f25774b;

        /* renamed from: c */
        public final WireFormat.FieldType f25775c;

        /* renamed from: d */
        public final V f25776d;

        public C5033a(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.f25773a = fieldType;
            this.f25774b = k;
            this.f25775c = fieldType2;
            this.f25776d = v;
        }
    }

    public C5032z(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.f25770a = new C5033a<>(fieldType, k, fieldType2, v);
        this.f25771b = k;
        this.f25772c = v;
    }

    /* renamed from: b */
    public static <K, V> int m39993b(C5033a<K, V> aVar, K k, V v) {
        return C5005p.m39867d(aVar.f25773a, 1, k) + C5005p.m39867d(aVar.f25775c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C5032z<K, V> m39994d(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new C5032z<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: e */
    public static <K, V> void m39995e(CodedOutputStream codedOutputStream, C5033a<K, V> aVar, K k, V v) throws IOException {
        C5005p.m39864A(codedOutputStream, aVar.f25773a, 1, k);
        C5005p.m39864A(codedOutputStream, aVar.f25775c, 2, v);
    }

    /* renamed from: a */
    public int mo37578a(int i, K k, V v) {
        return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(m39993b(this.f25770a, k, v));
    }

    /* renamed from: c */
    public C5033a<K, V> mo37579c() {
        return this.f25770a;
    }
}
