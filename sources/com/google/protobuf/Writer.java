package com.google.protobuf;

import com.google.protobuf.C5032z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* renamed from: A */
    void mo37000A(int i, List<Boolean> list, boolean z) throws IOException;

    /* renamed from: B */
    void mo37001B(int i, float f) throws IOException;

    @Deprecated
    /* renamed from: C */
    void mo37002C(int i) throws IOException;

    /* renamed from: D */
    void mo37003D(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: E */
    void mo37004E(int i, int i2) throws IOException;

    /* renamed from: F */
    void mo37005F(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: G */
    void mo37006G(int i, List<Double> list, boolean z) throws IOException;

    /* renamed from: H */
    void mo37007H(int i, int i2) throws IOException;

    /* renamed from: I */
    void mo37008I(int i, List<ByteString> list) throws IOException;

    /* renamed from: J */
    void mo37009J(int i, List<?> list, C4984j0 j0Var) throws IOException;

    @Deprecated
    /* renamed from: K */
    void mo37010K(int i, Object obj, C4984j0 j0Var) throws IOException;

    /* renamed from: L */
    void mo37011L(int i, ByteString byteString) throws IOException;

    @Deprecated
    /* renamed from: M */
    void mo37012M(int i, List<?> list, C4984j0 j0Var) throws IOException;

    /* renamed from: N */
    void mo37013N(int i, Object obj, C4984j0 j0Var) throws IOException;

    /* renamed from: O */
    <K, V> void mo37014O(int i, C5032z.C5033a<K, V> aVar, Map<K, V> map) throws IOException;

    /* renamed from: a */
    void mo37015a(int i, List<Float> list, boolean z) throws IOException;

    /* renamed from: b */
    void mo37016b(int i, Object obj) throws IOException;

    /* renamed from: c */
    void mo37017c(int i, int i2) throws IOException;

    /* renamed from: d */
    void mo37018d(int i, List<String> list) throws IOException;

    /* renamed from: e */
    void mo37019e(int i, String str) throws IOException;

    /* renamed from: f */
    void mo37020f(int i, long j) throws IOException;

    /* renamed from: g */
    void mo37021g(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: h */
    void mo37022h(int i, int i2) throws IOException;

    /* renamed from: i */
    void mo37023i(int i, long j) throws IOException;

    /* renamed from: j */
    void mo37024j(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: k */
    void mo37025k(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: l */
    void mo37026l(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: m */
    void mo37027m(int i, long j) throws IOException;

    /* renamed from: n */
    void mo37028n(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: o */
    void mo37029o(int i, int i2) throws IOException;

    /* renamed from: p */
    void mo37030p(int i, double d) throws IOException;

    /* renamed from: q */
    void mo37031q(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: r */
    void mo37032r(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: s */
    void mo37033s(int i, long j) throws IOException;

    /* renamed from: t */
    FieldOrder mo37034t();

    /* renamed from: u */
    void mo37035u(int i, long j) throws IOException;

    /* renamed from: v */
    void mo37036v(int i, boolean z) throws IOException;

    /* renamed from: w */
    void mo37037w(int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: x */
    void mo37038x(int i) throws IOException;

    /* renamed from: y */
    void mo37039y(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: z */
    void mo37040z(int i, List<Integer> list, boolean z) throws IOException;
}
