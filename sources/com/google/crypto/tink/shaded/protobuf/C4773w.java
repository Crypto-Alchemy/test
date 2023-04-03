package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w */
/* compiled from: LazyStringArrayList */
public class C4773w extends C4704c<String> implements yf3, RandomAccess {

    /* renamed from: e */
    public static final C4773w f25305e;

    /* renamed from: g */
    public static final yf3 f25306g;

    /* renamed from: d */
    public final List<Object> f25307d;

    static {
        C4773w wVar = new C4773w();
        f25305e = wVar;
        wVar.mo35628p();
        f25306g = wVar;
    }

    public C4773w() {
        this(10);
    }

    /* renamed from: k */
    public static String m38341k(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return C4758t.m38329j((byte[]) obj);
    }

    /* renamed from: a1 */
    public void mo36058a1(ByteString byteString) {
        mo35625e();
        this.f25307d.add(byteString);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        mo35625e();
        this.f25307d.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public List<?> mo36061i() {
        return Collections.unmodifiableList(this.f25307d);
    }

    /* renamed from: j */
    public void add(int i, String str) {
        mo35625e();
        this.f25307d.add(i, str);
        this.modCount++;
    }

    /* renamed from: l */
    public yf3 mo36063l() {
        if (mo35633v()) {
            return new f47(this);
        }
        return this;
    }

    /* renamed from: m */
    public Object mo36064m(int i) {
        return this.f25307d.get(i);
    }

    /* renamed from: n */
    public String get(int i) {
        Object obj = this.f25307d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f25307d.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String j = C4758t.m38329j(bArr);
        if (C4758t.m38326g(bArr)) {
            this.f25307d.set(i, j);
        }
        return j;
    }

    /* renamed from: o */
    public C4773w mo35757a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f25307d);
            return new C4773w((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public String remove(int i) {
        mo35625e();
        Object remove = this.f25307d.remove(i);
        this.modCount++;
        return m38341k(remove);
    }

    /* renamed from: r */
    public String set(int i, String str) {
        mo35625e();
        return m38341k(this.f25307d.set(i, str));
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f25307d.size();
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ boolean mo35633v() {
        return super.mo35633v();
    }

    public C4773w(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo35625e();
        if (collection instanceof yf3) {
            collection = ((yf3) collection).mo36061i();
        }
        boolean addAll = this.f25307d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C4773w(ArrayList<Object> arrayList) {
        this.f25307d = arrayList;
    }
}
