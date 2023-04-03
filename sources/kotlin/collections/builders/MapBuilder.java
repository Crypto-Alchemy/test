package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\u000f\u0014\"\r\u000b\u0019BI\b\u0002\u0012\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010^\u001a\u00020\b\u0012\u0006\u0010`\u001a\u00020\b¢\u0006\u0006\b\u0001\u0010\u0001B\n\b\u0016¢\u0006\u0005\b\u0001\u0010:B\u0014\b\u0016\u0012\u0007\u0010\u0001\u001a\u00020\b¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0018\u0010\"\u001a\u00020\u00172\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030 H\u0002J\u001c\u0010%\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002J\"\u0010(\u001a\u00020\u00172\u0018\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#0&H\u0002J\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 J\b\u0010*\u001a\u00020\u0017H\u0016J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b-\u0010,J\u001a\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b0\u00101J\u001e\u00102\u001a\u00020\n2\u0014\u0010'\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0019\u00103\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010/J\b\u00104\u001a\u00020\nH\u0016J\u0013\u00105\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00106\u001a\u00020\bH\u0016J\b\u00108\u001a\u000207H\u0016J\u000f\u0010;\u001a\u00020\nH\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b<\u0010\u0013J\u0017\u0010?\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b>\u0010\u0013J#\u0010B\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010E\u001a\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\bC\u0010DJ#\u0010G\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0000¢\u0006\u0004\bF\u0010AJ\u0017\u0010J\u001a\u00020\u00172\u0006\u0010H\u001a\u00028\u0001H\u0000¢\u0006\u0004\bI\u0010,J\u001b\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010KH\u0000¢\u0006\u0004\bL\u0010MJ\u001b\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010OH\u0000¢\u0006\u0004\bP\u0010QJ\u001b\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0000¢\u0006\u0004\bT\u0010UR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010XR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u0016\u0010^\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010_R$\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020\b8\u0016@RX\u000e¢\u0006\f\n\u0004\bc\u0010_\u001a\u0004\bd\u0010eR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010m\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010l8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010nR$\u0010o\u001a\u00020\u00172\u0006\u0010b\u001a\u00020\u00178\u0000@BX\u000e¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010\f\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bs\u0010eR\u0014\u0010t\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010eR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000u8VX\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00010y8VX\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R&\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010}0u8VX\u0004¢\u0006\u0006\u001a\u0004\b~\u0010w¨\u0006\u0001"}, mo44877d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "n", "Lr37;", "e", "capacity", "d", "", "a", "()[Ljava/lang/Object;", "key", "j", "(Ljava/lang/Object;)I", "b", "newHashSize", "i", "", "m", "f", "value", "g", "index", "q", "removedHash", "p", "", "other", "c", "", "entry", "l", "", "from", "k", "build", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", "equals", "hashCode", "", "toString", "checkIsMutable$kotlin_stdlib", "()V", "checkIsMutable", "addKey$kotlin_stdlib", "addKey", "removeKey$kotlin_stdlib", "removeKey", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "containsAllEntries$kotlin_stdlib", "(Ljava/util/Collection;)Z", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Lkotlin/collections/builders/MapBuilder$e;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$e;", "keysIterator", "Lkotlin/collections/builders/MapBuilder$f;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$f;", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$b;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$b;", "entriesIterator", "keysArray", "[Ljava/lang/Object;", "valuesArray", "", "presenceArray", "[I", "hashArray", "maxProbeDistance", "I", "length", "hashShift", "<set-?>", "size", "getSize", "()I", "Lnn3;", "keysView", "Lnn3;", "Lon3;", "valuesView", "Lon3;", "Lmn3;", "entriesView", "Lmn3;", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "()Z", "h", "hashSize", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MapBuilder.kt */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, e93 {

    /* renamed from: a */
    public static final C6179a f30972a = new C6179a((DefaultConstructorMarker) null);
    private mn3<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public K[] keysArray;
    private nn3<K> keysView;
    /* access modifiers changed from: private */
    public int length;
    private int maxProbeDistance;
    /* access modifiers changed from: private */
    public int[] presenceArray;
    private int size;
    /* access modifiers changed from: private */
    public V[] valuesArray;
    private on3<V> valuesView;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, mo44877d2 = {"Lkotlin/collections/builders/MapBuilder$a;", "", "", "capacity", "c", "hashSize", "d", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.MapBuilder$a */
    /* compiled from: MapBuilder.kt */
    public static final class C6179a {
        public C6179a() {
        }

        public /* synthetic */ C6179a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final int mo45106c(int i) {
            return Integer.highestOneBit(d75.m43382d(i, 1) * 3);
        }

        /* renamed from: d */
        public final int mo45107d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014"}, mo44877d2 = {"Lkotlin/collections/builders/MapBuilder$b;", "K", "V", "Lkotlin/collections/builders/MapBuilder$d;", "", "", "Lkotlin/collections/builders/MapBuilder$c;", "h", "", "j", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Lr37;", "i", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.MapBuilder$b */
    /* compiled from: MapBuilder.kt */
    public static final class C6180b<K, V> extends C6182d<K, V> implements Iterator<Map.Entry<K, V>>, a93 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6180b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            vx2.m53591g(mapBuilder, "map");
        }

        /* renamed from: h */
        public C6181c<K, V> next() {
            if (mo45118a() < mo45120c().length) {
                int a = mo45118a();
                mo45122f(a + 1);
                mo45123g(a);
                C6181c<K, V> cVar = new C6181c<>(mo45120c(), mo45119b());
                mo45121d();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: i */
        public final void mo45109i(StringBuilder sb) {
            vx2.m53591g(sb, "sb");
            if (mo45118a() < mo45120c().length) {
                int a = mo45118a();
                mo45122f(a + 1);
                mo45123g(a);
                Object obj = mo45120c().keysArray[mo45119b()];
                if (vx2.m53586b(obj, mo45120c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] access$getValuesArray$p = mo45120c().valuesArray;
                vx2.m53588d(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[mo45119b()];
                if (vx2.m53586b(obj2, mo45120c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mo45121d();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: j */
        public final int mo45110j() {
            int i;
            if (mo45118a() < mo45120c().length) {
                int a = mo45118a();
                mo45122f(a + 1);
                mo45123g(a);
                Object obj = mo45120c().keysArray[mo45119b()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] access$getValuesArray$p = mo45120c().valuesArray;
                vx2.m53588d(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[mo45119b()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                mo45121d();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00028\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, mo44877d2 = {"Lkotlin/collections/builders/MapBuilder$c;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/collections/builders/MapBuilder;", "a", "Lkotlin/collections/builders/MapBuilder;", "map", "d", "I", "index", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.MapBuilder$c */
    /* compiled from: MapBuilder.kt */
    public static final class C6181c<K, V> implements Map.Entry<K, V>, a93 {

        /* renamed from: a */
        public final MapBuilder<K, V> f30973a;

        /* renamed from: d */
        public final int f30974d;

        public C6181c(MapBuilder<K, V> mapBuilder, int i) {
            vx2.m53591g(mapBuilder, "map");
            this.f30973a = mapBuilder;
            this.f30974d = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!vx2.m53586b(entry.getKey(), getKey()) || !vx2.m53586b(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public K getKey() {
            return this.f30973a.keysArray[this.f30974d];
        }

        public V getValue() {
            V[] access$getValuesArray$p = this.f30973a.valuesArray;
            vx2.m53588d(access$getValuesArray$p);
            return access$getValuesArray$p[this.f30974d];
        }

        public int hashCode() {
            int i;
            Object key = getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            Object value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            this.f30973a.checkIsMutable$kotlin_stdlib();
            V[] access$allocateValuesArray = this.f30973a.mo45059a();
            int i = this.f30974d;
            V v2 = access$allocateValuesArray[i];
            access$allocateValuesArray[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\u001c"}, mo44877d2 = {"Lkotlin/collections/builders/MapBuilder$d;", "K", "V", "", "Lr37;", "d", "()V", "", "hasNext", "remove", "Lkotlin/collections/builders/MapBuilder;", "a", "Lkotlin/collections/builders/MapBuilder;", "c", "()Lkotlin/collections/builders/MapBuilder;", "map", "", "I", "()I", "f", "(I)V", "index", "e", "b", "g", "lastIndex", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.MapBuilder$d */
    /* compiled from: MapBuilder.kt */
    public static class C6182d<K, V> {

        /* renamed from: a */
        public final MapBuilder<K, V> f30975a;

        /* renamed from: d */
        public int f30976d;

        /* renamed from: e */
        public int f30977e = -1;

        public C6182d(MapBuilder<K, V> mapBuilder) {
            vx2.m53591g(mapBuilder, "map");
            this.f30975a = mapBuilder;
            mo45121d();
        }

        /* renamed from: a */
        public final int mo45118a() {
            return this.f30976d;
        }

        /* renamed from: b */
        public final int mo45119b() {
            return this.f30977e;
        }

        /* renamed from: c */
        public final MapBuilder<K, V> mo45120c() {
            return this.f30975a;
        }

        /* renamed from: d */
        public final void mo45121d() {
            while (this.f30976d < this.f30975a.length) {
                int[] access$getPresenceArray$p = this.f30975a.presenceArray;
                int i = this.f30976d;
                if (access$getPresenceArray$p[i] < 0) {
                    this.f30976d = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public final void mo45122f(int i) {
            this.f30976d = i;
        }

        /* renamed from: g */
        public final void mo45123g(int i) {
            this.f30977e = i;
        }

        public final boolean hasNext() {
            if (this.f30976d < this.f30975a.length) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z;
            if (this.f30977e != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f30975a.checkIsMutable$kotlin_stdlib();
                this.f30975a.mo45097q(this.f30977e);
                this.f30977e = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lkotlin/collections/builders/MapBuilder$e;", "K", "V", "Lkotlin/collections/builders/MapBuilder$d;", "", "next", "()Ljava/lang/Object;", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.MapBuilder$e */
    /* compiled from: MapBuilder.kt */
    public static final class C6183e<K, V> extends C6182d<K, V> implements Iterator<K>, a93 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6183e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            vx2.m53591g(mapBuilder, "map");
        }

        public K next() {
            if (mo45118a() < mo45120c().length) {
                int a = mo45118a();
                mo45122f(a + 1);
                mo45123g(a);
                K k = mo45120c().keysArray[mo45119b()];
                mo45121d();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lkotlin/collections/builders/MapBuilder$f;", "K", "V", "Lkotlin/collections/builders/MapBuilder$d;", "", "next", "()Ljava/lang/Object;", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.MapBuilder$f */
    /* compiled from: MapBuilder.kt */
    public static final class C6184f<K, V> extends C6182d<K, V> implements Iterator<V>, a93 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6184f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            vx2.m53591g(mapBuilder, "map");
        }

        public V next() {
            if (mo45118a() < mo45120c().length) {
                int a = mo45118a();
                mo45122f(a + 1);
                mo45123g(a);
                V[] access$getValuesArray$p = mo45120c().valuesArray;
                vx2.m53588d(access$getValuesArray$p);
                V v = access$getValuesArray$p[mo45119b()];
                mo45121d();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    public MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = f30972a.mo45107d(mo45084i());
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: a */
    public final V[] mo45059a() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] d = wh3.m53888d(mo45082h());
        this.valuesArray = d;
        return d;
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int j = mo45087j(k);
            int g = d75.m43385g(this.maxProbeDistance * 2, mo45084i() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[j];
                if (i2 <= 0) {
                    if (this.length >= mo45082h()) {
                        mo45071e(1);
                    } else {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = k;
                        this.presenceArray[i3] = j;
                        this.hashArray[j] = i4;
                        this.size = size() + 1;
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                } else if (vx2.m53586b(this.keysArray[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > g) {
                        mo45093n(mo45084i() * 2);
                        break;
                    }
                    int i5 = j - 1;
                    if (j == 0) {
                        j = mo45084i() - 1;
                    } else {
                        j = i5;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo45061b() {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            if (this.presenceArray[i2] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        wh3.m53891g(this.keysArray, i3, i);
        if (vArr != null) {
            wh3.m53891g(vArr, i3, this.length);
        }
        this.length = i3;
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        return this;
    }

    /* renamed from: c */
    public final boolean mo45063c(Map<?, ?> map) {
        if (size() != map.size() || !containsAllEntries$kotlin_stdlib(map.entrySet())) {
            return false;
        }
        return true;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        checkIsMutable$kotlin_stdlib();
        lw2 s = new rw2(0, this.length - 1).iterator();
        while (s.hasNext()) {
            int nextInt = s.nextInt();
            int[] iArr = this.presenceArray;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        wh3.m53891g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            wh3.m53891g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> collection) {
        vx2.m53591g(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        vx2.m53591g(entry, "entry");
        int f = mo45075f(entry.getKey());
        if (f < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        vx2.m53588d(vArr);
        return vx2.m53586b(vArr[f], entry.getValue());
    }

    public boolean containsKey(Object obj) {
        if (mo45075f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (mo45076g(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo45070d(int i) {
        V[] vArr;
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > mo45082h()) {
            int h = (mo45082h() * 3) / 2;
            if (i <= h) {
                i = h;
            }
            this.keysArray = wh3.m53889e(this.keysArray, i);
            V[] vArr2 = this.valuesArray;
            if (vArr2 != null) {
                vArr = wh3.m53889e(vArr2, i);
            } else {
                vArr = null;
            }
            this.valuesArray = vArr;
            int[] copyOf = Arrays.copyOf(this.presenceArray, i);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.presenceArray = copyOf;
            int a = f30972a.mo45106c(i);
            if (a > mo45084i()) {
                mo45093n(a);
            }
        } else if ((this.length + i) - size() > mo45082h()) {
            mo45093n(mo45084i());
        }
    }

    /* renamed from: e */
    public final void mo45071e(int i) {
        mo45070d(this.length + i);
    }

    public final C6180b<K, V> entriesIterator$kotlin_stdlib() {
        return new C6180b<>(this);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof Map) && mo45063c((Map) obj))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo45075f(K k) {
        int j = mo45087j(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[j];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (vx2.m53586b(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = j - 1;
            if (j == 0) {
                j = mo45084i() - 1;
            } else {
                j = i4;
            }
        }
    }

    /* renamed from: g */
    public final int mo45076g(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                vx2.m53588d(vArr);
                if (vx2.m53586b(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public V get(Object obj) {
        int f = mo45075f(obj);
        if (f < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        vx2.m53588d(vArr);
        return vArr[f];
    }

    public Set<Map.Entry<K, V>> getEntries() {
        mn3<K, V> mn3 = this.entriesView;
        if (mn3 != null) {
            return mn3;
        }
        mn3<K, V> mn32 = new mn3<>(this);
        this.entriesView = mn32;
        return mn32;
    }

    public Set<K> getKeys() {
        nn3<K> nn3 = this.keysView;
        if (nn3 != null) {
            return nn3;
        }
        nn3<K> nn32 = new nn3<>(this);
        this.keysView = nn32;
        return nn32;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        on3<V> on3 = this.valuesView;
        if (on3 != null) {
            return on3;
        }
        on3<V> on32 = new on3<>(this);
        this.valuesView = on32;
        return on32;
    }

    /* renamed from: h */
    public final int mo45082h() {
        return this.keysArray.length;
    }

    public int hashCode() {
        C6180b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i += entriesIterator$kotlin_stdlib.mo45110j();
        }
        return i;
    }

    /* renamed from: i */
    public final int mo45084i() {
        return this.hashArray.length;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    /* renamed from: j */
    public final int mo45087j(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * -1640531527) >>> this.hashShift;
    }

    /* renamed from: k */
    public final boolean mo45088k(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        mo45071e(collection.size());
        for (Map.Entry l : collection) {
            if (mo45091l(l)) {
                z = true;
            }
        }
        return z;
    }

    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final C6183e<K, V> keysIterator$kotlin_stdlib() {
        return new C6183e<>(this);
    }

    /* renamed from: l */
    public final boolean mo45091l(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        Object[] a = mo45059a();
        if (addKey$kotlin_stdlib >= 0) {
            a[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        if (vx2.m53586b(entry.getValue(), a[i])) {
            return false;
        }
        a[i] = entry.getValue();
        return true;
    }

    /* renamed from: m */
    public final boolean mo45092m(int i) {
        int j = mo45087j(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[j] == 0) {
                iArr[j] = i + 1;
                this.presenceArray[i] = j;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = j - 1;
            if (j == 0) {
                j = mo45084i() - 1;
            } else {
                j = i3;
            }
        }
    }

    /* renamed from: n */
    public final void mo45093n(int i) {
        if (this.length > size()) {
            mo45061b();
        }
        int i2 = 0;
        if (i != mo45084i()) {
            this.hashArray = new int[i];
            this.hashShift = f30972a.mo45107d(i);
        } else {
            C6706xq.m54502p(this.hashArray, 0, 0, mo45084i());
        }
        while (i2 < this.length) {
            int i3 = i2 + 1;
            if (mo45092m(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: p */
    public final void mo45094p(int i) {
        int g = d75.m43385g(this.maxProbeDistance * 2, mo45084i() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            int i4 = i - 1;
            if (i == 0) {
                i = mo45084i() - 1;
            } else {
                i = i4;
            }
            i2++;
            if (i2 > this.maxProbeDistance) {
                this.hashArray[i3] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i3] = -1;
            } else {
                int i6 = i5 - 1;
                if (((mo45087j(this.keysArray[i6]) - i) & (mo45084i() - 1)) >= i2) {
                    this.hashArray[i3] = i5;
                    this.presenceArray[i6] = i3;
                }
                g--;
            }
            i3 = i;
            i2 = 0;
            g--;
        } while (g >= 0);
        this.hashArray[i3] = -1;
    }

    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] a = mo45059a();
        if (addKey$kotlin_stdlib < 0) {
            int i = (-addKey$kotlin_stdlib) - 1;
            V v2 = a[i];
            a[i] = v;
            return v2;
        }
        a[addKey$kotlin_stdlib] = v;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        vx2.m53591g(map, "from");
        checkIsMutable$kotlin_stdlib();
        mo45088k(map.entrySet());
    }

    /* renamed from: q */
    public final void mo45097q(int i) {
        wh3.m53890f(this.keysArray, i);
        mo45094p(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
    }

    public V remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        vx2.m53588d(vArr);
        V v = vArr[removeKey$kotlin_stdlib];
        wh3.m53890f(vArr, removeKey$kotlin_stdlib);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        vx2.m53591g(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int f = mo45075f(entry.getKey());
        if (f < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        vx2.m53588d(vArr);
        if (!vx2.m53586b(vArr[f], entry.getValue())) {
            return false;
        }
        mo45097q(f);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int f = mo45075f(k);
        if (f < 0) {
            return -1;
        }
        mo45097q(f);
        return f;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int g = mo45076g(v);
        if (g < 0) {
            return false;
        }
        mo45097q(g);
        return true;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C6180b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.mo45109i(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }

    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final C6184f<K, V> valuesIterator$kotlin_stdlib() {
        return new C6184f<>(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(wh3.m53888d(i), (V[]) null, new int[i], new int[f30972a.mo45106c(i)], 2, 0);
    }
}
