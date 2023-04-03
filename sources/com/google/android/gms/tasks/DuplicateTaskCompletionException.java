package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: of */
    public static IllegalStateException m34512of(tl6<?> tl6) {
        String str;
        if (!tl6.mo48144o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception k = tl6.mo48140k();
        if (k != null) {
            str = "failure";
        } else if (tl6.mo48145p()) {
            str = "result ".concat(String.valueOf(tl6.mo48141l()));
        } else if (tl6.mo48143n()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), k);
    }
}
