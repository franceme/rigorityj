package frontEnd.MessagingSystem.routing.structure.Default;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * HeuristicsType
 * <p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "NumberOfOrthogonal",
        "NumberOfConstantsToCheck",
        "NumberOfSlices",
        "NumberOfHeuristics",
        "AverageSlice",
        "DepthCount"
})
public class Heuristics implements Serializable {

    /**
     * (Required)
     */
    @JsonProperty("NumberOfOrthogonal")
    private int numberOfOrthogonal;
    /**
     * (Required)
     */
    @JsonProperty("NumberOfConstantsToCheck")
    private int numberOfConstantsToCheck;
    /**
     * (Required)
     */
    @JsonProperty("NumberOfSlices")
    private int numberOfSlices;
    /**
     * (Required)
     */
    @JsonProperty("NumberOfHeuristics")
    private int numberOfHeuristics;
    /**
     * (Required)
     */
    @JsonProperty("AverageSlice")
    private double averageSlice;
    /**
     * DepthCount
     * <p>
     * <p>
     * (Required)
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("DepthCount")
    private List<String> depthCount = new ArrayList<String>();
    private final static long serialVersionUID = -1017071453464845745L;

    /**
     * No args constructor for use in serialization
     */
    public Heuristics() {
    }

    /**
     * @param averageSlice
     * @param numberOfHeuristics
     * @param numberOfOrthogonal
     * @param numberOfSlices
     * @param depthCount
     * @param numberOfConstantsToCheck
     */
    public Heuristics(int numberOfOrthogonal, int numberOfConstantsToCheck, int numberOfSlices, int numberOfHeuristics, double averageSlice, List<String> depthCount) {
        super();
        this.numberOfOrthogonal = numberOfOrthogonal;
        this.numberOfConstantsToCheck = numberOfConstantsToCheck;
        this.numberOfSlices = numberOfSlices;
        this.numberOfHeuristics = numberOfHeuristics;
        this.averageSlice = averageSlice;
        this.depthCount = depthCount;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfOrthogonal")
    public int getNumberOfOrthogonal() {
        return numberOfOrthogonal;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfOrthogonal")
    public void setNumberOfOrthogonal(int numberOfOrthogonal) {
        this.numberOfOrthogonal = numberOfOrthogonal;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfConstantsToCheck")
    public int getNumberOfConstantsToCheck() {
        return numberOfConstantsToCheck;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfConstantsToCheck")
    public void setNumberOfConstantsToCheck(int numberOfConstantsToCheck) {
        this.numberOfConstantsToCheck = numberOfConstantsToCheck;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfSlices")
    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfSlices")
    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfHeuristics")
    public int getNumberOfHeuristics() {
        return numberOfHeuristics;
    }

    /**
     * (Required)
     */
    @JsonProperty("NumberOfHeuristics")
    public void setNumberOfHeuristics(int numberOfHeuristics) {
        this.numberOfHeuristics = numberOfHeuristics;
    }

    /**
     * (Required)
     */
    @JsonProperty("AverageSlice")
    public double getAverageSlice() {
        return averageSlice;
    }

    /**
     * (Required)
     */
    @JsonProperty("AverageSlice")
    public void setAverageSlice(double averageSlice) {
        this.averageSlice = averageSlice;
    }

    /**
     * DepthCount
     * <p>
     * <p>
     * (Required)
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("DepthCount")
    public List<String> getDepthCount() {
        return depthCount;
    }

    /**
     * DepthCount
     * <p>
     * <p>
     * (Required)
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("DepthCount")
    public void setDepthCount(List<String> depthCount) {
        this.depthCount = depthCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numberOfOrthogonal", numberOfOrthogonal).append("numberOfConstantsToCheck", numberOfConstantsToCheck).append("numberOfSlices", numberOfSlices).append("numberOfHeuristics", numberOfHeuristics).append("averageSlice", averageSlice).append("depthCount", depthCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(averageSlice).append(numberOfHeuristics).append(numberOfOrthogonal).append(numberOfSlices).append(depthCount).append(numberOfConstantsToCheck).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Heuristics) == false) {
            return false;
        }
        Heuristics rhs = ((Heuristics) other);
        return new EqualsBuilder().append(averageSlice, rhs.averageSlice).append(numberOfHeuristics, rhs.numberOfHeuristics).append(numberOfOrthogonal, rhs.numberOfOrthogonal).append(numberOfSlices, rhs.numberOfSlices).append(depthCount, rhs.depthCount).append(numberOfConstantsToCheck, rhs.numberOfConstantsToCheck).isEquals();
    }

}
