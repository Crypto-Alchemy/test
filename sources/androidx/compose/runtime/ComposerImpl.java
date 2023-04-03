package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.eo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0004¤\u0001±\u0001B¤\u0001\u0012\u000b\u0010µ\u0001\u001a\u0006\u0012\u0002\b\u00030_\u0012\b\u0010¸\u0001\u001a\u00030¶\u0001\u0012\b\u0010¼\u0001\u001a\u00030¹\u0001\u0012\u000f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u0001\u0012.\u0010Ã\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`b0Á\u0001\u0012.\u0010Ä\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`b0Á\u0001\u0012\u0007\u0010É\u0001\u001a\u00020O¢\u0006\u0006\b¸\u0002\u0010¹\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J;\u0010\u0013\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0017\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122&\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122&\u0010\u0016\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u0012H\u0002JK\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102&\u0010\u0019\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\u001a\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J,\u0010#\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010&\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010*\u001a\u00020\u0002H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002J\u0018\u0010.\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0002J(\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u00105\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\b\u00106\u001a\u00020\u0002H\u0002J \u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0002J\u0018\u0010<\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002J \u0010>\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0002J\u0014\u0010@\u001a\u00020\u0006*\u00020?2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010A\u001a\u00020\u0002H\u0002J\b\u0010B\u001a\u00020\u0002H\u0002JR\u0010H\u001a\u00020\u00022\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0C2&\u0010E\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00122\b\u0010F\u001a\u0004\u0018\u00010\t2\u0006\u0010G\u001a\u00020\u001eH\u0002J$\u0010M\u001a\u00020\u00022\u001a\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020K\u0012\u0006\u0012\u0004\u0018\u00010K0J0IH\u0002Jk\u0010W\u001a\u00028\u0000\"\u0004\b\u0000\u0010N2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\"\b\u0002\u0010T\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020R\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010S0J0I2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000UH\u0002¢\u0006\u0004\bW\u0010XJ;\u0010N\u001a\u00020\u00022\u001a\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020R\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010S0Y2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010UH\u0002¢\u0006\u0004\bN\u0010[J\u0016\u0010\\\u001a\u0004\u0018\u00010\t*\u00020?2\u0006\u0010+\u001a\u00020\u0006H\u0002J\b\u0010]\u001a\u00020\u0002H\u0002J0\u0010d\u001a\u00020\u00022&\u0010c\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`bH\u0002J0\u0010e\u001a\u00020\u00022&\u0010c\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`bH\u0002J0\u0010f\u001a\u00020\u00022&\u0010c\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`bH\u0002J:\u0010h\u001a\u00020\u00022\b\b\u0002\u0010g\u001a\u00020\u001e2&\u0010c\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`bH\u0002J\b\u0010i\u001a\u00020\u0002H\u0002J\u001f\u0010l\u001a\u00020\u00022\u000e\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0jH\u0002¢\u0006\u0004\bl\u0010mJ\b\u0010n\u001a\u00020\u0002H\u0002J\u0012\u0010p\u001a\u00020\u00022\b\u0010o\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010q\u001a\u00020\u0002H\u0002J\u0012\u0010r\u001a\u00020\u00022\b\b\u0002\u0010g\u001a\u00020\u001eH\u0002J\u0010\u0010u\u001a\u00020\u00022\u0006\u0010t\u001a\u00020sH\u0002J\b\u0010v\u001a\u00020\u0002H\u0002J\b\u0010w\u001a\u00020\u0002H\u0002J\u0010\u0010y\u001a\u00020\u00022\u0006\u0010x\u001a\u00020\u0006H\u0002J\u0018\u0010|\u001a\u00020\u00022\u0006\u0010z\u001a\u00020K2\u0006\u0010{\u001a\u00020`H\u0002J\u0010\u0010~\u001a\u00020\u00022\u0006\u0010}\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u00020\u0002H\u0002J\t\u0010\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0001\u001a\u00020\u0002H\u0002J\u001a\u0010\u0001\u001a\u00020\u00022\u0007\u0010\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J!\u0010\u0001\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\t\u0010\u0001\u001a\u00020\u0002H\u0002J&\u0010\u0001\u001a\u00020\u00022\u0007\u0010\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0001\u001a\u00020\u00022\u0007\u0010\u0001\u001a\u00020\u0006H\u0002J&\u0010\u0001\u001a\u00020\u00022\u0007\u0010\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0001\u001a\u00020\u00022\u0007\u0010\u0001\u001a\u00020\u0006H\u0002J\u0011\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\t\u0010\u0001\u001a\u00020\u0002H\u0017J\u001b\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\t\u0010\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\t\u0010\u0001\u001a\u00020\u0002H\u0016J\u0012\u0010\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u000b\u0010\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0014\u0010\u0001\u001a\u00020\u00022\t\u0010\u0001\u001a\u0004\u0018\u00010\tH\u0001J(\u0010\u0001\u001a\u00020\u00022\u0014\u0010\u0001\u001a\u000f\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u00010jH\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\t\u0010\u0001\u001a\u00020\u0002H\u0017J%\u0010 \u0001\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020R2\t\u0010\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001J\t\u0010¢\u0001\u001a\u00020\u0002H\u0017J\t\u0010£\u0001\u001a\u00020\u0002H\u0017J\u0011\u0010¤\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\f\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0017J%\u0010§\u0001\u001a\u00020\u00022\u001a\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020K\u0012\u0006\u0012\u0004\u0018\u00010K0J0IH\u0017J;\u0010¨\u0001\u001a\u00020\u00022\u001a\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020R\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010S0Y2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020UH\u0000¢\u0006\u0005\b¨\u0001\u0010[J \u0010©\u0001\u001a\u00020\u00022\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020UH\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J.\u0010«\u0001\u001a\u00020\u001e2\u001a\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020R\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010S0YH\u0000¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u000b\u0010­\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010®\u0001\u001a\u00020\u00022\t\u0010\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010°\u0001\u001a\u00020\u00022\u0007\u0010\u0019\u001a\u00030¯\u0001H\u0016R#\u0010µ\u0001\u001a\u0006\u0012\u0002\b\u00030_8\u0016X\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¸\u0001\u001a\u00030¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010·\u0001R\u0018\u0010¼\u0001\u001a\u00030¹\u00018\u0002X\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u00018\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¿\u0001R@\u0010Ã\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`b0Á\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Â\u0001R@\u0010Ä\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`b0Á\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Â\u0001R\u001f\u0010É\u0001\u001a\u00020O8\u0016X\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R \u0010Ì\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010$0Ê\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010Ë\u0001R\u001b\u0010Î\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b­\u0001\u0010Í\u0001R\u0019\u0010\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b°\u0001\u0010Ñ\u0001R\u0019\u0010Ó\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0001R\u001a\u0010Ô\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Ñ\u0001R\u001c\u0010×\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Ö\u0001R;\u0010Û\u0001\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010Ø\u0001j\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`Ù\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Ú\u0001R\u0017\u0010Ü\u0001\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0018\u0010Þ\u0001\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÝ\u0001\u0010)R\u0018\u0010à\u0001\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bß\u0001\u0010)R\u001e\u0010T\u001a\n\u0012\u0005\u0012\u00030á\u00010Á\u00018\u0002X\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010Â\u0001R\u0018\u0010ä\u0001\u001a\u00030Ð\u00018\u0002X\u0004¢\u0006\b\n\u0006\bã\u0001\u0010Ñ\u0001R9\u0010ç\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00128\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001Ru\u0010é\u0001\u001a`\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u00120Ø\u0001j/\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u000fj\u0002`\u0012`Ù\u00018\u0002X\u0004¢\u0006\b\n\u0006\bè\u0001\u0010Ú\u0001R\u0018\u0010ë\u0001\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bê\u0001\u0010)R\u0018\u0010í\u0001\u001a\u00030Ð\u00018\u0002X\u0004¢\u0006\b\n\u0006\bì\u0001\u0010Ñ\u0001R\u0018\u0010ï\u0001\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bî\u0001\u0010)R\u0019\u0010ñ\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bð\u0001\u0010\u0001R\u0019\u0010ó\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bò\u0001\u0010\u0001R\u001a\u0010÷\u0001\u001a\u00030ô\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0019\u0010ù\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bø\u0001\u0010\u0001R\u001e\u0010û\u0001\u001a\t\u0012\u0004\u0012\u00020R0Ê\u00018\u0002X\u0004¢\u0006\b\n\u0006\bú\u0001\u0010Ë\u0001R)\u0010\u0002\u001a\u00020\u001e2\u0007\u0010ü\u0001\u001a\u00020\u001e8\u0000@BX\u000e¢\u0006\u000f\n\u0005\bý\u0001\u0010)\u001a\u0006\bþ\u0001\u0010ÿ\u0001R)\u0010\u0002\u001a\u00020\u001e2\u0007\u0010ü\u0001\u001a\u00020\u001e8\u0000@BX\u000e¢\u0006\u000f\n\u0005\b\u0002\u0010)\u001a\u0006\b\u0002\u0010ÿ\u0001R\u0018\u0010\u0002\u001a\u00020?8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bB\u0010\u0002R*\u0010\u0002\u001a\u00030¹\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020`8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0002R\u0017\u0010\u0002\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010)R=\u0010\u0002\u001a&\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u00128\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010æ\u0001RQ\u0010\u0002\u001a+\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`b\u0018\u00010Á\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b>\u0010Â\u0001\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00020s8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0002R=\u0010\u0002\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`b0Á\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010Â\u0001R0\u0010(\u001a\u00020\u001e2\u0007\u0010ü\u0001\u001a\u00020\u001e8\u0016@RX\u000e¢\u0006\u0017\n\u0005\b\u0002\u0010)\u0012\u0006\b\u0002\u0010\u0001\u001a\u0006\b\u0002\u0010ÿ\u0001R2\u0010\u0002\u001a\u00020\u00062\u0007\u0010ü\u0001\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u0012\u0006\b\u0002\u0010\u0001\u001a\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bN\u0010\u0001R!\u0010\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0Ê\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b<\u0010Ë\u0001R\u0018\u0010 \u0002\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u0001R\u0017\u0010¡\u0002\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u0018\u0010¢\u0002\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010)R\u0017\u0010£\u0002\u001a\u00030Ð\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ñ\u0001R=\u0010¤\u0002\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00020^j\u0002`b0Ê\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010Ë\u0001R\u0018\u0010¥\u0002\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0001R\u0018\u0010¦\u0002\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b)\u0010\u0001R\u0019\u0010§\u0002\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010¨\u0002\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0001R\u0017\u0010ª\u0002\u001a\u00020\u001e8@X\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010ÿ\u0001R\u0018\u0010­\u0002\u001a\u00030«\u00028VX\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010¬\u0002R\u001f\u0010¯\u0002\u001a\u00020\u001e8VX\u0004¢\u0006\u0010\u0012\u0006\b®\u0002\u0010\u0001\u001a\u0006\b±\u0001\u0010ÿ\u0001R\u0018\u0010²\u0002\u001a\u00030°\u00028VX\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010±\u0002R\u0019\u0010µ\u0002\u001a\u0004\u0018\u00010R8@X\u0004¢\u0006\b\u001a\u0006\b³\u0002\u0010´\u0002R\u001a\u0010·\u0002\u001a\u0005\u0018\u00010¯\u00018VX\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010¶\u0002¨\u0006º\u0002"}, mo44877d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Lnn0;", "Lr37;", "i1", "W", "q", "", "key", "e1", "", "dataKey", "f1", "U", "b1", "group", "Leo4;", "Ldo0;", "Lr86;", "Landroidx/compose/runtime/CompositionLocalMap;", "O", "(Ljava/lang/Integer;)Leo4;", "parentScope", "currentProviders", "q1", "T", "scope", "Z0", "(Ldo0;Leo4;)Ljava/lang/Object;", "X", "N", "", "isNode", "data", "h1", "objectKey", "d1", "Landroidx/compose/runtime/Pending;", "newPending", "Y", "expectedNodeCount", "inserting", "Z", "E0", "index", "o0", "newCount", "p1", "groupLocation", "recomposeGroup", "recomposeIndex", "t0", "s1", "count", "o1", "K", "oldGroup", "newGroup", "commonRoot", "U0", "nearestCommonRoot", "S", "recomposeKey", "M", "Lp46;", "i0", "c1", "H", "Lxy3;", "content", "locals", "parameter", "force", "p0", "", "Lkotlin/Pair;", "Lzy3;", "references", "j0", "R", "Lkt0;", "from", "to", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Lfq2;", "invalidations", "Lkotlin/Function0;", "block", "C0", "(Lkt0;Lkt0;Ljava/lang/Integer;Ljava/util/List;Lpc2;)Ljava/lang/Object;", "Leq2;", "invalidationsRequested", "(Leq2;Lfd2;)V", "s0", "t1", "Lkotlin/Function3;", "Ltp;", "Lt46;", "Lmc5;", "Landroidx/compose/runtime/Change;", "change", "F0", "G0", "Q0", "forParent", "R0", "A0", "", "nodes", "w0", "([Ljava/lang/Object;)V", "v0", "node", "I0", "T0", "y0", "Lbg;", "anchor", "L0", "V0", "H0", "groupBeingRemoved", "X0", "reference", "slots", "W0", "location", "N0", "P0", "J0", "K0", "a0", "J", "nodeIndex", "O0", "M0", "x0", "groupKey", "k1", "keyHash", "l1", "m1", "n1", "i", "o", "g1", "V", "I", "()V", "g", "Q", "r0", "value", "p", "r1", "Ljy4;", "values", "f", "([Ljy4;)V", "n", "instance", "j1", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "a1", "m", "a", "Lnn5;", "c", "n0", "L", "u0", "(Lpc2;)V", "B0", "(Leq2;)Z", "j", "e", "Lo85;", "l", "b", "Ltp;", "b0", "()Ltp;", "applier", "Lwn0;", "Lwn0;", "parentContext", "Lq46;", "d", "Lq46;", "slotTable", "", "Lnc5;", "Ljava/util/Set;", "abandonSet", "", "Ljava/util/List;", "changes", "lateChanges", "h", "Lkt0;", "d0", "()Lkt0;", "composition", "Lt76;", "Lt76;", "pendingStack", "Landroidx/compose/runtime/Pending;", "pending", "k", "Lvw2;", "Lvw2;", "nodeIndexStack", "groupNodeCount", "groupNodeCountStack", "", "[I", "nodeCountOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nodeCountVirtualOverrides", "forceRecomposeScopes", "r", "forciblyRecompose", "s", "nodeExpected", "Ldy2;", "t", "u", "entersStack", "v", "Leo4;", "parentProvider", "w", "providerUpdates", "x", "providersInvalid", "y", "providersInvalidStack", "z", "reusing", "A", "reusingGroup", "B", "childrenComposing", "La56;", "C", "La56;", "snapshot", "D", "compositionToken", "E", "invalidateStack", "<set-?>", "F", "q0", "()Z", "isComposing", "G", "isDisposed$runtime_release", "isDisposed", "Lp46;", "reader", "getInsertTable$runtime_release", "()Lq46;", "setInsertTable$runtime_release", "(Lq46;)V", "insertTable", "Lt46;", "writer", "writerHasAProvider", "providerCache", "g0", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "(Ljava/util/List;)V", "deferredChanges", "Lbg;", "insertAnchor", "insertFixups", "P", "h0", "getInserting$annotations", "e0", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "pendingUps", "downNodes", "writersReaderDelta", "startedGroup", "implicitRootStart", "startedGroups", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "c0", "areChildrenComposing", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getSkipping$annotations", "skipping", "Lyn0;", "()Lyn0;", "compositionData", "f0", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "()Lo85;", "recomposeScope", "<init>", "(Ltp;Lwn0;Lq46;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Lkt0;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class ComposerImpl implements nn0 {

    /* renamed from: A */
    public int f1445A = -1;

    /* renamed from: B */
    public int f1446B;

    /* renamed from: C */
    public a56 f1447C = SnapshotKt.m2218B();

    /* renamed from: D */
    public int f1448D;

    /* renamed from: E */
    public final t76<RecomposeScopeImpl> f1449E = new t76<>();

    /* renamed from: F */
    public boolean f1450F;

    /* renamed from: G */
    public boolean f1451G;

    /* renamed from: H */
    public p46 f1452H;

    /* renamed from: I */
    public q46 f1453I;

    /* renamed from: J */
    public t46 f1454J;

    /* renamed from: K */
    public boolean f1455K;

    /* renamed from: L */
    public eo4<do0<Object>, ? extends r86<? extends Object>> f1456L;

    /* renamed from: M */
    public List<id2<C3379tp<?>, t46, mc5, r37>> f1457M;

    /* renamed from: N */
    public C1628bg f1458N;

    /* renamed from: O */
    public final List<id2<C3379tp<?>, t46, mc5, r37>> f1459O;

    /* renamed from: P */
    public boolean f1460P;

    /* renamed from: Q */
    public int f1461Q;

    /* renamed from: R */
    public int f1462R;

    /* renamed from: S */
    public t76<Object> f1463S;

    /* renamed from: T */
    public int f1464T;

    /* renamed from: U */
    public boolean f1465U;

    /* renamed from: V */
    public boolean f1466V;

    /* renamed from: W */
    public final vw2 f1467W;

    /* renamed from: X */
    public final t76<id2<C3379tp<?>, t46, mc5, r37>> f1468X;

    /* renamed from: Y */
    public int f1469Y;

    /* renamed from: Z */
    public int f1470Z;

    /* renamed from: a0 */
    public int f1471a0;

    /* renamed from: b */
    public final C3379tp<?> f1472b;

    /* renamed from: b0 */
    public int f1473b0;

    /* renamed from: c */
    public final wn0 f1474c;

    /* renamed from: d */
    public final q46 f1475d;

    /* renamed from: e */
    public final Set<nc5> f1476e;

    /* renamed from: f */
    public List<id2<C3379tp<?>, t46, mc5, r37>> f1477f;

    /* renamed from: g */
    public List<id2<C3379tp<?>, t46, mc5, r37>> f1478g;

    /* renamed from: h */
    public final kt0 f1479h;

    /* renamed from: i */
    public final t76<Pending> f1480i = new t76<>();

    /* renamed from: j */
    public Pending f1481j;

    /* renamed from: k */
    public int f1482k;

    /* renamed from: l */
    public vw2 f1483l = new vw2();

    /* renamed from: m */
    public int f1484m;

    /* renamed from: n */
    public vw2 f1485n = new vw2();

    /* renamed from: o */
    public int[] f1486o;

    /* renamed from: p */
    public HashMap<Integer, Integer> f1487p;

    /* renamed from: q */
    public boolean f1488q;

    /* renamed from: r */
    public boolean f1489r;

    /* renamed from: s */
    public boolean f1490s;

    /* renamed from: t */
    public final List<dy2> f1491t = new ArrayList();

    /* renamed from: u */
    public final vw2 f1492u = new vw2();

    /* renamed from: v */
    public eo4<do0<Object>, ? extends r86<? extends Object>> f1493v = cy1.m14609a();

    /* renamed from: w */
    public final HashMap<Integer, eo4<do0<Object>, r86<Object>>> f1494w = new HashMap<>();

    /* renamed from: x */
    public boolean f1495x;

    /* renamed from: y */
    public final vw2 f1496y = new vw2();

    /* renamed from: z */
    public boolean f1497z;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u00060\u0006R\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo44877d2 = {"Landroidx/compose/runtime/ComposerImpl$a;", "Lnc5;", "Lr37;", "a", "b", "c", "Landroidx/compose/runtime/ComposerImpl$b;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "Landroidx/compose/runtime/ComposerImpl$b;", "d", "()Landroidx/compose/runtime/ComposerImpl$b;", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.ComposerImpl$a */
    /* compiled from: Composer.kt */
    public static final class C0337a implements nc5 {
        /* renamed from: a */
        public void mo2988a() {
        }

        /* renamed from: b */
        public void mo2989b() {
            throw null;
        }

        /* renamed from: c */
        public void mo2990c() {
            throw null;
        }

        /* renamed from: d */
        public final C0338b mo2991d() {
            return null;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"Landroidx/compose/runtime/ComposerImpl$b;", "Lwn0;", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.ComposerImpl$b */
    /* compiled from: Composer.kt */
    public final class C0338b extends wn0 {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.ComposerImpl$c */
    /* compiled from: Comparisons.kt */
    public static final class C0339c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(Integer.valueOf(((dy2) t).mo19009b()), Integer.valueOf(((dy2) t2).mo19009b()));
        }
    }

    /* JADX INFO: finally extract failed */
    public ComposerImpl(C3379tp<?> tpVar, wn0 wn0, q46 q46, Set<nc5> set, List<id2<C3379tp<?>, t46, mc5, r37>> list, List<id2<C3379tp<?>, t46, mc5, r37>> list2, kt0 kt0) {
        vx2.m53591g(tpVar, "applier");
        vx2.m53591g(wn0, "parentContext");
        vx2.m53591g(q46, "slotTable");
        vx2.m53591g(set, "abandonSet");
        vx2.m53591g(list, "changes");
        vx2.m53591g(list2, "lateChanges");
        vx2.m53591g(kt0, "composition");
        this.f1472b = tpVar;
        this.f1474c = wn0;
        this.f1475d = q46;
        this.f1476e = set;
        this.f1477f = list;
        this.f1478g = list2;
        this.f1479h = kt0;
        p46 D = q46.mo24926D();
        D.mo24414d();
        this.f1452H = D;
        q46 q462 = new q46();
        this.f1453I = q462;
        t46 E = q462.mo24927E();
        E.mo26072F();
        this.f1454J = E;
        p46 D2 = this.f1453I.mo24926D();
        try {
            C1628bg a = D2.mo24411a(0);
            D2.mo24414d();
            this.f1458N = a;
            this.f1459O = new ArrayList();
            this.f1463S = new t76<>();
            this.f1466V = true;
            this.f1467W = new vw2();
            this.f1468X = new t76<>();
            this.f1469Y = -1;
            this.f1470Z = -1;
            this.f1471a0 = -1;
        } catch (Throwable th) {
            D2.mo24414d();
            throw th;
        }
    }

    /* renamed from: D0 */
    public static /* synthetic */ Object m1859D0(ComposerImpl composerImpl, kt0 kt0, kt0 kt02, Integer num, List list, pc2 pc2, int i, Object obj) {
        kt0 kt03;
        kt0 kt04;
        Integer num2;
        if ((i & 1) != 0) {
            kt03 = null;
        } else {
            kt03 = kt0;
        }
        if ((i & 2) != 0) {
            kt04 = null;
        } else {
            kt04 = kt02;
        }
        if ((i & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 8) != 0) {
            list = ck0.m33062j();
        }
        return composerImpl.mo2890C0(kt03, kt04, num2, list, pc2);
    }

    /* renamed from: P */
    public static /* synthetic */ eo4 m1863P(ComposerImpl composerImpl, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return composerImpl.mo2908O(num);
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m1864S0(ComposerImpl composerImpl, boolean z, id2 id2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.mo2914R0(z, id2);
    }

    /* renamed from: Y0 */
    public static final int m1865Y0(ComposerImpl composerImpl, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        C0337a aVar;
        ComposerImpl composerImpl2 = composerImpl;
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (composerImpl2.f1452H.mo24394B(i4)) {
            int y = composerImpl2.f1452H.mo24436y(i4);
            Object z3 = composerImpl2.f1452H.mo24437z(i4);
            if (y == 126665345 && (z3 instanceof xy3)) {
                xy3 xy3 = (xy3) z3;
                Object x = composerImpl2.f1452H.mo24435x(i4, 0);
                C1628bg a = composerImpl2.f1452H.mo24411a(i4);
                List e = ComposerKt.m1984B(composerImpl2.f1491t, i4, composerImpl2.f1452H.mo24393A(i4) + i4);
                ArrayList arrayList = new ArrayList(e.size());
                int size = e.size();
                for (int i7 = 0; i7 < size; i7++) {
                    dy2 dy2 = (dy2) e.get(i7);
                    arrayList.add(wy6.m54142a(dy2.mo19010c(), dy2.mo19008a()));
                }
                zy3 zy3 = new zy3(xy3, x, composerImpl.mo2939d0(), composerImpl2.f1475d, a, arrayList, composerImpl2.mo2908O(Integer.valueOf(i)));
                composerImpl2.f1474c.mo3099b(zy3);
                composerImpl.mo2910P0();
                composerImpl2.mo2892F0(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl2, zy3));
                if (!z) {
                    return composerImpl2.f1452H.mo24402J(i4);
                }
                composerImpl.mo2986x0();
                composerImpl.mo2888A0();
                composerImpl.mo2984v0();
                if (!composerImpl2.f1452H.mo24398F(i4)) {
                    i6 = composerImpl2.f1452H.mo24402J(i4);
                }
                if (i6 <= 0) {
                    return 0;
                }
                composerImpl2.mo2909O0(i5, i6);
                return 0;
            } else if (y != 206 || !vx2.m53586b(z3, ComposerKt.m1994L())) {
                return composerImpl2.f1452H.mo24402J(i4);
            } else {
                Object x2 = composerImpl2.f1452H.mo24435x(i4, 0);
                if (x2 instanceof C0337a) {
                    aVar = (C0337a) x2;
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    return composerImpl2.f1452H.mo24402J(i4);
                }
                aVar.mo2991d();
                throw null;
            }
        } else if (!composerImpl2.f1452H.mo24415e(i4)) {
            return composerImpl2.f1452H.mo24402J(i4);
        } else {
            int A = composerImpl2.f1452H.mo24393A(i4) + i4;
            int i8 = 0;
            for (int i9 = i4 + 1; i9 < A; i9 += composerImpl2.f1452H.mo24393A(i9)) {
                boolean F = composerImpl2.f1452H.mo24398F(i9);
                if (F) {
                    composerImpl.mo2986x0();
                    composerImpl2.mo2897I0(composerImpl2.f1452H.mo24400H(i9));
                }
                if (F || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (F) {
                    i3 = 0;
                } else {
                    i3 = i5 + i8;
                }
                i8 += m1865Y0(composerImpl2, i9, z2, i3);
                if (F) {
                    composerImpl.mo2986x0();
                    composerImpl.mo2917T0();
                }
            }
            return i8;
        }
    }

    /* renamed from: k0 */
    public static final int m1866k0(t46 t46) {
        int i;
        int U = t46.mo26102U();
        int V = t46.mo26104V();
        while (V >= 0 && !t46.mo26128k0(V)) {
            V = t46.mo26141x0(V);
        }
        int i2 = V + 1;
        int i3 = 0;
        while (i2 < U) {
            if (t46.mo26123f0(U, i2)) {
                if (t46.mo26128k0(i2)) {
                    i3 = 0;
                }
                i2++;
            } else {
                if (t46.mo26128k0(i2)) {
                    i = 1;
                } else {
                    i = t46.mo26139v0(i2);
                }
                i3 += i;
                i2 += t46.mo26118c0(i2);
            }
        }
        return i3;
    }

    /* renamed from: l0 */
    public static final int m1867l0(t46 t46, C1628bg bgVar, C3379tp<Object> tpVar) {
        boolean z;
        int B = t46.mo26064B(bgVar);
        boolean z2 = true;
        if (t46.mo26102U() < B) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m2006X(z);
        m1868m0(t46, tpVar, B);
        int k0 = m1866k0(t46);
        while (t46.mo26102U() < B) {
            if (t46.mo26122e0(B)) {
                if (t46.mo26127j0()) {
                    tpVar.mo25329f(t46.mo26138u0(t46.mo26102U()));
                    k0 = 0;
                }
                t46.mo26099S0();
            } else {
                k0 += t46.mo26087M0();
            }
        }
        if (t46.mo26102U() != B) {
            z2 = false;
        }
        ComposerKt.m2006X(z2);
        return k0;
    }

    /* renamed from: m0 */
    public static final void m1868m0(t46 t46, C3379tp<Object> tpVar, int i) {
        while (!t46.mo26124g0(i)) {
            t46.mo26089N0();
            if (t46.mo26128k0(t46.mo26104V())) {
                tpVar.mo25331h();
            }
            t46.mo26088N();
        }
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m1878z0(ComposerImpl composerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.mo2987y0(z);
    }

    /* renamed from: A0 */
    public final void mo2888A0() {
        int i = this.f1462R;
        if (i > 0) {
            this.f1462R = 0;
            mo2892F0(new ComposerImpl$realizeUps$1(i));
        }
    }

    /* renamed from: B0 */
    public final boolean mo2889B0(eq2<RecomposeScopeImpl, fq2<Object>> eq2) {
        vx2.m53591g(eq2, "invalidationsRequested");
        if (!this.f1477f.isEmpty()) {
            ComposerKt.m2032x("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        } else if (!eq2.mo19463i() && !(!this.f1491t.isEmpty()) && !this.f1489r) {
            return false;
        } else {
            mo2913R(eq2, (fd2<? super nn0, ? super Integer, r37>) null);
            return !this.f1477f.isEmpty();
        }
    }

    /* renamed from: C0 */
    public final <R> R mo2890C0(kt0 kt0, kt0 kt02, Integer num, List<Pair<RecomposeScopeImpl, fq2<Object>>> list, pc2<? extends R> pc2) {
        R r;
        int i;
        kt0 kt03 = kt0;
        boolean z = this.f1466V;
        boolean z2 = this.f1450F;
        int i2 = this.f1482k;
        try {
            this.f1466V = false;
            this.f1450F = true;
            this.f1482k = 0;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Pair pair = list.get(i3);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.component1();
                fq2 fq2 = (fq2) pair.component2();
                if (fq2 != null) {
                    int size2 = fq2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        mo2958j1(recomposeScopeImpl, fq2.get(i4));
                    }
                } else {
                    mo2958j1(recomposeScopeImpl, (Object) null);
                }
            }
            if (kt03 != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                r = kt0.mo11742a(kt02, i, pc2);
                if (r == null) {
                }
                return r;
            }
            pc2<? extends R> pc22 = pc2;
            r = pc2.invoke();
            return r;
        } finally {
            this.f1466V = z;
            this.f1450F = z2;
            this.f1482k = i2;
        }
    }

    /* renamed from: E0 */
    public final void mo2891E0() {
        boolean z = this.f1450F;
        this.f1450F = true;
        int r = this.f1452H.mo24428r();
        int A = this.f1452H.mo24393A(r) + r;
        int i = this.f1482k;
        int e0 = mo2942e0();
        int i2 = this.f1484m;
        dy2 f = ComposerKt.m1987E(this.f1491t, this.f1452H.mo24420j(), A);
        boolean z2 = false;
        int i3 = r;
        while (f != null) {
            int b = f.mo19009b();
            dy2 unused = ComposerKt.m2004V(this.f1491t, b);
            if (f.mo19011d()) {
                this.f1452H.mo24405M(b);
                int j = this.f1452H.mo24420j();
                mo2919U0(i3, j, r);
                this.f1482k = mo2981t0(b, j, r, i);
                this.f1461Q = mo2904M(this.f1452H.mo24404L(j), r, e0);
                this.f1456L = null;
                f.mo19010c().mo3067h(this);
                this.f1456L = null;
                this.f1452H.mo24406N(r);
                i3 = j;
                z2 = true;
            } else {
                this.f1449E.mo26184h(f.mo19010c());
                f.mo19010c().mo3084x();
                this.f1449E.mo26183g();
            }
            f = ComposerKt.m1987E(this.f1491t, this.f1452H.mo24420j(), A);
        }
        if (z2) {
            mo2919U0(i3, r, r);
            this.f1452H.mo24408P();
            int s1 = mo2980s1(r);
            this.f1482k = i + s1;
            this.f1484m = i2 + s1;
        } else {
            mo2937c1();
        }
        this.f1461Q = e0;
        this.f1450F = z;
    }

    /* renamed from: F0 */
    public final void mo2892F0(id2<? super C3379tp<?>, ? super t46, ? super mc5, r37> id2) {
        this.f1477f.add(id2);
    }

    /* renamed from: G0 */
    public final void mo2893G0(id2<? super C3379tp<?>, ? super t46, ? super mc5, r37> id2) {
        mo2888A0();
        mo2984v0();
        mo2892F0(id2);
    }

    /* renamed from: H */
    public final void mo2894H() {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (mo2951h0()) {
            kt0 d0 = mo2939d0();
            vx2.m53589e(d0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((bo0) d0);
            this.f1449E.mo26184h(recomposeScopeImpl2);
            mo2978r1(recomposeScopeImpl2);
            recomposeScopeImpl2.mo3064F(this.f1448D);
            return;
        }
        dy2 r = ComposerKt.m2004V(this.f1491t, this.f1452H.mo24428r());
        Object G = this.f1452H.mo24399G();
        if (vx2.m53586b(G, nn0.f15626a.mo23753a())) {
            kt0 d02 = mo2939d0();
            vx2.m53589e(d02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl((bo0) d02);
            mo2978r1(recomposeScopeImpl);
        } else {
            vx2.m53589e(G, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) G;
        }
        if (r != null) {
            z = true;
        } else {
            z = false;
        }
        recomposeScopeImpl.mo3060B(z);
        this.f1449E.mo26184h(recomposeScopeImpl);
        recomposeScopeImpl.mo3064F(this.f1448D);
    }

    /* renamed from: H0 */
    public final void mo2895H0() {
        mo2925X0(this.f1452H.mo24420j());
        mo2912Q0(ComposerKt.f1499b);
        this.f1464T += this.f1452H.mo24425o();
    }

    /* renamed from: I */
    public final void mo2896I() {
        this.f1494w.clear();
    }

    /* renamed from: I0 */
    public final void mo2897I0(Object obj) {
        this.f1463S.mo26184h(obj);
    }

    /* renamed from: J */
    public final void mo2898J() {
        this.f1481j = null;
        this.f1482k = 0;
        this.f1484m = 0;
        this.f1464T = 0;
        this.f1461Q = 0;
        this.f1490s = false;
        this.f1465U = false;
        this.f1467W.mo27339a();
        this.f1449E.mo26177a();
        mo2900K();
    }

    /* renamed from: J0 */
    public final void mo2899J0() {
        boolean z;
        int r = this.f1452H.mo24428r();
        if (this.f1467W.mo27345g(-1) <= r) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ComposerKt.m2032x("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        } else if (this.f1467W.mo27345g(-1) == r) {
            this.f1467W.mo27346h();
            m1864S0(this, false, ComposerKt.f1501d, 1, (Object) null);
        }
    }

    /* renamed from: K */
    public final void mo2900K() {
        this.f1486o = null;
        this.f1487p = null;
    }

    /* renamed from: K0 */
    public final void mo2901K0() {
        if (this.f1465U) {
            m1864S0(this, false, ComposerKt.f1501d, 1, (Object) null);
            this.f1465U = false;
        }
    }

    /* renamed from: L */
    public final void mo2902L(eq2<RecomposeScopeImpl, fq2<Object>> eq2, fd2<? super nn0, ? super Integer, r37> fd2) {
        vx2.m53591g(eq2, "invalidationsRequested");
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        if (this.f1477f.isEmpty()) {
            mo2913R(eq2, fd2);
        } else {
            ComposerKt.m2032x("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: L0 */
    public final void mo2903L0(C1628bg bgVar) {
        if (this.f1459O.isEmpty()) {
            mo2912Q0(new ComposerImpl$recordInsert$1(this.f1453I, bgVar));
            return;
        }
        List<T> M0 = CollectionsKt___CollectionsKt.m47313M0(this.f1459O);
        this.f1459O.clear();
        mo2888A0();
        mo2984v0();
        mo2912Q0(new ComposerImpl$recordInsert$2(this.f1453I, bgVar, M0));
    }

    /* renamed from: M */
    public final int mo2904M(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int i0 = mo2954i0(this.f1452H, i);
        if (i0 == 126665345) {
            return i0;
        }
        return Integer.rotateLeft(mo2904M(this.f1452H.mo24404L(i), i2, i3), 3) ^ i0;
    }

    /* renamed from: M0 */
    public final void mo2905M0(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.f1473b0;
            if (i4 > 0 && this.f1470Z == i - i4 && this.f1471a0 == i2 - i4) {
                this.f1473b0 = i4 + i3;
                return;
            }
            mo2986x0();
            this.f1470Z = i;
            this.f1471a0 = i2;
            this.f1473b0 = i3;
        }
    }

    /* renamed from: N */
    public final void mo2906N() {
        ComposerKt.m2006X(this.f1454J.mo26100T());
        q46 q46 = new q46();
        this.f1453I = q46;
        t46 E = q46.mo24927E();
        E.mo26072F();
        this.f1454J = E;
    }

    /* renamed from: N0 */
    public final void mo2907N0(int i) {
        this.f1464T = i - (this.f1452H.mo24420j() - this.f1464T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: eo4<do0<java.lang.Object>, ? extends r86<? extends java.lang.Object>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.eo4<p000.do0<java.lang.Object>, p000.r86<java.lang.Object>> mo2908O(java.lang.Integer r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0007
            eo4<do0<java.lang.Object>, ? extends r86<? extends java.lang.Object>> r0 = r5.f1456L
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r0 = r5.mo2951h0()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r5.f1455K
            if (r0 == 0) goto L_0x004a
            t46 r0 = r5.f1454J
            int r0 = r0.mo26104V()
        L_0x001b:
            if (r0 <= 0) goto L_0x004a
            t46 r3 = r5.f1454J
            int r3 = r3.mo26114a0(r0)
            if (r3 != r2) goto L_0x0043
            t46 r3 = r5.f1454J
            java.lang.Object r3 = r3.mo26116b0(r0)
            java.lang.Object r4 = androidx.compose.runtime.ComposerKt.m1988F()
            boolean r3 = p000.vx2.m53586b(r3, r4)
            if (r3 == 0) goto L_0x0043
            t46 r6 = r5.f1454J
            java.lang.Object r6 = r6.mo26110Y(r0)
            p000.vx2.m53589e(r6, r1)
            eo4 r6 = (p000.eo4) r6
            r5.f1456L = r6
            return r6
        L_0x0043:
            t46 r3 = r5.f1454J
            int r0 = r3.mo26141x0(r0)
            goto L_0x001b
        L_0x004a:
            p46 r0 = r5.f1452H
            int r0 = r0.mo24430t()
            if (r0 <= 0) goto L_0x009d
            if (r6 == 0) goto L_0x0059
            int r6 = r6.intValue()
            goto L_0x005f
        L_0x0059:
            p46 r6 = r5.f1452H
            int r6 = r6.mo24428r()
        L_0x005f:
            if (r6 <= 0) goto L_0x009d
            p46 r0 = r5.f1452H
            int r0 = r0.mo24436y(r6)
            if (r0 != r2) goto L_0x0096
            p46 r0 = r5.f1452H
            java.lang.Object r0 = r0.mo24437z(r6)
            java.lang.Object r3 = androidx.compose.runtime.ComposerKt.m1988F()
            boolean r0 = p000.vx2.m53586b(r0, r3)
            if (r0 == 0) goto L_0x0096
            java.util.HashMap<java.lang.Integer, eo4<do0<java.lang.Object>, r86<java.lang.Object>>> r0 = r5.f1494w
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.get(r2)
            eo4 r0 = (p000.eo4) r0
            if (r0 != 0) goto L_0x0093
            p46 r0 = r5.f1452H
            java.lang.Object r6 = r0.mo24433v(r6)
            p000.vx2.m53589e(r6, r1)
            r0 = r6
            eo4 r0 = (p000.eo4) r0
        L_0x0093:
            r5.f1456L = r0
            return r0
        L_0x0096:
            p46 r0 = r5.f1452H
            int r6 = r0.mo24404L(r6)
            goto L_0x005f
        L_0x009d:
            eo4<do0<java.lang.Object>, ? extends r86<? extends java.lang.Object>> r6 = r5.f1493v
            r5.f1456L = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo2908O(java.lang.Integer):eo4");
    }

    /* renamed from: O0 */
    public final void mo2909O0(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ComposerKt.m2032x(("Invalid remove index " + i).toString());
                throw new KotlinNothingValueException();
            } else if (this.f1469Y == i) {
                this.f1473b0 += i2;
            } else {
                mo2986x0();
                this.f1469Y = i;
                this.f1473b0 = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r6.f1452H;
     */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2910P0() {
        /*
            r6 = this;
            p46 r0 = r6.f1452H
            int r0 = r0.mo24430t()
            if (r0 <= 0) goto L_0x003e
            p46 r0 = r6.f1452H
            int r1 = r0.mo24428r()
            vw2 r2 = r6.f1467W
            r3 = -2
            int r2 = r2.mo27345g(r3)
            if (r2 == r1) goto L_0x003e
            boolean r2 = r6.f1465U
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x002b
            boolean r2 = r6.f1466V
            if (r2 == 0) goto L_0x002b
            id2 r2 = androidx.compose.runtime.ComposerKt.f1502e
            m1864S0(r6, r4, r2, r5, r3)
            r6.f1465U = r5
        L_0x002b:
            if (r1 <= 0) goto L_0x003e
            bg r0 = r0.mo24411a(r1)
            vw2 r2 = r6.f1467W
            r2.mo27347i(r1)
            androidx.compose.runtime.ComposerImpl$recordSlotEditing$1 r1 = new androidx.compose.runtime.ComposerImpl$recordSlotEditing$1
            r1.<init>(r0)
            m1864S0(r6, r4, r1, r5, r3)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo2910P0():void");
    }

    /* renamed from: Q */
    public final void mo2911Q() {
        ms6 ms6 = ms6.f15248a;
        Object a = ms6.mo23383a("Compose:Composer.dispose");
        try {
            this.f1474c.mo27564o(this);
            this.f1449E.mo26177a();
            this.f1491t.clear();
            this.f1477f.clear();
            this.f1494w.clear();
            mo2933b0().clear();
            this.f1451G = true;
            r37 r37 = r37.f33317a;
            ms6.mo23384b(a);
        } catch (Throwable th) {
            ms6.f15248a.mo23384b(a);
            throw th;
        }
    }

    /* renamed from: Q0 */
    public final void mo2912Q0(id2<? super C3379tp<?>, ? super t46, ? super mc5, r37> id2) {
        m1878z0(this, false, 1, (Object) null);
        mo2910P0();
        mo2892F0(id2);
    }

    /* renamed from: R */
    public final void mo2913R(eq2<RecomposeScopeImpl, fq2<Object>> eq2, fd2<? super nn0, ? super Integer, r37> fd2) {
        if (!this.f1450F) {
            Object a = ms6.f15248a.mo23383a("Compose:recompose");
            try {
                a56 B = SnapshotKt.m2218B();
                this.f1447C = B;
                this.f1448D = B.mo43f();
                this.f1494w.clear();
                int g = eq2.mo19461g();
                int i = 0;
                while (i < g) {
                    Object obj = eq2.mo19460f()[i];
                    vx2.m53589e(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    fq2 fq2 = (fq2) eq2.mo19462h()[i];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    C1628bg j = recomposeScopeImpl.mo3070j();
                    if (j != null) {
                        this.f1491t.add(new dy2(recomposeScopeImpl, j.mo11639a(), fq2));
                        i++;
                    } else {
                        ms6.f15248a.mo23384b(a);
                        return;
                    }
                }
                List<dy2> list = this.f1491t;
                if (list.size() > 1) {
                    gk0.m44738y(list, new C0339c());
                }
                this.f1482k = 0;
                this.f1450F = true;
                mo2955i1();
                Object r0 = mo2977r0();
                if (!(r0 == fd2 || fd2 == null)) {
                    mo2978r1(fd2);
                }
                i56.m19415d(new ComposerImpl$doCompose$2$3(this), new ComposerImpl$doCompose$2$4(this), new ComposerImpl$doCompose$2$5(fd2, this, r0));
                mo2922W();
                this.f1450F = false;
                this.f1491t.clear();
                r37 r37 = r37.f33317a;
                ms6.f15248a.mo23384b(a);
            } catch (Throwable th) {
                ms6.f15248a.mo23384b(a);
                throw th;
            }
        } else {
            ComposerKt.m2032x("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: R0 */
    public final void mo2914R0(boolean z, id2<? super C3379tp<?>, ? super t46, ? super mc5, r37> id2) {
        mo2987y0(z);
        mo2892F0(id2);
    }

    /* renamed from: S */
    public final void mo2915S(int i, int i2) {
        if (i > 0 && i != i2) {
            mo2915S(this.f1452H.mo24404L(i), i2);
            if (this.f1452H.mo24398F(i)) {
                mo2897I0(mo2979s0(this.f1452H, i));
            }
        }
    }

    /* renamed from: T */
    public final void mo2916T(boolean z) {
        List<pa3> list;
        if (mo2951h0()) {
            int V = this.f1454J.mo26104V();
            mo2964m1(this.f1454J.mo26114a0(V), this.f1454J.mo26116b0(V), this.f1454J.mo26110Y(V));
        } else {
            int r = this.f1452H.mo24428r();
            mo2964m1(this.f1452H.mo24436y(r), this.f1452H.mo24437z(r), this.f1452H.mo24433v(r));
        }
        int i = this.f1484m;
        Pending pending = this.f1481j;
        int i2 = 0;
        if (pending != null && pending.mo3045b().size() > 0) {
            List<pa3> b = pending.mo3045b();
            List<pa3> f = pending.mo3049f();
            Set<T> e = ei3.m16104e(f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f.size();
            int size2 = b.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                pa3 pa3 = b.get(i3);
                if (!e.contains(pa3)) {
                    mo2909O0(pending.mo3050g(pa3) + pending.mo3048e(), pa3.mo24510c());
                    pending.mo3057n(pa3.mo24509b(), i2);
                    mo2907N0(pa3.mo24509b());
                    this.f1452H.mo24405M(pa3.mo24509b());
                    mo2895H0();
                    this.f1452H.mo24407O();
                    ComposerKt.m2005W(this.f1491t, pa3.mo24509b(), pa3.mo24509b() + this.f1452H.mo24393A(pa3.mo24509b()));
                } else if (!linkedHashSet.contains(pa3)) {
                    if (i4 < size) {
                        pa3 pa32 = f.get(i4);
                        if (pa32 != pa3) {
                            int g = pending.mo3050g(pa32);
                            linkedHashSet.add(pa32);
                            if (g != i5) {
                                int o = pending.mo3058o(pa32);
                                list = f;
                                mo2905M0(pending.mo3048e() + g, i5 + pending.mo3048e(), o);
                                pending.mo3053j(g, i5, o);
                            } else {
                                list = f;
                            }
                        } else {
                            list = f;
                            i3++;
                        }
                        i4++;
                        i5 += pending.mo3058o(pa32);
                        f = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            mo2986x0();
            if (b.size() > 0) {
                mo2907N0(this.f1452H.mo24422l());
                this.f1452H.mo24408P();
            }
        }
        int i6 = this.f1482k;
        while (!this.f1452H.mo24396D()) {
            int j = this.f1452H.mo24420j();
            mo2895H0();
            mo2909O0(i6, this.f1452H.mo24407O());
            ComposerKt.m2005W(this.f1491t, j, this.f1452H.mo24420j());
        }
        boolean h0 = mo2951h0();
        if (h0) {
            if (z) {
                mo2921V0();
                i = 1;
            }
            this.f1452H.mo24416f();
            int V2 = this.f1454J.mo26104V();
            this.f1454J.mo26088N();
            if (!this.f1452H.mo24427q()) {
                int o0 = mo2969o0(V2);
                this.f1454J.mo26090O();
                this.f1454J.mo26072F();
                mo2903L0(this.f1458N);
                this.f1460P = false;
                if (!this.f1475d.isEmpty()) {
                    mo2970o1(o0, 0);
                    mo2973p1(o0, i);
                }
            }
        } else {
            if (z) {
                mo2917T0();
            }
            mo2899J0();
            int r2 = this.f1452H.mo24428r();
            if (i != mo2980s1(r2)) {
                mo2973p1(r2, i);
            }
            if (z) {
                i = 1;
            }
            this.f1452H.mo24417g();
            mo2986x0();
        }
        mo2927Z(i, h0);
    }

    /* renamed from: T0 */
    public final void mo2917T0() {
        if (this.f1463S.mo26180d()) {
            this.f1463S.mo26183g();
        } else {
            this.f1462R++;
        }
    }

    /* renamed from: U */
    public final void mo2918U() {
        mo2916T(false);
    }

    /* renamed from: U0 */
    public final void mo2919U0(int i, int i2, int i3) {
        p46 p46 = this.f1452H;
        int o = ComposerKt.m1999Q(p46, i, i2, i3);
        while (i > 0 && i != o) {
            if (p46.mo24398F(i)) {
                mo2917T0();
            }
            i = p46.mo24404L(i);
        }
        mo2915S(i2, o);
    }

    /* renamed from: V */
    public void mo2920V() {
        mo2918U();
    }

    /* renamed from: V0 */
    public final void mo2921V0() {
        this.f1459O.add(this.f1468X.mo26183g());
    }

    /* renamed from: W */
    public final void mo2922W() {
        mo2918U();
        this.f1474c.mo27560c();
        mo2918U();
        mo2901K0();
        mo2930a0();
        this.f1452H.mo24414d();
        this.f1489r = false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: W0 */
    public final void mo2923W0(zy3 zy3, t46 t46) {
        q46 q46 = new q46();
        t46 E = q46.mo24927E();
        try {
            E.mo26068D();
            E.mo26101T0(126665345, zy3.mo28674c());
            t46.m27338m0(E, 0, 1, (Object) null);
            E.mo26107W0(zy3.mo28677f());
            t46.mo26136t0(zy3.mo28672a(), 1, E);
            E.mo26087M0();
            E.mo26088N();
            E.mo26090O();
            r37 r37 = r37.f33317a;
            E.mo26072F();
            this.f1474c.mo3111j(zy3, new yy3(q46));
        } catch (Throwable th) {
            E.mo26072F();
            throw th;
        }
    }

    /* renamed from: X */
    public final void mo2924X() {
        if (this.f1454J.mo26100T()) {
            t46 E = this.f1453I.mo24927E();
            this.f1454J = E;
            E.mo26089N0();
            this.f1455K = false;
            this.f1456L = null;
        }
    }

    /* renamed from: X0 */
    public final void mo2925X0(int i) {
        m1865Y0(this, i, false, 0);
        mo2986x0();
    }

    /* renamed from: Y */
    public final void mo2926Y(boolean z, Pending pending) {
        this.f1480i.mo26184h(this.f1481j);
        this.f1481j = pending;
        this.f1483l.mo27347i(this.f1482k);
        if (z) {
            this.f1482k = 0;
        }
        this.f1485n.mo27347i(this.f1484m);
        this.f1484m = 0;
    }

    /* renamed from: Z */
    public final void mo2927Z(int i, boolean z) {
        Pending g = this.f1480i.mo26183g();
        if (g != null && !z) {
            g.mo3055l(g.mo3044a() + 1);
        }
        this.f1481j = g;
        this.f1482k = this.f1483l.mo27346h() + i;
        this.f1484m = this.f1485n.mo27346h() + i;
    }

    /* renamed from: Z0 */
    public final <T> T mo2928Z0(do0<T> do0, eo4<do0<Object>, ? extends r86<? extends Object>> eo4) {
        if (ComposerKt.m2034z(eo4, do0)) {
            return ComposerKt.m1995M(eo4, do0);
        }
        return do0.mo18865a().getValue();
    }

    /* renamed from: a */
    public nn0 mo2929a(int i) {
        mo2940d1(i, (Object) null, false, (Object) null);
        mo2894H();
        return this;
    }

    /* renamed from: a0 */
    public final void mo2930a0() {
        mo2888A0();
        if (!this.f1480i.mo26179c()) {
            ComposerKt.m2032x("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        } else if (this.f1467W.mo27342d()) {
            mo2898J();
        } else {
            ComposerKt.m2032x("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: a1 */
    public void mo2931a1() {
        if (this.f1491t.isEmpty()) {
            mo2934b1();
            return;
        }
        p46 p46 = this.f1452H;
        int m = p46.mo24423m();
        Object n = p46.mo24424n();
        Object k = p46.mo24421k();
        mo2960k1(m, n, k);
        mo2952h1(p46.mo24397E(), (Object) null);
        mo2891E0();
        p46.mo24417g();
        mo2964m1(m, n, k);
    }

    /* renamed from: b */
    public boolean mo2932b() {
        boolean z;
        if (!mo2951h0() && !this.f1497z && !this.f1495x) {
            RecomposeScopeImpl f0 = mo2945f0();
            if (f0 == null || f0.mo3074n()) {
                z = false;
            } else {
                z = true;
            }
            if (z && !this.f1489r) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public C3379tp<?> mo2933b0() {
        return this.f1472b;
    }

    /* renamed from: b1 */
    public final void mo2934b1() {
        this.f1484m += this.f1452H.mo24407O();
    }

    /* renamed from: c */
    public nn5 mo2935c() {
        RecomposeScopeImpl recomposeScopeImpl;
        C1628bg bgVar;
        rc2<vn0, r37> i;
        RecomposeScopeImpl recomposeScopeImpl2 = null;
        if (this.f1449E.mo26180d()) {
            recomposeScopeImpl = this.f1449E.mo26183g();
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.mo3060B(false);
        }
        if (!(recomposeScopeImpl == null || (i = recomposeScopeImpl.mo3068i(this.f1448D)) == null)) {
            mo2892F0(new ComposerImpl$endRestartGroup$1$1(i, this));
        }
        if (recomposeScopeImpl != null && !recomposeScopeImpl.mo3076p() && (recomposeScopeImpl.mo3077q() || this.f1488q)) {
            if (recomposeScopeImpl.mo3070j() == null) {
                if (mo2951h0()) {
                    t46 t46 = this.f1454J;
                    bgVar = t46.mo26062A(t46.mo26104V());
                } else {
                    p46 p46 = this.f1452H;
                    bgVar = p46.mo24411a(p46.mo24428r());
                }
                recomposeScopeImpl.mo3086z(bgVar);
            }
            recomposeScopeImpl.mo3059A(false);
            recomposeScopeImpl2 = recomposeScopeImpl;
        }
        mo2916T(false);
        return recomposeScopeImpl2;
    }

    /* renamed from: c0 */
    public final boolean mo2936c0() {
        if (this.f1446B > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c1 */
    public final void mo2937c1() {
        this.f1484m = this.f1452H.mo24429s();
        this.f1452H.mo24408P();
    }

    /* renamed from: d */
    public CoroutineContext mo2938d() {
        return this.f1474c.mo3106g();
    }

    /* renamed from: d0 */
    public kt0 mo2939d0() {
        return this.f1479h;
    }

    /* renamed from: d1 */
    public final void mo2940d1(int i, Object obj, boolean z, Object obj2) {
        int i2;
        mo2982t1();
        mo2960k1(i, obj, obj2);
        Pending pending = null;
        if (mo2951h0()) {
            this.f1452H.mo24413c();
            int U = this.f1454J.mo26102U();
            if (z) {
                this.f1454J.mo26105V0(nn0.f15626a.mo23753a());
            } else if (obj2 != null) {
                t46 t46 = this.f1454J;
                if (obj == null) {
                    obj = nn0.f15626a.mo23753a();
                }
                t46.mo26097R0(i, obj, obj2);
            } else {
                t46 t462 = this.f1454J;
                if (obj == null) {
                    obj = nn0.f15626a.mo23753a();
                }
                t462.mo26101T0(i, obj);
            }
            Pending pending2 = this.f1481j;
            if (pending2 != null) {
                pa3 pa3 = new pa3(i, -1, mo2969o0(U), -1, 0);
                pending2.mo3052i(pa3, this.f1482k - pending2.mo3048e());
                pending2.mo3051h(pa3);
            }
            mo2926Y(z, (Pending) null);
            return;
        }
        if (this.f1481j == null) {
            if (this.f1452H.mo24423m() != i || !vx2.m53586b(obj, this.f1452H.mo24424n())) {
                this.f1481j = new Pending(this.f1452H.mo24418h(), this.f1482k);
            } else {
                mo2952h1(z, obj2);
            }
        }
        Pending pending3 = this.f1481j;
        if (pending3 != null) {
            pa3 d = pending3.mo3047d(i, obj);
            if (d != null) {
                pending3.mo3051h(d);
                int b = d.mo24509b();
                this.f1482k = pending3.mo3050g(d) + pending3.mo3048e();
                int m = pending3.mo3056m(d);
                int a = m - pending3.mo3044a();
                pending3.mo3054k(m, pending3.mo3044a());
                mo2907N0(b);
                this.f1452H.mo24405M(b);
                if (a > 0) {
                    mo2912Q0(new ComposerImpl$start$2(a));
                }
                mo2952h1(z, obj2);
            } else {
                this.f1452H.mo24413c();
                this.f1460P = true;
                this.f1456L = null;
                mo2924X();
                this.f1454J.mo26068D();
                int U2 = this.f1454J.mo26102U();
                if (z) {
                    this.f1454J.mo26105V0(nn0.f15626a.mo23753a());
                } else if (obj2 != null) {
                    t46 t463 = this.f1454J;
                    if (obj == null) {
                        obj = nn0.f15626a.mo23753a();
                    }
                    t463.mo26097R0(i, obj, obj2);
                } else {
                    t46 t464 = this.f1454J;
                    if (obj == null) {
                        obj = nn0.f15626a.mo23753a();
                    }
                    t464.mo26101T0(i, obj);
                }
                this.f1458N = this.f1454J.mo26062A(U2);
                pa3 pa32 = new pa3(i, -1, mo2969o0(U2), -1, 0);
                pending3.mo3052i(pa32, this.f1482k - pending3.mo3048e());
                pending3.mo3051h(pa32);
                ArrayList arrayList = new ArrayList();
                if (z) {
                    i2 = 0;
                } else {
                    i2 = this.f1482k;
                }
                pending = new Pending(arrayList, i2);
            }
        }
        mo2926Y(z, pending);
    }

    /* renamed from: e */
    public void mo2941e(Object obj) {
        mo2978r1(obj);
    }

    /* renamed from: e0 */
    public int mo2942e0() {
        return this.f1461Q;
    }

    /* renamed from: e1 */
    public final void mo2943e1(int i) {
        mo2940d1(i, (Object) null, false, (Object) null);
    }

    /* renamed from: f */
    public void mo2944f(jy4<?>[] jy4Arr) {
        eo4<do0<Object>, r86<Object>> eo4;
        boolean z;
        vx2.m53591g(jy4Arr, "values");
        eo4 P = m1863P(this, (Integer) null, 1, (Object) null);
        mo2946f1(MlKitException.CODE_SCANNER_CANCELLED, ComposerKt.m1991I());
        mo2946f1(MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, ComposerKt.m1993K());
        eo4 eo42 = (eo4) C2283fb.m16821c(this, new ComposerImpl$startProviders$currentProviders$1(jy4Arr, P));
        mo2918U();
        if (mo2951h0()) {
            eo4 = mo2976q1(P, eo42);
            this.f1455K = true;
        } else {
            Object w = this.f1452H.mo24434w(0);
            vx2.m53589e(w, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            eo4<do0<Object>, r86<Object>> eo43 = (eo4) w;
            Object w2 = this.f1452H.mo24434w(1);
            vx2.m53589e(w2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            eo4 eo44 = (eo4) w2;
            if (!mo2932b() || !vx2.m53586b(eo44, eo42)) {
                eo4 = mo2976q1(P, eo42);
                z = !vx2.m53586b(eo4, eo43);
                if (z && !mo2951h0()) {
                    this.f1494w.put(Integer.valueOf(this.f1452H.mo24420j()), eo4);
                }
                this.f1496y.mo27347i(ComposerKt.m2029u(this.f1495x));
                this.f1495x = z;
                this.f1456L = eo4;
                mo2940d1(MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, ComposerKt.m1988F(), false, eo4);
            }
            mo2934b1();
            eo4 = eo43;
        }
        z = false;
        this.f1494w.put(Integer.valueOf(this.f1452H.mo24420j()), eo4);
        this.f1496y.mo27347i(ComposerKt.m2029u(this.f1495x));
        this.f1495x = z;
        this.f1456L = eo4;
        mo2940d1(MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, ComposerKt.m1988F(), false, eo4);
    }

    /* renamed from: f0 */
    public final RecomposeScopeImpl mo2945f0() {
        t76<RecomposeScopeImpl> t76 = this.f1449E;
        if (this.f1446B != 0 || !t76.mo26180d()) {
            return null;
        }
        return t76.mo26181e();
    }

    /* renamed from: f1 */
    public final void mo2946f1(int i, Object obj) {
        mo2940d1(i, obj, false, (Object) null);
    }

    /* renamed from: g */
    public void mo2947g() {
        this.f1488q = true;
    }

    /* renamed from: g0 */
    public final List<id2<C3379tp<?>, t46, mc5, r37>> mo2948g0() {
        return this.f1457M;
    }

    /* renamed from: g1 */
    public void mo2949g1(int i, Object obj) {
        mo2940d1(i, obj, false, (Object) null);
    }

    /* renamed from: h */
    public o85 mo2950h() {
        return mo2945f0();
    }

    /* renamed from: h0 */
    public boolean mo2951h0() {
        return this.f1460P;
    }

    /* renamed from: h1 */
    public final void mo2952h1(boolean z, Object obj) {
        if (z) {
            this.f1452H.mo24410R();
            return;
        }
        if (!(obj == null || this.f1452H.mo24421k() == obj)) {
            m1864S0(this, false, new ComposerImpl$startReaderGroup$1(obj), 1, (Object) null);
        }
        this.f1452H.mo24409Q();
    }

    /* renamed from: i */
    public void mo2953i(int i) {
        mo2940d1(i, (Object) null, false, (Object) null);
    }

    /* renamed from: i0 */
    public final int mo2954i0(p46 p46, int i) {
        Object v;
        if (p46.mo24395C(i)) {
            Object z = p46.mo24437z(i);
            if (z == null) {
                return 0;
            }
            if (z instanceof Enum) {
                return ((Enum) z).ordinal();
            }
            if (z instanceof xy3) {
                return 126665345;
            }
            return z.hashCode();
        }
        int y = p46.mo24436y(i);
        if (y == 207 && (v = p46.mo24433v(i)) != null && !vx2.m53586b(v, nn0.f15626a.mo23753a())) {
            y = v.hashCode();
        }
        return y;
    }

    /* renamed from: i1 */
    public final void mo2955i1() {
        this.f1452H = this.f1475d.mo24926D();
        mo2943e1(100);
        this.f1474c.mo27563n();
        this.f1493v = this.f1474c.mo27561e();
        this.f1496y.mo27347i(ComposerKt.m2029u(this.f1495x));
        this.f1495x = mo2971p(this.f1493v);
        this.f1456L = null;
        if (!this.f1488q) {
            this.f1488q = this.f1474c.mo3102d();
        }
        Set set = (Set) mo2928Z0(InspectionTablesKt.m2297a(), this.f1493v);
        if (set != null) {
            set.add(this.f1475d);
            this.f1474c.mo3115l(set);
        }
        mo2943e1(this.f1474c.mo3104f());
    }

    /* renamed from: j */
    public Object mo2956j() {
        return mo2977r0();
    }

    /* renamed from: j0 */
    public final void mo2957j0(List<Pair<zy3, zy3>> list) {
        q46 q46;
        C1628bg bgVar;
        p46 x;
        int[] v;
        List list2;
        q46 a;
        p46 D;
        List<id2<C3379tp<?>, t46, mc5, r37>> list3 = this.f1478g;
        List s = this.f1477f;
        try {
            this.f1477f = list3;
            mo2892F0(ComposerKt.f1503f);
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Pair pair = list.get(i2);
                zy3 zy3 = (zy3) pair.component1();
                zy3 zy32 = (zy3) pair.component2();
                C1628bg a2 = zy3.mo28672a();
                int j = zy3.mo28678g().mo24933j(a2);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                mo2888A0();
                mo2892F0(new ComposerImpl$insertMovableContentGuarded$1$1$1(ref$IntRef, a2));
                if (zy32 == null) {
                    if (vx2.m53586b(zy3.mo28678g(), this.f1453I)) {
                        mo2906N();
                    }
                    D = zy3.mo28678g().mo24926D();
                    D.mo24405M(j);
                    this.f1464T = j;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = arrayList;
                    m1859D0(this, (kt0) null, (kt0) null, (Integer) null, (List) null, new ComposerImpl$insertMovableContentGuarded$1$1$2$1(this, arrayList, D, zy3), 15, (Object) null);
                    if (!arrayList2.isEmpty()) {
                        mo2892F0(new ComposerImpl$insertMovableContentGuarded$1$1$2$2(ref$IntRef, arrayList2));
                    }
                    r37 r37 = r37.f33317a;
                    D.mo24414d();
                } else {
                    yy3 k = this.f1474c.mo3113k(zy32);
                    if (k == null || (q46 = k.mo28274a()) == null) {
                        q46 = zy32.mo28678g();
                    }
                    if (k == null || (a = k.mo28274a()) == null || (bgVar = a.mo24930e(i)) == null) {
                        bgVar = zy32.mo28672a();
                    }
                    List c = ComposerKt.m2030v(q46, bgVar);
                    if (!c.isEmpty()) {
                        mo2892F0(new ComposerImpl$insertMovableContentGuarded$1$1$3(ref$IntRef, c));
                        if (vx2.m53586b(zy3.mo28678g(), this.f1475d)) {
                            int j2 = this.f1475d.mo24933j(a2);
                            mo2970o1(j2, mo2980s1(j2) + c.size());
                        }
                    }
                    mo2892F0(new ComposerImpl$insertMovableContentGuarded$1$1$4(k, this, zy32, zy3));
                    p46 D2 = q46.mo24926D();
                    try {
                        x = this.f1452H;
                        v = this.f1486o;
                        this.f1486o = null;
                        this.f1452H = D2;
                        int j3 = q46.mo24933j(bgVar);
                        D2.mo24405M(j3);
                        this.f1464T = j3;
                        ArrayList arrayList3 = new ArrayList();
                        List s2 = this.f1477f;
                        try {
                            this.f1477f = arrayList3;
                            list2 = s2;
                            ArrayList arrayList4 = arrayList3;
                            try {
                                mo2890C0(zy32.mo28673b(), zy3.mo28673b(), Integer.valueOf(D2.mo24420j()), zy32.mo28675d(), new ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1(this, zy3));
                                r37 r372 = r37.f33317a;
                                this.f1477f = list2;
                                if (!arrayList4.isEmpty()) {
                                    mo2892F0(new ComposerImpl$insertMovableContentGuarded$1$1$5$1$2(ref$IntRef, arrayList4));
                                }
                                this.f1452H = x;
                                this.f1486o = v;
                                D2.mo24414d();
                            } catch (Throwable th) {
                                th = th;
                                this.f1477f = list2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            list2 = s2;
                            this.f1477f = list2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        D2.mo24414d();
                        throw th3;
                    }
                }
                mo2892F0(ComposerKt.f1500c);
                i2++;
                i = 0;
            }
            mo2892F0(ComposerImpl$insertMovableContentGuarded$1$2.INSTANCE);
            this.f1464T = 0;
            r37 r373 = r37.f33317a;
            this.f1477f = s;
        } catch (Throwable th4) {
            this.f1477f = s;
            throw th4;
        }
    }

    /* renamed from: j1 */
    public final boolean mo2958j1(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        vx2.m53591g(recomposeScopeImpl, "scope");
        C1628bg j = recomposeScopeImpl.mo3070j();
        if (j == null) {
            return false;
        }
        int d = j.mo11642d(this.f1475d);
        if (!this.f1450F || d < this.f1452H.mo24420j()) {
            return false;
        }
        ComposerKt.m1996N(this.f1491t, d, recomposeScopeImpl, obj);
        return true;
    }

    /* renamed from: k */
    public yn0 mo2959k() {
        return this.f1475d;
    }

    /* renamed from: k1 */
    public final void mo2960k1(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || vx2.m53586b(obj2, nn0.f15626a.mo23753a())) {
                mo2962l1(i);
            } else {
                mo2962l1(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            mo2962l1(((Enum) obj).ordinal());
        } else {
            mo2962l1(obj.hashCode());
        }
    }

    /* renamed from: l */
    public void mo2961l(o85 o85) {
        RecomposeScopeImpl recomposeScopeImpl;
        vx2.m53591g(o85, "scope");
        if (o85 instanceof RecomposeScopeImpl) {
            recomposeScopeImpl = (RecomposeScopeImpl) o85;
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.mo3063E(true);
        }
    }

    /* renamed from: l1 */
    public final void mo2962l1(int i) {
        this.f1461Q = i ^ Integer.rotateLeft(mo2942e0(), 3);
    }

    /* renamed from: m */
    public void mo2963m() {
        boolean z;
        if (this.f1484m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RecomposeScopeImpl f0 = mo2945f0();
            if (f0 != null) {
                f0.mo3085y();
            }
            if (this.f1491t.isEmpty()) {
                mo2937c1();
            } else {
                mo2891E0();
            }
        } else {
            ComposerKt.m2032x("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: m1 */
    public final void mo2964m1(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || vx2.m53586b(obj2, nn0.f15626a.mo23753a())) {
                mo2967n1(i);
            } else {
                mo2967n1(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            mo2967n1(((Enum) obj).ordinal());
        } else {
            mo2967n1(obj.hashCode());
        }
    }

    /* renamed from: n */
    public void mo2965n() {
        mo2918U();
        mo2918U();
        this.f1495x = ComposerKt.m2028t(this.f1496y.mo27346h());
        this.f1456L = null;
    }

    /* renamed from: n0 */
    public void mo2966n0(List<Pair<zy3, zy3>> list) {
        vx2.m53591g(list, "references");
        try {
            mo2957j0(list);
            mo2898J();
        } catch (Throwable th) {
            mo2974q();
            throw th;
        }
    }

    /* renamed from: n1 */
    public final void mo2967n1(int i) {
        this.f1461Q = Integer.rotateRight(i ^ mo2942e0(), 3);
    }

    /* renamed from: o */
    public void mo2968o() {
        mo2918U();
    }

    /* renamed from: o0 */
    public final int mo2969o0(int i) {
        return -2 - i;
    }

    /* renamed from: o1 */
    public final void mo2970o1(int i, int i2) {
        if (mo2980s1(i) == i2) {
            return;
        }
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.f1487p;
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f1487p = hashMap;
            }
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        int[] iArr = this.f1486o;
        if (iArr == null) {
            iArr = new int[this.f1452H.mo24430t()];
            C6706xq.m54504r(iArr, -1, 0, 0, 6, (Object) null);
            this.f1486o = iArr;
        }
        iArr[i] = i2;
    }

    /* renamed from: p */
    public boolean mo2971p(Object obj) {
        if (vx2.m53586b(mo2977r0(), obj)) {
            return false;
        }
        mo2978r1(obj);
        return true;
    }

    /* renamed from: p0 */
    public final void mo2972p0(xy3<Object> xy3, eo4<do0<Object>, ? extends r86<? extends Object>> eo4, Object obj, boolean z) {
        boolean z2;
        xy3<Object> xy32 = xy3;
        eo4<do0<Object>, ? extends r86<? extends Object>> eo42 = eo4;
        Object obj2 = obj;
        mo2949g1(126665345, xy3);
        mo2971p(obj2);
        int e0 = mo2942e0();
        try {
            this.f1461Q = 126665345;
            if (mo2951h0()) {
                t46.m27338m0(this.f1454J, 0, 1, (Object) null);
            }
            if (!mo2951h0() && !vx2.m53586b(this.f1452H.mo24421k(), eo42)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f1494w.put(Integer.valueOf(this.f1452H.mo24420j()), eo42);
            }
            mo2940d1(MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, ComposerKt.m1988F(), false, eo42);
            if (!mo2951h0() || z) {
                boolean z3 = this.f1495x;
                this.f1495x = z2;
                C2283fb.m16820b(this, mn0.m22399c(694380496, true, new ComposerImpl$invokeMovableContentLambda$1(xy3, obj2)));
                this.f1495x = z3;
            } else {
                this.f1455K = true;
                this.f1456L = null;
                t46 t46 = this.f1454J;
                this.f1474c.mo3108h(new zy3(xy3, obj, mo2939d0(), this.f1453I, t46.mo26062A(t46.mo26141x0(t46.mo26104V())), ck0.m33062j(), m1863P(this, (Integer) null, 1, (Object) null)));
            }
        } finally {
            mo2918U();
            this.f1461Q = e0;
            mo2920V();
        }
    }

    /* renamed from: p1 */
    public final void mo2973p1(int i, int i2) {
        int s1 = mo2980s1(i);
        if (s1 != i2) {
            int i3 = i2 - s1;
            int b = this.f1480i.mo26178b() - 1;
            while (i != -1) {
                int s12 = mo2980s1(i) + i3;
                mo2970o1(i, s12);
                int i4 = b;
                while (true) {
                    if (-1 < i4) {
                        Pending f = this.f1480i.mo26182f(i4);
                        if (f != null && f.mo3057n(i, s12)) {
                            b = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f1452H.mo24428r();
                } else if (!this.f1452H.mo24398F(i)) {
                    i = this.f1452H.mo24404L(i);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo2974q() {
        mo2898J();
        this.f1480i.mo26177a();
        this.f1483l.mo27339a();
        this.f1485n.mo27339a();
        this.f1492u.mo27339a();
        this.f1496y.mo27339a();
        this.f1494w.clear();
        if (!this.f1452H.mo24419i()) {
            this.f1452H.mo24414d();
        }
        if (!this.f1454J.mo26100T()) {
            this.f1454J.mo26072F();
        }
        mo2906N();
        this.f1461Q = 0;
        this.f1446B = 0;
        this.f1490s = false;
        this.f1460P = false;
        this.f1497z = false;
        this.f1450F = false;
        this.f1489r = false;
    }

    /* renamed from: q0 */
    public final boolean mo2975q0() {
        return this.f1450F;
    }

    /* renamed from: q1 */
    public final eo4<do0<Object>, r86<Object>> mo2976q1(eo4<do0<Object>, ? extends r86<? extends Object>> eo4, eo4<do0<Object>, ? extends r86<? extends Object>> eo42) {
        eo4.C2242a<do0<Object>, ? extends r86<? extends Object>> builder = eo4.builder();
        builder.putAll(eo42);
        eo4<do0<Object>, ? extends r86<? extends Object>> build = builder.build();
        mo2946f1(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, ComposerKt.m1992J());
        mo2971p(build);
        mo2971p(eo42);
        mo2918U();
        return build;
    }

    /* renamed from: r0 */
    public final Object mo2977r0() {
        if (mo2951h0()) {
            mo2982t1();
            return nn0.f15626a.mo23753a();
        }
        Object G = this.f1452H.mo24399G();
        if (this.f1497z) {
            return nn0.f15626a.mo23753a();
        }
        return G;
    }

    /* renamed from: r1 */
    public final void mo2978r1(Object obj) {
        if (mo2951h0()) {
            this.f1454J.mo26107W0(obj);
            if (obj instanceof nc5) {
                mo2892F0(new ComposerImpl$updateValue$1(obj));
                this.f1476e.add(obj);
                return;
            }
            return;
        }
        int p = this.f1452H.mo24426p() - 1;
        if (obj instanceof nc5) {
            this.f1476e.add(obj);
        }
        mo2914R0(true, new ComposerImpl$updateValue$2(obj, p));
    }

    /* renamed from: s0 */
    public final Object mo2979s0(p46 p46, int i) {
        return p46.mo24400H(i);
    }

    /* renamed from: s1 */
    public final int mo2980s1(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.f1487p;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.f1486o;
        if (iArr == null || (i2 = iArr[i]) < 0) {
            return this.f1452H.mo24402J(i);
        }
        return i2;
    }

    /* renamed from: t0 */
    public final int mo2981t0(int i, int i2, int i3, int i4) {
        int i5;
        int L = this.f1452H.mo24404L(i2);
        while (i5 != i3 && !this.f1452H.mo24398F(i5)) {
            L = this.f1452H.mo24404L(i5);
        }
        if (this.f1452H.mo24398F(i5)) {
            i4 = 0;
        }
        if (i5 == i2) {
            return i4;
        }
        int s1 = (mo2980s1(i5) - this.f1452H.mo24402J(i2)) + i4;
        loop1:
        while (i4 < s1 && i5 != i) {
            i5++;
            while (true) {
                if (i5 >= i) {
                    break loop1;
                }
                int A = this.f1452H.mo24393A(i5) + i5;
                if (i >= A) {
                    i4 += mo2980s1(i5);
                    i5 = A;
                }
            }
        }
        return i4;
    }

    /* renamed from: t1 */
    public final void mo2982t1() {
        if (!(!this.f1490s)) {
            ComposerKt.m2032x("A call to createNode(), emitNode() or useNode() expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: u0 */
    public final void mo2983u0(pc2<r37> pc2) {
        vx2.m53591g(pc2, "block");
        if (!this.f1450F) {
            this.f1450F = true;
            try {
                pc2.invoke();
            } finally {
                this.f1450F = false;
            }
        } else {
            ComposerKt.m2032x("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: v0 */
    public final void mo2984v0() {
        if (this.f1463S.mo26180d()) {
            mo2985w0(this.f1463S.mo26185i());
            this.f1463S.mo26177a();
        }
    }

    /* renamed from: w0 */
    public final void mo2985w0(Object[] objArr) {
        mo2892F0(new ComposerImpl$realizeDowns$1(objArr));
    }

    /* renamed from: x0 */
    public final void mo2986x0() {
        int i = this.f1473b0;
        this.f1473b0 = 0;
        if (i > 0) {
            int i2 = this.f1469Y;
            if (i2 >= 0) {
                this.f1469Y = -1;
                mo2893G0(new ComposerImpl$realizeMovement$1(i2, i));
                return;
            }
            int i3 = this.f1470Z;
            this.f1470Z = -1;
            int i4 = this.f1471a0;
            this.f1471a0 = -1;
            mo2893G0(new ComposerImpl$realizeMovement$2(i3, i4, i));
        }
    }

    /* renamed from: y0 */
    public final void mo2987y0(boolean z) {
        int i;
        boolean z2;
        if (z) {
            i = this.f1452H.mo24428r();
        } else {
            i = this.f1452H.mo24420j();
        }
        int i2 = i - this.f1464T;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.m2032x("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        } else if (i2 > 0) {
            mo2892F0(new ComposerImpl$realizeOperationLocation$2(i2));
            this.f1464T = i;
        }
    }
}
