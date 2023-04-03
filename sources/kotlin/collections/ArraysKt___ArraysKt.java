package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.sequences.SequencesKt__SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000â\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0002\u001a\u001f\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\n\u001a)\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0012\u0010\u0013\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u001f\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0014\u0010\n\u001a\u0012\u0010\u0015\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u001f\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0016\u0010\n\u001a\n\u0010\u0019\u001a\u00020\u0018*\u00020\u0017\u001a!\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\n\u001a+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\b\b\u0000\u0010\u0000*\u00020\u001b*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010!\u001a\u00028\u0000\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u001f\"\b\b\u0001\u0010\u0000*\u00020\u001b*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010 \u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0012\u0010&\u001a\u00020#*\u00020#2\u0006\u0010%\u001a\u00020$\u001a#\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b'\u0010(\u001a\n\u0010)\u001a\u00020#*\u00020#\u001aC\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010,\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000*j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`+¢\u0006\u0004\b-\u0010.\u001aA\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010,\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000*j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`+¢\u0006\u0004\b/\u00100\u001a\u0019\u00101\u001a\u00020\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0001¢\u0006\u0004\b1\u00102\u001a9\u00103\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001f*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0004\b3\u0010\"\u001a%\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b4\u0010\u001e\u001a\u0010\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001c*\u00020#\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001c*\u000207\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c*\u00020\u0006\u001a\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001c*\u00020;\u001a\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u001c*\u00020>\u001a\u0010\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u001c*\u00020A\u001a\u0010\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c*\u00020D\u001a\u0010\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c*\u00020\u0017\u001a%\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bH\u0010\u001e\u001a\u0010\u0010I\u001a\b\u0012\u0004\u0012\u0002050G*\u00020#\u001a\u0010\u0010J\u001a\b\u0012\u0004\u0012\u0002080G*\u000207\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070G*\u00020\u0006\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020<0G*\u00020;\u001a\u0010\u0010M\u001a\b\u0012\u0004\u0012\u00020?0G*\u00020>\u001a\u0010\u0010N\u001a\b\u0012\u0004\u0012\u00020B0G*\u00020A\u001a\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030G*\u00020D\u001a\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00180G*\u00020\u0017\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bR\u0010S\u001aE\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010UH\bø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Z0Y\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b[\u0010\\\u001a%\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b]\u0010\u001e\u001a%\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000^\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b_\u0010S\u001a\u0015\u0010`\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007¢\u0006\u0004\b`\u0010a\u001a\u0015\u0010b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007¢\u0006\u0004\bb\u0010a\u001aJ\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010d0\u001c\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0004¢\u0006\u0004\be\u0010f\u001a\u0010T\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010i*\u00060gj\u0002`h*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010j\u001a\u00028\u00012\b\b\u0002\u0010l\u001a\u00020k2\b\b\u0002\u0010m\u001a\u00020k2\b\b\u0002\u0010n\u001a\u00020k2\b\b\u0002\u0010o\u001a\u00020\u00072\b\b\u0002\u0010p\u001a\u00020k2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020k\u0018\u00010U¢\u0006\u0004\bT\u0010q\u001ai\u0010\u0000\u001a\u00020r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010l\u001a\u00020k2\b\b\u0002\u0010m\u001a\u00020k2\b\b\u0002\u0010n\u001a\u00020k2\b\b\u0002\u0010o\u001a\u00020\u00072\b\b\u0002\u0010p\u001a\u00020k2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020k\u0018\u00010U¢\u0006\u0004\b\u0000\u0010s\u001a%\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bi\u0010\\\u001a%\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bu\u0010v\"\u0015\u0010%\u001a\u00020$*\u00020#8F¢\u0006\u0006\u001a\u0004\bw\u0010x\"#\u0010{\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\by\u0010z\"\u0015\u0010{\u001a\u00020\u0007*\u00020#8F¢\u0006\u0006\u001a\u0004\b|\u0010}\"\u0015\u0010{\u001a\u00020\u0007*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b~\u0010\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0001"}, mo44877d2 = {"T", "", "element", "", "D", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "C", "H", "([Ljava/lang/Object;)Ljava/lang/Object;", "I", "index", "O", "([Ljava/lang/Object;I)Ljava/lang/Object;", "N", "([II)Ljava/lang/Integer;", "Q", "([Ljava/lang/Object;Ljava/lang/Object;)I", "P", "V", "W", "d0", "", "", "c0", "e0", "", "", "F", "([Ljava/lang/Object;)Ljava/util/List;", "", "destination", "G", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "", "Lrw2;", "indices", "f0", "b0", "([Ljava/lang/Object;)[Ljava/lang/Object;", "a0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "g0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "h0", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "j0", "([Ljava/lang/Integer;)[I", "i0", "q0", "", "k0", "", "", "r0", "o0", "", "", "p0", "", "", "n0", "", "", "m0", "", "s0", "l0", "", "z0", "t0", "A0", "x0", "y0", "w0", "v0", "B0", "u0", "", "D0", "([Ljava/lang/Object;)Ljava/util/Set;", "R", "Lkotlin/Function1;", "transform", "X", "([Ljava/lang/Object;Lrc2;)Ljava/util/List;", "", "Lwt2;", "E0", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "E", "", "C0", "Y", "([I)Ljava/lang/Integer;", "Z", "other", "Lkotlin/Pair;", "F0", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lrc2;)Ljava/lang/Appendable;", "", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lrc2;)Ljava/lang/String;", "Lhw5;", "B", "([Ljava/lang/Object;)Lhw5;", "J", "([B)Lrw2;", "M", "([Ljava/lang/Object;)I", "lastIndex", "K", "([B)I", "L", "([I)I", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/ArraysKt")
/* compiled from: _Arrays.kt */
public class ArraysKt___ArraysKt extends C6706xq {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo44877d2 = {"kotlin/collections/ArraysKt___ArraysKt$a", "", "", "iterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.ArraysKt___ArraysKt$a */
    /* compiled from: Iterables.kt */
    public static final class C6172a implements Iterable<T>, a93 {

