package v1.domain.realtApiDTO;

public class UserError {

    private String userNotFound;
    private String emailDuplicate;
    private String detachingUnattachedSocialNetwork;
    private String notEqualsPasswords;
    private String oldPasswordUsed;
    private String passwordNotSafe;
    private String wrongSmsCode;
    private String unexpectedPhoneVerification;
    private String socialNetworkEmailDuplicate;
    private String socialNetworkPhoneDuplicate;
    private String socialNetworkDuplicate;
    private String phoneDetachRestriction;
    private String attachedPhoneNotFound;
    private String oldPasswordNotCorrect;
    private String duplicateSocialNetworkAttaching;
    private String wrongPassword;
    private String deletedUser;
    private String bannedUser;
    private String smsLimitRestriction;
    private String duplicateMainPhoneBinding;
    private String notFoundRegistration;
    private String phoneVerificationError;
    private String socialNetworkAuthBlocked;
    private String socialNetworkAuthBadRequest;
    private String emailIsNotValid;
    private String phoneIsAlreadyExists;
    private String secondaryPhoneNotFound;
    private String userWithThisRoleAlreadyExists;

    public UserError() {
    }

    public UserError(String userNotFound, String emailDuplicate, String detachingUnattachedSocialNetwork, String notEqualsPasswords, String oldPasswordUsed, String passwordNotSafe, String wrongSmsCode, String unexpectedPhoneVerification, String socialNetworkEmailDuplicate, String socialNetworkPhoneDuplicate, String socialNetworkDuplicate, String phoneDetachRestriction, String attachedPhoneNotFound, String oldPasswordNotCorrect, String duplicateSocialNetworkAttaching, String wrongPassword, String deletedUser, String bannedUser, String smsLimitRestriction, String duplicateMainPhoneBinding, String notFoundRegistration, String phoneVerificationError, String socialNetworkAuthBlocked, String socialNetworkAuthBadRequest, String emailIsNotValid, String phoneIsAlreadyExists, String secondaryPhoneNotFound, String userWithThisRoleAlreadyExists) {
        this.userNotFound = userNotFound;
        this.emailDuplicate = emailDuplicate;
        this.detachingUnattachedSocialNetwork = detachingUnattachedSocialNetwork;
        this.notEqualsPasswords = notEqualsPasswords;
        this.oldPasswordUsed = oldPasswordUsed;
        this.passwordNotSafe = passwordNotSafe;
        this.wrongSmsCode = wrongSmsCode;
        this.unexpectedPhoneVerification = unexpectedPhoneVerification;
        this.socialNetworkEmailDuplicate = socialNetworkEmailDuplicate;
        this.socialNetworkPhoneDuplicate = socialNetworkPhoneDuplicate;
        this.socialNetworkDuplicate = socialNetworkDuplicate;
        this.phoneDetachRestriction = phoneDetachRestriction;
        this.attachedPhoneNotFound = attachedPhoneNotFound;
        this.oldPasswordNotCorrect = oldPasswordNotCorrect;
        this.duplicateSocialNetworkAttaching = duplicateSocialNetworkAttaching;
        this.wrongPassword = wrongPassword;
        this.deletedUser = deletedUser;
        this.bannedUser = bannedUser;
        this.smsLimitRestriction = smsLimitRestriction;
        this.duplicateMainPhoneBinding = duplicateMainPhoneBinding;
        this.notFoundRegistration = notFoundRegistration;
        this.phoneVerificationError = phoneVerificationError;
        this.socialNetworkAuthBlocked = socialNetworkAuthBlocked;
        this.socialNetworkAuthBadRequest = socialNetworkAuthBadRequest;
        this.emailIsNotValid = emailIsNotValid;
        this.phoneIsAlreadyExists = phoneIsAlreadyExists;
        this.secondaryPhoneNotFound = secondaryPhoneNotFound;
        this.userWithThisRoleAlreadyExists = userWithThisRoleAlreadyExists;
    }

    public String getUserNotFound() {
        return userNotFound;
    }

    public void setUserNotFound(String userNotFound) {
        this.userNotFound = userNotFound;
    }

    public String getEmailDuplicate() {
        return emailDuplicate;
    }

    public void setEmailDuplicate(String emailDuplicate) {
        this.emailDuplicate = emailDuplicate;
    }

    public String getDetachingUnattachedSocialNetwork() {
        return detachingUnattachedSocialNetwork;
    }

    public void setDetachingUnattachedSocialNetwork(String detachingUnattachedSocialNetwork) {
        this.detachingUnattachedSocialNetwork = detachingUnattachedSocialNetwork;
    }

    public String getNotEqualsPasswords() {
        return notEqualsPasswords;
    }

    public void setNotEqualsPasswords(String notEqualsPasswords) {
        this.notEqualsPasswords = notEqualsPasswords;
    }

    public String getOldPasswordUsed() {
        return oldPasswordUsed;
    }

    public void setOldPasswordUsed(String oldPasswordUsed) {
        this.oldPasswordUsed = oldPasswordUsed;
    }

    public String getPasswordNotSafe() {
        return passwordNotSafe;
    }

    public void setPasswordNotSafe(String passwordNotSafe) {
        this.passwordNotSafe = passwordNotSafe;
    }

    public String getWrongSmsCode() {
        return wrongSmsCode;
    }

