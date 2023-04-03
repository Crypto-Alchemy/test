package androidx.compose.p004ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p004ui.focus.FocusManagerImpl;
import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p004ui.layout.RootMeasurePolicy;
import androidx.compose.p004ui.modifier.ModifierLocalManager;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.OwnerSnapshotObserver;
import androidx.compose.p004ui.platform.ViewLayer;
import androidx.compose.p004ui.text.input.TextInputServiceAndroid;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;
import p000.nj4;
import p000.sw3;
import p000.tf4;
import p000.x93;
import p000.y62;
import p000.z62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000þ\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u0003\b\u0001\u0018\u0000 Ï\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002JOB\u0013\u0012\b\u0010Ì\u0003\u001a\u00030Ë\u0003¢\u0006\u0006\bÍ\u0003\u0010Î\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0014\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ*\u0010$\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0007H\u0002J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0007H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001a\u0010/\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0002J\u0010\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0016J\"\u00109\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000100H\u0014J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0016H\u0016J\u001d\u0010>\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020@H\u0016J\u0010\u0010B\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010C\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0006\u0010D\u001a\u00020\u0007J\b\u0010E\u001a\u00020\u0007H\u0016J\u0016\u0010H\u001a\u00020\u00072\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0016J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u0016H\u0016J\u0010\u0010L\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\tH\u0016J \u0010O\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u0016H\u0016J \u0010P\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u0016H\u0016J\u0010\u0010Q\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\tH\u0016J\u0018\u0010T\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fH\u0014J0\u0010W\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u00162\u0006\u00105\u001a\u00020\f2\u0006\u0010E\u001a\u00020\f2\u0006\u0010V\u001a\u00020\f2\u0006\u0010O\u001a\u00020\fH\u0014J\u0010\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020XH\u0014J*\u0010`\u001a\u00020_2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00070[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0016J\u0017\u0010b\u001a\u00020\u00162\u0006\u0010a\u001a\u00020_H\u0000¢\u0006\u0004\bb\u0010cJ\b\u0010d\u001a\u00020\u0007H\u0016J\u0010\u0010e\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\tH\u0016J\u0010\u0010g\u001a\u00020\u00072\u0006\u0010G\u001a\u00020fH\u0016J\u001f\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010=\u001a\u00020<H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bi\u0010jJ\u0010\u0010k\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020XH\u0014J\u001f\u0010m\u001a\u00020\u00072\u0006\u0010a\u001a\u00020_2\u0006\u0010l\u001a\u00020\u0016H\u0000¢\u0006\u0004\bm\u0010nJ\u001a\u0010q\u001a\u00020\u00072\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u00070[J\u0013\u0010r\u001a\u00020\u0007H@ø\u0001\u0002¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u0007H@ø\u0001\u0002¢\u0006\u0004\bt\u0010sJ\b\u0010u\u001a\u00020\u0007H\u0016J\b\u0010v\u001a\u00020\u0007H\u0014J\b\u0010w\u001a\u00020\u0007H\u0014J\u001a\u0010{\u001a\u00020\u00072\b\u0010y\u001a\u0004\u0018\u00010x2\u0006\u0010z\u001a\u00020\fH\u0016J\u0016\u0010\u001a\u00020\u00072\f\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|H\u0016J\u0011\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0011\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0011\u0010\u0001\u001a\u00020\u00162\u0006\u00107\u001a\u00020\fH\u0016J\u0011\u0010\u0001\u001a\u00020\u00162\u0006\u00107\u001a\u00020\fH\u0016J!\u0010V\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\bV\u0010\u0001J#\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\t\u0010\u0001\u001a\u00020\u0016H\u0016J\u0016\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\u00072\b\u0010\u0001\u001a\u00030\u0001H\u0014J\u0012\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0011\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0011\u0010\u0001\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020\fJ\t\u0010\u0001\u001a\u00020\u0016H\u0016R!\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bJ\u0010)R\u0017\u0010\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010%R\u001f\u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u000f\n\u0005\be\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R+\u0010¢\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00018\u0016@RX\u000e¢\u0006\u000f\n\u0005\bL\u0010\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010©\u0001\u001a\u00030§\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bV\u0010¨\u0001R\u0018\u0010­\u0001\u001a\u00030ª\u00018\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018\u0002X\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001f\u0010¾\u0001\u001a\u00020\t8\u0016X\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R \u0010Ä\u0001\u001a\u00030¿\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R \u0010Ê\u0001\u001a\u00030Å\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001f\u0010Ó\u0001\u001a\u00030Ï\u00018\u0016X\u0004¢\u0006\u000f\n\u0005\b\b\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001d\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020_0Ô\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010Õ\u0001R\"\u0010Ø\u0001\u001a\u000b\u0012\u0004\u0012\u00020_\u0018\u00010Ô\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÙ\u0001\u0010%R\u0017\u0010Ý\u0001\u001a\u00030Û\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bu\u0010Ü\u0001R\u0017\u0010à\u0001\u001a\u00030Þ\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b'\u0010ß\u0001R6\u0010ç\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\u00070[8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R\u001a\u0010ë\u0001\u001a\u0005\u0018\u00010è\u00018\u0002X\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010í\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bì\u0001\u0010%R \u0010ó\u0001\u001a\u00030î\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001R \u0010ù\u0001\u001a\u00030ô\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R \u0010ÿ\u0001\u001a\u00030ú\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R0\u0010\u0002\u001a\u00020\u00168\u0016@\u0016X\u000e¢\u0006\u001f\n\u0005\b\u0002\u0010%\u0012\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R%\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0002\u0010%R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R \u0010\u0002\u001a\u00030\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\"\u0010¢\u0002\u001a\u00030 \u00028\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b¡\u0002\u0010)R\u0018\u0010¦\u0002\u001a\u00030£\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R!\u0010ª\u0002\u001a\u00030§\u00028\u0002X\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R!\u0010¬\u0002\u001a\u00030§\u00028\u0002X\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b«\u0002\u0010©\u0002R0\u0010³\u0002\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u001f\n\u0005\b­\u0002\u0010)\u0012\u0006\b²\u0002\u0010\u0002\u001a\u0006\b®\u0002\u0010¯\u0002\"\u0006\b°\u0002\u0010±\u0002R\u0018\u0010µ\u0002\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b´\u0002\u0010%R\"\u0010·\u0002\u001a\u00030\u00018\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b¶\u0002\u0010)R\u0018\u0010¹\u0002\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b¸\u0002\u0010%R7\u0010À\u0002\u001a\u0004\u0018\u00010o2\t\u0010\u0001\u001a\u0004\u0018\u00010o8F@BX\u0002¢\u0006\u0018\n\u0006\bº\u0002\u0010»\u0002\u001a\u0006\b¼\u0002\u0010½\u0002\"\u0006\b¾\u0002\u0010¿\u0002R'\u0010Â\u0002\u001a\u0010\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u0007\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010â\u0001R\u0018\u0010Æ\u0002\u001a\u00030Ã\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u0018\u0010Ê\u0002\u001a\u00030Ç\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R\u0018\u0010Î\u0002\u001a\u00030Ë\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R\u0018\u0010Ò\u0002\u001a\u00030Ï\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÐ\u0002\u0010Ñ\u0002R(\u0010Ù\u0002\u001a\u00030Ó\u00028\u0016X\u0004¢\u0006\u0018\n\u0006\bÔ\u0002\u0010Õ\u0002\u0012\u0006\bØ\u0002\u0010\u0002\u001a\u0006\bÖ\u0002\u0010×\u0002R(\u0010à\u0002\u001a\u00030Ú\u00028\u0016X\u0004¢\u0006\u0018\n\u0006\bÛ\u0002\u0010Ü\u0002\u0012\u0006\bß\u0002\u0010\u0002\u001a\u0006\bÝ\u0002\u0010Þ\u0002R5\u0010ç\u0002\u001a\u00030á\u00022\b\u0010\u0001\u001a\u00030á\u00028V@RX\u0002¢\u0006\u0018\n\u0006\bâ\u0002\u0010»\u0002\u001a\u0006\bã\u0002\u0010ä\u0002\"\u0006\bå\u0002\u0010æ\u0002R\u0019\u0010é\u0002\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bè\u0002\u0010Ì\u0001R5\u0010\u0001\u001a\u00030ê\u00022\b\u0010\u0001\u001a\u00030ê\u00028V@RX\u0002¢\u0006\u0018\n\u0006\bë\u0002\u0010»\u0002\u001a\u0006\bì\u0002\u0010í\u0002\"\u0006\bî\u0002\u0010ï\u0002R \u0010õ\u0002\u001a\u00030ð\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\bñ\u0002\u0010ò\u0002\u001a\u0006\bó\u0002\u0010ô\u0002R\u0018\u0010ù\u0002\u001a\u00030ö\u00028\u0002X\u0004¢\u0006\b\n\u0006\b÷\u0002\u0010ø\u0002R \u0010ÿ\u0002\u001a\u00030ú\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\bû\u0002\u0010ü\u0002\u001a\u0006\bý\u0002\u0010þ\u0002R \u0010\u0003\u001a\u00030\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0003\u0010\u0003R\u0018\u0010\u0003\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0003\u0010)R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020_0\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R&\u0010\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010F0\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R\u0018\u0010\u0003\u001a\u00030\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R\u0018\u0010\u0003\u001a\u00030\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R\u0018\u0010\u0003\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0003\u0010%R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070F8\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R\u0018\u0010£\u0003\u001a\u00030 \u00038\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0003\u0010¢\u0003R\u0018\u0010¥\u0003\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b¤\u0003\u0010%R\u001c\u0010©\u0003\u001a\u0005\u0018\u00010¦\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b§\u0003\u0010¨\u0003R \u0010¯\u0003\u001a\u00030ª\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b«\u0003\u0010¬\u0003\u001a\u0006\b­\u0003\u0010®\u0003R\u001c\u0010±\u0003\u001a\u00020\f*\u00030\u00018BX\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010°\u0003R\u0017\u0010´\u0003\u001a\u00020-8VX\u0004¢\u0006\b\u001a\u0006\b²\u0003\u0010³\u0003R\u0018\u0010¸\u0003\u001a\u00030µ\u00038VX\u0004¢\u0006\b\u001a\u0006\b¶\u0003\u0010·\u0003R\u0018\u0010¼\u0003\u001a\u00030¹\u00038VX\u0004¢\u0006\b\u001a\u0006\bº\u0003\u0010»\u0003R\u0019\u0010\u001a\u0005\u0018\u00010½\u00038VX\u0004¢\u0006\b\u001a\u0006\b¾\u0003\u0010¿\u0003R\u0018\u0010Â\u0003\u001a\u00030\u00028@X\u0004¢\u0006\b\u001a\u0006\bÀ\u0003\u0010Á\u0003R\u0017\u0010Ä\u0003\u001a\u00020!8VX\u0004¢\u0006\b\u001a\u0006\bÃ\u0003\u0010¯\u0002R\u0017\u0010Æ\u0003\u001a\u00020\u00168VX\u0004¢\u0006\b\u001a\u0006\bÅ\u0003\u0010\u0002R\u0018\u0010Ê\u0003\u001a\u00030Ç\u00038VX\u0004¢\u0006\b\u001a\u0006\bÈ\u0003\u0010É\u0003\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ð\u0003"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lnj4;", "Lce7;", "Llt4;", "Lw81;", "viewGroup", "Lr37;", "L", "Landroidx/compose/ui/node/LayoutNode;", "nodeToRemeasure", "i0", "", "measureSpec", "Lkotlin/Pair;", "M", "r0", "node", "W", "V", "Landroid/view/MotionEvent;", "event", "", "S", "motionEvent", "Lpv4;", "R", "(Landroid/view/MotionEvent;)I", "lastEvent", "T", "Y", "n0", "action", "", "eventTime", "forceHover", "o0", "Z", "d0", "e0", "f0", "J", "X", "a0", "accessibilityId", "Landroid/view/View;", "currentView", "N", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "Lug3;", "owner", "l", "gainFocus", "direction", "previouslyFocusedRect", "onFocusChanged", "hasWindowFocus", "onWindowFocusChanged", "Lja3;", "keyEvent", "m0", "(Landroid/view/KeyEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "m", "q", "h0", "t", "Lkotlin/Function0;", "listener", "o", "sendPointerUpdate", "a", "layoutNode", "g", "affectsLookahead", "forceRequest", "b", "c", "d", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "r", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lkotlin/Function1;", "Lxa0;", "drawBlock", "invalidateParentLayer", "Llj4;", "n", "layer", "g0", "(Llj4;)Z", "u", "e", "Lnj4$b;", "i", "Lj62;", "O", "(Landroid/view/KeyEvent;)Lj62;", "dispatchDraw", "isDirty", "c0", "(Llj4;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "K", "(Lns0;)Ljava/lang/Object;", "b0", "U", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Ltf4;", "localPosition", "(J)J", "positionOnScreen", "j", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "layoutDirection", "onRtlPropertiesChanged", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "lastDownPointerPosition", "superclassInitComplete", "Lye3;", "Lye3;", "getSharedDrawScope", "()Lye3;", "sharedDrawScope", "Ldc1;", "<set-?>", "Ldc1;", "getDensity", "()Ldc1;", "density", "Lxt5;", "k", "Lxt5;", "semanticsModifier", "Landroidx/compose/ui/focus/FocusManagerImpl;", "Landroidx/compose/ui/focus/FocusManagerImpl;", "_focusManager", "Lgl7;", "s", "Lgl7;", "_windowInfo", "Lqa3;", "x", "Lqa3;", "keyInputModifier", "Lsw3;", "y", "Lsw3;", "rotaryInputModifier", "Lbb0;", "A", "Lbb0;", "canvasHolder", "B", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Lqh5;", "C", "Lqh5;", "getRootForTest", "()Lqh5;", "rootForTest", "Lcu5;", "H", "Lcu5;", "getSemanticsOwner", "()Lcu5;", "semanticsOwner", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "I", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityDelegate", "Luv;", "Luv;", "getAutofillTree", "()Luv;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "P", "postponedDirtyLayers", "Q", "isDrawingContent", "Lny3;", "Lny3;", "motionEventAdapter", "Lrr4;", "Lrr4;", "pointerInputEventProcessor", "k0", "Lrc2;", "getConfigurationChangeObserver", "()Lrc2;", "setConfigurationChangeObserver", "(Lrc2;)V", "configurationChangeObserver", "Lfh;", "v0", "Lfh;", "_autofill", "b1", "observationClearRequested", "Llh;", "e1", "Llh;", "getClipboardManager", "()Llh;", "clipboardManager", "Lch;", "o1", "Lch;", "getAccessibilityManager", "()Lch;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "p1", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "q1", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "r1", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/DrawChildContainer;", "s1", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "Lmq0;", "t1", "Lmq0;", "onMeasureConstraints", "u1", "wasMeasuredWithMultipleConstraints", "Ljq3;", "v1", "Ljq3;", "measureAndLayoutDelegate", "Ltb7;", "w1", "Ltb7;", "getViewConfiguration", "()Ltb7;", "viewConfiguration", "Lnw2;", "x1", "globalPosition", "", "y1", "[I", "tmpPositionArray", "Lfp3;", "z1", "[F", "viewToWindowMatrix", "A1", "windowToViewMatrix", "B1", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "C1", "forceUseMatrixCache", "D1", "windowPosition", "E1", "isRenderNodeCompatible", "F1", "Lt04;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "G1", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "H1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "I1", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "J1", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "K1", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "textInputServiceAndroid", "Lun6;", "L1", "Lun6;", "getTextInputService", "()Lun6;", "getTextInputService$annotations", "textInputService", "Ly62$a;", "M1", "Ly62$a;", "getFontLoader", "()Ly62$a;", "getFontLoader$annotations", "fontLoader", "Lz62$b;", "N1", "getFontFamilyResolver", "()Lz62$b;", "setFontFamilyResolver", "(Lz62$b;)V", "fontFamilyResolver", "O1", "currentFontWeightAdjustment", "Landroidx/compose/ui/unit/LayoutDirection;", "P1", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Ldl2;", "Q1", "Ldl2;", "getHapticFeedBack", "()Ldl2;", "hapticFeedBack", "Ldv2;", "R1", "Ldv2;", "_inputModeManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "S1", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Lfo6;", "T1", "Lfo6;", "getTextToolbar", "()Lfo6;", "textToolbar", "U1", "Landroid/view/MotionEvent;", "previousMotionEvent", "V1", "relayoutTime", "Lpj7;", "W1", "Lpj7;", "layerCache", "Lv04;", "X1", "Lv04;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$d", "Y1", "Landroidx/compose/ui/platform/AndroidComposeView$d;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "Z1", "Ljava/lang/Runnable;", "sendHoverExitEvent", "a2", "hoverExitReceived", "b2", "Lpc2;", "resendMotionEventOnLayout", "Lm80;", "c2", "Lm80;", "matrixToWindow", "d2", "keyboardModifiersRequireUpdate", "Ljr4;", "e2", "Ljr4;", "desiredPointerIcon", "Llr4;", "f2", "Llr4;", "getPointerIconService", "()Llr4;", "pointerIconService", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "view", "Lm62;", "getFocusManager", "()Lm62;", "focusManager", "Lfl7;", "getWindowInfo", "()Lfl7;", "windowInfo", "Llv;", "getAutofill", "()Llv;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lcv2;", "getInputModeManager", "()Lcv2;", "inputModeManager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "g2", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView extends ViewGroup implements nj4, ce7, lt4, w81 {

    /* renamed from: g2 */
    public static final C0395a f1868g2 = new C0395a((DefaultConstructorMarker) null);

    /* renamed from: h2 */
    public static Class<?> f1869h2;

    /* renamed from: i2 */
    public static Method f1870i2;

    /* renamed from: A */
    public final bb0 f1871A;

    /* renamed from: A1 */
    public final float[] f1872A1;

    /* renamed from: B */
    public final LayoutNode f1873B;

    /* renamed from: B1 */
    public long f1874B1;

    /* renamed from: C */
    public final qh5 f1875C;

    /* renamed from: C1 */
    public boolean f1876C1;

    /* renamed from: D1 */
    public long f1877D1;

    /* renamed from: E1 */
    public boolean f1878E1;

    /* renamed from: F1 */
    public final t04 f1879F1;

    /* renamed from: G1 */
    public rc2<? super C0396b, r37> f1880G1;

    /* renamed from: H */
    public final cu5 f1881H;

    /* renamed from: H1 */
    public final ViewTreeObserver.OnGlobalLayoutListener f1882H1;

    /* renamed from: I */
    public final AndroidComposeViewAccessibilityDelegateCompat f1883I;

    /* renamed from: I1 */
    public final ViewTreeObserver.OnScrollChangedListener f1884I1;

    /* renamed from: J1 */
    public final ViewTreeObserver.OnTouchModeChangeListener f1885J1;

    /* renamed from: K1 */
    public final TextInputServiceAndroid f1886K1;

    /* renamed from: L */
    public final C3436uv f1887L;

    /* renamed from: L1 */
    public final un6 f1888L1;

    /* renamed from: M */
    public final List<lj4> f1889M;

    /* renamed from: M1 */
    public final y62.C3655a f1890M1;

    /* renamed from: N1 */
    public final t04 f1891N1;

    /* renamed from: O1 */
    public int f1892O1;

    /* renamed from: P */
    public List<lj4> f1893P;

    /* renamed from: P1 */
    public final t04 f1894P1;

    /* renamed from: Q */
    public boolean f1895Q;

    /* renamed from: Q1 */
    public final dl2 f1896Q1;

    /* renamed from: R1 */
    public final dv2 f1897R1;

    /* renamed from: S1 */
    public final ModifierLocalManager f1898S1;

    /* renamed from: T1 */
    public final fo6 f1899T1;

    /* renamed from: U */
    public final ny3 f1900U;

    /* renamed from: U1 */
    public MotionEvent f1901U1;

    /* renamed from: V1 */
    public long f1902V1;

    /* renamed from: W1 */
    public final pj7<lj4> f1903W1;

    /* renamed from: X1 */
    public final v04<pc2<r37>> f1904X1;

    /* renamed from: Y1 */
    public final C0398d f1905Y1;

    /* renamed from: Z1 */
    public final Runnable f1906Z1;

    /* renamed from: a */
    public long f1907a;

    /* renamed from: a2 */
    public boolean f1908a2;

    /* renamed from: b1 */
    public boolean f1909b1;

    /* renamed from: b2 */
    public final pc2<r37> f1910b2;

    /* renamed from: c2 */
    public final m80 f1911c2;

    /* renamed from: d */
    public boolean f1912d = true;

    /* renamed from: d2 */
    public boolean f1913d2;

    /* renamed from: e */
    public final ye3 f1914e = new ye3((za0) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: e0 */
    public final rr4 f1915e0;

    /* renamed from: e1 */
    public final C2758lh f1916e1;

    /* renamed from: e2 */
    public jr4 f1917e2;

    /* renamed from: f2 */
    public final lr4 f1918f2;

    /* renamed from: g */
    public dc1 f1919g;

    /* renamed from: k */
    public final xt5 f1920k;

    /* renamed from: k0 */
    public rc2<? super Configuration, r37> f1921k0;

    /* renamed from: o1 */
    public final C1679ch f1922o1;

    /* renamed from: p1 */
    public final OwnerSnapshotObserver f1923p1;

    /* renamed from: q1 */
    public boolean f1924q1;

    /* renamed from: r */
    public final FocusManagerImpl f1925r;

    /* renamed from: r1 */
    public AndroidViewsHandler f1926r1;

    /* renamed from: s */
    public final gl7 f1927s;

    /* renamed from: s1 */
    public DrawChildContainer f1928s1;

    /* renamed from: t1 */
    public mq0 f1929t1;

    /* renamed from: u1 */
    public boolean f1930u1;

    /* renamed from: v0 */
    public final C2292fh f1931v0;

    /* renamed from: v1 */
    public final jq3 f1932v1;

    /* renamed from: w1 */
    public final tb7 f1933w1;

    /* renamed from: x */
    public final qa3 f1934x;

    /* renamed from: x1 */
    public long f1935x1;

    /* renamed from: y */
    public final sw3 f1936y;

    /* renamed from: y1 */
    public final int[] f1937y1;

    /* renamed from: z1 */
    public final float[] f1938z1;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "", "", "b", "", "FocusTag", "Ljava/lang/String;", "", "MaximumLayerCacheSize", "I", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$a */
    /* compiled from: AndroidComposeView.android.kt */
    public static final class C0395a {
        public C0395a() {
        }

        public /* synthetic */ C0395a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        /* renamed from: b */
        public final boolean mo3804b() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.f1869h2 == null) {
                    AndroidComposeView.f1869h2 = Class.forName("android.os.SystemProperties");
                    Class E = AndroidComposeView.f1869h2;
                    if (E != null) {
                        method = E.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                    } else {
                        method = null;
                    }
                    AndroidComposeView.f1870i2 = method;
                }
                Method A = AndroidComposeView.f1870i2;
                if (A != null) {
                    obj = A.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "Lug3;", "a", "Lug3;", "()Lug3;", "lifecycleOwner", "Lil5;", "b", "Lil5;", "()Lil5;", "savedStateRegistryOwner", "<init>", "(Lug3;Lil5;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$b */
    /* compiled from: AndroidComposeView.android.kt */
    public static final class C0396b {

        /* renamed from: a */
        public final ug3 f1939a;

        /* renamed from: b */
        public final il5 f1940b;

        public C0396b(ug3 ug3, il5 il5) {
            vx2.m53591g(ug3, "lifecycleOwner");
            vx2.m53591g(il5, "savedStateRegistryOwner");
            this.f1939a = ug3;
            this.f1940b = il5;
        }

        /* renamed from: a */
        public final ug3 mo3805a() {
            return this.f1939a;
        }

        /* renamed from: b */
        public final il5 mo3806b() {
            return this.f1940b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"androidx/compose/ui/platform/AndroidComposeView$c", "Llr4;", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$c */
    /* compiled from: AndroidComposeView.android.kt */
    public static final class C0397c implements lr4 {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeView f1941a;

        public C0397c(AndroidComposeView androidComposeView) {
            this.f1941a = androidComposeView;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"androidx/compose/ui/platform/AndroidComposeView$d", "Ljava/lang/Runnable;", "Lr37;", "run", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$d */
    /* compiled from: AndroidComposeView.android.kt */
    public static final class C0398d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeView f1942a;

        public C0398d(AndroidComposeView androidComposeView) {
            this.f1942a = androidComposeView;
        }

        public void run() {
            boolean z;
            this.f1942a.removeCallbacks(this);
            MotionEvent B = this.f1942a.f1901U1;
            if (B != null) {
                boolean z2 = false;
                if (B.getToolType(0) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                int actionMasked = B.getActionMasked();
                if (!z ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z2 = true;
                }
                if (z2) {
                    int i = 7;
                    if (!(actionMasked == 7 || actionMasked == 9)) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = this.f1942a;
                    androidComposeView.mo3778o0(B, i, androidComposeView.f1902V1, false);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        C2292fh fhVar;
        int i;
        m80 m80;
        vx2.m53591g(context, "context");
        tf4.C3361a aVar = tf4.f18145b;
        this.f1907a = aVar.mo26445b();
        this.f1919g = C2293fi.m17002a(context);
        xt5 xt5 = new xt5(false, false, AndroidComposeView$semanticsModifier$1.INSTANCE, (rc2) null, 8, (DefaultConstructorMarker) null);
        this.f1920k = xt5;
        FocusManagerImpl focusManagerImpl = new FocusManagerImpl((FocusModifier) null, 1, (DefaultConstructorMarker) null);
        this.f1925r = focusManagerImpl;
        this.f1927s = new gl7();
        qa3 qa3 = new qa3(new AndroidComposeView$keyInputModifier$1(this), (rc2<? super ja3, Boolean>) null);
        this.f1934x = qa3;
        sw3.C3308a aVar2 = sw3.f17820m;
        sw3 c = RotaryInputModifierKt.m2462c(aVar2, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.f1936y = c;
        this.f1871A = new bb0();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode.mo3433W0(RootMeasurePolicy.f1710b);
        layoutNode.mo3427T0(getDensity());
        layoutNode.mo3439Z0(aVar2.mo3193k(xt5).mo3193k(c).mo3193k(focusManagerImpl.mo3205f()).mo3193k(qa3));
        this.f1873B = layoutNode;
        this.f1875C = this;
        this.f1881H = new cu5(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.f1883I = androidComposeViewAccessibilityDelegateCompat;
        this.f1887L = new C3436uv();
        this.f1889M = new ArrayList();
        this.f1900U = new ny3();
        this.f1915e0 = new rr4(getRoot());
        this.f1921k0 = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        if (mo3697J()) {
            fhVar = new C2292fh(this, getAutofillTree());
        } else {
            fhVar = null;
        }
        this.f1931v0 = fhVar;
        this.f1916e1 = new C2758lh(context);
        this.f1922o1 = new C1679ch(context);
        this.f1923p1 = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.f1932v1 = new jq3(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        vx2.m53590f(viewConfiguration, "get(context)");
        this.f1933w1 = new C3416uj(viewConfiguration);
        this.f1935x1 = ow2.m24292a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f1937y1 = new int[]{0, 0};
        this.f1938z1 = fp3.m17170b((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f1872A1 = fp3.m17170b((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f1874B1 = -1;
        this.f1877D1 = aVar.mo26444a();
        this.f1878E1 = true;
        this.f1879F1 = l56.m21292b((Object) null, (h56) null, 2, (Object) null);
        this.f1882H1 = new C2829mh(this);
        this.f1884I1 = new C2894nh(this);
        this.f1885J1 = new C2954oh(this);
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(this);
        this.f1886K1 = textInputServiceAndroid;
        this.f1888L1 = AndroidComposeView_androidKt.m3039e().invoke(textInputServiceAndroid);
        this.f1890M1 = new C2830mi(context);
        this.f1891N1 = i56.m19412a(c72.m11743a(context), i56.m19416e());
        Configuration configuration = context.getResources().getConfiguration();
        vx2.m53590f(configuration, "context.resources.configuration");
        this.f1892O1 = mo3703P(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        vx2.m53590f(configuration2, "context.resources.configuration");
        this.f1894P1 = l56.m21292b(AndroidComposeView_androidKt.m3038d(configuration2), (h56) null, 2, (Object) null);
        this.f1896Q1 = new gp4(this);
        if (isInTouchMode()) {
            i = bv2.f8265b.mo11892b();
        } else {
            i = bv2.f8265b.mo11891a();
        }
        this.f1897R1 = new dv2(i, new AndroidComposeView$_inputModeManager$1(this), (DefaultConstructorMarker) null);
        this.f1898S1 = new ModifierLocalManager(this);
        this.f1899T1 = new AndroidTextToolbar(this);
        this.f1903W1 = new pj7<>();
        this.f1904X1 = new v04<>(new pc2[16], 0);
        this.f1905Y1 = new C0398d(this);
        this.f1906Z1 = new C3070ph(this);
        this.f1910b2 = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            m80 = new p80();
        } else {
            m80 = new n80();
        }
        this.f1911c2 = m80;
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            C0023ai.f140a.mo309a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        ga7.m17785p0(this, androidComposeViewAccessibilityDelegateCompat);
        rc2<ce7, r37> a = ce7.f8421u.mo12040a();
        if (a != null) {
            a.invoke(this);
        }
        getRoot().mo3452i(this);
        if (i2 >= 29) {
            C3414uh.f18498a.mo26788a(this);
        }
        this.f1918f2 = new C0397c(this);
    }

    /* renamed from: Q */
    public static final void m2878Q(AndroidComposeView androidComposeView) {
        vx2.m53591g(androidComposeView, "this$0");
        androidComposeView.mo3794r0();
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m2879j0(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.mo3769i0(layoutNode);
    }

    /* renamed from: k0 */
    public static final void m2880k0(AndroidComposeView androidComposeView) {
        vx2.m53591g(androidComposeView, "this$0");
        androidComposeView.mo3794r0();
    }

    /* renamed from: l0 */
    public static final void m2881l0(AndroidComposeView androidComposeView) {
        vx2.m53591g(androidComposeView, "this$0");
        boolean z = false;
        androidComposeView.f1908a2 = false;
        MotionEvent motionEvent = androidComposeView.f1901U1;
        vx2.m53588d(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z = true;
        }
        if (z) {
            androidComposeView.mo3776n0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m2882p0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.mo3778o0(motionEvent, i, j, z);
    }

    /* renamed from: q0 */
    public static final void m2883q0(AndroidComposeView androidComposeView, boolean z) {
        int i;
        vx2.m53591g(androidComposeView, "this$0");
        dv2 dv2 = androidComposeView.f1897R1;
        if (z) {
            i = bv2.f8265b.mo11892b();
        } else {
            i = bv2.f8265b.mo11891a();
        }
        dv2.mo18949a(i);
        androidComposeView.f1925r.mo3202c();
    }

    private void setFontFamilyResolver(z62.C3714b bVar) {
        this.f1891N1.setValue(bVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f1894P1.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(C0396b bVar) {
        this.f1879F1.setValue(bVar);
    }

    /* renamed from: J */
    public final boolean mo3697J() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final Object mo3698K(ns0<? super r37> ns0) {
        Object x = this.f1883I.mo3855x(ns0);
        if (x == wx2.m54101d()) {
            return x;
        }
        return r37.f33317a;
    }

    /* renamed from: L */
    public final void mo3699L(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).mo3801t();
            } else if (childAt instanceof ViewGroup) {
                mo3699L((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: M */
    public final Pair<Integer, Integer> mo3700M(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return wy6.m54142a(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return wy6.m54142a(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return wy6.m54142a(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    /* renamed from: N */
    public final View mo3701N(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (vx2.m53586b(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            vx2.m53590f(childAt, "currentView.getChildAt(i)");
            View N = mo3701N(i, childAt);
            if (N != null) {
                return N;
            }
        }
        return null;
    }

    /* renamed from: O */
    public j62 mo3702O(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        int i;
        vx2.m53591g(keyEvent, "keyEvent");
        long a = ma3.m22107a(keyEvent);
        x93.C3589a aVar = x93.f19628a;
        if (x93.m29994l(a, aVar.mo27711j())) {
            if (ma3.m22109c(keyEvent)) {
                i = j62.f13517b.mo21746f();
            } else {
                i = j62.f13517b.mo21745e();
            }
            return j62.m19986i(i);
        } else if (x93.m29994l(a, aVar.mo27706e())) {
            return j62.m19986i(j62.f13517b.mo21747g());
        } else {
            if (x93.m29994l(a, aVar.mo27705d())) {
                return j62.m19986i(j62.f13517b.mo21744d());
            }
            if (x93.m29994l(a, aVar.mo27707f())) {
                return j62.m19986i(j62.f13517b.mo21748h());
            }
            if (x93.m29994l(a, aVar.mo27704c())) {
                return j62.m19986i(j62.f13517b.mo21741a());
            }
            boolean z3 = true;
            if (x93.m29994l(a, aVar.mo27703b())) {
                z = true;
            } else {
                z = x93.m29994l(a, aVar.mo27708g());
            }
            if (z) {
                z2 = true;
            } else {
                z2 = x93.m29994l(a, aVar.mo27710i());
            }
            if (z2) {
                return j62.m19986i(j62.f13517b.mo21742b());
            }
            if (!x93.m29994l(a, aVar.mo27702a())) {
                z3 = x93.m29994l(a, aVar.mo27709h());
            }
            if (z3) {
                return j62.m19986i(j62.f13517b.mo21743c());
            }
            return null;
        }
    }

    /* renamed from: P */
    public final int mo3703P(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* renamed from: R */
    public final int mo3704R(MotionEvent motionEvent) {
        boolean z;
        removeCallbacks(this.f1905Y1);
        try {
            mo3730e0(motionEvent);
            boolean z2 = true;
            this.f1876C1 = true;
            mo3713a(false);
            this.f1917e2 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f1901U1;
            if (motionEvent2 == null || motionEvent2.getToolType(0) != 3) {
                z = false;
            } else {
                z = true;
            }
            if (motionEvent2 != null && mo3706T(motionEvent, motionEvent2)) {
                if (mo3711Y(motionEvent2)) {
                    this.f1915e0.mo25523b();
                } else if (motionEvent2.getActionMasked() != 10 && z) {
                    m2882p0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, (Object) null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z2 = false;
            }
            if (!z && z2 && actionMasked != 3 && actionMasked != 9 && mo3712Z(motionEvent)) {
                m2882p0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, (Object) null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f1901U1 = MotionEvent.obtainNoHistory(motionEvent);
            int n0 = mo3776n0(motionEvent);
            Trace.endSection();
            if (Build.VERSION.SDK_INT >= 24) {
                C3600xh.f19832a.mo27733a(this, this.f1917e2);
            }
            this.f1876C1 = false;
            return n0;
        } catch (Throwable th) {
            this.f1876C1 = false;
            throw th;
        }
    }

    /* renamed from: S */
    public final boolean mo3705S(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        vh5 vh5 = new vh5(wb7.m29441d(viewConfiguration, getContext()) * f, f * wb7.m29439b(viewConfiguration, getContext()), motionEvent.getEventTime());
        FocusModifier d = this.f1925r.mo3203d();
        if (d != null) {
            return d.mo3214D(vh5);
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo3706T(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public void mo3707U() {
        mo3708V(getRoot());
    }

    /* renamed from: V */
    public final void mo3708V(LayoutNode layoutNode) {
        layoutNode.mo3453i0();
        v04<LayoutNode> b0 = layoutNode.mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                mo3708V((LayoutNode) m[i]);
                i++;
            } while (i < n);
        }
    }

    /* renamed from: W */
    public final void mo3709W(LayoutNode layoutNode) {
        int i = 0;
        jq3.m20348C(this.f1932v1, layoutNode, false, 2, (Object) null);
        v04<LayoutNode> b0 = layoutNode.mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                mo3709W((LayoutNode) m[i]);
                i++;
            } while (i < n);
        }
    }

    /* renamed from: X */
    public final boolean mo3710X(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float x = motionEvent.getX();
        if (Float.isInfinite(x) || Float.isNaN(x)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        float y = motionEvent.getY();
        if (Float.isInfinite(y) || Float.isNaN(y)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final boolean mo3711Y(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final boolean mo3712Z(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (Utils.FLOAT_EPSILON > x || x > ((float) getWidth())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (Utils.FLOAT_EPSILON > y || y > ((float) getHeight())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo3713a(boolean z) {
        pc2<r37> pc2;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                pc2 = this.f1910b2;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            pc2 = null;
        }
        if (this.f1932v1.mo22059n(pc2)) {
            requestLayout();
        }
        jq3.m20351e(this.f1932v1, false, 1, (Object) null);
        r37 r37 = r37.f33317a;
        Trace.endSection();
    }

    /* renamed from: a0 */
    public final boolean mo3714a0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z;
        boolean z2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f1901U1) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        if (motionEvent.getRawY() == motionEvent2.getRawY()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        C2292fh fhVar;
        vx2.m53591g(sparseArray, "values");
        if (mo3697J() && (fhVar = this.f1931v0) != null) {
            C2472hh.m18881a(fhVar, sparseArray);
        }
    }

    /* renamed from: b */
    public void mo3716b(LayoutNode layoutNode, boolean z, boolean z2) {
        vx2.m53591g(layoutNode, "layoutNode");
        if (z) {
            if (this.f1932v1.mo22067w(layoutNode, z2)) {
                mo3769i0(layoutNode);
            }
        } else if (this.f1932v1.mo22047B(layoutNode, z2)) {
            mo3769i0(layoutNode);
        }
    }

    /* renamed from: b0 */
    public final Object mo3717b0(ns0<? super r37> ns0) {
        Object k = this.f1886K1.mo4135k(ns0);
        if (k == wx2.m54101d()) {
            return k;
        }
        return r37.f33317a;
    }

    /* renamed from: c */
    public void mo3718c(LayoutNode layoutNode, boolean z, boolean z2) {
        vx2.m53591g(layoutNode, "layoutNode");
        if (z) {
            if (this.f1932v1.mo22066u(layoutNode, z2)) {
                m2879j0(this, (LayoutNode) null, 1, (Object) null);
            }
        } else if (this.f1932v1.mo22069z(layoutNode, z2)) {
            m2879j0(this, (LayoutNode) null, 1, (Object) null);
        }
    }

    /* renamed from: c0 */
    public final void mo3719c0(lj4 lj4, boolean z) {
        vx2.m53591g(lj4, "layer");
        if (!z) {
            if (!this.f1895Q && !this.f1889M.remove(lj4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.f1895Q) {
            this.f1889M.add(lj4);
        } else {
            List list = this.f1893P;
            if (list == null) {
                list = new ArrayList();
                this.f1893P = list;
            }
            list.add(lj4);
        }
    }

    public boolean canScrollHorizontally(int i) {
        return this.f1883I.mo3856y(false, i, this.f1907a);
    }

    public boolean canScrollVertically(int i) {
        return this.f1883I.mo3856y(true, i, this.f1907a);
    }

    /* renamed from: d */
    public void mo3722d(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f1932v1.mo22068y(layoutNode);
        m2879j0(this, (LayoutNode) null, 1, (Object) null);
    }

    /* renamed from: d0 */
    public final void mo3723d0() {
        if (!this.f1876C1) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f1874B1) {
                this.f1874B1 = currentAnimationTimeMillis;
                mo3731f0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f1937y1);
                int[] iArr = this.f1937y1;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f1937y1;
                this.f1877D1 = wf4.m29550a(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
        if (!isAttachedToWindow()) {
            mo3708V(getRoot());
        }
        mj4.m22324a(this, false, 1, (Object) null);
        this.f1895Q = true;
        bb0 bb0 = this.f1871A;
        Canvas k = bb0.mo11468a().mo21535k();
        bb0.mo11468a().mo21536l(canvas);
        getRoot().mo3468r(bb0.mo11468a());
        bb0.mo11468a().mo21536l(k);
        if (!this.f1889M.isEmpty()) {
            int size = this.f1889M.size();
            for (int i = 0; i < size; i++) {
                this.f1889M.get(i).mo3939i();
            }
        }
        if (ViewLayer.f2066H.mo3963b()) {
            int save = canvas.save();
            canvas.clipRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f1889M.clear();
        this.f1895Q = false;
        List<lj4> list = this.f1893P;
        if (list != null) {
            vx2.m53588d(list);
            this.f1889M.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        vx2.m53591g(motionEvent, "event");
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return mo3705S(motionEvent);
        }
        if (mo3710X(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return pv4.m25184c(mo3704R(motionEvent));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        vx2.m53591g(motionEvent, "event");
        if (this.f1908a2) {
            removeCallbacks(this.f1906Z1);
            this.f1906Z1.run();
        }
        if (mo3710X(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.isFromSource(4098) && motionEvent.getToolType(0) == 1) {
            return this.f1883I.mo3819F(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && mo3712Z(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.f1901U1;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.f1901U1 = MotionEvent.obtainNoHistory(motionEvent);
                    this.f1908a2 = true;
                    post(this.f1906Z1);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!mo3714a0(motionEvent)) {
            return false;
        }
        return pv4.m25184c(mo3704R(motionEvent));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f1927s.mo20651a(xr4.m30288b(keyEvent.getMetaState()));
        return mo3774m0(ja3.m20054b(keyEvent));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vx2.m53591g(motionEvent, "motionEvent");
        if (this.f1908a2) {
            removeCallbacks(this.f1906Z1);
            MotionEvent motionEvent2 = this.f1901U1;
            vx2.m53588d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || mo3706T(motionEvent, motionEvent2)) {
                this.f1906Z1.run();
            } else {
                this.f1908a2 = false;
            }
        }
        if (mo3710X(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !mo3714a0(motionEvent)) {
            return false;
        }
        int R = mo3704R(motionEvent);
        if (pv4.m25183b(R)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return pv4.m25184c(R);
    }

    /* renamed from: e */
    public void mo3729e(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f1883I.mo3831R(layoutNode);
    }

    /* renamed from: e0 */
    public final void mo3730e0(MotionEvent motionEvent) {
        this.f1874B1 = AnimationUtils.currentAnimationTimeMillis();
        mo3731f0();
        long c = fp3.m17171c(this.f1938z1, wf4.m29550a(motionEvent.getX(), motionEvent.getY()));
        this.f1877D1 = wf4.m29550a(motionEvent.getRawX() - tf4.m27734k(c), motionEvent.getRawY() - tf4.m27735l(c));
    }

    /* renamed from: f0 */
    public final void mo3731f0() {
        this.f1911c2.mo23071a(this, this.f1938z1);
        hy2.m19301a(this.f1938z1, this.f1872A1);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return mo3701N(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo3733g(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f1932v1.mo22053h(layoutNode);
    }

    /* renamed from: g0 */
    public final boolean mo3734g0(lj4 lj4) {
        vx2.m53591g(lj4, "layer");
        if (this.f1928s1 != null) {
            boolean b = ViewLayer.f2066H.mo3963b();
        }
        this.f1903W1.mo24622c(lj4);
        return true;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f1926r1 == null) {
            Context context = getContext();
            vx2.m53590f(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.f1926r1 = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.f1926r1;
        vx2.m53588d(androidViewsHandler2);
        return androidViewsHandler2;
    }

    public C2790lv getAutofill() {
        return this.f1931v0;
    }

    public C3436uv getAutofillTree() {
        return this.f1887L;
    }

    public final rc2<Configuration, r37> getConfigurationChangeObserver() {
        return this.f1921k0;
    }

    public dc1 getDensity() {
        return this.f1919g;
    }

    public m62 getFocusManager() {
        return this.f1925r;
    }

    public void getFocusedRect(Rect rect) {
        r37 r37;
        a95 e;
        vx2.m53591g(rect, "rect");
        FocusModifier d = this.f1925r.mo3203d();
        if (d == null || (e = w62.m29290e(d)) == null) {
            r37 = null;
        } else {
            rect.left = ap3.m31899b(e.mo118f());
            rect.top = ap3.m31899b(e.mo122i());
            rect.right = ap3.m31899b(e.mo119g());
            rect.bottom = ap3.m31899b(e.mo114c());
            r37 = r37.f33317a;
        }
        if (r37 == null) {
            super.getFocusedRect(rect);
        }
    }

    public z62.C3714b getFontFamilyResolver() {
        return (z62.C3714b) this.f1891N1.getValue();
    }

    public y62.C3655a getFontLoader() {
        return this.f1890M1;
    }

    public dl2 getHapticFeedBack() {
        return this.f1896Q1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f1932v1.mo22056k();
    }

    public cv2 getInputModeManager() {
        return this.f1897R1;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f1874B1;
    }

    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f1894P1.getValue();
    }

    public long getMeasureIteration() {
        return this.f1932v1.mo22058m();
    }

    public ModifierLocalManager getModifierLocalManager() {
        return this.f1898S1;
    }

    public lr4 getPointerIconService() {
        return this.f1918f2;
    }

    public LayoutNode getRoot() {
        return this.f1873B;
    }

    public qh5 getRootForTest() {
        return this.f1875C;
    }

    public cu5 getSemanticsOwner() {
        return this.f1881H;
    }

    public ye3 getSharedDrawScope() {
        return this.f1914e;
    }

    public boolean getShowLayoutBounds() {
        return this.f1924q1;
    }

    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.f1923p1;
    }

    public un6 getTextInputService() {
        return this.f1888L1;
    }

    public fo6 getTextToolbar() {
        return this.f1899T1;
    }

    public View getView() {
        return this;
    }

    public tb7 getViewConfiguration() {
        return this.f1933w1;
    }

    public final C0396b getViewTreeOwners() {
        return (C0396b) this.f1879F1.getValue();
    }

    public fl7 getWindowInfo() {
        return this.f1927s;
    }

    /* renamed from: h */
    public /* synthetic */ void mo3766h(ug3 ug3) {
        v81.m28696e(this, ug3);
    }

    /* renamed from: h0 */
    public final void mo3767h0() {
        this.f1909b1 = true;
    }

    /* renamed from: i */
    public void mo3768i(nj4.C2902b bVar) {
        vx2.m53591g(bVar, "listener");
        this.f1932v1.mo22063r(bVar);
        m2879j0(this, (LayoutNode) null, 1, (Object) null);
    }

    /* renamed from: i0 */
    public final void mo3769i0(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (this.f1930u1 && layoutNode != null) {
                while (layoutNode != null && layoutNode.mo3417O() == LayoutNode.UsageByParent.InMeasureBlock) {
                    layoutNode = layoutNode.mo3430V();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    /* renamed from: j */
    public long mo3770j(long j) {
        mo3723d0();
        return fp3.m17171c(this.f1872A1, wf4.m29550a(tf4.m27734k(j) - tf4.m27734k(this.f1877D1), tf4.m27735l(j) - tf4.m27735l(this.f1877D1)));
    }

    /* renamed from: k */
    public /* synthetic */ void mo3771k(ug3 ug3) {
        v81.m28693b(this, ug3);
    }

    /* renamed from: l */
    public void mo3772l(ug3 ug3) {
        vx2.m53591g(ug3, ENS.FUNC_OWNER);
        setShowLayoutBounds(f1868g2.mo3804b());
    }

    /* renamed from: m */
    public void mo3773m(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "node");
    }

    /* renamed from: m0 */
    public boolean mo3774m0(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "keyEvent");
        return this.f1934x.mo25046t(keyEvent);
    }

    /* renamed from: n */
    public lj4 mo3775n(rc2<? super xa0, r37> rc2, pc2<r37> pc2) {
        DrawChildContainer drawChildContainer;
        vx2.m53591g(rc2, "drawBlock");
        vx2.m53591g(pc2, "invalidateParentLayer");
        lj4 b = this.f1903W1.mo24621b();
        if (b != null) {
            b.mo3933d(rc2, pc2);
            return b;
        }
        if (isHardwareAccelerated() && this.f1878E1) {
            try {
                return new RenderNodeLayer(this, rc2, pc2);
            } catch (Throwable unused) {
                this.f1878E1 = false;
            }
        }
        if (this.f1928s1 == null) {
            ViewLayer.C0435b bVar = ViewLayer.f2066H;
            if (!bVar.mo3962a()) {
                bVar.mo3965d(new View(getContext()));
            }
            if (bVar.mo3963b()) {
                Context context = getContext();
                vx2.m53590f(context, "context");
                drawChildContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                vx2.m53590f(context2, "context");
                drawChildContainer = new ViewLayerContainer(context2);
            }
            this.f1928s1 = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.f1928s1;
        vx2.m53588d(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, rc2, pc2);
    }

    /* renamed from: n0 */
    public final int mo3776n0(MotionEvent motionEvent) {
        qr4 qr4;
        if (this.f1913d2) {
            this.f1913d2 = false;
            this.f1927s.mo20651a(xr4.m30288b(motionEvent.getMetaState()));
        }
        pr4 c = this.f1900U.mo23834c(motionEvent, this);
        if (c != null) {
            List<qr4> b = c.mo24782b();
            ListIterator<qr4> listIterator = b.listIterator(b.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qr4 = null;
                    break;
                }
                qr4 = listIterator.previous();
                if (qr4.mo25250a()) {
                    break;
                }
            }
            qr4 qr42 = qr4;
            if (qr42 != null) {
                this.f1907a = qr42.mo25254e();
            }
            int a = this.f1915e0.mo25522a(c, this, mo3712Z(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || pv4.m25184c(a)) {
                return a;
            }
            this.f1900U.mo23836e(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return a;
        }
        this.f1915e0.mo25523b();
        return sr4.m27083a(false, false);
    }

    /* renamed from: o */
    public void mo3777o(pc2<r37> pc2) {
        vx2.m53591g(pc2, "listener");
        if (!this.f1904X1.mo26959j(pc2)) {
            this.f1904X1.mo26953c(pc2);
        }
    }

    /* renamed from: o0 */
    public final void mo3778o0(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int i3;
        long j2;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = i;
        int actionMasked = motionEvent.getActionMasked();
        int i6 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i6 = motionEvent.getActionIndex();
            }
        } else if (!(i5 == 9 || i5 == 10)) {
            i6 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i6 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = pointerCount - i2;
        if (i7 != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                pointerCoordsArr[i9] = new MotionEvent.PointerCoords();
            }
            for (int i10 = 0; i10 < i7; i10++) {
                if (i6 < 0 || i10 < i6) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                int i11 = i4 + i10;
                motionEvent2.getPointerProperties(i11, pointerPropertiesArr[i10]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i10];
                motionEvent2.getPointerCoords(i11, pointerCoords);
                long r = mo3793r(wf4.m29550a(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = tf4.m27734k(r);
                pointerCoords.y = tf4.m27735l(r);
            }
            if (z) {
                i3 = 0;
            } else {
                i3 = motionEvent.getButtonState();
            }
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                j2 = j;
            } else {
                j2 = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(j2, j, i, i7, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i3, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            ny3 ny3 = this.f1900U;
            vx2.m53590f(obtain, "event");
            pr4 c = ny3.mo23834c(obtain, this);
            vx2.m53588d(c);
            this.f1915e0.mo25522a(c, this, true);
            obtain.recycle();
        }
    }

    public void onAttachedToWindow() {
        boolean z;
        ug3 a;
        Lifecycle lifecycle;
        C2292fh fhVar;
        super.onAttachedToWindow();
        mo3709W(getRoot());
        mo3708V(getRoot());
        getSnapshotObserver().mo3658i();
        if (mo3697J() && (fhVar = this.f1931v0) != null) {
            C3306sv.f17810a.mo25967a(fhVar);
        }
        ug3 a2 = me7.m22274a(this);
        il5 a3 = ViewTreeSavedStateRegistryOwner.m9847a(this);
        C0396b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(a2 == null || a3 == null || (a2 == viewTreeOwners.mo3805a() && a3 == viewTreeOwners.mo3805a()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (a2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (a3 != null) {
                if (!(viewTreeOwners == null || (a = viewTreeOwners.mo3805a()) == null || (lifecycle = a.getLifecycle()) == null)) {
                    lifecycle.mo6297c(this);
                }
                a2.getLifecycle().mo6295a(this);
                C0396b bVar = new C0396b(a2, a3);
                setViewTreeOwners(bVar);
                rc2<? super C0396b, r37> rc2 = this.f1880G1;
                if (rc2 != null) {
                    rc2.invoke(bVar);
                }
                this.f1880G1 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        C0396b viewTreeOwners2 = getViewTreeOwners();
        vx2.m53588d(viewTreeOwners2);
        viewTreeOwners2.mo3805a().getLifecycle().mo6295a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1882H1);
        getViewTreeObserver().addOnScrollChangedListener(this.f1884I1);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f1885J1);
    }

    public boolean onCheckIsTextEditor() {
        return this.f1886K1.mo4132h();
    }

    public void onConfigurationChanged(Configuration configuration) {
        vx2.m53591g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        vx2.m53590f(context, "context");
        this.f1919g = C2293fi.m17002a(context);
        if (mo3703P(configuration) != this.f1892O1) {
            this.f1892O1 = mo3703P(configuration);
            Context context2 = getContext();
            vx2.m53590f(context2, "context");
            setFontFamilyResolver(c72.m11743a(context2));
        }
        this.f1921k0.invoke(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        vx2.m53591g(editorInfo, "outAttrs");
        return this.f1886K1.mo4129e(editorInfo);
    }

    public void onDetachedFromWindow() {
        C2292fh fhVar;
        ug3 a;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().mo3659j();
        C0396b viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (a = viewTreeOwners.mo3805a()) == null || (lifecycle = a.getLifecycle()) == null)) {
            lifecycle.mo6297c(this);
        }
        if (mo3697J() && (fhVar = this.f1931v0) != null) {
            C3306sv.f17810a.mo25968b(fhVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1882H1);
        getViewTreeObserver().removeOnScrollChangedListener(this.f1884I1);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f1885J1);
    }

    public void onDraw(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        StringBuilder sb = new StringBuilder();
        sb.append("Owner FocusChanged(");
        sb.append(z);
        sb.append(')');
        FocusManagerImpl focusManagerImpl = this.f1925r;
        if (z) {
            focusManagerImpl.mo3208i();
        } else {
            focusManagerImpl.mo3206g();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1932v1.mo22059n(this.f1910b2);
        this.f1929t1 = null;
        mo3794r0();
        if (this.f1926r1 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                mo3709W(getRoot());
            }
            Pair<Integer, Integer> M = mo3700M(i);
            int intValue = M.component1().intValue();
            int intValue2 = M.component2().intValue();
            Pair<Integer, Integer> M2 = mo3700M(i2);
            long a = pq0.m25130a(intValue, intValue2, M2.component1().intValue(), M2.component2().intValue());
            mq0 mq0 = this.f1929t1;
            boolean z = false;
            if (mq0 == null) {
                this.f1929t1 = mq0.m22471b(a);
                this.f1930u1 = false;
            } else {
                if (mq0 != null) {
                    z = mq0.m22474e(mq0.mo23282m(), a);
                }
                if (!z) {
                    this.f1930u1 = true;
                }
            }
            this.f1932v1.mo22048D(a);
            this.f1932v1.mo22060o();
            setMeasuredDimension(getRoot().mo3438Z(), getRoot().mo3485z());
            if (this.f1926r1 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().mo3438Z(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().mo3485z(), 1073741824));
            }
            r37 r37 = r37.f33317a;
        } finally {
            Trace.endSection();
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C2292fh fhVar;
        if (mo3697J() && viewStructure != null && (fhVar = this.f1931v0) != null) {
            C2472hh.m18882b(fhVar, viewStructure);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.f1912d) {
            LayoutDirection a = AndroidComposeView_androidKt.m3040f(i);
            setLayoutDirection(a);
            this.f1925r.mo3207h(a);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        boolean a;
        this.f1927s.mo20652b(z);
        this.f1913d2 = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (a = f1868g2.mo3804b())) {
            setShowLayoutBounds(a);
            mo3707U();
        }
    }

    /* renamed from: p */
    public /* synthetic */ void mo3791p(ug3 ug3) {
        v81.m28697f(this, ug3);
    }

    /* renamed from: q */
    public void mo3792q(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "node");
        this.f1932v1.mo22061p(layoutNode);
        mo3767h0();
    }

    /* renamed from: r */
    public long mo3793r(long j) {
        mo3723d0();
        long c = fp3.m17171c(this.f1938z1, j);
        return wf4.m29550a(tf4.m27734k(c) + tf4.m27734k(this.f1877D1), tf4.m27735l(c) + tf4.m27735l(this.f1877D1));
    }

    /* renamed from: r0 */
    public final void mo3794r0() {
        getLocationOnScreen(this.f1937y1);
        long j = this.f1935x1;
        int b = nw2.m23477b(j);
        int c = nw2.m23478c(j);
        int[] iArr = this.f1937y1;
        boolean z = false;
        int i = iArr[0];
        if (!(b == i && c == iArr[1])) {
            this.f1935x1 = ow2.m24292a(i, iArr[1]);
            if (!(b == Integer.MAX_VALUE || c == Integer.MAX_VALUE)) {
                getRoot().mo3399D().mo3516x().mo3550W();
                z = true;
            }
        }
        this.f1932v1.mo22050d(z);
    }

    /* renamed from: s */
    public /* synthetic */ void mo3795s(ug3 ug3) {
        v81.m28694c(this, ug3);
    }

    public final void setConfigurationChangeObserver(rc2<? super Configuration, r37> rc2) {
        vx2.m53591g(rc2, "<set-?>");
        this.f1921k0 = rc2;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f1874B1 = j;
    }

    public final void setOnViewTreeOwnersAvailable(rc2<? super C0396b, r37> rc2) {
        vx2.m53591g(rc2, "callback");
        C0396b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            rc2.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f1880G1 = rc2;
        }
    }

    public void setShowLayoutBounds(boolean z) {
        this.f1924q1 = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void mo3801t() {
        if (this.f1909b1) {
            getSnapshotObserver().mo3653a();
            this.f1909b1 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f1926r1;
        if (androidViewsHandler != null) {
            mo3699L(androidViewsHandler);
        }
        while (this.f1904X1.mo26966r()) {
            int n = this.f1904X1.mo26963n();
            for (int i = 0; i < n; i++) {
                pc2 pc2 = (pc2) this.f1904X1.mo26962m()[i];
                this.f1904X1.mo26950D(i, null);
                if (pc2 != null) {
                    pc2.invoke();
                }
            }
            this.f1904X1.mo26948A(0, n);
        }
    }

    /* renamed from: u */
    public void mo3802u() {
        this.f1883I.mo3832S();
    }

    /* renamed from: x */
    public /* synthetic */ void mo3803x(ug3 ug3) {
        v81.m28692a(this, ug3);
    }

    public C1679ch getAccessibilityManager() {
        return this.f1922o1;
    }

    public C2758lh getClipboardManager() {
        return this.f1916e1;
    }
}
