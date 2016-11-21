/*
package mypackage.Optionals;

public class ApplicationProcess {

    final Applicant applicant;

    ApplicationProcess(Applicant applicant){
        if(applicant == null || applicant.getApplicant() == null || applicant.getApplicant().getName() == null ||
                (applicant.getPartner().isPresent() && applicant.getPartner().get().getName() == null)) {
            throw new NullPointerException();
        }
        this.applicant = applicant;
    }

    boolean isGoodApplicant() {
        Person person = this.applicant.getApplicant();

        // Remove comments for part 2

        if(this.applicant.getPartner().isPresent()) {
            Person partner = this.applicant.getPartner().get();
            return person.getName() != null
                    && partner.getName() != null
                    && person.getAge() != 0
                    && partner.getAge() != 0;
        } else {
            return person.getName() != null
                    && person.getAge() != 0
                    && (person.getPets().isPresent()
                    && person.getPets().get() > 10)
                    && (person.getChildren().orElse(0) < 16)
                    && (person.getWork().isPresent()
                    && person.getWork().get());
        }

    }

}
*/
