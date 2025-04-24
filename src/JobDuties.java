public enum JobDuties {
    FIRST_EMPLOYER("- increasing of profit level;\n" +
            "- partner network development;\n" +
            "- business planning;\n" +
            "- conducting business negotiations with constant and new clients;\n" +
            "- revealing of partner requirement and proposing mutually beneficial solution;\n" +
            "- working out offers;\n" +
            "- working out contracts;\n" +
            "- control of indebtedness of a partners;\n" +
            "- partner support in tenders;\n" +
            "- market research;\n" +
            "- development and improvement of ERP-systems;\n" +
            "- training of staff of sales department."),
    SECOND_EMPLOYER("- developing new opportunities for service sales; \n" +
            "- working out service contracts according to customer's needs; \n" +
            "- working out technical and commercial service quotation;\n" +
            "- developing service offer & service pricing;\n" +
            "- service order management; \n" +
            "- follow up with the invoice payment; \n" +
            "- managing a service department;\n" +
            "- profit & loss responsibility of service department; \n" +
            "- improving of existing service processes and developing new; \n" +
            "- service problem solving; \n" +
            "- cooperation with other departments throughout EMEA region; \n" +
            "- performing trainings for APC partners and customers; \n" +
            "- adjustment of logistic flows."),
    THIRD_EMPLOYER("- managing a channel team;\n" +
            "- developing incentive/rebate sales programs for channel dealers/etailers;\n" +
            "- leading a regional B2B sales team, focused on strategic growth across channel partners;\n" +
            "- close cooperation with biggest etailers;\n" +
            "- quarterly reporting to HQ.");

    private final String jobDuties;

    JobDuties(String duties) {
        this.jobDuties = duties;
    }

    public String getJobDuties() {
        return this.jobDuties;
    }

}
