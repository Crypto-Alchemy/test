package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0014\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003.\u000b\u0006B!\b\u0001\u0012\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000-\u0012\u0006\u0010>\u001a\u00020\b¢\u0006\u0004\b?\u0010@J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010\u0011\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0006\u0010\u0014\u001a\u00020\nJ\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u0014\u0010\u0016\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0007J\u0014\u0010\u001f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010 \u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0015\u0010!\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u0016\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bJ\u0014\u0010&\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ \u0010'\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u001e\u0010,\u001a\u00020\n2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00028\u00000)j\b\u0012\u0004\u0012\u00028\u0000`*R0\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000-8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010>\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=¨\u0006A"}, mo44877d2 = {"Lv04;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "element", "", "c", "(Ljava/lang/Object;)Z", "", "index", "Lr37;", "b", "(ILjava/lang/Object;)V", "elements", "e", "", "f", "g", "", "h", "i", "j", "k", "capacity", "l", "o", "(Ljava/lang/Object;)I", "q", "r", "s", "t", "u", "w", "x", "(I)Ljava/lang/Object;", "start", "end", "A", "B", "D", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "E", "", "a", "[Ljava/lang/Object;", "m", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "()V", "content", "d", "Ljava/util/List;", "list", "<set-?>", "I", "n", "()I", "size", "<init>", "([Ljava/lang/Object;I)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: v04 */
/* compiled from: MutableVector.kt */
public final class v04<T> implements RandomAccess {

    /* renamed from: g */
    public static final int f18628g = 8;

    /* renamed from: a */
    public T[] f18629a;

    /* renamed from: d */
    public List<T> f18630d;

