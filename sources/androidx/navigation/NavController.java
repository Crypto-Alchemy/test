package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import org.web3j.ens.contracts.generated.ENS;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.g44;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u0000 Ü\u00012\u00020\u0001:\u0004mè\u0001sB\u0011\u0012\u0006\u0010q\u001a\u00020l¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002JL\u0010\u0011\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J:\u0010\u0015\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J$\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003J*\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0003J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\u0012\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"H\u0003J\u0012\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020%H\u0002J\u0018\u0010)\u001a\u0004\u0018\u00010\b*\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0002J.\u0010,\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\"2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003J.\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\"2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002J2\u00104\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u00020\u00022\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\b\u00105\u001a\u00020\u0005H\u0002J\u0019\u00106\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b6\u00107J\u0010\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016J\b\u0010<\u001a\u00020\u0013H\u0017J\u001a\u0010=\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0017J\"\u0010>\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J%\u0010A\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050?H\u0000¢\u0006\u0004\bA\u0010BJ\b\u0010C\u001a\u00020\u0013H\u0017J\u000f\u0010D\u001a\u00020\u0005H\u0000¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0000¢\u0006\u0004\bF\u0010GJ\u0012\u0010I\u001a\u00020\u00052\b\b\u0001\u0010H\u001a\u00020\u0016H\u0017J\u001c\u0010J\u001a\u00020\u00052\b\b\u0001\u0010H\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\"H\u0017J\u001a\u0010M\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0017J\u0012\u0010P\u001a\u00020\u00132\b\u0010O\u001a\u0004\u0018\u00010NH\u0017J\u0014\u0010Q\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007J\u0012\u0010S\u001a\u00020\u00052\b\b\u0001\u0010R\u001a\u00020\u0016H\u0017J\u001c\u0010T\u001a\u00020\u00052\b\b\u0001\u0010R\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\"H\u0017J&\u0010U\u001a\u00020\u00052\b\b\u0001\u0010R\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\"2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J0\u0010V\u001a\u00020\u00052\b\b\u0001\u0010R\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\"2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020WH\u0017J\u001a\u0010Z\u001a\u00020\u00052\u0006\u0010X\u001a\u00020W2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\b\u0010\\\u001a\u00020[H\u0016J\n\u0010]\u001a\u0004\u0018\u00010\"H\u0017J\u0012\u0010_\u001a\u00020\u00052\b\u0010^\u001a\u0004\u0018\u00010\"H\u0017J\u0010\u0010b\u001a\u00020\u00052\u0006\u0010a\u001a\u00020`H\u0017J\u0010\u0010e\u001a\u00020\u00052\u0006\u0010d\u001a\u00020cH\u0017J\u0010\u0010g\u001a\u00020\u00052\u0006\u0010f\u001a\u00020\u0013H\u0017J\u0010\u0010j\u001a\u00020\u00052\u0006\u0010i\u001a\u00020hH\u0017J\u0012\u0010k\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0016R\u0017\u0010q\u001a\u00020l8\u0007¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b}\u0010~R#\u0010\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010AR%\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8WX\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R$\u0010\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R$\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R%\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u00010\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u0015\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b4\u0010\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010¤\u0001\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b:\u0010£\u0001R\u001b\u0010§\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010¦\u0001R\u001d\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u0002080¨\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\\\u0010©\u0001R)\u0010±\u0001\u001a\u00030«\u00018@@\u0000X\u000e¢\u0006\u0017\n\u0005\b!\u0010¬\u0001\u001a\u0006\b­\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010´\u0001\u001a\u00030²\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bg\u0010³\u0001R\u0017\u0010·\u0001\u001a\u00030µ\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bQ\u0010¶\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010AR\u0019\u0010»\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b(\u0010º\u0001R1\u0010½\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070¼\u0001R\u00020\u00000\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R&\u0010¿\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bk\u0010¾\u0001R&\u0010À\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bo\u0010¾\u0001R$\u0010Â\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010\u0001R\u0018\u0010Ä\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u0010PR\u001e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Å\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R \u0010Í\u0001\u001a\u00020v8VX\u0002¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001e\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Î\u00018\u0002X\u0004¢\u0006\b\n\u0006\b­\u0001\u0010Ï\u0001R#\u0010Õ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ñ\u00018\u0006¢\u0006\u0010\n\u0006\bË\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0017\u0010×\u0001\u001a\u00020\u00168BX\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ö\u0001R(\u0010L\u001a\u00020K2\u0006\u0010L\u001a\u00020K8W@WX\u000e¢\u0006\u0010\u001a\u0006\bÉ\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R,\u0010Û\u0001\u001a\u00030¹\u00012\b\u0010Û\u0001\u001a\u00030¹\u00018V@WX\u000e¢\u0006\u0010\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\u0019\u0010á\u0001\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010à\u0001R\u0019\u0010ã\u0001\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010â\u0001R\u0019\u0010å\u0001\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010â\u0001¨\u0006é\u0001"}, mo44877d2 = {"Landroidx/navigation/NavController;", "", "Landroidx/navigation/NavBackStackEntry;", "child", "parent", "Lr37;", "L", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "", "entries", "Lm44;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "Lkotlin/Function1;", "handler", "T", "popUpTo", "", "saveState", "a0", "", "destinationId", "inclusive", "b0", "Leq;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "d0", "q", "r0", "s0", "s", "Landroid/os/Bundle;", "startDestinationArgs", "V", "", "deepLink", "", "w", "v", "node", "args", "S", "id", "i0", "backStackState", "J", "finalArgs", "backStackEntry", "restoredEntries", "n", "v0", "t0", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/NavController$b;", "listener", "p", "g0", "W", "X", "Y", "Lkotlin/Function0;", "onComplete", "Z", "(Landroidx/navigation/NavBackStackEntry;Lpc2;)V", "U", "u0", "()V", "f0", "()Ljava/util/List;", "graphResId", "k0", "l0", "Landroidx/navigation/NavGraph;", "graph", "n0", "Landroid/content/Intent;", "intent", "I", "u", "resId", "M", "N", "O", "P", "Lj44;", "directions", "Q", "R", "Lh44;", "r", "j0", "navState", "h0", "Lug3;", "owner", "o0", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "p0", "enabled", "t", "Lgd7;", "viewModelStore", "q0", "y", "Landroid/content/Context;", "a", "Landroid/content/Context;", "z", "()Landroid/content/Context;", "context", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Ll44;", "c", "Ll44;", "inflater", "d", "Landroidx/navigation/NavGraph;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "Leq;", "x", "()Leq;", "backQueue", "Lu04;", "i", "Lu04;", "_visibleEntries", "Lt86;", "j", "Lt86;", "getVisibleEntries", "()Lt86;", "visibleEntries", "", "k", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "l", "parentToChildCount", "m", "backStackMap", "backStackStates", "o", "Lug3;", "lifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Lg44;", "Lg44;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle$State;", "E", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "hostLifecycleState", "Ltg3;", "Ltg3;", "lifecycleObserver", "Lyg4;", "Lyg4;", "onBackPressedCallback", "enableOnBackPressedCallback", "Lb54;", "Lb54;", "_navigatorProvider", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigatorState", "Lrc2;", "addToBackStackHandler", "popFromBackStackHandler", "A", "entrySavedState", "B", "dispatchReentrantCount", "", "C", "Ljava/util/List;", "backStackEntriesToDispatch", "D", "Lef3;", "F", "()Ll44;", "navInflater", "Lr04;", "Lr04;", "_currentBackStackEntryFlow", "Lz42;", "Lz42;", "getCurrentBackStackEntryFlow", "()Lz42;", "currentBackStackEntryFlow", "()I", "destinationCountOnBackStack", "()Landroidx/navigation/NavGraph;", "m0", "(Landroidx/navigation/NavGraph;)V", "navigatorProvider", "G", "()Lb54;", "setNavigatorProvider", "(Lb54;)V", "()Landroidx/navigation/NavDestination;", "currentDestination", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "H", "previousBackStackEntry", "<init>", "(Landroid/content/Context;)V", "NavControllerNavigatorState", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: NavController.kt */
public class NavController {

    /* renamed from: G */
    public static final C1114a f5992G = new C1114a((DefaultConstructorMarker) null);

    /* renamed from: H */
    public static boolean f5993H = true;

    /* renamed from: A */
    public final Map<NavBackStackEntry, Boolean> f5994A;

    /* renamed from: B */
    public int f5995B;

    /* renamed from: C */
    public final List<NavBackStackEntry> f5996C;

    /* renamed from: D */
    public final ef3 f5997D;

    /* renamed from: E */
    public final r04<NavBackStackEntry> f5998E;

    /* renamed from: F */
    public final z42<NavBackStackEntry> f5999F;

    /* renamed from: a */
    public final Context f6000a;

    /* renamed from: b */
    public Activity f6001b;

    /* renamed from: c */
    public l44 f6002c;

    /* renamed from: d */
    public NavGraph f6003d;

    /* renamed from: e */
    public Bundle f6004e;

    /* renamed from: f */
    public Parcelable[] f6005f;

    /* renamed from: g */
    public boolean f6006g;

    /* renamed from: h */
    public final C5808eq<NavBackStackEntry> f6007h;

    /* renamed from: i */
    public final u04<List<NavBackStackEntry>> f6008i;

    /* renamed from: j */
    public final t86<List<NavBackStackEntry>> f6009j;

    /* renamed from: k */
    public final Map<NavBackStackEntry, NavBackStackEntry> f6010k;

    /* renamed from: l */
    public final Map<NavBackStackEntry, AtomicInteger> f6011l;

    /* renamed from: m */
    public final Map<Integer, String> f6012m;

    /* renamed from: n */
    public final Map<String, C5808eq<NavBackStackEntryState>> f6013n;

    /* renamed from: o */
    public ug3 f6014o;

    /* renamed from: p */
    public OnBackPressedDispatcher f6015p;

    /* renamed from: q */
    public g44 f6016q;

    /* renamed from: r */
    public final CopyOnWriteArrayList<C1115b> f6017r;

    /* renamed from: s */
    public Lifecycle.State f6018s;

    /* renamed from: t */
    public final tg3 f6019t;

    /* renamed from: u */
    public final yg4 f6020u;

    /* renamed from: v */
    public boolean f6021v;

    /* renamed from: w */
    public b54 f6022w;

    /* renamed from: x */
    public final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> f6023x;

    /* renamed from: y */
    public rc2<? super NavBackStackEntry, r37> f6024y;

    /* renamed from: z */
    public rc2<? super NavBackStackEntry, r37> f6025z;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u001f\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Lc54;", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lr37;", "h", "k", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "a", "popUpTo", "", "saveState", "g", "entry", "e", "Landroidx/navigation/Navigator;", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "navigator", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: NavController.kt */
    public final class NavControllerNavigatorState extends c54 {

        /* renamed from: g */
        public final Navigator<? extends NavDestination> f6026g;

        /* renamed from: h */
        public final /* synthetic */ NavController f6027h;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            vx2.m53591g(navigator, "navigator");
            this.f6027h = navController;
            this.f6026g = navigator;
        }

        /* renamed from: a */
        public NavBackStackEntry mo8502a(NavDestination navDestination, Bundle bundle) {
            vx2.m53591g(navDestination, "destination");
            return NavBackStackEntry.C1109a.m8164b(NavBackStackEntry.f5972I, this.f6027h.mo8501z(), navDestination, bundle, this.f6027h.mo8449E(), this.f6027h.f6016q, (String) null, (Bundle) null, 96, (Object) null);
        }

        /* renamed from: e */
        public void mo8503e(NavBackStackEntry navBackStackEntry) {
            g44 j;
            vx2.m53591g(navBackStackEntry, "entry");
            boolean b = vx2.m53586b(this.f6027h.f5994A.get(navBackStackEntry), Boolean.TRUE);
            super.mo8503e(navBackStackEntry);
            this.f6027h.f5994A.remove(navBackStackEntry);
            if (!this.f6027h.mo8499x().contains(navBackStackEntry)) {
                this.f6027h.mo8493t0(navBackStackEntry);
                if (navBackStackEntry.getLifecycle().mo6296b().isAtLeast(Lifecycle.State.CREATED)) {
                    navBackStackEntry.mo8432m(Lifecycle.State.DESTROYED);
                }
                C5808eq<NavBackStackEntry> x = this.f6027h.mo8499x();
                boolean z = true;
                if (!(x instanceof Collection) || !x.isEmpty()) {
                    Iterator<T> it = x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (vx2.m53586b(((NavBackStackEntry) it.next()).mo8425g(), navBackStackEntry.mo8425g())) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z && !b && (j = this.f6027h.f6016q) != null) {
                    j.mo20347c(navBackStackEntry.mo8425g());
                }
                this.f6027h.mo8495u0();
                this.f6027h.f6008i.mo55645b(this.f6027h.mo8473f0());
            } else if (!mo11974d()) {
                this.f6027h.mo8495u0();
                this.f6027h.f6008i.mo55645b(this.f6027h.mo8473f0());
            }
        }

        /* renamed from: g */
        public void mo8504g(NavBackStackEntry navBackStackEntry, boolean z) {
            vx2.m53591g(navBackStackEntry, "popUpTo");
            Navigator e = this.f6027h.f6022w.mo11359e(navBackStackEntry.mo8424f().mo8547B());
            if (vx2.m53586b(e, this.f6026g)) {
                rc2 i = this.f6027h.f6025z;
                if (i != null) {
                    i.invoke(navBackStackEntry);
                    super.mo8504g(navBackStackEntry, z);
                    return;
                }
                this.f6027h.mo8469Z(navBackStackEntry, new NavController$NavControllerNavigatorState$pop$1(this, navBackStackEntry, z));
                return;
            }
            Object obj = this.f6027h.f6023x.get(e);
            vx2.m53588d(obj);
            ((NavControllerNavigatorState) obj).mo8504g(navBackStackEntry, z);
        }

        /* renamed from: h */
        public void mo8505h(NavBackStackEntry navBackStackEntry) {
            vx2.m53591g(navBackStackEntry, "backStackEntry");
            Navigator e = this.f6027h.f6022w.mo11359e(navBackStackEntry.mo8424f().mo8547B());
            if (vx2.m53586b(e, this.f6026g)) {
                rc2 c = this.f6027h.f6024y;
                if (c != null) {
                    c.invoke(navBackStackEntry);
                    mo8506k(navBackStackEntry);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring add of destination ");
                sb.append(navBackStackEntry.mo8424f());
                sb.append(" outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f6027h.f6023x.get(e);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).mo8505h(navBackStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry.mo8424f().mo8547B() + " should already be created").toString());
        }

        /* renamed from: k */
        public final void mo8506k(NavBackStackEntry navBackStackEntry) {
            vx2.m53591g(navBackStackEntry, "backStackEntry");
            super.mo8505h(navBackStackEntry);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006XT¢\u0006\f\n\u0004\b\n\u0010\u0004\u0012\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, mo44877d2 = {"Landroidx/navigation/NavController$a;", "", "", "KEY_BACK_STACK", "Ljava/lang/String;", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "()V", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "", "deepLinkSaveState", "Z", "<init>", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavController$a */
    /* compiled from: NavController.kt */
    public static final class C1114a {
        public C1114a() {
        }

        public /* synthetic */ C1114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, mo44877d2 = {"Landroidx/navigation/NavController$b;", "", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "Lr37;", "a", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavController$b */
    /* compiled from: NavController.kt */
    public interface C1115b {
        /* renamed from: a */
        void mo38a(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"androidx/navigation/NavController$c", "Lyg4;", "Lr37;", "b", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavController$c */
    /* compiled from: NavController.kt */
    public static final class C1116c extends yg4 {

        /* renamed from: c */
        public final /* synthetic */ NavController f6028c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1116c(NavController navController) {
            super(false);
            this.f6028c = navController;
        }

        /* renamed from: b */
        public void mo6034b() {
            this.f6028c.mo8466W();
        }
    }

    public NavController(Context context) {
        Object obj;
        vx2.m53591g(context, "context");
        this.f6000a = context;
        Iterator it = SequencesKt__SequencesKt.m63015j(context, NavController$activity$1.INSTANCE).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f6001b = (Activity) obj;
        this.f6007h = new C5808eq<>();
        u04<List<NavBackStackEntry>> a = u86.m72658a(ck0.m33062j());
        this.f6008i = a;
        this.f6009j = e52.m57210b(a);
        this.f6010k = new LinkedHashMap();
        this.f6011l = new LinkedHashMap();
        this.f6012m = new LinkedHashMap();
        this.f6013n = new LinkedHashMap();
        this.f6017r = new CopyOnWriteArrayList<>();
        this.f6018s = Lifecycle.State.INITIALIZED;
        this.f6019t = new e44(this);
        this.f6020u = new C1116c(this);
        this.f6021v = true;
        this.f6022w = new b54();
        this.f6023x = new LinkedHashMap();
        this.f5994A = new LinkedHashMap();
        b54 b54 = this.f6022w;
        b54.mo11356b(new C1128a(b54));
        this.f6022w.mo11356b(new ActivityNavigator(this.f6000a));
        this.f5996C = new ArrayList();
        this.f5997D = C6169a.m47232a(new NavController$navInflater$2(this));
        r04<NavBackStackEntry> b = yz5.m74703b(1, 0, BufferOverflow.DROP_OLDEST, 2, (Object) null);
        this.f5998E = b;
        this.f5999F = e52.m57209a(b);
    }

    /* renamed from: K */
    public static final void m8173K(NavController navController, ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(navController, "this$0");
        vx2.m53591g(ug3, "<anonymous parameter 0>");
        vx2.m53591g(event, "event");
        Lifecycle.State targetState = event.getTargetState();
        vx2.m53590f(targetState, "event.targetState");
        navController.f6018s = targetState;
        if (navController.f6003d != null) {
            Iterator<NavBackStackEntry> it = navController.mo8499x().iterator();
            while (it.hasNext()) {
                it.next().mo8429j(event);
            }
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ boolean m8177c0(NavController navController, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return navController.mo8471b0(i, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m8180e0(NavController navController, NavBackStackEntry navBackStackEntry, boolean z, C5808eq eqVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                eqVar = new C5808eq();
            }
            navController.mo8472d0(navBackStackEntry, z, eqVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    /* renamed from: o */
    public static /* synthetic */ void m8189o(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                list = ck0.m33062j();
            }
            navController.mo8481n(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    /* renamed from: A */
    public NavBackStackEntry mo8445A() {
        return mo8499x().mo42371s();
    }

    /* renamed from: B */
    public NavDestination mo8446B() {
        NavBackStackEntry A = mo8445A();
        if (A != null) {
            return A.mo8424f();
        }
        return null;
    }

    /* renamed from: C */
    public final int mo8447C() {
        C5808eq<NavBackStackEntry> x = mo8499x();
        int i = 0;
        if (!(x instanceof Collection) || !x.isEmpty()) {
            for (NavBackStackEntry f : x) {
                if ((!(f.mo8424f() instanceof NavGraph)) && (i = i + 1) < 0) {
                    ck0.m33071s();
                }
            }
        }
        return i;
    }

    /* renamed from: D */
    public NavGraph mo8448D() {
        NavGraph navGraph = this.f6003d;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        } else if (navGraph != null) {
            return navGraph;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
    }

    /* renamed from: E */
    public final Lifecycle.State mo8449E() {
        if (this.f6014o == null) {
            return Lifecycle.State.CREATED;
        }
        return this.f6018s;
    }

    /* renamed from: F */
    public l44 mo8450F() {
        return (l44) this.f5997D.getValue();
    }

    /* renamed from: G */
    public b54 mo8451G() {
        return this.f6022w;
    }

    /* renamed from: H */
    public NavBackStackEntry mo8452H() {
        T t;
        Iterator<T> it = CollectionsKt___CollectionsKt.m47353x0(mo8499x()).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator<T> it2 = SequencesKt__SequencesKt.m63008c(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (!(((NavBackStackEntry) t).mo8424f() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r1 != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8453I(android.content.Intent r20) {
        /*
            r19 = this;
            r6 = r19
            r0 = r20
            r7 = 0
            if (r0 != 0) goto L_0x0008
            return r7
        L_0x0008:
            android.os.Bundle r1 = r20.getExtras()
            r8 = 0
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = "android-support-nav:controller:deepLinkIds"
            int[] r2 = r1.getIntArray(r2)
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            if (r1 == 0) goto L_0x0020
            java.lang.String r3 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            goto L_0x0021
        L_0x0020:
            r3 = r8
        L_0x0021:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r1 == 0) goto L_0x002f
            java.lang.String r5 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r1 = r1.getBundle(r5)
            goto L_0x0030
        L_0x002f:
            r1 = r8
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r4.putAll(r1)
        L_0x0035:
            r9 = 1
            if (r2 == 0) goto L_0x0040
            int r1 = r2.length
            if (r1 != 0) goto L_0x003d
            r1 = r9
            goto L_0x003e
        L_0x003d:
            r1 = r7
        L_0x003e:
            if (r1 == 0) goto L_0x0068
        L_0x0040:
            androidx.navigation.NavGraph r1 = r6.f6003d
            p000.vx2.m53588d(r1)
            i44 r5 = new i44
            r5.<init>(r0)
            androidx.navigation.NavDestination$a r1 = r1.mo8550F(r5)
            if (r1 == 0) goto L_0x0068
            androidx.navigation.NavDestination r2 = r1.mo8569d()
            int[] r3 = androidx.navigation.NavDestination.m8281r(r2, r8, r9, r8)
            android.os.Bundle r1 = r1.mo8570e()
            android.os.Bundle r1 = r2.mo8558n(r1)
            if (r1 == 0) goto L_0x0065
            r4.putAll(r1)
        L_0x0065:
            r10 = r3
            r3 = r8
            goto L_0x0069
        L_0x0068:
            r10 = r2
        L_0x0069:
            if (r10 == 0) goto L_0x01de
            int r1 = r10.length
            if (r1 != 0) goto L_0x0070
            r1 = r9
            goto L_0x0071
        L_0x0070:
            r1 = r7
        L_0x0071:
            if (r1 == 0) goto L_0x0075
            goto L_0x01de
        L_0x0075:
            java.lang.String r1 = r6.mo8498w(r10)
            if (r1 == 0) goto L_0x0091
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not find destination "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " in the navigation graph, ignoring the deep link from "
            r2.append(r1)
            r2.append(r0)
            return r7
        L_0x0091:
            java.lang.String r1 = "android-support-nav:controller:deepLinkIntent"
            r4.putParcelable(r1, r0)
            int r1 = r10.length
            android.os.Bundle[] r11 = new android.os.Bundle[r1]
            r2 = r7
        L_0x009a:
            if (r2 >= r1) goto L_0x00b6
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putAll(r4)
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r12 = r3.get(r2)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x00b1
            r5.putAll(r12)
        L_0x00b1:
            r11[r2] = r5
            int r2 = r2 + 1
            goto L_0x009a
        L_0x00b6:
            int r1 = r20.getFlags()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e5
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r3
            if (r1 != 0) goto L_0x00e5
            r0.addFlags(r3)
            android.content.Context r1 = r6.f6000a
            hm6 r1 = p000.hm6.m19090o(r1)
            hm6 r0 = r1.mo21302j(r0)
            java.lang.String r1 = "create(context)\n        …ntWithParentStack(intent)"
            p000.vx2.m53590f(r0, r1)
            r0.mo21307s()
            android.app.Activity r0 = r6.f6001b
            if (r0 == 0) goto L_0x00e4
            r0.finish()
            r0.overridePendingTransition(r7, r7)
        L_0x00e4:
            return r9
        L_0x00e5:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r2 == 0) goto L_0x014c
            eq r0 = r19.mo8499x()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0105
            androidx.navigation.NavGraph r0 = r6.f6003d
            p000.vx2.m53588d(r0)
            int r1 = r0.mo8563w()
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r19
            m8177c0(r0, r1, r2, r3, r4, r5)
        L_0x0105:
            int r0 = r10.length
            if (r7 >= r0) goto L_0x014b
            r0 = r10[r7]
            int r1 = r7 + 1
            r2 = r11[r7]
            androidx.navigation.NavDestination r3 = r6.mo8494u(r0)
            if (r3 == 0) goto L_0x0122
            androidx.navigation.NavController$handleDeepLink$2 r0 = new androidx.navigation.NavController$handleDeepLink$2
            r0.<init>(r3, r6)
            m44 r0 = p000.o44.m23660a(r0)
            r6.mo8462S(r3, r2, r0, r8)
            r7 = r1
            goto L_0x0105
        L_0x0122:
            androidx.navigation.NavDestination$Companion r1 = androidx.navigation.NavDestination.f6051A
            android.content.Context r2 = r6.f6000a
            java.lang.String r0 = r1.mo8565b(r2, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r2.append(r0)
            androidx.navigation.NavDestination r0 = r19.mo8446B()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x014b:
            return r9
        L_0x014c:
            androidx.navigation.NavGraph r0 = r6.f6003d
            int r1 = r10.length
            r2 = r7
        L_0x0150:
            if (r2 >= r1) goto L_0x01db
            r3 = r10[r2]
            r4 = r11[r2]
            if (r2 != 0) goto L_0x015b
            androidx.navigation.NavGraph r5 = r6.f6003d
            goto L_0x0162
        L_0x015b:
            p000.vx2.m53588d(r0)
            androidx.navigation.NavDestination r5 = r0.mo8573R(r3)
        L_0x0162:
            if (r5 == 0) goto L_0x01b6
            int r3 = r10.length
            int r3 = r3 - r9
            if (r2 == r3) goto L_0x018b
            boolean r3 = r5 instanceof androidx.navigation.NavGraph
            if (r3 == 0) goto L_0x01b3
            androidx.navigation.NavGraph r5 = (androidx.navigation.NavGraph) r5
        L_0x016e:
            p000.vx2.m53588d(r5)
            int r0 = r5.mo8580Z()
            androidx.navigation.NavDestination r0 = r5.mo8573R(r0)
            boolean r0 = r0 instanceof androidx.navigation.NavGraph
            if (r0 == 0) goto L_0x0189
            int r0 = r5.mo8580Z()
            androidx.navigation.NavDestination r0 = r5.mo8573R(r0)
            r5 = r0
            androidx.navigation.NavGraph r5 = (androidx.navigation.NavGraph) r5
            goto L_0x016e
        L_0x0189:
            r0 = r5
            goto L_0x01b3
        L_0x018b:
            m44$a r13 = new m44$a
            r13.<init>()
            androidx.navigation.NavGraph r3 = r6.f6003d
            p000.vx2.m53588d(r3)
            int r14 = r3.mo8563w()
            r15 = 1
            r16 = 0
            r17 = 4
            r18 = 0
            m44$a r3 = p000.m44.C2804a.m22009j(r13, r14, r15, r16, r17, r18)
            m44$a r3 = r3.mo23035b(r7)
            m44$a r3 = r3.mo23036c(r7)
            m44 r3 = r3.mo23034a()
            r6.mo8462S(r5, r4, r3, r8)
        L_0x01b3:
            int r2 = r2 + 1
            goto L_0x0150
        L_0x01b6:
            androidx.navigation.NavDestination$Companion r1 = androidx.navigation.NavDestination.f6051A
            android.content.Context r2 = r6.f6000a
            java.lang.String r1 = r1.mo8565b(r2, r3)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r1)
            java.lang.String r1 = " cannot be found in graph "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01db:
            r6.f6006g = r9
            return r9
        L_0x01de:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo8453I(android.content.Intent):boolean");
    }

    /* renamed from: J */
    public final List<NavBackStackEntry> mo8454J(C5808eq<NavBackStackEntryState> eqVar) {
        NavDestination navDestination;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry s = mo8499x().mo42371s();
        if (s == null || (navDestination = s.mo8424f()) == null) {
            navDestination = mo8448D();
        }
        if (eqVar != null) {
            for (NavBackStackEntryState navBackStackEntryState : eqVar) {
                NavDestination v = mo8496v(navDestination, navBackStackEntryState.mo8436a());
                if (v != null) {
                    arrayList.add(navBackStackEntryState.mo8438c(this.f6000a, v, mo8449E(), this.f6016q));
                    navDestination = v;
                } else {
                    String b = NavDestination.f6051A.mo8565b(this.f6000a, navBackStackEntryState.mo8436a());
                    throw new IllegalStateException(("Restore State failed: destination " + b + " cannot be found from the current destination " + navDestination).toString());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public final void mo8455L(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f6010k.put(navBackStackEntry, navBackStackEntry2);
        if (this.f6011l.get(navBackStackEntry2) == null) {
            this.f6011l.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f6011l.get(navBackStackEntry2);
        vx2.m53588d(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* renamed from: M */
    public void mo8456M(int i) {
        mo8457N(i, (Bundle) null);
    }

    /* renamed from: N */
    public void mo8457N(int i, Bundle bundle) {
        mo8458O(i, bundle, (m44) null);
    }

    /* renamed from: O */
    public void mo8458O(int i, Bundle bundle, m44 m44) {
        mo8459P(i, bundle, m44, (Navigator.C1126a) null);
    }

    /* renamed from: P */
    public void mo8459P(int i, Bundle bundle, m44 m44, Navigator.C1126a aVar) {
        NavDestination navDestination;
        int i2;
        boolean z;
        if (mo8499x().isEmpty()) {
            navDestination = this.f6003d;
        } else {
            navDestination = mo8499x().last().mo8424f();
        }
        if (navDestination != null) {
            c44 s = navDestination.mo8560s(i);
            Bundle bundle2 = null;
            if (s != null) {
                if (m44 == null) {
                    m44 = s.mo11968c();
                }
                i2 = s.mo11967b();
                Bundle a = s.mo11966a();
                if (a != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 != 0 || m44 == null || m44.mo23027e() == -1) {
                boolean z2 = true;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    NavDestination u = mo8494u(i2);
                    if (u == null) {
                        NavDestination.Companion companion = NavDestination.f6051A;
                        String b = companion.mo8565b(this.f6000a, i2);
                        if (s != null) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("Navigation destination " + b + " referenced from action " + companion.mo8565b(this.f6000a, i) + " cannot be found from the current destination " + navDestination).toString());
                        }
                        throw new IllegalArgumentException("Navigation action/destination " + b + " cannot be found from the current destination " + navDestination);
                    }
                    mo8462S(u, bundle2, m44, aVar);
                    return;
                }
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
            mo8467X(m44.mo23027e(), m44.mo23029f());
            return;
        }
        throw new IllegalStateException("no current navigation node");
    }

    /* renamed from: Q */
    public void mo8460Q(j44 j44) {
        vx2.m53591g(j44, "directions");
        mo8458O(j44.mo21068a(), j44.mo21069b(), (m44) null);
    }

    /* renamed from: R */
    public void mo8461R(j44 j44, m44 m44) {
        vx2.m53591g(j44, "directions");
        mo8458O(j44.mo21068a(), j44.mo21069b(), m44);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0119 A[LOOP:1: B:42:0x0113->B:44:0x0119, LOOP_END] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8462S(androidx.navigation.NavDestination r21, android.os.Bundle r22, p000.m44 r23, androidx.navigation.Navigator.C1126a r24) {
        /*
            r20 = this;
            r6 = r20
            r3 = r23
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r0 = r6.f6023x
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavController$NavControllerNavigatorState r1 = (androidx.navigation.NavController.NavControllerNavigatorState) r1
            r1.mo11976i(r2)
            goto L_0x000e
        L_0x001f:
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x0040
            int r0 = r23.mo23027e()
            r1 = -1
            if (r0 == r1) goto L_0x0040
            int r0 = r23.mo23027e()
            boolean r1 = r23.mo23029f()
            boolean r4 = r23.mo23031h()
            boolean r0 = r6.mo8471b0(r0, r1, r4)
            r9 = r0
            goto L_0x0041
        L_0x0040:
            r9 = r8
        L_0x0041:
            android.os.Bundle r0 = r21.mo8558n(r22)
            if (r3 == 0) goto L_0x004f
            boolean r1 = r23.mo23033i()
            if (r1 != r2) goto L_0x004f
            r1 = r2
            goto L_0x0050
        L_0x004f:
            r1 = r8
        L_0x0050:
            if (r1 == 0) goto L_0x0070
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r6.f6012m
            int r4 = r21.mo8563w()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0070
            int r1 = r21.mo8563w()
            r4 = r24
            boolean r0 = r6.mo8476i0(r1, r0, r3, r4)
            r7.element = r0
            goto L_0x0105
        L_0x0070:
            r4 = r24
            androidx.navigation.NavBackStackEntry r1 = r20.mo8445A()
            b54 r5 = r6.f6022w
            java.lang.String r10 = r21.mo8547B()
            androidx.navigation.Navigator r5 = r5.mo11359e(r10)
            if (r3 == 0) goto L_0x008a
            boolean r10 = r23.mo23030g()
            if (r10 != r2) goto L_0x008a
            r10 = r2
            goto L_0x008b
        L_0x008a:
            r10 = r8
        L_0x008b:
            if (r10 == 0) goto L_0x00d6
            if (r1 == 0) goto L_0x00a1
            androidx.navigation.NavDestination r10 = r1.mo8424f()
            if (r10 == 0) goto L_0x00a1
            int r11 = r21.mo8563w()
            int r10 = r10.mo8563w()
            if (r11 != r10) goto L_0x00a1
            r10 = r2
            goto L_0x00a2
        L_0x00a1:
            r10 = r8
        L_0x00a2:
            if (r10 == 0) goto L_0x00d6
            eq r3 = r20.mo8499x()
            java.lang.Object r3 = r3.removeLast()
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            r6.mo8493t0(r3)
            androidx.navigation.NavBackStackEntry r3 = new androidx.navigation.NavBackStackEntry
            r3.<init>(r1, r0)
            eq r0 = r20.mo8499x()
            r0.addLast(r3)
            androidx.navigation.NavDestination r0 = r3.mo8424f()
            androidx.navigation.NavGraph r0 = r0.mo8548D()
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.mo8563w()
            androidx.navigation.NavBackStackEntry r0 = r6.mo8500y(r0)
            r6.mo8455L(r3, r0)
        L_0x00d2:
            r5.mo8600g(r3)
            goto L_0x0106
        L_0x00d6:
            androidx.navigation.NavBackStackEntry$a r10 = androidx.navigation.NavBackStackEntry.f5972I
            android.content.Context r11 = r6.f6000a
            androidx.lifecycle.Lifecycle$State r14 = r20.mo8449E()
            g44 r15 = r6.f6016q
            r16 = 0
            r17 = 0
            r18 = 96
            r19 = 0
            r12 = r21
            r13 = r0
            androidx.navigation.NavBackStackEntry r1 = androidx.navigation.NavBackStackEntry.C1109a.m8164b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.List r2 = p000.bk0.m32598e(r1)
            androidx.navigation.NavController$navigate$4 r10 = new androidx.navigation.NavController$navigate$4
            r1 = r21
            r10.<init>(r7, r6, r1, r0)
            r0 = r20
            r1 = r5
            r3 = r23
            r4 = r24
            r5 = r10
            r0.mo8463T(r1, r2, r3, r4, r5)
        L_0x0105:
            r2 = r8
        L_0x0106:
            r20.mo8497v0()
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r0 = r6.f6023x
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0113:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0123
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavController$NavControllerNavigatorState r1 = (androidx.navigation.NavController.NavControllerNavigatorState) r1
            r1.mo11976i(r8)
            goto L_0x0113
        L_0x0123:
            if (r9 != 0) goto L_0x0130
            boolean r0 = r7.element
            if (r0 != 0) goto L_0x0130
            if (r2 == 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            r20.mo8495u0()
            goto L_0x0133
        L_0x0130:
            r20.mo8490s()
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo8462S(androidx.navigation.NavDestination, android.os.Bundle, m44, androidx.navigation.Navigator$a):void");
    }

    /* renamed from: T */
    public final void mo8463T(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, m44 m44, Navigator.C1126a aVar, rc2<? super NavBackStackEntry, r37> rc2) {
        this.f6024y = rc2;
        navigator.mo8598e(list, m44, aVar);
        this.f6024y = null;
    }

    /* renamed from: U */
    public boolean mo8464U() {
        Bundle bundle;
        Intent intent;
        if (mo8447C() != 1) {
            return mo8466W();
        }
        Activity activity = this.f6001b;
        int[] iArr = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
        }
        if (iArr != null) {
            return mo8489r0();
        }
        return mo8491s0();
    }

    /* renamed from: V */
    public final void mo8465V(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f6004e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                b54 b54 = this.f6022w;
                vx2.m53590f(next, PublicResolver.FUNC_NAME);
                Navigator e = b54.mo11359e(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    e.mo8601h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f6005f;
        boolean z = false;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i = 0;
            while (i < length) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i];
                NavDestination u = mo8494u(navBackStackEntryState.mo8436a());
                if (u != null) {
                    NavBackStackEntry c = navBackStackEntryState.mo8438c(this.f6000a, u, mo8449E(), this.f6016q);
                    Navigator e2 = this.f6022w.mo11359e(u.mo8547B());
                    Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.f6023x;
                    NavControllerNavigatorState navControllerNavigatorState = map.get(e2);
                    if (navControllerNavigatorState == null) {
                        navControllerNavigatorState = new NavControllerNavigatorState(this, e2);
                        map.put(e2, navControllerNavigatorState);
                    }
                    mo8499x().add(c);
                    navControllerNavigatorState.mo8506k(c);
                    NavGraph D = c.mo8424f().mo8548D();
                    if (D != null) {
                        mo8455L(c, mo8500y(D.mo8563w()));
                    }
                    i++;
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.f6051A.mo8565b(this.f6000a, navBackStackEntryState.mo8436a()) + " cannot be found from the current destination " + mo8446B());
                }
            }
            mo8497v0();
            this.f6005f = null;
        }
        Collection<Navigator<? extends NavDestination>> values = this.f6022w.mo11360f().values();
        ArrayList<Navigator> arrayList = new ArrayList<>();
        for (T next2 : values) {
            if (!((Navigator) next2).mo8597c()) {
                arrayList.add(next2);
            }
        }
        for (Navigator navigator : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.f6023x;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator);
                map2.put(navigator, navControllerNavigatorState2);
            }
            navigator.mo8599f(navControllerNavigatorState2);
        }
        if (this.f6003d == null || !mo8499x().isEmpty()) {
            mo8490s();
            return;
        }
        if (!this.f6006g && (activity = this.f6001b) != null) {
            vx2.m53588d(activity);
            if (mo8453I(activity.getIntent())) {
                z = true;
            }
        }
        if (!z) {
            NavGraph navGraph = this.f6003d;
            vx2.m53588d(navGraph);
            mo8462S(navGraph, bundle, (m44) null, (Navigator.C1126a) null);
        }
    }

    /* renamed from: W */
    public boolean mo8466W() {
        if (mo8499x().isEmpty()) {
            return false;
        }
        NavDestination B = mo8446B();
        vx2.m53588d(B);
        return mo8467X(B.mo8563w(), true);
    }

    /* renamed from: X */
    public boolean mo8467X(int i, boolean z) {
        return mo8468Y(i, z, false);
    }

    /* renamed from: Y */
    public boolean mo8468Y(int i, boolean z, boolean z2) {
        if (!mo8471b0(i, z, z2) || !mo8490s()) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public final void mo8469Z(NavBackStackEntry navBackStackEntry, pc2<r37> pc2) {
        vx2.m53591g(navBackStackEntry, "popUpTo");
        vx2.m53591g(pc2, "onComplete");
        int indexOf = mo8499x().indexOf(navBackStackEntry);
        if (indexOf < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pop of ");
            sb.append(navBackStackEntry);
            sb.append(" as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != mo8499x().size()) {
            mo8471b0(mo8499x().get(i).mo8424f().mo8563w(), true, false);
        }
        m8180e0(this, navBackStackEntry, false, (C5808eq) null, 6, (Object) null);
        pc2.invoke();
        mo8497v0();
        mo8490s();
    }

    /* renamed from: a0 */
    public final void mo8470a0(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z, rc2<? super NavBackStackEntry, r37> rc2) {
        this.f6025z = rc2;
        navigator.mo8603j(navBackStackEntry, z);
        this.f6025z = null;
    }

    /* renamed from: b0 */
    public final boolean mo8471b0(int i, boolean z, boolean z2) {
        NavDestination navDestination;
        String str;
        int i2 = i;
        boolean z3 = z2;
        if (mo8499x().isEmpty()) {
            return false;
        }
        ArrayList<Navigator> arrayList = new ArrayList<>();
        Iterator<T> it = CollectionsKt___CollectionsKt.m47353x0(mo8499x()).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            NavDestination f = ((NavBackStackEntry) it.next()).mo8424f();
            Navigator e = this.f6022w.mo11359e(f.mo8547B());
            if (z || f.mo8563w() != i2) {
                arrayList.add(e);
            }
            if (f.mo8563w() == i2) {
                navDestination = f;
                break;
            }
        }
        if (navDestination == null) {
            String b = NavDestination.f6051A.mo8565b(this.f6000a, i2);
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring popBackStack to destination ");
            sb.append(b);
            sb.append(" as it was not found on the current back stack");
            return false;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        C5808eq eqVar = new C5808eq();
        for (Navigator a0 : arrayList) {
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            NavController$popBackStackInternal$2 navController$popBackStackInternal$2 = r0;
            NavController$popBackStackInternal$2 navController$popBackStackInternal$22 = new NavController$popBackStackInternal$2(ref$BooleanRef2, ref$BooleanRef, this, z2, eqVar);
            mo8470a0(a0, mo8499x().last(), z3, navController$popBackStackInternal$2);
            if (!ref$BooleanRef2.element) {
                break;
            }
        }
        if (z3) {
            if (!z) {
                for (NavDestination w : SequencesKt___SequencesKt.m63018B(SequencesKt__SequencesKt.m63015j(navDestination, NavController$popBackStackInternal$3.INSTANCE), new NavController$popBackStackInternal$4(this))) {
                    Map<Integer, String> map = this.f6012m;
                    Integer valueOf = Integer.valueOf(w.mo8563w());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) eqVar.mo42363q();
                    if (navBackStackEntryState != null) {
                        str = navBackStackEntryState.mo8437b();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!eqVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) eqVar.first();
                for (NavDestination w2 : SequencesKt___SequencesKt.m63018B(SequencesKt__SequencesKt.m63015j(mo8494u(navBackStackEntryState2.mo8436a()), NavController$popBackStackInternal$6.INSTANCE), new NavController$popBackStackInternal$7(this))) {
                    this.f6012m.put(Integer.valueOf(w2.mo8563w()), navBackStackEntryState2.mo8437b());
                }
                this.f6013n.put(navBackStackEntryState2.mo8437b(), eqVar);
            }
        }
        mo8497v0();
        return ref$BooleanRef.element;
    }

    /* renamed from: d0 */
    public final void mo8472d0(NavBackStackEntry navBackStackEntry, boolean z, C5808eq<NavBackStackEntryState> eqVar) {
        boolean z2;
        g44 g44;
        t86<Set<NavBackStackEntry>> c;
        Set value;
        NavBackStackEntry last = mo8499x().last();
        if (vx2.m53586b(last, navBackStackEntry)) {
            mo8499x().removeLast();
            NavControllerNavigatorState navControllerNavigatorState = this.f6023x.get(mo8451G().mo11359e(last.mo8424f().mo8547B()));
            boolean z3 = true;
            if (navControllerNavigatorState == null || (c = navControllerNavigatorState.mo11973c()) == null || (value = c.getValue()) == null || !value.contains(last)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && !this.f6011l.containsKey(last)) {
                z3 = false;
            }
            Lifecycle.State b = last.getLifecycle().mo6296b();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (b.isAtLeast(state)) {
                if (z) {
                    last.mo8432m(state);
                    eqVar.addFirst(new NavBackStackEntryState(last));
                }
                if (!z3) {
                    last.mo8432m(Lifecycle.State.DESTROYED);
                    mo8493t0(last);
                } else {
                    last.mo8432m(state);
                }
            }
            if (!z && !z3 && (g44 = this.f6016q) != null) {
                g44.mo20347c(last.mo8425g());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.mo8424f() + ", which is not the top of the back stack (" + last.mo8424f() + ')').toString());
    }

    /* renamed from: f0 */
    public final List<NavBackStackEntry> mo8473f0() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (NavControllerNavigatorState c : this.f6023x.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : c.mo11973c().getValue()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) next;
                if (arrayList.contains(navBackStackEntry) || navBackStackEntry.mo8426h().isAtLeast(Lifecycle.State.STARTED)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            hk0.m45275z(arrayList, arrayList2);
        }
        C5808eq<NavBackStackEntry> x = mo8499x();
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : x) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next2;
            if (arrayList.contains(navBackStackEntry2) || !navBackStackEntry2.mo8426h().isAtLeast(Lifecycle.State.STARTED)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList3.add(next2);
            }
        }
        hk0.m45275z(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((NavBackStackEntry) next3).mo8424f() instanceof NavGraph)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    /* renamed from: g0 */
    public void mo8474g0(C1115b bVar) {
        vx2.m53591g(bVar, "listener");
        this.f6017r.remove(bVar);
    }

    /* renamed from: h0 */
    public void mo8475h0(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f6000a.getClassLoader());
            this.f6004e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f6005f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f6013n.clear();
            int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    this.f6012m.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                    i++;
                    i2++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        Map<String, C5808eq<NavBackStackEntryState>> map = this.f6013n;
                        vx2.m53590f(str, "id");
                        C5808eq eqVar = new C5808eq(parcelableArray.length);
                        Iterator a = C6118jq.m46703a(parcelableArray);
                        while (a.hasNext()) {
                            Parcelable parcelable = (Parcelable) a.next();
                            if (parcelable != null) {
                                eqVar.add((NavBackStackEntryState) parcelable);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                        }
                        map.put(str, eqVar);
                    }
                }
            }
            this.f6006g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    /* renamed from: i0 */
    public final boolean mo8476i0(int i, Bundle bundle, m44 m44, Navigator.C1126a aVar) {
        String str;
        NavBackStackEntry navBackStackEntry;
        NavDestination f;
        if (!this.f6012m.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str2 = this.f6012m.get(Integer.valueOf(i));
        hk0.m45269D(this.f6012m.values(), new NavController$restoreStateInternal$1(str2));
        List<NavBackStackEntry> J = mo8454J((C5808eq) t07.m52025d(this.f6013n).remove(str2));
        ArrayList<List> arrayList = new ArrayList<>();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList<>();
        for (T next : J) {
            if (!(((NavBackStackEntry) next).mo8424f() instanceof NavGraph)) {
                arrayList2.add(next);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) CollectionsKt___CollectionsKt.m47342m0(arrayList);
            if (list == null || (navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.m47340k0(list)) == null || (f = navBackStackEntry.mo8424f()) == null) {
                str = null;
            } else {
                str = f.mo8547B();
            }
            if (vx2.m53586b(str, navBackStackEntry2.mo8424f().mo8547B())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(ck0.m33068p(navBackStackEntry2));
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List list2 : arrayList) {
            mo8463T(this.f6022w.mo11359e(((NavBackStackEntry) CollectionsKt___CollectionsKt.m47329Z(list2)).mo8424f().mo8547B()), list2, m44, aVar, new NavController$restoreStateInternal$4(ref$BooleanRef, J, new Ref$IntRef(), this, bundle));
        }
        return ref$BooleanRef.element;
    }

    /* renamed from: j0 */
    public Bundle mo8477j0() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f6022w.mo11360f().entrySet()) {
            String str = (String) next.getKey();
            Bundle i = ((Navigator) next.getValue()).mo8602i();
            if (i != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!mo8499x().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[mo8499x().size()];
            Iterator<NavBackStackEntry> it = mo8499x().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new NavBackStackEntryState(it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f6012m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f6012m.size()];
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (Map.Entry next2 : this.f6012m.entrySet()) {
                iArr[i3] = ((Number) next2.getKey()).intValue();
                arrayList2.add((String) next2.getValue());
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f6013n.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry next3 : this.f6013n.entrySet()) {
                String str2 = (String) next3.getKey();
                C5808eq eqVar = (C5808eq) next3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[eqVar.size()];
                int i4 = 0;
                for (Object next4 : eqVar) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ck0.m33072t();
                    }
                    parcelableArr2[i4] = (NavBackStackEntryState) next4;
                    i4 = i5;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f6006g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f6006g);
        }
        return bundle;
    }

    /* renamed from: k0 */
    public void mo8478k0(int i) {
        mo8482n0(mo8450F().mo22640b(i), (Bundle) null);
    }

    /* renamed from: l0 */
    public void mo8479l0(int i, Bundle bundle) {
        mo8482n0(mo8450F().mo22640b(i), bundle);
    }

    /* renamed from: m0 */
    public void mo8480m0(NavGraph navGraph) {
        vx2.m53591g(navGraph, "graph");
        mo8482n0(navGraph, (Bundle) null);
    }

    /* renamed from: n */
    public final void mo8481n(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavDestination navDestination2;
        Bundle bundle2;
        List<NavBackStackEntry> list2;
        C5808eq<NavBackStackEntry> eqVar;
        NavBackStackEntry navBackStackEntry2;
        NavDestination navDestination3;
        NavDestination navDestination4;
        NavBackStackEntry navBackStackEntry3;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntry4;
        Bundle bundle3;
        List<NavBackStackEntry> list3;
        NavDestination navDestination5 = navDestination;
        Bundle bundle4 = bundle;
        NavBackStackEntry navBackStackEntry5 = navBackStackEntry;
        List<NavBackStackEntry> list4 = list;
        NavDestination f = navBackStackEntry.mo8424f();
        if (!(f instanceof w42)) {
            while (!mo8499x().isEmpty() && (mo8499x().last().mo8424f() instanceof w42)) {
                if (!m8177c0(this, mo8499x().last().mo8424f().mo8563w(), true, false, 4, (Object) null)) {
                    break;
                }
            }
        }
        C5808eq eqVar2 = new C5808eq();
        NavBackStackEntry navBackStackEntry6 = null;
        if (navDestination5 instanceof NavGraph) {
            NavGraph navGraph2 = f;
            while (true) {
                vx2.m53588d(navGraph2);
                NavGraph D = navGraph2.mo8548D();
                if (D != null) {
                    ListIterator<NavBackStackEntry> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntry4 = null;
                            break;
                        }
                        navBackStackEntry4 = listIterator.previous();
                        if (vx2.m53586b(navBackStackEntry4.mo8424f(), D)) {
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry7 = navBackStackEntry4;
                    if (navBackStackEntry7 == null) {
                        navDestination2 = f;
                        list3 = list4;
                        bundle3 = bundle4;
                        NavBackStackEntry b = NavBackStackEntry.C1109a.m8164b(NavBackStackEntry.f5972I, this.f6000a, D, bundle, mo8449E(), this.f6016q, (String) null, (Bundle) null, 96, (Object) null);
                        navBackStackEntry2 = navBackStackEntry5;
                        navBackStackEntry7 = b;
                    } else {
                        navDestination2 = f;
                        list3 = list4;
                        navBackStackEntry2 = navBackStackEntry5;
                        bundle3 = bundle4;
                    }
                    eqVar2.addFirst(navBackStackEntry7);
                    if (!(!mo8499x().isEmpty()) || mo8499x().last().mo8424f() != D) {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = D;
                        eqVar = eqVar2;
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = D;
                        eqVar = eqVar2;
                        m8180e0(this, mo8499x().last(), false, (C5808eq) null, 6, (Object) null);
                    }
                } else {
                    navGraph = D;
                    eqVar = eqVar2;
                    navDestination2 = f;
                    list2 = list4;
                    navBackStackEntry2 = navBackStackEntry5;
                    bundle2 = bundle4;
                }
                if (navGraph == null || navGraph == navDestination5) {
                    break;
                }
                navBackStackEntry5 = navBackStackEntry2;
                navGraph2 = navGraph;
                eqVar2 = eqVar;
                bundle4 = bundle2;
                list4 = list2;
                f = navDestination2;
            }
        } else {
            eqVar = eqVar2;
            navDestination2 = f;
            list2 = list4;
            navBackStackEntry2 = navBackStackEntry5;
            bundle2 = bundle4;
        }
        if (eqVar.isEmpty()) {
            navDestination3 = navDestination2;
        } else {
            navDestination3 = ((NavBackStackEntry) eqVar.first()).mo8424f();
        }
        while (navDestination3 != null && mo8494u(navDestination3.mo8563w()) == null) {
            navDestination3 = navDestination3.mo8548D();
            if (navDestination3 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntry3 = null;
                        break;
                    }
                    navBackStackEntry3 = listIterator2.previous();
                    if (vx2.m53586b(navBackStackEntry3.mo8424f(), navDestination3)) {
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry8 = navBackStackEntry3;
                if (navBackStackEntry8 == null) {
                    navBackStackEntry8 = NavBackStackEntry.C1109a.m8164b(NavBackStackEntry.f5972I, this.f6000a, navDestination3, navDestination3.mo8558n(bundle2), mo8449E(), this.f6016q, (String) null, (Bundle) null, 96, (Object) null);
                }
                eqVar.addFirst(navBackStackEntry8);
            }
        }
        if (!eqVar.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) eqVar.first()).mo8424f();
        }
        while (!mo8499x().isEmpty() && (mo8499x().last().mo8424f() instanceof NavGraph) && ((NavGraph) mo8499x().last().mo8424f()).mo8574S(navDestination2.mo8563w(), false) == null) {
            m8180e0(this, mo8499x().last(), false, (C5808eq) null, 6, (Object) null);
        }
        NavBackStackEntry q = mo8499x().mo42363q();
        if (q == null) {
            q = (NavBackStackEntry) eqVar.mo42363q();
        }
        if (q != null) {
            navDestination4 = q.mo8424f();
        } else {
            navDestination4 = null;
        }
        if (!vx2.m53586b(navDestination4, this.f6003d)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry previous = listIterator3.previous();
                NavDestination f2 = previous.mo8424f();
                NavGraph navGraph3 = this.f6003d;
                vx2.m53588d(navGraph3);
                if (vx2.m53586b(f2, navGraph3)) {
                    navBackStackEntry6 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry9 = navBackStackEntry6;
            if (navBackStackEntry9 == null) {
                NavBackStackEntry.C1109a aVar = NavBackStackEntry.f5972I;
                Context context = this.f6000a;
                NavGraph navGraph4 = this.f6003d;
                vx2.m53588d(navGraph4);
                NavGraph navGraph5 = this.f6003d;
                vx2.m53588d(navGraph5);
                navBackStackEntry9 = NavBackStackEntry.C1109a.m8164b(aVar, context, navGraph4, navGraph5.mo8558n(bundle2), mo8449E(), this.f6016q, (String) null, (Bundle) null, 96, (Object) null);
            }
            eqVar.addFirst(navBackStackEntry9);
        }
        for (NavBackStackEntry navBackStackEntry10 : eqVar) {
            NavControllerNavigatorState navControllerNavigatorState = this.f6023x.get(this.f6022w.mo11359e(navBackStackEntry10.mo8424f().mo8547B()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.mo8506k(navBackStackEntry10);
            } else {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.mo8547B() + " should already be created").toString());
            }
        }
        mo8499x().addAll(eqVar);
        mo8499x().add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry11 : CollectionsKt___CollectionsKt.m47351v0(eqVar, navBackStackEntry2)) {
            NavGraph D2 = navBackStackEntry11.mo8424f().mo8548D();
            if (D2 != null) {
                mo8455L(navBackStackEntry11, mo8500y(D2.mo8563w()));
            }
        }
    }

    /* renamed from: n0 */
    public void mo8482n0(NavGraph navGraph, Bundle bundle) {
        boolean z;
        vx2.m53591g(navGraph, "graph");
        if (!vx2.m53586b(this.f6003d, navGraph)) {
            NavGraph navGraph2 = this.f6003d;
            if (navGraph2 != null) {
                for (Integer num : new ArrayList(this.f6012m.keySet())) {
                    vx2.m53590f(num, "id");
                    mo8486q(num.intValue());
                }
                m8177c0(this, navGraph2.mo8563w(), true, false, 4, (Object) null);
            }
            this.f6003d = navGraph;
            mo8465V(bundle);
            return;
        }
        int v = navGraph.mo8577V().mo21766v();
        for (int i = 0; i < v; i++) {
            NavDestination w = navGraph.mo8577V().mo21767w(i);
            NavGraph navGraph3 = this.f6003d;
            vx2.m53588d(navGraph3);
            navGraph3.mo8577V().mo21765u(i, w);
            C5808eq<NavBackStackEntry> x = mo8499x();
            ArrayList<NavBackStackEntry> arrayList = new ArrayList<>();
            for (T next : x) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) next;
                if (w == null || navBackStackEntry.mo8424f().mo8563w() != w.mo8563w()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (NavBackStackEntry l : arrayList) {
                vx2.m53590f(w, "newDestination");
                l.mo8431l(w);
            }
        }
    }

    /* renamed from: o0 */
    public void mo8483o0(ug3 ug3) {
        Lifecycle lifecycle;
        vx2.m53591g(ug3, ENS.FUNC_OWNER);
        if (!vx2.m53586b(ug3, this.f6014o)) {
            ug3 ug32 = this.f6014o;
            if (!(ug32 == null || (lifecycle = ug32.getLifecycle()) == null)) {
                lifecycle.mo6297c(this.f6019t);
            }
            this.f6014o = ug3;
            ug3.getLifecycle().mo6295a(this.f6019t);
        }
    }

    /* renamed from: p */
    public void mo8484p(C1115b bVar) {
        vx2.m53591g(bVar, "listener");
        this.f6017r.add(bVar);
        if (!mo8499x().isEmpty()) {
            NavBackStackEntry last = mo8499x().last();
            bVar.mo38a(this, last.mo8424f(), last.mo8421d());
        }
    }

    /* renamed from: p0 */
    public void mo8485p0(OnBackPressedDispatcher onBackPressedDispatcher) {
        vx2.m53591g(onBackPressedDispatcher, "dispatcher");
        if (!vx2.m53586b(onBackPressedDispatcher, this.f6015p)) {
            ug3 ug3 = this.f6014o;
            if (ug3 != null) {
                this.f6020u.mo28062d();
                this.f6015p = onBackPressedDispatcher;
                onBackPressedDispatcher.mo912a(ug3, this.f6020u);
                Lifecycle lifecycle = ug3.getLifecycle();
                lifecycle.mo6297c(this.f6019t);
                lifecycle.mo6295a(this.f6019t);
                return;
            }
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
    }

    /* renamed from: q */
    public final boolean mo8486q(int i) {
        for (NavControllerNavigatorState i2 : this.f6023x.values()) {
            i2.mo11976i(true);
        }
        boolean i0 = mo8476i0(i, (Bundle) null, (m44) null, (Navigator.C1126a) null);
        for (NavControllerNavigatorState i3 : this.f6023x.values()) {
            i3.mo11976i(false);
        }
        if (!i0 || !mo8471b0(i, true, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: q0 */
    public void mo8487q0(gd7 gd7) {
        vx2.m53591g(gd7, "viewModelStore");
        g44 g44 = this.f6016q;
        g44.C2343b bVar = g44.f12174b;
        if (!vx2.m53586b(g44, bVar.mo20349a(gd7))) {
            if (mo8499x().isEmpty()) {
                this.f6016q = bVar.mo20349a(gd7);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
    }

    /* renamed from: r */
    public h44 mo8488r() {
        return new h44(this);
    }

    /* renamed from: r0 */
    public final boolean mo8489r0() {
        boolean z;
        Bundle bundle;
        int i = 0;
        if (!this.f6006g) {
            return false;
        }
        Activity activity = this.f6001b;
        vx2.m53588d(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        vx2.m53588d(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        vx2.m53588d(intArray);
        List<Integer> x0 = ArraysKt___ArraysKt.m47298x0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int intValue = ((Number) hk0.m45272G(x0)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle2 = (Bundle) hk0.m45272G(parcelableArrayList);
        }
        if (x0.isEmpty()) {
            return false;
        }
        NavDestination v = mo8496v(mo8448D(), intValue);
        if (v instanceof NavGraph) {
            intValue = NavGraph.f6067M.mo8586a((NavGraph) v).mo8563w();
        }
        NavDestination B = mo8446B();
        if (B == null || intValue != B.mo8563w()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        h44 r = mo8488r();
        Bundle a = x50.m29897a(wy6.m54142a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle3 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle3 != null) {
            a.putAll(bundle3);
        }
        r.mo20947e(a);
        for (T next : x0) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            int intValue2 = ((Number) next).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i);
            } else {
                bundle = null;
            }
            r.mo20943a(intValue2, bundle);
            i = i2;
        }
        r.mo20944b().mo21307s();
        Activity activity2 = this.f6001b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo8490s() {
        while (!mo8499x().isEmpty() && (mo8499x().last().mo8424f() instanceof NavGraph)) {
            m8180e0(this, mo8499x().last(), false, (C5808eq) null, 6, (Object) null);
        }
        NavBackStackEntry s = mo8499x().mo42371s();
        if (s != null) {
            this.f5996C.add(s);
        }
        this.f5995B++;
        mo8495u0();
        int i = this.f5995B - 1;
        this.f5995B = i;
        if (i == 0) {
            List<T> M0 = CollectionsKt___CollectionsKt.m47313M0(this.f5996C);
            this.f5996C.clear();
            for (T t : M0) {
                Iterator<C1115b> it = this.f6017r.iterator();
                while (it.hasNext()) {
                    it.next().mo38a(this, t.mo8424f(), t.mo8421d());
                }
                this.f5998E.mo55645b(t);
            }
            this.f6008i.mo55645b(mo8473f0());
        }
        if (s != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s0 */
    public final boolean mo8491s0() {
        NavDestination B = mo8446B();
        vx2.m53588d(B);
        int w = B.mo8563w();
        for (NavGraph D = B.mo8548D(); D != null; D = D.mo8548D()) {
            if (D.mo8580Z() != w) {
                Bundle bundle = new Bundle();
                Activity activity = this.f6001b;
                if (activity != null) {
                    vx2.m53588d(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f6001b;
                        vx2.m53588d(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f6001b;
                            vx2.m53588d(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            NavGraph navGraph = this.f6003d;
                            vx2.m53588d(navGraph);
                            Activity activity4 = this.f6001b;
                            vx2.m53588d(activity4);
                            Intent intent = activity4.getIntent();
                            vx2.m53590f(intent, "activity!!.intent");
                            NavDestination.C1124a F = navGraph.mo8550F(new i44(intent));
                            if (F != null) {
                                bundle.putAll(F.mo8569d().mo8558n(F.mo8570e()));
                            }
                        }
                    }
                }
                h44.m18571g(new h44(this), D.mo8563w(), (Bundle) null, 2, (Object) null).mo20947e(bundle).mo20944b().mo21307s();
                Activity activity5 = this.f6001b;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            w = D.mo8563w();
        }
        return false;
    }

    /* renamed from: t */
    public void mo8492t(boolean z) {
        this.f6021v = z;
        mo8497v0();
    }

    /* renamed from: t0 */
    public final NavBackStackEntry mo8493t0(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "child");
        NavBackStackEntry remove = this.f6010k.remove(navBackStackEntry);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f6011l.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.f6023x.get(this.f6022w.mo11359e(remove.mo8424f().mo8547B()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.mo8503e(remove);
            }
            this.f6011l.remove(remove);
        }
        return remove;
    }

    /* renamed from: u */
    public final NavDestination mo8494u(int i) {
        NavDestination navDestination;
        NavGraph navGraph = this.f6003d;
        if (navGraph == null) {
            return null;
        }
        vx2.m53588d(navGraph);
        if (navGraph.mo8563w() == i) {
            return this.f6003d;
        }
        NavBackStackEntry s = mo8499x().mo42371s();
        if (s == null || (navDestination = s.mo8424f()) == null) {
            navDestination = this.f6003d;
            vx2.m53588d(navDestination);
        }
        return mo8496v(navDestination, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0101  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8495u0() {
        /*
            r11 = this;
            eq r0 = r11.mo8499x()
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47340k0(r0)
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.mo8424f()
            boolean r2 = r1 instanceof p000.w42
            r3 = 0
            if (r2 == 0) goto L_0x003f
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47353x0(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r2.next()
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.mo8424f()
            boolean r5 = r4 instanceof androidx.navigation.NavGraph
            if (r5 != 0) goto L_0x0026
            boolean r5 = r4 instanceof p000.w42
            if (r5 != 0) goto L_0x0026
            goto L_0x0040
        L_0x003f:
            r4 = r3
        L_0x0040:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m47353x0(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x004d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00f7
            java.lang.Object r6 = r5.next()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.lifecycle.Lifecycle$State r7 = r6.mo8426h()
            androidx.navigation.NavDestination r8 = r6.mo8424f()
            if (r1 == 0) goto L_0x00cd
            int r9 = r8.mo8563w()
            int r10 = r1.mo8563w()
            if (r9 != r10) goto L_0x00cd
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r7 == r8) goto L_0x00c8
            b54 r7 = r11.mo8451G()
            androidx.navigation.NavDestination r9 = r6.mo8424f()
            java.lang.String r9 = r9.mo8547B()
            androidx.navigation.Navigator r7 = r7.mo11359e(r9)
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r9 = r11.f6023x
            java.lang.Object r7 = r9.get(r7)
            androidx.navigation.NavController$NavControllerNavigatorState r7 = (androidx.navigation.NavController.NavControllerNavigatorState) r7
            if (r7 == 0) goto L_0x00a2
            t86 r7 = r7.mo11973c()
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r7 = r7.getValue()
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r7.contains(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x00a3
        L_0x00a2:
            r7 = r3
        L_0x00a3:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r7 = p000.vx2.m53586b(r7, r9)
            if (r7 != 0) goto L_0x00c3
            java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger> r7 = r11.f6011l
            java.lang.Object r7 = r7.get(r6)
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            r9 = 0
            if (r7 == 0) goto L_0x00bd
            int r7 = r7.get()
            if (r7 != 0) goto L_0x00bd
            r9 = 1
        L_0x00bd:
            if (r9 != 0) goto L_0x00c3
            r2.put(r6, r8)
            goto L_0x00c8
        L_0x00c3:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            r2.put(r6, r7)
        L_0x00c8:
            androidx.navigation.NavGraph r1 = r1.mo8548D()
            goto L_0x004d
        L_0x00cd:
            if (r4 == 0) goto L_0x00f0
            int r8 = r8.mo8563w()
            int r9 = r4.mo8563w()
            if (r8 != r9) goto L_0x00f0
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r7 != r8) goto L_0x00e3
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            r6.mo8432m(r7)
            goto L_0x00ea
        L_0x00e3:
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r7 == r8) goto L_0x00ea
            r2.put(r6, r8)
        L_0x00ea:
            androidx.navigation.NavGraph r4 = r4.mo8548D()
            goto L_0x004d
        L_0x00f0:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.CREATED
            r6.mo8432m(r7)
            goto L_0x004d
        L_0x00f7:
            java.util.Iterator r0 = r0.iterator()
        L_0x00fb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0117
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            java.lang.Object r3 = r2.get(r1)
            androidx.lifecycle.Lifecycle$State r3 = (androidx.lifecycle.Lifecycle.State) r3
            if (r3 == 0) goto L_0x0113
            r1.mo8432m(r3)
            goto L_0x00fb
        L_0x0113:
            r1.mo8433n()
            goto L_0x00fb
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo8495u0():void");
    }

    /* renamed from: v */
    public final NavDestination mo8496v(NavDestination navDestination, int i) {
        NavGraph navGraph;
        if (navDestination.mo8563w() == i) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            navGraph = navDestination.mo8548D();
            vx2.m53588d(navGraph);
        }
        return navGraph.mo8573R(i);
    }

    /* renamed from: v0 */
    public final void mo8497v0() {
        yg4 yg4 = this.f6020u;
        boolean z = true;
        if (!this.f6021v || mo8447C() <= 1) {
            z = false;
        }
        yg4.mo28064f(z);
    }

    /* renamed from: w */
    public final String mo8498w(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this.f6003d;
        int length = iArr.length;
        int i = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i >= length) {
                return null;
            }
            int i2 = iArr[i];
            if (i == 0) {
                NavGraph navGraph3 = this.f6003d;
                vx2.m53588d(navGraph3);
                if (navGraph3.mo8563w() == i2) {
                    navDestination = this.f6003d;
                }
            } else {
                vx2.m53588d(navGraph2);
                navDestination = navGraph2.mo8573R(i2);
            }
            if (navDestination == null) {
                return NavDestination.f6051A.mo8565b(this.f6000a, i2);
            }
            if (i != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    vx2.m53588d(navGraph);
                    if (!(navGraph.mo8573R(navGraph.mo8580Z()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.mo8573R(navGraph.mo8580Z());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    /* renamed from: x */
    public C5808eq<NavBackStackEntry> mo8499x() {
        return this.f6007h;
    }

    /* renamed from: y */
    public NavBackStackEntry mo8500y(int i) {
        NavBackStackEntry navBackStackEntry;
        boolean z;
        C5808eq<NavBackStackEntry> x = mo8499x();
        ListIterator<NavBackStackEntry> listIterator = x.listIterator(x.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (navBackStackEntry.mo8424f().mo8563w() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + mo8446B()).toString());
    }

    /* renamed from: z */
    public final Context mo8501z() {
        return this.f6000a;
    }
}
