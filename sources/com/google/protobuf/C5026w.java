package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.w */
/* compiled from: LazyStringArrayList */
public class C5026w extends C4955c<String> implements wf3, RandomAccess {

    /* renamed from: e */
    public static final C5026w f25761e;

    /* renamed from: g */
    public static final wf3 f25762g;

    /* renamed from: d */
    public final List<Object> f25763d;

    static {
        C5026w wVar = new C5026w();
        f25761e = wVar;
        wVar.mo37085p();
        f25762g = wVar;
    }

    public C5026w() {
        this(10);
    }

    /* renamed from: k */
    public static String m39953k(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return C5011t.m39936j((byte[]) obj);
    }

    /* renamed from: K */
    public void mo37544K(ByteString byteString) {
        mo37082e();
        this.f25763d.add(byteString);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        mo37082e();
        this.f25763d.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public List<?> mo37547i() {
        return Collections.unmodifiableList(this.f25763d);
    }

    /* renamed from: j */
    public void add(int i, String str) {
        mo37082e();
        this.f25763d.add(i, str);
        this.modCount++;
    }

    /* renamed from: l */
    public wf3 mo37549l() {
        if (mo37090v()) {
            return new d47(this);
        }
        return this;
    }

    /* renamed from: m */
    public Object mo37550m(int i) {
        return this.f25763d.get(i);
    }

    /* renamed from: n */
    public String get(int i) {
        Object obj = this.f25763d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f25763d.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String j = C5011t.m39936j(bArr);
        if (C5011t.m39933g(bArr)) {
            this.f25763d.set(i, j);
        }
        return j;
    }

    /* renamed from: o */
    public C5026w mo37216a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f25763d);
            return new C5026w((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public String remove(int i) {
        mo37082e();
        Object remove = this.f25763d.remove(i);
        this.modCount++;
        return m39953k(remove);
    }

    /* renamed from: r */
    public String set(int i, String str) {
        mo37082e();
        return m39953k(this.f25763d.set(i, str));
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f25763d.size();
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ boolean mo37090v() {
        return super.mo37090v();
    }

    public C5026w(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo37082e();
        if (collection instanceof wf3) {
            collection = ((wf3) collection).mo37547i();
        }
        boolean addAll = this.f25763d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C5026w(ArrayList<Object> arrayList) {
        this.f25763d = arrayList;
    }
}
