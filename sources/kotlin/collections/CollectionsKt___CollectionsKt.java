package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u001d\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0014\u0010\n\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001d\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r\u001a$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r\u001a6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001dH\bø\u0001\u0000\u001a\"\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020 *\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a=\u0010%\u001a\u00028\u0000\"\u0010\b\u0000\u0010#*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\"\"\b\b\u0001\u0010\u0000*\u00020 *\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010$\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&\u001a$\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r\u001a$\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r\u001a\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a&\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000**\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010.\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000,j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`-\u001a\u0010\u00103\u001a\u000202*\b\u0012\u0004\u0012\u00020100\u001a\u0010\u00105\u001a\u000204*\b\u0012\u0004\u0012\u00020\r00\u001a7\u00106\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010#*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\"*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0004\b6\u0010&\u001a&\u00109\u001a\u0012\u0012\u0004\u0012\u00028\u000007j\b\u0012\u0004\u0012\u00028\u0000`8\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000000\u001a\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\bø\u0001\u0000\u001a\"\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0004\u001a\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0004\u001a0\u0010J\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001dH\bø\u0001\u0000\u001a+\u0010K\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000**\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bK\u0010L\u001a+\u0010M\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000**\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bM\u0010L\u001a.\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\bN\u0010O\u001a-\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a.\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010O\u001a.\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\bS\u0010T\u001a6\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000002\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000UH\u0002¢\u0006\u0004\bV\u0010W\u001a-\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a-\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000002\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a?\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Z0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0004\u001a}\u0010f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010^*\u00060\\j\u0002`]*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010_\u001a\u00028\u00012\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020`2\b\b\u0002\u0010c\u001a\u00020`2\b\b\u0002\u0010d\u001a\u00020\r2\b\b\u0002\u0010e\u001a\u00020`2\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020`\u0018\u00010\u001d¢\u0006\u0004\bf\u0010g\u001a`\u0010i\u001a\u00020h\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020`2\b\b\u0002\u0010c\u001a\u00020`2\b\b\u0002\u0010d\u001a\u00020\r2\b\b\u0002\u0010e\u001a\u00020`2\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020`\u0018\u00010\u001d\u001a\u001c\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006l"}, mo44877d2 = {"T", "", "element", "", "R", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "Y", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "Z", "(Ljava/util/List;)Ljava/lang/Object;", "a0", "b0", "", "index", "c0", "(Ljava/util/List;I)Ljava/lang/Object;", "d0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "j0", "k0", "l0", "m0", "y0", "z0", "A0", "B0", "n", "U", "Lkotlin/Function1;", "predicate", "V", "", "W", "", "C", "destination", "X", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "E0", "F0", "x0", "", "C0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "D0", "", "", "", "G0", "", "J0", "H0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "I0", "K0", "", "L0", "M0", "", "O0", "transform", "n0", "Lwt2;", "Q0", "S", "other", "e0", "", "N0", "P0", "P", "o0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "p0", "r0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "q0", "t0", "v0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "", "w0", "(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/List;", "s0", "u0", "Lkotlin/Pair;", "R0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "f0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lrc2;)Ljava/lang/Appendable;", "", "h0", "Lhw5;", "Q", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/CollectionsKt")
/* compiled from: _Collections.kt */
public class CollectionsKt___CollectionsKt extends jk0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo44877d2 = {"kotlin/collections/CollectionsKt___CollectionsKt$a", "Lhw5;", "", "iterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.CollectionsKt___CollectionsKt$a */
    /* compiled from: Sequences.kt */
    public static final class C6174a implements hw5<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterable f30964a;

