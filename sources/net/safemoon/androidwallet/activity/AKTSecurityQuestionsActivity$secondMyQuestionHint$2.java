package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AKTSecurityQuestionsActivity.kt */
public final class AKTSecurityQuestionsActivity$secondMyQuestionHint$2 extends Lambda implements pc2<String> {
    public final /* synthetic */ AKTSecurityQuestionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSecurityQuestionsActivity$secondMyQuestionHint$2(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
        super(0);
        this.this$0 = aKTSecurityQuestionsActivity;
    }

    public final String invoke() {
        return this.this$0.getString(R.string.akt_register_second_question_text_hint);
    }
}
