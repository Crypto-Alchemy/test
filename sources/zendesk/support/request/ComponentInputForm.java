package zendesk.support.request;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import zendesk.belvedere.KeyboardHelper;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

class ComponentInputForm implements Listener<InputFormModel>, RequestViewConversationsDisabled.MenuItemsDelegate, KeyboardHelper.C9791c {
    private final ActionFactory actionFactory;
    private final AttachmentHelper attachmentHelper;
    private final Dispatcher dispatcher;
    private final EditText emailField;
    private final TextInputLayout emailLayout;
    private final Validator<String> emailValidator;
    /* access modifiers changed from: private */
    public boolean inlineValidation = false;
    /* access modifiers changed from: private */
    public final View logo;
    private final EditText messageField;
    private final TextInputLayout messageLayout;
    private final EditText nameField;
    private final TextInputLayout nameLayout;
    private MenuItem sendButton;

    public static class EditTextTextWatcher implements TextWatcher {
        private final ComponentInputForm componentInputForm;

        private EditTextTextWatcher(ComponentInputForm componentInputForm2) {
            this.componentInputForm = componentInputForm2;
        }

        public static void install(ComponentInputForm componentInputForm2, EditText... editTextArr) {
            for (EditText addTextChangedListener : editTextArr) {
                addTextChangedListener.addTextChangedListener(new EditTextTextWatcher(componentInputForm2));
            }
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.componentInputForm.inlineValidation) {
                this.componentInputForm.updateEmailValidation();
            }
            this.componentInputForm.updateSendButton();
        }
    }

    public static class EmailFieldFocusListener implements View.OnFocusChangeListener {
        private final ComponentInputForm componentInputForm;
        private final EditText editText;

        private EmailFieldFocusListener(ComponentInputForm componentInputForm2, EditText editText2) {
            this.componentInputForm = componentInputForm2;
            this.editText = editText2;
        }

        public static void install(ComponentInputForm componentInputForm2, EditText editText2) {
            editText2.setOnFocusChangeListener(new EmailFieldFocusListener(componentInputForm2, editText2));
        }

        public void onFocusChange(View view, boolean z) {
            if (!z && kb6.m46949b(this.editText.getText().toString())) {
                this.componentInputForm.updateEmailValidation();
                this.componentInputForm.updateSendButton();
            }
        }
    }

    public static class InputFormModel {
        private final boolean hasIdentityEmailAddress;
        private final boolean hasIdentityName;
        private final boolean isLoading;
        private final boolean neverRequestEmail;
        private final String referrerUrl;
        private final boolean showZendeskLogo;

        public InputFormModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
            this.neverRequestEmail = z;
            this.hasIdentityEmailAddress = z2;
            this.hasIdentityName = z3;
            this.isLoading = z4;
            this.showZendeskLogo = z5;
            this.referrerUrl = str;
        }

        private boolean isEmailFieldEnabled() {
            if (this.hasIdentityEmailAddress || this.neverRequestEmail) {
                return false;
            }
            return true;
        }

        private boolean isNameFieldEnabled() {
            return !this.hasIdentityName;
        }

        public int getEmailFieldVisibility() {
            if (isEmailFieldEnabled()) {
                return 0;
            }
            return 8;
        }

        public int getLogoVisibility() {
            if (isLogoEnabled()) {
                return 0;
            }
            return 8;
        }

        public int getMessageFieldVisibility() {
            return 0;
        }

        public int getNameFieldVisibility() {
            if (isNameFieldEnabled()) {
                return 0;
            }
            return 8;
        }

        public String getReferrerUrl() {
            return this.referrerUrl;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        public boolean isLogoEnabled() {
            return this.showZendeskLogo;
        }
    }

    public static class InputFormSelector implements StateSelector<InputFormModel> {
        public InputFormModel selectData(State state) {
            StateSettings settings = StateConfig.fromState(state).getSettings();
            return new InputFormModel(settings.isNeverRequestEmailOn(), settings.hasIdentityEmailAddress(), settings.hasIdentityName(), StateProgress.fomState(state).getRunningRequests() > 0, settings.isShowZendeskLogo(), settings.getReferrerUrl());
        }
    }

    public interface Validator<T> {
        boolean isValid(T t);
    }

    public ComponentInputForm(View view, EditText editText, TextInputLayout textInputLayout, EditText editText2, TextInputLayout textInputLayout2, Validator<String> validator, EditText editText3, TextInputLayout textInputLayout3, Dispatcher dispatcher2, ActionFactory actionFactory2, AttachmentHelper attachmentHelper2) {
        this.logo = view;
        this.nameField = editText;
        this.emailField = editText2;
        this.messageField = editText3;
        this.nameLayout = textInputLayout;
        this.emailLayout = textInputLayout2;
        this.messageLayout = textInputLayout3;
        this.emailValidator = validator;
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.attachmentHelper = attachmentHelper2;
        EditTextTextWatcher.install(this, editText, editText2, editText3);
        EmailFieldFocusListener.install(this, editText2);
    }

    public static ComponentInputForm create(View view, Dispatcher dispatcher2, ActionFactory actionFactory2, AttachmentHelper attachmentHelper2) {
        C100931 r6 = new Validator<String>() {
            public boolean isValid(String str) {
                return ym4.f20308j.matcher(str).matches();
            }
        };
        EditText editText = (EditText) view.findViewById(l35.request_name_field);
        EditText editText2 = (EditText) view.findViewById(l35.request_email_field);
        EditText editText3 = (EditText) view.findViewById(l35.request_message_field);
        return new ComponentInputForm(view.findViewById(l35.request_zendesk_logo), editText, (TextInputLayout) view.findViewById(l35.request_name_layout), editText2, (TextInputLayout) view.findViewById(l35.request_email_layout), r6, editText3, (TextInputLayout) view.findViewById(l35.request_message_layout), dispatcher2, actionFactory2, attachmentHelper2);
    }

    private boolean doFieldsContainText() {
        boolean z;
        boolean z2;
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        if (!isNameFieldVisible() || kb6.m46949b(obj)) {
            z = true;
        } else {
            z = false;
        }
        if (!isEmailFieldVisible() || kb6.m46949b(obj2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean b = kb6.m46949b(obj3);
        if (!z || !z2 || !b) {
            return false;
        }
        return true;
    }

    private boolean isEmailFieldVisible() {
        if (this.emailLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private boolean isEmailInputValid() {
        boolean isEmailFieldVisible = isEmailFieldVisible();
        String obj = this.emailField.getText().toString();
        if (!isEmailFieldVisible || this.emailValidator.isValid(obj)) {
            return true;
        }
        return false;
    }

    private boolean isNameFieldVisible() {
        if (this.nameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private void setSendButtonEnabled(boolean z) {
        if (this.sendButton != null) {
            int i = 255;
            if (!z) {
                i = (this.messageLayout.getContext().getResources().getInteger(x35.zs_request_menu_send_btn_alpha_inactive) * 255) / 100;
            }
            this.sendButton.getIcon().setAlpha(i);
            this.sendButton.setEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    public void updateEmailValidation() {
        if (isEmailInputValid()) {
            this.emailLayout.setError((CharSequence) null);
            return;
        }
        this.inlineValidation = true;
        this.emailLayout.setError(this.emailField.getContext().getString(o45.error_msg_invalid_email));
    }

    /* access modifiers changed from: private */
    public void updateSendButton() {
        boolean z;
        if (!this.inlineValidation) {
            z = doFieldsContainText();
        } else if (!doFieldsContainText() || !isEmailInputValid()) {
            z = false;
        } else {
            z = true;
        }
        setSendButtonEnabled(z);
    }

    public StateSelector<InputFormModel> getSelector() {
        return new InputFormSelector();
    }

    public boolean hasUnsavedInput() {
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        if (this.nameField.isEnabled() && kb6.m46949b(obj)) {
            return true;
        }
        if ((!this.emailField.isEnabled() || !kb6.m46949b(obj2)) && !kb6.m46949b(obj3) && !kj0.m47118i(this.attachmentHelper.getSelectedAttachments())) {
            return false;
        }
        return true;
    }

    public void onKeyboardDismissed() {
        if (this.logo.getVisibility() != 8) {
            this.logo.post(new Runnable() {
                public void run() {
                    ComponentInputForm.this.logo.setVisibility(0);
                }
            });
        }
    }

    public void onKeyboardVisible() {
        if (this.logo.getVisibility() != 8) {
            this.logo.setVisibility(4);
        }
    }

    public void onMenuItemsClicked(MenuItem menuItem) {
        if (menuItem.getItemId() == l35.request_conversations_disabled_menu_ic_send) {
            onSendMessageRequested();
        }
    }

    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.sendButton = menuItem;
        updateSendButton();
    }

    public void onSendMessageRequested() {
        if (!doFieldsContainText() || !isEmailInputValid()) {
            updateEmailValidation();
            updateSendButton();
            return;
        }
        if (isNameFieldVisible() || isEmailFieldVisible()) {
            this.dispatcher.dispatch(this.actionFactory.updateNameEmailAsync(this.nameField.getText().toString(), this.emailField.getText().toString()));
        }
        String obj = this.messageField.getText().toString();
        List<TypeT> e = kj0.m47114e(this.attachmentHelper.getSelectedAttachments());
        this.dispatcher.dispatch(this.actionFactory.clearMessages());
        this.dispatcher.dispatch(this.actionFactory.createCommentAsync(obj, e));
    }

    public void update(final InputFormModel inputFormModel) {
        this.logo.setVisibility(inputFormModel.getLogoVisibility());
        this.nameLayout.setVisibility(inputFormModel.getNameFieldVisibility());
        this.emailLayout.setVisibility(inputFormModel.getEmailFieldVisibility());
        this.messageLayout.setVisibility(inputFormModel.getMessageFieldVisibility());
        this.nameLayout.setEnabled(!inputFormModel.isLoading());
        this.emailLayout.setEnabled(!inputFormModel.isLoading());
        this.messageLayout.setEnabled(!inputFormModel.isLoading());
        if (inputFormModel.isLoading()) {
            setSendButtonEnabled(false);
            return;
        }
        C100942 r0 = null;
        if (inputFormModel.isLogoEnabled() && kb6.m46949b(inputFormModel.getReferrerUrl())) {
            r0 = new View.OnClickListener() {
                public void onClick(View view) {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(inputFormModel.getReferrerUrl())));
                }
            };
        }
        this.logo.setOnClickListener(r0);
        updateSendButton();
    }
}
