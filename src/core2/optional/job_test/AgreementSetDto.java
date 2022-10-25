package core2.optional.job_test;

import java.util.Optional;

public class AgreementSetDto {
private final Optional<AgreementClass> agreementClass;

    public AgreementSetDto(Optional<AgreementClass> agreementClass) {
        this.agreementClass = agreementClass;
    }

    public Optional<AgreementClass> getAgreementClass() {
        return agreementClass;
    }
}

