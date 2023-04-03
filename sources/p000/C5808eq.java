package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0007\u0018\u0000 F*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00018B\u0011\b\u0016\u0012\u0006\u0010B\u001a\u00020\u0003¢\u0006\u0004\bC\u0010DB\t\b\u0016¢\u0006\u0004\bC\u0010EJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001e\u0010\u0015J\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\"J\u0016\u0010#\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001e\u0010#\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010$\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010!J\u0017\u0010)\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010!J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010%J\u0016\u0010.\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010/\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\b\u00100\u001a\u00020\u0005H\u0016J)\u00104\u001a\b\u0012\u0004\u0012\u00028\u000102\"\u0004\b\u0001\u001012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010602H\u0016¢\u0006\u0004\b4\u00107R\u0016\u0010:\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010A\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b?\u0010@¨\u0006G"}, mo44877d2 = {"Leq;", "E", "Lp6;", "", "minCapacity", "Lr37;", "n", "newCapacity", "j", "index", "u", "t", "r", "k", "internalIndex", "", "elements", "e", "", "isEmpty", "first", "()Ljava/lang/Object;", "q", "last", "s", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "w", "removeLast", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "a", "I", "head", "d", "[Ljava/lang/Object;", "elementData", "<set-?>", "getSize", "()I", "size", "initialCapacity", "<init>", "(I)V", "()V", "g", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: eq */
/* compiled from: ArrayDeque.kt */
public final class C5808eq<E> extends C6341p6<E> {

    /* renamed from: g */
    public static final C5809a f28642g = new C5809a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final Object[] f28643k = new Object[0];

    /* renamed from: a */
    public int f28644a;

    /* renamed from: d */
    public Object[] f28645d;

    /* renamed from: e */
    public int f28646e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, mo44877d2 = {"Leq$a;", "", "", "oldCapacity", "minCapacity", "a", "(II)I", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: eq$a */
    /* compiled from: ArrayDeque.kt */
    public static final class C5809a {
        public C5809a() {
        }

        public /* synthetic */ C5809a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42378a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    public C5808eq(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f28643k;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f28645d = objArr;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        vx2.m53591g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        mo42362n(size() + collection.size());
        mo42352e(mo42376u(this.f28644a + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        mo42362n(size() + 1);
        int k = mo42359k(this.f28644a);
        this.f28644a = k;
        this.f28645d[k] = e;
        this.f28646e = size() + 1;
    }

    public final void addLast(E e) {
        mo42362n(size() + 1);
        this.f28645d[mo42376u(this.f28644a + size())] = e;
        this.f28646e = size() + 1;
    }

    public void clear() {
        int u = mo42376u(this.f28644a + size());
        int i = this.f28644a;
        if (i < u) {
            C6706xq.m54503q(this.f28645d, null, i, u);
        } else if (!isEmpty()) {
            Object[] objArr = this.f28645d;
            C6706xq.m54503q(objArr, null, this.f28644a, objArr.length);
            C6706xq.m54503q(this.f28645d, null, 0, u);
        }
        this.f28644a = 0;
        this.f28646e = 0;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo42352e(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f28645d.length;
        while (i < length && it.hasNext()) {
            this.f28645d[i] = it.next();
            i++;
        }
        int i2 = this.f28644a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f28645d[i3] = it.next();
        }
        this.f28646e = size() + collection.size();
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f28645d[this.f28644a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public E get(int i) {
        C5946i6.f29820a.mo43484b(i, size());
        return this.f28645d[mo42376u(this.f28644a + i)];
    }

    public int getSize() {
        return this.f28646e;
    }

    public int indexOf(Object obj) {
        int i;
        int u = mo42376u(this.f28644a + size());
        int i2 = this.f28644a;
        if (i2 < u) {
            while (i2 < u) {
                if (vx2.m53586b(obj, this.f28645d[i2])) {
                    i = this.f28644a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < u) {
            return -1;
        } else {
            int length = this.f28645d.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < u) {
                        if (vx2.m53586b(obj, this.f28645d[i3])) {
                            i2 = i3 + this.f28645d.length;
                            i = this.f28644a;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (vx2.m53586b(obj, this.f28645d[i2])) {
                    i = this.f28644a;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo42358j(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f28645d;
        C6706xq.m54495i(objArr2, objArr, 0, this.f28644a, objArr2.length);
        Object[] objArr3 = this.f28645d;
        int length = objArr3.length;
        int i2 = this.f28644a;
        C6706xq.m54495i(objArr3, objArr, length - i2, 0, i2);
        this.f28644a = 0;
        this.f28645d = objArr;
    }

    /* renamed from: k */
    public final int mo42359k(int i) {
        if (i == 0) {
            return ArraysKt___ArraysKt.m47261M(this.f28645d);
        }
        return i - 1;
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f28645d[mo42376u(this.f28644a + ck0.m33064l(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        int u = mo42376u(this.f28644a + size());
        int i3 = this.f28644a;
        if (i3 < u) {
            i = u - 1;
            if (i3 <= i) {
                while (!vx2.m53586b(obj, this.f28645d[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f28644a;
            }
            return -1;
        }
        if (i3 > u) {
            int i4 = u - 1;
            while (true) {
                if (-1 >= i4) {
                    int M = ArraysKt___ArraysKt.m47261M(this.f28645d);
                    int i5 = this.f28644a;
                    if (i5 <= M) {
                        while (!vx2.m53586b(obj, this.f28645d[i])) {
                            if (i != i5) {
                                M = i - 1;
                            }
                        }
                        i2 = this.f28644a;
                    }
                } else if (vx2.m53586b(obj, this.f28645d[i4])) {
                    i = i4 + this.f28645d.length;
                    i2 = this.f28644a;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    /* renamed from: n */
    public final void mo42362n(int i) {
        if (i >= 0) {
            Object[] objArr = this.f28645d;
            if (i > objArr.length) {
                if (objArr == f28643k) {
                    this.f28645d = new Object[d75.m43382d(i, 10)];
                } else {
                    mo42358j(f28642g.mo42378a(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    /* renamed from: q */
    public final E mo42363q() {
        if (isEmpty()) {
            return null;
        }
        return this.f28645d[this.f28644a];
    }

    /* renamed from: r */
    public final int mo42364r(int i) {
        if (i == ArraysKt___ArraysKt.m47261M(this.f28645d)) {
            return 0;
        }
        return i + 1;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            p000.vx2.m53591g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f28645d
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f28644a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo42376u(r0)
            int r3 = r11.f28644a
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f28645d
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f28645d
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f28645d
            p000.C6706xq.m54503q(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f28645d
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f28645d
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f28645d
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.mo42376u(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f28645d
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f28645d
            r3[r5] = r6
            int r5 = r11.mo42364r(r5)
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f28644a
            int r5 = r5 - r12
            int r12 = r11.mo42373t(r5)
            r11.f28646e = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5808eq.removeAll(java.util.Collection):boolean");
    }

    public E removeAt(int i) {
        C5946i6.f29820a.mo43484b(i, size());
        if (i == ck0.m33064l(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int u = mo42376u(this.f28644a + i);
        E e = this.f28645d[u];
        if (i < (size() >> 1)) {
            int i2 = this.f28644a;
            if (u >= i2) {
                Object[] objArr = this.f28645d;
                C6706xq.m54495i(objArr, objArr, i2 + 1, i2, u);
            } else {
                Object[] objArr2 = this.f28645d;
                C6706xq.m54495i(objArr2, objArr2, 1, 0, u);
                Object[] objArr3 = this.f28645d;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f28644a;
                C6706xq.m54495i(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f28645d;
            int i4 = this.f28644a;
            objArr4[i4] = null;
            this.f28644a = mo42364r(i4);
        } else {
            int u2 = mo42376u(this.f28644a + ck0.m33064l(this));
            if (u <= u2) {
                Object[] objArr5 = this.f28645d;
                C6706xq.m54495i(objArr5, objArr5, u, u + 1, u2 + 1);
            } else {
                Object[] objArr6 = this.f28645d;
                C6706xq.m54495i(objArr6, objArr6, u, u + 1, objArr6.length);
                Object[] objArr7 = this.f28645d;
                objArr7[objArr7.length - 1] = objArr7[0];
                C6706xq.m54495i(objArr7, objArr7, 0, 1, u2 + 1);
            }
            this.f28645d[u2] = null;
        }
        this.f28646e = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f28645d;
            int i = this.f28644a;
            E e = eArr[i];
            eArr[i] = null;
            this.f28644a = mo42364r(i);
            this.f28646e = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int u = mo42376u(this.f28644a + ck0.m33064l(this));
            E[] eArr = this.f28645d;
            E e = eArr[u];
            eArr[u] = null;
            this.f28646e = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            p000.vx2.m53591g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f28645d
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f28644a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo42376u(r0)
            int r3 = r11.f28644a
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f28645d
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f28645d
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f28645d
            p000.C6706xq.m54503q(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f28645d
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f28645d
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f28645d
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.mo42376u(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f28645d
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f28645d
            r3[r5] = r6
            int r5 = r11.mo42364r(r5)
            goto L_0x0084
        L_0x0083:
            r7 = r2
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f28644a
            int r5 = r5 - r12
            int r12 = r11.mo42373t(r5)
            r11.f28646e = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5808eq.retainAll(java.util.Collection):boolean");
    }

    /* renamed from: s */
    public final E mo42371s() {
        if (isEmpty()) {
            return null;
        }
        return this.f28645d[mo42376u(this.f28644a + ck0.m33064l(this))];
    }

    public E set(int i, E e) {
        C5946i6.f29820a.mo43484b(i, size());
        int u = mo42376u(this.f28644a + i);
        E[] eArr = this.f28645d;
        E e2 = eArr[u];
        eArr[u] = e;
        return e2;
    }

    /* renamed from: t */
    public final int mo42373t(int i) {
        if (i < 0) {
            return i + this.f28645d.length;
        }
        return i;
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "array");
        if (tArr.length < size()) {
            tArr = C6605vq.m53452a(tArr, size());
        }
        int u = mo42376u(this.f28644a + size());
        int i = this.f28644a;
        if (i < u) {
            C6706xq.m54499m(this.f28645d, tArr, 0, i, u, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f28645d;
            C6706xq.m54495i(objArr, tArr, 0, this.f28644a, objArr.length);
            Object[] objArr2 = this.f28645d;
            C6706xq.m54495i(objArr2, tArr, objArr2.length - this.f28644a, 0, u);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    /* renamed from: u */
    public final int mo42376u(int i) {
        Object[] objArr = this.f28645d;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    /* renamed from: w */
    public final E mo42377w() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public void add(int i, E e) {
        C5946i6.f29820a.mo43485c(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            mo42362n(size() + 1);
            int u = mo42376u(this.f28644a + i);
            if (i < ((size() + 1) >> 1)) {
                int k = mo42359k(u);
                int k2 = mo42359k(this.f28644a);
                int i2 = this.f28644a;
                if (k >= i2) {
                    Object[] objArr = this.f28645d;
                    objArr[k2] = objArr[i2];
                    C6706xq.m54495i(objArr, objArr, i2, i2 + 1, k + 1);
                } else {
                    Object[] objArr2 = this.f28645d;
                    C6706xq.m54495i(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f28645d;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C6706xq.m54495i(objArr3, objArr3, 0, 1, k + 1);
                }
                this.f28645d[k] = e;
                this.f28644a = k2;
            } else {
                int u2 = mo42376u(this.f28644a + size());
                if (u < u2) {
                    Object[] objArr4 = this.f28645d;
                    C6706xq.m54495i(objArr4, objArr4, u + 1, u, u2);
                } else {
                    Object[] objArr5 = this.f28645d;
                    C6706xq.m54495i(objArr5, objArr5, 1, 0, u2);
                    Object[] objArr6 = this.f28645d;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C6706xq.m54495i(objArr6, objArr6, u + 1, u, objArr6.length - 1);
                }
                this.f28645d[u] = e;
            }
            this.f28646e = size() + 1;
        }
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        vx2.m53591g(collection, "elements");
        C5946i6.f29820a.mo43485c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        mo42362n(size() + collection.size());
        int u = mo42376u(this.f28644a + size());
        int u2 = mo42376u(this.f28644a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f28644a;
            int i3 = i2 - size;
            if (u2 < i2) {
                Object[] objArr = this.f28645d;
                C6706xq.m54495i(objArr, objArr, i3, i2, objArr.length);
                if (size >= u2) {
                    Object[] objArr2 = this.f28645d;
                    C6706xq.m54495i(objArr2, objArr2, objArr2.length - size, 0, u2);
                } else {
                    Object[] objArr3 = this.f28645d;
                    C6706xq.m54495i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f28645d;
                    C6706xq.m54495i(objArr4, objArr4, 0, size, u2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f28645d;
                C6706xq.m54495i(objArr5, objArr5, i3, i2, u2);
            } else {
                Object[] objArr6 = this.f28645d;
                i3 += objArr6.length;
                int i4 = u2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C6706xq.m54495i(objArr6, objArr6, i3, i2, u2);
                } else {
                    C6706xq.m54495i(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f28645d;
                    C6706xq.m54495i(objArr7, objArr7, 0, this.f28644a + length, u2);
                }
            }
            this.f28644a = i3;
            mo42352e(mo42373t(u2 - size), collection);
        } else {
            int i5 = u2 + size;
            if (u2 < u) {
                int i6 = size + u;
                Object[] objArr8 = this.f28645d;
                if (i6 <= objArr8.length) {
                    C6706xq.m54495i(objArr8, objArr8, i5, u2, u);
                } else if (i5 >= objArr8.length) {
                    C6706xq.m54495i(objArr8, objArr8, i5 - objArr8.length, u2, u);
                } else {
                    int length2 = u - (i6 - objArr8.length);
                    C6706xq.m54495i(objArr8, objArr8, 0, length2, u);
                    Object[] objArr9 = this.f28645d;
                    C6706xq.m54495i(objArr9, objArr9, i5, u2, length2);
                }
            } else {
                Object[] objArr10 = this.f28645d;
                C6706xq.m54495i(objArr10, objArr10, size, 0, u);
                Object[] objArr11 = this.f28645d;
                if (i5 >= objArr11.length) {
                    C6706xq.m54495i(objArr11, objArr11, i5 - objArr11.length, u2, objArr11.length);
                } else {
                    C6706xq.m54495i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f28645d;
                    C6706xq.m54495i(objArr12, objArr12, i5, u2, objArr12.length - size);
                }
            }
            mo42352e(u2, collection);
        }
        return true;
    }

    public C5808eq() {
        this.f28645d = f28643k;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