        /* renamed from: a */
        public final /* synthetic */ Object[] f30962a;

        public C6172a(Object[] objArr) {
            this.f30962a = objArr;
        }

        public Iterator<T> iterator() {
            return C6118jq.m46703a(this.f30962a);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo44877d2 = {"kotlin/collections/ArraysKt___ArraysKt$b", "Lhw5;", "", "iterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.ArraysKt___ArraysKt$b */
    /* compiled from: Sequences.kt */
    public static final class C6173b implements hw5<T> {

        /* renamed from: a */
        public final /* synthetic */ Object[] f30963a;

        public C6173b(Object[] objArr) {
            this.f30963a = objArr;
        }

        public Iterator<T> iterator() {
            return C6118jq.m46703a(this.f30963a);
        }
    }

    /* renamed from: A */
    public static final <T> Iterable<T> m47243A(T[] tArr) {
        boolean z;
        vx2.m53591g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return ck0.m33062j();
        }
        return new C6172a(tArr);
    }

    /* renamed from: A0 */
    public static final List<Short> m47244A0(short[] sArr) {
        vx2.m53591g(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(Short.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: B */
    public static final <T> hw5<T> m47245B(T[] tArr) {
        boolean z;
        vx2.m53591g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return SequencesKt__SequencesKt.m63010e();
        }
        return new C6173b(tArr);
    }

    /* renamed from: B0 */
    public static final List<Boolean> m47246B0(boolean[] zArr) {
        vx2.m53591g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: C */
    public static final boolean m47247C(int[] iArr, int i) {
        vx2.m53591g(iArr, "<this>");
        if (m47264P(iArr, i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    public static final <T> Set<T> m47248C0(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        return (Set) m47283i0(tArr, new LinkedHashSet(ao3.m31893e(tArr.length)));
    }

    /* renamed from: D */
    public static final <T> boolean m47249D(T[] tArr, T t) {
        vx2.m53591g(tArr, "<this>");
        if (m47265Q(tArr, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    public static final <T> Set<T> m47250D0(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return ny5.m49095e();
        }
        if (length != 1) {
            return (Set) m47283i0(tArr, new LinkedHashSet(ao3.m31893e(tArr.length)));
        }
        return my5.m48548d(tArr[0]);
    }

    /* renamed from: E */
    public static final <T> List<T> m47251E(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        return CollectionsKt___CollectionsKt.m47311K0(m47248C0(tArr));
    }

    /* renamed from: E0 */
    public static final <T> Iterable<wt2<T>> m47252E0(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        return new xt2(new ArraysKt___ArraysKt$withIndex$1(tArr));
    }

    /* renamed from: F */
    public static final <T> List<T> m47253F(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        return (List) m47255G(tArr, new ArrayList());
    }

    /* renamed from: F0 */
    public static final <T, R> List<Pair<T, R>> m47254F0(T[] tArr, R[] rArr) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(wy6.m54142a(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    /* renamed from: G */
    public static final <C extends Collection<? super T>, T> C m47255G(T[] tArr, C c) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: H */
    public static final <T> T m47256H(T[] tArr) {
        boolean z;
        vx2.m53591g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: I */
    public static final <T> T m47257I(T[] tArr) {
        boolean z;
        vx2.m53591g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: J */
    public static final rw2 m47258J(byte[] bArr) {
        vx2.m53591g(bArr, "<this>");
        return new rw2(0, m47259K(bArr));
    }

    /* renamed from: K */
    public static final int m47259K(byte[] bArr) {
        vx2.m53591g(bArr, "<this>");
        return bArr.length - 1;
    }

    /* renamed from: L */
    public static final int m47260L(int[] iArr) {
        vx2.m53591g(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: M */
    public static final <T> int m47261M(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: N */
    public static final Integer m47262N(int[] iArr, int i) {
        vx2.m53591g(iArr, "<this>");
        if (i < 0 || i > m47260L(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: O */
    public static final <T> T m47263O(T[] tArr, int i) {
        vx2.m53591g(tArr, "<this>");
        if (i < 0 || i > m47261M(tArr)) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: P */
    public static final int m47264P(int[] iArr, int i) {
        vx2.m53591g(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public static final <T> int m47265Q(T[] tArr, T t) {
        vx2.m53591g(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (vx2.m53586b(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: R */
    public static final <T, A extends Appendable> A m47266R(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(a, "buffer");
        vx2.m53591g(charSequence, "separator");
        vx2.m53591g(charSequence2, "prefix");
        vx2.m53591g(charSequence3, "postfix");
        vx2.m53591g(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            rb6.m71504a(a, t, rc2);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: S */
    public static /* synthetic */ Appendable m47267S(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2 rc2, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        rc2 rc22;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            rc22 = null;
        } else {
            rc22 = rc2;
        }
        return m47266R(objArr, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, rc22);
    }

    /* renamed from: T */
    public static final <T> String m47268T(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(charSequence, "separator");
        vx2.m53591g(charSequence2, "prefix");
        vx2.m53591g(charSequence3, "postfix");
        vx2.m53591g(charSequence4, "truncated");
        String sb = ((StringBuilder) m47266R(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, rc2)).toString();
        vx2.m53590f(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: U */
    public static /* synthetic */ String m47269U(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2 rc2, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            rc2 = null;
        }
        return m47268T(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, rc2);
    }

    /* renamed from: V */
    public static final <T> T m47270V(T[] tArr) {
        boolean z;
        vx2.m53591g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[m47261M(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: W */
    public static final int m47271W(int[] iArr, int i) {
        vx2.m53591g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    /* renamed from: X */
    public static final <T, R> List<R> m47272X(T[] tArr, rc2<? super T, ? extends R> rc2) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(rc2, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T invoke : tArr) {
            arrayList.add(rc2.invoke(invoke));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public static final Integer m47273Y(int[] iArr) {
        boolean z;
        vx2.m53591g(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int i = iArr[0];
        lw2 s = new rw2(1, m47260L(iArr)).iterator();
        while (s.hasNext()) {
            int i2 = iArr[s.nextInt()];
            if (i < i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: Z */
    public static final Integer m47274Z(int[] iArr) {
        boolean z;
        vx2.m53591g(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int i = iArr[0];
        lw2 s = new rw2(1, m47260L(iArr)).iterator();
        while (s.hasNext()) {
            int i2 = iArr[s.nextInt()];
            if (i > i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a0 */
    public static final byte[] m47275a0(byte[] bArr) {
        boolean z;
        vx2.m53591g(bArr, "<this>");
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int K = m47259K(bArr);
        lw2 s = new rw2(0, K).iterator();
        while (s.hasNext()) {
            int nextInt = s.nextInt();
            bArr2[K - nextInt] = bArr[nextInt];
        }
        return bArr2;
    }

    /* renamed from: b0 */
    public static final <T> T[] m47276b0(T[] tArr) {
        boolean z;
        vx2.m53591g(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return tArr;
        }
        T[] a = C6605vq.m53452a(tArr, tArr.length);
        int M = m47261M(tArr);
        lw2 s = new rw2(0, M).iterator();
        while (s.hasNext()) {
            int nextInt = s.nextInt();
            a[M - nextInt] = tArr[nextInt];
        }
        return a;
    }

    /* renamed from: c0 */
    public static final char m47277c0(char[] cArr) {
        vx2.m53591g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: d0 */
    public static final <T> T m47278d0(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: e0 */
    public static final <T> T m47279e0(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: f0 */
    public static final byte[] m47280f0(byte[] bArr, rw2 rw2) {
        vx2.m53591g(bArr, "<this>");
        vx2.m53591g(rw2, "indices");
        if (rw2.isEmpty()) {
            return new byte[0];
        }
        return C6706xq.m54500n(bArr, rw2.mo47512e().intValue(), rw2.mo47513k().intValue() + 1);
    }

    /* renamed from: g0 */
    public static final <T> T[] m47281g0(T[] tArr, Comparator<? super T> comparator) {
        boolean z;
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(comparator, "comparator");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        vx2.m53590f(copyOf, "copyOf(this, size)");
        C6706xq.m54511y(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: h0 */
    public static final <T> List<T> m47282h0(T[] tArr, Comparator<? super T> comparator) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(comparator, "comparator");
        return C6706xq.m54490d(m47281g0(tArr, comparator));
    }

    /* renamed from: i0 */
    public static final <T, C extends Collection<? super T>> C m47283i0(T[] tArr, C c) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: j0 */
    public static final int[] m47284j0(Integer[] numArr) {
        vx2.m53591g(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: k0 */
    public static final List<Byte> m47285k0(byte[] bArr) {
        vx2.m53591g(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47294t0(bArr);
        }
        return bk0.m32598e(Byte.valueOf(bArr[0]));
    }

    /* renamed from: l0 */
    public static final List<Character> m47286l0(char[] cArr) {
        vx2.m53591g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47295u0(cArr);
        }
        return bk0.m32598e(Character.valueOf(cArr[0]));
    }

    /* renamed from: m0 */
    public static final List<Double> m47287m0(double[] dArr) {
        vx2.m53591g(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47296v0(dArr);
        }
        return bk0.m32598e(Double.valueOf(dArr[0]));
    }

    /* renamed from: n0 */
    public static final List<Float> m47288n0(float[] fArr) {
        vx2.m53591g(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47297w0(fArr);
        }
        return bk0.m32598e(Float.valueOf(fArr[0]));
    }

    /* renamed from: o0 */
    public static final List<Integer> m47289o0(int[] iArr) {
        vx2.m53591g(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47298x0(iArr);
        }
        return bk0.m32598e(Integer.valueOf(iArr[0]));
    }

    /* renamed from: p0 */
    public static final List<Long> m47290p0(long[] jArr) {
        vx2.m53591g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47299y0(jArr);
        }
        return bk0.m32598e(Long.valueOf(jArr[0]));
    }

    /* renamed from: q0 */
    public static final <T> List<T> m47291q0(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47300z0(tArr);
        }
        return bk0.m32598e(tArr[0]);
    }

    /* renamed from: r0 */
    public static final List<Short> m47292r0(short[] sArr) {
        vx2.m53591g(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47244A0(sArr);
        }
        return bk0.m32598e(Short.valueOf(sArr[0]));
    }

    /* renamed from: s0 */
    public static final List<Boolean> m47293s0(boolean[] zArr) {
        vx2.m53591g(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length != 1) {
            return m47246B0(zArr);
        }
        return bk0.m32598e(Boolean.valueOf(zArr[0]));
    }

    /* renamed from: t0 */
    public static final List<Byte> m47294t0(byte[] bArr) {
        vx2.m53591g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: u0 */
    public static final List<Character> m47295u0(char[] cArr) {
        vx2.m53591g(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char valueOf : cArr) {
            arrayList.add(Character.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: v0 */
    public static final List<Double> m47296v0(double[] dArr) {
        vx2.m53591g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: w0 */
    public static final List<Float> m47297w0(float[] fArr) {
        vx2.m53591g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: x0 */
    public static final List<Integer> m47298x0(int[] iArr) {
        vx2.m53591g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: y0 */
    public static final List<Long> m47299y0(long[] jArr) {
        vx2.m53591g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: z0 */
    public static final <T> List<T> m47300z0(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        return new ArrayList(ck0.m33059g(tArr));
    }
}
