package gr.aueb.cf.ch15.BankApp;

import java.util.UUID;

/**
 * Οι οντότητες Account,OverdraftAccount,JointAccount,OverdraftJointAccount,και User
 * έχουν ένα κοινό πεδίο μεταξύ τους, το id (ή uuid–universal unique identifier)
 * Η κλάση IdentifiableEntity έχει μόνο αυτό το πεδίο και
 * την οποία θα κληρονομούν όλες οι άλλες κλάσεις
 */
public class IdentifiableEntity {
    private String uuid;

    public IdentifiableEntity() {
        uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