    /* renamed from: e */
    public int f18631e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, mo44877d2 = {"Lv04$a;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lr37;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "j", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Lv04;", "a", "Lv04;", "vector", "e", "()I", "size", "<init>", "(Lv04;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: v04$a */
    /* compiled from: MutableVector.kt */
    public static final class C3450a<T> implements List<T>, d93 {

        /* renamed from: a */
        public final v04<T> f18632a;

        public C3450a(v04<T> v04) {
            vx2.m53591g(v04, "vector");
            this.f18632a = v04;
        }

        public boolean add(T t) {
            return this.f18632a.mo26953c(t);
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            vx2.m53591g(collection, "elements");
            return this.f18632a.mo26955f(i, collection);
        }

        public void clear() {
            this.f18632a.mo26958i();
        }

        public boolean contains(Object obj) {
            return this.f18632a.mo26959j(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            vx2.m53591g(collection, "elements");
            return this.f18632a.mo26960k(collection);
        }

        /* renamed from: e */
        public int mo26979e() {
            return this.f18632a.mo26963n();
        }

        public T get(int i) {
            w04.m29209c(this, i);
            return this.f18632a.mo26962m()[i];
        }

        public int indexOf(Object obj) {
            return this.f18632a.mo26964o(obj);
        }

        public boolean isEmpty() {
            return this.f18632a.mo26965q();
        }

        public Iterator<T> iterator() {
            return new C3452c(this, 0);
        }

        /* renamed from: j */
        public T mo26984j(int i) {
            w04.m29209c(this, i);
            return this.f18632a.mo26971x(i);
        }

        public int lastIndexOf(Object obj) {
            return this.f18632a.mo26967s(obj);
        }

        public ListIterator<T> listIterator() {
            return new C3452c(this, 0);
        }

        public final /* bridge */ T remove(int i) {
            return mo26984j(i);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            vx2.m53591g(collection, "elements");
            return this.f18632a.mo26970w(collection);
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            vx2.m53591g(collection, "elements");
            return this.f18632a.mo26949B(collection);
        }

        public T set(int i, T t) {
            w04.m29209c(this, i);
            return this.f18632a.mo26950D(i, t);
        }

        public final /* bridge */ int size() {
            return mo26979e();
        }

        public List<T> subList(int i, int i2) {
            w04.m29210d(this, i, i2);
            return new C3451b(this, i, i2);
        }

        public Object[] toArray() {
            return jj0.m46524a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            vx2.m53591g(tArr, "array");
            return jj0.m46525b(this, tArr);
        }

        public void add(int i, T t) {
            this.f18632a.mo26952b(i, t);
        }

        public boolean addAll(Collection<? extends T> collection) {
            vx2.m53591g(collection, "elements");
            return this.f18632a.mo26956g(collection);
        }

        public ListIterator<T> listIterator(int i) {
            return new C3452c(this, i);
        }

        public boolean remove(Object obj) {
            return this.f18632a.mo26968t(obj);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0017\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010+\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010,¨\u00060"}, mo44877d2 = {"Lv04$b;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lr37;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "j", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "a", "Ljava/util/List;", "list", "d", "I", "start", "e", "end", "()I", "size", "<init>", "(Ljava/util/List;II)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: v04$b */
    /* compiled from: MutableVector.kt */
    public static final class C3451b<T> implements List<T>, d93 {

        /* renamed from: a */
        public final List<T> f18633a;

        /* renamed from: d */
        public final int f18634d;

        /* renamed from: e */
        public int f18635e;

        public C3451b(List<T> list, int i, int i2) {
            vx2.m53591g(list, "list");
            this.f18633a = list;
            this.f18634d = i;
            this.f18635e = i2;
        }

        public boolean add(T t) {
            List<T> list = this.f18633a;
            int i = this.f18635e;
            this.f18635e = i + 1;
            list.add(i, t);
            return true;
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            vx2.m53591g(collection, "elements");
            this.f18633a.addAll(i + this.f18634d, collection);
            this.f18635e += collection.size();
            return collection.size() > 0;
        }

        public void clear() {
            int i = this.f18635e - 1;
            int i2 = this.f18634d;
            if (i2 <= i) {
                while (true) {
                    this.f18633a.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.f18635e = this.f18634d;
        }

        public boolean contains(Object obj) {
            int i = this.f18635e;
            for (int i2 = this.f18634d; i2 < i; i2++) {
                if (vx2.m53586b(this.f18633a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            vx2.m53591g(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public int mo27004e() {
            return this.f18635e - this.f18634d;
        }

        public T get(int i) {
            w04.m29209c(this, i);
            return this.f18633a.get(i + this.f18634d);
        }

        public int indexOf(Object obj) {
            int i = this.f18635e;
            for (int i2 = this.f18634d; i2 < i; i2++) {
                if (vx2.m53586b(this.f18633a.get(i2), obj)) {
                    return i2 - this.f18634d;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            if (this.f18635e == this.f18634d) {
                return true;
            }
            return false;
        }

        public Iterator<T> iterator() {
            return new C3452c(this, 0);
        }

        /* renamed from: j */
        public T mo27009j(int i) {
            w04.m29209c(this, i);
            this.f18635e--;
            return this.f18633a.remove(i + this.f18634d);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f18635e - 1;
            int i2 = this.f18634d;
            if (i2 > i) {
                return -1;
            }
            while (!vx2.m53586b(this.f18633a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f18634d;
        }

        public ListIterator<T> listIterator() {
            return new C3452c(this, 0);
        }

        public final /* bridge */ T remove(int i) {
            return mo27009j(i);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            vx2.m53591g(collection, "elements");
            int i = this.f18635e;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove((Object) it.next());
            }
            if (i != this.f18635e) {
                return true;
            }
            return false;
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            vx2.m53591g(collection, "elements");
            int i = this.f18635e;
            int i2 = i - 1;
            int i3 = this.f18634d;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.f18633a.get(i2))) {
                        this.f18633a.remove(i2);
                        this.f18635e--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.f18635e) {
                return true;
            }
            return false;
        }

        public T set(int i, T t) {
            w04.m29209c(this, i);
            return this.f18633a.set(i + this.f18634d, t);
        }

        public final /* bridge */ int size() {
            return mo27004e();
        }

        public List<T> subList(int i, int i2) {
            w04.m29210d(this, i, i2);
            return new C3451b(this, i, i2);
        }

        public Object[] toArray() {
            return jj0.m46524a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            vx2.m53591g(tArr, "array");
            return jj0.m46525b(this, tArr);
        }

        public void add(int i, T t) {
            this.f18633a.add(i + this.f18634d, t);
            this.f18635e++;
        }

        public ListIterator<T> listIterator(int i) {
            return new C3452c(this, i);
        }

        public boolean remove(Object obj) {
            int i = this.f18635e;
            for (int i2 = this.f18634d; i2 < i; i2++) {
                if (vx2.m53586b(this.f18633a.get(i2), obj)) {
                    this.f18633a.remove(i2);
                    this.f18635e--;
                    return true;
                }
            }
            return false;
        }

        public boolean addAll(Collection<? extends T> collection) {
            vx2.m53591g(collection, "elements");
            this.f18633a.addAll(this.f18635e, collection);
            this.f18635e += collection.size();
            return collection.size() > 0;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lv04$c;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lr37;", "remove", "hasPrevious", "", "nextIndex", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "", "a", "Ljava/util/List;", "list", "d", "I", "index", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: v04$c */
    /* compiled from: MutableVector.kt */
    public static final class C3452c<T> implements ListIterator<T>, a93 {

        /* renamed from: a */
        public final List<T> f18636a;

        /* renamed from: d */
        public int f18637d;

        public C3452c(List<T> list, int i) {
            vx2.m53591g(list, "list");
            this.f18636a = list;
            this.f18637d = i;
        }

        public void add(T t) {
            this.f18636a.add(this.f18637d, t);
            this.f18637d++;
        }

        public boolean hasNext() {
            if (this.f18637d < this.f18636a.size()) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f18637d > 0) {
                return true;
            }
            return false;
        }

        public T next() {
            List<T> list = this.f18636a;
            int i = this.f18637d;
            this.f18637d = i + 1;
            return list.get(i);
        }

        public int nextIndex() {
            return this.f18637d;
        }

        public T previous() {
            int i = this.f18637d - 1;
            this.f18637d = i;
            return this.f18636a.get(i);
        }

        public int previousIndex() {
            return this.f18637d - 1;
        }

        public void remove() {
            int i = this.f18637d - 1;
            this.f18637d = i;
            this.f18636a.remove(i);
        }

        public void set(T t) {
            this.f18636a.set(this.f18637d, t);
        }
    }

    public v04(T[] tArr, int i) {
        vx2.m53591g(tArr, PublicResolver.FUNC_CONTENT);
        this.f18629a = tArr;
        this.f18631e = i;
    }

    /* renamed from: A */
    public final void mo26948A(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f18631e;
            if (i2 < i3) {
                T[] tArr = this.f18629a;
                C6706xq.m54495i(tArr, tArr, i, i2, i3);
            }
            int i4 = this.f18631e - (i2 - i);
            int n = mo26963n() - 1;
            if (i4 <= n) {
                int i5 = i4;
                while (true) {
                    this.f18629a[i5] = null;
                    if (i5 == n) {
                        break;
                    }
                    i5++;
                }
            }
            this.f18631e = i4;
        }
    }

    /* renamed from: B */
    public final boolean mo26949B(Collection<? extends T> collection) {
        vx2.m53591g(collection, "elements");
        int i = this.f18631e;
        for (int n = mo26963n() - 1; -1 < n; n--) {
            if (!collection.contains(mo26962m()[n])) {
                mo26971x(n);
            }
        }
        if (i != this.f18631e) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final T mo26950D(int i, T t) {
        T[] tArr = this.f18629a;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    /* renamed from: E */
    public final void mo26951E(Comparator<T> comparator) {
        vx2.m53591g(comparator, "comparator");
        T[] tArr = this.f18629a;
        vx2.m53589e(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        C6706xq.m54512z(tArr, comparator, 0, this.f18631e);
    }

    /* renamed from: b */
    public final void mo26952b(int i, T t) {
        mo26961l(this.f18631e + 1);
        T[] tArr = this.f18629a;
        int i2 = this.f18631e;
        if (i != i2) {
            C6706xq.m54495i(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.f18631e++;
    }

    /* renamed from: c */
    public final boolean mo26953c(T t) {
        mo26961l(this.f18631e + 1);
        T[] tArr = this.f18629a;
        int i = this.f18631e;
        tArr[i] = t;
        this.f18631e = i + 1;
        return true;
    }

    /* renamed from: e */
    public final boolean mo26954e(int i, v04<T> v04) {
        vx2.m53591g(v04, "elements");
        if (v04.mo26965q()) {
            return false;
        }
        mo26961l(this.f18631e + v04.f18631e);
        T[] tArr = this.f18629a;
        int i2 = this.f18631e;
        if (i != i2) {
            C6706xq.m54495i(tArr, tArr, v04.f18631e + i, i, i2);
        }
        C6706xq.m54495i(v04.f18629a, tArr, i, 0, v04.f18631e);
        this.f18631e += v04.f18631e;
        return true;
    }

    /* renamed from: f */
    public final boolean mo26955f(int i, Collection<? extends T> collection) {
        vx2.m53591g(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        mo26961l(this.f18631e + collection.size());
        T[] tArr = this.f18629a;
        if (i != this.f18631e) {
            C6706xq.m54495i(tArr, tArr, collection.size() + i, i, this.f18631e);
        }
        for (T next : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ck0.m33072t();
            }
            tArr[i2 + i] = next;
            i2 = i3;
        }
        this.f18631e += collection.size();
        return true;
    }

    /* renamed from: g */
    public final boolean mo26956g(Collection<? extends T> collection) {
        vx2.m53591g(collection, "elements");
        return mo26955f(this.f18631e, collection);
    }

    /* renamed from: h */
    public final List<T> mo26957h() {
        List<T> list = this.f18630d;
        if (list != null) {
            return list;
        }
        C3450a aVar = new C3450a(this);
        this.f18630d = aVar;
        return aVar;
    }

    /* renamed from: i */
    public final void mo26958i() {
        T[] tArr = this.f18629a;
        int n = mo26963n();
        while (true) {
            n--;
            if (-1 < n) {
                tArr[n] = null;
            } else {
                this.f18631e = 0;
                return;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo26959j(T t) {
        int n = mo26963n() - 1;
        if (n >= 0) {
            int i = 0;
            while (!vx2.m53586b(mo26962m()[i], t)) {
                if (i != n) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo26960k(Collection<? extends T> collection) {
        vx2.m53591g(collection, "elements");
        for (T j : collection) {
            if (!mo26959j(j)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public final void mo26961l(int i) {
        T[] tArr = this.f18629a;
        if (tArr.length < i) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.f18629a = copyOf;
        }
    }

    /* renamed from: m */
    public final T[] mo26962m() {
        return this.f18629a;
    }

    /* renamed from: n */
    public final int mo26963n() {
        return this.f18631e;
    }

    /* renamed from: o */
    public final int mo26964o(T t) {
        int i = this.f18631e;
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        T[] tArr = this.f18629a;
        vx2.m53589e(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!vx2.m53586b(t, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: q */
    public final boolean mo26965q() {
        if (this.f18631e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo26966r() {
        if (this.f18631e != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final int mo26967s(T t) {
        int i = this.f18631e;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        T[] tArr = this.f18629a;
        vx2.m53589e(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!vx2.m53586b(t, tArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public final boolean mo26968t(T t) {
        int o = mo26964o(t);
        if (o < 0) {
            return false;
        }
        mo26971x(o);
        return true;
    }

    /* renamed from: u */
    public final boolean mo26969u(v04<T> v04) {
        vx2.m53591g(v04, "elements");
        int i = this.f18631e;
        int n = v04.mo26963n() - 1;
        if (n >= 0) {
            int i2 = 0;
            while (true) {
                mo26968t(v04.mo26962m()[i2]);
                if (i2 == n) {
                    break;
                }
                i2++;
            }
        }
        if (i != this.f18631e) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean mo26970w(Collection<? extends T> collection) {
        vx2.m53591g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.f18631e;
        for (T t : collection) {
            mo26968t(t);
        }
        if (i != this.f18631e) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final T mo26971x(int i) {
        T[] tArr = this.f18629a;
        T t = tArr[i];
        if (i != mo26963n() - 1) {
            C6706xq.m54495i(tArr, tArr, i, i + 1, this.f18631e);
        }
        int i2 = this.f18631e - 1;
        this.f18631e = i2;
        tArr[i2] = null;
        return t;
    }
}
