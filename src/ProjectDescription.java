public enum ProjectDescription {
    CURTAIN_APP_PROJECT("App has a CRM, SKU creator and Calculator ,PDF Offer creator and other functions."),
    AM_I_BULGARIAN("This application allows you to easily and quickly check the status of your case\n" +
            "with the Directorate of Bulgarian Citizenship (Дирекция Българско гражданство)\n" +
            "without using a browser and entering your case number and code\n" +
            "each time you want to check status.\n" +
            "App acts on your behalf and gets case status from official web-site - https://publicbg.mjs.bg/BgInfo/");

    String projectDescription;

    ProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    public String getProjectDescription() {
        return projectDescription;
    }
}
