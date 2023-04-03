package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4779z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* renamed from: A */
    void mo35560A(int i, List<Boolean> list, boolean z) throws IOException;

    /* renamed from: B */
    void mo35561B(int i, float f) throws IOException;

    @Deprecated
    /* renamed from: C */
    void mo35562C(int i) throws IOException;

    /* renamed from: D */
    void mo35563D(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: E */
    void mo35564E(int i, int i2) throws IOException;

    /* renamed from: F */
    void mo35565F(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: G */
    void mo35566G(int i, List<Double> list, boolean z) throws IOException;

    /* renamed from: H */
    void mo35567H(int i, int i2) throws IOException;

    /* renamed from: I */
    void mo35568I(int i, List<ByteString> list) throws IOException;

    /* renamed from: J */
    <K, V> void mo35569J(int i, C4779z.C4780a<K, V> aVar, Map<K, V> map) throws IOException;

    @Deprecated
    /* renamed from: K */
    void mo35570K(int i, Object obj, C4731j0 j0Var) throws IOException;

    /* renamed from: L */
    void mo35571L(int i, List<?> list, C4731j0 j0Var) throws IOException;

    /* renamed from: M */
    void mo35572M(int i, ByteString byteString) throws IOException;

    /* renamed from: N */
    void mo35573N(int i, Object obj, C4731j0 j0Var) throws IOException;

    @Deprecated
    /* renamed from: O */
    void mo35574O(int i, List<?> list, C4731j0 j0Var) throws IOException;

    /* renamed from: a */
    void mo35575a(int i, List<Float> list, boolean z) throws IOException;

    /* renamed from: b */
    void mo35576b(int i, Object obj) throws IOException;

    /* renamed from: c */
    void mo35577c(int i, int i2) throws IOException;

    /* renamed from: d */
    void mo35578d(int i, List<String> list) throws IOException;

    /* renamed from: e */
    void mo35579e(int i, String str) throws IOException;

    /* renamed from: f */
    void mo35580f(int i, long j) throws IOException;

    /* renamed from: g */
    void mo35581g(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: h */
    void mo35582h(int i, int i2) throws IOException;

    /* renamed from: i */
    void mo35583i(int i, long j) throws IOException;

    /* renamed from: j */
    void mo35584j(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: k */
    void mo35585k(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: l */
    void mo35586l(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: m */
    void mo35587m(int i, long j) throws IOException;

    /* renamed from: n */
    void mo35588n(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: o */
    void mo35589o(int i, int i2) throws IOException;

    /* renamed from: p */
    void mo35590p(int i, double d) throws IOException;

    /* renamed from: q */
    void mo35591q(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: r */
    void mo35592r(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: s */
    void mo35593s(int i, long j) throws IOException;

    /* renamed from: t */
    FieldOrder mo35594t();

    /* renamed from: u */
    void mo35595u(int i, long j) throws IOException;

    /* renamed from: v */
    void mo35596v(int i, boolean z) throws IOException;

    /* renamed from: w */
    void mo35597w(int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: x */
    void mo35598x(int i) throws IOException;

    /* renamed from: y */
    void mo35599y(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: z */
    void mo35600z(int i, List<Integer> list, boolean z) throws IOException;
}
