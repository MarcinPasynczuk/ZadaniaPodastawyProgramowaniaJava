class Organization {
    public int id;
    public int employees;
    private int index;
    private String organizationId;
    private String name;
    private String website;
    private String country;
    private String description;
    private int founded;
    private String industry;
    private int numberOfEmployees;
    private String continent;

    public Organization(int index, String organizationId, String name, String website, String country, String description, int founded, String industry, int numberOfEmployees) {
        this.index = index;
        this.organizationId = organizationId;
        this.name = name;
        this.website = website;
        this.country = country;
        this.description = description;
        this.founded = founded;
        this.industry = industry;
        this.numberOfEmployees = numberOfEmployees;
        this.continent = null;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFounded() {
        return founded;
    }

        public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}