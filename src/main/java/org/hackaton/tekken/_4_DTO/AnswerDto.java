package org.hackaton.tekken._4_DTO;

/**
 * The {@link org.hackaton.tekken._1_persistence.model.Answer} data transfer object
 */


public class AnswerDto {


    private Integer id;


    private String validation;
    private String description;

    /**
     *
     * @return answer validation
     */

    public String getValidation() {
        return validation;
    }

    /**
     *
     * @param validation
     */

    public void setValidation(String validation) {
        this.validation = validation;
    }

    /**
     *
     * @return id the answer id
     */

    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id the answer id to set
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return description the answer description
     */

    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description the answer description to set
     */

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AnswerDto{" +
                "id=" + id +
                ", validation='" + validation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