        public C6174a(Iterable iterable) {
            this.f30964a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f30964a.iterator();
        }
    }

    /* renamed from: A0 */
    public static final <T> T m47301A0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: B0 */
    public static final <T> T m47302B0(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: C0 */
    public static final <T extends Comparable<? super T>> List<T> m47303C0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m47311K0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C6706xq.m54510x((Comparable[]) array);
            return C6706xq.m54490d(array);
        }
        List<T> L0 = m47312L0(iterable);
        gk0.m44737x(L0);
        return L0;
    }

    /* renamed from: D0 */
    public static final <T> List<T> m47304D0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m47311K0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C6706xq.m54511y(array, comparator);
            return C6706xq.m54490d(array);
        }
        List<T> L0 = m47312L0(iterable);
        gk0.m44738y(L0, comparator);
        return L0;
    }

    /* renamed from: E0 */
    public static final <T> List<T> m47305E0(Iterable<? extends T> iterable, int i) {
        boolean z;
        vx2.m53591g(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return ck0.m33062j();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m47311K0(iterable);
                }
                if (i == 1) {
                    return bk0.m32598e(m47328Y(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return ck0.m33069q(arrayList);
        }
    }

    /* renamed from: F0 */
    public static final <T> List<T> m47306F0(List<? extends T> list, int i) {
        boolean z;
        vx2.m53591g(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return ck0.m33062j();
        } else {
            int size = list.size();
            if (i >= size) {
                return m47311K0(list);
            }
            if (i == 1) {
                return bk0.m32598e(m47340k0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: G0 */
    public static final byte[] m47307G0(Collection<Byte> collection) {
        vx2.m53591g(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte byteValue : collection) {
            bArr[i] = byteValue.byteValue();
            i++;
        }
        return bArr;
    }

    /* renamed from: H0 */
    public static final <T, C extends Collection<? super T>> C m47308H0(Iterable<? extends T> iterable, C c) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: I0 */
    public static final <T> HashSet<T> m47309I0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        return (HashSet) m47308H0(iterable, new HashSet(ao3.m31893e(dk0.m43495u(iterable, 12))));
    }

    /* renamed from: J0 */
    public static final int[] m47310J0(Collection<Integer> collection) {
        vx2.m53591g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: K0 */
    public static final <T> List<T> m47311K0(Iterable<? extends T> iterable) {
        Object obj;
        vx2.m53591g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return ck0.m33069q(m47312L0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ck0.m33062j();
        }
        if (size != 1) {
            return m47313M0(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return bk0.m32598e(obj);
    }

    /* renamed from: L0 */
    public static final <T> List<T> m47312L0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m47313M0((Collection) iterable);
        }
        return (List) m47308H0(iterable, new ArrayList());
    }

    /* renamed from: M0 */
    public static final <T> List<T> m47313M0(Collection<? extends T> collection) {
        vx2.m53591g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: N0 */
    public static final <T> Set<T> m47314N0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m47308H0(iterable, new LinkedHashSet());
    }

    /* renamed from: O0 */
    public static final <T> Set<T> m47315O0(Iterable<? extends T> iterable) {
        Object obj;
        vx2.m53591g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return ny5.m49097g((Set) m47308H0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ny5.m49095e();
        }
        if (size != 1) {
            return (Set) m47308H0(iterable, new LinkedHashSet(ao3.m31893e(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return my5.m48548d(obj);
    }

    /* renamed from: P */
    public static final <T> boolean m47316P(Iterable<? extends T> iterable, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(rc2, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object invoke : iterable) {
            if (!rc2.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public static final <T> Set<T> m47317P0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(iterable2, "other");
        Set<T> N0 = m47314N0(iterable);
        hk0.m45275z(N0, iterable2);
        return N0;
    }

    /* renamed from: Q */
    public static final <T> hw5<T> m47318Q(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        return new C6174a(iterable);
    }

    /* renamed from: Q0 */
    public static final <T> Iterable<wt2<T>> m47319Q0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        return new xt2(new CollectionsKt___CollectionsKt$withIndex$1(iterable));
    }

    /* renamed from: R */
    public static final <T> boolean m47320R(Iterable<? extends T> iterable, T t) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (m47333d0(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: R0 */
    public static final <T, R> List<Pair<T, R>> m47321R0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(dk0.m43495u(iterable, 10), dk0.m43495u(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(wy6.m54142a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: S */
    public static final <T> List<T> m47322S(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        return m47311K0(m47314N0(iterable));
    }

    /* renamed from: T */
    public static final <T> List<T> m47323T(Iterable<? extends T> iterable, int i) {
        boolean z;
        ArrayList arrayList;
        vx2.m53591g(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return m47311K0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return ck0.m33062j();
                }
                if (size == 1) {
                    return bk0.m32598e(m47339j0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return ck0.m33069q(arrayList);
        }
    }

    /* renamed from: U */
    public static final <T> List<T> m47324U(List<? extends T> list, int i) {
        boolean z;
        vx2.m53591g(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m47305E0(list, d75.m43382d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: V */
    public static final <T> List<T> m47325V(Iterable<? extends T> iterable, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(rc2, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (rc2.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: W */
    public static final <T> List<T> m47326W(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        return (List) m47327X(iterable, new ArrayList());
    }

    /* renamed from: X */
    public static final <C extends Collection<? super T>, T> C m47327X(Iterable<? extends T> iterable, C c) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: Y */
    public static final <T> T m47328Y(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof List) {
            return m47329Z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: Z */
    public static final <T> T m47329Z(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: a0 */
    public static final <T> T m47330a0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: b0 */
    public static final <T> T m47331b0(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: c0 */
    public static final <T> T m47332c0(List<? extends T> list, int i) {
        vx2.m53591g(list, "<this>");
        if (i < 0 || i > ck0.m33064l(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: d0 */
    public static final <T> int m47333d0(Iterable<? extends T> iterable, T t) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                ck0.m33072t();
            }
            if (vx2.m53586b(t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e0 */
    public static final <T> Set<T> m47334e0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(iterable2, "other");
        Set<T> N0 = m47314N0(iterable);
        hk0.m45274I(N0, iterable2);
        return N0;
    }

    /* renamed from: f0 */
    public static final <T, A extends Appendable> A m47335f0(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(a, "buffer");
        vx2.m53591g(charSequence, "separator");
        vx2.m53591g(charSequence2, "prefix");
        vx2.m53591g(charSequence3, "postfix");
        vx2.m53591g(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            rb6.m71504a(a, next, rc2);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: g0 */
    public static /* synthetic */ Appendable m47336g0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2 rc2, int i2, Object obj) {
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
        return m47335f0(iterable, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, rc22);
    }

    /* renamed from: h0 */
    public static final <T> String m47337h0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(charSequence, "separator");
        vx2.m53591g(charSequence2, "prefix");
        vx2.m53591g(charSequence3, "postfix");
        vx2.m53591g(charSequence4, "truncated");
        String sb = ((StringBuilder) m47335f0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, rc2)).toString();
        vx2.m53590f(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: i0 */
    public static /* synthetic */ String m47338i0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2 rc2, int i2, Object obj) {
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
        return m47337h0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, rc2);
    }

    /* renamed from: j0 */
    public static final <T> T m47339j0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof List) {
            return m47340k0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: k0 */
    public static final <T> T m47340k0(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(ck0.m33064l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: l0 */
    public static final <T> T m47341l0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: m0 */
    public static final <T> T m47342m0(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: n0 */
    public static final <T, R> List<R> m47343n0(Iterable<? extends T> iterable, rc2<? super T, ? extends R> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(rc2, "transform");
        ArrayList arrayList = new ArrayList(dk0.m43495u(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(rc2.invoke(invoke));
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public static final <T extends Comparable<? super T>> T m47344o0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: p0 */
    public static final <T extends Comparable<? super T>> T m47345p0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: q0 */
    public static final <T> List<T> m47346q0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(iterable2, "elements");
        Collection<? extends T> a = f40.m44189a(iterable2, iterable);
        if (a.isEmpty()) {
            return m47311K0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!a.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: r0 */
    public static final <T> List<T> m47347r0(Iterable<? extends T> iterable, T t) {
        vx2.m53591g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(dk0.m43495u(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            boolean z2 = true;
            if (!z && vx2.m53586b(next, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public static final <T> List<T> m47348s0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m47350u0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        hk0.m45275z(arrayList, iterable);
        hk0.m45275z(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: t0 */
    public static final <T> List<T> m47349t0(Iterable<? extends T> iterable, T t) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m47351v0((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        hk0.m45275z(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: u0 */
    public static final <T> List<T> m47350u0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        vx2.m53591g(collection, "<this>");
        vx2.m53591g(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        hk0.m45275z(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: v0 */
    public static final <T> List<T> m47351v0(Collection<? extends T> collection, T t) {
        vx2.m53591g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: w0 */
    public static final <T> List<T> m47352w0(Collection<? extends T> collection, T[] tArr) {
        vx2.m53591g(collection, "<this>");
        vx2.m53591g(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        hk0.m45266A(arrayList, tArr);
        return arrayList;
    }

    /* renamed from: x0 */
    public static final <T> List<T> m47353x0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m47311K0(iterable);
        }
        List<T> L0 = m47312L0(iterable);
        jk0.m46526O(L0);
        return L0;
    }

    /* renamed from: y0 */
    public static final <T> T m47354y0(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof List) {
            return m47355z0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: z0 */
    public static final <T> T m47355z0(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }
}
