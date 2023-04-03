package androidx.compose.p004ui.platform;

import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.semantics.SemanticsProperties;
import androidx.compose.p004ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import okhttp3.internal.http2.Http2;
import p000.C1669c8;
import p000.C2454h8;
import p000.C3335t8;
import p000.hh5;
import p000.ri3;
import p000.z62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 22\u00020\u0001:\tlÊ\u0001w|\u0001\u0001B\u0011\u0012\u0006\u0010{\u001a\u00020v¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J?\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J*\u0010&\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J/\u0010*\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010$*\u00020(2\b\u0010\u001d\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0002J\u001e\u00101\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0002J\b\u00102\u001a\u00020\nH\u0002J\b\u00103\u001a\u00020\nH\u0002J\u001e\u00107\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0012H\u0002J\u0010\u00109\u001a\u00020\n2\u0006\u00108\u001a\u000205H\u0002J\"\u0010<\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010@\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0002J\u0010\u0010A\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002H\u0002J(\u0010E\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH\u0002J\u0010\u0010F\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u0002H\u0002J(\u0010J\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\rH\u0002J\u0010\u0010K\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010L\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010M\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010O\u001a\u0004\u0018\u00010N2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010B\u001a\u00020\u0002H\u0002J\u0014\u0010P\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010S\u001a\u0004\u0018\u00010R*\u00020QH\u0002J-\u0010X\u001a\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u00022\u0006\u0010W\u001a\u00020VH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010YJ;\u0010]\u001a\u00020\r2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u00022\u0006\u0010W\u001a\u00020VH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J \u0010`\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u0006H\u0007J\u001f\u0010a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\ba\u0010bJ\u000e\u0010d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020cJ\u001f\u0010g\u001a\u00020\u00022\u0006\u0010f\u001a\u00020e2\u0006\u0010X\u001a\u00020eH\u0001¢\u0006\u0004\bg\u0010hJ\u0010\u0010l\u001a\u00020k2\u0006\u0010j\u001a\u00020iH\u0016J\u000f\u0010m\u001a\u00020\nH\u0000¢\u0006\u0004\bm\u0010nJ\u0013\u0010f\u001a\u00020\nH@ø\u0001\u0001¢\u0006\u0004\bf\u0010oJ\u0017\u0010p\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\bp\u0010qJ#\u0010t\u001a\u00020\n2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[0rH\u0001¢\u0006\u0004\bt\u0010uR\u0017\u0010{\u001a\u00020v8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR%\u0010\u0001\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b\u0001\u00107\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020k8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010}R'\u0010\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020(0\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00020r0\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010}R\u001b\u0010 \u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001d\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020,0/8\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\n0¤\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u00107R\u001c\u0010­\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R+\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[0r8B@\u0002X\u000e¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\b}\u0010°\u0001R\u001f\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b±\u0001\u0010¢\u0001R<\u0010¸\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020>0³\u00018\u0000@\u0000X\u000e¢\u0006\u001e\n\u0006\b´\u0001\u0010¯\u0001\u0012\u0005\b·\u0001\u0010n\u001a\u0006\bµ\u0001\u0010°\u0001\"\u0005\b¶\u0001\u0010uR\u0019\u0010»\u0001\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0017\u0010¼\u0001\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0017\u0010¿\u0001\u001a\u00030½\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bf\u0010¾\u0001R\u001d\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u0002050À\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bX\u0010Á\u0001R#\u0010Å\u0001\u001a\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\n0Ã\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b]\u0010Ä\u0001R\u0017\u0010Ç\u0001\u001a\u00020\r8BX\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ë\u0001"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Lz7;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "D", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lt8;", "info", "Lr37;", "n0", "o0", "", "O", "a0", "eventType", "contentChangeType", "", "", "contentDescription", "e0", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "d0", "fromIndex", "toIndex", "itemCount", "text", "E", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;", "B", "action", "Landroid/os/Bundle;", "arguments", "T", "extraDataKey", "w", "r0", "", "size", "q0", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Q", "Lqq;", "subtreeChangedSemanticsNodesIds", "l0", "A", "s0", "id", "Lsn5;", "oldScrollObservationScopes", "Z", "scrollObservationScope", "i0", "semanticsNodeId", "title", "g0", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "oldNode", "k0", "c0", "granularity", "forward", "extendSelection", "p0", "h0", "start", "end", "traversalMode", "m0", "H", "G", "P", "Lg8;", "K", "J", "Lvt5;", "Lrl;", "L", "vertical", "direction", "Ltf4;", "position", "y", "(ZIJ)Z", "", "Lbu5;", "currentSemanticsNodes", "z", "(Ljava/util/Collection;ZIJ)Z", "semanticsNode", "W", "C", "(II)Landroid/view/accessibility/AccessibilityEvent;", "Landroid/view/MotionEvent;", "F", "", "x", "M", "(FF)I", "Landroid/view/View;", "host", "Lw8;", "b", "S", "()V", "(Lns0;)Ljava/lang/Object;", "R", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "newSemanticsNodes", "j0", "(Ljava/util/Map;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "view", "e", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "hoveredVirtualViewId", "Landroid/view/accessibility/AccessibilityManager;", "f", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "g", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "Landroid/os/Handler;", "h", "Landroid/os/Handler;", "handler", "i", "Lw8;", "nodeProvider", "j", "focusedVirtualViewId", "Lj66;", "k", "Lj66;", "actionIdToLabel", "l", "labelToActionId", "m", "accessibilityCursorPosition", "n", "Ljava/lang/Integer;", "previousTraversedNode", "o", "Lqq;", "subtreeChangedLayoutNodes", "Lfd0;", "p", "Lfd0;", "boundsUpdateChannel", "q", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f;", "r", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f;", "pendingTextTraversedEvent", "s", "Ljava/util/Map;", "()Ljava/util/Map;", "t", "paneDisplayed", "", "u", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsNodes", "v", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "", "Ljava/util/List;", "scrollObservationScopes", "Lkotlin/Function1;", "Lrc2;", "sendScrollEventIfNeededLambda", "N", "isAccessibilityEnabled", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "c", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C3715z7 {

    /* renamed from: A */
    public static final C0402d f1943A = new C0402d((DefaultConstructorMarker) null);

    /* renamed from: B */
    public static final int[] f1944B = {o35.accessibility_custom_action_0, o35.accessibility_custom_action_1, o35.accessibility_custom_action_2, o35.accessibility_custom_action_3, o35.accessibility_custom_action_4, o35.accessibility_custom_action_5, o35.accessibility_custom_action_6, o35.accessibility_custom_action_7, o35.accessibility_custom_action_8, o35.accessibility_custom_action_9, o35.accessibility_custom_action_10, o35.accessibility_custom_action_11, o35.accessibility_custom_action_12, o35.accessibility_custom_action_13, o35.accessibility_custom_action_14, o35.accessibility_custom_action_15, o35.accessibility_custom_action_16, o35.accessibility_custom_action_17, o35.accessibility_custom_action_18, o35.accessibility_custom_action_19, o35.accessibility_custom_action_20, o35.accessibility_custom_action_21, o35.accessibility_custom_action_22, o35.accessibility_custom_action_23, o35.accessibility_custom_action_24, o35.accessibility_custom_action_25, o35.accessibility_custom_action_26, o35.accessibility_custom_action_27, o35.accessibility_custom_action_28, o35.accessibility_custom_action_29, o35.accessibility_custom_action_30, o35.accessibility_custom_action_31};

    /* renamed from: d */
    public final AndroidComposeView f1945d;

    /* renamed from: e */
    public int f1946e = Integer.MIN_VALUE;

    /* renamed from: f */
    public final AccessibilityManager f1947f;

    /* renamed from: g */
    public boolean f1948g;

    /* renamed from: h */
    public final Handler f1949h;

    /* renamed from: i */
    public C3523w8 f1950i;

    /* renamed from: j */
    public int f1951j;

    /* renamed from: k */
    public j66<j66<CharSequence>> f1952k;

    /* renamed from: l */
    public j66<Map<CharSequence, Integer>> f1953l;

    /* renamed from: m */
    public int f1954m;

    /* renamed from: n */
    public Integer f1955n;

    /* renamed from: o */
    public final C3162qq<LayoutNode> f1956o;

    /* renamed from: p */
    public final fd0<r37> f1957p;

    /* renamed from: q */
    public boolean f1958q;

    /* renamed from: r */
    public C0404f f1959r;

    /* renamed from: s */
    public Map<Integer, bu5> f1960s;

    /* renamed from: t */
    public C3162qq<Integer> f1961t;

    /* renamed from: u */
    public Map<Integer, C0405g> f1962u;

    /* renamed from: v */
    public C0405g f1963v;

    /* renamed from: w */
    public boolean f1964w;

    /* renamed from: x */
    public final Runnable f1965x;

    /* renamed from: y */
    public final List<sn5> f1966y;

    /* renamed from: z */
    public final rc2<sn5, r37> f1967z;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lr37;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$a */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class C0399a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f1968a;

        public C0399a(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
            this.f1968a = androidComposeViewAccessibilityDelegateCompat;
        }

        public void onViewAttachedToWindow(View view) {
            vx2.m53591g(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            vx2.m53591g(view, "view");
            this.f1968a.f1949h.removeCallbacks(this.f1968a.f1965x);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$b;", "", "Lt8;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Lr37;", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$b */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class C0400b {

        /* renamed from: a */
        public static final C0400b f1969a = new C0400b();

        /* renamed from: a */
        public static final void m3003a(C3335t8 t8Var, SemanticsNode semanticsNode) {
            C3574x7 x7Var;
            vx2.m53591g(t8Var, "info");
            vx2.m53591g(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode) && (x7Var = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.f18260a.mo26565m())) != null) {
                t8Var.mo26229b(new C3335t8.C3336a(16908349, x7Var.mo27684b()));
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$c;", "", "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "deltaX", "deltaY", "Lr37;", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$c */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class C0401c {

        /* renamed from: a */
        public static final C0401c f1970a = new C0401c();

        /* renamed from: a */
        public static final void m3004a(AccessibilityEvent accessibilityEvent, int i, int i2) {
            vx2.m53591g(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$d;", "", "", "AccessibilityActionsResourceIds", "[I", "", "AccessibilityCursorPositionUndefined", "I", "AccessibilitySliderStepsCount", "", "ClassName", "Ljava/lang/String;", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "", "SendRecurringAccessibilityEventsIntervalMillis", "J", "TextTraversedEventTimeoutMillis", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$d */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class C0402d {
        public C0402d() {
        }

        public /* synthetic */ C0402d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$e;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createAccessibilityNodeInfo", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "info", "", "extraDataKey", "Lr37;", "addExtraDataToAccessibilityNodeInfo", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$e */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public final class C0403e extends AccessibilityNodeProvider {
        public C0403e() {
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            vx2.m53591g(accessibilityNodeInfo, "info");
            vx2.m53591g(str, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.mo3854w(i, accessibilityNodeInfo, str, bundle);
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.mo3817D(i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.mo3833T(i, i2, bundle);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "d", "()Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "b", "I", "()I", "action", "c", "granularity", "fromIndex", "e", "toIndex", "", "f", "J", "()J", "traverseTime", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$f */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class C0404f {

        /* renamed from: a */
        public final SemanticsNode f1972a;

        /* renamed from: b */
        public final int f1973b;

        /* renamed from: c */
        public final int f1974c;

        /* renamed from: d */
        public final int f1975d;

        /* renamed from: e */
        public final int f1976e;

        /* renamed from: f */
        public final long f1977f;

        public C0404f(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            vx2.m53591g(semanticsNode, "node");
            this.f1972a = semanticsNode;
            this.f1973b = i;
            this.f1974c = i2;
            this.f1975d = i3;
            this.f1976e = i4;
            this.f1977f = j;
        }

        /* renamed from: a */
        public final int mo3863a() {
            return this.f1973b;
        }

        /* renamed from: b */
        public final int mo3864b() {
            return this.f1975d;
        }

        /* renamed from: c */
        public final int mo3865c() {
            return this.f1974c;
        }

        /* renamed from: d */
        public final SemanticsNode mo3866d() {
            return this.f1972a;
        }

        /* renamed from: e */
        public final int mo3867e() {
            return this.f1976e;
        }

        /* renamed from: f */
        public final long mo3868f() {
            return this.f1977f;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u0016"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "", "", "c", "Lvt5;", "a", "Lvt5;", "b", "()Lvt5;", "unmergedConfig", "", "", "Ljava/util/Set;", "()Ljava/util/Set;", "children", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "Lbu5;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class C0405g {

        /* renamed from: a */
        public final vt5 f1978a;

        /* renamed from: b */
        public final Set<Integer> f1979b = new LinkedHashSet();

        public C0405g(SemanticsNode semanticsNode, Map<Integer, bu5> map) {
            vx2.m53591g(semanticsNode, "semanticsNode");
            vx2.m53591g(map, "currentSemanticsNodes");
            this.f1978a = semanticsNode.mo4013s();
            List<SemanticsNode> o = semanticsNode.mo4009o();
            int size = o.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = o.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode2.mo4003i()))) {
                    this.f1979b.add(Integer.valueOf(semanticsNode2.mo4003i()));
                }
            }
        }

        /* renamed from: a */
        public final Set<Integer> mo3869a() {
            return this.f1979b;
        }

        /* renamed from: b */
        public final vt5 mo3870b() {
            return this.f1978a;
        }

        /* renamed from: c */
        public final boolean mo3871c() {
            return this.f1978a.mo27319k(SemanticsProperties.f2125a.mo4034m());
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public /* synthetic */ class C0406h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1980a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            f1980a = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        vx2.m53591g(androidComposeView, "view");
        this.f1945d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f1947f = (AccessibilityManager) systemService;
        this.f1949h = new Handler(Looper.getMainLooper());
        this.f1950i = new C3523w8(new C0403e());
        this.f1951j = Integer.MIN_VALUE;
        this.f1952k = new j66<>();
        this.f1953l = new j66<>();
        this.f1954m = -1;
        this.f1956o = new C3162qq<>();
        this.f1957p = od0.m70236b(-1, (BufferOverflow) null, (rc2) null, 6, (Object) null);
        this.f1958q = true;
        this.f1960s = C6177b.m47361i();
        this.f1961t = new C3162qq<>();
        this.f1962u = new LinkedHashMap();
        this.f1963v = new C0405g(androidComposeView.getSemanticsOwner().mo18291a(), C6177b.m47361i());
        androidComposeView.addOnAttachStateChangeListener(new C0399a(this));
        this.f1965x = new C3146qh(this);
        this.f1966y = new ArrayList();
        this.f1967z = new C0410x168b1034(this);
    }

    /* renamed from: U */
    public static final boolean m2944U(rn5 rn5, float f) {
        if ((f >= Utils.FLOAT_EPSILON || rn5.mo25464c().invoke().floatValue() <= Utils.FLOAT_EPSILON) && (f <= Utils.FLOAT_EPSILON || rn5.mo25464c().invoke().floatValue() >= rn5.mo25462a().invoke().floatValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public static final float m2945V(float f, float f2) {
        boolean z;
        if (Math.signum(f) == Math.signum(f2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Utils.FLOAT_EPSILON;
        }
        if (Math.abs(f) < Math.abs(f2)) {
            return f;
        }
        return f2;
    }

    /* renamed from: X */
    public static final boolean m2946X(rn5 rn5) {
        if ((rn5.mo25464c().invoke().floatValue() <= Utils.FLOAT_EPSILON || rn5.mo25463b()) && (rn5.mo25464c().invoke().floatValue() >= rn5.mo25462a().invoke().floatValue() || !rn5.mo25463b())) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public static final boolean m2947Y(rn5 rn5) {
        if ((rn5.mo25464c().invoke().floatValue() >= rn5.mo25462a().invoke().floatValue() || rn5.mo25463b()) && (rn5.mo25464c().invoke().floatValue() <= Utils.FLOAT_EPSILON || !rn5.mo25463b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    public static final void m2948b0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        vx2.m53591g(androidComposeViewAccessibilityDelegateCompat, "this$0");
        mj4.m22324a(androidComposeViewAccessibilityDelegateCompat.f1945d, false, 1, (Object) null);
        androidComposeViewAccessibilityDelegateCompat.mo3814A();
        androidComposeViewAccessibilityDelegateCompat.f1964w = false;
    }

    /* renamed from: f0 */
    public static /* synthetic */ boolean m2949f0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.mo3840e0(i, i2, num, list);
    }

    /* renamed from: A */
    public final void mo3814A() {
        mo3845k0(this.f1945d.getSemanticsOwner().mo18291a(), this.f1963v);
        mo3844j0(mo3822I());
        mo3853s0();
    }

    /* renamed from: B */
    public final boolean mo3815B(int i) {
        if (!mo3828O(i)) {
            return false;
        }
        this.f1951j = Integer.MIN_VALUE;
        this.f1945d.invalidate();
        m2949f0(this, i, 65536, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* renamed from: C */
    public final AccessibilityEvent mo3816C(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        vx2.m53590f(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f1945d.getContext().getPackageName());
        obtain.setSource(this.f1945d, i);
        bu5 bu5 = mo3822I().get(Integer.valueOf(i));
        if (bu5 != null) {
            obtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3031r(bu5.mo11886b()));
        }
        return obtain;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.accessibility.AccessibilityNodeInfo mo3817D(int r11) {
        /*
            r10 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r10.f1945d
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            ug3 r0 = r0.mo3805a()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle$State r0 = r0.mo6296b()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            t8 r0 = p000.C3335t8.m27493R()
            java.lang.String r2 = "obtain()"
            p000.vx2.m53590f(r0, r2)
            java.util.Map r2 = r10.mo3822I()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r2.get(r3)
            bu5 r2 = (p000.bu5) r2
            if (r2 != 0) goto L_0x003d
            r0.mo26222V()
            return r1
        L_0x003d:
            androidx.compose.ui.semantics.SemanticsNode r3 = r2.mo11886b()
            r4 = -1
            if (r11 != r4) goto L_0x0055
            androidx.compose.ui.platform.AndroidComposeView r4 = r10.f1945d
            android.view.ViewParent r4 = p000.ga7.m17727H(r4)
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x0051
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x0051:
            r0.mo26187A0(r1)
            goto L_0x007d
        L_0x0055:
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.mo4007m()
            if (r1 == 0) goto L_0x00e2
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.mo4007m()
            p000.vx2.m53588d(r1)
            int r1 = r1.mo4003i()
            androidx.compose.ui.platform.AndroidComposeView r5 = r10.f1945d
            cu5 r5 = r5.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r5 = r5.mo18291a()
            int r5 = r5.mo4003i()
            if (r1 != r5) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r4 = r1
        L_0x0078:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.f1945d
            r0.mo26189B0(r1, r4)
        L_0x007d:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.f1945d
            r0.mo26207K0(r1, r11)
            android.graphics.Rect r1 = r2.mo11885a()
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.f1945d
            int r4 = r1.left
            float r4 = (float) r4
            int r5 = r1.top
            float r5 = (float) r5
            long r4 = p000.wf4.m29550a(r4, r5)
            long r4 = r2.mo3793r(r4)
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.f1945d
            int r6 = r1.right
            float r6 = (float) r6
            int r1 = r1.bottom
            float r1 = (float) r1
            long r6 = p000.wf4.m29550a(r6, r1)
            long r1 = r2.mo3793r(r6)
            android.graphics.Rect r6 = new android.graphics.Rect
            float r7 = p000.tf4.m27734k(r4)
            double r7 = (double) r7
            double r7 = java.lang.Math.floor(r7)
            float r7 = (float) r7
            int r7 = (int) r7
            float r4 = p000.tf4.m27735l(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = p000.tf4.m27734k(r1)
            double r8 = (double) r5
            double r8 = java.lang.Math.ceil(r8)
            float r5 = (float) r8
            int r5 = (int) r5
            float r1 = p000.tf4.m27735l(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r6.<init>(r7, r4, r5, r1)
            r0.mo26230b0(r6)
            r10.mo3834W(r11, r0, r3)
            android.view.accessibility.AccessibilityNodeInfo r11 = r0.mo26220R0()
            return r11
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "semanticsNode "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " has null parent"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo3817D(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* renamed from: E */
    public final AccessibilityEvent mo3818E(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent C = mo3816C(i, 8192);
        if (num != null) {
            C.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            C.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            C.setItemCount(num3.intValue());
        }
        if (str != null) {
            C.getText().add(str);
        }
        return C;
    }

    /* renamed from: F */
    public final boolean mo3819F(MotionEvent motionEvent) {
        vx2.m53591g(motionEvent, "event");
        if (!mo3827N()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int M = mo3826M(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.f1945d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            mo3852r0(M);
            if (M == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.f1946e == Integer.MIN_VALUE) {
                return this.f1945d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            mo3852r0(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: G */
    public final int mo3820G(SemanticsNode semanticsNode) {
        vt5 s = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        if (s.mo27319k(semanticsProperties.mo4024c()) || !semanticsNode.mo4013s().mo27319k(semanticsProperties.mo4043v())) {
            return this.f1954m;
        }
        return ao6.m10680g(((ao6) semanticsNode.mo4013s().mo27321q(semanticsProperties.mo4043v())).mo11071m());
    }

    /* renamed from: H */
    public final int mo3821H(SemanticsNode semanticsNode) {
        vt5 s = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        if (s.mo27319k(semanticsProperties.mo4024c()) || !semanticsNode.mo4013s().mo27319k(semanticsProperties.mo4043v())) {
            return this.f1954m;
        }
        return ao6.m10683j(((ao6) semanticsNode.mo4013s().mo27321q(semanticsProperties.mo4043v())).mo11071m());
    }

    /* renamed from: I */
    public final Map<Integer, bu5> mo3822I() {
        if (this.f1958q) {
            this.f1960s = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3028o(this.f1945d.getSemanticsOwner());
            this.f1958q = false;
        }
        return this.f1960s;
    }

    /* renamed from: J */
    public final String mo3823J(SemanticsNode semanticsNode) {
        C3205rl rlVar;
        if (semanticsNode == null) {
            return null;
        }
        vt5 s = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        if (s.mo27319k(semanticsProperties.mo4024c())) {
            return rm6.m26303d((List) semanticsNode.mo4013s().mo27321q(semanticsProperties.mo4024c()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3033t(semanticsNode)) {
            C3205rl L = mo3825L(semanticsNode.mo4013s());
            if (L != null) {
                return L.mo25431f();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties.mo4042u());
        if (list == null || (rlVar = (C3205rl) CollectionsKt___CollectionsKt.m47331b0(list)) == null) {
            return null;
        }
        return rlVar.mo25431f();
    }

    /* renamed from: K */
    public final C2345g8 mo3824K(SemanticsNode semanticsNode, int i) {
        boolean z;
        Boolean bool;
        if (semanticsNode == null) {
            return null;
        }
        String J = mo3823J(semanticsNode);
        if (J == null || J.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (i == 1) {
            C1669c8.C1670a aVar = C1669c8.f8363d;
            Locale locale = this.f1945d.getContext().getResources().getConfiguration().locale;
            vx2.m53590f(locale, "view.context.resources.configuration.locale");
            C1669c8 a = aVar.mo12017a(locale);
            a.mo11431e(J);
            return a;
        } else if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    C2267f8 a2 = C2267f8.f11559c.mo19715a();
                    a2.mo11431e(J);
                    return a2;
                } else if (i != 16) {
                    return null;
                }
            }
            vt5 s = semanticsNode.mo4013s();
            tt5 tt5 = tt5.f18260a;
            if (!s.mo27319k(tt5.mo26559g())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            rc2 rc2 = (rc2) ((C3574x7) semanticsNode.mo4013s().mo27321q(tt5.mo26559g())).mo27683a();
            if (rc2 != null) {
                bool = (Boolean) rc2.invoke(arrayList);
            } else {
                bool = null;
            }
            if (!vx2.m53586b(bool, Boolean.TRUE)) {
                return null;
            }
            xn6 xn6 = (xn6) arrayList.get(0);
            if (i == 4) {
                C2137d8 a3 = C2137d8.f10525d.mo18566a();
                a3.mo18565j(J, xn6);
                return a3;
            }
            C2213e8 a4 = C2213e8.f11083f.mo19207a();
            a4.mo19206j(J, xn6, semanticsNode);
            return a4;
        } else {
            C2454h8.C2455a aVar2 = C2454h8.f12763d;
            Locale locale2 = this.f1945d.getContext().getResources().getConfiguration().locale;
            vx2.m53590f(locale2, "view.context.resources.configuration.locale");
            C2454h8 a5 = aVar2.mo20985a(locale2);
            a5.mo11431e(J);
            return a5;
        }
    }

    /* renamed from: L */
    public final C3205rl mo3825L(vt5 vt5) {
        return (C3205rl) SemanticsConfigurationKt.m3168a(vt5, SemanticsProperties.f2125a.mo4026e());
    }

    /* renamed from: M */
    public final int mo3826M(float f, float f2) {
        LayoutNode f3;
        yt5 yt5 = null;
        mj4.m22324a(this.f1945d, false, 1, (Object) null);
        em2 em2 = new em2();
        LayoutNode.m2545f0(this.f1945d.getRoot(), wf4.m29550a(f, f2), em2, false, false, 12, (Object) null);
        yt5 yt52 = (yt5) CollectionsKt___CollectionsKt.m47342m0(em2);
        if (!(yt52 == null || (f3 = ob1.m23744f(yt52)) == null)) {
            yt5 = au5.m10806j(f3);
        }
        if (yt5 == null) {
            return Integer.MIN_VALUE;
        }
        SemanticsNode semanticsNode = new SemanticsNode(yt5, false, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
        NodeCoordinator c = semanticsNode.mo3998c();
        if (semanticsNode.mo4013s().mo27319k(SemanticsProperties.f2125a.mo4032k()) || c.mo3606d1()) {
            return Integer.MIN_VALUE;
        }
        LayoutNode f4 = ob1.m23744f(yt5);
        if (this.f1945d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(f4) == null) {
            return mo3838c0(f4.mo3434X());
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: N */
    public final boolean mo3827N() {
        if (this.f1948g || (this.f1947f.isEnabled() && this.f1947f.isTouchExplorationEnabled())) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final boolean mo3828O(int i) {
        if (this.f1951j == i) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo3829P(SemanticsNode semanticsNode) {
        vt5 s = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        if (s.mo27319k(semanticsProperties.mo4024c()) || !semanticsNode.mo4013s().mo27319k(semanticsProperties.mo4026e())) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final void mo3830Q(LayoutNode layoutNode) {
        if (this.f1956o.add(layoutNode)) {
            this.f1957p.mo52181o(r37.f33317a);
        }
    }

    /* renamed from: R */
    public final void mo3831R(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f1958q = true;
        if (mo3827N()) {
            mo3830Q(layoutNode);
        }
    }

    /* renamed from: S */
    public final void mo3832S() {
        this.f1958q = true;
        if (mo3827N() && !this.f1964w) {
            this.f1964w = true;
            this.f1949h.post(this.f1965x);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3833T(int r13, int r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.util.Map r0 = r12.mo3822I()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.get(r1)
            bu5 r0 = (p000.bu5) r0
            r1 = 0
            if (r0 == 0) goto L_0x0565
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.mo11886b()
            if (r0 != 0) goto L_0x0019
            goto L_0x0565
        L_0x0019:
            r2 = 64
            if (r14 == r2) goto L_0x0560
            r2 = 128(0x80, float:1.794E-43)
            if (r14 == r2) goto L_0x055b
            r2 = 256(0x100, float:3.59E-43)
            r3 = 1
            if (r14 == r2) goto L_0x0544
            r4 = 512(0x200, float:7.175E-43)
            if (r14 == r4) goto L_0x0544
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r14 == r2) goto L_0x051f
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r14 == r2) goto L_0x04f3
            boolean r2 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(r0)
            if (r2 != 0) goto L_0x0039
            return r1
        L_0x0039:
            if (r14 == r3) goto L_0x04ce
            r2 = 2
            r4 = 0
            if (r14 == r2) goto L_0x04ad
            switch(r14) {
                case 16: goto L_0x047a;
                case 32: goto L_0x0455;
                case 4096: goto L_0x02bf;
                case 8192: goto L_0x02bf;
                case 32768: goto L_0x029a;
                case 65536: goto L_0x0275;
                case 262144: goto L_0x0250;
                case 524288: goto L_0x022b;
                case 1048576: goto L_0x0206;
                case 2097152: goto L_0x01ca;
                case 16908342: goto L_0x00cd;
                case 16908349: goto L_0x0095;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r14) {
                case 16908344: goto L_0x02bf;
                case 16908345: goto L_0x02bf;
                case 16908346: goto L_0x02bf;
                case 16908347: goto L_0x02bf;
                default: goto L_0x0045;
            }
        L_0x0045:
            j66<j66<java.lang.CharSequence>> r15 = r12.f1952k
            java.lang.Object r13 = r15.mo21756i(r13)
            j66 r13 = (p000.j66) r13
            if (r13 == 0) goto L_0x0094
            java.lang.Object r13 = r13.mo21756i(r14)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            if (r13 != 0) goto L_0x0058
            goto L_0x0094
        L_0x0058:
            vt5 r14 = r0.mo4013s()
            tt5 r15 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo26555c()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r14, r15)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L_0x006b
            return r1
        L_0x006b:
            int r15 = r14.size()
            r0 = r1
        L_0x0070:
            if (r0 >= r15) goto L_0x0094
            java.lang.Object r2 = r14.get(r0)
            vx0 r2 = (p000.vx0) r2
            java.lang.String r3 = r2.mo27357b()
            boolean r3 = p000.vx2.m53586b(r3, r13)
            if (r3 == 0) goto L_0x0091
            pc2 r13 = r2.mo27356a()
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L_0x0091:
            int r0 = r0 + 1
            goto L_0x0070
        L_0x0094:
            return r1
        L_0x0095:
            if (r15 == 0) goto L_0x00cc
            java.lang.String r13 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r14 = r15.containsKey(r13)
            if (r14 != 0) goto L_0x00a0
            goto L_0x00cc
        L_0x00a0:
            vt5 r14 = r0.mo4013s()
            tt5 r0 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.mo26565m()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r14, r0)
            x7 r14 = (p000.C3574x7) r14
            if (r14 == 0) goto L_0x00cc
            nd2 r14 = r14.mo27683a()
            rc2 r14 = (p000.rc2) r14
            if (r14 == 0) goto L_0x00cc
            float r13 = r15.getFloat(r13)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r14.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00cc:
            return r1
        L_0x00cd:
            androidx.compose.ui.semantics.SemanticsNode r13 = r0.mo4007m()
            if (r13 == 0) goto L_0x00e6
            vt5 r14 = r13.mo4002h()
            if (r14 == 0) goto L_0x00e6
            tt5 r15 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo26564l()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r14, r15)
            x7 r14 = (p000.C3574x7) r14
            goto L_0x00e7
        L_0x00e6:
            r14 = r4
        L_0x00e7:
            if (r13 == 0) goto L_0x0105
            if (r14 == 0) goto L_0x00ec
            goto L_0x0105
        L_0x00ec:
            androidx.compose.ui.semantics.SemanticsNode r13 = r13.mo4007m()
            if (r13 == 0) goto L_0x00e6
            vt5 r14 = r13.mo4002h()
            if (r14 == 0) goto L_0x00e6
            tt5 r15 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo26564l()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r14, r15)
            x7 r14 = (p000.C3574x7) r14
            goto L_0x00e7
        L_0x0105:
            if (r13 != 0) goto L_0x0108
            return r1
        L_0x0108:
            qe3 r15 = r13.mo4004j()
            me3 r15 = r15.mo3445c()
            a95 r15 = p000.ne3.m23128a(r15)
            qe3 r2 = r13.mo4004j()
            me3 r2 = r2.mo3445c()
            me3 r2 = r2.mo3636x()
            if (r2 == 0) goto L_0x0127
            long r4 = p000.ne3.m23131d(r2)
            goto L_0x012d
        L_0x0127:
            tf4$a r2 = p000.tf4.f18145b
            long r4 = r2.mo26446c()
        L_0x012d:
            a95 r15 = r15.mo125l(r4)
            long r4 = r0.mo4008n()
            long r6 = r0.mo4011q()
            long r6 = p000.tw2.m27949b(r6)
            a95 r2 = p000.d95.m14868a(r4, r6)
            vt5 r4 = r13.mo4013s()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r5.mo4030i()
            java.lang.Object r4 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r4, r6)
            rn5 r4 = (p000.rn5) r4
            vt5 r13 = r13.mo4013s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.mo4045x()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r5)
            rn5 r13 = (p000.rn5) r13
            float r5 = r2.mo118f()
            float r6 = r15.mo118f()
            float r5 = r5 - r6
            float r6 = r2.mo119g()
            float r7 = r15.mo119g()
            float r6 = r6 - r7
            float r5 = m2945V(r5, r6)
            if (r4 == 0) goto L_0x017f
            boolean r4 = r4.mo25463b()
            if (r4 != r3) goto L_0x017f
            r4 = r3
            goto L_0x0180
        L_0x017f:
            r4 = r1
        L_0x0180:
            if (r4 == 0) goto L_0x0183
            float r5 = -r5
        L_0x0183:
            boolean r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3032s(r0)
            if (r0 == 0) goto L_0x018a
            float r5 = -r5
        L_0x018a:
            float r0 = r2.mo122i()
            float r4 = r15.mo122i()
            float r0 = r0 - r4
            float r2 = r2.mo114c()
            float r15 = r15.mo114c()
            float r2 = r2 - r15
            float r15 = m2945V(r0, r2)
            if (r13 == 0) goto L_0x01a9
            boolean r13 = r13.mo25463b()
            if (r13 != r3) goto L_0x01a9
            goto L_0x01aa
        L_0x01a9:
            r3 = r1
        L_0x01aa:
            if (r3 == 0) goto L_0x01ad
            float r15 = -r15
        L_0x01ad:
            if (r14 == 0) goto L_0x01c9
            nd2 r13 = r14.mo27683a()
            fd2 r13 = (p000.fd2) r13
            if (r13 == 0) goto L_0x01c9
            java.lang.Float r14 = java.lang.Float.valueOf(r5)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x01c9:
            return r1
        L_0x01ca:
            if (r15 == 0) goto L_0x01d2
            java.lang.String r13 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r4 = r15.getString(r13)
        L_0x01d2:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26567o()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x0205
            nd2 r13 = r13.mo27683a()
            rc2 r13 = (p000.rc2) r13
            if (r13 == 0) goto L_0x0205
            rl r14 = new rl
            if (r4 != 0) goto L_0x01f2
            java.lang.String r4 = ""
        L_0x01f2:
            r6 = r4
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = r13.invoke(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0205:
            return r1
        L_0x0206:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26557e()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x022a
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x022a
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x022a:
            return r1
        L_0x022b:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26553a()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x024f
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x024f
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x024f:
            return r1
        L_0x0250:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26558f()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x0274
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x0274
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0274:
            return r1
        L_0x0275:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26556d()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x0299
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x0299
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0299:
            return r1
        L_0x029a:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26562j()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x02be
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x02be
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02be:
            return r1
        L_0x02bf:
            r13 = 4096(0x1000, float:5.74E-42)
            if (r14 != r13) goto L_0x02c5
            r13 = r3
            goto L_0x02c6
        L_0x02c5:
            r13 = r1
        L_0x02c6:
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r14 != r15) goto L_0x02cc
            r15 = r3
            goto L_0x02cd
        L_0x02cc:
            r15 = r1
        L_0x02cd:
            r2 = 16908345(0x1020039, float:2.387739E-38)
            if (r14 != r2) goto L_0x02d4
            r2 = r3
            goto L_0x02d5
        L_0x02d4:
            r2 = r1
        L_0x02d5:
            r4 = 16908347(0x102003b, float:2.3877394E-38)
            if (r14 != r4) goto L_0x02dc
            r4 = r3
            goto L_0x02dd
        L_0x02dc:
            r4 = r1
        L_0x02dd:
            r5 = 16908344(0x1020038, float:2.3877386E-38)
            if (r14 != r5) goto L_0x02e4
            r5 = r3
            goto L_0x02e5
        L_0x02e4:
            r5 = r1
        L_0x02e5:
            r6 = 16908346(0x102003a, float:2.3877392E-38)
            if (r14 != r6) goto L_0x02ec
            r14 = r3
            goto L_0x02ed
        L_0x02ec:
            r14 = r1
        L_0x02ed:
            if (r2 != 0) goto L_0x02f8
            if (r4 != 0) goto L_0x02f8
            if (r13 != 0) goto L_0x02f8
            if (r15 == 0) goto L_0x02f6
            goto L_0x02f8
        L_0x02f6:
            r6 = r1
            goto L_0x02f9
        L_0x02f8:
            r6 = r3
        L_0x02f9:
            if (r5 != 0) goto L_0x0304
            if (r14 != 0) goto L_0x0304
            if (r13 != 0) goto L_0x0304
            if (r15 == 0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            r14 = r1
            goto L_0x0305
        L_0x0304:
            r14 = r3
        L_0x0305:
            if (r13 != 0) goto L_0x0309
            if (r15 == 0) goto L_0x039e
        L_0x0309:
            vt5 r13 = r0.mo4013s()
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.mo4036o()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r7)
            mw4 r13 = (p000.mw4) r13
            vt5 r7 = r0.mo4013s()
            tt5 r8 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r8 = r8.mo26565m()
            java.lang.Object r7 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r7, r8)
            x7 r7 = (p000.C3574x7) r7
            if (r13 == 0) goto L_0x039e
            if (r7 == 0) goto L_0x039e
            uh0 r14 = r13.mo23413c()
            java.lang.Comparable r14 = r14.mo47513k()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            uh0 r0 = r13.mo23413c()
            java.lang.Comparable r0 = r0.mo47512e()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r14 = p000.d75.m43381c(r14, r0)
            uh0 r0 = r13.mo23413c()
            java.lang.Comparable r0 = r0.mo47512e()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            uh0 r2 = r13.mo23413c()
            java.lang.Comparable r2 = r2.mo47513k()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r0 = p000.d75.m43384f(r0, r2)
            int r2 = r13.mo23414d()
            if (r2 <= 0) goto L_0x037a
            float r14 = r14 - r0
            int r0 = r13.mo23414d()
            int r0 = r0 + r3
            goto L_0x037d
        L_0x037a:
            float r14 = r14 - r0
            r0 = 20
        L_0x037d:
            float r0 = (float) r0
            float r14 = r14 / r0
            if (r15 == 0) goto L_0x0382
            float r14 = -r14
        L_0x0382:
            nd2 r15 = r7.mo27683a()
            rc2 r15 = (p000.rc2) r15
            if (r15 == 0) goto L_0x039d
            float r13 = r13.mo23412b()
            float r13 = r13 + r14
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r15.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x039d:
            return r1
        L_0x039e:
            qe3 r13 = r0.mo4004j()
            me3 r13 = r13.mo3445c()
            a95 r13 = p000.ne3.m23128a(r13)
            long r7 = r13.mo120h()
            vt5 r13 = r0.mo4013s()
            tt5 r3 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.mo26564l()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r3)
            x7 r13 = (p000.C3574x7) r13
            if (r13 != 0) goto L_0x03c1
            return r1
        L_0x03c1:
            vt5 r3 = r0.mo4013s()
            androidx.compose.ui.semantics.SemanticsProperties r9 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r10 = r9.mo4030i()
            java.lang.Object r3 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r3, r10)
            rn5 r3 = (p000.rn5) r3
            r10 = 0
            if (r3 == 0) goto L_0x0412
            if (r6 == 0) goto L_0x0412
            float r6 = p000.t36.m27272f(r7)
            if (r2 != 0) goto L_0x03de
            if (r15 == 0) goto L_0x03df
        L_0x03de:
            float r6 = -r6
        L_0x03df:
            boolean r11 = r3.mo25463b()
            if (r11 == 0) goto L_0x03e6
            float r6 = -r6
        L_0x03e6:
            boolean r11 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3032s(r0)
            if (r11 == 0) goto L_0x03f1
            if (r2 != 0) goto L_0x03f0
            if (r4 == 0) goto L_0x03f1
        L_0x03f0:
            float r6 = -r6
        L_0x03f1:
            boolean r2 = m2944U(r3, r6)
            if (r2 == 0) goto L_0x0412
            nd2 r13 = r13.mo27683a()
            fd2 r13 = (p000.fd2) r13
            if (r13 == 0) goto L_0x0411
            java.lang.Float r14 = java.lang.Float.valueOf(r6)
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0411:
            return r1
        L_0x0412:
            vt5 r0 = r0.mo4013s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r9.mo4045x()
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r0, r2)
            rn5 r0 = (p000.rn5) r0
            if (r0 == 0) goto L_0x0454
            if (r14 == 0) goto L_0x0454
            float r14 = p000.t36.m27271e(r7)
            if (r5 != 0) goto L_0x042c
            if (r15 == 0) goto L_0x042d
        L_0x042c:
            float r14 = -r14
        L_0x042d:
            boolean r15 = r0.mo25463b()
            if (r15 == 0) goto L_0x0434
            float r14 = -r14
        L_0x0434:
            boolean r15 = m2944U(r0, r14)
            if (r15 == 0) goto L_0x0454
            nd2 r13 = r13.mo27683a()
            fd2 r13 = (p000.fd2) r13
            if (r13 == 0) goto L_0x0454
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Object r13 = r13.invoke(r15, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0454:
            return r1
        L_0x0455:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26561i()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x0479
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x0479
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0479:
            return r1
        L_0x047a:
            vt5 r14 = r0.mo4013s()
            tt5 r15 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo26560h()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r14, r15)
            x7 r14 = (p000.C3574x7) r14
            if (r14 == 0) goto L_0x049b
            nd2 r14 = r14.mo27683a()
            pc2 r14 = (p000.pc2) r14
            if (r14 == 0) goto L_0x049b
            java.lang.Object r14 = r14.invoke()
            r4 = r14
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x049b:
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r12
            r6 = r13
            m2949f0(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x04ac
            boolean r1 = r4.booleanValue()
        L_0x04ac:
            return r1
        L_0x04ad:
            vt5 r13 = r0.mo4013s()
            androidx.compose.ui.semantics.SemanticsProperties r14 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo4028g()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r13 = p000.vx2.m53586b(r13, r14)
            if (r13 == 0) goto L_0x04cd
            androidx.compose.ui.platform.AndroidComposeView r13 = r12.f1945d
            m62 r13 = r13.getFocusManager()
            p000.l62.m21295a(r13, r1, r3, r4)
            r1 = r3
        L_0x04cd:
            return r1
        L_0x04ce:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26563k()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x04f2
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x04f2
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04f2:
            return r1
        L_0x04f3:
            r13 = -1
            if (r15 == 0) goto L_0x04fd
            java.lang.String r14 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r14 = r15.getInt(r14, r13)
            goto L_0x04fe
        L_0x04fd:
            r14 = r13
        L_0x04fe:
            if (r15 == 0) goto L_0x0506
            java.lang.String r2 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r13 = r15.getInt(r2, r13)
        L_0x0506:
            boolean r13 = r12.mo3847m0(r0, r14, r13, r1)
            if (r13 == 0) goto L_0x051e
            int r14 = r0.mo4003i()
            int r1 = r12.mo3838c0(r14)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r12
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
        L_0x051e:
            return r13
        L_0x051f:
            vt5 r13 = r0.mo4013s()
            tt5 r14 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo26554b()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r13, r14)
            x7 r13 = (p000.C3574x7) r13
            if (r13 == 0) goto L_0x0543
            nd2 r13 = r13.mo27683a()
            pc2 r13 = (p000.pc2) r13
            if (r13 == 0) goto L_0x0543
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0543:
            return r1
        L_0x0544:
            if (r15 == 0) goto L_0x055a
            java.lang.String r13 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r13 = r15.getInt(r13)
            java.lang.String r4 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r15 = r15.getBoolean(r4)
            if (r14 != r2) goto L_0x0555
            r1 = r3
        L_0x0555:
            boolean r13 = r12.mo3850p0(r0, r13, r1, r15)
            return r13
        L_0x055a:
            return r1
        L_0x055b:
            boolean r13 = r12.mo3815B(r13)
            return r13
        L_0x0560:
            boolean r13 = r12.mo3836a0(r13)
            return r13
        L_0x0565:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo3833T(int, int, android.os.Bundle):boolean");
    }

    /* renamed from: W */
    public final void mo3834W(int i, C3335t8 t8Var, SemanticsNode semanticsNode) {
        NodeCoordinator nodeCoordinator;
        C3335t8.C3336a aVar;
        C3335t8.C3336a aVar2;
        float f;
        boolean z;
        String str;
        String str2;
        int i2 = i;
        C3335t8 t8Var2 = t8Var;
        SemanticsNode semanticsNode2 = semanticsNode;
        vx2.m53591g(t8Var2, "info");
        vx2.m53591g(semanticsNode2, "semanticsNode");
        boolean z2 = !semanticsNode.mo4014t() && semanticsNode.mo4009o().isEmpty() && AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3027n(semanticsNode.mo4005k(), C0408x54deba10.INSTANCE) == null;
        t8Var2.mo26239f0("android.view.View");
        vt5 s = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        hh5 hh5 = (hh5) SemanticsConfigurationKt.m3168a(s, semanticsProperties.mo4037p());
        String str3 = null;
        if (hh5 != null) {
            int m = hh5.mo21185m();
            if (semanticsNode.mo4014t() || semanticsNode.mo4009o().isEmpty()) {
                hh5.C2473a aVar3 = hh5.f12885b;
                if (hh5.m18896j(hh5.mo21185m(), aVar3.mo21192f())) {
                    t8Var2.mo26195E0(this.f1945d.getContext().getResources().getString(s45.tab));
                } else {
                    if (hh5.m18896j(m, aVar3.mo21187a())) {
                        str2 = "android.widget.Button";
                    } else if (hh5.m18896j(m, aVar3.mo21188b())) {
                        str2 = "android.widget.CheckBox";
                    } else if (hh5.m18896j(m, aVar3.mo21191e())) {
                        str2 = "android.widget.Switch";
                    } else if (hh5.m18896j(m, aVar3.mo21190d())) {
                        str2 = "android.widget.RadioButton";
                    } else {
                        str2 = hh5.m18896j(m, aVar3.mo21189c()) ? "android.widget.ImageView" : null;
                    }
                    if (!hh5.m18896j(hh5.mo21185m(), aVar3.mo21189c()) || z2 || semanticsNode.mo4013s().mo27326u()) {
                        t8Var2.mo26239f0(str2);
                    }
                }
            }
            r37 r37 = r37.f33317a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3033t(semanticsNode)) {
            t8Var2.mo26239f0("android.widget.EditText");
        }
        if (semanticsNode.mo4002h().mo27319k(semanticsProperties.mo4042u())) {
            t8Var2.mo26239f0("android.widget.TextView");
        }
        t8Var2.mo26277y0(this.f1945d.getContext().getPackageName());
        t8Var2.mo26266t0(true);
        List<SemanticsNode> p = semanticsNode.mo4010p();
        int size = p.size();
        for (int i3 = 0; i3 < size; i3++) {
            SemanticsNode semanticsNode3 = p.get(i3);
            if (mo3822I().containsKey(Integer.valueOf(semanticsNode3.mo4003i()))) {
                AndroidViewHolder androidViewHolder = this.f1945d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode3.mo4005k());
                if (androidViewHolder != null) {
                    t8Var2.mo26231c(androidViewHolder);
                } else {
                    t8Var2.mo26233d(this.f1945d, semanticsNode3.mo4003i());
                }
            }
        }
        if (this.f1951j == i2) {
            t8Var2.mo26225Y(true);
            t8Var2.mo26229b(C3335t8.C3336a.f18011l);
        } else {
            t8Var2.mo26225Y(false);
            t8Var2.mo26229b(C3335t8.C3336a.f18010k);
        }
        mo3849o0(semanticsNode2, t8Var2);
        mo3848n0(semanticsNode2, t8Var2);
        vt5 s2 = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.f2125a;
        t8Var2.mo26209L0((CharSequence) SemanticsConfigurationKt.m3168a(s2, semanticsProperties2.mo4040s()));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties2.mo4044w());
        int i4 = 2;
        if (toggleableState != null) {
            t8Var2.mo26234d0(true);
            int i5 = C0406h.f1980a[toggleableState.ordinal()];
            if (i5 == 1) {
                t8Var2.mo26236e0(true);
                if ((hh5 == null ? false : hh5.m18896j(hh5.mo21185m(), hh5.f12885b.mo21191e())) && t8Var.mo26276y() == null) {
                    t8Var2.mo26209L0(this.f1945d.getContext().getResources().getString(s45.f17470on));
                }
            } else if (i5 == 2) {
                t8Var2.mo26236e0(false);
                if ((hh5 == null ? false : hh5.m18896j(hh5.mo21185m(), hh5.f12885b.mo21191e())) && t8Var.mo26276y() == null) {
                    t8Var2.mo26209L0(this.f1945d.getContext().getResources().getString(s45.off));
                }
            } else if (i5 == 3 && t8Var.mo26276y() == null) {
                t8Var2.mo26209L0(this.f1945d.getContext().getResources().getString(s45.indeterminate));
            }
            r37 r372 = r37.f33317a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties2.mo4039r());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (hh5 == null ? false : hh5.m18896j(hh5.mo21185m(), hh5.f12885b.mo21192f())) {
                t8Var2.mo26201H0(booleanValue);
            } else {
                t8Var2.mo26234d0(true);
                t8Var2.mo26236e0(booleanValue);
                if (t8Var.mo26276y() == null) {
                    if (booleanValue) {
                        str = this.f1945d.getContext().getResources().getString(s45.selected);
                    } else {
                        str = this.f1945d.getContext().getResources().getString(s45.not_selected);
                    }
                    t8Var2.mo26209L0(str);
                }
            }
            r37 r373 = r37.f33317a;
        }
        if (!semanticsNode.mo4013s().mo27326u() || semanticsNode.mo4009o().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties2.mo4024c());
            t8Var2.mo26247j0(list != null ? (String) CollectionsKt___CollectionsKt.m47331b0(list) : null);
        }
        String str4 = (String) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties2.mo4041t());
        if (str4 != null) {
            SemanticsNode semanticsNode4 = semanticsNode2;
            while (true) {
                if (semanticsNode4 == null) {
                    z = false;
                    break;
                }
                vt5 s3 = semanticsNode4.mo4013s();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.f2151a;
                if (s3.mo27319k(semanticsPropertiesAndroid.mo4054a())) {
                    z = ((Boolean) semanticsNode4.mo4013s().mo27321q(semanticsPropertiesAndroid.mo4054a())).booleanValue();
                    break;
                }
                semanticsNode4 = semanticsNode4.mo4007m();
            }
            if (z) {
                t8Var2.mo26217P0(str4);
            }
        }
        vt5 s4 = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f2125a;
        if (((r37) SemanticsConfigurationKt.m3168a(s4, semanticsProperties3.mo4029h())) != null) {
            t8Var2.mo26262r0(true);
            r37 r374 = r37.f33317a;
        }
        t8Var2.mo26191C0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3031r(semanticsNode));
        t8Var2.mo26253m0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3033t(semanticsNode));
        t8Var2.mo26255n0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode));
        t8Var2.mo26259p0(semanticsNode.mo4013s().mo27319k(semanticsProperties3.mo4028g()));
        if (t8Var.mo26204J()) {
            t8Var2.mo26260q0(((Boolean) semanticsNode.mo4013s().mo27321q(semanticsProperties3.mo4028g())).booleanValue());
            if (t8Var.mo26206K()) {
                t8Var2.mo26227a(2);
            } else {
                t8Var2.mo26227a(1);
            }
        }
        if (semanticsNode.mo4014t()) {
            SemanticsNode m2 = semanticsNode.mo4007m();
            nodeCoordinator = m2 != null ? m2.mo3998c() : null;
        } else {
            nodeCoordinator = semanticsNode.mo3998c();
        }
        t8Var2.mo26219Q0(!(nodeCoordinator != null ? nodeCoordinator.mo3606d1() : false) && SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4032k()) == null);
        ri3 ri3 = (ri3) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4033l());
        if (ri3 != null) {
            int h = ri3.mo25387h();
            ri3.C3194a aVar4 = ri3.f17249b;
            if (ri3.m26208e(h, aVar4.mo25391b()) || !ri3.m26208e(h, aVar4.mo25390a())) {
                i4 = 1;
            }
            t8Var2.mo26269u0(i4);
            r37 r375 = r37.f33317a;
        }
        t8Var2.mo26241g0(false);
        vt5 s5 = semanticsNode.mo4013s();
        tt5 tt5 = tt5.f18260a;
        C3574x7 x7Var = (C3574x7) SemanticsConfigurationKt.m3168a(s5, tt5.mo26560h());
        if (x7Var != null) {
            boolean b = vx2.m53586b(SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4039r()), Boolean.TRUE);
            t8Var2.mo26241g0(!b);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode) && !b) {
                t8Var2.mo26229b(new C3335t8.C3336a(16, x7Var.mo27684b()));
            }
            r37 r376 = r37.f33317a;
        }
        t8Var2.mo26271v0(false);
        C3574x7 x7Var2 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26561i());
        if (x7Var2 != null) {
            t8Var2.mo26271v0(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode)) {
                t8Var2.mo26229b(new C3335t8.C3336a(32, x7Var2.mo27684b()));
            }
            r37 r377 = r37.f33317a;
        }
        C3574x7 x7Var3 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26554b());
        if (x7Var3 != null) {
            t8Var2.mo26229b(new C3335t8.C3336a(Http2.INITIAL_MAX_FRAME_SIZE, x7Var3.mo27684b()));
            r37 r378 = r37.f33317a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode)) {
            C3574x7 x7Var4 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26567o());
            if (x7Var4 != null) {
                t8Var2.mo26229b(new C3335t8.C3336a(2097152, x7Var4.mo27684b()));
                r37 r379 = r37.f33317a;
            }
            C3574x7 x7Var5 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26556d());
            if (x7Var5 != null) {
                t8Var2.mo26229b(new C3335t8.C3336a(65536, x7Var5.mo27684b()));
                r37 r3710 = r37.f33317a;
            }
            C3574x7 x7Var6 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26562j());
            if (x7Var6 != null) {
                if (t8Var.mo26206K() && this.f1945d.getClipboardManager().mo22762a()) {
                    t8Var2.mo26229b(new C3335t8.C3336a(32768, x7Var6.mo27684b()));
                }
                r37 r3711 = r37.f33317a;
            }
        }
        String J = mo3823J(semanticsNode2);
        if (!(J == null || J.length() == 0)) {
            t8Var2.mo26213N0(mo3821H(semanticsNode2), mo3820G(semanticsNode2));
            C3574x7 x7Var7 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26566n());
            if (x7Var7 != null) {
                str3 = x7Var7.mo27684b();
            }
            t8Var2.mo26229b(new C3335t8.C3336a(131072, str3));
            t8Var2.mo26227a(256);
            t8Var2.mo26227a(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
            t8Var2.mo26275x0(11);
            List list2 = (List) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4024c());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.mo4013s().mo27319k(tt5.mo26559g()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3025l(semanticsNode)) {
                t8Var2.mo26275x0(t8Var.mo26268u() | 4 | 16);
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence z3 = t8Var.mo26278z();
            if (!(z3 == null || z3.length() == 0) && semanticsNode.mo4013s().mo27319k(tt5.mo26559g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.mo4013s().mo27319k(semanticsProperties3.mo4041t())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                C3472v8 v8Var = C3472v8.f18711a;
                AccessibilityNodeInfo R0 = t8Var.mo26220R0();
                vx2.m53590f(R0, "info.unwrap()");
                v8Var.mo27081a(R0, arrayList);
            }
        }
        mw4 mw4 = (mw4) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4036o());
        if (mw4 != null) {
            if (semanticsNode.mo4013s().mo27319k(tt5.mo26565m())) {
                t8Var2.mo26239f0("android.widget.SeekBar");
            } else {
                t8Var2.mo26239f0("android.widget.ProgressBar");
            }
            if (mw4 != mw4.f15263d.mo23418a()) {
                t8Var2.mo26193D0(C3335t8.C3339d.m27597a(1, mw4.mo23413c().mo47512e().floatValue(), mw4.mo23413c().mo47513k().floatValue(), mw4.mo23412b()));
                if (t8Var.mo26276y() == null) {
                    uh0<Float> c = mw4.mo23413c();
                    if (c.mo47513k().floatValue() - c.mo47512e().floatValue() == Utils.FLOAT_EPSILON) {
                        f = 0.0f;
                    } else {
                        f = (mw4.mo23412b() - c.mo47512e().floatValue()) / (c.mo47513k().floatValue() - c.mo47512e().floatValue());
                    }
                    float j = d75.m43388j(f, Utils.FLOAT_EPSILON, 1.0f);
                    int i7 = 100;
                    if (j == Utils.FLOAT_EPSILON) {
                        i7 = 0;
                    } else {
                        if (!(j == 1.0f)) {
                            i7 = d75.m43389k(ap3.m31899b(j * ((float) 100)), 1, 99);
                        }
                    }
                    t8Var2.mo26209L0(this.f1945d.getContext().getResources().getString(s45.template_percent, new Object[]{Integer.valueOf(i7)}));
                }
            } else if (t8Var.mo26276y() == null) {
                t8Var2.mo26209L0(this.f1945d.getContext().getResources().getString(s45.in_progress));
            }
            if (semanticsNode.mo4013s().mo27319k(tt5.mo26565m()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode)) {
                if (mw4.mo23412b() < d75.m43381c(mw4.mo23413c().mo47513k().floatValue(), mw4.mo23413c().mo47512e().floatValue())) {
                    t8Var2.mo26229b(C3335t8.C3336a.f18016q);
                }
                if (mw4.mo23412b() > d75.m43384f(mw4.mo23413c().mo47512e().floatValue(), mw4.mo23413c().mo47513k().floatValue())) {
                    t8Var2.mo26229b(C3335t8.C3336a.f18017r);
                }
            }
        }
        if (i6 >= 24) {
            C0400b.m3003a(t8Var, semanticsNode);
        }
        CollectionInfoKt.m3155d(semanticsNode2, t8Var2);
        CollectionInfoKt.m3156e(semanticsNode2, t8Var2);
        rn5 rn5 = (rn5) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4030i());
        C3574x7 x7Var8 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26564l());
        if (!(rn5 == null || x7Var8 == null)) {
            if (!CollectionInfoKt.m3153b(semanticsNode)) {
                t8Var2.mo26239f0("android.widget.HorizontalScrollView");
            }
            if (rn5.mo25462a().invoke().floatValue() > Utils.FLOAT_EPSILON) {
                t8Var2.mo26199G0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode)) {
                if (m2947Y(rn5)) {
                    t8Var2.mo26229b(C3335t8.C3336a.f18016q);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3032s(semanticsNode)) {
                        aVar2 = C3335t8.C3336a.f17988F;
                    } else {
                        aVar2 = C3335t8.C3336a.f17986D;
                    }
                    t8Var2.mo26229b(aVar2);
                }
                if (m2946X(rn5)) {
                    t8Var2.mo26229b(C3335t8.C3336a.f18017r);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3032s(semanticsNode)) {
                        aVar = C3335t8.C3336a.f17986D;
                    } else {
                        aVar = C3335t8.C3336a.f17988F;
                    }
                    t8Var2.mo26229b(aVar);
                }
            }
        }
        rn5 rn52 = (rn5) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4045x());
        if (!(rn52 == null || x7Var8 == null)) {
            if (!CollectionInfoKt.m3153b(semanticsNode)) {
                t8Var2.mo26239f0("android.widget.ScrollView");
            }
            if (rn52.mo25462a().invoke().floatValue() > Utils.FLOAT_EPSILON) {
                t8Var2.mo26199G0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode)) {
                if (m2947Y(rn52)) {
                    t8Var2.mo26229b(C3335t8.C3336a.f18016q);
                    t8Var2.mo26229b(C3335t8.C3336a.f17987E);
                }
                if (m2946X(rn52)) {
                    t8Var2.mo26229b(C3335t8.C3336a.f18017r);
                    t8Var2.mo26229b(C3335t8.C3336a.f17985C);
                }
            }
        }
        t8Var2.mo26279z0((CharSequence) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties3.mo4034m()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode)) {
            C3574x7 x7Var9 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26558f());
            if (x7Var9 != null) {
                t8Var2.mo26229b(new C3335t8.C3336a(262144, x7Var9.mo27684b()));
                r37 r3712 = r37.f33317a;
            }
            C3574x7 x7Var10 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26553a());
            if (x7Var10 != null) {
                t8Var2.mo26229b(new C3335t8.C3336a(524288, x7Var10.mo27684b()));
                r37 r3713 = r37.f33317a;
            }
            C3574x7 x7Var11 = (C3574x7) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), tt5.mo26557e());
            if (x7Var11 != null) {
                t8Var2.mo26229b(new C3335t8.C3336a(1048576, x7Var11.mo27684b()));
                r37 r3714 = r37.f33317a;
            }
            if (semanticsNode.mo4013s().mo27319k(tt5.mo26555c())) {
                List list3 = (List) semanticsNode.mo4013s().mo27321q(tt5.mo26555c());
                int size2 = list3.size();
                int[] iArr = f1944B;
                if (size2 < iArr.length) {
                    j66 j66 = new j66();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f1953l.mo21753f(i2)) {
                        Map i8 = this.f1953l.mo21756i(i2);
                        List<Integer> x0 = ArraysKt___ArraysKt.m47298x0(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list3.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            vx0 vx0 = (vx0) list3.get(i9);
                            vx2.m53588d(i8);
                            if (i8.containsKey(vx0.mo27357b())) {
                                Integer num = (Integer) i8.get(vx0.mo27357b());
                                vx2.m53588d(num);
                                j66.mo21762r(num.intValue(), vx0.mo27357b());
                                linkedHashMap.put(vx0.mo27357b(), num);
                                x0.remove(num);
                                t8Var2.mo26229b(new C3335t8.C3336a(num.intValue(), vx0.mo27357b()));
                            } else {
                                arrayList2.add(vx0);
                            }
                            i9++;
                            SemanticsNode semanticsNode5 = semanticsNode;
                        }
                        int size4 = arrayList2.size();
                        for (int i10 = 0; i10 < size4; i10++) {
                            vx0 vx02 = (vx0) arrayList2.get(i10);
                            int intValue = x0.get(i10).intValue();
                            j66.mo21762r(intValue, vx02.mo27357b());
                            linkedHashMap.put(vx02.mo27357b(), Integer.valueOf(intValue));
                            t8Var2.mo26229b(new C3335t8.C3336a(intValue, vx02.mo27357b()));
                        }
                    } else {
                        int size5 = list3.size();
                        for (int i11 = 0; i11 < size5; i11++) {
                            vx0 vx03 = (vx0) list3.get(i11);
                            int i12 = f1944B[i11];
                            j66.mo21762r(i12, vx03.mo27357b());
                            linkedHashMap.put(vx03.mo27357b(), Integer.valueOf(i12));
                            t8Var2.mo26229b(new C3335t8.C3336a(i12, vx03.mo27357b()));
                        }
                    }
                    this.f1952k.mo21762r(i2, j66);
                    this.f1953l.mo21762r(i2, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        t8Var2.mo26197F0(semanticsNode.mo4013s().mo27326u() || (z2 && (t8Var.mo26261r() != null || t8Var.mo26278z() != null || t8Var.mo26265t() != null || t8Var.mo26276y() != null || t8Var.mo26196F())));
    }

    /* renamed from: Z */
    public final boolean mo3835Z(int i, List<sn5> list) {
        boolean z;
        sn5 m = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3026m(list, i);
        if (m != null) {
            z = false;
        } else {
            int i2 = i;
            z = true;
            m = new sn5(i2, this.f1966y, (Float) null, (Float) null, (rn5) null, (rn5) null);
        }
        this.f1966y.add(m);
        return z;
    }

    /* renamed from: a0 */
    public final boolean mo3836a0(int i) {
        if (!mo3827N() || mo3828O(i)) {
            return false;
        }
        int i2 = this.f1951j;
        if (i2 != Integer.MIN_VALUE) {
            m2949f0(this, i2, 65536, (Integer) null, (List) null, 12, (Object) null);
        }
        this.f1951j = i;
        this.f1945d.invalidate();
        m2949f0(this, i, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* renamed from: b */
    public C3523w8 mo3837b(View view) {
        vx2.m53591g(view, "host");
        return this.f1950i;
    }

    /* renamed from: c0 */
    public final int mo3838c0(int i) {
        if (i == this.f1945d.getSemanticsOwner().mo18291a().mo4003i()) {
            return -1;
        }
        return i;
    }

    /* renamed from: d0 */
    public final boolean mo3839d0(AccessibilityEvent accessibilityEvent) {
        if (!mo3827N()) {
            return false;
        }
        return this.f1945d.getParent().requestSendAccessibilityEvent(this.f1945d, accessibilityEvent);
    }

    /* renamed from: e0 */
    public final boolean mo3840e0(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !mo3827N()) {
            return false;
        }
        AccessibilityEvent C = mo3816C(i, i2);
        if (num != null) {
            C.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            C.setContentDescription(rm6.m26303d(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null));
        }
        return mo3839d0(C);
    }

    /* renamed from: g0 */
    public final void mo3841g0(int i, int i2, String str) {
        AccessibilityEvent C = mo3816C(mo3838c0(i), 32);
        C.setContentChangeTypes(i2);
        if (str != null) {
            C.getText().add(str);
        }
        mo3839d0(C);
    }

    /* renamed from: h0 */
    public final void mo3842h0(int i) {
        C0404f fVar = this.f1959r;
        if (fVar != null) {
            if (i == fVar.mo3866d().mo4003i()) {
                if (SystemClock.uptimeMillis() - fVar.mo3868f() <= 1000) {
                    AccessibilityEvent C = mo3816C(mo3838c0(fVar.mo3866d().mo4003i()), 131072);
                    C.setFromIndex(fVar.mo3864b());
                    C.setToIndex(fVar.mo3867e());
                    C.setAction(fVar.mo3863a());
                    C.setMovementGranularity(fVar.mo3865c());
                    C.getText().add(mo3823J(fVar.mo3866d()));
                    mo3839d0(C);
                }
            } else {
                return;
            }
        }
        this.f1959r = null;
    }

    /* renamed from: i0 */
    public final void mo3843i0(sn5 sn5) {
        if (sn5.isValid()) {
            this.f1945d.getSnapshotObserver().mo3657h(sn5, this.f1967z, new C0409x595e4e0d(sn5, this));
        }
    }

    /* JADX WARNING: type inference failed for: r1v29, types: [rl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3844j0(java.util.Map<java.lang.Integer, p000.bu5> r29) {
        /*
            r28 = this;
            r7 = r28
            r8 = r29
            java.lang.String r0 = "newSemanticsNodes"
            p000.vx2.m53591g(r8, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List<sn5> r0 = r7.f1966y
            r9.<init>(r0)
            java.util.List<sn5> r0 = r7.f1966y
            r0.clear()
            java.util.Set r0 = r29.keySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x001d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04bc
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r0 = r7.f1962u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.get(r1)
            r12 = r0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r12 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C0405g) r12
            if (r12 != 0) goto L_0x003d
            goto L_0x001d
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r8.get(r0)
            bu5 r0 = (p000.bu5) r0
            if (r0 == 0) goto L_0x004f
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.mo11886b()
            r14 = r0
            goto L_0x0050
        L_0x004f:
            r14 = 0
        L_0x0050:
            p000.vx2.m53588d(r14)
            vt5 r0 = r14.mo4013s()
            java.util.Iterator r15 = r0.iterator()
            r16 = 1
            r17 = 0
        L_0x005f:
            r18 = r17
        L_0x0061:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x049f
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4030i()
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x008f
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4045x()
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 == 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r1 = r17
            goto L_0x0093
        L_0x008f:
            boolean r1 = r7.mo3835Z(r11, r9)
        L_0x0093:
            if (r1 != 0) goto L_0x00ae
            java.lang.Object r1 = r0.getValue()
            vt5 r3 = r12.mo3870b()
            java.lang.Object r4 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = (androidx.compose.p004ui.semantics.SemanticsPropertyKey) r4
            java.lang.Object r3 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r3, r4)
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 == 0) goto L_0x00ae
            goto L_0x0061
        L_0x00ae:
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = (androidx.compose.p004ui.semantics.SemanticsPropertyKey) r1
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4034m()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            r4 = 8
            if (r3 == 0) goto L_0x00d5
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            p000.vx2.m53589e(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r12.mo3871c()
            if (r1 == 0) goto L_0x0061
            r7.mo3841g0(r11, r4, r0)
            goto L_0x0061
        L_0x00d5:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4040s()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            if (r3 == 0) goto L_0x00e2
            r3 = r16
            goto L_0x00ea
        L_0x00e2:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4044w()
            boolean r3 = p000.vx2.m53586b(r1, r3)
        L_0x00ea:
            r5 = 64
            if (r3 == 0) goto L_0x010e
            int r1 = r7.mo3838c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.mo3838c0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0061
        L_0x010e:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4036o()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            if (r3 == 0) goto L_0x0138
            int r1 = r7.mo3838c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.mo3838c0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0061
        L_0x0138:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4039r()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            r6 = 4
            if (r3 == 0) goto L_0x022f
            vt5 r0 = r14.mo4002h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo4037p()
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r0, r1)
            hh5 r0 = (p000.hh5) r0
            hh5$a r1 = p000.hh5.f12885b
            int r1 = r1.mo21192f()
            if (r0 != 0) goto L_0x015c
            r0 = r17
            goto L_0x0164
        L_0x015c:
            int r0 = r0.mo21185m()
            boolean r0 = p000.hh5.m18896j(r0, r1)
        L_0x0164:
            if (r0 == 0) goto L_0x020f
            vt5 r0 = r14.mo4002h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo4039r()
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.vx2.m53586b(r0, r1)
            if (r0 == 0) goto L_0x01fa
            int r0 = r7.mo3838c0(r11)
            android.view.accessibility.AccessibilityEvent r0 = r7.mo3816C(r0, r6)
            androidx.compose.ui.semantics.SemanticsNode r1 = new androidx.compose.ui.semantics.SemanticsNode
            yt5 r20 = r14.mo4006l()
            r21 = 1
            r22 = 0
            r23 = 4
            r24 = 0
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            vt5 r3 = r1.mo4002h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r2.mo4024c()
            java.lang.Object r3 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r3, r4)
            r19 = r3
            java.util.List r19 = (java.util.List) r19
            if (r19 == 0) goto L_0x01bc
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 62
            r27 = 0
            java.lang.String r20 = ","
            java.lang.String r3 = p000.rm6.m26303d(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x01bd
        L_0x01bc:
            r3 = 0
        L_0x01bd:
            vt5 r1 = r1.mo4002h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo4042u()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r1, r2)
            r19 = r1
            java.util.List r19 = (java.util.List) r19
            if (r19 == 0) goto L_0x01e4
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 62
            r27 = 0
            java.lang.String r20 = ","
            java.lang.String r1 = p000.rm6.m26303d(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x01e5
        L_0x01e4:
            r1 = 0
        L_0x01e5:
            if (r3 == 0) goto L_0x01ec
            r0.setContentDescription(r3)
            r37 r2 = p000.r37.f33317a
        L_0x01ec:
            if (r1 == 0) goto L_0x01f5
            java.util.List r2 = r0.getText()
            r2.add(r1)
        L_0x01f5:
            r7.mo3839d0(r0)
            goto L_0x0061
        L_0x01fa:
            int r1 = r7.mo3838c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0061
        L_0x020f:
            int r1 = r7.mo3838c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.mo3838c0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0061
        L_0x022f:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4024c()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            if (r3 == 0) goto L_0x0253
            int r1 = r7.mo3838c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            p000.vx2.m53589e(r0, r4)
            java.util.List r0 = (java.util.List) r0
            r7.mo3840e0(r1, r2, r3, r0)
            goto L_0x0061
        L_0x0253:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4026e()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x02fc
            boolean r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3033t(r14)
            if (r0 == 0) goto L_0x02e6
            vt5 r0 = r12.mo3870b()
            rl r0 = r7.mo3825L(r0)
            if (r0 == 0) goto L_0x0270
            goto L_0x0271
        L_0x0270:
            r0 = r6
        L_0x0271:
            vt5 r1 = r14.mo4013s()
            rl r1 = r7.mo3825L(r1)
            if (r1 == 0) goto L_0x027c
            r6 = r1
        L_0x027c:
            int r1 = r0.length()
            int r2 = r6.length()
            int r3 = p000.d75.m43385g(r1, r2)
            r4 = r17
        L_0x028a:
            if (r4 >= r3) goto L_0x029a
            char r13 = r0.charAt(r4)
            char r5 = r6.charAt(r4)
            if (r13 == r5) goto L_0x0297
            goto L_0x029a
        L_0x0297:
            int r4 = r4 + 1
            goto L_0x028a
        L_0x029a:
            r5 = r17
        L_0x029c:
            int r13 = r3 - r4
            if (r5 >= r13) goto L_0x02b9
            int r13 = r1 + -1
            int r13 = r13 - r5
            char r13 = r0.charAt(r13)
            int r21 = r2 + -1
            r22 = r3
            int r3 = r21 - r5
            char r3 = r6.charAt(r3)
            if (r13 == r3) goto L_0x02b4
            goto L_0x02b9
        L_0x02b4:
            int r5 = r5 + 1
            r3 = r22
            goto L_0x029c
        L_0x02b9:
            int r1 = r1 - r5
            int r1 = r1 - r4
            int r2 = r2 - r5
            int r2 = r2 - r4
            int r3 = r7.mo3838c0(r11)
            r5 = 16
            android.view.accessibility.AccessibilityEvent r3 = r7.mo3816C(r3, r5)
            r3.setFromIndex(r4)
            r3.setRemovedCount(r1)
            r3.setAddedCount(r2)
            r3.setBeforeText(r0)
            java.util.List r0 = r3.getText()
            r1 = 100000(0x186a0, float:1.4013E-40)
            java.lang.CharSequence r1 = r7.mo3851q0(r6, r1)
            r0.add(r1)
            r7.mo3839d0(r3)
            goto L_0x0061
        L_0x02e6:
            int r1 = r7.mo3838c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0061
        L_0x02fc:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4043v()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            if (r3 == 0) goto L_0x0367
            vt5 r0 = r14.mo4013s()
            rl r0 = r7.mo3825L(r0)
            if (r0 == 0) goto L_0x0318
            java.lang.String r0 = r0.mo25431f()
            if (r0 != 0) goto L_0x0317
            goto L_0x0318
        L_0x0317:
            r6 = r0
        L_0x0318:
            vt5 r0 = r14.mo4013s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo4043v()
            java.lang.Object r0 = r0.mo27321q(r1)
            ao6 r0 = (p000.ao6) r0
            long r0 = r0.mo11071m()
            int r2 = r7.mo3838c0(r11)
            int r3 = p000.ao6.m10683j(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = p000.ao6.m10680g(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 100000(0x186a0, float:1.4013E-40)
            java.lang.CharSequence r0 = r7.mo3851q0(r6, r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r0 = r28
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            android.view.accessibility.AccessibilityEvent r0 = r0.mo3818E(r1, r2, r3, r4, r5)
            r7.mo3839d0(r0)
            int r0 = r14.mo4003i()
            r7.mo3842h0(r0)
            goto L_0x0061
        L_0x0367:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4030i()
            boolean r3 = p000.vx2.m53586b(r1, r3)
            if (r3 == 0) goto L_0x0374
            r3 = r16
            goto L_0x037c
        L_0x0374:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4045x()
            boolean r3 = p000.vx2.m53586b(r1, r3)
        L_0x037c:
            if (r3 == 0) goto L_0x03b5
            androidx.compose.ui.node.LayoutNode r0 = r14.mo4005k()
            r7.mo3830Q(r0)
            java.util.List<sn5> r0 = r7.f1966y
            sn5 r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3026m(r0, r11)
            p000.vx2.m53588d(r0)
            vt5 r1 = r14.mo4013s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo4030i()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r1, r3)
            rn5 r1 = (p000.rn5) r1
            r0.mo25915f(r1)
            vt5 r1 = r14.mo4013s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo4045x()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r1, r2)
            rn5 r1 = (p000.rn5) r1
            r0.mo25918i(r1)
            r7.mo3843i0(r0)
            goto L_0x0061
        L_0x03b5:
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo4028g()
            boolean r2 = p000.vx2.m53586b(r1, r2)
            if (r2 == 0) goto L_0x03f8
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            p000.vx2.m53589e(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03df
            int r0 = r14.mo4003i()
            int r0 = r7.mo3838c0(r0)
            android.view.accessibility.AccessibilityEvent r0 = r7.mo3816C(r0, r4)
            r7.mo3839d0(r0)
        L_0x03df:
            int r0 = r14.mo4003i()
            int r1 = r7.mo3838c0(r0)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0061
        L_0x03f8:
            tt5 r2 = p000.tt5.f18260a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo26555c()
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 == 0) goto L_0x0472
            vt5 r0 = r14.mo4013s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo26555c()
            java.lang.Object r0 = r0.mo27321q(r1)
            java.util.List r0 = (java.util.List) r0
            vt5 r1 = r12.mo3870b()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo26555c()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0469
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r3 = r0.size()
            r4 = r17
        L_0x042d:
            if (r4 >= r3) goto L_0x043f
            java.lang.Object r5 = r0.get(r4)
            vx0 r5 = (p000.vx0) r5
            java.lang.String r5 = r5.mo27357b()
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x042d
        L_0x043f:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r3 = r1.size()
            r4 = r17
        L_0x044a:
            if (r4 >= r3) goto L_0x045c
            java.lang.Object r5 = r1.get(r4)
            vx0 r5 = (p000.vx0) r5
            java.lang.String r5 = r5.mo27357b()
            r0.add(r5)
            int r4 = r4 + 1
            goto L_0x044a
        L_0x045c:
            boolean r1 = r2.containsAll(r0)
            if (r1 == 0) goto L_0x049b
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L_0x005f
            goto L_0x049b
        L_0x0469:
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0061
            goto L_0x049b
        L_0x0472:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof p000.C3574x7
            if (r1 == 0) goto L_0x049b
            java.lang.Object r1 = r0.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            p000.vx2.m53589e(r1, r2)
            x7 r1 = (p000.C3574x7) r1
            vt5 r2 = r12.mo3870b()
            java.lang.Object r0 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = (androidx.compose.p004ui.semantics.SemanticsPropertyKey) r0
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r2, r0)
            boolean r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3023j(r1, r0)
            r18 = r0 ^ 1
            goto L_0x0061
        L_0x049b:
            r18 = r16
            goto L_0x0061
        L_0x049f:
            if (r18 != 0) goto L_0x04a5
            boolean r18 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3034u(r14, r12)
        L_0x04a5:
            if (r18 == 0) goto L_0x001d
            int r1 = r7.mo3838c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            m2949f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x04bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo3844j0(java.util.Map):void");
    }

    /* renamed from: k0 */
    public final void mo3845k0(SemanticsNode semanticsNode, C0405g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> o = semanticsNode.mo4009o();
        int size = o.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = o.get(i);
            if (mo3822I().containsKey(Integer.valueOf(semanticsNode2.mo4003i()))) {
                if (!gVar.mo3869a().contains(Integer.valueOf(semanticsNode2.mo4003i()))) {
                    mo3830Q(semanticsNode.mo4005k());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.mo4003i()));
            }
        }
        for (Integer intValue : gVar.mo3869a()) {
            if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                mo3830Q(semanticsNode.mo4005k());
                return;
            }
        }
        List<SemanticsNode> o2 = semanticsNode.mo4009o();
        int size2 = o2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = o2.get(i2);
            if (mo3822I().containsKey(Integer.valueOf(semanticsNode3.mo4003i()))) {
                C0405g gVar2 = this.f1962u.get(Integer.valueOf(semanticsNode3.mo4003i()));
                vx2.m53588d(gVar2);
                mo3845k0(semanticsNode3, gVar2);
            }
        }
    }

    /* renamed from: l0 */
    public final void mo3846l0(LayoutNode layoutNode, C3162qq<Integer> qqVar) {
        LayoutNode d;
        yt5 j;
        if (layoutNode.mo3459l0() && !this.f1945d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            yt5 j2 = au5.m10806j(layoutNode);
            if (j2 == null) {
                LayoutNode d2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3027n(layoutNode, C0412xdb31af5f.INSTANCE);
                if (d2 != null) {
                    j2 = au5.m10806j(d2);
                } else {
                    j2 = null;
                }
                if (j2 == null) {
                    return;
                }
            }
            if (!(zt5.m31502a(j2).mo27326u() || (d = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3027n(layoutNode, C0411x7245ac5.INSTANCE)) == null || (j = au5.m10806j(d)) == null)) {
                j2 = j;
            }
            int X = ob1.m23744f(j2).mo3434X();
            if (qqVar.add(Integer.valueOf(X))) {
                m2949f0(this, mo3838c0(X), 2048, 1, (List) null, 8, (Object) null);
            }
        }
    }

    /* renamed from: m0 */
    public final boolean mo3847m0(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String J;
        Integer num;
        Integer num2;
        vt5 s = semanticsNode.mo4013s();
        tt5 tt5 = tt5.f18260a;
        boolean z2 = false;
        if (s.mo27319k(tt5.mo26566n()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3024k(semanticsNode)) {
            id2 id2 = (id2) ((C3574x7) semanticsNode.mo4013s().mo27321q(tt5.mo26566n())).mo27683a();
            if (id2 != null) {
                return ((Boolean) id2.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        } else if ((i == i2 && i2 == this.f1954m) || (J = mo3823J(semanticsNode)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > J.length()) {
                i = -1;
            }
            this.f1954m = i;
            if (J.length() > 0) {
                z2 = true;
            }
            int c0 = mo3838c0(semanticsNode.mo4003i());
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.f1954m);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.f1954m);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(J.length());
            }
            mo3839d0(mo3818E(c0, num, num2, num3, J));
            mo3842h0(semanticsNode.mo4003i());
            return true;
        }
    }

    /* renamed from: n0 */
    public final void mo3848n0(SemanticsNode semanticsNode, C3335t8 t8Var) {
        vt5 s = semanticsNode.mo4013s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        if (s.mo27319k(semanticsProperties.mo4027f())) {
            t8Var.mo26249k0(true);
            t8Var.mo26257o0((CharSequence) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), semanticsProperties.mo4027f()));
        }
    }

    /* renamed from: o0 */
    public final void mo3849o0(SemanticsNode semanticsNode, C3335t8 t8Var) {
        SpannableString spannableString;
        C3205rl rlVar;
        z62.C3714b fontFamilyResolver = this.f1945d.getFontFamilyResolver();
        C3205rl L = mo3825L(semanticsNode.mo4013s());
        SpannableString spannableString2 = null;
        if (L != null) {
            spannableString = C2165dh.m15112b(L, this.f1945d.getDensity(), fontFamilyResolver);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) mo3851q0(spannableString, NodeSerialization.LONGEST_EAGER_ALLOC);
        List list = (List) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), SemanticsProperties.f2125a.mo4042u());
        if (!(list == null || (rlVar = (C3205rl) CollectionsKt___CollectionsKt.m47331b0(list)) == null)) {
            spannableString2 = C2165dh.m15112b(rlVar, this.f1945d.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString4 = (SpannableString) mo3851q0(spannableString2, NodeSerialization.LONGEST_EAGER_ALLOC);
        if (spannableString3 == null) {
            spannableString3 = spannableString4;
        }
        t8Var.mo26211M0(spannableString3);
    }

    /* renamed from: p0 */
    public final boolean mo3850p0(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        boolean z3;
        C2345g8 K;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = semanticsNode.mo4003i();
        Integer num = this.f1955n;
        if (num == null || i6 != num.intValue()) {
            this.f1954m = -1;
            this.f1955n = Integer.valueOf(semanticsNode.mo4003i());
        }
        String J = mo3823J(semanticsNode);
        if (J == null || J.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || (K = mo3824K(semanticsNode, i)) == null) {
            return false;
        }
        int G = mo3820G(semanticsNode);
        if (G == -1) {
            if (z) {
                G = 0;
            } else {
                G = J.length();
            }
        }
        if (z) {
            iArr = K.mo12014a(G);
        } else {
            iArr = K.mo12015b(G);
        }
        if (iArr == null) {
            return false;
        }
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (!z2 || !mo3829P(semanticsNode)) {
            if (z) {
                i5 = i8;
            } else {
                i5 = i7;
            }
            i2 = i3;
        } else {
            i3 = mo3821H(semanticsNode);
            if (i3 == -1) {
                if (z) {
                    i3 = i7;
                } else {
                    i3 = i8;
                }
            }
            if (z) {
                i2 = i8;
            } else {
                i2 = i7;
            }
        }
        if (z) {
            i4 = 256;
        } else {
            i4 = RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
        }
        this.f1959r = new C0404f(semanticsNode, i4, i, i7, i8, SystemClock.uptimeMillis());
        SemanticsNode semanticsNode2 = semanticsNode;
        mo3847m0(semanticsNode, i3, i2, true);
        return true;
    }

    /* renamed from: q0 */
    public final <T extends CharSequence> T mo3851q0(T t, int i) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(t == null || t.length() == 0)) {
                z2 = false;
            }
            if (z2 || t.length() <= i) {
                return t;
            }
            int i2 = i - 1;
            if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
                i = i2;
            }
            T subSequence = t.subSequence(0, i);
            vx2.m53589e(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: r0 */
    public final void mo3852r0(int i) {
        int i2 = this.f1946e;
        if (i2 != i) {
            this.f1946e = i;
            m2949f0(this, i, 128, (Integer) null, (List) null, 12, (Object) null);
            m2949f0(this, i2, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3853s0() {
        /*
            r6 = this;
            qq<java.lang.Integer> r0 = r6.f1961t
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Map r2 = r6.mo3822I()
            java.lang.Object r2 = r2.get(r1)
            bu5 r2 = (p000.bu5) r2
            r3 = 0
            if (r2 == 0) goto L_0x0024
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.mo11886b()
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            if (r2 == 0) goto L_0x002d
            boolean r2 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3030q(r2)
            if (r2 != 0) goto L_0x0006
        L_0x002d:
            qq<java.lang.Integer> r2 = r6.f1961t
            r2.remove(r1)
            java.lang.String r2 = "id"
            p000.vx2.m53590f(r1, r2)
            int r2 = r1.intValue()
            r4 = 32
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r5 = r6.f1962u
            java.lang.Object r1 = r5.get(r1)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r1 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C0405g) r1
            if (r1 == 0) goto L_0x005a
            vt5 r1 = r1.mo3870b()
            if (r1 == 0) goto L_0x005a
            androidx.compose.ui.semantics.SemanticsProperties r3 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.mo4034m()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r1, r3)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x005a:
            r6.mo3841g0(r2, r4, r3)
            goto L_0x0006
        L_0x005e:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r0 = r6.f1962u
            r0.clear()
            java.util.Map r0 = r6.mo3822I()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x006f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            bu5 r2 = (p000.bu5) r2
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.mo11886b()
            boolean r2 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3030q(r2)
            if (r2 == 0) goto L_0x00c0
            qq<java.lang.Integer> r2 = r6.f1961t
            java.lang.Object r3 = r1.getKey()
            boolean r2 = r2.add(r3)
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 16
            java.lang.Object r4 = r1.getValue()
            bu5 r4 = (p000.bu5) r4
            androidx.compose.ui.semantics.SemanticsNode r4 = r4.mo11886b()
            vt5 r4 = r4.mo4013s()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.mo4034m()
            java.lang.Object r4 = r4.mo27321q(r5)
            java.lang.String r4 = (java.lang.String) r4
            r6.mo3841g0(r2, r3, r4)
        L_0x00c0:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r2 = r6.f1962u
            java.lang.Object r3 = r1.getKey()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r4 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g
            java.lang.Object r1 = r1.getValue()
            bu5 r1 = (p000.bu5) r1
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.mo11886b()
            java.util.Map r5 = r6.mo3822I()
            r4.<init>(r1, r5)
            r2.put(r3, r4)
            goto L_0x006f
        L_0x00dd:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.f1945d
            cu5 r1 = r1.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.mo18291a()
            java.util.Map r2 = r6.mo3822I()
            r0.<init>(r1, r2)
            r6.f1963v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo3853s0():void");
    }

    /* renamed from: w */
    public final void mo3854w(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode b;
        String str2;
        int i2;
        Boolean bool;
        bu5 bu5 = mo3822I().get(Integer.valueOf(i));
        if (bu5 != null && (b = bu5.mo11886b()) != null) {
            String J = mo3823J(b);
            vt5 s = b.mo4013s();
            tt5 tt5 = tt5.f18260a;
            if (!s.mo27319k(tt5.mo26559g()) || bundle == null || !vx2.m53586b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                vt5 s2 = b.mo4013s();
                SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
                if (s2.mo27319k(semanticsProperties.mo4041t()) && bundle != null && vx2.m53586b(str, "androidx.compose.ui.semantics.testTag") && (str2 = (String) SemanticsConfigurationKt.m3168a(b.mo4013s(), semanticsProperties.mo4041t())) != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (J != null) {
                    i2 = J.length();
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                if (i3 < i2) {
                    ArrayList arrayList = new ArrayList();
                    rc2 rc2 = (rc2) ((C3574x7) b.mo4013s().mo27321q(tt5.mo26559g())).mo27683a();
                    if (rc2 != null) {
                        bool = (Boolean) rc2.invoke(arrayList);
                    } else {
                        bool = null;
                    }
                    if (vx2.m53586b(bool, Boolean.TRUE)) {
                        xn6 xn6 = (xn6) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        if (i4 <= 0) {
                            Bundle extras = accessibilityNodeInfo.getExtras();
                            Object[] array = arrayList2.toArray(new RectF[0]);
                            vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            extras.putParcelableArray(str, (Parcelable[]) array);
                            return;
                        }
                        xn6.mo27841a();
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ all -> 0x0051 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3855x(p000.ns0<? super p000.r37> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.p004ui.platform.C0407x3d3eeeed
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.p004ui.platform.C0407x3d3eeeed) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r2 = r0.L$2
            md0 r2 = (p000.md0) r2
            java.lang.Object r5 = r0.L$1
            qq r5 = (p000.C3162qq) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            p000.hg5.m45199b(r11)     // Catch:{ all -> 0x0051 }
        L_0x0037:
            r11 = r5
            goto L_0x0063
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0041:
            java.lang.Object r2 = r0.L$2
            md0 r2 = (p000.md0) r2
            java.lang.Object r5 = r0.L$1
            qq r5 = (p000.C3162qq) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            p000.hg5.m45199b(r11)     // Catch:{ all -> 0x0051 }
            goto L_0x0075
        L_0x0051:
            r11 = move-exception
            goto L_0x00d0
        L_0x0054:
            p000.hg5.m45199b(r11)
            qq r11 = new qq     // Catch:{ all -> 0x00ce }
            r11.<init>()     // Catch:{ all -> 0x00ce }
            fd0<r37> r2 = r10.f1957p     // Catch:{ all -> 0x00ce }
            md0 r2 = r2.iterator()     // Catch:{ all -> 0x00ce }
            r6 = r10
        L_0x0063:
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.L$1 = r11     // Catch:{ all -> 0x0051 }
            r0.L$2 = r2     // Catch:{ all -> 0x0051 }
            r0.label = r4     // Catch:{ all -> 0x0051 }
            java.lang.Object r5 = r2.mo55581a(r0)     // Catch:{ all -> 0x0051 }
            if (r5 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r9 = r5
            r5 = r11
            r11 = r9
        L_0x0075:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0051 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00c6
            r2.next()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.mo3827N()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00b0
            r11 = 0
            qq<androidx.compose.ui.node.LayoutNode> r7 = r6.f1956o     // Catch:{ all -> 0x0051 }
            int r7 = r7.size()     // Catch:{ all -> 0x0051 }
        L_0x008d:
            if (r11 >= r7) goto L_0x00a0
            qq<androidx.compose.ui.node.LayoutNode> r8 = r6.f1956o     // Catch:{ all -> 0x0051 }
            java.lang.Object r8 = r8.mo25210s(r11)     // Catch:{ all -> 0x0051 }
            p000.vx2.m53588d(r8)     // Catch:{ all -> 0x0051 }
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.p004ui.node.LayoutNode) r8     // Catch:{ all -> 0x0051 }
            r6.mo3846l0(r8, r5)     // Catch:{ all -> 0x0051 }
            int r11 = r11 + 1
            goto L_0x008d
        L_0x00a0:
            r5.clear()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.f1964w     // Catch:{ all -> 0x0051 }
            if (r11 != 0) goto L_0x00b0
            r6.f1964w = r4     // Catch:{ all -> 0x0051 }
            android.os.Handler r11 = r6.f1949h     // Catch:{ all -> 0x0051 }
            java.lang.Runnable r7 = r6.f1965x     // Catch:{ all -> 0x0051 }
            r11.post(r7)     // Catch:{ all -> 0x0051 }
        L_0x00b0:
            qq<androidx.compose.ui.node.LayoutNode> r11 = r6.f1956o     // Catch:{ all -> 0x0051 }
            r11.clear()     // Catch:{ all -> 0x0051 }
            r7 = 100
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.L$1 = r5     // Catch:{ all -> 0x0051 }
            r0.L$2 = r2     // Catch:{ all -> 0x0051 }
            r0.label = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r11 = p000.jb1.m59336a(r7, r0)     // Catch:{ all -> 0x0051 }
            if (r11 != r1) goto L_0x0037
            return r1
        L_0x00c6:
            qq<androidx.compose.ui.node.LayoutNode> r11 = r6.f1956o
            r11.clear()
            r37 r11 = p000.r37.f33317a
            return r11
        L_0x00ce:
            r11 = move-exception
            r6 = r10
        L_0x00d0:
            qq<androidx.compose.ui.node.LayoutNode> r0 = r6.f1956o
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo3855x(ns0):java.lang.Object");
    }

    /* renamed from: y */
    public final boolean mo3856y(boolean z, int i, long j) {
        return mo3857z(mo3822I().values(), z, i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3857z(java.util.Collection<p000.bu5> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            p000.vx2.m53591g(r6, r0)
            tf4$a r0 = p000.tf4.f18145b
            long r0 = r0.mo26445b()
            boolean r0 = p000.tf4.m27732i(r9, r0)
            r1 = 0
            if (r0 != 0) goto L_0x00b8
            boolean r0 = p000.tf4.m27737n(r9)
            if (r0 != 0) goto L_0x001a
            goto L_0x00b8
        L_0x001a:
            r0 = 1
            if (r7 != r0) goto L_0x0024
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.mo4045x()
            goto L_0x002c
        L_0x0024:
            if (r7 != 0) goto L_0x00b2
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p004ui.semantics.SemanticsProperties.f2125a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.mo4030i()
        L_0x002c:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0034
            goto L_0x00b1
        L_0x0034:
            java.util.Iterator r6 = r6.iterator()
        L_0x0038:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r6.next()
            bu5 r2 = (p000.bu5) r2
            android.graphics.Rect r3 = r2.mo11885a()
            a95 r3 = p000.c95.m11758c(r3)
            boolean r3 = r3.mo113b(r9)
            if (r3 != 0) goto L_0x0054
        L_0x0052:
            r2 = r1
            goto L_0x00ae
        L_0x0054:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.mo11886b()
            vt5 r2 = r2.mo4002h()
            java.lang.Object r2 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m3168a(r2, r7)
            rn5 r2 = (p000.rn5) r2
            if (r2 != 0) goto L_0x0065
            goto L_0x0052
        L_0x0065:
            boolean r3 = r2.mo25463b()
            if (r3 == 0) goto L_0x006d
            int r3 = -r8
            goto L_0x006e
        L_0x006d:
            r3 = r8
        L_0x006e:
            if (r8 != 0) goto L_0x0077
            boolean r4 = r2.mo25463b()
            if (r4 == 0) goto L_0x0077
            r3 = -1
        L_0x0077:
            if (r3 >= 0) goto L_0x008d
            pc2 r2 = r2.mo25464c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0052
            goto L_0x00ad
        L_0x008d:
            pc2 r3 = r2.mo25464c()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            pc2 r2 = r2.mo25462a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0052
        L_0x00ad:
            r2 = r0
        L_0x00ae:
            if (r2 == 0) goto L_0x0038
            r1 = r0
        L_0x00b1:
            return r1
        L_0x00b2:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo3857z(java.util.Collection, boolean, int, long):boolean");
    }
}
