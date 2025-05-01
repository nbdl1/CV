public enum JobDuties {
    FIRST_EMPLOYER(
            "- increasing level of profitability;\n" +
            "- managing partner relations;\n" +
            "- analyzing partner needs and aligning them with optimal hardware/software solutions (Cisco, Oracle, Eaton, etc.);\n" +
            "- collaborating with engineering teams to develop custom network, power, and server infrastructure designs;\n" +
            "- designing and proposing integrated enterprise network solutions;\n" +
            "- conducting business negotiations with constant and new clients;\n" +
            "- working out offers and contracts;\n" +
            "- control of level of indebtedness of a partners;\n" +
            "- supporting partners in tender processes, including documentation, compliance, and solution justification;\n" +
            "- market research."),
    SECOND_EMPLOYER(
            "- developing and customizing service-level agreements (SLAs) and support contracts tailored to customer business requirements; \n" +
            "- creating and maintaining technical and commercial service proposals, ensuring solution profitability;\n" +
            "- -overseeing service delivery operations, including resource planning, escalation management, and quality assurance;\n" +
            "- managing cross-functional service team (service coordinator and 4 field engineers) across Ukraine and Moldova;\n" +
            "- holding P&L responsibility for the regional service business; driving improvements in margin and service revenue;\n" +
            "- optimized internal service processes, implementing scalable procedures for ticketing, scheduling, and logistics;\n" +
            "- cooperation with other departments throughout EMEA region;\n" +
            "- conducting partner trainings to ensure high-quality service standards and partner awareness in APC service solutions;\n" +
            "- service problem solving;\n"
            ),
    THIRD_EMPLOYER(
            "-leading a regional B2B sales team, focused on strategic growth across channel partners;\n" +
            "- designing and implementing incentive and rebate programs to drive performance among resellers and e-commerce partners;\n" +
            "- overseeing the execution of sales plans, ensuring achievement of KPIs and revenue targets by individual contributors;\n" +
            "- building and maintaining strong relationships with key national e-tailers and IT distributors;\n" +
            "- providing quarterly performance reports and strategic plans to HQ, including market insights and forecast analysis;\n" +
            "- coordinating closely with product and marketing teams.");

    private final String jobDuties;

    JobDuties(String duties) {
        this.jobDuties = duties;
    }

    public String getJobDuties() {
        return this.jobDuties;
    }
}