package org.hackaton.tekken._4_DTO;

/**
 * The {@link org.hackaton.tekken._1_persistence.model.Answer} data transfer object
 */


public class AnswerDto {


    private Integer id;

    private boolean isRight;

    private String description;

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
     * @return the state of answer, if is right or not
     */

    public boolean isRight() {
        return isRight;
    }

    /**
     *
     * @param right the state to set
     */

    public void setRight(boolean right) {
        isRight = right;
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
                ", isRight=" + isRight +
                ", description='" + description + '\'' +
                '}';
    }
}