    public void setWrongSmsCode(String wrongSmsCode) {
        this.wrongSmsCode = wrongSmsCode;
    }

    public String getUnexpectedPhoneVerification() {
        return unexpectedPhoneVerification;
    }

    public void setUnexpectedPhoneVerification(String unexpectedPhoneVerification) {
        this.unexpectedPhoneVerification = unexpectedPhoneVerification;
    }

    public String getSocialNetworkEmailDuplicate() {
        return socialNetworkEmailDuplicate;
    }

    public void setSocialNetworkEmailDuplicate(String socialNetworkEmailDuplicate) {
        this.socialNetworkEmailDuplicate = socialNetworkEmailDuplicate;
    }

    public String getSocialNetworkPhoneDuplicate() {
        return socialNetworkPhoneDuplicate;
    }

    public void setSocialNetworkPhoneDuplicate(String socialNetworkPhoneDuplicate) {
        this.socialNetworkPhoneDuplicate = socialNetworkPhoneDuplicate;
    }

    public String getSocialNetworkDuplicate() {
        return socialNetworkDuplicate;
    }

    public void setSocialNetworkDuplicate(String socialNetworkDuplicate) {
        this.socialNetworkDuplicate = socialNetworkDuplicate;
    }

    public String getPhoneDetachRestriction() {
        return phoneDetachRestriction;
    }

    public void setPhoneDetachRestriction(String phoneDetachRestriction) {
        this.phoneDetachRestriction = phoneDetachRestriction;
    }

    public String getAttachedPhoneNotFound() {
        return attachedPhoneNotFound;
    }

    public void setAttachedPhoneNotFound(String attachedPhoneNotFound) {
        this.attachedPhoneNotFound = attachedPhoneNotFound;
    }

    public String getOldPasswordNotCorrect() {
        return oldPasswordNotCorrect;
    }

    public void setOldPasswordNotCorrect(String oldPasswordNotCorrect) {
        this.oldPasswordNotCorrect = oldPasswordNotCorrect;
    }

    public String getDuplicateSocialNetworkAttaching() {
        return duplicateSocialNetworkAttaching;
    }

    public void setDuplicateSocialNetworkAttaching(String duplicateSocialNetworkAttaching) {
        this.duplicateSocialNetworkAttaching = duplicateSocialNetworkAttaching;
    }

    public String getWrongPassword() {
        return wrongPassword;
    }

    public void setWrongPassword(String wrongPassword) {
        this.wrongPassword = wrongPassword;
    }

    public String getDeletedUser() {
        return deletedUser;
    }

    public void setDeletedUser(String deletedUser) {
        this.deletedUser = deletedUser;
    }

    public String getBannedUser() {
        return bannedUser;
    }

    public void setBannedUser(String bannedUser) {
        this.bannedUser = bannedUser;
    }

    public String getSmsLimitRestriction() {
        return smsLimitRestriction;
    }

    public void setSmsLimitRestriction(String smsLimitRestriction) {
        this.smsLimitRestriction = smsLimitRestriction;
    }

    public String getDuplicateMainPhoneBinding() {
        return duplicateMainPhoneBinding;
    }

    public void setDuplicateMainPhoneBinding(String duplicateMainPhoneBinding) {
        this.duplicateMainPhoneBinding = duplicateMainPhoneBinding;
    }

    public String getNotFoundRegistration() {
        return notFoundRegistration;
    }

    public void setNotFoundRegistration(String notFoundRegistration) {
        this.notFoundRegistration = notFoundRegistration;
    }

    public String getPhoneVerificationError() {
        return phoneVerificationError;
    }

    public void setPhoneVerificationError(String phoneVerificationError) {
        this.phoneVerificationError = phoneVerificationError;
    }

    public String getSocialNetworkAuthBlocked() {
        return socialNetworkAuthBlocked;
    }

    public void setSocialNetworkAuthBlocked(String socialNetworkAuthBlocked) {
        this.socialNetworkAuthBlocked = socialNetworkAuthBlocked;
    }

    public String getSocialNetworkAuthBadRequest() {
        return socialNetworkAuthBadRequest;
    }

    public void setSocialNetworkAuthBadRequest(String socialNetworkAuthBadRequest) {
        this.socialNetworkAuthBadRequest = socialNetworkAuthBadRequest;
    }

    public String getEmailIsNotValid() {
        return emailIsNotValid;
    }

    public void setEmailIsNotValid(String emailIsNotValid) {
        this.emailIsNotValid = emailIsNotValid;
    }

    public String getPhoneIsAlreadyExists() {
        return phoneIsAlreadyExists;
    }

    public void setPhoneIsAlreadyExists(String phoneIsAlreadyExists) {
        this.phoneIsAlreadyExists = phoneIsAlreadyExists;
    }

    public String getSecondaryPhoneNotFound() {
        return secondaryPhoneNotFound;
    }

    public void setSecondaryPhoneNotFound(String secondaryPhoneNotFound) {
        this.secondaryPhoneNotFound = secondaryPhoneNotFound;
    }

    public String getUserWithThisRoleAlreadyExists() {
        return userWithThisRoleAlreadyExists;
    }

    public void setUserWithThisRoleAlreadyExists(String userWithThisRoleAlreadyExists) {
        this.userWithThisRoleAlreadyExists = userWithThisRoleAlreadyExists;
    }
}
